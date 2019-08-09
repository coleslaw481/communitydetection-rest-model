package org.ndexbio.communitydetection.rest.model;


/**
 *
 * @author churas
 */
public class CommunityDetectionResult extends CommunityDetectionRequestStatus {
    private String result;

    
    public CommunityDetectionResult(){
        super();
    }
    public CommunityDetectionResult(long startTime){
        super(startTime);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
