import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String[][] table = new String[3][3];
        int[][] table1 = new int[3][3];
        int y = 1;
        Scanner TTT = new Scanner(System.in);
        System.out.println("Player 1: Enter Your Name");
        String P1 = TTT.nextLine();
        System.out.println("Player 1: " + P1);
        System.out.println("Player 2: Enter Your Name");
        String P2 = TTT.nextLine();
        System.out.println("Player 2: " + P2);

        System.out.println("Positions on the board (1 to 9)");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                table1[i][j] = y;
                table [i][j] = "_ ";
                y++;
                System.out.print(table1[i][j] + " ");
            }
            System.out.println();
        }

        for (int z = 1; z <= 9; z++) {
            System.out.println("If you're player 1, type 1. If you're player 2, type 2");
            int P12 = TTT.nextInt();
            System.out.println("Select Position from 1 to 9");
            int TTT1 = TTT.nextInt();

            if (P12 == 1) {
                switch (TTT1) {
                    case 1:
                        table[0][0] = "O ";
                        break;
                    case 2:
                        table[0][1] = "O ";
                        break;
                    case 3:
                        table[0][2] = "O ";
                        break;
                    case 4:
                        table[1][0] = "O ";
                        break;
                    case 5:
                        table[1][1] = "O ";
                        break;
                    case 6:
                        table[1][2] = "O ";
                        break;
                    case 7:
                        table[2][0] = "O ";
                        break;
                    case 8:
                        table[2][1] = "O ";
                        break;
                    case 9:
                        table[2][2] = "O ";
                        break;

                }
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(table[i][j]);
                    }
                    System.out.println();
                }
            }

            else if (P12 == 2) {
                switch (TTT1) {
                    case 1:
                        table[0][0] = "X ";
                        break;
                    case 2:
                        table[0][1] = "X ";
                        break;
                    case 3:
                        table[0][2] = "X ";
                        break;
                    case 4:
                        table[1][0] = "X ";
                        break;
                    case 5:
                        table[1][1] = "X ";
                        break;
                    case 6:
                        table[1][2] = "X ";
                        break;
                    case 7:
                        table[2][0] = "X ";
                        break;
                    case 8:
                        table[2][1] = "X ";
                        break;
                    case 9:
                        table[2][2] = "X ";
                        break;

                }
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(table[i][j]);
                    }
                    System.out.println();
                }

            }
            
        if (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] == "O ") {
            System.out.println("Congratulations "+ P1 + ". You Won!");
            System.exit(0);
        } else if (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] == "X ") {
            System.out.println("Congratulations "+ P2 + ". You Won!");
            System.exit(0);
        } else if (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] == "O ") {
            System.out.println("Congratulations "+ P1 + ". You Won!");
            System.exit(0);
        } else if (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] == "X ") {
            System.out.println("Congratulations "+ P2 + ". You Won!");
            System.exit(0);
        } else if (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] == "O ") {
            System.out.println("Congratulations "+ P1 + ". You Won!");
            System.exit(0);
        } else if (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] == "X ") {
            System.out.println("Congratulations "+ P2 + ". You Won!");
            System.exit(0);
        } else if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == "O ") {
            System.out.println("Congratulations "+ P1 + ". You Won!");
            System.exit(0);
        } else if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == "X ") {
            System.out.println("Congratulations "+ P2 + ". You Won!");
            System.exit(0);
        } else if (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] == "O ") {
            System.out.println("Congratulations "+ P1 + ". You Won!");
            System.exit(0);
        } else if (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] == "X ") {
            System.out.println("Congratulations "+ P2 + ". You Won!");
            System.exit(0);
        }


        }
    }
}
