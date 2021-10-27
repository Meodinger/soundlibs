/**
 * Author: Meodinger
 * Date: 2021/10/18
 * Location: 
 */

module soundlibs.mp3spi {
    requires java.desktop;

    requires soundlibs.jlayer;
    requires soundlibs.tritonus.share;

    provides javax.sound.sampled.spi.AudioFileReader with javazoom.spi.mpeg.sampled.file.MpegAudioFileReader;
    provides javax.sound.sampled.spi.FormatConversionProvider with javazoom.spi.mpeg.sampled.convert.MpegFormatConversionProvider;

    exports javazoom.spi;
    exports javazoom.spi.mpeg.sampled.convert;
    exports javazoom.spi.mpeg.sampled.file;
    exports javazoom.spi.mpeg.sampled.file.tag;
}