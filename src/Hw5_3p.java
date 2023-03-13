public class Hw5_3p {
    public static void main(String[] args) {
        System.out.println("Задание 3.13");

        boolean a = true;
        boolean b = true;
        boolean result = !(a && b);
        boolean result1 = !a || b;
        boolean result2 = a || !b;

        boolean a1 = true;
        boolean b1 = false;
        boolean result3 = !(a1 && b1);
        boolean result4 = !a1 || b1;
        boolean result5 = a1 || !b1;

        boolean a2 = false;
        boolean b2 = false;
        boolean result6 = !(a2 && b2);
        boolean result7 = !a2 || b2;
        boolean result8 = a2 || !b2;

        boolean a3 = false;
        boolean b3 = true;
        boolean result9 = !(a3 && b3);
        boolean result10 = !a3 || b3;
        boolean result11 = a3 || !b3;

        System.out.println("А) " + result + " " + result3 + " " + result6 + " " + result9);
        System.out.println("Б) " + result1 + " " + result4 + " " + result7 + " " + result10);
        System.out.println("В) " + result2 + " " + result5 + " " + result8 + " " + result11);


        System.out.println("\nЗадание 3.14");

        boolean x = true;
        boolean y = true;
        boolean result12 = !(x || y);
        boolean result13 = !x && y;
        boolean result14 = x && !y;

        boolean x1 = true;
        boolean y1 = false;
        boolean result15 = !(x1 || y1);
        boolean result16 = !x1 && y1;
        boolean result17 = x1 && !y1;

        boolean x2 = false;
        boolean y2 = false;
        boolean result18 = !(x2 || y2);
        boolean result19 = !x2 && y2;
        boolean result20 = x2 && !y2;

        boolean x3 = false;
        boolean y3 = true;
        boolean result21 = !(x3 || y3);
        boolean result22 = !x3 && y3;
        boolean result23 = x3 && !y3;

        System.out.println("А) " + result12 + " " + result15 + " " + result18 + " " + result21);
        System.out.println("Б) " + result13 + " " + result16 + " " + result19 + " " + result22);
        System.out.println("В) " + result14 + " " + result17 + " " + result20 + " " + result23);

        System.out.println("\nЗадание 3.15");

        boolean a4 = true;
        boolean b4 = true;
        boolean result24 = !a4 || !b4;
        boolean result25 = a4 && (a4 || !b4);
        boolean result26 = (!a4 || b4) && b4;

        boolean a5 = true;
        boolean b5 = false;
        boolean result27 = !a5 || !b5;
        boolean result28 = a5 && (a5 || !b5);
        boolean result29 = (!a5 || b5) && b5;

        boolean a6 = false;
        boolean b6 = false;
        boolean result30 = !a6 || !b6;
        boolean result31 = a6 && (a6 || !b6);
        boolean result32 = (!a6 || b6) && b6;

        boolean a7 = false;
        boolean b7 = true;
        boolean result33 = !a7 || !b7;
        boolean result34 = a7 && (a7 || !b7);
        boolean result35 = (!a7 || b7) && b7;

        System.out.println("А) " + result24 + " " + result27 + " " + result30 + " " + result33);
        System.out.println("Б) " + result25 + " " + result28 + " " + result31 + " " + result34);
        System.out.println("В) " + result26 + " " + result29 + " " + result32 + " " + result35);
    }
}
