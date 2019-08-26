package org.ndexbio.communitydetection.rest.model;

import java.util.List;

/**
 *
 * @author churas
 */
public class CommunityDetectionAlgorithms {
    
    private List<CommunityDetectionAlgorithm> algorithms;

    public List<CommunityDetectionAlgorithm> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(List<CommunityDetectionAlgorithm> algorithms) {
        this.algorithms = algorithms;
    }
}
