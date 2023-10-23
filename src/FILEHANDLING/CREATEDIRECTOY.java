package FILEHANDLING;

import java.io.File;
import java.io.IOException;

public class CREATEDIRECTOY {
    public static void main(String[] args) throws IOException {
        {
            File directory = new File("javaop\\author\\LUPIN");
            directory.mkdirs();
            System.out.println("Directory is created..........");
            File file = new File("javaop\\author\\LUPIN\\text.txt");
            file.createNewFile();
            System.out.println("File created ");
        }
    }
}
