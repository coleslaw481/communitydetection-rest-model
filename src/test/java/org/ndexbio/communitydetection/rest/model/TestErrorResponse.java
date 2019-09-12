package org.ndexbio.communitydetection.rest.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.ndexbio.communitydetection.rest.model.exceptions.CommunityDetectionException;
/**
 *
 * @author churas
 */
public class TestErrorResponse {
    
    @Test
    public void testConstructor(){
        ErrorResponse er = new ErrorResponse("hi", new CommunityDetectionException("yo"));

        assertEquals("hi", er.getMessage());
        assertEquals("yo", er.getDescription());
        assertEquals(Long.toString(Thread.currentThread().getId()), er.getThreadId());
        assertNotNull(er.getTimeStamp());
        assertTrue(er.getStackTrace().contains("testConstructor"));
    }
    
    @Test
    public void testAsJson(){
        ErrorResponse er = new ErrorResponse("hi", new CommunityDetectionException("yo"));
        String res = er.asJson();
        assertTrue(res.startsWith("{\"message\": \"hi\","));
        assertTrue(res.contains("\"description\": \"yo\","));
    }
    
    @Test
    public void testGettersAndSetters(){
        ErrorResponse er = new ErrorResponse("hi", new CommunityDetectionException("yo"));
        assertEquals("hi", er.getMessage());
        assertEquals("yo", er.getDescription());
        assertEquals(null, er.getErrorCode());
        assertTrue(er.getStackTrace().contains("TestErrorResponse"));
        assertEquals(Long.toString(Thread.currentThread().getId()),
                     er.getThreadId());
        er.setMessage("message");
        er.setDescription("description");
        er.setErrorCode("2");
        er.setStackTrace("trace");
        er.setThreadId("thread");
        er.setTimeStamp("hi");
        assertEquals("message", er.getMessage());
        assertEquals("description", er.getDescription());
        assertEquals("2", er.getErrorCode());
        assertEquals("trace", er.getStackTrace());
        assertEquals("thread", er.getThreadId());
        assertEquals("hi", er.getTimeStamp());
    }
}
