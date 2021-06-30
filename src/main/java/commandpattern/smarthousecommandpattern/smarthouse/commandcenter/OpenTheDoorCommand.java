package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;

public class OpenTheDoorCommand implements SmartHouseCommandCenter {

    private SmartHouse smartHouse;

    public OpenTheDoorCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.openTheDoor();
    }
}
