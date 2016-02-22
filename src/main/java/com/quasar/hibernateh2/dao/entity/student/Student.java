package com.quasar.hibernateh2.dao.entity.student;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student extends Model implements Serializable {

    private static final long serialVersionUID = 1990501617629593245L;

    @Column(name = "name")
    private String name;
    
    @Column(name = "age")
    private Long age;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    public Student() {
        name = null;
    }

    public Student(Student s) {
        name = s.getName();
    }
    
    public String getName() {
        return name;
    }
    
    public Long getAge() {
        return age;
    }

    public void setName(String s) {
        name = s;
    }

    public void setAge(Long l) {
        age = l;
    }
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
