package com.lampasoftware.algasensor.device.management.api.client;

import com.lampasoftware.algasensor.device.management.api.model.SensorDetailOutput;
import com.lampasoftware.algasensor.device.management.api.model.SensorMonitoringOutput;
import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {
    void enableMonitoring(TSID sensorId);
    void disableMonitoring(TSID sensorId);
    SensorMonitoringOutput getDetail(TSID sensorId);
}
