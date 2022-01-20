package models;

import interfaces.StudentInterface;

public class StudentModel implements StudentInterface {
    private String studentFirstName;
    private String studentSecondName;


    private String placeOfLiving;
    private boolean isStudying =false;
  public StudentModel(String studentFirstName,String studentSecondName,String placeOfLiving){
      this.studentFirstName=studentFirstName;
      this.studentSecondName=studentSecondName;
      this.placeOfLiving=placeOfLiving;

  }


    public synchronized void setStudyState(boolean state) {
        isStudying=state;
    }

    public synchronized String getSrcondName() {
        return studentSecondName;
    }


    public synchronized String getPlaceOfLiving() {
        return placeOfLiving;
    }


    public synchronized boolean getStydyState() {
        return isStudying;
    }


}
