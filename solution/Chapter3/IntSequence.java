package javaProject;

import java.util.ArrayList;

public interface IntSequence {
    //接口类IntSequence的静态方法of()
    public static IntSequence of(int... ints){
        return new DigitSequence(ints);
    } 
    
    //内部类DigitSequence
    static class DigitSequence implements IntSequence {
        private ArrayList<Integer> integers = new ArrayList<>();
        
        //内部类DigitSequence的构造方法
        public DigitSequence(int[] ints){
            integers.clear();
            integers = null;
            integers = new ArrayList<>(ints.length);
            for(int anInt: ints){
                integers.add(anInt);
            }
        }
        
        //内部类DigitSequence的默认方法hasNext()
        public boolean hasNext(){
            return integers.size() > 0;
        }
        
        //内部类DigitSequence的默认方法next()
        public int next(){
            int v = integers.get(0);
            integers.remove(0);
            return v;
        }
    }
}
