import java.util.Scanner;
public class Battery {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter battery level (0 - 100): ");
    int level = input.nextInt();
    if (level < 20){
      System.out.println("low battery, please connect a charger");
    }
    System.out.println("Battery level: " + level + "%");

    System.out.println("enter the second battery level: ");
    level = input.nextInt();
    if (level < 20) {
      System.out.println("Low battery, please connect a charger");
    }
    System.out.println("Battery level: " + level + "%");
  }
}
