package ARRAYLIST;

import java.util.ArrayList;

public class arr1 {
    static ArrayList<String> listName = new ArrayList<>();
    public static void main(String[] args) {
        listName.add("Author");
        listName.add("Lupin");
        listName.add("Jone");
        listName.add("ALIC");
        listName.add("CLARE");
        listName.add("DOPES");
        arr1 a = new arr1();
       // a.displayList(listName);
     /*   a.removeNameByPosition(0);
        System.out.println("======================");
        System.out.println(listName);
       // System.out.println(listName);
        System.out.println("================");
        System.out.println(listName.get(0));
        System.out.println(listName.get(1));


        System.out.println("=========");
        a.removeNameByString("ALIC");
        System.out.println(listName.get(3));
        System.out.println("================");
        a.displayList(listName);



        a.displayList(listName);
        System.out.println("==========");
        a.modifyName(2,"Ranga");
        System.out.println("=====================");
        System.out.println(listName);

      */

        System.out.println("============");
        int position = a.Search("Author");
        System.out.println("position of array "+position);
  if(position!=-1){
         a.modifyName(position,"anaa");
  }else {
      System.out.println("Invalid name");
  }
    }
    void displayList(ArrayList<String> Name){
        for (String name:Name){
            System.out.println(name);

        }
    }
    void removeNameByPosition(int position){

        listName.remove(position);
    }
    void removeNameByString(String name){
       listName.remove(name);
    }
    void modifyName(int position, String newName){
        listName.set(position, newName);

    }
    int Search(String name){
      return   listName.indexOf(name);
    }

}
