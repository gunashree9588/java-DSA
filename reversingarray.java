public class reversingarray {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8};
        int i = 0;
        int j=array.length-1;
        while(i<j){                
            int temp =array[i];
            array[i] = array[j];
            array[j] = temp ;       // firstly stores array[7] like then when we use for loop to print it will print from the first index
             i++;
             j--;
        }
        for(int k =0;k<array.length;k++){
            System.out.print(array[k] + " ");
        }  // output
    }      //8 7 6 5 4 3 2 1  

}
