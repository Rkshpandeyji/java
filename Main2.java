import java.io.*;
import java.util.Scanner;
public class Main2
{
  @SuppressWarnings("empty-statement")
    public static void main(String[] args)throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    Scanner Keyboard=new Scanner(System.in);
    int pin = 123456;
    int t,an;
   System.out.println("WELCOME TO THE john carlo atm");
   System.out.println("ENTER YOUR PIN PASS: ");
   int entry = Keyboard.nextInt();
    while (entry!=pin) {
      System.out.println("\nINCORRECT PIN PLS TRY AGAIN");
      System.out.println("ENTER YOUR PIN PASSWORD :");
      entry= Keyboard.nextInt(); }
      {
      System.out.println("\npin correct you now have access to your acc");
   int choose;
   String choice = null;
   int wd,dp,bal= 0,bal1 = 10000; 
   bal = bal1;
    do { System.out.println("Automated Teller Machine");
    System.out.println("Choose 1 To Witdraw");
    System.out.println("Choose 2 To Desposit");
    System.out.println("Choose 3 To Check Balance");
    System.out.println("Choose 4 To Change Pin");
    System.out.println("Choose 5 To Transfer");
    System.out.println("Choose 6 To Exit");
    System.out.println("Choose the operation that you want to perform : ");
    choose = Integer.parseInt(br.readLine());
    int attempt = 3;
    switch (choose) {
    case 1:
      System.out.println("Enter the amount to be withdraw : ");
      wd=Integer.parseInt(br.readLine());
    if (wd>10000) { 
       System.out.println("Insufficient Balance "); }
    else if (wd<=10000) {
        bal = bal - wd;
    System.out.println("Remaining Balance : "+bal);
    }
    else {
     System.out.println("Invalid "); }
     System.out.println("Do you want to do another transaction? Y/N: ");
     choice = br.readLine();
      break;
    case 2:
      System.out.println("Enter the amount to be Deposit: ");
      dp=Integer.parseInt(br.readLine());
      bal = dp + bal;
      System.out.println("Remaining Balance : "+bal);
      System.out.println("Do you want to do another transaction? Y/N: ");
           choice = br.readLine();
      break;
    case 3:
      System.out.println("Remaining Balance : "+bal);
      System.out.println("Do you want to do another transaction? Y/N: ");
           choice = br.readLine();
      break;
    case 4:
      System.out.println("Your old pin : "+pin);
      System.out.print("Enter a new pin : ");
      pin=Integer.parseInt(br.readLine());
      System.out.println("Pin changed! : "+pin);  
      System.out.println("Do you want to continue? Y/N: ");
      choice = br.readLine();
      break;
    case 5:
      System.out.println("Enter Account number : ");
      an=Integer.parseInt(br.readLine());
        if (6 >= String.valueOf(an).length() && 6 <= String.valueOf(an).length()) {
            }
        else {
            System.out.println("Invalid Account number");
            System.out.println("Do you want to do another transaction? Y/N: ");
            choice = br.readLine();
            break;
            }
      System.out.println("Enter Amount to transfer : ");
      t=Integer.parseInt(br.readLine());   
        if ( t > bal) {
            System.out.println("Insufficient Balance");
            System.out.println("Do you want to do another transaction? Y/N: ");
            choice = br.readLine();
            break;
        }
        else if (t < bal) {
            System.out.print("Enter your pin to authorize transfer : ");
            entry = Keyboard.nextInt();
            while (entry!=pin) {
            attempt = attempt - 1;
            System.out.println("ATTEMPTS LEFT "+attempt);
            System.out.println("INCORRECT PIN PLS TRY AGAIN");
            if (attempt!= 0) {
              System.out.println("ENTER YOUR PIN PASSWORD :");
              entry = Keyboard.nextInt();
              }
            else {
              System.out.println("TRANSACTION FAILED:");
              System.out.println("Do you want to do another transaction? Y/N: ");
              choice = br.readLine();
              break;
              }
            }
            while (entry==pin) {
            bal = bal - t;
            System.out.println("Amount Successfully Transfered:");
            System.out.println("Remaining Balance : "+bal);
            System.out.println("Do you want to do another transaction? Y/N: ");
            choice = br.readLine();
            break;
            }
        }
        break;
    case 6:
        System.out.println("End of The Transaction");
        return;
    default:
        System.out.println("Invalid Transaction");
        System.out.println("Do you want to do another transaction? Y/N: ");
           choice = br.readLine();
        break;
    }
      if ("Y".equals(choice) || "y".equals(choice)) {
      attempt = 3;
          if (choose != 6) {
            System.out.println("ENTER YOUR PIN PASS: ");
            entry = Keyboard.nextInt();
            while (entry!=pin) {
            attempt = attempt - 1;
            System.out.println("ATTEMPTS LEFT "+attempt);
            System.out.println("INCORRECT PIN");
            if (attempt != 0) {
              System.out.println("ENTER YOUR PIN PASSWORD :");
              entry = Keyboard.nextInt();
              }
            else {
              System.out.println("PLS TRY AGAIN LATER:");
              return;
              }
      } 
      }
      }
      
    }while ("Y".equals(choice) || "y".equals(choice));
    } 
  }
}
