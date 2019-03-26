package dev.robmoore.allowance.models;


import javax.persistence.*;

@Entity
@Table(name = "rules")
public class Rules {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false, columnDefinition = "text")
    private String description;

    public Rules(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
