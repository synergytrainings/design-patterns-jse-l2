package office.WritingToolOwners;

import office.WritingToolType;
import office.SingletonNotebook;

public class PenOwner implements WritingToolOwner{

    @Override
    public void write(String text, SingletonNotebook notebook){
        byte[] bytes = ('[' + text + ']' + "(certified)\n").getBytes();
        notebook.print(bytes);
    }

    @Override
    public WritingToolType getToolType() {
        return WritingToolType.PEN;
    }

}
