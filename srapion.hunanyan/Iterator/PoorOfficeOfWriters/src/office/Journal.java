package office;

import office.WritingToolOwners.WritingToolOwner;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Journal{

    private WritingToolOwner[]writingToolOwners;
    private int size = 0;

    public Journal(){
        writingToolOwners = new WritingToolOwner[3];
    }

    public Iterator<WritingToolOwner> iterator() {
        return new JournalIterator();
    }

    public void add(WritingToolOwner writingToolOwner){
        if(size >= writingToolOwners.length - 1){
            ensureCapacity();
        }
        writingToolOwners[size] = writingToolOwner;
        size++;
    }

    public WritingToolOwner remove(int index) {
        WritingToolOwner deleted = writingToolOwners[index];
        for (;index < size; index++){
            writingToolOwners[index] = writingToolOwners[index+1];
        }
        size--;
        return deleted;
    }

    private void ensureCapacity(){
        WritingToolOwner[] temp = new WritingToolOwner[(int) (writingToolOwners.length * 1.5) + 1];
        System.arraycopy(writingToolOwners, 0, temp, 0, writingToolOwners.length);
        writingToolOwners = temp;
    }

    private class JournalIterator  implements Iterator<WritingToolOwner> {

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public WritingToolOwner next() {
            if(cursor >= size){
                throw new NoSuchElementException();
            }
            WritingToolOwner current = writingToolOwners[cursor];
            cursor++;
            return current;
        }
    }
}
