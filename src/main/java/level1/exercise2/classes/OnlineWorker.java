package level1.exercise2.classes;

public class OnlineWorker extends Worker {
    private final double INTERNET = 40d;

    public OnlineWorker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void calculateSalary(int numberHours){
        System.out.println("The salary is " + ((numberHours * PRICEHOUR) + INTERNET));
    }

    @Deprecated
    public double returnInternetValue(){
        return INTERNET;
    }

    public double getINTERNET() {
        return INTERNET;
    }

}
