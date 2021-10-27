/**
 * Author: Meodinger
 * Date: 2021/10/18
 * Location: 
 */

module soundlibs.vorbisspi {
    requires java.desktop;

    requires soundlibs.jorbis;
    requires soundlibs.tritonus.share;

    provides javax.sound.sampled.spi.AudioFileReader with javazoom.spi.vorbis.sampled.file.VorbisAudioFileReader;
    provides javax.sound.sampled.spi.FormatConversionProvider with javazoom.spi.vorbis.sampled.convert.VorbisFormatConversionProvider;

    exports javazoom.spi;
    exports javazoom.spi.vorbis.sampled.convert;
    exports javazoom.spi.vorbis.sampled.file;
}