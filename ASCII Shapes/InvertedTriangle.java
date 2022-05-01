class InvertedTriangle {
    public static void invertedTriangle(int userHeight, int userRow, String userLabel, int modifier){

      // The modifier variable is used to assist in building of diamond
        for (int rowMarker = 1 + modifier; rowMarker <= userHeight; rowMarker++) {

            //Setting up a variable to invert the counts
            int inverter = (rowMarker - (userHeight + 1));
            inverter = Math.abs(inverter);
            

            if (rowMarker == userRow) {
                
                int offset = ((userHeight - inverter) - modifier);
                int split = ((inverter - userLabel.length()) / 2);

                for (int count = 0; count < offset; count++) {
                    System.out.print(" ");
                }
                for (int count = 0; count < split; count++) {
                    System.out.print("X ");
                }
                for (int count = 0; count < userLabel.length(); count++) {
                    System.out.print(userLabel.charAt(count) + " ");
                }
                if ((inverter - userLabel.length()) % 2 == 1) {
                    split++;
                    for (int count = 0; count < split; count++) {
                        System.out.print("X ");
                    }
                } else {
                    for (int count = 0; count < split; count++) {
                        System.out.print("X ");
                    }
                }
                System.out.println();

            } else {

                int offset = ((userHeight - inverter) - modifier);

                for (int count = 0; count < offset; count++) {
                    System.out.print(" ");
                }

                for (int count = 0; count < inverter; count++) {
                    System.out.print("X ");
                }

                System.out.println();
            }
            }
    }
}
