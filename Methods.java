package kompjuterIya.Lesson180420;

//Задача 3. На методы. Можно и без них, но труднее
//Пользователь вводит формулу вида max(a,b) или min(a,b), где a,b - целые числа или аналогичные выражения min(),max().
//Найти значение выражения. Примеры: max(1,5) = 5, max(4,min(3,6)) = 4, min(max(1,max(5,3)),min(9,0)) = 0

public class Methods {
    public static int max(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static void main(String[] args) {
        int result;
        result = max(50, 10);
        System.out.println(result);
        System.out.println(min(741, 3));
        System.out.println(min(14, max(8, 7)));
        System.out.println(max(min(7, 20), max(38, 15)));
        System.out.println(max(10, min(min(41, 50), max(40, 98))));
    }
}
