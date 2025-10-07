
import java.util.Scanner;
void main() {
    boolean done = false;
    Scanner in = new Scanner(System.in);
    double tempC = 0;
    double tempF = 0;
    String trash = "";
    double conversionFactor = 1.8;
    do{
        System.out.print("Input your temperature in Celcius");
        if(in.hasNextDouble()) {
            tempC = in.nextDouble();
            tempF = (tempC * conversionFactor) +32;
            System.out.println("That is " + tempF + "in Farenheit");
            if (tempF >= 212) {
                System.out.println("That is above the boiling point");
                done = true;
                in.nextLine();
            } else if (tempF <= 32) {
                System.out.println("That below the freezing point");
                done = true;
                in.nextLine();
            } else {
                done = true;
                in.nextLine();
            }
        } else{
            trash = in.nextLine();
            System.out.println("You said your temperature was" + trash);
            System.out.println("Please enter a valid Amount");
        }
    }while(!done);
}