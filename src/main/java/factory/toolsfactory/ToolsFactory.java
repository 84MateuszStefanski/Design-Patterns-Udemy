package factory.toolsfactory;

import factory.toolsfactory.tools.KEY_SIZE;
import factory.toolsfactory.tools.TAKE_SQUARE;
import factory.toolsfactory.tools.Tool;

public interface ToolsFactory {

     Tool produceSocketWrench(TAKE_SQUARE takeSquare, KEY_SIZE size);
     Tool produceCombinationWrench(KEY_SIZE size);
}
