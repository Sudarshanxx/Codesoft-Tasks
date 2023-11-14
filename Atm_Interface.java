import java.util.*;
public class Atm_Interface{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the ATM");
        int balance=10000;
        while(true){
            
            System.out.println("1.Check Balance");
            System.out.println("2.Withdraw Amount");
            System.out.println("3.Deposit Amount");
            System.out.println("4.Exit");
            System.out.print("Enter the choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:System.out.println("Your Balance is Rs:"+balance);
                break;

                case 2:System.out.println("Enter the Amount to Withdraw Rs:");
                int withdrawAmount=sc.nextInt();
                if(withdrawAmount<=balance){
                    balance-=withdrawAmount;
                    System.out.println("Withdrawing Succesfully Remaining Amount Rs:"+balance);    
                }else {
                    System.out.println("Insufficinet Funds");          
                    }
                break;

                case 3:System.out.println("Enter the Amount to Deposit Rs:");
                   int  depositAmount = sc.nextInt();
                balance+=depositAmount;
                System.out.println("Total Balance is Rs:"+balance);
                break;
              
                case 4:System.out.println("Thank You For Visiting!!!");
                System.out.println("Visit Again!!!!!");
                break;

                
                default:
                    System.out.println("Invalid Choice Please Try Again Later!!");
            }
         }
    }
}