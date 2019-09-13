package org.ndexbio.communitydetection.rest.model;

import java.util.HashMap;

/**
 *
 * @author churas
 */
public class CommunityDetectionAlgorithms {
    
    private HashMap<String, CommunityDetectionAlgorithm> algorithms;

    public HashMap<String, CommunityDetectionAlgorithm> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(HashMap<String, CommunityDetectionAlgorithm> algorithms) {
        this.algorithms = algorithms;
    }
}
