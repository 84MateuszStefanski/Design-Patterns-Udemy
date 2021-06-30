package commandpattern.smarthousecommandpattern;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;
import commandpattern.smarthousecommandpattern.smarthouse.commandcenter.OpenTheDoorCommand;
import commandpattern.smarthousecommandpattern.smarthouse.commandcenter.OpenTheGateCommand;
import commandpattern.smarthousecommandpattern.smarthouse.commandcenter.SmartHouseCommandCenter;


public class Main {

    public static void main(String[] args) {

        SmartHouse smartHouse = new SmartHouse();

        SmartHouseCommandCenter openTheDoor = new OpenTheDoorCommand(smartHouse);
        openTheDoor.giveTheCommand();

        SmartHouseCommandCenter openTheGate = new OpenTheGateCommand(smartHouse);
        openTheGate.giveTheCommand();

        SmartHouseCommandCenter raiseTheBlinds = new RaiseTheBlinds(smartHouse);









    }
}
