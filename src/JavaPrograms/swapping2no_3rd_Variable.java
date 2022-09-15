package JavaPrograms;

import java.util.Scanner;

public class swapping2no_3rd_Variable {
    public static void main(String[] args) {
        int x,y,temp;
        System.out.println("Enter the X and Y");
        Scanner in=new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();

        System.out.println("Before Swapping \nx = "+x+ "\ny = "+y);

        temp=x;
        x=y;
        y=temp;

        System.out.println("After Swapping\nx = "+x+"\ny = "+y);
    }
}
