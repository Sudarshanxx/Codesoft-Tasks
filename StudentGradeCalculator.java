import java.util.*;
public class StudentGradeCalculator{
    
    public static void main(String args[]){
        System.out.println("HELLO STUDENT!!!!");
        System.out.println("Read the instructions carefully and fill the details.");
        
        
        Scanner sc=new Scanner (System.in);
    
       
        System.out.println("Enter your name:");
         String name=sc.nextLine();
        System.out.println("Enter the marks of all subject out of 100");
        System.out.println("Enter the marks of Subject-1:");
         int subject1=sc.nextInt();
        System.out.println("Enter the marks of Subject-2:");
         int subject2=sc.nextInt();
        System.out.println("Enter the marks of Subject-3:");
        int subject3=sc.nextInt();
        System.out.println("Enter the marks of Subject-4:");
        int subject4=sc.nextInt();
        System.out.println("Enter the marks of Subject-5:");
        int subject5=sc.nextInt();;

        int Total_Marks=(subject1+subject2+subject3+subject4+subject5);
        System.out.println("Total marks Scored:"+Total_Marks);
      
        int Average_Percentage=(Total_Marks/5);
        System.out.println("Averagae Percentage:"+Average_Percentage);
        
        if(Average_Percentage>=90){
            System.out.println(" Grade:A");
        }
        else if(Average_Percentage>=80){
            System.out.println("Grade:B");
        }
        else if(Average_Percentage>=70){
            System.out.println("Grade:C");
        }
        else if(Average_Percentage>=60){
            System.out.println("Grade:D");
        }
            else {
            System.out.println(" Grade:E");
        }

    System.out.println("BEST OF LUCK FOR NEXT YEAR!!!!");
    System.out.println("THANK YOU!!!!");
    
    }
   
}