package FILEHANDLING;

import java.io.File;
import java.io.IOException;

public class FILE1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\NAVIN MISHRA\\Desktop\\PROGRAMING\\FILE//Let's learn java.txt");
        file.createNewFile();
        System.out.println("FILE CREATED");
    }
}
