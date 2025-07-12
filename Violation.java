package com.trafficViolation.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Violation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private ViolationType violationType;
    private LocalDateTime violationDateTime;
    private String evidenceUrl;
    private String status;

    public Violation() {
    }

    public Violation(Long id, Vehicle vehicle, ViolationType violationType, LocalDateTime violationDateTime, String evidenceUrl, String status) {
        this.id = id;
        this.vehicle = vehicle;
        this.violationType = violationType;
        this.violationDateTime = violationDateTime;
        this.evidenceUrl = evidenceUrl;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ViolationType getViolationType() {
        return violationType;
    }

    public void setViolationType(ViolationType violationType) {
        this.violationType = violationType;
    }

    public LocalDateTime getViolationDateTime() {
        return violationDateTime;
    }

    public void setViolationDateTime(LocalDateTime violationDateTime) {
        this.violationDateTime = violationDateTime;
    }

    public String getEvidenceUrl() {
        return evidenceUrl;
    }

    public void setEvidenceUrl(String evidenceUrl) {
        this.evidenceUrl = evidenceUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

