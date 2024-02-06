import java.util.*;
class grade{
       public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("enter number of subjects");
               int n=sc.nextInt();
               System.out.println("enter marks obtained in each subject");
               int total_marks=0;
               for(int i=0;i<n;i++){
                    int marks=sc.nextInt();
                    total_marks+=marks;    
               }
               double average_percentage=total_marks/n;
               System.out.println("total marks are: "+total_marks);
               System.out.println("average percentage is: "+average_percentage);
       }
}
