package javaProject;

public class SquareSequence  implements IntSequence {
    private int i;

    @Override
    public boolean hasNext(){
        return true;
    }

    @Override
    public int next(){
        i++;
        return i * i;
    }
    
    public static double average(IntSequence seq, int n){
        int count=0;
        double sum = 0;
        while (seq.hasNext() && count < n){
            count++;
            sum +=seq.next();
        }
        return count ==0? 0:sum/count;
    }
    
    public static void main(String[] args){
        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);
        System.out.println(avg);
    }
}



