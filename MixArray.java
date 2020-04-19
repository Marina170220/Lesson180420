package kompjuterIya.Lesson180420;
//2. Дан массив. Перемешать его элементы случайным образом так,
// чтобы каждый элемент оказался на новом месте.

import java.util.Random;

public class MixArray {
    public static void main(String[] args) {
        int buffer;
        Random random = new Random();
        int[] arrayOfNumbers = {2, 18, 20, 36, 7, 9, 15, 8, 3, 21, 4};
        int randomIndex = random.nextInt(arrayOfNumbers.length);
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers.length; j++) {
                if (i != j) {
                    buffer = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[randomIndex];
                    arrayOfNumbers[randomIndex] = buffer;
                }
            }
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}
