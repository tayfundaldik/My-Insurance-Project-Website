package com.tayfundaldik.insurancetypewebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tayfundaldik.insurancetypewebsite.model.InsurancePolicy;
import com.tayfundaldik.insurancetypewebsite.service.InsuranceService;


@RestController
@RequestMapping("/api/insurance")
public class InsuranceController {

    @Autowired
    private InsuranceService insuranceService;
   


    @GetMapping
    public List<InsurancePolicy> getAllPolicies() {
        return insuranceService.getAllPolicies();
    }

    @GetMapping("/{id}")
    public InsurancePolicy getPolicyById(@PathVariable Long id) {
        return insuranceService.getPolicyById(id).orElse(null);
    }

    @PostMapping
    public InsurancePolicy createPolicy(@RequestBody InsurancePolicy policy) {
        return insuranceService.savePolicy(policy);
    }

	@PutMapping("/{id}")
	public InsurancePolicy updatePolicy(@PathVariable Long id, @RequestBody InsurancePolicy policy,String name,String insuranceType) {
        policy.setName(name);
        policy.setInsuranceType(insuranceType);
        return insuranceService.savePolicy(policy);
        }

    @DeleteMapping("/{id}")
    public void deletePolicy(@PathVariable Long id) {
        insuranceService.deletePolicy(id);
    }
}
