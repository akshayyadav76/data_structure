

public class LinearSearch {

    int arr[] = new int[]{44,55,22,54,86,90,23};
    int find = 54;

    private  void search (){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==find){
                System.out.println("find index"+i);
            }
        }
    }

    public static  void main(String ak[]){
        LinearSearch ojj =new LinearSearch();
        ojj.search();
    }
}
