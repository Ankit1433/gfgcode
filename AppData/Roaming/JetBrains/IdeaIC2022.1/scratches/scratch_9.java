//remove duplicates from sorted array
class Scratch {
    public static void main(String[] args) {
        int res=1;
        int arr[]={10,20,20,30,30,30};
        for(int i=1;i< arr.length;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }

        }
        System.out.println(res);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}