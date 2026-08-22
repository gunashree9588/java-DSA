public class twopointers {
    public static void main(String[] args){   // two pointers
        int[] arr ={1,1,2,2,2,3};     // to remove duplicate elements
        int i=0;
        for(int j=1;j<arr.length;j++ ){     // if arr[i]==arr[j] the i will remain same i =0 and j will be 2 because we did not written inside the for loop       
             if(arr[i]!=arr[j]){         // arr[0] will be remain same because the loop starts at index 1
                i++;
               arr[i]=arr[j]; 
            } }
            int newlength = i+1;    //+1 because arr[0] we are not included in i so we added 1
            for(int k=0;k<newlength;k++){
                System.out.print(arr[k]+" ");
            }      // output
                   // 1 2 3 
    }

}
