package com.aq.subscribers.model;

import jakarta.persistence.*;

@Entity
@Table(name="subscribers")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="Name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="Subscribed")
    private boolean subscribed;

    public Subscriber(){

    }

    public Subscriber(String name, String email){
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean isSubscribed){
            this.subscribed= isSubscribed;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subscribed=" + subscribed +
                '}';
    }
}
