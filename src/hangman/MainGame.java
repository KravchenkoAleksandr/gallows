package hangman;

import java.util.*;

import static hangman.GamingMethods.*;
import static hangman.PrintError.*;

public class MainGame {
    static List<String> secretWord = new ArrayList<>();
    static List<Character> symbolsWord;
    static List<Character> openLetterWord = new ArrayList<>();
    static Set<Character> lettersError = new LinkedHashSet<>();

    public static void main(String[] args) {

        String inputContinue;
        do {
            secretWord = getSecretWord(secretWord);
            symbolsWord = changeWord(secretWord);
            openLetterWord = closeLetterInWord(openLetterWord, symbolsWord);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Меню:\n 1.Начать игру.\n 2.Выйти из игры.");
            System.out.println("Введите цифру для продолжения.");
            inputContinue = scanner.nextLine();

            switch (inputContinue) {
                case "1":
                    System.out.println("Приветствуем на игре Виселица!");
                    closeSecretWord(secretWord);
                    System.out.println(printStart());
                    do {
                        char letterPlayer;
                        System.out.println("Ведите букву.");
                        do {
                            letterPlayer = inputLetter();

                        } while (checkRepeatLetter(openLetterWord, lettersError, letterPlayer));
                        if (compareInputLetterPlayer(symbolsWord, letterPlayer)) {
                            openLetter(symbolsWord, openLetterWord, letterPlayer);
                            System.out.println("Слово: " + openLetterWord);
                            System.out.println("Количетсво ошибок: " + error + " " + lettersError);
                            System.out.println("Вы угадали букву: " + letterPlayer);
                            printMan();
                            if (compareWordWithOpenLetter(symbolsWord, openLetterWord)) {
                                System.out.println("Поздравляю! Вы отгадали слово: " + secretWord.toString() + " и выиграли!");
                            }
                        } else {
                            System.out.println("Слово: " + openLetterWord);
                            printHowManyError(lettersError, letterPlayer);
                            printMan();
                            if (error == 6) {
                                System.out.println("Вы не угадали слово: " + secretWord);
                                System.out.println();
                            }
                        }
                    } while (!(compareWordWithOpenLetter(symbolsWord, openLetterWord)) && error != 6);
                    break;
                case "2":
                    System.out.println("До встречи!");
                    break;
                default:
                    System.out.println("Вы ввели не существующую команду!");
            }
            secretWord.clear();
            symbolsWord.clear();
            openLetterWord.clear();
            lettersError.clear();
            error = 0;
        } while (!inputContinue.equals("2"));
    }
}
