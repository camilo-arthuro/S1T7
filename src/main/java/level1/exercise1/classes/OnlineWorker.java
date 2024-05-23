package level1.exercise1.classes;

public class OnlineWorker extends Worker{
    private final double INTERNET = 40d;

    public OnlineWorker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void calculateSalary(int numberHours){
        System.out.println("The salary is " + ((numberHours * PRICEHOUR) + INTERNET));
    }

}
