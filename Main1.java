public class Main1 {
    public static void main(String args[]) {
        // String[][] table = new String[3][3];
        String[][] table = new String[3][3];
        // // int y = 1;
        // // for (int i = 0; i <= 2; i++) {
        // // for (int j = 0; j <= 2; j++) {
        // // table[i][j] = '_';

        // // System.out.print(table[i][j]);
        // // }
        // // System.out.println();
        // // }

        // // for (int i = 0; i <= 2; i++) {
        // // for (int j = 0; j <= 2; j++) {
        // // table1[i][j] = y;
        // // y++;
        // // System.out.print(table1[i][j]);
        // // }
        // // System.out.println();

        // for (int i = 0; i <= 2; i++) {
        // for (int j = 0; j <= 2; j++) {
        // table[i][j]="_|";
        // System.out.println(table[i][j]);
        // }
        // System.out.println();
        // return;
        // }
        // int x = 9 ;
        // switch (x) {
        // case 1:
        // table[0][0] = "O";
        // break;
        // case 2:
        // table[0][1] = "O";
        // break;
        // case 3:
        // table[0][2] = "O";
        // break;
        // case 4:
        // table[1][0] = "O";
        // break;
        // case 5:
        // table[1][1] = "O";
        // break;
        // case 6:
        // table[1][2] = "O";
        // break;
        // case 7:
        // table[2][0] = "O";
        // break;
        // case 8:
        // table[2][1] = "O";
        // break;
        // case 9:
        // table[2][2] = "O";
        // break;

        // }
        // for (int i = 0; i <= 2; i++) {
        // for (int j = 0; j <= 2; j++) {
        // System.out.print(table[i][j]);
        // }
        // System.out.println();

        // }
        table[0][0] = "O ";
        table[0][1] = "O ";
        table[0][2] = "O ";

        if (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] == "O ") {
            System.out.println("P1 wins");
            System.exit(0);
        } else if (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] == "X ") {
            System.out.println("P2 Wins");
            System.exit(0);
        } else if (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] == "O ") {
            System.out.println("P1 wins");
            System.exit(0);
        } else if (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] == "X ") {
            System.out.println("P2 Wins");
            System.exit(0);
        } else if (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] == "O ") {
            System.out.println("P1 wins");
            System.exit(0);
        } else if (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] == "X ") {
            System.out.println("P2 Wins");
            System.exit(0);
        } else if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == "O ") {
            System.out.println("P1 wins");
            System.exit(0);
        } else if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == "X ") {
            System.out.println("P2 Wins");
            System.exit(0);
        } else if (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] == "O ") {
            System.out.println("P1 wins");
            System.exit(0);
        } else if (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] == "X ") {
            System.out.println("P2 Wins");
            System.exit(0);
        }

    }
}
