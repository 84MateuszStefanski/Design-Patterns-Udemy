package factory.toolsfactory;

import factory.toolsfactory.tools.KEY_SIZE;
import factory.toolsfactory.tools.TAKE_SQUARE;

public class Main {
    public static void main(String[] args) {

        CrVToolsFactory crVToolsFactory = new CrVToolsFactory();

        System.out.println(crVToolsFactory.produceSocketWrench(TAKE_SQUARE.SMALL, KEY_SIZE.KEY_SIZE4));

        System.out.println(crVToolsFactory.produceCombinationWrench(KEY_SIZE.KEY_SIZE32));


    }
}
