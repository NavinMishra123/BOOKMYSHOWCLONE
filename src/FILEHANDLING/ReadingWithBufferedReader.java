package FILEHANDLING;

import java.io.*;

public class ReadingWithBufferedReader {
    public static void main(String[] args) {
        {
            File file = new File("ALEX");
            file.mkdir();
            file  = new File("ALEX\\team.txt");
            try {


                file.createNewFile();
                System.out.println("File crated");
            }catch (IOException E){
                System.out.println("ERROR OCCURED , WHILE CRATING FILE");


            }
            try
                    (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){

                bw.write("Author");
                bw.newLine();
                bw.write("Lupin");
                bw.newLine();
                bw.write("Alice");
                bw.newLine();
                bw.write("Jone");
                bw.newLine();
                System.out.println("writing onto the file completed");
                    bw.close();
            }catch (IOException e){
                System.out.println("error occurred, While creating writing onto file");
            }
            try {


                BufferedReader br = new BufferedReader(new FileReader("ALEX\\team.txt"));
                String line;
                while (true){
                    try {
                        if (!((line=br.readLine()) !=null)) break;
                        System.out.println("========================");
                        System.out.println(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }


    }
}
