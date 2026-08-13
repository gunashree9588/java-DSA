import java.util.Arrays;
public class Arrayoperations{        // Insertion
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;

        int size = 4;
        int position = 2;
        int value = 250;
        for( int i=size; i>position;i--){
            arr[i] =arr[i-1];
   }
    arr[position] = value;
    size++;
    System.out.println(Arrays.toString(arr)); 
          // output:
          // [100,200,250,300,400,0]
        
    }

}
