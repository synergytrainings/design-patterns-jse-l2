package office.WritingToolOwners;

import office.WritingToolType;
import office.SingletonNotebook;

public interface WritingToolOwner {

    void write(String text, SingletonNotebook notebook);

    WritingToolType getToolType();
}
