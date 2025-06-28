public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int a = 1;
        byte b = 2;
        short c = -3;
        long d = 10000000;
        float e = 5.5f;
        double f = 50.505;
        System.out.println("Значение переменной a с типом int равно " + a + " ");
        System.out.println("Значение переменной b с типом byte равно " + b + " ");
        System.out.println("Значение переменной c с типом short равно " + c + " ");
        System.out.println("Значение переменной d с типом long равно " + d + " ");
        System.out.println("Значение переменной e с типом float равно " + e + " ");
        System.out.println("Значение переменной f с типом double равно " + f + " ");
        float g = 27.12f;
        System.out.println(g);
        long h = 987678965549L;
        System.out.println(h);
        float i = 2.786f;
        System.out.println(i);
        short j = 569;
        System.out.println(j);
        short k = -159;
        System.out.println(k);
        short l = 27897;
        System.out.println(l);
        byte m = 67;
        System.out.println(m);
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        int paper = 480/(lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
        byte p = 16/2;
        int pP = p*20;
        System.out.println("За 20 минут машина произвела " + pP + " штук бутылок");
        int pPr = p*60*24;
        System.out.println("За сутки машина произвела " + pPr + " штук бутылок");
        int pPrR = p*60*24*3;
        System.out.println("За 3 дня машина произвела " + pPrR + " штук бутылок");
        int pPr30 = p*60*24*30;
        System.out.println("За месяц машина произвела " + pPr30 + " штук бутылок");
        byte allClasses = 120/(2+4);
        int whiteBanks = allClasses*2;
        int brownBanks = allClasses*4;
        System.out.println("В школе, где " + allClasses + " классов, нужно " + whiteBanks + " банок белой краски и " + brownBanks + " банок коричневой краски");
        byte bananas = 80;
        byte milk = 105;
        byte iceCreame = 100;
        byte egg = 70;
        int breakfastGr = (bananas*5)+(milk*2)+(iceCreame*2)+(egg*4);
        System.out.println(breakfastGr);
        float breakfastKgr = breakfastGr/1000F;
        System.out.println(breakfastKgr);

        byte overWeight = 7;
        short minDay = 250;
        short maxDay = 500;
        int variant1 = (overWeight*1000)/minDay;
        System.out.println(variant1);
        int variant2 = (overWeight*1000)/maxDay;
        System.out.println(variant2);
        int variant3 = (variant1+variant2)/2;
        System.out.println(variant3);

        int salaryMasha1 = 67760;
        double salaryMasha2 = salaryMasha1*1.1;
        int yearSalaryMasha1 = salaryMasha1*12;
        double yearSalaryMasha2 = salaryMasha2*12;
        double incomeDifferenceMasha = yearSalaryMasha2-yearSalaryMasha1;
        System.out.println("Маша теперь получает " + salaryMasha2 + "рублей. Годовой доход вырос на " + incomeDifferenceMasha + " рублей");

        int salaryDenis1 = 83690;
        float salaryDenis2 = salaryDenis1*1.1f;
        int yearSalaryDenis1 = salaryDenis1*12;
        float yearSalaryDenis2 = salaryDenis2*12f;
        float incomeDifferenceDenis = yearSalaryDenis2 - yearSalaryDenis1;
        System.out.println("Денис теперь получает " + salaryDenis2 + "рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей");

        int salaryKristina1 = 76230;
        float salaryKristina2 = salaryKristina1 *1.1f;
        int yearSalaryKristina1 = salaryKristina1 *12;
        float yearSalaryKristina2 = salaryKristina2 *12f;
        float incomeDifferenceKristina = yearSalaryKristina2 - yearSalaryKristina1;
        System.out.println("Кристина теперь получает " + salaryKristina2 + "рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей");










    }
}