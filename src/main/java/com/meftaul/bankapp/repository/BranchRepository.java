package com.meftaul.bankapp.repository;

import com.meftaul.bankapp.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
