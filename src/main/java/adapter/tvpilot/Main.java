package adapter.tvpilot;

import adapter.tvpilot.api.DecoderPilotUsage;
import adapter.tvpilot.api.TvPilotUsage;
import adapter.tvpilot.api.UniversalPilot;

public class Main {

    public static void main(String[] args) {
        TvPilotUsage pilotUsage = new TvPilotUsage();
        DecoderPilotUsage decoderPilotUsage = new DecoderPilotUsage();
        UniversalPilot universalPilot = new UniversalPilot(pilotUsage,decoderPilotUsage);

        pilotUsage.powerOnTv();
        pilotUsage.changeChanelTv();
        pilotUsage.changeVolumeTv();

        decoderPilotUsage.powerOnDecoder();
        decoderPilotUsage.changeChanelDecoder();
        decoderPilotUsage.changeVolumeDecoder();

        universalPilot.powerOnTv();
        universalPilot.powerOnDecoder();
        universalPilot.changeChanelDecoder();
        universalPilot.changeChanelTv();
    }


}
