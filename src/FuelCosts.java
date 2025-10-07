import java.util.Scanner;

public class FuelCosts {

    static void main() {
        double gasAmount = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double costToDrive = 0;
        double distanceFullTank = 0;
        String trash = "";
        boolean done = false;
        boolean done2 = false;
        boolean done3 = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Input amount of gas in the tank in gallons:");
            if(in.hasNextDouble()) {
                gasAmount = in.nextDouble();
                done = true;
            }else {
                trash = in.nextLine();
                System.out.println("You said your amount of gas was " + trash);
                System.out.println("Please enter a valid Amount");
            }
        } while (!done);
        do {
            System.out.print("Input fuel Efficiency in miles per gallon:");
            if(in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                done2 = true;
            }else {
                trash = in.nextLine();
                System.out.println("You said your efficiency was " + trash);
                System.out.println("Please enter a valid Amount");
            }
        } while (!done2);
        do {
            System.out.print("Input fuel price per gallon:");
            if(in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                done3 = true;
            }else {
                trash = in.nextLine();
                System.out.println("You said your price was" + trash);
                System.out.println("Please enter a valid Amount");
            }
        } while (!done3);
        costToDrive = (100/fuelEfficiency)*gasPrice;
        System.out.println("Your cost to drive 100 miles is: " + costToDrive);
        distanceFullTank = gasAmount * fuelEfficiency;
        System.out.println("The range with your tank is: " + distanceFullTank);
    }
}

