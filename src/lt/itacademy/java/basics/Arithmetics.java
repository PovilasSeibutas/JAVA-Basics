package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter integer shortline 5:");
    int integer = scanner.nextInt();
    System.out.println("Cube’s volume: " + integer * integer + " cm3");
    System.out.println("Cube’s perimeter: " + integer * 6 + " cm");

    System.out.println("Please enter feet");
    double feet = scanner.nextDouble();
    System.out.println("Please enter inches");
    double inches = scanner.nextDouble();
    feetAndInchesToCentimeters(feet, inches);

  }

  public static void feetAndInchesToCentimeters(double feet, double inches) {
    double cmFromFeet = feet * 12 * 2.54;
    double cmFromInch = inches * 2.54;
    double sum = cmFromFeet + cmFromInch;
    System.out.println("2.4 feet and 4.0 inches = " + sum + " cm");

  }
}
