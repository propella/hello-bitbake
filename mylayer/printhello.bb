DESCRIPTION = "Prints Hello World"
PN = 'printhello'
PV = '1'

VAR_DEFINED_IN_HELLO = "Defined!"
VAR_DEFINED_IN_GLOBAL = "Defined in printhello!"

addtask do_populate_sysroot after do_build

python do_build() {
    bb.plain("=====  Hello, World:do_build   =====");
    bb.plain("TOPDIR: " + d.getVar("TOPDIR", False));
    bb.plain("BBPATH: " + d.getVar("BBPATH", False));
    bb.plain("VAR_DEFINED_IN_HELLO: " + (d.getVar("VAR_DEFINED_IN_HELLO", False) or "Undefined"));
    bb.plain("VAR_DEFINED_IN_GLOBAL: " + (d.getVar("VAR_DEFINED_IN_GLOBAL", False) or "Undefined"));
}

python do_populate_sysroot() {
    bb.plain("===== Hello, World:do_populate_sysroot =====");
}
