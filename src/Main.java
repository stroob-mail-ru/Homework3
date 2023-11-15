public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");

        int i = 100_000;
        byte b = (byte) 1;
        short s = (short) 10_000;
        long l = 10_000_000_000L;
        float f = 0.175f;
        double d = 3.1415926535;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        System.out.println();
        System.out.println("Задача 2");

        float numberOne = 27.12f;
        long numberTwo = 987_678_965_549L;
        float numberThree = 2.786f;
        short numberFour = 569;
        short numberFive = -159;
        short numberSix = 27897;
        byte numberSeven = 67;
        System.out.println("Значение числа i с типом float равно " + numberOne);
        System.out.println("Значение числа 2 с типом long равно " + numberTwo);
        System.out.println("Значение числа 3 с типом float равно " + numberThree);
        System.out.println("Значение числа 4 с типом short равно " + numberFour);
        System.out.println("Значение числа 5 с типом short равно " + numberFive);
        System.out.println("Значение числа 6 с типом short равно " + numberSix);
        System.out.println("Значение числа 7 с типом byte равно " + numberSeven);

        System.out.println();
        System.out.println("Задача 3");

        byte teacherOneStudents = 23;
        byte teacherTwoStudents = 27;
        byte teacherThreeStudents = 30;
        byte studentsTotal = (byte) (teacherOneStudents + teacherTwoStudents + teacherThreeStudents);
        short sheetsTotal = 480;
        short sheetsToOneStudent = (short) (sheetsTotal / studentsTotal);
        System.out.println("На каждого ученика рассчитано " + sheetsToOneStudent + " листов бумаги");

        System.out.println();
        System.out.println("Задача 4");

        byte bottlesInTwoMinutes = 16;
        byte bottlesInOneMinutes = (byte) (bottlesInTwoMinutes / 2);
        int bottlesInTwentyMinutes = bottlesInOneMinutes * 20;
        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinutes + " штук бутылок");
        int bottlesInDay = bottlesInOneMinutes * 60 * 24;
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        int bottlesInThreeDay = bottlesInDay * 3;
        System.out.println("За три дня машина произвела " + bottlesInThreeDay + " штук бутылок");
        int bottlesInMonth = bottlesInDay * 30;
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок");

        System.out.println();
        System.out.println("Задача 5");

        byte cansTotal = 120;
        byte whiteCansToClass = 2;
        byte brownCansToClass = 4;
        byte cansToClass = (byte) (whiteCansToClass + brownCansToClass);
        byte classTotal = (byte) (cansTotal / cansToClass);
        byte whiteCansTotal = (byte) (whiteCansToClass * classTotal);
        byte brownCansTotal = (byte) (brownCansToClass * classTotal);
        System.out.println("В школе, где " + classTotal + " классов, нужно " + whiteCansTotal + " банок белой краски и " + brownCansTotal + " банок коричневой краски");

        System.out.println();
        System.out.println("Задача 6");

        byte banana = 5;
        byte bananaWeight = 80;
        int weightOfBananas = banana * bananaWeight;
        byte milk100ml = 2;
        byte milk100mlWeight = 105;
        int weightOfMilk100mls = milk100ml * milk100mlWeight;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int weightOfIceCreams = iceCream * iceCreamWeight;
        byte egg = 4;
        byte eggWeight = 70;
        int weightOfEggs = egg * eggWeight;

        int weightOfProductsInGrams = weightOfBananas + weightOfMilk100mls + weightOfIceCreams + weightOfEggs;
        System.out.println("Вес спортзавтрака " + weightOfProductsInGrams + " грамм");
        float weightOfProductsInKilograms = weightOfProductsInGrams / 1000f;
        System.out.println("Вес спортзавтрака " + weightOfProductsInKilograms + " килограмм");

        System.out.println();
        System.out.println("Задача 7");

        byte loseKilogramsTotal = 7;
        int loseGramsTotal = loseKilogramsTotal * 1000;
        int loseGramsPerDayMinimum = 250;
        int loseGramsPerDayMaximum = 500;

        int daysAtLossAtMinimum = loseGramsTotal / loseGramsPerDayMinimum;
        System.out.println(daysAtLossAtMinimum + " дней уйдет на похудение, если спортсмен будет терять по " + loseGramsPerDayMinimum + " грамм");
        int daysAtLossAtMaximum = loseGramsTotal / loseGramsPerDayMaximum;
        System.out.println(daysAtLossAtMaximum + " дней уйдет на похудение, если спортсмен будет терять по " + loseGramsPerDayMaximum + " грамм");
        float daysAtLossOnAverage = (float) (daysAtLossAtMaximum + daysAtLossAtMinimum) / 2;
        System.out.println("В среднем на походение уйдет " + daysAtLossOnAverage + " день");

        System.out.println();
        System.out.println("Задача 8");

        byte salaryIncreaseAfterThreeYearsOfWork = 10;
        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfKristina = 76230;

        float salaryOfMashaWillbecome = salaryOfMasha + (salaryOfMasha / 100f * salaryIncreaseAfterThreeYearsOfWork);
        float annualDifferenceInsalaryOfMasha = (salaryOfMashaWillbecome-salaryOfMasha) *12;
        System.out.println("Маша теперь получает " + salaryOfMashaWillbecome + " рублей. Годовой доход вырос на " + annualDifferenceInsalaryOfMasha + " рублей");

        float salaryOfDenisWillbecome = salaryOfDenis + (salaryOfDenis / 100f * salaryIncreaseAfterThreeYearsOfWork);
        float annualDifferenceInsalaryOfDenis = (salaryOfDenisWillbecome-salaryOfDenis) *12;
        System.out.println("Денис теперь получает " + salaryOfDenisWillbecome + " рублей. Годовой доход вырос на " + annualDifferenceInsalaryOfDenis + " рублей");

        float salaryOfKristinaWillbecome = salaryOfKristina + (salaryOfKristina / 100f * salaryIncreaseAfterThreeYearsOfWork);
        float annualDifferenceInsalaryOfKristina = (salaryOfKristinaWillbecome-salaryOfKristina) *12;
        System.out.println("Кристина теперь получает " + salaryOfKristinaWillbecome + " рублей. Годовой доход вырос на " + annualDifferenceInsalaryOfKristina + " рублей");

    }
}