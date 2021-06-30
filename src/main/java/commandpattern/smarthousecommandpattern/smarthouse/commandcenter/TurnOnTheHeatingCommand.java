package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;

public class TurnOnTheHeatingCommand implements SmartHouseCommandCenter{

    private SmartHouse smartHouse;

    public TurnOnTheHeatingCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.turnOnTheHeating();
    }
}
