package level1.exercise1.classes;

public class Worker {
    private String firstName;
    private String lastName;
    protected final double PRICEHOUR = 10d;

    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void calculateSalary(int numberHours){
        System.out.println("The salary is " + (numberHours * PRICEHOUR));
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", price/hour=" + PRICEHOUR;
    }
}
