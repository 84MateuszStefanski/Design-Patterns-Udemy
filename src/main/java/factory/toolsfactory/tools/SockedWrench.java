package factory.toolsfactory.tools;

public class SockedWrench extends Tool{

    private KEY_SIZE size;
    private TAKE_SQUARE takeSquare;

    public SockedWrench(METAL_ALLOY metalAlloy, TAKE_SQUARE takeSquare, KEY_SIZE size) {
        super(metalAlloy);
        this.takeSquare = takeSquare;
        this.size = size;
    }

    @Override
    public String toString() {
        return "SockedWrench{" +
                "size=" + size +
                ", takeSquare=" + takeSquare +
                '}';
    }
}
