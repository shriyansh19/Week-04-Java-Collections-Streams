package com.collections.policymanagement;

import java.util.Date;
import java.util.Objects;

/**
 * Represents an insurance policy with details such as policy number, holder's name, expiry date, coverage type, and premium amount.
 */
public class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber;    // Unique policy identifier
    private String policyholderName;// Name of the policyholder
    private Date expiryDate;        // Expiry date of the policy
    private String coverageType;    // Type of insurance coverage (Health, Auto, Home, etc.)
    private double premiumAmount;   // Premium amount for the policy

    /**
     * Constructor to initialize an InsurancePolicy object.
     */
    public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getter methods for accessing policy details
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    /**
     * Equals method to check policy uniqueness based on policy number.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof InsurancePolicy)) return false;
        InsurancePolicy policy = (InsurancePolicy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    /**
     * Hashcode method for storing policy objects in HashSet.
     */
    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    /**
     * compareTo method to sort policies by expiry date (used in TreeSet).
     */
    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    /**
     * Returns a formatted string representation of an insurance policy.
     */
    @Override
    public String toString() {
        return "Policy No: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate +
                ", Coverage: " + coverageType + ", Premium: $" + premiumAmount;
    }
}
