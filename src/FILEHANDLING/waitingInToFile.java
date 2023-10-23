package FILEHANDLING;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class waitingInToFile {
    public static void main(String[] args) {
        {
            File file = new File("LUPIN");
            file.mkdir();
            file  = new File("LUPIN\\team.txt");
            try {


                file.createNewFile();
                System.out.println("File crated");
            }catch (IOException E){
                System.out.println("ERROR OCCURED , WHILE CRATING FILE");


            }
            try(BufferedWriter  bw = new BufferedWriter(new FileWriter(file,true))){

               bw.write("Author");
               bw.newLine();
                bw.write("Lupin");
                bw.newLine();
                bw.write("Alice");
                bw.newLine();
                bw.write("Jone");
                bw.newLine();
                System.out.println("writing onto the file completed");
                System.out.println("writing  into the file ");
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
