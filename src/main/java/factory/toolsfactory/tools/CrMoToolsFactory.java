package factory.toolsfactory.tools;

import factory.toolsfactory.ToolsFactory;

public class CrMoToolsFactory implements ToolsFactory {

    final METAL_ALLOY metalAlloy = METAL_ALLOY.CRMO;

    @Override
    public Tool produceSocketWrench(TAKE_SQUARE takeSquare, KEY_SIZE size) {
        switch (takeSquare){
            case SMALL:
                return new SockedWrench(metalAlloy, takeSquare, size);
            case MEDIUM:
                return new SockedWrench(metalAlloy, takeSquare, size);
            case BIG:
                return new SockedWrench(metalAlloy, takeSquare, size);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    @Override
    public Tool produceCombinationWrench(KEY_SIZE size) {

        return new CombinationWrench(metalAlloy, size);
    }
}
