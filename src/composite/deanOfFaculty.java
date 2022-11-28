package composite;

public class deanOfFaculty implements uniAdminComponent{
    private int id;
    private String name;
    private double salary;
    public deanOfFaculty(int id,String name,double salary)  {
        this.id=id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("==========================");
        System.out.println("Id ="+getId());
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("==========================");
    }

    @Override
    public void add(uniAdminComponent admin) {

    }

    @Override
    public void remove(uniAdminComponent admin) {

    }

    @Override
    public uniAdminComponent getChild(int i) {
        return null;
    }
}
