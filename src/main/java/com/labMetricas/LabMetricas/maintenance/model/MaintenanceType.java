package com.labMetricas.LabMetricas.maintenance.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "maintenance_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MaintenanceType {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "status", columnDefinition = "TINYINT(1)", nullable = false)
    private Boolean status = true;

    @Column(name = "name", columnDefinition = "VARCHAR(50)", nullable = false, length = 50, unique = true)
    private String name;

    @OneToMany(mappedBy = "maintenanceType")
    @JsonIgnore
    private List<Maintenance> maintenances;
} 