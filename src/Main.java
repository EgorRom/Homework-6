public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа № 6");
        System.out.println("Задача № 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла "+ i);
        }
        System.out.println("Задача № 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задача № 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача № 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача № 5");
        for (int i = 1904; i <= 2096 ; i = i + 4) {
            System.out.println(i + " Год является високосным");
        }
        System.out.println("Задача № 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача № 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Зачача № 8");
        int total = 0;
        int savings = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц "+ i +", сумма накоплений равна " + total+" рублей!");
        }
        System.out.println("Задача № 9");
        int saving = 0;
        int salary = 29000;
        for (int i = 1; i <= 12; i++) {
            saving = saving + saving/100;
            saving = saving + salary;
            System.out.println("Месяц "+ i +", сумма накоплений равна " + saving+" рублей!");
        }
        System.out.println("Задача № 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * "+ i +  " = " + i*2);
        }










    }

}