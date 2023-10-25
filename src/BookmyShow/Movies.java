package BookmyShow;

public class Movies extends BookMyShow{

    int price, NumberOfseet;
    @Override
    public void search (){
        System.out.println("Enter the language you want to watch ");
        System.out.println("press 1 fo hindi, 2 for english");
        int choice = sc.nextInt();
        if (choice ==1){
            System.out.println("Enter the moves to watch in hindi");
            System.out.println("1 for jwan , 2 for Gadar");
            String movieSelection = sc.nextLine();
        }
        if (choice == 2){
            System.out.println("Enter the move watch to lancth in English");
            System.out.println("Barble, spiderman,avengers");
            String moveSelection = sc.nextLine();
            System.out.println("enjoy watching the moves"+ moveSelection);
        }

    }
    public void seatSelection(){
        System.out.println("Enter the seet to select");
        System.out.println("1 for normal -->200rs");
        System.out.println("2 for premium -->400 rs");
        System.out.println("3 for excutive --> 600rs");
        int selectionseet = sc.nextInt();
        if (selectionseet == 1){
            price = price + (200+ NumberOfseet);
        }
        if (selectionseet == 2){
             price = price + (400+ NumberOfseet);
        }
        if (selectionseet == 3){
             price = price + (600+ NumberOfseet);
        }
        System.out.println("totalamount of the moves is "+ price);
    }
  public void addOns(){
      System.out.println("do you want any addOns! 1 for no 2 for yes");
      int addon = sc.nextInt();
      System.out.println("enter the number od add on");
      int numOfAddon = sc.nextInt();
      if (addon ==1){
          System.out.println("total price is " + price);
      }
      if(addon == 2){
          System.out.println("enter the addon");

          System.out.println("1 for small --> 150");
          System.out.println("2 for large ---> 300");
          int choice = sc.nextInt();
          if (choice ==1){
              price = price + (150+addon);
              System.out.println("total prices is = " + price);

          }
          if(choice == 2){
              price = price+ (300+ addon);
              System.out.println("total  price is =  " + price);
          }


      }

  }

    public void bookTickets(){
       search();
       seatSelection();
       addOns();
    }

    public void cancelTicket(){
        System.out.println("do you want to really cancel a ticket? yes or no");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("ticket has been cancelled");
            price = 0;
            System.out.println("total amount refunded");
        }
        if (choice.equalsIgnoreCase("no")){
            System.out.println("enjoy the movies..||||");
        }
    }

}



