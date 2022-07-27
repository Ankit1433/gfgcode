import java.util.*;
//find number of digits in number.
class scratch_1 {
    static int recursive(int n){
        if(n==0){
            return 0;
        }
        return 1+recursive(n/10);
    }
    public static void main(String[] args) {
        int count=0,n=123;

        System.out.println(recursive(n));
        while(n!=0) {
        n=n/10;
        count++;
        }
        System.out.println(count);
    }


    }
