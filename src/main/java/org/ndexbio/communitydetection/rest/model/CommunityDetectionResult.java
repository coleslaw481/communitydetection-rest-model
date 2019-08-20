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

    @Schema(description="Result as edge list in form of: SOURCENODE1\\tTARGETNODE1\\tINTERACTION1\\n",
            example="6,5,term-term;5,1,term-gene;5,2,term-gene;5,3,term-gene;5,4,term-gene;\\n")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
