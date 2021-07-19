package commandpattern.smarthousecommandpattern;

import commandpattern.smarthousecommandpattern.smarthouse.InvokerSmartHouse;
import commandpattern.smarthousecommandpattern.smarthouse.SmartHouse;
import commandpattern.smarthousecommandpattern.smarthouse.commandcenter.*;

public class Main {

    public static void main(String[] args) {

        final SmartHouse smartHouse = new SmartHouse();


        InvokerSmartHouse invokerSmartHouse = new InvokerSmartHouse();


        invokerSmartHouse.executeCommand(new OpenTheGateCommand(smartHouse));
        invokerSmartHouse.executeCommand(new OpenTheDoorCommand(smartHouse));
        invokerSmartHouse.executeCommand(new TurnOnTheLightsCommand(smartHouse));
        invokerSmartHouse.executeCommand(new RaiseTheBlindsCommand(smartHouse));
        invokerSmartHouse.executeCommand(new TurnOnTheLightsCommand(smartHouse));
        invokerSmartHouse.executeCommand(new TurnOnTheHeatingCommand(smartHouse));

        invokerSmartHouse.executeCommand(new CloseTheGateCommand(smartHouse));
        invokerSmartHouse.executeCommand(new CloseTheDoorCommand(smartHouse));
        invokerSmartHouse.executeCommand(new TurnOffTheLightsCommand(smartHouse));
        invokerSmartHouse.executeCommand(new LowerTheBlindsCommand(smartHouse));
        invokerSmartHouse.executeCommand(new TurnOffTheHeatingCommand(smartHouse));









    }
}
