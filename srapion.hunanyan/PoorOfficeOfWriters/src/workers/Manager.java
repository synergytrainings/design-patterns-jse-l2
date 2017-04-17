package workers;

import notebook.SingletonNotebook;
import toolsForWriting.SingletonPen;
import toolsForWriting.SingletonPencil;
import toolsForWriting.ToolForWriting;

public class Manager {

    private static final SingletonNotebook notebook = SingletonNotebook.getInstance();
    private static final SingletonPen pen = SingletonPen.getInstance();
    private static final SingletonPencil pencil = SingletonPencil.getInstance();

    public static SingletonNotebook getNotebook() {
        return notebook;
    }

    public static ToolForWriting getToolForWriting(Employee employee){
        if(employee.getExperience() > 2){
            return pen;
        }else {
            return pencil;
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee(2);
        Employee employee3 = new Employee(3);

        employee1.write("this is note of first employee");
        employee2.write("this is note of second employee");
        employee3.write("this is note of third employee");

        employee1.setExperience(4);
        employee1.requestForWritingTool();

        employee1.write("this is note of first employee");

        notebook.close();
    }

}
