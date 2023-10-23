package FILEHANDLING;

import java.io.*;

class Vehicle implements Serializable{
    private String type;
    private int number;
    public Vehicle(String type, int number){
        this.number = number;
        this.type=type;
    }
    public String toString(){
        return  "Vehicle [Type = "+ type + ", Number = "+ number + "]";
    }
}
public class SerializationOfObject {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("bike", 8989);
        Vehicle car = new Vehicle("car", 1001);
           try(FileOutputStream fos = new FileOutputStream("team.txt")){
               try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
                   obj.writeObject(bike);
                   obj.writeObject(car);
                   System.out.println("Object writen the into the file");
               }

           }catch (FileNotFoundException e){
               System.out.println("fileNotFoundException");
           }catch (IOException E){
               System.out.println("IOException");
           }

    }
}
