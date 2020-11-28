import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        for (long num = 1; num <= 999999; num++) {

            if ((Math.sqrt(num-1) % 1 == 0) && (Math.cbrt(num+1) % 1 == 0)) {
                System.out.println(num);
            }
        }
    }
}
