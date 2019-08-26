package org.ndexbio.communitydetection.rest.model;

import java.util.List;

/**
 *
 * @author churas
 */
public class CommunityDetectionAlgorithm {
    
    private String name;
    private String description;
    private List<CustomParameters> customParameters;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CustomParameters> getCustomParameters() {
        return customParameters;
    }

    public void setCustomParameters(List<CustomParameters> customParameters) {
        this.customParameters = customParameters;
    }
}
