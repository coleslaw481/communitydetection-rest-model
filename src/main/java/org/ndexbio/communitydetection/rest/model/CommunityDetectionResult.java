package org.ndexbio.communitydetection.rest.model;

import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 *
 * @author churas
 */
public class CommunityDetectionResult extends CommunityDetectionResultStatus {
    private JsonNode result;
 
    public CommunityDetectionResult(){
        super();
    }
    public CommunityDetectionResult(long startTime){
        super(startTime);
    }
    
    public CommunityDetectionResult updateStartTime(CommunityDetectionResult eqs) {
        super.updateStartTime(eqs);
        return this;
    }

    @Schema(description="Result in json fragment")
    public JsonNode getResult() {
        return result;
    }

    public void setResult(JsonNode result) {
        this.result = result;
    }
}
