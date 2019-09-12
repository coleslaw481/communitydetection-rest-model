package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Set;

/**
 *
 * @author churas
 */
public class CommunityDetectionAlgorithm {
    
    private String name;
    private String description;
    private String version;
    private String inputDataFormat;
    private String outputDataFormat;
    private Set<CustomParameter> customParameters;
    
    @Schema(description="Name of algorithm")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

     @Schema(description="Expected format of input data. Currently supported formats "
             + "are:\n"
             + "'CX' for NDEx exchange format: https://home.ndexbio.org/data-model/\n"
             + "'EDGELIST' in format: https://github.com/ndexbio/communitydetection-rest-server/wiki/EDGELIST-format\n"
             + "'COMMUNITYDETECTRESULT' in format: TODO")
    public String getInputDataFormat() {
        return inputDataFormat;
    }

    public void setInputDataFormat(String inputDataFormat) {
        this.inputDataFormat = inputDataFormat;
    }

    @Schema(description="Format of output data. Currently supported formats "
             + "are:\n"
             + "'CX' for NDEx exchange format: https://home.ndexbio.org/data-model/\n"
             + "'EDGELIST' in format: https://github.com/ndexbio/communitydetection-rest-server/wiki/EDGELIST-format\n"
             + "'COMMUNITYDETECTRESULT' in format: TODO")
    public String getOutputDataFormat() {
        return outputDataFormat;
    }

    public void setOutputDataFormat(String outputDataFormat) {
        this.outputDataFormat = outputDataFormat;
    }

    @Schema(description="Any custom parameters this algorithm accepts")
    public Set<CustomParameter> getCustomParameters() {
        return customParameters;
    }

    public void setCustomParameters(Set<CustomParameter> customParameters) {
        this.customParameters = customParameters;
    }
}
