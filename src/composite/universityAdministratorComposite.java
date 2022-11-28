package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class universityAdministratorComposite implements uniAdminComponent{
    private int id;
    private String name;
    private double salary;

    public universityAdministratorComposite(int id,String name,double salary) {
        this.id=id;
        this.name = name;
        this.salary = salary;
    }
    List<uniAdminComponent> admins = new ArrayList<uniAdminComponent>();

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

        Iterator<uniAdminComponent> it = admins.iterator();

        while(it.hasNext())  {
            uniAdminComponent adm = it.next();
            adm.print();
        }
    }

    @Override
    public void add(uniAdminComponent admin) {
        admins.add(admin);
    }

    @Override
    public void remove(uniAdminComponent admin) {
        admins.remove(admin);
    }

    @Override
    public uniAdminComponent getChild(int i) {
        return admins.get(i);
    }
}
