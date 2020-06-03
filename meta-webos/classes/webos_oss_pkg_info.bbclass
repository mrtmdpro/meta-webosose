# Copyright (c) 2020 LG Electronics, Inc.
#
# webos_oss_pkg_info
#
# This class adds write_oss_pkg_info task.
# write_oss_pkg_info can be run by bitbake -c write_oss_pkg_info <image>
# collected oss-pkg-info.yaml files of image

OSS_DEPLOY_DIR ?= "${DEPLOY_DIR}/licenses"
OSS_FILENAME   ?= "oss-pkg-info.yaml"

# We need license.manifest of image
addtask write_oss_pkg_info after do_rootfs before do_build
do_write_oss_pkg_info[doc] = "Collects oss package information of the image"
do_write_oss_pkg_info[nostamp] = "1"

python do_write_oss_pkg_info() {
    imagename    = d.getVar("IMAGE_BASENAME")
    machine      = d.getVar("MACHINE")
    oss_filename = d.getVar("OSS_FILENAME")
    manifest     = os.path.join(os.path.join(d.getVar("OSS_DEPLOY_DIR"), "%s-%s" % (imagename, machine)), "license.manifest")

    if os.path.isfile(manifest):
        with open(os.path.join(d.getVar("DEPLOY_DIR_IMAGE"), imagename+'-'+oss_filename), "w") as output:
            """ Extract recipe names from license manifest """
            tmp = []
            with open(manifest) as input:
                for line in input:
                    line = line.rstrip()
                    if line.startswith("RECIPE NAME: "):
                        tmp.append(line.split(":")[1].strip())

            """ Remove duplicates """
            pkgs = list(dict.fromkeys(tmp))

            for pkg in pkgs:
                oss = os.path.join(os.path.join(d.getVar("OSS_DEPLOY_DIR"), pkg), oss_filename)
                if os.path.isfile(oss):
                    with open(oss) as input:
                        output.write('%s:\n' % pkg)
                        oss_string = input.read()
                        if oss_string.startswith("Open Source Software Package:"):
                            output.write("\n".join(oss_string.split("\n")[1:]))
                        else:
                            bb.warn("There is no OSS item in the yaml file. :%s" % pkg)
                            output.write(oss_string)
    else:
        bb.fatal("There is no %s" % manifest)
}
