package workers;

import notebook.SingletonNotebook;
import toolsForWriting.FeltPen;
import toolsForWriting.Pen;
import toolsForWriting.Pencil;
import toolsForWriting.WritingTool;
import java.util.HashMap;
import java.util.Map;

public class WritingToolsManager {

    private static final SingletonNotebook notebook = SingletonNotebook.getInstance();
    private static final Map<WritingToolType, WritingTool> toolsForWriting = new HashMap<>();

    public static SingletonNotebook getNotebook() {
        return notebook;
    }

    public static WritingTool getToolForWriting(WritingToolType toolType){
        WritingTool writingTool = toolsForWriting.get(toolType);
        if(writingTool == null) {
            switch (toolType) {
                case PEN:
                    writingTool =  new Pen();
                    toolsForWriting.put(WritingToolType.PEN, writingTool);
                    break;
                case PENCIL:
                    writingTool = new Pencil();
                    toolsForWriting.put(WritingToolType.PENCIL, writingTool);
                    break;
                case FELT_PEN:
                    writingTool = new FeltPen();
                    toolsForWriting.put(WritingToolType.FELT_PEN, writingTool);
                    break;
            }
        }
        return writingTool;
    }

    public static void main(String[] args) {

        WritingTool tool1 = WritingToolsManager.getToolForWriting(WritingToolType.PEN);
        WritingTool tool2 = WritingToolsManager.getToolForWriting(WritingToolType.PEN);

        System.out.println(tool1 == tool2);

        Employee employee1 = new Employee(WritingToolType.PENCIL);
        Employee employee2 = new Employee(WritingToolType.PENCIL);
        Employee employee3 = new Employee(WritingToolType.PENCIL);

        employee1.write("this is note of first employee");
        employee2.write("this is note of second employee");
        employee3.write("this is note of third employee");

        employee1.requestForWritingTool(WritingToolType.PEN);

        employee1.write("this is note of first employee");

        employee2.requestForWritingTool(WritingToolType.FELT_PEN);

        employee2.write("this is note of second employee");



        notebook.close();
    }

    public enum WritingToolType{
        PEN, PENCIL, FELT_PEN
    }

}
