package com.example.udemy_project1.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Username is a mandatory field. Please provide username")
    @Column(name = "USER_NAME",length = 50,nullable = false, unique = true)
    private String username;

    @Size(min=2,message = "First name should have atleast 2 characters")
    @Column(name = "FIRSTNAME",length = 50,nullable = false)
    private String firstname;
    @Column(name = "LASTNAME",length = 50,nullable = false)
    private String lastname;
    @Column(name = "EMAIL_ADDRESS",length = 50,nullable = false)
    private String email;
    @Column(name = "ROLE",length = 50,nullable = false)
    private String role;
    @Column(name = "SSN",length = 50,nullable = false,unique = true)
    private String ssn;

    //no argument constructor
    public Users() {
    }
    //fields constructor
    public Users(Long id, String username, String firstname, String lastname, String email, String role, String ssn) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.role = role;
        this.ssn = ssn;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //optional toString()
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
