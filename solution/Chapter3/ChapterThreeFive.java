package javaProject;

public class ChapterThreeFive {
    
    private static void printSequence(IntSequence2.InfiniteSequence ints){
        Runnable runnable = () -> {
            while(ints.hasNext()){
                System.out.println(ints.next());
            }
        };
        new Thread(runnable).start();
    }
    
    public static void main(String[] args){
        IntSequence2.InfiniteSequence digits = (IntSequence2.InfiniteSequence) IntSequence2.constant(1);
        printSequence(digits);
    }
}
