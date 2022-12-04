public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача №1");
        int firstVariable = 2147483640;
        System.out.println(firstVariable);
        byte secondVariable = 120;
        System.out.println(secondVariable);
        short thirdVariable = 32760;
        System.out.println(thirdVariable);
        long fourthVariable = 922372036;
        System.out.println(fourthVariable);
        float fifthVariable = 1.44f;
        System.out.println(fifthVariable);
        double sixthVariable = 1.5E+308;
        System.out.println(sixthVariable);
    }

    public static void task2() {
        System.out.println("Задача №2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }

    public static void task3() {
        System.out.println("Задача №3");
        byte studentsOfLyudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        short totalNumberOfSheets = 480;
        int totalStudents = studentsOfLyudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;
        int sheetsForEach = totalNumberOfSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача №4");
        byte machinePerformance = 16 / 2;
        byte firstTime = 20;
        int performanceFirstTime = machinePerformance * firstTime;
        System.out.println("За " + firstTime + " минут машина произвела " + performanceFirstTime + " штук бутылок.");
        short secondTime = 1440;
        int performanceSecondTime = machinePerformance * secondTime;
        System.out.println("За сутки машина произвела " + performanceSecondTime + " штук бутылок.");
        int thirdTime = secondTime * 3;
        int performanceThirdTime = machinePerformance * thirdTime;
        System.out.println("За трое суток машина произвела " + performanceThirdTime + " штук бутылок.");
        int fourthTime = secondTime * 31;
        int performanceFourthTime = machinePerformance * fourthTime;
        System.out.println("За месяц машина произвела " + performanceFourthTime + " штук бутылок.");
    }
    public static void  task5() {
        System.out.println("Задача №5");
        byte wholeCansOfPaint = 120;
        byte brownForOneClasses = 4;
        byte whiteForOneClasses = 2;
        int paintForOneClass = brownForOneClasses + whiteForOneClasses;
        int totalNumberOfClasses = wholeCansOfPaint / paintForOneClass;
        int allBrownPaint = totalNumberOfClasses * brownForOneClasses;
        int allWhitePaint = totalNumberOfClasses * whiteForOneClasses;
        System.out.println("В школе, где " + totalNumberOfClasses + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски.");
        }

    public static void  task6() {
        System.out.println("Задача №6");

        byte bananaWeight = 80;
        byte numberOfBananas = 5;
        int totalWeightOfBananas = bananaWeight * numberOfBananas;
        byte milkWeight = 105;
        byte numberOfMilk = 2;
        int totalWeightOfMilk = milkWeight * numberOfMilk;
        byte iceCreamWeight = 100;
        byte numberOfIceCream = 2;
        int totalWeightOfIceCream = iceCreamWeight * numberOfIceCream;
        byte eggWeight = 70;
        byte numberOfEgg = 4;
        int totalWeightOfEgg = eggWeight * numberOfEgg;

        float totalBreakfastWeight = totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream + totalWeightOfEgg;
        System.out.println("Вес такого завтрака " + totalBreakfastWeight + " грамм." );
        int grPerKg = 1000;
        float totalWeightKg  = totalBreakfastWeight / grPerKg;
        System.out.println("В килограммах это " + totalWeightKg + ".");
    }

    public static void task7() {
        System.out.println("Задача №7");
        short desiredWeight = 7000;
        short lostWeightInDay = 250;
        int numberOfDays = desiredWeight / lostWeightInDay;
        System.out.println("Если спортсмен тераяет " + lostWeightInDay + " грамм, то ему понадобится " + numberOfDays + " дней. ");
        short lostWeightInDay2 = 500;
        int numberOfDays2 = desiredWeight / lostWeightInDay2;
        System.out.println("Если спортсмен тераяет " + lostWeightInDay2 + " грамм, то ему понадобится " + numberOfDays2 + " дней. ");
        int sumDays = numberOfDays + numberOfDays2;
        int averageNumberOfDays = sumDays / 2;
        System.out.println("Среднее количество дней для похудения " + averageNumberOfDays + " день. ");
    }

    public static void task8() {
        System.out.println("Задача №8");
        byte year = 12;
        byte percent = 10; // Зарплата увеличивается на 10%

        int salaryMasha = 67760;
        int yearSalaryM = salaryMasha * year;
        int differenceM = salaryMasha / percent;
        int newSalaryMasha = salaryMasha + differenceM;
        int newYearSalaryM = newSalaryMasha * year;
        int differencePerYearM = newYearSalaryM - yearSalaryM;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differencePerYearM + " рублей. ");

        int salaryDenis = 83690;
        int yearSalaryD = salaryDenis * year;
        int differenceD = salaryDenis / percent;
        int newSalaryDenis = salaryDenis + differenceD;
        int newYearSalaryD = newSalaryDenis * year;
        int differencePerYearD = newYearSalaryD - yearSalaryD;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differencePerYearD  + " рублей. ");

        int salaryKristina = 76230;
        int yearSalaryK = salaryKristina * year;
        int differenceK = salaryKristina / percent;
        int newSalaryKristina = salaryKristina + differenceK;
        int newYearSalaryK = newSalaryKristina * year;
        int differencePerYearK = newYearSalaryK - yearSalaryK;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differencePerYearK  + " рублей. ");
    }
}



