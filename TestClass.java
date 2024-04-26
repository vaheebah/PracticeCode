import java.util.Scanner;

class Address{
    private String city;
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address(String city, String country){
        this.city = city;
        this.country = country;
    }
}
class person{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public person() {}


    public person(String name, Address address){
        this.name = name;
        this.address = address;

    }

}
class student extends person{
    private String program;
    private int year;
    private int fee;

    public student(String name, Address address, String program, int year, int fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;

    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
class staff extends person {
    private int pay;

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public staff(String name, Address address, int pay){
        super(name, address);
        this.pay = pay;
    }
}
public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student information :");
        System.out.println("Enter name:");
        String studentName = scanner.nextLine();

        System.out.println("Enter city:");
        String studentCity = scanner.nextLine();

        System.out.println("Enter country:");
        String studentCountry = scanner.nextLine();

        System.out.println("Enter program:");
        String studentProgram = scanner.nextLine();

        System.out.println("Enter year:");
        int studentYear = scanner.nextInt();

        System.out.println("Enter fee:");
        int studentFee = scanner.nextInt();


        Address studentAddress = new Address(studentCity, studentCountry);


        student studentObj = new student(studentName, studentAddress, studentProgram, studentYear, studentFee);

        scanner.nextLine();

        System.out.println("Enter staff information: ");
        System.out.println("Enter name:");
        String staffName = scanner.nextLine();

        System.out.println("Enter city:");
        String staffCity = scanner.nextLine();

        System.out.println("Enter country:");
        String staffCountry = scanner.nextLine();

        System.out.println("Enter pay:");
        int staffPay = scanner.nextInt();

        Address staffAddress = new Address(staffCity, staffCountry);


        staff staffObj = new staff(staffName, staffAddress, staffPay);


        System.out.println("\n Student information is given below :\n");
        System.out.println("Name: " + studentObj.getName());
        System.out.println("City: " + studentObj.getAddress().getCity());
        System.out.println("Country: " + studentObj.getAddress().getCountry());
        System.out.println("Program: " + studentObj.getProgram());
        System.out.println("Year: " + studentObj.getYear());
        System.out.println("Fee: " + studentObj.getFee());

        System.out.println("\n Staff information is given below : \n");
        System.out.println("Name: " + staffObj.getName());
        System.out.println("City: " + staffObj.getAddress().getCity());
        System.out.println("Country: " + staffObj.getAddress().getCountry());
        System.out.println("Pay: " + staffObj.getPay());

        scanner.close();
    }
}
