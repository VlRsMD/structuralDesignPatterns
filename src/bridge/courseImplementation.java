package bridge;

import java.util.ArrayList;
import java.util.List;

public class courseImplementation implements course{
    private List <String> courses = new ArrayList<String>();
    private int ongoing = 0;
    public courseImplementation(){
        courses.add("Basics of Cryptography");
        courses.add("Symmetric Cryptography");
        courses.add("Asymmetric Cryptography");
        courses.add("Design patterns");
        courses.add("Network programming");
    }
    @Override
    public void nextCourse() {
        if( ongoing <= courses.size()-1 )
            ongoing++;
        System.out.print(ongoing);
    }

    @Override
    public void previousCourse() {
        if( ongoing > 0 )
            ongoing--;
    }

    @Override
    public void newCourse(String c) {
        courses.add(c);
    }

    @Override
    public void deleteCourse(String c) {
        courses.remove(c);
    }

    @Override
    public void displayCourse() {
        System.out.println(courses.get(ongoing));
    }

    @Override
    public void displayAllCourses() {
        for (String c : courses) {
            System.out.println(c);
        }
    }
}
