package workers;

import notebook.SingletonNotebook;
import toolsForWriting.ToolForWriting;

public class Employee {

    private ToolForWriting toolForWriting;
    private SingletonNotebook notebook;
    private int experience;

    public Employee(int experience){
        this.experience = experience;
        this.notebook = Manager.getNotebook();
        toolForWriting = Manager.getToolForWriting(this);
    }

    public void requestForWritingTool(){
        toolForWriting = Manager.getToolForWriting(this);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void write(String text){
        notebook = Manager.getNotebook();
        toolForWriting.write(text, notebook);
    }
}
