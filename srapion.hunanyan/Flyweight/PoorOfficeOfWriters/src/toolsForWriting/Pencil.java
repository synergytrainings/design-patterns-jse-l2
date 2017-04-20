package toolsForWriting;

import notebook.SingletonNotebook;

public class Pencil implements WritingTool {

    @Override
    public void write(String text, SingletonNotebook notebook) {
        byte[] bytes = ('{' + text + '}' + "(not certified)\n").getBytes();
        notebook.print(bytes);
    }

}
