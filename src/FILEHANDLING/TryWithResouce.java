package FILEHANDLING;

import java.util.Scanner;

public class TryWithResouce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value");
        int x = scan.nextInt();
        System.out.println(x);
        scan.close();
    }
}
