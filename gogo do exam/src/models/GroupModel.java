package models;

import interfaces.GroupInterface;
import interfaces.StudentInterface;

import java.util.ArrayList;

public class GroupModel implements GroupInterface {
    private String groupName;
    private ArrayList<StudentInterface> studentList;

    private String course;


    public GroupModel(ArrayList<StudentInterface> students, String groupName,String course){
        this.groupName=groupName;
        this.studentList=students;
        this.course=course;
    }



    public synchronized String getGroupName() {
        return groupName;
    }



    public  synchronized ArrayList<StudentInterface> getAllStudents() {
        return studentList;
    }


    public synchronized void addStudent(StudentInterface student) {
     boolean check=false;
      for (var stud : studentList){
        if (stud.getSrcondName().equals(student.getSrcondName())){
            check=true;
        }
      }
      if (!check){
          studentList.add(student);
      }

    }

    public synchronized void removeStudent(StudentInterface student) {
                studentList.remove(student);
    }


    public synchronized String getCourse() {
        return course;
    }
}
