package toolsForWriting;

import notebook.SingletonNotebook;

public class FeltPen implements WritingTool {

    @Override
    public void write(String text, SingletonNotebook notebook) {
        byte[] bytes = ('{' + text + '}' + "(pay special attention)\n").getBytes();
        notebook.print(bytes);
    }

}
