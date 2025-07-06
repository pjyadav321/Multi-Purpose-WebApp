package com.trafficViolation.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Violation violation;
    private double amount;
    private LocalDateTime dueDate;
    private LocalDateTime issuedAt;
    private LocalDateTime paidAt;

    public Fine() {
    }

    public Fine(Long id, Violation violation, double amount, LocalDateTime dueDate, LocalDateTime issuedAt, LocalDateTime paidAt) {
        this.id = id;
        this.violation = violation;
        this.amount = amount;
        this.dueDate = dueDate;
        this.issuedAt = issuedAt;
        this.paidAt = paidAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Violation getViolation() {
        return violation;
    }

    public void setViolation(Violation violation) {
        this.violation = violation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(LocalDateTime issuedAt) {
        this.issuedAt = issuedAt;
    }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(LocalDateTime paidAt) {
        this.paidAt = paidAt;
    }
}
