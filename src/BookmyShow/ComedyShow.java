package BookmyShow;

public class ComedyShow extends BookMyShow{
    int price,NumberOfSeat;
    @Override

    public void search(){
        System.out.println("Enter the Comedy you want to watch");
        System.out.println("press 1 for Standup and press 2 for show");
        int choice = sc.nextInt();
        if(choice ==1){
            System.out.println("Enter the Comedy to watch Standup");
            System.out.println("press 1 for Munover and 2 for harsh");
            String ComedySelection = sc.next();
        }
        if (choice ==2){
            System.out.println("Enter the Comedy to watch Show");
            System.out.println("press 1 for zakar and press two for bass");
            String ComedySelection = sc.next();
            System.out.println("Enjoy you moves " + ComedySelection);
        }
    }
    public void SelectionSeat(){
        System.out.println("Enter the seat to select");
        System.out.println("1 for Near the state -->5000rs");
        System.out.println("2 for middle -->3000 rs");
        System.out.println("3 for Back --> 1500rs");
        int SelectionSeat = sc.nextInt();
        if (SelectionSeat== 1){
            price = price + (5000+ NumberOfSeat);
        }
        if (SelectionSeat== 2){
            price = price + (3000+ NumberOfSeat);
        }
        if (SelectionSeat== 3){
            price = price + (1500+ NumberOfSeat);
        }
        System.out.println("totalamount of the Comedy show is "+ price);
    }

    public void AddOn(){

        System.out.println("Do you want to addon ! press 1 for no 2 for yes");
        int addon = sc.nextInt();
        System.out.println("Enter the addon 1 for no 2 for yes");
        int numOfAddOn = sc.nextInt();
        if (addon == 1){
            System.out.println("Total price is = " + price);
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
    public void text(){
        System.out.println();
        System.out.println("1 for Near the state -->5000rs  in this pashe is text 15%");
        System.out.println("2 for middle -->3000 rs  in this show is text is 10%");
        System.out.println("3 for Back --> 1500rs in this show text is 5%");
        int choice = sc.nextInt();
        if(choice ==1){
            price = price+ price*15/100;
            System.out.println("Total price is = " + price);
        }
        if(choice ==2){
            price =price+ price*10/100;
            System.out.println("Total price is = " + price);
        }
        if(choice ==3){
            price = price + price*5/100;
            System.out.println("Total price is = " + price);
        }

    }
    public void BookTickets(){
        search();
        SelectionSeat();
        AddOn();
        text();

    }

    public void cancelTicket(){
        System.out.println("do you want to really cancel a ticket? yes or no");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("ticket has been cancelled");
            price =0;
            System.out.println("total amount refunded");
        }
        if (choice.equalsIgnoreCase("no")){
            System.out.println("enjoy the Comedy Show..||||");
        }
    }

    }

