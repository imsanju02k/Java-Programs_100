package JavaPrograms;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int a;
        float b;
        String s;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        s=in.nextLine();
        System.out.println(" You entered string " +s);

        System.out.println("Enter an integer");
        a=in.nextInt();
        System.out.println(" You Entered Integer "+a);

        System.out.println("Enter a float");
        b=in.nextFloat();
        System.out.println(" You entered float "+b);


    }
}
