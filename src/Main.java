public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        { int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            month++;
            System.out.println(" месяц " + month + " сумма накоплений равна " + total + " рублей");}

        }
        System.out.println("задача № 2");
        {
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        {
            int i = 11;
            while (i > 1) {
                i--;
                System.out.print(+i + " ");
            }
        }
        System.out.println("");
        { System.out.println("задача № 3");


        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 1;
        int populationPerYear = fertility - mortality;
        for (; year <= 10; year++) {
            population = population + population / 1000 * populationPerYear;
            System.out.println(" Год " + year + " численность населения составляет " + population);
        }
        }
        System.out.println("задача № 4");

        { double contribution = 15000;
        double percent = 1.07;
        int i= 0;
        for (i=1; contribution <= 120000; i++){
            contribution = contribution*percent;

            System.out.println(" месяц " + i + " сумма накоплений равна " + contribution + " рублей");
        }
    }
        System.out.println("задача № 5");
      {
            double contribution = 15000;
            double percent = 1.07;
            int i = 0;
            for (i = 1; contribution <= 120000; i++) {
                contribution = contribution * percent;
                if (i % 6 == 0) {

                    System.out.println(" месяц " + i + " сумма накоплений равна " + contribution + " рублей");
                }
            }
        }
                System.out.println("задача № 6");
                {
                    double contribution = 15000;
                    double percent = 1.07;
                    int i = 0;

                    for (i = 1; i <=108; i++) {
                        contribution = contribution * percent;
                        if ( i% 6 ==0 ) {

                System.out.println(" месяц " + i + " сумма накоплений равна " + contribution + " рублей");
           }
           }
         }
        System.out.println("задача № 7");
        {
            int i = 3;
        int month =31;
        for (; i< 31; i+=7)
            System.out.println( "Сегодня пятница,"+i+ "-е число. Необходимо подготовить отчет");
        }
        System.out.println("задача № 8");
        {
            int year = 0;
            int ourYear = 2022;
            int beforeOurYear = ourYear - 200;
            int afterOurYear = ourYear + 100;
            while (year <= afterOurYear) {
                year += 79;
                if( year>= beforeOurYear && year <= afterOurYear)
                System.out.println(year);
            }
        }
        System.out.println("задача № 9");
        int y =1;
        for (; y<=10; y++ ){
                System.out.println(  y + "* 2 = " + 2*y);

        }





    }
}