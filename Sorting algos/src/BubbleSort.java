
class BubbleSort{

    int[] array = new int[]{64, 34, 25, 12, 22, 11, 90};
                          //{34,64,25,12,22,11,90}
                          //{34,25,64,12,22,11,90}
                          //{34,25,15,64,22,11,90}
                          //{34,25,15,22,64,11,90}
                          //{34,25,15,22,11,64,90}
                          //etc......
    void sort(){
        int n = array.length;
        for(int i=0;i<n -1;++i){
            for(int k=0;k<n-i-1;++k){
                if(array[k]>array[k+1]){
                    System.out.println("dd"+array[k]);
                    int temp = array[k];
                    array[k] = array[k+1];
                    array[k+1]=temp;
                }
            }
        }
        System.out.println("array");
        for(int i=0;i<array.length;++i){

            System.out.print(array[i]+" ");
        }
    }

 public static void main(String ak[]){
        BubbleSort obj = new BubbleSort();
        obj.sort();
 }
}