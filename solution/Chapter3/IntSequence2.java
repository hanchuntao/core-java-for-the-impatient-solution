package javaProject;

import java.util.ArrayList;

public interface IntSequence2 {
    //接口类IntSequence2的静态方法of()
    public static IntSequence2 of(int... ints){
        return new DigitSequence(ints);
    } 
    
    //接口类IntSequence2的静态方法constant()
    public static IntSequence2 constant(int i){
        return new InfiniteSequence(i);
    }

    static class DigitSequence implements IntSequence2 {
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
    
    //内部类InfiniteSequence
    static class InfiniteSequence implements IntSequence2 {
        private int constant = 0;
        
      //内部类InfiniteSequence的构造方法
        public InfiniteSequence(int i){
            constant = i;
        }
        
        public boolean hasNext(){
            return true;
        }
        
        public int next(){
            return constant;
        }
    }
}

