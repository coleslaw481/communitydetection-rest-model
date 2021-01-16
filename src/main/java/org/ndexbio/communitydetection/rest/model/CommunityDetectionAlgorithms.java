package org.ndexbio.communitydetection.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.LinkedHashMap;

/**
 *
 * @author churas
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommunityDetectionAlgorithms {
    
    private LinkedHashMap<String, CommunityDetectionAlgorithm> algorithms;

    public LinkedHashMap<String, CommunityDetectionAlgorithm> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(LinkedHashMap<String, CommunityDetectionAlgorithm> algorithms) {
        this.algorithms = algorithms;
    }
}
