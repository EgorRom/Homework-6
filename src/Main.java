public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int total = 0;
        int month = 0;
        while (total <= 2459000){
            total =total + 15000;
            month++;
            System.out.println("Месяц "+ month +", сумма накоплений равна " + total+" рублей!");
        }
        System.out.println("Задача №2" );
        int namber = 1;
        while (namber <= 10) {
        System.out.print (" "+ namber );
        namber++;
        }
        System.out.println();
        System.out.println("обратный счёт:");
        int i = 10;
        for (; i>=1; i--){
            System.out.print(" " +i);
        }
        System.out.println();
        System.out.println("Задача №3");
        int countryY = 12_000_000;
        int birthRate = (countryY/1000)*17;
        int mortality = (countryY/1000)*8;
        for (int y = 1; y<=10; y++){
            countryY = countryY+birthRate-mortality;
            System.out.println("Год "+ y + " численность населения составляет " + countryY);
        }
        System.out.println("Задача №4");
        int months = 0;
        for (int totals = 15000;totals<=12_000_000; totals =totals+ (totals/100)*7){
            months++;
            System.out.println("В "+ months+ " месяц сумма накоплений составит "+ totals+ " рублей");
        }
        System.out.println("Задача №5" );
        int time = 0;
        int totals = 15000;
        for (;totals<=12_000_000; totals =totals+ (totals/100)*7){
            time++;
            if (time % 6 == 0)
            System.out.println("На "+ time+ " месяц сумма накоплений составит "+ totals+ " рублей");
        }
        System.out.println("Задача №6");
        int times = 0;
        int money = 15000;
        for(;times<=12*9;money =money+ (money/100)*7){
            times++;
            if (times % 6 == 0 )
                System.out.println("На "+ times+ " месяц сумма накоплений составит рублей " +money);

        }
        System.out.println("Задача №7");
        int friday = 4;
        for (;friday<=31; friday=friday+7){
            System.out.println("Сегодня пятница, "+friday+ "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача №8");
        int year = 2023;
        for(int cycle = 0;cycle<= year+100; cycle=cycle+79){
            if (cycle>= year-200)
                System.out.println(cycle);

        }
















    }










    }

