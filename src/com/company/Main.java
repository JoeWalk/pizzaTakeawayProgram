package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        ArrayList<String> pizzaProfile = new ArrayList<>();
        boolean valid = false;
        while(!valid){
            try {
                System.out.print("What size pizza would you like? Small (£7.99), Medium(£10.99) or large(£13.99)");
                String pizzaSize = input.next();
                if ((pizzaSize != "Small") || (pizzaSize != "Medium") || (pizzaSize != "Large")){
                    valid = true;
                    pizzaProfile.add(pizzaSize);
                }
                else{
                    System.out.print("Please enter one of the available sizes");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Please don't enter numbers " + e);
                input.next();
            }
        }
        valid = false;
        while(!valid){
            try {
                System.out.println("What topping would you like on your pizza. The first 2 are free, then the are £1.25 each");
                String topping = input.next();
                pizzaProfile.add(topping);
                System.out.print("Do you want another topping? If not type end");
            }
            catch (InputMismatchException e){
                System.out.println("Please don't enter a number");
                input.next();
            }
        }
    }
}
