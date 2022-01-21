package com.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Column
    @Getter
    @Setter
    private String name;

    @Id
    @Getter
    @Setter
    private UUID id;

    @Column
    @Getter
    @Setter
    private String email;

    @Column
    @Getter
    @Setter
    private String password;

    @Column
    @Getter
    @Setter
    Date dob;

}
