

public class InsertionSort {

    int[] arr = new int[]{64, 34, 25, 12, 22, 11, 90};

    void sort(){
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }


        System.out.println("array");
        for(int i=0;i<arr.length;++i){

            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String ak[]){
        InsertionSort obj = new InsertionSort();
        obj.sort();
    }
}
