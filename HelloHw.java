package j1.la.online;

public class HelloHw {
     /*
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
     где a, b, c, d – целочисленные входные параметры этого метода;
     */

    public static float math(int a, int b, int c, int d) {
        float result;
        result =  a * (b + (c / d));
        return result;

    }
    public static void main(String[] args) {
        float result = math(20, 10, 5, 3);
    }
/* Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от
 10 до 20(включительно), если да – вернуть true, в противном случае – false;
 */
    public static void tof(String[] args) {
        byte b = 5;
        byte a = 8;
        if (((a + b) <= 20) && ((a + b) > 10)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

    }

    /* Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное
         ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
         Результат работы метода вывести в консоль
         */
    public static void con(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    /* Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть
        приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
         */

    public static void main(String nameUser){
        System.out.println(nameUser("Антон"));
    }

    public  static String nameUser (String name) {
        return "привет, " + name;
    }

    /*Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме
     каждого 100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в
     консоль
     */
    public static void years(int year) {
        if ( (year %4 != 0) || (year % 400 !=0) && (year % 100 == 0 )) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }
    }

}