package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;


/**
 *
 * @author churas
 */
public class CommunityDetectionResult extends CommunityDetectionResultStatus {
    private String result;
 
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

    @Schema(description="Result in either CX format or as edge list in form of: SOURCENODE1\\tTARGETNODE1\\tINTERACTION1;",
            example="6,5,c-c;5,1,c-m;5,2,c-m;5,3,c-m;5,4,c-m;\\n")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
