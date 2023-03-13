public class Hw5_1p {
    public static void main(String[] args) {
        System.out.println("Задание 3.2");
        boolean z = false;
        boolean x = true;
        boolean y = false;

        boolean result1 = x || z;
        boolean result2 = x && y;
        boolean result3 = x && z;

        System.out.println("x = " + x + " " + "y = " + y + " " + "z = " + z);
        System.out.println("\nа) x || z = " + result1 + "\nб) x && y = " + result2 + "\nв) x && z = " + result3);


        System.out.println("\nЗадание 3.3");

        boolean a = true;
        boolean b = false;
        boolean c = false;

        boolean result4 = !a && b;
        boolean result5 = a || !b;
        boolean result6 = a && b || c;

        System.out.println("a = " + a + " " + "b = " + b + " " + "c = " + c + " ");
        System.out.println("\nа) !a && b = " + result4 + "\nб) a || !b = " + result5 + "\nв) аa && b || c = " + result6);

        System.out.println("\nЗадание 3.4");

        boolean x1 = true;
        boolean y1 = true;
        boolean z1 = false;

        boolean result7 = !x1 && y1;
        boolean result8 = x1 || !y1;
        boolean result9 = x || y && z;

        System.out.println("x = " + x1 + " " + "y = " + y1 + " " + "z = " + z1);
        System.out.println("\nа) !x && y = " + result7 + "\nб) x || !y = " + result8 + "\nв) x || y && z = " + result9);

        System.out.println("\nЗадание 3.5");

        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = false;

        boolean result10 = a1 || b && !c;
        boolean result11 = !a1 && !b1;
        boolean result12 = !(a1 && c1) || b1;
        boolean result13 = a1 && !b1 || c1;
        boolean result14 = a1 && (!b1 || c1);
        boolean result15 = a1 || (!(b1 && c1));

        System.out.println("a = " + a1 + " " + "b = " + b1 + " " + "c = " + c1 + " ");
        System.out.println("\nа) a || b && !c = " + result10 + "\nб) !a && !b = " + result11 + "\nв) !(a && c) || b =" + result12 + "\nг) a && b || c = " + result13 + "\nд) a && (!b || c ) = " + result14 + "\nе) a || (!(b && c)) = " + result15);

        System.out.println("\nЗадание 3.6");

        boolean x2 = false;
        boolean y2 = false;
        boolean z2 = true;

        boolean result16 = x2 || y2 && !z2;
        boolean result17 = !z2 && !y2;
        boolean result18 = !(x2 && y2) || y2;
        boolean result19 = x2 && !y2 || z2;
        boolean result20 = x2 && (!y2 || z2);
        boolean result21 = x2 || (!(y2 || z2));

        System.out.println("x = " + x2 + " " + "y = " + y2 + " " + "z = " + z2 + " ");
        System.out.println("\nа) x || y && !z =" + result16 + "\nб) !z && !y = " + result17 + "\nв) !(x && y) || y = " + result18 + "\nг) z && !y || z = " + result19 + "\nд) x && (!y || z) = " + result20 + "\nе) x || (!(y || z)) = " + result21);

        System.out.println("\nЗадание 3.7");

        boolean a2 = true;
        boolean b2 = false;
        boolean c2 = false;

        boolean result22 = a2 || !(a2 && b2) || c2;
        boolean result23 = !a2 || a2 && (b2 || c2);
        boolean result24 = (a2 || b2 && !c2) && c2;

        System.out.println("a = " + a2 + " " + "b = " + b2 + " " + "c = " + c2);
        System.out.println("\nа) a || !(a && b) || c = " + result22 + "\nб) a || a && (b || c) = " + result23 + "\nв) (a || b && !c) && c = " + result24);

        System.out.println("\nЗадание 3.8");

        boolean x3 = false;
        boolean y3 = true;
        boolean z3 = false;

        boolean result25 = x3 && !(z3 || y3) || !z3;
        boolean result26 = !x3 || x3 && (y3 || z3);
        boolean result27 = (x3 || y3 && !z3) && z3;

        System.out.println("z = " + z3 + " " + "y = " + y3 + " " + "z = " + z3);
        System.out.println("\nа) x && !(z || y) || !z = " + result25 + "\nб) !x || x && (y || z) = " + result26 + "\nв) (x || y && !z) && z = " + result27);

        System.out.println("\nЗадание 3.9");

        boolean x4 = true;
        boolean y4 = false;
        boolean z4 = false;

        boolean result28 = !x4 || !y4 || !z4;
        boolean result29 = (!x4 || !y4) && (x4 || y4);
        boolean result30 = x4 && y4 || x4 && z4 || !z4;

        System.out.println("z = " + z4 + " " + "y = " + y4 + " " + "z = " + z4);
        System.out.println("\nа) !x || !y || !z = " + result28 + "\nб) (!x || !y) && (x || y) = " + result29 + "\nв) x && y || x && z || !z = " + result30);

        System.out.println("\nЗадание 3.10");

        boolean a3 = false;
        boolean b3 = false;
        boolean c3 = true;

        boolean result31 = (!a3 || !b3) && !c3;
        boolean result32 = (!a3 || !b3) && (a3 || b3 );
        boolean result33 = a3 && b3 || a3 && c3 || !c3;

        System.out.println("a = " + a3 + " " + "b = " + b3 + " " + "c = " + c3);
        System.out.println("\nа) (!a || !b) && !c = " + result31 + "\nб) (!a || !b) && (a || b ) = " + result32 + "\nв) a && b || a && c || !c = " + result33);
    }
}
