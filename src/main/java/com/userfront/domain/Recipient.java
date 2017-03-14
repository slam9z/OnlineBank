package com.userfront.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by KozuePC on 3/10/2017.
 */
@Entity
public class Recipient {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String description;
    private String emial;
    private String phone;
    private String accountNumber;

    @ManyToOne
    @JoinColumn(name ="user_id")
    @JsonIgnore
    private User user;

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", emial='" + emial + '\'' +
                ", phone='" + phone + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

}
