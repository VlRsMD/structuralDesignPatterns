package bridge;

public class courseFormat extends courseManager {
    public courseFormat(String field) {
        super(field);
    }
    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }
}
