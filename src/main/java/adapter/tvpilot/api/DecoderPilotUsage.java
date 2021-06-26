package adapter.tvpilot.api;

public class DecoderPilotUsage implements DecoderPilot {

    @Override
    public void powerOnDecoder() {
        System.out.println("Decoder is on ");
    }

    @Override
    public void changeChanelDecoder() {
        System.out.println("Chanel changed by decoder ");
    }

    @Override
    public void changeVolumeDecoder() {
        System.out.println("Decoder volume changed ");
    }
}
