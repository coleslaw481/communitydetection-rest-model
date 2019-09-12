package org.ndexbio.communitydetection.rest.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author churas
 */
public class TestCommunityDetectionResultStatus {
    
    @Test
    public void testConstructorThatTakesCommunityDetectionResult(){
        
        CommunityDetectionResultStatus cStatus = new CommunityDetectionResultStatus(null);
        assertEquals(0, cStatus.getStartTime());
        assertEquals(0, cStatus.getWallTime());
        assertEquals(0, cStatus.getProgress());
        assertEquals(null, cStatus.getMessage());
        assertEquals(null, cStatus.getId());
        
        CommunityDetectionResult cdr = new CommunityDetectionResult();
        cdr.setId("id");
        cdr.setMessage("message");
        cdr.setProgress(25);
        cdr.setWallTime(10);
        cdr.setStartTime(5);
        
        cStatus = new CommunityDetectionResultStatus(cdr);
        assertEquals(5, cStatus.getStartTime());
        assertEquals(10, cStatus.getWallTime());
        assertEquals(25, cStatus.getProgress());
        assertEquals("message", cStatus.getMessage());
        assertEquals("id", cStatus.getId());
        
        
    }
}
