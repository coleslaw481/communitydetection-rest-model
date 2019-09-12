package org.ndexbio.communitydetection.rest.model;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author churas
 */
public class TestServerStatus {
    
    public TestServerStatus() {
    }
    

    @Test
    public void testGettersAndSetters(){
        ServerStatus ss = new ServerStatus();
        assertEquals(null, ss.getLoad());
        assertEquals(0, ss.getPcDiskFull());
        assertEquals(0, ss.getCompletedTasks());
        assertEquals(0, ss.getQueuedTasks());
        assertEquals(null, ss.getRestVersion());
        assertEquals(null, ss.getStatus());
        assertEquals(0, ss.getCanceledTasks());
        
        ArrayList<Float> load = new ArrayList<>();
        load.add(Float.NaN);
        ss.setLoad(load);
        ss.setPcDiskFull(10);
        ss.setQueuedTasks(1);
        ss.setCompletedTasks(2);
        ss.setCanceledTasks(3);
        
        ss.setRestVersion("version");
        ss.setStatus("status");
        
        assertEquals((float)Float.NaN, (float)ss.getLoad().get(0));
        assertEquals(10, ss.getPcDiskFull());
        assertEquals(1, ss.getQueuedTasks());
        assertEquals(2, ss.getCompletedTasks());
        assertEquals(3, ss.getCanceledTasks());
        assertEquals("version", ss.getRestVersion());
        assertEquals("status", ss.getStatus());
        
        
        
    }
}
