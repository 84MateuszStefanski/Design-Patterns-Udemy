package commandpattern.smarthousecommandpattern.smarthouse.commandcenter;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;

public class TurnOffTheLightsCommand implements SmartHouseCommandCenter {

    private SmartHouse smartHouse;

    public TurnOffTheLightsCommand(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
    }

    @Override
    public void giveTheCommand() {
        smartHouse.turnOffTheLights();
    }
}
