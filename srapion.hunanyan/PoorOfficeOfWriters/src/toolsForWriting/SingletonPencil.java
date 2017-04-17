package toolsForWriting;

import notebook.SingletonNotebook;

public class SingletonPencil implements ToolForWriting {

    private static final SingletonPencil pencil = new SingletonPencil();

    private SingletonPencil() {
        if (pencil != null) {
            throw new RuntimeException("we have only one pencil, but you may get pen...");
        }
    }

    public static SingletonPencil getInstance() {
        return pencil;
    }

    @Override
    public void write(String text, SingletonNotebook paper) {
        byte[] bytes = ('{' + text + '}' + "(not certified)\n").getBytes();
        paper.print(bytes);
    }
}
