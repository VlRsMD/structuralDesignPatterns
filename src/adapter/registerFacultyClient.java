package adapter;

public class registerFacultyClient {
    public static void main(String args[]){
        facultyTargetInterface targetInterface=new universityFacultyAdapter();
        targetInterface.giveFacultyDetails();
        System.out.print(targetInterface.getFaculty());
    }
}
