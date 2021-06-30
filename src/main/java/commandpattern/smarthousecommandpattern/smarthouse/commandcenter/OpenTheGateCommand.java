package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;


public class OpenTheGateCommand implements SmartHouseCommandCenter {

    private  SmartHouse smartHouse;

    public OpenTheGateCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.openTheGate();
    }
}
