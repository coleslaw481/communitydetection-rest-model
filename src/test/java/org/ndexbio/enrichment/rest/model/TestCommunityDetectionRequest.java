package org.ndexbio.enrichment.rest.model;

import com.fasterxml.jackson.databind.node.TextNode;
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
        eq.setGraphdirected(Boolean.TRUE);
        eq.setData(new TextNode("hi"));
        assertEquals("algo", eq.getAlgorithm());
        assertEquals("hi", eq.getData().asText());
    }
}
