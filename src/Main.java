//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Задача №1");
        int i = 1000000000;
        byte b = 100;
        short s = 10000;
        long l = 0x18;
        float f = 1.88888888f;
        double d = 1.999999999d;
        System.out.println("i переменная int целочисленные =" + i );
        System.out.println("b переменная byte целочисленные =" + b );
        System.out.println("s переменная short целочисленные =" + s );
        System.out.println("l переменная long целочисленные =" + l );
        System.out.println("f переменная float с плавоющей точкой =" + f );
        System.out.println("d переменная double с плавоющей точкой =" + d );

        System.out.println("Задача №2");
        float cC = 27.12f;
        float cD = 2.786f;
        long m987 = 987_678_965_549L;
        short dD = 596;
        short gG = -159;
        short hH = 27897;
        short sS = 67;
        System.out.println(cC);
        System.out.println(cD);
        System.out.println(gG);
        System.out.println(hH);
        System.out.println("Задача №3");
        byte lP = 23;
        byte fS = 27;
        byte eA = 30;
        short listA4 = 480;
        int student = lP + fS + eA;
        int listStudent = listA4 / student;
        System.out.println("На каждого ученика рассчитано " + listStudent + " листов бумаги ");
        System.out.println("Задача №4");
        byte productionTwoMin = 16;
        byte min20 = 10;
        short oneDay = 720;
        int day3 = oneDay * 3;
        int mount = oneDay * 31;
        int production20Min = productionTwoMin * 10;
        int production1Day = productionTwoMin * 720;
        int production3Day = production1Day * 3;
        int production1Month = production1Day * 31;
        System.out.println("За 20 минут" + " машина произвела " + production20Min + " штук бутылок ");
        System.out.println("в сутки" + " машина произвела " + production1Day + " штук бутылок ");
        System.out.println("За 3 дня " + " машина произвела " + production3Day + " штук бутылок ");
        System.out.println("За 1 месяц" + " машина произвела " + production1Month + " штук бутылок ");
        System.out.println("Задача №5");
        byte reSchoolB = 120;
        byte wB = 2;
        byte rB = 4;
        byte oneCl = (byte) (wB + rB);
        byte vseCl = (byte) (reSchoolB / oneCl);
        int vse_wB = vseCl * wB;
        int vse_rB = vseCl * rB;
        System.out.println("В школе где " + vseCl + " классов, нужно " + vse_wB + " банок белой краски и " + vse_rB + " банок коричневой краски.");
        System.out.println("Задача №6");
        float banan = 0.080f;
        float milk100 = 0.105f;
        float plombir = 0.100f;
        float egg = 0.070f;
        float zavtrak = banan*5 + milk100*2 + plombir*2 + egg*4;
        int zavtrakKg = (int) (zavtrak * 1.000);
        System.out.println("вес завтрака = " + zavtrak + " в гр.; В кг. =" + zavtrakKg + " кг.");
        System.out.println("Задача №7");
        int exWeight = 7000;
        int lossWeight250 = 250;
        int lossWeinght500 = 500;
        int goodWeighnt1 = exWeight / lossWeight250;
        int goodWeighnt2 = exWeight / lossWeinght500;
        int goodWeighnt3 = (goodWeighnt1 + goodWeighnt2) / 2;
        System.out.println("если спортсмен теряет по 250гр. = " + goodWeighnt1 + "дней, если по 500гр. = " + goodWeighnt2 + "дней, а в случаее среднего значения = " + goodWeighnt3);
        System.out.println("Задача №8");
        int mashaCash = 67760;
        int denisCash = 83690;
        int kristinaCash = 76230;
        float bonus10 = 0.10f;
        float bonusMasha = mashaCash * bonus10;
        float bonusKristina = kristinaCash * bonus10;
        float bonusDenis = denisCash * bonus10;
        float newMashaCash = bonusMasha + mashaCash;
        float newDenisCash = bonusDenis + denisCash;
        float newKristinaCash = bonusKristina + kristinaCash;

        System.out.println("Маша получаут " + newMashaCash + " Годовой доход вырос =" + bonusMasha * 12);
        System.out.println("Денис получаут " + newDenisCash + " Годовой доход вырос =" + bonusDenis * 12);
        System.out.println("Маша получаут " + newKristinaCash + " Годовой доход вырос =" + bonusKristina * 12);

    }
}