package dev.robmoore.allowance.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="child")
public class Child {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "child")
    private List<Chores> chore;

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String child_name;

    public Child(){}

    public Child(String child_name) {
        this.child_name = child_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChild_name() {
        return child_name;
    }

    public void setChild_name(String child_name) {
        this.child_name = child_name;
    }
}
