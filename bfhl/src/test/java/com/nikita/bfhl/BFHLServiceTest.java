/*package com.nikita.bfhl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BFHLServiceTest {

    @Test
    void testApplication() {

        assertTrue(true);

    }
}*/

package com.nikita.bfhl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.nikita.bfhl.dto.BFHLRequest;
import com.nikita.bfhl.service.BFHLServiceImpl;

public class BFHLServiceTest {

    @Test
    void testSumCalculation() {

        BFHLServiceImpl service = new BFHLServiceImpl();

        BFHLRequest request = new BFHLRequest();
        request.setData(Arrays.asList("1", "2", "3"));

        assertEquals("6", service.process(request).sum);
    }
}