import java.util.*;
//find number of digits in number.
class scratch_1 {
    public static void main(String[] args) {
        int count=0,n=123;
        while(n!=0) {
        n=n/10;
        count++;
        }
        System.out.println(count);
    }


    }
