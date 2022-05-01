// import the Scanner class 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    
    String repeat = null;

    while (repeat == null || repeat.equals("y")) {
      
        // Declaring variables

        String userShape = null;
        int userHeight = 0;
        String userLabel = null;
        int userRow = 0;

        // Begin gathering inputs
        
        while (userShape == null) {
            Scanner input = new Scanner(System.in);
            System.out.println("Choose between a triangle, inverted triangle, square, or diamond: ");
            String answer = input.nextLine().toLowerCase();

            if (answer.equals("triangle") || answer.equals("square") || answer.equals("diamond") || answer.equals("inverted triangle")) {
                userShape = answer;
            }
            System.out.println();
        }

        while (userHeight == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("How many rows tall should the " + userShape + " be?");
            int answer = input.nextInt();

            if (answer > 0) {
                userHeight = answer;
            } else {
                System.out.println("How many rows tall should the " + userShape + " be?");
            }
            System.out.println();
        }

        while (userLabel == null) {
            Scanner input = new Scanner(System.in);
            System.out.println("What label should I print on this " + userShape + "? (Leave it blank for \"LU\")");
            String answer = input.nextLine();

            if (answer == "") {
                userLabel = "LU";
            } else {
                userLabel = answer;
            }
            System.out.println();
        }

        while (userRow == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Which row should I print \"" + userLabel + "\" on?");
            int answer = input.nextInt();

            if (answer > userHeight) {
                System.out.println("Row " + answer + " exceeds your shape height of " + userHeight + ". Please input a number that is less than or equal to " + userHeight + ".");
            } else if (answer > 0) {
                userRow = answer;
            }
            System.out.println();
        }

        // Call the triangle class

        if (userShape.equals("triangle")) {
            Triangle.triangle(userHeight, userRow, userLabel, 0);
            System.out.println();
        }

        if (userShape.equals("inverted triangle")) {
            InvertedTriangle.invertedTriangle(userHeight, userRow, userLabel, 0);
            System.out.println();
        }

        // Call the square class

        if (userShape.equals("square")) {
            Square.square(userHeight, userRow, userLabel);
            System.out.println();
        }

        // Call the diamond class

        if (userShape.equals("diamond")) {
            Diamond.diamond(userHeight, userRow, userLabel);
            System.out.println();
        }

        // Exit clause

        repeat = null;
        while (repeat == null) {
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like for me to print another shape? (Y/N)");
            String answer = input.nextLine().toLowerCase();

            if (answer.equals("y")) {
                repeat = answer;
            } else if (answer.equals("n")) {
                repeat = answer;
            } else {
                System.out.println("Please specify Y or N.");
            }
        }
        System.out.println();
    }
    System.out.println("Thanks for playing! Have a wonderful day!");
  }
}