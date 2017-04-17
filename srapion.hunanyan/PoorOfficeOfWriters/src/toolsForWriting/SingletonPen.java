package toolsForWriting;

import notebook.SingletonNotebook;

public class SingletonPen implements ToolForWriting{

    private static final SingletonPen pen = new SingletonPen();

    private SingletonPen(){
        if (pen != null){
            throw new RuntimeException("we have only one pen, but you may get pencil...");
        }
    }

    public static SingletonPen getInstance(){
        return pen;
    }

    @Override
    public void write(String text, SingletonNotebook paper){
        byte[] bytes = ('[' + text + ']' + "(certified)\n").getBytes();
        paper.print(bytes);
    }
}
