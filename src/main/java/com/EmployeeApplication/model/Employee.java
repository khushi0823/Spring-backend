package com.EmployeeApplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="employees")


public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String FirstName;
    @Column(name = "last_name")
    private String LastName;
    @Column(name = "email_id")
    private String EmailId;

}
