package bridge;

public interface course {
    public void nextCourse();
    public void previousCourse();
    public void newCourse(String c);
    public void deleteCourse(String c);
    public void displayCourse();
    public void displayAllCourses();
}
