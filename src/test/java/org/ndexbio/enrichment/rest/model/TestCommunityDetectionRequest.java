package org.ndexbio.enrichment.rest.model;

import org.ndexbio.communitydetection.rest.model.CommunityDetectionRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author churas
 */
public class TestCommunityDetectionRequest {
    
    @Test
    public void testGettersAndSetters(){
        CommunityDetectionRequest eq = new CommunityDetectionRequest();
        eq.setAlgorithm("algo");
        eq.setEdgeList("edgey");
        eq.setGraphdirected(Boolean.TRUE);
        eq.setRootnetwork("root");
        assertEquals("algo", eq.getAlgorithm());
        

    }
}
