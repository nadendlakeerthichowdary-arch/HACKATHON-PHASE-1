import java.util.Scanner;

public class TotalWaterUsage {

    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning water usage (litres): ");
        int morning = sc.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int evening = sc.nextInt();

        int total = calculateTotal(morning, evening);

        System.out.println("Total Water Consumption: " + total + " litres");
        sc.close();
    }
}