package factory.toolsfactory.tools;

public abstract class Tool {

    private METAL_ALLOY metalAlloy;

    public Tool(METAL_ALLOY metalAlloy) {
        this.metalAlloy = metalAlloy;

    }

    @Override
    public String toString() {
        return "Tool{" +
                "metalAlloy=" + metalAlloy +
                '}';
    }
}
