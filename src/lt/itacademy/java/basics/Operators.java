package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter length of side A: ");
    Integer sideA = scanner.nextInt();
    System.out.println("Please enter length of side B: ");
    Integer sideB = scanner.nextInt();
    System.out.println("Please enter length of side C: ");
    Integer sideC = scanner.nextInt();
    System.out.println(equilateral(sideA, sideB, sideC));

    System.out.println("Please enter distance to the destination: ");
    Double destination = scanner.nextDouble();
    System.out.println("Please enter how much fuel does the car have in the tank: ");
    Double fuelInTank = scanner.nextDouble();
    System.out.println("Please enter car fuel usage per 100km: ");
    Double fuelUsage = scanner.nextDouble();
    System.out.println("Please enter  fuel price per liter: ");
    Double fuelPrice = scanner.nextDouble();
    System.out.println(destinationReach(destination, fuelInTank, fuelUsage, fuelPrice));
  }

  private static String equilateral(Integer sideA, Integer sideB, Integer sideC) {
    String answer = "Triangle is NOT Equilateral. Sides: " + sideA + " " + sideB + " " + sideC;
    if (sideA.equals(sideB) && sideA.equals(sideC)) {
      answer = "Triangle is Equilateral. Sides: " + sideA + " " + sideB + " " + sideC;
    }
    return answer;
  }

  private static String destinationReach(Double destination, Double fuelInTank, Double fuelUsage,
      Double fuelPrice) {
    Double fuelLeft = (destination / 100) * fuelUsage - fuelInTank;
    if (fuelLeft > 0) {
      return "Destination is " + destination
          + " km. Car is able to reach the destination. It will have " + fuelLeft
          + " liters of fuel left.";
    } else {
      Double fuelNeed = fuelLeft * (-1);
      Double fuelCost = fuelNeed * fuelPrice;
       return "Destination is in " + destination
          + ". Car is not able to reach the destination. It needs " +
          fuelNeed + " liter of fuel more. It will cost " + fuelCost;
    }
  }

}
