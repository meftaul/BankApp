package com.meftaul.bankapp.repository;

import com.meftaul.bankapp.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
