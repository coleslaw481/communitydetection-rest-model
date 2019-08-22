package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Map;

/**
 * Represents an Community Detection Request
 * @author churas
 */
public class CommunityDetectionRequest {
    
    private String _algorithm;
    private Boolean _graphdirected;
    private String _edgeList;
    private String _ipAddress;
    private Map<String, String> _customParameters;

    /**
     * Gets the name of the algorithm to use with this request
     * @return 
     */
    @Schema(description="Name community detection algorithm to run", example="louvain")
    public String getAlgorithm() {
        return _algorithm;
    }

    /**
     * Sets the name of the algorithm to use with this request
     * @param _algorithm 
     */
    public void setAlgorithm(String _algorithm) {
        this._algorithm = _algorithm;
    }

    /**
     * Gets whether the community detection algorithm should generate
     * a directed graph or not
     * 
     * @return 
     */
    @Schema(description="Set to true to request a directed graph from community detection algorithm")
    public Boolean getGraphdirected() {
        return _graphdirected;
    }

    /**
     * Sets whether the community detection algorithm should generate
     * a directed graph or not
     * @param _graphdirected Set to true for directed results
     */
    public void setGraphdirected(Boolean _graphdirected) {
        this._graphdirected = _graphdirected;
    }

    /**
     * Gets edgelist as string which should be in format of
     * SOURCENODE1\tTARGETNODE1\nSOURCENODE2\tTARGETNODE2\n
     * @return 
     */
    @Schema(description="Edge list in form of SOURCENODE1\\tTARGETNODE1\\nSOURCENODE2\\tTARGETNODE2\\n with optional 3rd tab delimited column containing weight")
    public String getEdgeList() {
        return _edgeList;
    }

    /**
     * Sets edgelist as string which should be in format of
     * SOURCENODE1\tTARGETNODE1\nSOURCENODE2\tTARGETNODE2\n
     * @param _edgeList 
     */
    public void setEdgeList(String _edgeList) {
        this._edgeList = _edgeList;
    }

    @Schema(description="IP address where request originated")
    public String getIpAddress() {
        return _ipAddress;
    }

    public void setIpAddress(String _ipAddress) {
        this._ipAddress = _ipAddress;
    }
    
    @Schema(description="Optional custom parameters for community detection algorithm")
    public Map<String, String> getCustomParameters() {
        return _customParameters;
    }

    public void setCustomParameters(Map<String, String> _customParameters) {
        this._customParameters = _customParameters;
    }
    
    
}
