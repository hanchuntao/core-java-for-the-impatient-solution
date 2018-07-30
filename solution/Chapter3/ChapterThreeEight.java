package javaProject;

public class ChapterThreeEight {
    public static class Greeter implements Runnable {
        private int number;
        private String target;

        public Greeter(int number, String target) {
            this.number =number ;
            this.target = target;
        }
        
        public void run() {
            for (int i=0;i<number;i++){
                System.out.println("Hello " + target);
            }
        }
    }
    
    public static void main(String[] args){
        Runnable task1 = new Greeter(200, "test1");
        Runnable task2 = new Greeter(200, "test2");
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
