package com.example.school;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class RegisterFrame extends JFrame implements ActionListener {
    JLabel message;
    JLabel nameLabel,  genderLabel;
    JTextField nameField;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
    JLabel mailIdLabel, mobileNoLabel;
    JTextField mailIdField, mobileNoField;
    JLabel gpaLabel, reGpaLabel;
    JTextField gpaField, reGpaField;
    JLabel programLabel;
    JComboBox<String> programList;
    JLabel branchLabel;
    JComboBox<String> branchList;
    JComboBox<Integer> semesterList;
    JButton registerButton;

    JButton resetButton;

    JButton displayButton;

    JTable output;

    JScrollPane sp;
    DefaultTableModel model;
    Container container;

    public RegisterFrame() {
        message = new JLabel("Brooklyn Tech Student Info");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        message.setForeground(Color.BLUE);
        nameLabel = new JLabel("Name");
        nameField = new JTextField();
        genderLabel = new JLabel("Gender");
        genderMale = new JRadioButton("Male", true);
        genderFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
        mailIdLabel = new JLabel("Email ");
        mailIdField = new JTextField();
        mobileNoLabel = new JLabel("Phone number");
        mobileNoField = new JTextField();
        gpaLabel = new JLabel("Gpa");
        gpaField = new JTextField();
        reGpaLabel = new JLabel("Student Id");
        reGpaField = new JTextField();
        programLabel = new JLabel("Grade");
        programList = new JComboBox<String>();
        programList.addItem("Freshman");
        programList.addItem("Sophomore");
        programList.addItem("Junior");
        programList.addItem("Senior");
        branchLabel = new JLabel("Major");
        branchList = new JComboBox<String>();
        branchList.addItem("AEROSPACE ENGINEERING");
        branchList.addItem("APPLIED MATHEMATICS");
        branchList.addItem("ARCHITECTURAL ENGINEERING");
        branchList.addItem("BIOLOGICAL SCIENCES");
        branchList.addItem("CHEMICAL ENGINEERING");
        branchList.addItem("Civil Engineering");
        branchList.addItem("ELECTRICAL ENGINEERING");
        branchList.addItem("ENVIRONMENTAL SCIENCE");
        branchList.addItem("FINANCE");
        branchList.addItem("INDUSTRIAL DESIGN");
        branchList.addItem("LAW & SOCIETY");
        branchList.addItem("LIU PHARMD");
        branchList.addItem("ADVANCED HEALTH PROFESSIONS");
        branchList.addItem("MECHATRONICS & ROBOTICS ");
        branchList.addItem("MEDIA COMMUNICATIONS");
        branchList.addItem("PHYSICS");
        branchList.addItem("SOCIAL SCIENCE RESEARCH ");
        branchList.addItem("SOFTWARE ENGINEERING");
        branchList.addItem("N/A");

        model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Email");
        model.addColumn("Phone Number");
        model.addColumn("gpa");
        model.addColumn("studentid");
        model.addColumn("Program");
        model.addColumn("Branch");

        // Initializing  JTable
        output = new JTable(model);
        sp = new JScrollPane(output);

        registerButton = new JButton("Register");
        resetButton = new JButton("Reset");
        //displayButton = new JButton("Display All");
        container = getContentPane();
        container.setLayout(null);
        setBounds();
        addComponents();
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        //displayButton.addActionListener(this);
    }
    public void setBounds() {
        message.setBounds(50, 10, 600, 30);
        nameLabel.setBounds(50, 60, 100, 30);
        nameField.setBounds(130, 60, 200, 30);
        genderLabel.setBounds(50, 100, 100, 30);
        genderMale.setBounds(130, 100, 100, 30);
        genderFemale.setBounds(240, 100, 100, 30);
        mailIdLabel.setBounds(50, 160, 100, 30);
        mailIdField.setBounds(130, 160, 200, 30);
        mobileNoLabel.setBounds(50, 210, 100, 30);
        mobileNoField.setBounds(140, 210, 200, 30);
        gpaLabel.setBounds(50, 260, 100, 30);
        gpaField.setBounds(130, 260, 200, 30);
        reGpaLabel.setBounds(50, 310, 100, 30);
        reGpaField.setBounds(130, 310, 200, 30);
        programLabel.setBounds(50, 360, 100, 30);
        programList.setBounds(130, 360, 200, 30);
        branchLabel.setBounds(50, 410, 100, 30);
        branchList.setBounds(130, 410, 200, 30);
        output.setBounds(40, 450, 700, 250);
        sp.setBounds(40,450,700,250);
        registerButton.setBounds(40, 720, 200, 30);
        resetButton.setBounds(250 , 720 , 200,30);
        //displayButton.setBounds(460 , 720 , 200 ,30);
    }
    public void addComponents() {
        container.add(message);
        container.add(nameLabel);
        container.add(nameField);
        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);
        container.add(mailIdLabel);
        container.add(mailIdField);
        container.add(mobileNoLabel);
        container.add(mobileNoField);
        container.add(gpaLabel);
        container.add(gpaField);
        container.add(reGpaLabel);
        container.add(reGpaField);
        container.add(programLabel);
        container.add(programList);
        container.add(branchLabel);
        container.add(branchList);
        container.add(registerButton);
        container.add(resetButton);
        //container.add(displayButton);
        container.add(output);
        container.add(sp);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registerButton) {
            System.out.println("Register Button Clicked");
            String gender = null;
            if (genderFemale.isSelected()) {
                gender = "Female";
            }
            if (genderMale.isSelected()) {
                gender = "Male";
            }
            String programName = programList.getSelectedItem().toString();
            String branchName = branchList.getSelectedItem().toString();

            System.out.println("Name: " + nameField.getText()
                    + "  Gender: " + gender + "  Email:  " + mailIdField.getText()
                    + "  Phone Number: " + mobileNoField.getText() + "  Gpa: " + gpaField.getText()
                    + "  Student Id: " + reGpaField.getText() + "Grade"+  programName + "  Major: " + branchName);

           Student student = new Student(nameField.getText(),gender,Float.valueOf(gpaField.getText()), Integer.valueOf(reGpaField.getText()), mailIdField.getText(), mobileNoField.getText(), programName,  branchName);
           StudentInfo s1 = new StudentInfo();
           s1.add(student);
           s1.printStudentInfo();
           String[] rowData=
                   {nameField.getText(),
                           gender,
                           gpaField.getText(),
                           reGpaField.getText(),
                           mailIdField.getText(),
                           mobileNoField.getText(),
                           programName,
                           branchName
            };

           model.addRow(rowData);
           output.setModel(model);


        }else if (e.getSource() == resetButton) {
            String def = "";
            nameField.setText(def);
            genderFemale.setSelected(false);
            genderMale.setSelected(false);
            mailIdField.setText(def);
            mobileNoField.setText(def);
            gpaField.setText(def);
            reGpaField.setText(def);
            programList.setSelectedItem(false);
            branchList.setSelectedItem(false);
           model.setRowCount(0);
            output.setModel(model);
        }
    }

        public static void main(String[] args) {
        RegisterFrame frame = new RegisterFrame();
        frame.setTitle("Student Registration Form");
        frame.setVisible(true);
        frame.setBounds(300, 100, 800, 800);
        frame.getContentPane().setBackground(new Color(240, 255, 255));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);


    }
}
