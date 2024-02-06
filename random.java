import java.util.*;
class random{
      public static void main(String[] args){
            Random r=new Random();
            Scanner sc=new Scanner(System.in);
            int points=0;
         boolean flag=true;
         while(flag){ 
            int random_number=r.nextInt(100)+1;
            System.out.println("Enter guess number");
            int number=sc.nextInt();
            if(random_number==number){
                   points++;
                   System.out.println("wow! you guess is correct");
            }
            else if(number>random_number){
                    System.out.println("too high");
            }
            else
            {
                      System.out.println("too low");
            }
            System.out.println("Enter playagain or exit");
            String s=sc.next();
            switch(s){
                   case "playagain":
                   {
                         flag=true;
                         continue;
                   }
                   case "exit":
                   {
                         flag=false;
                         System.out.println("Score: "+points);
                   }
            }
         }      
      }
}












