import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double consumption = sc.nextDouble();

        int bill;
        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);
        sc.close();
    }
}`