package JavaPrograms;

import java.util.Scanner;

public class evenOrodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to find the even or odd");
        int a=sc.nextInt();
        if(a%2==0)
            System.out.println("even " +a);
        else
            System.out.println("odd " +a);
    }
}
