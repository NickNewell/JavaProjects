class Diamond {
    public static void diamond(int userHeight, int userRow, String userLabel) {

        // Building the top of the diamond with the triangle class. Modifier variable was introduced to accomodate the construction
        
        if (userHeight % 2 == 0) {
            Triangle.triangle(userHeight / 2, userRow, userLabel, 0);
        }

        if (userHeight % 2 == 1) {
            Triangle.triangle(userHeight / 2, userRow, userLabel, 1);
        }

        // Building the bottom of the diamond with the inverted triangle class. Modifier variable was introduced to accomodate the construction
        
        InvertedTriangle.invertedTriangle(userHeight, userRow, userLabel, userHeight / 2);
    }
}
