//reverse sorted array
class Scratch {
    static void reverse(int[]arr){
        int low=0,high= arr.length-1;

        while(low<high){
            int temp=arr[low];
            arr[low] = arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4};
        reverse(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    }

