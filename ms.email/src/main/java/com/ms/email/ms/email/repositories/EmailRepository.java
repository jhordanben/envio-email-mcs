package com.ms.email.ms.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.ms.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
