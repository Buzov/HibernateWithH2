package com.quasar.hibernateh2.dao.entity.student;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author artur
 */
@Entity
@Table(name = "group_s")
/* Group это зарезервированное SQL слово, а имя таблицы не экранируется в ORM по 
* некоторым объективным причинам (не могу вспомнить, где я объяснение видел). 
* Назовите класс или таблицу иначе, либо добавьте экранирование @Table(name="\"group\"")
*/
public class Group extends Model implements Serializable {
    
    private static final long serialVersionUID = 565752359649949792L;

    @Column(name = "title")
    private String title;
    
    @OneToMany(mappedBy = "group")
    private Set<Student> students = new HashSet<>();

    public Group() {
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
