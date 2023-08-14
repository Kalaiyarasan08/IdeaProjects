import java.util.Scanner;
public class Logical{
    private static Scanner sc;
    public static void main(String[] args){
        int age;
        sc=new Scanner(System.in);
        System.out.println("please enter the age:");
        age=sc.nextInt();
        if(!(age>16))
        {
            System.out.println("You are too young");
        }
        else if(age>18 && age<= 35 )
        {
            System.out.println("Young man");
        }
        else if (age == 36 || age <=60 )
        {
            System.out.println("Middle age ");
        }
        else
        {
           System.out.println("You are too old");

        }
    }

}