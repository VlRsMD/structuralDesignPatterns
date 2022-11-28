package composite;

public class demoClient {
    public static void main(String[] args) {
        uniAdminComponent adm1 = new deanOfFaculty(3,"Peter Helden", 5700);
        uniAdminComponent adm2 = new deanOfFaculty(7,"Konrad Smith", 5700);
        uniAdminComponent adm3 = new deanOfUniversity(5,"John Peterson", 6000);
        uniAdminComponent admin =new universityAdministratorComposite(8,"William Kolner",5700);
        admin.add(adm1);
        admin.add(adm2);
        admin.add(adm3);
        admin.print();
    }
}
