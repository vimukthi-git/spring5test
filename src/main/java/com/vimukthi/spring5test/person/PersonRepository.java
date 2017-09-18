package com.vimukthi.spring5test.person;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface PersonRepository extends JpaRepository<Person, String> {

    @RestResource(path = "by", rel = "by")
    Page findByEmailContainingAndFirstNameContaining(@Param("email") String email,
                                                     @Param("name") String firstName, Pageable p);
}
