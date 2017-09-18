package com.vimukthi.spring5test.person;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String gender;

    private String ipAddress;

}
