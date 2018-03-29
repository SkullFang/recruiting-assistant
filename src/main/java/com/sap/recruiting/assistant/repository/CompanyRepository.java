package com.sap.recruiting.assistant.repository;

import com.sap.recruiting.assistant.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jiaye Wu on 18-3-26.
 */
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    Company findByName(String name);
}