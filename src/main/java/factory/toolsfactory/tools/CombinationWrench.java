package factory.toolsfactory.tools;

public class CombinationWrench extends Tool{

    private KEY_SIZE size;

    public CombinationWrench(METAL_ALLOY metalAlloy, KEY_SIZE size) {
        super(metalAlloy);
        this.size = size;
    }

    @Override
    public String toString() {
        return "CombinationWrench{" +
                "size=" + size +
                '}';
    }
}
