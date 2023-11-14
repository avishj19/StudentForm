package com.example.school;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class StudentInfo {

    ArrayList<Student> Students = new ArrayList<>();

    public StudentInfo(){};

    public StudentInfo(ArrayList<Student> students) {
        Students = students;
    }

    public void add(Student student){
        Students.add(student);

    }
    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> students) {
        Students = students;
    }

    public void printStudentInfo(){

      for(Student s2 : Students){
          System.out.println(s2.toString());

      }
    }

    public void populateJTable() {
        JTable jTable1 = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();



        for (int i = 0; i < Students.size(); i++) {
            Object[] rowData = new Object[8];
            rowData[0] = Students.get(i).getName();
            rowData[1] = Students.get(i).getEmail();
            model.addRow(rowData);
        }
        jTable1 = new JTable(model);
    }
}
