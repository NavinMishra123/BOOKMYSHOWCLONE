package BookmyShow;
import java.util.*;
public class BookMyShow {
    String emailId, pwd;
    boolean isLogin;
    int selection;
    Scanner sc = new Scanner(System.in);

    public void Singup(){
        System.out.println("Do you have any account");
        System.out.println("Press 1 for No 2 for yes");
        int choise = sc.nextInt();
        if(choise == 1){
            System.out.println("Create an account");
            System.out.println("exit your email id");
            emailId = sc.next();
            System.out.println("enter you pwd");
            pwd = sc.next();
            login();
        }
        else if (choise == 2){
            System.out.println("Login toyour account");
            login();
        }



    }
    public  void  login(){
        System.out.println("Enter login detial");
        System.out.println("enter the email id");
         String LoginEmail  = sc.next();
        System.out.println("enter the pwd");
        String LoginPwd = sc.next();

        if(LoginEmail.equalsIgnoreCase(emailId) && LoginPwd.equalsIgnoreCase(pwd) ){

            System.out.println("login success");
             isLogin = true;
        }
        else {
            System.out.println("incorrect pwd");
             isLogin = false;


        }
    }
    public  void  search (){
        System.out.println("Enter the choice");
        System.out.println("press 1 for movies , 2 for  comedy ,3 for live show");
        selection = sc.nextInt();
    }
    public void bookTiket(){
        System.out.println("thicket is being cancelled");
    }



}
