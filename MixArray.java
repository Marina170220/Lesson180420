package kompjuterIya.Lesson180420;
//2. Дан массив. Перемешать его элементы случайным образом так,
// чтобы каждый элемент оказался на новом месте.

import java.util.Random;

public class MixArray {
    public static void main(String[] args) {
        int buffer;
        Random random = new Random();
        int[] arrayOfNumbers = {2, 18, 20, 36, 7, 9, 15, 8, 3, 21, 4};

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int randomIndex = random.nextInt(arrayOfNumbers.length);
            buffer = arrayOfNumbers[randomIndex];
            arrayOfNumbers[randomIndex] = arrayOfNumbers[i];
            arrayOfNumbers[i] = buffer;
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}
