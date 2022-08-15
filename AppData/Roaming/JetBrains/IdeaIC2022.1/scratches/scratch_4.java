class Scratch {
    static boolean ank(int n){
        if((n & 1)!=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=1992;
        System.out.println(ank(n));

    }
}