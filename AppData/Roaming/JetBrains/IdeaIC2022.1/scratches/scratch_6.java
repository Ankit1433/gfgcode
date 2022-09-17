import java.util.*;

class Scratch {
   /* static int large(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }
        }
        return -1;
    }*/

    static int  largest(int[]arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,20,40,7,1,80};
        //System.out.println(large(arr));
        System.out.println(largest(arr));





    }

}


