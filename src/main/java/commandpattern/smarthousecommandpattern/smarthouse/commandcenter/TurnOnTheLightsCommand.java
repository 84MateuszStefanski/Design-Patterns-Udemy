package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;

public class TurnOnTheLightsCommand implements SmartHouseCommandCenter {

    private SmartHouse smartHouse;

    public TurnOnTheLightsCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.turnOnTheLights();
    }
}
