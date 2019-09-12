package org.ndexbio.communitydetection.rest.model;

import com.fasterxml.jackson.databind.node.TextNode;
import java.util.HashMap;
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
        eq.setIpAddress("1.2.3.4");
        eq.setGraphdirected(Boolean.TRUE);
        HashMap<String, String> cParams = new HashMap<>();
        cParams.put("hi", "bye");
        eq.setCustomParameters(cParams);
        assertEquals("algo", eq.getAlgorithm());
        assertEquals("hi", eq.getData().asText());
        assertEquals("1.2.3.4", eq.getIpAddress());
        assertEquals(Boolean.TRUE, eq.getGraphdirected());
        assertEquals("bye", eq.getCustomParameters().get("hi"));
    }
}
