package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Double shorelineA;
    Double shorelineB;
    Double perimeter;
    Double area;

    System.out.println("Press: \n"
        + "t: Triangle \n"
        + "r: Rectangle \n"
        + "s: Square \n"
        + "e: EXIT");
    String letter = scanner.next();
    switch (letter) {
      case "t":
      case "T":
        System.out.println("Please enter shoreline A");
        shorelineA = scanner.nextDouble();
        if (shorelineA <= 0) {
          System.out.println("Shorline must be more than 0");
          main(args);
          break;
        }
        System.out.println("Please enter shoreline B");
        shorelineB = scanner.nextDouble();
        if (shorelineB <= 0) {
          System.out.println("Shorline must be more than 0");
          main(args);
          break;
        }
        perimeter =
            shorelineA + shorelineB + Math.sqrt(shorelineA * shorelineA + shorelineB * shorelineB);
        area = shorelineA * shorelineB / 2;
        System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area);
        main(args);
        break;
      case "r":
      case "R":
        System.out.println("Please enter shoreline A");
        shorelineA = scanner.nextDouble();
        if (shorelineA <= 0) {
          System.out.println("Shorline must be more than 0");
          main(args);
          break;
        }
        System.out.println("Please enter shoreline B");
        shorelineB = scanner.nextDouble();
        if (shorelineB <= 0) {
          System.out.println("Shorline must be more than 0");
          main(args);
          break;
        }
        perimeter = (shorelineA + shorelineB) * 2;
        area = shorelineA * shorelineB;
        System.out.println("Square perimeter is " + perimeter + " and area is " + area);
        main(args);
        break;
      case "s":
      case "S":
        System.out.println("Please enter shoreline A");
        shorelineA = scanner.nextDouble();
        perimeter = shorelineA * 4;
        if (shorelineA <= 0) {
          System.out.println("Shorline must be more than 0");
          main(args);
          break;
        }
        area = shorelineA * shorelineA;
        System.out.println("Triangle perimeter is " + perimeter + " and area is " + area);
        main(args);
        break;
      case "e":
      case "E":
        scanner.close();
        System.out.println("END");
        break;
      default:
        System.out.println("Wrong action!");
        main(args);
    }
  }
}
