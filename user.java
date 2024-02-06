import java.util.*;
interface ATM{
     public void withdraw();
     public void deposit();
     public void checkbalance();
}
class bank implements ATM{
     int balance;
     Scanner sc=new Scanner(System.in);
     bank(int balance){
         this.balance=balance;
     }
     public void withdraw()
     {
       System.out.println("enter amount to withdraw");
       int amount=sc.nextInt();
       if(amount<=this.balance){
            balance=balance-amount;
            System.out.println("success");
            System.out.println("after withdraw your account balance is: "+this.balance);
       }
       else
       {
              System.out.println("debit amount is exceeded");
       }
     }
     public void deposit(){
           System.out.println("enter amount to deposit");
           int amount=sc.nextInt();
           balance=balance+amount;
           System.out.println("after deposit your account balance is: "+this.balance);
     }
     public void checkbalance(){
        System.out.println("your account balance is: "+this.balance);
     }
}
public class user{
  public static void main(String[] args){
       bank user1=new bank(1000);
       boolean flag=true;
       Scanner sc=new Scanner(System.in);
       while(flag){
           System.out.println("Enter 1 to withdraw amount: \n Enter 2 to deposit amount: \n Enter 3 to checkbalance:\n Enter 4 to exit from application:");
           int num=sc.nextInt();
            switch(num){
                case 1:
                {
                    user1.withdraw();
                    break;
                }
                case 2:
                {
                       user1.deposit();
                       break;
                }
                case 3:
                {
                      user1.checkbalance();
                      break;
                }
                case 4:
                {
                     flag=false;
                     break;
                }
            }  
       }  
  }
}















