package org.ndexbio.communitydetection.rest.model.exceptions;

import org.ndexbio.communitydetection.rest.model.ErrorResponse;

/**
 * Exception that is thrown when an invalid request is received by the service
 * @author churas
 */
public class CommunityDetectionBadRequestException extends CommunityDetectionException {
    
    private ErrorResponse _er;
    
    public CommunityDetectionBadRequestException(String message)
    {
        super(message);
    }
    
    public CommunityDetectionBadRequestException(String message, ErrorResponse er){
        this(message);
        this._er = er;
    }
    
    public ErrorResponse getErrorResponse(){
        return _er;
    }
}
