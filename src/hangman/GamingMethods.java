package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static hangman.PrintError.*;

public class GamingMethods {
    public static Scanner inputPlayer = new Scanner(System.in);
    static int error;

    //метод получения слова,которое нужно будет отгадать
    public static List<String> getSecretWord(List<String> list) {
        List<String> secretWord = new ArrayList<>();
        try {
            File playWord = new File("playWords");
            Scanner scanner = new Scanner(playWord);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            Random random = new Random();
            String string = list.get(random.nextInt(list.size()));
            secretWord.add(string);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не найден");
        }
        return secretWord;
    }

    //метод преобразующий секретное слово в List<Character>
    public static List<Character> changeWord(List<String> list) {
        String word = list.get(0);
        char[] wordSymbol = word.toCharArray();
        List<Character> wordPlaySymbol = new ArrayList<>();
        for (char c : wordSymbol) {
            c = Character.toLowerCase(c);
            wordPlaySymbol.add(c);
        }
        return wordPlaySymbol;
    }

    //метод шифрующий слово символом *
    public static void closeSecretWord(List<String> list) {
        String word = list.toString();
        System.out.print(String.format("Вам нужно отгадать слово из %d букв. ", word.length()));
        for (int i = 0; i < word.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //метод, создающий закрытое слово,отгаданные буквы которого будут открываться
    public static List<Character> closeLetterInWord(List<Character> list, List<Character> listLetter) {
        for (int i = 0; i < listLetter.size(); i++) {
            list.add('*');
        }
        return list;
    }

    //метод ввода буквы игроком
    public static char inputLetter() {
        char input;
        do {
            input = inputPlayer.next().charAt(0);
            if (!Character.isLetter(input)) {
                System.out.println("Введите букву!");
            }
            if (Character.isUpperCase(input)) {
                System.out.println("Введите маленькую букву.");
            }
        } while (!Character.isLowerCase(input));
        return input;
    }

    //метод который сравнивает есть ли введенная игроком буква в слове
    public static boolean compareInputLetterPlayer(List<Character> list, char letter) {
        for (Character c : list) {
            if (Character.toLowerCase(c) == letter) {
                return true;
            }
        }
        return false;
    }

    //метод открывающий букву
    public static List<Character> openLetter(List<Character> list, List<Character> listSymbol, char letter) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(letter)) {
                listSymbol.set(i, letter);
            }
        }
        return listSymbol;
    }

    //метод показывающий количество ошибок и ошибочные буквы
    public static Set<Character> printHowManyError(Set<Character> lettersError, char letter) {
        lettersError.add(letter);
        System.out.println("Количетсво ошибок: " + ++error + " " + lettersError);
        System.out.println(String.format("В слове нет буквы: %s ", letter));
        return lettersError;
    }

    public static void printMan() {
        if (error == 0) {
            System.out.println(printStart());
        } else if (error == 1) {
            System.out.println(printOneError());
        } else if (error == 2) {
            System.out.println(printTwoError());
        } else if (error == 3) {
            System.out.println(printTreeError());
        } else if (error == 4) {
            System.out.println(printFourError());
        } else if (error == 5) {
            System.out.println(printFiveError());
        } else if (error == 6) {
            System.out.println(printSixError());
            System.out.println("Вы проиграли!\n");
        }
    }

    //метод,сравнивающий массив слова с массивом открытых букв
    public static boolean compareWordWithOpenLetter(List<Character> secretWord, List<Character> openPlayerLetter) {
        return secretWord.containsAll(openPlayerLetter);
    }

    //метод,проверяющий повторное введение буквы
    public static boolean checkRepeatLetter(List<Character> openLetterWord, Set<Character> lettersError, char letter) {
        if (openLetterWord.contains(letter) || lettersError.contains(letter)) {
            System.out.println("Вы уже вводили букву: " + letter + "\nВведите другую букву!");
            return true;
        }
        return false;
    }


}



