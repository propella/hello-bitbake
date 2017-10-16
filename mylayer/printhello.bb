DESCRIPTION = "Prints Hello World"
PN = 'printhello'
PV = '1'

python do_build() {
   bb.plain("=====  Hello, World!   =====");
   bb.plain("TOPDIR:" + d.getVar("TOPDIR", False));
   bb.plain("BBPATH:" + d.getVar("BBPATH", False));
}
