//check palindrome number.
class scratch_1 {
    static boolean ispalindrome(int n){
        int a=0,b=n;
        while (b!=0){
           int  temp=b%10;
            a=a*10+temp;
            b=b/10;
        }
        return (a==n);
    }

    public static void main(String[] args) {
        int n=121;
    if(ispalindrome(n)==true){
        System.out.println("yes it is a palindrome number.");

    }
    else {
        System.out.println("not a palindrome.");
    }
    }

        }