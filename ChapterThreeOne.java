package javaProject;

public class ChapterThreeOne  {
    
    static class Employee implements Measurable {
        private double salary = 0;
        
        Employee(double salary){
            this.salary = salary;
        }
        
        @Override
        public double getMeasure(){
            return salary;
        }
    }
    
    
    public static double average(Measurable[] objects){
        double sum = 0;
        if(objects.length > 0) {
            for (Measurable m: objects) {
                sum +=m.getMeasure();
            }
            return sum / objects.length;
        }
        return 0;
    }
    
    public static void main(String[] args){
        Measurable[] objects = new Measurable[50];
        for (int i=1;i<=50; i++){
            Employee employee = new Employee(i);
            objects[i-1] = employee;
        }
        
        double result= average(objects);
        System.out.println(result);
    }
}

