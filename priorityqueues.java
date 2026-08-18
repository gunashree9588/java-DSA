import java.util.*;
public class priorityqueues {
    public static void main(String[] args){
        PriorityQueue<String> que = new PriorityQueue<String>();
        que.offer("D");
        que.offer("B");
        que.offer("C");
        que.offer("A");
        while(!que.isEmpty()){
            System.out.println(que.poll());
             //output
             //A
             //B
             //C
             //D
        }


     
    }

}
