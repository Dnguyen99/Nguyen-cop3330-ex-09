package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        double sqFeetPerGallon = 350;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and width of the ceiling in feet: ");
        double length = input.nextFloat();
        double width = input.nextFloat();
        int area = (int) (length * width);

        int finalResult = (int) Math.ceil(area / sqFeetPerGallon);
        System.out.println("You will need to purchase " +finalResult+ " gallons of paint to cover " +area+ " square feet.");
    }
}
