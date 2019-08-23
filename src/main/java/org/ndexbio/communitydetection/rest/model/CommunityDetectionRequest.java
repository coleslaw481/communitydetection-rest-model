package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Map;

/**
 * Represents an Community Detection Request
 * @author churas
 */
public class CommunityDetectionRequest {
    
    private String algorithm;
    private Boolean graphdirected;
    private String edgeList;
    private String ipAddress;
    private Map<String, String> customParameters;

    /**
     * Gets the name of the algorithm to use with this request
     * @return 
     */
    @Schema(description="Name of algorithm to run", example="louvain")
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the name of the algorithm to use with this request
     * @param _algorithm 
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Gets whether the community detection algorithm should generate
     * a directed graph or not
     * 
     * @return 
     */
    @Schema(description="Set to true to request a directed graph from community detection algorithm")
    public Boolean getGraphdirected() {
        return graphdirected;
    }

    /**
     * Sets whether the community detection algorithm should generate
     * a directed graph or not
     * @param _graphdirected Set to true for directed results
     */
    public void setGraphdirected(Boolean graphdirected) {
        this.graphdirected = graphdirected;
    }

    /**
     * Gets edgelist as string which should be in format of
     * SOURCENODE1\tTARGETNODE1\nSOURCENODE2\tTARGETNODE2\n
     * @return 
     */
    @Schema(description="Edge as CX network, for optional weights set edge attribute named 'weight OR "
            + "Edge list in form of SOURCENODE1\\tTARGETNODE1\\nSOURCENODE2\\tTARGETNODE2\\n "
            + "with optional 3rd tab delimited column containing weight")
    public String getEdgeList() {
        return edgeList;
    }

    /**
     * Sets edgelist as string which should be in format of
     * SOURCENODE1\tTARGETNODE1\nSOURCENODE2\tTARGETNODE2\n
     * @param _edgeList 
     */
    public void setEdgeList(String edgeList) {
        this.edgeList = edgeList;
    }

    @Schema(description="IP address where request originated")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    @Schema(description="Optional custom parameters for community detection algorithm")
    public Map<String, String> getCustomParameters() {
        return customParameters;
    }

    public void setCustomParameters(Map<String, String> customParameters) {
        this.customParameters = customParameters;
    }
}
