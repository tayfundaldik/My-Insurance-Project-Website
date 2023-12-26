package com.tayfundaldik.insurancetypewebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tayfundaldik.insurancetypewebsite.model.InsurancePolicy;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {
}
