/**
 * Author: Meodinger
 * Date: 2021/10/18
 * Location: 
 */

module soundlibs.tritonus.share {
    requires java.desktop;

    exports org.tritonus.share;
    exports org.tritonus.share.midi;
    exports org.tritonus.share.sampled;
    exports org.tritonus.share.sampled.convert;
    exports org.tritonus.share.sampled.file;
    exports org.tritonus.share.sampled.mixer;
}