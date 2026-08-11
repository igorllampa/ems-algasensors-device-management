package com.lampasoftware.algasensor.device.management.api.model;

import io.hypersistence.tsid.TSID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorDetailOutput {

    private SensorOutput sensor;
    private SensorMonitoringOutput monitoring;
}
