package commandpattern.smarthousecommandpattern.smarthouse;

import commandpattern.smarthousecommandpattern.smarthouse.commandcenter.SmartHouseCommandCenter;

public class InvokerSmartHouse {

    public void executeCommand(SmartHouseCommandCenter smartHouseCommandCenter) {
        smartHouseCommandCenter.giveTheCommand();
    }
}
