package level1.exercise1;

import level1.exercise1.classes.OnlineWorker;
import level1.exercise1.classes.OnsiteWorker;

public class Program {
    public static void runProgram(){
        //Creating the workers
        OnlineWorker worker1 = new OnlineWorker("Camilo", "Delgado");
        OnsiteWorker worker2 = new OnsiteWorker("Adrian", "Kakuja");

        //Using the methods
        System.out.println("Worker 1: " + worker1.toString());
        worker1.calculateSalary(156);
        System.out.println("Worker 2: " + worker2.toString());
        worker2.calculateSalary(156);
    }
}
