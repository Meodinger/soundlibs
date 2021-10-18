/**
 * Author: Meodinger
 * Date: 2021/10/18
 * Location: 
 */

module soundlibs.basicplayer {
    requires java.desktop;
    requires org.slf4j;

    requires soundlibs.mp3spi;
    requires soundlibs.tritonus.share;

    exports javazoom.jlgui.basicplayer;
}