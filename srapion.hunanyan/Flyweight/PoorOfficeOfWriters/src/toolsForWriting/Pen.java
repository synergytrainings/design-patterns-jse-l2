package toolsForWriting;

import notebook.SingletonNotebook;

public class Pen implements WritingTool {

    @Override
    public void write(String text, SingletonNotebook notebook){
        byte[] bytes = ('[' + text + ']' + "(certified)\n").getBytes();
        notebook.print(bytes);
    }

}
