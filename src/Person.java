public class Person {

    protected String firstName;
    protected String lastName;
    protected double height;
    protected long sin;
    protected String nationality;
    protected boolean hasChildren;
    public Person(){
        firstName="Tomas";
        lastName="Ortega";
        hasChildren=false;
        nationality="Colombian";
        sin=123456789;
    }
    public Person(String firstName, String lastName, double height, long sin, String nationality, boolean hasChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.sin = sin;
        this.nationality = nationality;
        this.hasChildren = hasChildren;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private double getHeight(){
        return height;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    private void setHeight(double height){
        this.height=height;
    }

}