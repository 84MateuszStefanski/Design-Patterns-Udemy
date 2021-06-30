package commandpattern.smarthousecommandpattern;

import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;
import commandpattern.smarthousecommandpattern.smarthouse.commandcenter.OpenTheDoorCommand;
import commandpattern.smarthousecommandpattern.smarthouse.commandcenter.OpenTheGateCommand;


public class Main {
    public static void main(String[] args) {

        SmartHouse smartHouse = new SmartHouse();
        OpenTheGateCommand openTheGateCommand = new OpenTheGateCommand(smartHouse);
        OpenTheDoorCommand openTheDoorCommand = new OpenTheDoorCommand(smartHouse);
        openTheGateCommand.giveTheCommand();
        openTheDoorCommand.giveTheCommand();






    }
}
