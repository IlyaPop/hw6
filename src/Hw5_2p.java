public class Hw5_2p {
    public static void main(String[] args) {
        System.out.println("Задание 3.11");

        int x = 1;
        int y = -1;

        boolean result = x * x + y * y <= 4;
        System.out.println("а) " + result);


        int x1 = 1;
        int y1 = 2;

        boolean result1 = (x >= 0) || (y * y != 4);
        System.out.println("б) " + result1);


        int x2 = 1;
        int y2 = 2;

        boolean result2 = (x2 >= 0) && (y2 * y2 != 4);
        System.out.println("в) " + result2);

        int x3 = 2;
        int y3 = 1;

        boolean result3 = (x3 * y3 != 0) && (y3 > x3);
        System.out.println("г) " + result3);


        int x4 = 2;
        int y4 = 1;

        boolean result4 = (x4 * y4 != 0) || (y4 < x4);
        System.out.println("д) " + result4);


        int x5 = 2;
        int y5 = 1;

        boolean result5 = (!(x5 * y5 < 0)) && (y5 > x5);
        System.out.println("е) " + result5);


        int x6 = 1;
        int y6 = 2;

        boolean result6 = (!(x6 * y6 < 0)) || (y6 > x6);
        System.out.println("ж) " + result6);

        System.out.println("\nЗадание  3.12");

        int x7 = 1;
        int y7 = -1;

        boolean result7 = x7 * x7 - y7 * y7 <= 0;
        System.out.println("а) " + result7);

        int x8 = 2;
        int y8 = -2;

        boolean result8 = (x8 >= 2) || (y8 * y8 != 4);
        System.out.println("б) " + result8);

        int x9 = 2;
        int y9 = 2;

        boolean result9 = (x9 >= 0) && (y9 * y9 > 4);
        System.out.println("в) " + result9);

        int x10 = 1;
        int y10 = 2;

        boolean result10 = (x10 * y10 != 4) && (y10 > x10);
        System.out.println("г) " + result10);

        int x11 = 2;
        int y11 = 1;


        boolean result11 = (x11 * y11 != 0 || (y11 < x11));
        System.out.println("д) " + result11);

        int x12 = 1;
        int y12 = 2;

        boolean result12 = (!(x12 * y12 < 1)) && (y12 > x12);
        System.out.println("е) " + result12);

        int x13 = 2;
        int y13 = 1;

        boolean result13 = (!(x13 * y13 < 0)) || (y13 > x13);
        System.out.println("ж) " + result13);
    }
}
