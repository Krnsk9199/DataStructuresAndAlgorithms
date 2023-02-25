import java.util.ArrayDeque;
import java.util.Queue;

public class GreedyAlgorithms {

    /**
     * Polices and Thieves
     * k is the max distance of the police and thief.
     */
    public int catchThieves(char arr[],int k ){
        Queue<Integer> tq = new ArrayDeque<>();
        Queue<Integer> pq = new ArrayDeque<>();

        for(int i =0; i<arr.length; i++){
            if(arr[i]=='T'){
                tq.offer(i);
            } else {
                pq.offer(i);
            }
        }
        int counter =0;

        while(!tq.isEmpty() && !pq.isEmpty()){
            if(Math.abs(tq.peek()- pq.peek())<=k){ // police is within a reachable distance from thief
                counter++;
                pq.poll();
                tq.poll();
            } else if(tq.peek()>pq.peek()){
                pq.poll();
            } else{
                tq.poll();
            }
        }

        return counter;
    }
}
