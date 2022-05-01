class Square {
    public static void square(int userHeight, int userRow, String userLabel) {
        for (int rowMarker = 1; rowMarker <= userHeight; rowMarker++) {

            // Catching the user's chosen row
            if (rowMarker == userRow) {
                int split = ((userHeight - userLabel.length()) / 2);
                for (int count = 0; count < split; count++) {
                    System.out.print("X ");
                }
                for (int count = 0; count < userLabel.length(); count++) {
                    System.out.print(userLabel.charAt(count) + " ");
                }
                if ((userHeight - userLabel.length()) % 2 == 1) {
                    split++;
                    for (int count = 0; count < split; count++) {
                        System.out.print("X ");
                    }
                } else {
                    for (int count = 0; count < split; count++) {
                        System.out.print("X ");
                    }
                }
            } else {
                for (int count = 0; count < userHeight; count++) {
                    System.out.print("X ");
                }
            }
            
            System.out.println();
        }
    }
}
