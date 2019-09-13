package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *
 * @author churas
 */
public class CustomParameter {
    
    private String name;
    private String displayName;
    private String description;
    private String type;
    private String defaultValue;
    private String validationType;
    private String validationHelp;
    private String validationRegex;
    private Double minValue;
    private Double maxValue;
    
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

    @Schema(description="Type of parameter",
            allowableValues={"value","flag"})
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Schema(description="Default value for parameter, for ")
    public String getDefaultValue() {
        return defaultValue;
    }

    
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Schema(description="Display name for parameter")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /*
                + " 'number' only allows floating point number or numbers with decimals\n"
            + " 'digits' is whole numbers and can include - for negative\n"
            + " Both 'number' and 'digits' can be limited by 'minValue' and 'maxValue'"
            + "'string' allows ASCI characters and can be limited by 'validationRegex'")

    */
    @Schema(description="Type of validation to perform",
            allowableValues={"number","digits","string"})
    public String getValidationType() {
        return validationType;
    }

    public void setValidationType(String validationType) {
        this.validationType = validationType;
    }

    @Schema(description="Text to display if validation fails")
    public String getValidationHelp() {
        return validationHelp;
    }

    public void setValidationHelp(String validationHelp) {
        this.validationHelp = validationHelp;
    }

    @Schema(description="Regular expression that is applied to parameters"
            + "of 'type' string")
    public String getValidationRegex() {
        return validationRegex;
    }

    public void setValidationRegex(String validationRegex) {
        this.validationRegex = validationRegex;
    }

    @Schema(description="If set and parameter is of type 'number' or 'digits', "
            + " values below this should NOT be allowed")
    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    @Schema(description="If set and parameter is of type 'number' or 'digits', "
            + " values above this should NOT be allowed")
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }
}
