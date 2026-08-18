import java.util.*;
public class priorityqueues {
    public static void main(String[] args){
        PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());     // collections means elements in the pq
        pq.offer(3.5);
        pq.offer(5.6);
        pq.offer(7.8);
        pq.offer(8.8);
        while(!pq.isEmpty()){     // pq is non empty means 
            System.out.println(pq.poll());
            // output
            //8.8
            //7.8
            //5.6
            //3.5


        }

    }

}
