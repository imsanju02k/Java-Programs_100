package JavaPrograms;

import java.util.Scanner;

public class AddTwo_Number {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("enter the x and y ");
        Scanner in =new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();
        z=x+y;

        System.out.println("the sum of x and y ="+z);

    }


}
