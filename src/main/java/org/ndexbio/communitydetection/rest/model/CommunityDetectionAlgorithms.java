package org.ndexbio.communitydetection.rest.model;

import java.util.Set;

/**
 *
 * @author churas
 */
public class CommunityDetectionAlgorithms {
    
    private Set<CommunityDetectionAlgorithm> algorithms;

    public Set<CommunityDetectionAlgorithm> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(Set<CommunityDetectionAlgorithm> algorithms) {
        this.algorithms = algorithms;
    }
}
