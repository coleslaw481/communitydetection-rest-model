package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *
 * @author churas
 */
public class CustomParameters {
    
    private String name;
    private String description;
    private String type;
    private String defaultValue;

    @Schema(description="Name of parameter")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Schema(description="Parameter description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Schema(description="Type of parameter, can be flag if no argument value, "
            + "int for integers, float, or str for strings")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Schema(description="Default value for node as string, if type is flag "
            + "then this should "
            + "be an empty string")
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    
    
}
