/**
 * Author: Meodinger
 * Date: 2021/10/18
 * Location: 
 */

module soundlibs.vorbisspi {
    requires java.desktop;

    requires soundlibs.jorbis;
    requires soundlibs.tritonus.share;

    exports javazoom.spi;
    exports javazoom.spi.vorbis.sampled.convert;
    exports javazoom.spi.vorbis.sampled.file;
}