public class array{ 
    public static void main(String[] args){  //reversing an array
        int[] arr = {2,3,4,5,6,7,8,9};
        int i=0;
        int j =arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
           arr[j]=temp;     
            i++;
            j--;
        }                      //it will first store arr[7] = 9 like when we do the for loop it will print firstly arr[0] 
            for (int k=0;k<arr.length;k++){
            System.out.print(arr[k] +" ");
        }  // output
          //  9 8 7 6 5 4 3 2 
            
    }}


