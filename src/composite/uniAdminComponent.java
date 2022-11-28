package composite;

public interface uniAdminComponent {
    public  int getId();
    public String getName();
    public double getSalary();
    public void print();
    public void add(uniAdminComponent admin);
    public void remove(uniAdminComponent admin);
    public uniAdminComponent getChild(int i);
}
