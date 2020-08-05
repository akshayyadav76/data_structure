

public class MergeSort {
    int[] array;
    int length;


    public static void main(String ak[]){
        int[] input =new int[]{48,36,52,19,21};
        MergeSort obj =new  MergeSort();
        obj.sort(input);
    }

    public void sort(int arr[]){
        this.array=arr;
        this.length = arr.length;
        int[]temparr = new int[length];
        divide(0,length-1);

    }

    public  void divide(int low,int high){
        if(low <high){
            int middle = low +(high-low)/2;

            // left side
            divide(low,middle);

            //right
            divide(middle+1,high);
            merge(low,middle,high);
        }
    }

    public  void merge(int low,int mid,int high){
        for(int i=low;i<=high;i++){

        }
    }
}
