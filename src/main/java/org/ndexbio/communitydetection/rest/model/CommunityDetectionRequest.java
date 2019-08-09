package org.ndexbio.communitydetection.rest.model;

import java.util.Map;

/**
 * Represents an Community Detection Request
 * @author churas
 */
public class CommunityDetectionRequest {
    
    private String _algorithm;
    private Boolean _graphdirected;
    private String _rootnetwork;
    private String _edgeList;
    private Map<String, String> _customParameters;

    public String getAlgorithm() {
        return _algorithm;
    }

    public void setAlgorithm(String _algorithm) {
        this._algorithm = _algorithm;
    }

    public Boolean getGraphdirected() {
        return _graphdirected;
    }

    public void setGraphdirected(Boolean _graphdirected) {
        this._graphdirected = _graphdirected;
    }

    public String getRootnetwork() {
        return _rootnetwork;
    }

    public void setRootnetwork(String _rootnetwork) {
        this._rootnetwork = _rootnetwork;
    }

    public String getEdgeList() {
        return _edgeList;
    }

    public void setEdgeList(String _edgeList) {
        this._edgeList = _edgeList;
    }

    public Map<String, String> getCustomParameters() {
        return _customParameters;
    }

    public void setCustomParameters(Map<String, String> _customParameters) {
        this._customParameters = _customParameters;
    }
    
    
}
