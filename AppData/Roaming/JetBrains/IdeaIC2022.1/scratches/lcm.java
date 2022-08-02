class lcm {


    static  int gcd(int a,int b){
        if(a==0){
            return b;
        }

        return gcd(b%a,a);


    }
    public static void main(String[] args) {
        System.out.println("hy");
        int a=10,b=15;
        System.out.println(gcd(a,b));
        int lcm1=(a*b)/gcd(a,b);
        System.out.println(lcm1);

    }
}