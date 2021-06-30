package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;

public class LowerTheBlindsCommand implements SmartHouseCommandCenter {

    private SmartHouse smartHouse;

    public LowerTheBlindsCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.lowerTheBlinds();
    }
}
