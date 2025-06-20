package com.labMetricas.LabMetricas.equipment.repository;

import com.labMetricas.LabMetricas.equipment.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
    // Custom query methods can be added here if needed
} 