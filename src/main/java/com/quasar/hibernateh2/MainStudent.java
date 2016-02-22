package com.quasar.hibernateh2;

import com.quasar.hibernateh2.dao.Factory;
import com.quasar.hibernateh2.dao.entity.student.Group;
import com.quasar.hibernateh2.dao.entity.student.Student;
import java.sql.SQLException;
import java.util.List;


public class MainStudent {
    
    public static void main(String[] args) throws SQLException {

        Student s1 = new Student();
        Student s2 = new Student();
        Group r1 = new Group();
        r1.setTitle("sdf dsfs");
        Group r2 = new Group();
        r2.setTitle("sdf sdfs");
        

        s1.setName("Ivanov Ivan");
        s1.setAge(21l);
        s1.setGroup(r1);
        s2.setName("Petrova Alisa");
        s2.setAge(24l);
        s2.setGroup(r2);
                
        Factory.getInstance().getStudentDAO().addStudent(s1);
        Factory.getInstance().getStudentDAO().addStudent(s2);       
        
        List<Student> studs = Factory.getInstance().getStudentDAO().getAllStudents();
        System.out.println("========All students=========");
        for(Student s : studs) {
                System.out.println("Name of students : " + 
                        s.getName() + ", age : " + 
                        s.getAge() +",  id : " + 
                        s.getId() + ", role : " + 
                        s.getGroup());
                System.out.println("=============================");              
        }
//        studs.stream().map((s) -> {
//            System.out.println("��� �������� : " +
//                s.getName() + ", ������� : " +
//                s.getAge() +",  id : " +
//                s.getId() + ", role : " +
//                s.getRole());
//            return s;
//        }).forEach((_item) -> {       
//            System.out.println("=============================");
//        });
    }
}