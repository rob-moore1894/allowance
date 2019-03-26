package dev.robmoore.allowance.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
public class User {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Child> child;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Rules> rule;

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(nullable = false)
    private String phone_number;

    @Column(length = 2)
    private int role;

    public User(){}

    public User(String username, String password, String email, String first_name, String last_name, String phone_number, int role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.role = role;
    }

    public User(User copy){
        id = copy.id;
        username = copy.username;
        password = copy.password;
        email = copy.email;
        first_name = copy.first_name;
        last_name = copy.last_name;
        phone_number = copy.phone_number;
        role = copy.role;
    }
}
