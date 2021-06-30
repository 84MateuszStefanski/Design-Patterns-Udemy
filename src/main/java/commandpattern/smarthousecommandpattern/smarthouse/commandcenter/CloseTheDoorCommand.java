package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;

public class CloseTheDoorCommand implements SmartHouseCommandCenter {

    private SmartHouse smartHouse;

    public CloseTheDoorCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.closeTheDoor();
    }
}
