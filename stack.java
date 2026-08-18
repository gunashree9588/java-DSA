import java.util.Stack;
public class stack{
public static void main(String[] args){
        Stack<String> st=new Stack<String>();
        st.push("mango");
        st.push("apple");
        st.push("orange");
        st.push("papaya");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        // output
        //[mango, apple, orange, papaya]
       //[mango, apple, orange]
       //orange
        

         




    }

}
