package office.WritingToolOwners;

import office.WritingToolType;
import office.SingletonNotebook;

public class FeltPenOwner implements WritingToolOwner {

    @Override
    public void write(String text, SingletonNotebook notebook) {
        byte[] bytes = ('{' + text + '}' + "(pay special attention)\n").getBytes();
        notebook.print(bytes);
    }

    @Override
    public WritingToolType getToolType() {
        return WritingToolType.FELT_PEN;
    }

}
