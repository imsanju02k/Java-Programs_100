package JavaPrograms;

import java.util.Scanner;

public class Find_Largest_Number {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter three integers");
        Scanner in=new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();

        if(x>y && x>z)
            System.out.println("first number is largest");
        else if (y>x && y>z)
            System.out.println("Second number is largest");
        else if(z>x && z>y)
            System.out.println("third number is largest");
        else
            System.out.println("Entered number are not distinct .");
    }
}
