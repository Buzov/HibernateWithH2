package com.quasar.hibernateh2.dao.entity.student;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author artur
 */
@Entity
@Table(name = "role")
public class Role extends Model implements Serializable {
        
    private static final long serialVersionUID = 1990501817629593245L;

    @Column(name = "title")
    private String title;
    
    @ManyToMany(mappedBy = "roles")
    private Set<Student> students = new HashSet<>();

    public Role() {
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Role{" + "title=" + title + '}';
    }
}
