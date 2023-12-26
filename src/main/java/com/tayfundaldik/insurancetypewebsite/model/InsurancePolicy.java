package com.tayfundaldik.insurancetypewebsite.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "insurancepolicy")
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
   
    private String insuranceType;
    private LocalDate targetDate;
    public InsurancePolicy()
    {
    	
    }
    
    public InsurancePolicy(Long id,String name, String insuranceType, LocalDate targetDate) {
    	super();
    	this.id= id;
    	this.name= name;
    	this.insuranceType = insuranceType;
    	this.targetDate= targetDate;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
			this.targetDate = targetDate;
	}

	@Override
	public String toString() {
		return "InsurancePolicy [id=" + id + ", name=" + name + ", insuranceType=" + insuranceType + ", targetDate="
					+ targetDate + "]";
	}
}