public class Employee extends Person{
    public String role;
    public int yearsOfExperience;
    private int id;
    private double hourlyPay;

    public Employee(String firstName, String lastName, double height, long sin, String nationality, boolean hasChildren, String role, int yearsOfExperience, int id, double hourlyPay) {
        super(firstName, lastName, height, sin, nationality, hasChildren);
        this.role = role;
        this.yearsOfExperience = yearsOfExperience;
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }


    public double getRaise(){
        this.hourlyPay=(getHourlyPay()*0.15)+getHourlyPay();
        return hourlyPay;
    }
    public void payDay(int hoursWorked) {
        Double payment = 40 * getHourlyPay();
        if (hoursWorked > 40) {
            payment += (hoursWorked - 40) * (getHourlyPay()*1.5);
        }
        else if (hoursWorked<40){
            payment=getHourlyPay()*hoursWorked;
        }

        System.out.println("Your payment of the week is: "+payment);

    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", id=" + id +
                ", nationality='" + nationality + '\'' +
                ", hasChildren=" + hasChildren +
                ", role='" + role + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", hourlyPay=" + hourlyPay +
                ", id=" + id +
                '}';
    }

}
