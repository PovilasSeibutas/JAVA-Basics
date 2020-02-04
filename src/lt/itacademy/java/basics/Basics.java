package lt.itacademy.java.basics;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Basics {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter your name and surname:");
    String name = scanner.next();
    System.out.println("Please enter your age:");
    String ageString = scanner.next();
    System.out.println("Hello I am " + name + ". I am attending IT academy 2020!");

    System.out.println("Enter boolean true:");
    boolean bool = scanner.nextBoolean();

    System.out.println("Enter byte 0:");
    byte by = scanner.nextByte();

    System.out.println("Enter String rld: ");
    String letterString = scanner.next();

    System.out.println("Enter char H: ");
    String letterStrringH = scanner.next();
    char letter = letterStrringH.charAt(0);

    System.out.println("Enter char w: ");
    String letterStrringW = scanner.next();
    char letterW = letterStrringW.charAt(0);

    System.out.println("Enter float 2");
    float floa = scanner.nextFloat();

    System.out.println("Enter integer 31");
    int integer = scanner.nextInt();

    System.out.println("Enter short 10");
    short integer2 = scanner.nextShort();

    System.out.println(" " +
        letter + integer + integer2 + " " + letterW + by + letterString + " " + floa + " " + bool);
//  H3110 w0r1d 2.0 true

  }
}
