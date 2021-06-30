package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;


public class TurnOffTheHeatingCommand implements SmartHouseCommandCenter {

    private SmartHouse smartHouse;

    public TurnOffTheHeatingCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.turnOffTheHeating();
    }
}
