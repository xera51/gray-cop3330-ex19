/*
 *  UCF COP3330 Summer 2021 Exercise 19 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int height = myApp.readHeight();
        int weight = myApp.readWeight();

        double bmi = myApp.calculateBmi(height, weight);
        myApp.displayResult(bmi);
    }

    private int readHeight() {
        int d;
        while(true) {
            System.out.print("What is your height (in inches)? ");
            try {
                d = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number.");
                continue;
            }
            break;
        }
        return d;
    }

    private int readWeight() {
        int d;
        while(true) {
            System.out.print("What is your weight (in pounds)? ");
            try {
                d = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number.");
                continue;
            }
            break;
        }
        return d;
    }


    public double calculateBmi(int height, int weight) {
        return (1.0 * weight / (height * height)) * 703;
    }

    public void displayResult(double bmi) {
        System.out.printf("Your BMI is %.1f.%n", bmi);
        if(bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        } else if (bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        } else {
            System.out.println("You are within the ideal weight range.");
        }
    }
}
