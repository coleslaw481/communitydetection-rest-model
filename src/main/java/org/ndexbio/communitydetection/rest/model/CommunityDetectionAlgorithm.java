package org.ndexbio.communitydetection.rest.model;

import java.util.Set;

/**
 *
 * @author churas
 */
public class CommunityDetectionAlgorithm {
    
    private String name;
    private String description;
    private Set<CustomParameters> customParameters;
    
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

    public Set<CustomParameters> getCustomParameters() {
        return customParameters;
    }

    public void setCustomParameters(Set<CustomParameters> customParameters) {
        this.customParameters = customParameters;
    }
}
