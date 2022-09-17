import java.util.Random;
    public class BattleShip {
        public static int setBattleship(int[][] battlefield, int shipLength) {

            Random setRandom = new Random(); // Creating a random class
            int battlefieldSize = battlefield.length; // Battlefield size
            int x1 = setRandom.nextInt(battlefieldSize); // Creating vector X
            int y1 = setRandom.nextInt(battlefieldSize); // Creating vector Y
            int location = setRandom.nextInt(2); // Location of the ship
            int x2 = x1; //Creating vector -x
            int y2 = y1; // Creating vector -y

            if (location == 0) {  // Creating a condition for placing ships
                x2 += shipLength -1;
            } else {
                y2 += shipLength -1;
            }
            boolean isEmpty = true; // Condition to place a ship to empty point

            for (int x = x1 - 1; x <= x2 + 1; x++) {
                for (int y = y1 - 1; y <= y2 + 1; y++) {
                    if ( x >= 0 && x <= battlefieldSize && y >= 0 && y < battlefieldSize){// If is not empty
                        if (battlefield[x][y] == 1) {
                            isEmpty = false;
                        }

                    }
                }
            }
            if (isEmpty) { // If is empty
                for (int i = x1; i <= x2; i++){
                    for (int j = y1; j <= y2; j++) {
                        battlefield[i][j] = 1;
                    }
                }
                return 0;
            }
            return 1;
        }

        public static void main (String[] argv) {
            System.out.println("Let the battle begin!\n");
            int battlefieldSize = 10; // Enter a battlefield size
            int[][] field = new int[battlefieldSize][battlefieldSize]; // Creating matrix

            boolean flag = false; // Condition that checks if it is possible to place a ship
            while (!flag) {
                for (int i = 0; i < battlefieldSize; i++) {
                    for (int j = 0; j < battlefieldSize; j++) {
                        field[i][j] = 0;
                    }
                }


                int oneDeckShip = 4; // Quantity of 0ne deck ships
                int twoDeckShip = 3; // Quantity of two deck ships
                int threeDeckShip = 2; // Quantity of three deck ships
                int fourDeckShip = 1; // Quantity of four deck ships

                if (oneDeckShip > 0) {  // Cycle for placing one deck ships
                    oneDeckShip = setBattleship(field, 1);
                }
                if (twoDeckShip > 0) { // Cycle for placing  two deck ships
                    twoDeckShip = setBattleship(field, 2);

                }
                if (threeDeckShip > 0) { // Cycle for placing three deck ships
                    threeDeckShip = setBattleship(field, 3);

                }
                if (fourDeckShip > 0) { // Cycle for placing four deck ships
                    fourDeckShip = setBattleship(field, 4);
                }
                flag = fourDeckShip == 0 && threeDeckShip == 0 && twoDeckShip == 0 && oneDeckShip == 0;
        }

                for (int i = 0; i < battlefieldSize; i++) {
                    for (int j = 0; j < battlefieldSize; j++) {
                        System.out.print(" ");
                        System.out.print(field[i][j]);
                    }
                    System.out.println("\n");

                }
            }

        }


