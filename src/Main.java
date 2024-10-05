public class Main {
    public static void main(String[] args) {
        // Задание 1
        int a = 5;
        byte b = 127;
        short c = 30000;
        long d = 500000L;
        float e = 1.5f;
        double f = 1.56;
        System.out.println("1. Значение переменной с типом integer равно " + a);
        System.out.println("Значение переменной с типом byte равно " + b);
        System.out.println("Значение переменной с типом short равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);
        // Задание 2
        float g = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        // Задание 3
        byte studentsNum1 = 23;
        byte studentsNum2 = 27;
        byte studentsNum3 = 30;
        int studentsTotalNum = studentsNum1 + studentsNum2 + studentsNum3;
        short paperNum = 480;
        int paperPerStudent = paperNum / studentsTotalNum;
        System.out.println("3. На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        // Задание 4
        byte bottles = 16;
        byte time1 = 2;
        int efficiency = bottles / time1;
        byte time2 = 20;
        int bottleAmount1 = efficiency * time2;
        System.out.println("4. За 20 минут машина произвела " + bottleAmount1 + " штук бутылок");
        byte hoursInDay = 24;
        short minutesInHours = 60;
        int time3 = hoursInDay * minutesInHours;
        int bottleAmount2 = efficiency * time3;
        System.out.println("За сутки машина произвела " + bottleAmount2 + " штук бутылок");
        int time4 = time3 * 3;
        int bottleAmount3 = efficiency * time4;
        System.out.println("За 3 суток машина произвела " + bottleAmount3 + " штук бутылок");
        int time5 = time3 * 30;
        int bottleAmount4 = efficiency * time5;
        System.out.println("За месяц машина произвела " + bottleAmount4 + " штук бутылок");
        // Задание 5
        byte whitePaintPerRoom = 2;
        byte brownPaintPerRoom = 4;
        int totalPaintPerRoom = whitePaintPerRoom+brownPaintPerRoom;
        byte paintNeededForSchool = 120;
        int rooms = paintNeededForSchool /totalPaintPerRoom;
        int whitePaintNeeded = rooms *whitePaintPerRoom;
        int brownPaintNeeded = rooms *brownPaintPerRoom;
        System.out.println("5. В школе,где " + rooms + " классов,нужно " + whitePaintNeeded + " банок красок " +
                "и " + brownPaintNeeded + " банок коричневой краски ");
        // Задание 6
        byte bananasAmount = 5;
        byte bananaWeight = 80;
        short milkVolume = 200;
        float densityOfMilk = 105/100f;
        float milkWeight = densityOfMilk*milkVolume;
        byte iceCreamAmount = 2;
        byte iceCreamWeight = 100;
        byte eggsAmount = 4;
        byte eggWeight = 70;
        float totalWeight = bananasAmount*bananaWeight+milkWeight+iceCreamAmount*iceCreamWeight+eggsAmount*eggWeight;
        float totalWeightKg=totalWeight/1000;
        System.out.println("6. Масса спортзавтрака " + totalWeight + " гр " + " ( " + totalWeightKg + " кг )");
        byte weightGoalKg = 7;
        // Задание 7
        int weightGoalGr = 7*1000;
        float weightLossPerDay1 = 250f;
        float weightLossPerDay2 = 500f;
        float daysNeededForPlan1 = weightGoalGr / weightLossPerDay1;
        float daysNeededForPlan2 = weightGoalGr / weightLossPerDay2;
        float weightLossPerDayOnAverage = (weightLossPerDay1+weightLossPerDay2)/2;
        float daysNeededOnAverage = (weightGoalGr/weightLossPerDayOnAverage);
        float daysNeededOnAverageR = (int) Math.ceil(daysNeededOnAverage);
        System.out.println("7. При потере 500 гр в день для достижения плана необходимо " + (int) daysNeededForPlan1 +
                " дней; при потере 250 гр в день для достижения плана необходимо " + (int) daysNeededForPlan2 +
                " дней; в среднем для достижения плана потребуется " + (int) daysNeededOnAverageR + " день");
        // Задание 8
        int mashaSalaryPerMonth = 67760;
        int denisSalaryPerMonth = 83690;
        int christinaSalaryPerMonth = 76230;
        float mashaSalaryPerMonthRaise = mashaSalaryPerMonth * 1.1f;
        float denisSalaryPerMonthRaise = denisSalaryPerMonth * 1.1f;
        float christinaSalaryPerMonthRaise = christinaSalaryPerMonth * 1.1f;
        int mashaSalaryPerYear = mashaSalaryPerMonth *12;
        int denisSalaryPerYear = denisSalaryPerMonth *12;
        int christinaSalaryPerYear = christinaSalaryPerMonth *12;
        float mashaSalaryPerYearRaise = mashaSalaryPerMonthRaise *12;
        float denisSalaryPerYearRaise = denisSalaryPerMonthRaise *12;
        float christinaSalaryPerYearRaise = christinaSalaryPerMonthRaise *12;
        float mashaSalaryPerYearDif = mashaSalaryPerYearRaise - mashaSalaryPerYear;
        float denisSalaryPerYearDif = denisSalaryPerYearRaise - denisSalaryPerYear;
        float christinaSalaryPerYearDif = christinaSalaryPerYearRaise - christinaSalaryPerYear;
        System.out.println("8. Маша теперь получает " + (int) mashaSalaryPerYearRaise + " рублей в год. " +
                "Годовой доход вырос на " + (int) mashaSalaryPerYearDif + " рублей.");
        System.out.println("Денис теперь получает " + (int) denisSalaryPerYearRaise + " рублей в год. " +
                "Годовой доход вырос на " + (int) denisSalaryPerYearDif + " рублей.");
        System.out.println("Кристина теперь получает " + (int) christinaSalaryPerYearRaise + " рублей в год. " +
                "Годовой доход вырос на " + (int) christinaSalaryPerYearDif + " рублей.");
    }
}