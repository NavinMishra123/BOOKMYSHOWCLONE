package BookmyShow;
import  java.util.*;
public class test {

    static {
        System.out.println("welcome to Book My Show");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookMyShow b = new BookMyShow();
        b.Singup();
        if (b.isLogin == true){
            b.search();
            if (b.selection == 1){
                Movies m = new Movies();
                m.bookTickets();
                System.out.println("do you want to cancel ? yes or no");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("yes")){
                    m.cancelTicket();
                }
                else {
                    System.out.println("Enjoy the show");
                }
            }
            if (b.selection == 2){
                ComedyShow c = new ComedyShow();
                c.BookTickets();
                System.out.println("do you want to cancel ? yes or no");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("yes")){
                    c.bookTiket();
                }
                else {
                    System.out.println("Enjoy the show");
                }
            }
        }
        else {
            System.out.println("invalid password");
        }
    }
}
