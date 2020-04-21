package kompjuterIya.Lesson180420;

//Задача 2. Файл "Ford"
//Дано предложение. Заменить группы пробелов одиночными, крайние пробелы удалить.
//Все слова перевести в нижний регистр, первые буквы сделать заглавными.

import java.io.*;

public class Ford {
    public static void main(String[] args) {
        int r;
        StringBuilder textFromFile = new StringBuilder();
        StringBuilder firstLettersToUpperCase = new StringBuilder();

        File ford = new File("C:\\Users\\Марина\\Java\\Lesson180420\\Ford.txt");
        if (ford.exists() && ford.canRead()) {
            try {
                FileReader readFord = new FileReader(ford);
                while ((r = readFord.read()) != -1) {
                    textFromFile.append((char) r);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(textFromFile);
            String newText = textFromFile.toString().replace("   ", " ");
            newText = newText.trim();
            newText = newText.toLowerCase();

            System.out.println(newText);
            char[] firstLettersToUpperCaseBuffer = newText.toCharArray();
            firstLettersToUpperCaseBuffer[0] = Character.toUpperCase(firstLettersToUpperCaseBuffer[0]);
            for (int i = 0; i < firstLettersToUpperCaseBuffer.length - 1; i++) {
                if (firstLettersToUpperCaseBuffer[i] == ' ' || firstLettersToUpperCaseBuffer[i] == '"') {
                    firstLettersToUpperCaseBuffer[i + 1] = Character.toUpperCase(firstLettersToUpperCaseBuffer[i + 1]);
                }
                firstLettersToUpperCase.append(firstLettersToUpperCaseBuffer[i]);
            }
        }
        System.out.println(firstLettersToUpperCase);
    }
}



