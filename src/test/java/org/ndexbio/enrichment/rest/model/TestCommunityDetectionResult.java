package org.ndexbio.enrichment.rest.model;

import org.ndexbio.communitydetection.rest.model.CommunityDetectionResult;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author churas
 */
public class TestCommunityDetectionResult {
    
    @Test
    public void testConstructorWithStartTime(){
        CommunityDetectionResult eqr = new CommunityDetectionResult(1);
        assertEquals(1, eqr.getStartTime());
    }
    
    @Test
    public void testUpdateStartTime(){
        CommunityDetectionResult eqr = new CommunityDetectionResult(1);
        assertEquals(1, eqr.getStartTime());
        CommunityDetectionResult updated = new CommunityDetectionResult();
        assertEquals(0, updated.getStartTime());
        
        updated.updateStartTime(eqr);
        assertEquals(1, updated.getStartTime());
        
        // try null copy which doesnt change anything
        updated.updateStartTime(null);
        assertEquals(1, updated.getStartTime());
        
    }
    
    @Test
    public void testGettersAndSetters(){
        CommunityDetectionResult eqr = new CommunityDetectionResult();
        assertEquals(null, eqr.getMessage());
        assertEquals(0, eqr.getProgress());
        assertEquals(0, eqr.getStartTime());
        assertEquals(null, eqr.getStatus());
        assertEquals(0, eqr.getWallTime());
        
        eqr.setMessage("message");
        eqr.setProgress(2);
        
        eqr.setStartTime(5);
        eqr.setStatus("status");
        eqr.setWallTime(6);
        
        
        assertEquals("message", eqr.getMessage());
        assertEquals(2, eqr.getProgress());
        assertEquals(5, eqr.getStartTime());
        assertEquals("status", eqr.getStatus());
        assertEquals(6, eqr.getWallTime());
    }
}
