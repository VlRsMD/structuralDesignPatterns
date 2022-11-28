package adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class universityFacultyAdapter extends facultyDetailsAdaptee implements facultyTargetInterface {
    @Override
    public void giveFacultyDetails() {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the university name:");
            String universityName=br.readLine();
            System.out.print("\n");
            System.out.print("Enter the faculty ID:");
            int facultyID = Integer.parseInt(br.readLine());
            System.out.print("\n");
            System.out.print("Enter the number of courses of courses:");
            int nrOFCourses=Integer.parseInt(br.readLine());

            setUniversityName(universityName);
            setFacultyID(facultyID);
            setNumberOfCourses(nrOFCourses);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getFaculty() {
        String uniName = getUniversityName();
        int facultyId = getFacultyID();
        int numberOfCourses = getNumberOfCourses();
        return ("The faculty nr. " + facultyId + " of the university " + uniName + " with " + numberOfCourses + " of courses has been registered");
    }
}
