class Scratch {
    static int largest(int arr[]){
        int res=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[res]) {
                    res = i;
                }
        }
        return res;
    }
    static int secondlargest(int[]arr){
        int largest=largest(arr);
        int res=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1){
                    return res=i;
                }
                else{
                    if(arr[i]>arr[res]){
                        res=i;
                    }
                }

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,6,4,2,87};
        System.out.println(secondlargest(arr));
        
    }
}