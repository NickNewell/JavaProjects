
// Importing the Scanner class and exception handler. 

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    
    String repeat = null;

    while (repeat == null || repeat.equals("y")) {
      
        // Declaring variables.

        String userShape = null;
        int userHeight = 0;
        String userLabel = null;
        int userRow = 0;

        //
        // Begin gathering inputs.
        //

        // Gathering shape type.

        while (userShape == null) {
            Scanner input = new Scanner(System.in);
            System.out.println("Choose between a triangle, inverted triangle, square, or diamond: ");
            String answer = input.nextLine().toLowerCase();

            if (answer.equals("triangle") || answer.equals("square") || answer.equals("diamond") || answer.equals("inverted triangle")) {
                userShape = answer;
            }
            System.out.println();
        }

        // Gathering height of shape. Exceptions created for integers 0 and below, as well as non-integers. 

        while (userHeight < 1) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("How many rows tall should the " + userShape + " be?");
                userHeight = input.nextInt();
                if (userHeight < 1) {
                    throw new ArithmeticException();
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Please enter a positive integer.");
            } catch (ArithmeticException e) {
                System.out.println();
                System.out.println("Please enter a positive integer.");
            }
        } 
        
        System.out.println();

        // Gathering message to be inserted into shape.

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

        // Gathering row to insert message on. If left blank, it will set it at 4 or the bottom line if less than 4. 

        while (userRow < 1 || userRow > userHeight) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Which row should I print \"" + userLabel + "\" on?");
                String answer = input.nextLine();
                
                if (answer.isEmpty() && userHeight < 4) {
                    userRow = userHeight;
                } else if (answer.isEmpty()) {
                    userRow = 4;
                } else if (Integer.valueOf(answer) < 1) {
                    throw new ArithmeticException();
                } else if (Integer.valueOf(answer) > userHeight) {
                    throw new RuntimeException ();
                } else {
                    userRow = Integer.valueOf(answer);
                }

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Please enter a positive integer.");
            } catch (ArithmeticException e) {
                System.out.println();
                System.out.println("Please enter a positive integer.");
            } catch (RuntimeException e) {
                System.out.println();
                System.out.println("Row " + userRow + " exceeds your shape height of " + userHeight + ". Please input a number that is less than or equal to " + userHeight + ".");
            }
        } 

        System.out.println();

        //
        // Time to build some shapes. 
        //

        // Call the triangle class.

        if (userShape.equals("triangle")) {
            Triangle.triangle(userHeight, userRow, userLabel, 0);
            System.out.println();
        }

        if (userShape.equals("inverted triangle")) {
            InvertedTriangle.invertedTriangle(userHeight, userRow, userLabel, 0);
            System.out.println();
        }

        // Call the square class.

        if (userShape.equals("square")) {
            Square.square(userHeight, userRow, userLabel);
            System.out.println();
        }

        // Call the diamond class.

        if (userShape.equals("diamond")) {
            Diamond.diamond(userHeight, userRow, userLabel);
            System.out.println();
        }

        // Exit clause.

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