//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


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
        byte lP = 23;
        byte fS = 27;
        byte eA = 30;
        short listA4 = 480;
        int student = lP + fS + eA;
        int listStudent = listA4 / student;
        System.out.println("На каждого ученика рассчитано " + listStudent + " листов бумаги ");
    }
}