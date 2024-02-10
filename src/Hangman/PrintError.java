package Hangman;

public class PrintError {
    //методы выводящие состояние виселицы

    public static String printStart() {
        return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                "         " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
    }

    public static String printOneError() {
        return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                "    " + (char) 79 + "    " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
    }

    public static String printTwoError() {
        return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                "    " + (char) 79 + "    " + (char) 124 + "\n" +
                "    " + (char) 124 + "    " + (char) 124 + "\n" +
                "    " + (char) 124 + "    " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
    }

    public static String printTreeError() {
        return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                "    " + (char) 79 + "    " + (char) 124 + "\n" +
                "  " + (char) 45 + (char) 45 + (char) 124 + "    " + (char) 124 + "\n" +
                "    " + (char) 124 + "    " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
    }

    public static String printFourError() {
        return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                "    " + (char) 79 + "    " + (char) 124 + "\n" +
                "  " + (char) 45 + (char) 45 + (char) 124 + (char) 45 + (char) 45 + "  " + (char) 124 + "\n" +
                "    " + (char) 124 + "    " + (char) 124 + "\n" +
                "         " + (char) 124 + "\n" +
                (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
    }

    public static String printFiveError() {
        return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                "    " + (char) 79 + "    " + (char) 124 + "\n" +
                "  " + (char) 45 + (char) 45 + (char) 124 + (char) 45 + (char) 45 + "  " + (char) 124 + "\n" +
                "    " + (char) 124 + "    " + (char) 124 + "\n" +
                "   " + (char) 47 + "     " + (char) 124 + "\n" +
                (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
    }

    public static String printSixError() {
        return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                "    " + (char) 79 + "    " + (char) 124 + "\n" +
                "  " + (char) 45 + (char) 45 + (char) 124 + (char) 45 + (char) 45 + "  " + (char) 124 + "\n" +
                "    " + (char) 124 + "    " + (char) 124 + "\n" +
                "   " + (char) 47 + " " + (char) 92 + "   " + (char) 124 + "\n" +
                (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
    }
}






