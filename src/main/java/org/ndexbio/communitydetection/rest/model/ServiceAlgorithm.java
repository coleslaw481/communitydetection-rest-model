package org.ndexbio.communitydetection.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author churas
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceAlgorithm {
    
    private String name;
    private String displayName;
    private String description;
    private String version;
	
    private HashMap<String, AlgorithmCustomParameter> parameters;
    
    @Schema(description="Name of algorithm")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Schema(description="Display name of algorithm")
    public String getDisplayName() {
	return displayName;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }

    @Schema(description="Description of algorithm")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Schema(description="Version of algorithm")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Schema(description="Any custom parameters this algorithm accepts")
    public Set<AlgorithmCustomParameter> getParameters() {
        if (parameters == null){
            return null;
        }
        return new HashSet(parameters.values());
    }

    public void setParameters(Set<AlgorithmCustomParameter> parameters) {
        if (parameters == null){
            this.parameters = null;
            return;
        }
        if (this.parameters == null){
            this.parameters = new HashMap<>();
        }else {
            this.parameters.clear();
        }
        for (AlgorithmCustomParameter cp : parameters){
            if (cp.getDisplayName()== null){
                continue;
            }
            this.parameters.put(cp.getDisplayName(), cp);
        }
    }
    
    @JsonIgnore
    public Map<String, AlgorithmCustomParameter> getCustomParameterMap(){
        return this.parameters;
    }
}
