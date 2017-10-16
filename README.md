# Bitbake simplest example

    git clone git://git.yoctoproject.org/poky
    PATH=$PWD/poky/bitbake/bin:$PATH
    BBPATH=$PWD/myproject bitbake -f printhello

"DEPENDS" test:

    rm -r myproject/tmp/ 
    BBPATH=$PWD/myproject bitbake -f arecipe

* This is based on http://www.yoctoproject.org/docs/2.3/bitbake-user-manual/bitbake-user-manual.html#hello-world-example
* Japanese article: https://qiita.com/propella/items/070c7a29be1158d605d2
