package JavaPrograms;

import java.util.Scanner;

public class convert_fah_to_cel {
    public static void main(String[] args) {
        float temp;
        Scanner in =new Scanner(System.in);

        System.out.println("Enter temperature in fahrenheit");
        temp=in.nextInt();

        temp=((temp-32)*5)/9;

        System.out.println("Temperature in celsius = " +temp);
    }
}
