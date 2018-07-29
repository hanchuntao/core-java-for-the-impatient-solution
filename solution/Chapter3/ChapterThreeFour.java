package javaProject;

public class ChapterThreeFour {
    public static void main(String[] args){
        IntSequence.DigitSequence digits = (IntSequence.DigitSequence) IntSequence.of(3,1,4,1,5,9);
        while(digits.hasNext()){
            System.out.println(digits.next());
        }
    }
}
