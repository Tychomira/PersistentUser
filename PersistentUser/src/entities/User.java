
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")

    private int id;
    
    @Column(name="first_name")
    private String first_name;
    
    @Column(name="last_name")
    private String last_name;
    
    @Column(name="tel")
    private String tel;
    private String email;
    
    
    public User  (){}

    public User(String first_name, String last_name, String tel, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.tel = tel;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "first_name=" + first_name + ", last_name=" + last_name + ", tel=" + tel + ", email=" + email + '}';
    }
    
    

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
