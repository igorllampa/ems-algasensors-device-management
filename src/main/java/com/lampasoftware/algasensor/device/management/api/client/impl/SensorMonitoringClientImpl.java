package com.lampasoftware.algasensor.device.management.api.client.impl;

import com.lampasoftware.algasensor.device.management.api.client.RestClientFactory;
import com.lampasoftware.algasensor.device.management.api.client.SensorMonitoringClient;
import com.lampasoftware.algasensor.device.management.api.model.SensorMonitoringOutput;
import io.hypersistence.tsid.TSID;
import org.springframework.web.client.RestClient;

/*
*  This class is not being used anymore because it is replaced by the use of RestClientHttp from Spring.
*  However, this class will be maintained here in order to have a implementation of this kind of methods, just for
*  study purposes.
*
* */
//@Component
public class SensorMonitoringClientImpl implements SensorMonitoringClient {

    private final RestClient restClient;

    public SensorMonitoringClientImpl(RestClientFactory restClientFactory) {
        this.restClient = restClientFactory.temperatureMonitoringRestClient();
    }

    @Override
    public void enableMonitoring(TSID sensorId) {
        restClient
                .put()
                .uri("/api/sensors/{sensorId}/monitoring/enable", sensorId)
                .retrieve()
                .toBodilessEntity();
    }

    @Override
    public void disableMonitoring(TSID sensorId) {
        restClient
                .delete()
                .uri("/api/sensors/{sensorId}/monitoring/disable", sensorId)
                .retrieve()
                .toBodilessEntity();
    }

    @Override
    public SensorMonitoringOutput getDetail(TSID sensorId) {
        return restClient
                .get()
                .uri("/api/sensors/{sensorId}/monitoring", sensorId)
                .retrieve()
                .body(SensorMonitoringOutput.class);
    }
}
