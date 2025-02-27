package Logics;

public class Counter {
    private static int counterDefeat = 8;
    private static int counterWin = 0;

    public static int getCounterDefeat() {
        return counterDefeat;
    }

    public static void setCounterDefeat() {
        counterDefeat--;
    }

    public static int getCounterWin() {
        return counterWin;
    }

    public static void setCounterWin() {
        counterWin++;
    }

    public static void resetCounter() {
        counterDefeat = 8;
        counterWin = 0;
    }
}
