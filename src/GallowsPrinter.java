public class GallowsPrinter {
    private final int line = 12;
    private final int column = 7;

    private char[][] gallows = new char[line][column];

    public void setGallows() {
        for (int i = 0; i < gallows.length; i++) {
            for (int j = 0; j < gallows[i].length; j++) {
                gallows[i][j] = ' ';
            }
        }
    }

    public void printGallows() {
        for (int i = 0; i < gallows.length; i++) {
            for (int j = 0; j < gallows[i].length; j++) {
                System.out.print(gallows[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void changeGallows1() {
        gallows[11][0] = '/';
        gallows[10][1] = '/';
        gallows[11][1] = '_';
        gallows[10][2] = '|';
        gallows[11][2] = '_';
        gallows[10][3] = '\\';
        gallows[11][3] = '_';
        gallows[11][4] = '\\';
    }

    public void changeGallows2() {
        gallows[1][2] = '|';
        gallows[2][2] = '|';
        gallows[3][2] = '|';
        gallows[4][2] = '|';
        gallows[5][2] = '|';
        gallows[6][2] = '|';
        gallows[7][2] = '|';
        gallows[8][2] = '|';
        gallows[9][2] = '|';
    }

    public void changeGallows3() {
        gallows[0][2] = '-';
        gallows[0][3] = '-';
        gallows[0][4] = '-';
        gallows[0][5] = '-';
        gallows[1][3] = '/';
    }

    public void changeGallows4() {
        gallows[1][5] = '|';
        gallows[2][5] = '|';
        gallows[3][5] = '|';
    }

    public void changeGallows5() {
        gallows[4][5] = 'O';
    }

    public void changeGallows6() {
        gallows[5][5] = '|';
        gallows[6][5] = '|';
    }

    public void changeGallows7() {
        gallows[5][4] = '/';
        gallows[5][6] = '\\';
    }

    public void changeGallows8() {
        gallows[7][4] = '/';
        gallows[7][6] = '\\';
    }
}
