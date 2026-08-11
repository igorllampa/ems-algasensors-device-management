package com.lampasoftware.algasensor.device.management.api.config.jackson;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.hypersistence.tsid.TSID;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class StringToTSIDDeserializer extends JsonDeserializer<TSID> {

    @Override
    public TSID deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return TSID.from(jsonParser.getText());
    }
}
