package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Map;

/**
 *
 * @author churas
 */
public class TermMappingRequest {
    
    private String _algorithm;
    private String _resultEdgeList;
    private String _ipAddress;
    private Map<String, String> _customParameters;

    public String getAlgorithm() {
        return _algorithm;
    }

    public void setAlgorithm(String _algorithm) {
        this._algorithm = _algorithm;
    }

    @Schema(description="edge list from community detection result in form of: SOURCENODE1,TARGETNODE1,INTERACTION1; "
            + "Note: INTERACTION must be either c-c 'community to community' or c-m' 'community to member' where member is gene",
            example="6,5,c-c;5,1,c-m;5,2,c-m;5,3,c-m;5,4,c-m;\\n")
    public String getResultEdgeList() {
        return _resultEdgeList;
    }

    public void setResultEdgeList(String _resultEdgeList) {
        this._resultEdgeList = _resultEdgeList;
    }

    public String getIpAddress() {
        return _ipAddress;
    }

    public void setIpAddress(String _ipAddress) {
        this._ipAddress = _ipAddress;
    }

    public Map<String, String> getCustomParameters() {
        return _customParameters;
    }

    public void setCustomParameters(Map<String, String> _customParameters) {
        this._customParameters = _customParameters;
    }
    
    
    
    
}
