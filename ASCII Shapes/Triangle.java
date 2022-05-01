class Triangle {
    public static void triangle(int userHeight, int userRow, String userLabel, int modifier){
        
        for (int rowMarker = 1; rowMarker <= userHeight; rowMarker++) {

            if (rowMarker == userRow) {
                
                int offset = (userHeight - rowMarker + modifier);
                int split = ((rowMarker - userLabel.length()) / 2);
    
                // Handling the scenario where the word is too big to fit well inside the row
                if (userLabel.length() > rowMarker) {
                    
                    for (int count = 0; count < userLabel.length(); count++) {
                    System.out.print(userLabel.charAt(count) + " ");
                    }
    
                    System.out.println();
            } else {
                for (int count = 0; count < offset; count++) {
                    System.out.print(" ");
                }
                for (int count = 0; count < split; count++) {
                    System.out.print("X ");
                }
                for (int count = 0; count < userLabel.length(); count++) {
                    System.out.print(userLabel.charAt(count) + " ");
                }
                if ((rowMarker - userLabel.length()) % 2 == 1) {
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
              }
              
            } else {
                int offset = (userHeight - rowMarker + modifier);
    
                for (int count = 0; count < offset; count++) {
                    System.out.print(" ");
                }
    
                for (int count = 0; count < rowMarker; count++) {
                    System.out.print("X ");
                }
    
                System.out.println();
            }
        }
    }
}
