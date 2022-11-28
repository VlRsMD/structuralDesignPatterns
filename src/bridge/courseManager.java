package bridge;

public class courseManager {
    protected course c;
    public String field;
    public courseManager(String field) {
        this.field=field;
    }
    public void next() {
        c.nextCourse();
    }
    public void previous() {
        c.previousCourse();
    }
    public void newOne(String crs) {
        c.newCourse(crs);
    }
    public void delete(String crs) {
        c.deleteCourse(crs);
    }
    public void display() {
        c.displayCourse();
    }
    public void displayAll() {
        System.out.println("List of " + field + " courses: ");
        c.displayAllCourses();
    }
}
