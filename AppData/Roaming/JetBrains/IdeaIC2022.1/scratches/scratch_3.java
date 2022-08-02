class Scratch {
    public static void main(String[] args) {
        int n=71;
        if(n==1) {
            System.out.println(false);

        }
        if (n%2==0 || n%3==0){
            System.out.println(false);
        }

        for (int i =5;i*i<n;i++){
            if(n%i==0){
                System.out.println("ki"+false);
            }
        }
        System.out.println(true);

    }
}