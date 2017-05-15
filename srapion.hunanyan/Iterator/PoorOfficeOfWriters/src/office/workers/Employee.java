package office.workers;

import office.SingletonNotebook;
import office.WritingToolOwners.WritingToolOwner;
import office.WritingToolType;

public class Employee {

    public void write(String text, WritingToolType writingToolType){
        SingletonNotebook notebook = WritersPoorOfficeManager.getNotebook();
        WritingToolOwner writingToolOwner = WritersPoorOfficeManager.getWriterByToolType(writingToolType);
        writingToolOwner.write(text, notebook);
    }

}
