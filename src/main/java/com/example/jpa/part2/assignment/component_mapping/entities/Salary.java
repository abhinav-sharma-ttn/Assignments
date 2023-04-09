package com.example.jpa.part2.assignment.component_mapping.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {

    @Column(name = "basic_salary")
    private double basicSalary;
    @Column(name = "bonus_salary")
    private double bonusSalary;

    @Column(name = "special_allowance_salary")
    private double specialAllowanceSalary;
    @Column(name = "tax_amount")
    private double taxAmount;

    public Salary() {
    }

    public Salary(double basicSalary, double bonusSalary, double specialAllowanceSalary, double taxAmount) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.specialAllowanceSalary = specialAllowanceSalary;
        this.taxAmount = taxAmount;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(double specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }
}
