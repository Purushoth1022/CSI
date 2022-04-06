package com.lfg.csi.service;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.lfg.annuity.csi.lambda.CSISCreateLienRecord;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class CSISCreateLienRecordTest {

    private static APIGatewayProxyRequestEvent input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = null;
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testCSISCreateLienRecord() {
        CSISCreateLienRecord handler = new CSISCreateLienRecord();
        Context ctx = createContext();

        APIGatewayProxyResponseEvent output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        Assert.assertEquals("200", output.getStatusCode());
    }
}
