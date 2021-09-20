package ex01;
import java.lang.Math;

public class sqrt {

    public static double racine(int x) {
        double y;
        double sqrtroot = x / 2;
        do {
            y = sqrtroot;
            sqrtroot = (y + (x / y)) / 2;
        } while ((y - sqrtroot) != 0);
        return sqrtroot;
    }

    public static void main(String[] args) {
        System.out.println(Math.floor(racine(9)));
    }
}
