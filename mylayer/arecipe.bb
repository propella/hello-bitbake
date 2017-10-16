DESCRIPTION = "A recipe"
PN = "arecipe"
PV = "1"

VAR_DEFINED_IN_ARECIPE = "Defined!"

# printhello:do_populate_sysroot needs to be run before do_build
DEPENDS = "printhello"
do_build[deptask] = "do_populate_sysroot"

# For some reason, do_build is not actually executed(???). So add the task.
addtask do_task before do_build

python do_task() {
    bb.plain("===== areipe:do_task =====");
    bb.plain("VAR_DEFINED_IN_ARECIPE:" + (d.getVar("VAR_DEFINED_IN_ARECIPE", False) or "Undefined"));

    # Test if a variable defined in another recipe is visible.
    bb.plain("VAR_DEFINED_IN_HELLO:" + (d.getVar("VAR_DEFINED_IN_HELLO", False) or "Undefined"));
}

python do_build() {
    bb.plain("===== arecipe:do_build =====");
}
