package dev.robmoore.allowance.models;

import javax.persistence.*;

@Entity
@Table(name = "chores")
public class Chores {

    @ManyToOne
    @JoinColumn(name = "child_id")
    private Child child;

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false, columnDefinition = "text")
    private String chore;

    @Column(nullable = false)
    private String day;

    public Chores(){}

    public Chores(String chore, String day) {
        this.chore = chore;
        this.day = day;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChore() {
        return chore;
    }

    public void setChore(String chore) {
        this.chore = chore;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
