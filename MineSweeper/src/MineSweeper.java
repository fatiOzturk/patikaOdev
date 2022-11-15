import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;              // Kullanıcıdan satır sayısı aldık.
    int columnNumber;           // Kullanıcıdan sütun sayısı aldık.
    int[][] mineMap;        // Mayınları atayacağım harita.
    String[][] strMap;      // oyunda gösterilecek harita
    int mineNumber;         // Mayın Sayısı

    boolean isPlay = true;     // Mayına basılırsa false döndürecek.
    Random rand = new Random();

    Scanner input = new Scanner(System.in);


    // Main Constructor oluşturduk
    MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.mineMap = new int[rowNumber][columnNumber];
        this.strMap = new String[rowNumber][columnNumber];
        this.mineNumber = (rowNumber * columnNumber) / 4;
        prepGame();
        prepStrMap();
        print(mineMap);
    }

    public void run() {
        int row, col;
        boolean isWrong=false;
        while (isFinish()) {
            printStrMap();
                System.out.print("Satır : ");
                row = input.nextInt();
                System.out.print("Sütun : ");
                col = input.nextInt();

                if (mineMap[row][col] == -1) {
                    isPlay = false;
                    System.out.println("Game Over... Mayın haritası aşağıdadır.");
                    print(mineMap);
                    break;
                } else {
                    check(row, col);
                }
        }
        while (!isFinish()) {
            System.out.println("Tebrikler, kazandınız... Mayın tarlası aşağıdadır");
            print(mineMap);
            break;
        }
    }

    public void prepGame() {
        int count = 0, randRow, randCol;
        while (count < mineNumber) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(columnNumber);
            if (mineMap[randRow][randCol] != -1) {
                mineMap[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void prepStrMap() {
        for (int i = 0; i < strMap.length; i++) {
            for (int j = 0; j < strMap[0].length; j++) {
                if (mineMap[i][j] == -1) {
                    strMap[i][j] = ("*");
                } else {
                    strMap[i][j] = ("-");
                }
            }
        }
    }

    public void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((array[i][j]) == -1) {
                    System.out.print(array[i][j] + " ");
                } else System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printStrMap() {
        for (int i = 0; i < strMap.length; i++) {
            for (int j = 0; j < strMap[0].length; j++) {
                if (strMap[i][j].contentEquals("*")) {
                    System.out.print("-");
                } else {
                    System.out.print(strMap[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void check(int r, int c) {
        int count = 0;
        if (strMap[r][c].contentEquals("-")) {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (((r + i) >= 0) && ((c + j) >= 0) && ((r + i) < mineMap.length) && ((c + j) < mineMap[0].length)) {
                        if (i != 0 || j != 0) {
                            if (mineMap[r + i][c + j] == -1) {
                                count++;
                            }
                        }
                    }
                }
            }
            strMap[r][c] = String.valueOf(count);
        }
    }

    public boolean isFinish() {
        for (int i = 0; i < strMap.length; i++) {
            for (int j = 0; j < strMap[0].length; j++) {
                if (!strMap[i][j].contentEquals("*")) {
                    if (strMap[i][j].contentEquals("-")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}