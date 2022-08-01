// to find trailing zeros
class Scratch {
    public static void main(String[] args) {

        int digits=0;
      for(int i=5;i<=251;i=i*5){
          digits+=251/i;
      }
        System.out.println(digits);
   }

}