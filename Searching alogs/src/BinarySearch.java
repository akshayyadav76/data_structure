
public class BinarySearch {

    int[] binaryArray = new int[]{2,4,6,8,9,10,13,17};
    int find = 13;

    void search(){

        int start =0;
        int end = binaryArray.length -1;
        int half = end /2;
        if(find <= binaryArray[half]){
            for(int i=0;i< half;i++){
                if(binaryArray[i]==find){
                    System.out.println("value index is "+ i);
                }
            }
        }else {
            for(int i=half;i< end;i++){
                if(binaryArray[i]==find){
                    System.out.println("value index is "+ i);
                }
            }

        }
    }

    public static  void main(String ak[]){
        BinarySearch obj = new BinarySearch();
        obj.search();



    }
}
