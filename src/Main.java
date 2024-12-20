class Employee {
    private int id;
    private String name;

    public Employee(){
        id = 0;
        name = "Harry";
    }
    public Employee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        //Employee harry = new Employee("ProgrammingWithHarry", 12);
        Employee harry = new Employee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}