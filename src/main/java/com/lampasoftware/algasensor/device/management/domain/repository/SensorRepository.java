package com.lampasoftware.algasensor.device.management.domain.repository;

import com.lampasoftware.algasensor.device.management.domain.model.Sensor;
import com.lampasoftware.algasensor.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, SensorId> {
}
