package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter days per year");
    Integer days = scanner.nextInt();
//    System.out.println(yearToHourandMinutes(days));
//    System.out.println(yearToHourandMinutesWhile(days));
    System.out.println(fractional(days));

  }

  private static String yearToHourandMinutes(Integer days) {
    Integer hours = 0;
    Integer minutes = 0;
    for (int i = 0; i < days; i++) {
      hours += 24;
      minutes += 1440;
    }
    return "There are " + hours + " hours or " + minutes + " in one year.";
  }

  private static String yearToHourandMinutesWhile(Integer days) {
    Integer hours = 0;
    Integer minutes = 0;
    Integer i = 0;
    while (i < days) {
      hours += 24;
      minutes += 1440;
      i++;
    }
    return "There are " + hours + " hours or " + minutes + " in one year.";
  }

  private static String fractional(Integer number) {
    Integer count = number;
    Integer fractional = number;
    while (count > 1) {
      fractional = fractional * (count - 1);
      count--;
    }
    return "Factorial of number " + number + " is " + fractional + " .";
  }

}
