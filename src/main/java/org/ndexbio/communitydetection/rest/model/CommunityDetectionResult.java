package org.ndexbio.communitydetection.rest.model;


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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
