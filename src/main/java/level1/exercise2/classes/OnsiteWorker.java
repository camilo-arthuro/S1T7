package level1.exercise2.classes;

public class OnsiteWorker extends Worker {
    private static double petrol = 50d;

    public OnsiteWorker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void calculateSalary(int numberHours){
        System.out.println("The salary is " + ((numberHours * PRICEHOUR) + petrol));
    }

    @Deprecated
    public double returnPetrolValue(){
        return petrol;
    }

    public double getPetrol() {
        return petrol;
    }

}
