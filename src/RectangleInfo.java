import java.util.Scanner;

public class RectangleInfo {
    static void main() {
        Scanner in = new Scanner(System.in);
        double rectangleWidth = 0;
        double rectangleHeight = 0;
        double rectangleArea = 0;
        double rectanglePerimeter = 0;
        double lengthOfDiagonal = 0;
        boolean done = false;
        boolean done2 = false;
        String trash = "";
        do {
            System.out.print("Input rectangle width: ");
            if(in.hasNextDouble()) {
                rectangleWidth = in.nextDouble();
                done = true;
            }else {
                trash = in.nextLine();
                System.out.println("You said your width was " + trash);
                System.out.println("Please enter a valid Amount");
            }
        } while (!done);
        do {
            System.out.print("Input rectangle height: ");
            if(in.hasNextDouble()) {
                rectangleHeight = in.nextDouble();
                done2 = true;
            }else {
                trash = in.nextLine();
                System.out.println("You said your height was" + trash);
                System.out.println("Please enter a valid Amount");
            }
        } while (!done2);
        rectangleArea = rectangleWidth * rectangleHeight;
        rectanglePerimeter = rectangleHeight*2 +rectangleWidth*2;
        lengthOfDiagonal = Math.sqrt((rectangleWidth * rectangleWidth) + (rectangleHeight*rectangleHeight));
        System.out.println("The area of the rectangle is " + rectangleArea);
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter);
        System.out.println("The length of the diagonal of the rectangle is " + lengthOfDiagonal);

    }
}
