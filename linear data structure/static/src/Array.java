
public class Array {
     //  String myArray[] = new String[4]; // C style array declaration
    //  String[] myArray = new String[4]; // Java style array declaration

    /*can't declare error
     int arr[4];  //error
     int arr[] =new int[3]{2,3,4,8} //error
     int arr[] =new int[5]{2,3,4,8,5} //error you can't not mention size and values together
    */

    /*can be declare
     int arr[];
     int arr[] =new int[]{2,3,4,8};
     int arr[] ={2.4.8.6};
    */


     int[] myArray = new int[]{2,6,5,8};
      int arr[];


      void todod(){
          arr =new int[4];
          myArray[3] =20;
      }

    public static void main(String ak[]){
       int[] arr = new int[20];
       arr[4]=30;
        System.out.println(arr[4]);

    }
}
