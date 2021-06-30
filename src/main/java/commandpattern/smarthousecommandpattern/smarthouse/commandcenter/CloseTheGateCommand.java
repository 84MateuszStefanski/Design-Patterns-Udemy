package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;

public class CloseTheGateCommand implements SmartHouseCommandCenter {

    private SmartHouse smartHouse;

    public CloseTheGateCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.closeTheGate();
    }
}
