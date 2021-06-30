package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;


public class RaiseTheBlindsCommand implements SmartHouseCommandCenter {

    private SmartHouse smartHouse;

    public RaiseTheBlindsCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.raiseTheBlinds();
    }
}
