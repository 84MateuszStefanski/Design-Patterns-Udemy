package adapter.tvpilot.api;

public class TvPilotUsage implements TvPilot {

    @Override
    public void powerOnTv() {
        System.out.println("The TV is on ");
    }

    @Override
    public void changeChanelTv() {
        System.out.println("Chanel changing ");
    }

    @Override
    public void changeVolumeTv() {
        System.out.println("Volume changed ");
    }
}
