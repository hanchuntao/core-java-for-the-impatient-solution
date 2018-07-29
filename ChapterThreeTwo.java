package javaProject;
/**
 * 
 * @author Chuntao_Han
 *
 */

public class ChapterThreeTwo  {
    
    static class Employee implements Measurable {
        private double salary = 0;
        private String name = "";
        
        Employee(double salary){
            this.salary = salary;
        }

        Employee(double salary, String name){
            this.salary = salary;
            this.name = name;
        }
        
        @Override
        public double getMeasure(){
            return salary;
        }
        
        public String getName(){
            return name;
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
    
    public static Measurable largest(Measurable[] objects) {
        Measurable maxMeasurable = null;
        double max = 0;
        if(objects.length > 0) {
            for (Measurable m: objects) {
                if(m.getMeasure() > max) {
                    max = m.getMeasure();
                    maxMeasurable=m;
                }
            }
        }
        return maxMeasurable;
    }

    public static void main(String[] args){
        Measurable[] objects = new Measurable[50];
        for (int i=1;i<=50; i++){
            Employee employee = new Employee(i, "test" + i);
            objects[i-1] = employee;
        }
        
        double result= average(objects);
        System.out.println("average = " + result);
        
        Employee result2 = (Employee) largest(objects);
        //之所以需要转换类型，是因为我们需要调用子类的方法，而我们返回的是被继承的接口的类型，该接口类型没有相应的方法。
        System.out.println("largest = " + result2.getName());
    }
}

