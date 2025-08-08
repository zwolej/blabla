package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testServiceLogic() {
        String result = myService.process();
        assertTrue("Result should contain 'success'", result.contains("success"));
    }
}
