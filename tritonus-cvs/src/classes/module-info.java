/**
 * Author: Meodinger
 * Date: 2021/10/18
 * Location: 
 */

module soundlibs.tritonus.all {
    requires java.desktop;

    requires soundlibs.jorbis;

    exports org.tritonus.core;
    exports org.tritonus.dsp.ais;
    exports org.tritonus.dsp.interfaces;
    exports org.tritonus.dsp.processor;
    exports org.tritonus.lowlevel.alsa;
    exports org.tritonus.lowlevel.cdda;
    exports org.tritonus.lowlevel.cdda.cdparanoia;
    exports org.tritonus.lowlevel.cdda.cooked_ioctl;
    exports org.tritonus.lowlevel.dsp;
    exports org.tritonus.lowlevel.esd;
    exports org.tritonus.lowlevel.gsm;
    exports org.tritonus.lowlevel.lame;
    exports org.tritonus.lowlevel.ogg;
    exports org.tritonus.lowlevel.pogg;
    exports org.tritonus.lowlevel.pvorbis;
    exports org.tritonus.lowlevel.vorbis;
    exports org.tritonus.midi.device.alsa;
    exports org.tritonus.midi.device.fluidsynth;
    exports org.tritonus.midi.device.java;
    exports org.tritonus.midi.file;
    exports org.tritonus.midi.sb.fluidsynth;
    exports org.tritonus.sampled.convert;
    exports org.tritonus.sampled.convert.gsm;
    exports org.tritonus.sampled.convert.jorbis;
    exports org.tritonus.sampled.convert.lame;
    exports org.tritonus.sampled.convert.pvorbis;
    exports org.tritonus.sampled.convert.vorbis;
    exports org.tritonus.sampled.file;
    exports org.tritonus.sampled.file.gsm;
    exports org.tritonus.sampled.file.jorbis;
    exports org.tritonus.sampled.file.mpeg;
    exports org.tritonus.sampled.file.pvorbis;
    exports org.tritonus.sampled.file.vorbis;
    exports org.tritonus.sampled.mixer.alsa;
    exports org.tritonus.sampled.mixer.esd;
    exports org.tritonus.share;
    exports org.tritonus.share.midi;
    exports org.tritonus.share.sampled;
    exports org.tritonus.share.sampled.convert;
    exports org.tritonus.share.sampled.file;
    exports org.tritonus.share.sampled.mixer;
}