package bridge;

public class coursesDemo {
    public static void main(String[] args) {
        courseFormat courses = new courseFormat("Software Engineering");
        courses.c = new courseImplementation();
        courses.delete("Basics of Cryptography");
        courses.newOne("Databases");
        courses.newOne("OOP");
        courses.displayAll();
    }
}
