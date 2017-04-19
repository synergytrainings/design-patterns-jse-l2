package workers;

import notebook.SingletonNotebook;
import toolsForWriting.WritingTool;

public class Employee {

    private WritingTool writingTool;
    private SingletonNotebook notebook;

    public Employee(WritingToolsManager.WritingToolType toolType){
        this.notebook = WritingToolsManager.getNotebook();
        writingTool = WritingToolsManager.getToolForWriting(toolType);
    }

    public void requestForWritingTool(WritingToolsManager.WritingToolType toolType){
        writingTool = WritingToolsManager.getToolForWriting(toolType);
    }

    public void write(String text){
        notebook = WritingToolsManager.getNotebook();
        writingTool.write(text, notebook);
    }
}
