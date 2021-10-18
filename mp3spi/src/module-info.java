/**
 * Author: Meodinger
 * Date: 2021/10/18
 * Location: 
 */

module soundlibs.mp3spi {
    requires java.desktop;

    requires soundlibs.jlayer;
    requires soundlibs.tritonus.share;

    exports javazoom.spi;
}