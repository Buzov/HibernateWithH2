package com.quasar.hibernateh2;

import com.quasar.hibernateh2.dao.Factory;
import com.quasar.hibernateh2.dao.entity.student.Role;
import com.quasar.hibernateh2.dao.entity.student.Student;
import java.sql.SQLException;
import java.util.List;


public class MainStudent {
    
    public static void main(String[] args) throws SQLException {

        Student s1 = new Student();
        Student s2 = new Student();
        Role r1 = new Role();
        r1.setTitle("sdf dsfs");
        Role r2 = new Role();
        r2.setTitle("sdf sdfs");
        

        s1.setName("Ivanov Ivan");
        s1.setAge(21l);
        s1.setRole(r1);
        s2.setName("Petrova Alisa");
        s2.setAge(24l);
        s2.setRole(r2);
                
        Factory.getInstance().getStudentDAO().addStudent(s1);
        Factory.getInstance().getStudentDAO().addStudent(s2);       
        
        List<Student> studs = Factory.getInstance().getStudentDAO().getAllStudents();
        System.out.println("========��� ��������=========");
        for(Student s : studs) {
                System.out.println("��� �������� : " + 
                        s.getName() + ", ������� : " + 
                        s.getAge() +",  id : " + 
                        s.getId() + ", role : " + 
                        s.getRole());
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