import java.util.Scanner;
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    BankAccount obj1 = new BankAccount ("xyz", "BA1234");
	    obj1.showMenu();
	}

}

class BankAccount 
{ 
  int balance;
  int previousTransaction;
  String customerName;
  String customerId;
 
  BankAccount (String cname, String cid)
  { 
    customerName = cname;
     customerId = cid;
  }

     void deposit (int amount)
      {
        if (amount != 0)
        {
         balance = balance + amount;
         previousTransaction = amount;
        }
      }

    void withdraw (int amount)
    {
      if (amount != 0)
      {
       balance = balance - amount;
       previousTransaction = -amount;
      }
    }

   void getPreviousTranscation()
   {
      if(previousTransaction >0)
      { 
        System.out.println(" The amount deposited :" +previousTransaction);
      }
      else if (previousTransaction <0)
     {
       System.out.println("The amount withdrawed:"+ Math.abs(previousTransaction));
     }
     else
    { 
      System.out.println( " NO TRANSACTION OCCURED ");
    }
  }

  void showMenu()
 {
   
      char option= '\0'; // intializing char to 0
      Scanner scanner = new Scanner(System.in); // scanner is used to take values from the user

      System.out.println(" Welcome " +customerName);
      System.out.println(" Your ID is " +customerId);
      System.out.println("\n"); 
      System.out.println(" A.  Check Balance ");
      System.out.println(" B.  Deposit ");
      System.out.println(" C.  Withdraw");
      System.out.println(" D.  Previous Transaction");
      System.out.println(" E.  Exit");
       
      do
      {
            System.out.println(" ************************************************************************************************************************************************");
            System.out.println("Enter an Option");
            System.out.println("*************************************************************************************************************************************************");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option)
            {

            case 'A':
                          System.out.println("***********************************");
                          System.out.println("Balance = " +balance);
                          System.out.println("***********************************");
                          System.out.println("\n");
                          break;
           case 'B':
                         System.out.println("************************************");
                         System.out.println("Enter the amount to be deposited");
                         System.out.println("************************************");
                         int amount = scanner.nextInt();
                         deposit (amount); // amount is placed at the deposit which is the void deposit method
                         System.out.println("\n");
                         break;
          case 'C':
                        System.out.println("************************************");
                        System.out.println(" Enter the amount to be withdraw ");
                        System.out.println("*************************************");
                        amount = scanner.nextInt();
                        withdraw(amount);
                        break;
         case 'D':
                        System.out.println("************************************");
                        getPreviousTranscation();
                        System.out.println("************************************");
                        System.out.println("\n");
                        break;
        case 'E':
                       System.out.println("___________________________");
                       break;
       default :
                       System.out.println("Invalid Option !! Please try again");
                       break;
       }

    }
      while (option != 'E');
      System.out.println("ThankYou for using our service");
    }
}