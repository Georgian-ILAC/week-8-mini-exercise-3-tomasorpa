public class Main {
    public static void main(String[] args) {
        Employee tomas=new Employee("Tomas","Ortega",1.75,123456789,
                "Colombian",false,"Junior Developer",1,123312421,20);

        System.out.println(tomas.getHourlyPay());
        tomas.payDay(45);
        System.out.println(tomas.toString());
    }
}