package com.lampasoftware.algasensor.device.management;

import com.lampasoftware.algasensor.device.management.common.IdGenerator;
import io.hypersistence.tsid.TSID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TSIDTest {

    @Test
    public void shouldGenerateTSID(){
        TSID tsid = TSID.fast();
        System.out.println(tsid);
        System.out.println(tsid.toLong());
        System.out.println(tsid.getInstant());

        TSID tsid2 = TSID.Factory.getTsid();
        System.setProperty("tsid.node", "2");
        System.setProperty("tsid.node.count", "32");
        System.out.println(tsid2);
        System.out.println(tsid2.toLong());
        System.out.println(tsid2.getInstant());

        TSID tsid3 = IdGenerator.generateTSID();
        Assertions.assertThat(tsid3.getInstant())
                .isCloseTo(Instant.now(), Assertions.within(1, ChronoUnit.MINUTES));



    }
}
