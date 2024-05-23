package level1.exercise2;

import level1.exercise2.classes.OnlineWorker;
import level1.exercise2.classes.OnsiteWorker;

public class Program {
    @SuppressWarnings("deprecation")
    public static void runProgram(){
        //Creating the workers
        OnlineWorker worker1 = new OnlineWorker("Camilo", "Delgado");
        OnsiteWorker worker2 = new OnsiteWorker("Adrian", "Kakuja");

        //Using the methods
        System.out.println("Worker 1: " + worker1.toString() +
                "\nPlus for the Internet: " + worker1.returnInternetValue());
        worker1.calculateSalary(156);
        System.out.println("Worker 2: " + worker2.toString() +
                "\nPlus for the petrol: " + worker2.returnPetrolValue());
        worker2.calculateSalary(156);
    }
}
