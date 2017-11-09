package com.cmbo;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {

    @Test
    public void testValidator() throws Exception {
        Validator validator = new Validator();
        String payload = "{\"id\":1,\"firstName\":\"Lokesh\",\"lastName\":\"Gupta\",\"roles\":[\"ADMIN\",\"MANAGER\"]}";
        String result = validator.validate(payload);
        Assert.assertEquals(result,payload);

        String result1 = validator.validate(payload, "com.cmbo.Employee");
        Assert.assertEquals(result1, payload);
    }

}
