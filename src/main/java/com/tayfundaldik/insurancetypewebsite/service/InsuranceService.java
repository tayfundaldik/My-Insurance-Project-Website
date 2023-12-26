package com.tayfundaldik.insurancetypewebsite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tayfundaldik.insurancetypewebsite.model.InsurancePolicy;
import com.tayfundaldik.insurancetypewebsite.repository.InsurancePolicyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InsuranceService {

    @Autowired
    private InsurancePolicyRepository policyRepository;

    public List<InsurancePolicy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Optional<InsurancePolicy> getPolicyById(Long id) {
        return policyRepository.findById(id);
    }

    public InsurancePolicy savePolicy(InsurancePolicy policy) {
        return policyRepository.save(policy);
    }
   
    public void deletePolicy(Long id) {
        policyRepository.deleteById(id);
    }
}