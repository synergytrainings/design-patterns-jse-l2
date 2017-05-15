package office.workers;

import office.Journal;
import office.WritingToolType;
import office.SingletonNotebook;
import office.WritingToolOwners.*;
import java.util.Iterator;

public class WritersPoorOfficeManager {

    private static final SingletonNotebook notebook = SingletonNotebook.getInstance();
    private static final Journal writingToolOwnersJournal = new Journal();

    public static SingletonNotebook getNotebook() {
        return notebook;
    }

    public static WritingToolOwner getWriterByToolType(WritingToolType toolType){
        Iterator<WritingToolOwner> iterator = writingToolOwnersJournal.iterator();
        while (iterator.hasNext()){
            WritingToolOwner writingToolOwner = iterator.next();
            if(writingToolOwner.getToolType() == toolType){
                return writingToolOwner;
            }
        }
        WritingToolOwner writingToolOwner = null;
        switch (toolType) {
            case PEN:
                writingToolOwner =  new PenOwner();
                writingToolOwnersJournal.add(writingToolOwner);
                break;
            case PENCIL:
                writingToolOwner = new PencilOwner();
                writingToolOwnersJournal.add(writingToolOwner);
                break;
            case FELT_PEN:
                writingToolOwner = new FeltPenOwner();
                writingToolOwnersJournal.add(writingToolOwner);
                break;
        }
        return writingToolOwner;
    }

}
