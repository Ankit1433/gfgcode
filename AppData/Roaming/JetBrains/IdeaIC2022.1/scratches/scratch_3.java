import java.util.*;
//gcd of two numbers
class Scratch {
    public static void main(String[] args) {
        int a=51,b=15;

        System.out.println("hy");
        System.out.println(res(a,b));
    }
        static int res(int a,int b) {
            if (b == 0) {
                return a;
            } else {
                return res(b,a%b);
            }
        }



}