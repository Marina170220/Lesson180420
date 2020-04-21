package kompjuterIya.Lesson180420;

//1.Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать.
//После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
//В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;
        int amountOfAttempts = 1;
        int usersNumber;
        int randomNumber;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Давай поиграем) Я загадаю число от 0 до " + n + " , а ты попробуй отгадать с " + k + " попыток");
        randomNumber = random.nextInt(n);
        System.out.println("введи своё число");
        usersNumber = scanner.nextInt();

        while (k != 1) {
            if (usersNumber != randomNumber) {
                if (usersNumber < randomNumber) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
                k--;
                amountOfAttempts++;
                System.out.println("Попробуй ещё раз");
                usersNumber = scanner.nextInt();

            } else {
                System.out.println("Поздравляю, ты угадал!");
                k = 1;
            }
        }
        System.out.println(amountOfAttempts);
        if (amountOfAttempts == 5) {
            System.out.println("Попытки закончились");
        }
    }
}

