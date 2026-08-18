import java.util.*;
public class queue{  
public static void main(String[] args){
        Queue<String> queues = new LinkedList<String>();
        queues.offer("thar");
        queues.offer("defender");
        queues.offer("bmw");
        queues.poll();
        System.out.println(queues);
        System.out.println(queues.isEmpty());
        System.out.println(queues.size());
        System.out.println(queues.contains("thar"));
        System.out.println(queues.peek());
      // output
      // [defender, bmw]
      //false
      //2
      //false
      //defender
}
}
