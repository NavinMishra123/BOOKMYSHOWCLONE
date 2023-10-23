package FILEHANDLING;

import java.io.File;

public class FileDeletion {
    public static void main(String[] args) {
        File file = new File("javaop\\author\\LUPIN\\text.txt");
        if(file.delete()){
            System.out.println("Deletion is succussful");
        }else {
            System.out.println("Error while deleting");
        }
    }
}
