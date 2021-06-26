package adapter.tvpilot.api;

public class UniversalPilot implements TvPilot, DecoderPilot {

    TvPilotUsage pilotUsage;
    DecoderPilotUsage decoderPilotUsage;

    public UniversalPilot(TvPilotUsage pilotUsage, DecoderPilotUsage decoderPilotUsage) {
        this.pilotUsage = pilotUsage;
        this.decoderPilotUsage = decoderPilotUsage;
    }

    @Override
    public void powerOnTv() {
        System.out.println("The TV is on by universal pilot");

    }

    @Override
    public void changeChanelTv() {
        System.out.println("Chanel changing by universal pilot");
    }

    @Override
    public void changeVolumeTv() {
        System.out.println("Volume changed by universal pilot");
    }

    @Override
    public void powerOnDecoder() {
        System.out.println("Decoder is on by universal pilot ");
    }

    @Override
    public void changeChanelDecoder() {
        System.out.println("Chanel changed by decoder by universal pilot");
    }

    @Override
    public void changeVolumeDecoder() {
        System.out.println("Decoder volume changed by universal pilot");
    }
}
