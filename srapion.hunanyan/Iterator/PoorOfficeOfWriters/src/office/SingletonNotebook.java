package office;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SingletonNotebook{

    private static SingletonNotebook notebook;

    private FileOutputStream os;

    private SingletonNotebook() {
        if (notebook != null) {
            throw new RuntimeException("sorry, but we have only one office.notebook... :( ");
        }
        File file = new File("resources/paper");
        try {
            this.os = new FileOutputStream(file, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static SingletonNotebook getInstance() {
        if (notebook == null) {
            notebook = new SingletonNotebook();
        }
        return notebook;
    }

    public void print(byte[] text) {
        try {
            os.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
