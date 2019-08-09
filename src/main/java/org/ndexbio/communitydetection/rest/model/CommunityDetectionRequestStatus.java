package org.ndexbio.communitydetection.rest.model;

/**
 *
 * @author churas
 */
public class CommunityDetectionRequestStatus {
    
    public static final String SUBMITTED_STATUS = "submitted";
    public static final String PROCESSING_STATUS = "processing";
    public static final String COMPLETE_STATUS = "complete";
    public static final String FAILED_STATUS = "failed";

    private String _status;
    private String _message;
    private int _progress;
    private long _wallTime;
    private long _startTime;
    
    public CommunityDetectionRequestStatus(){
        
    }
    
    /**
     * Creates new {@link #CommunityDetectionRequestStatus} object setting {@link #getStartTime() }
     * to {@code startTime} passed into this method.
     * @param startTime Current time in milliseconds, usually set with value from {@link java.lang.System.currentTimeMillis()}
     */
    public CommunityDetectionRequestStatus(long startTime){
        _startTime = startTime;
    }
    
    /**
     * Creates new {@link #EnrichmentQueryStatus} by copying data
     * from {@code cdr} passed in
     * @param cdr {@link org.ndexbio.communitydetection.rest.model.CommunityDetectionResult} to copy from
     */
    public CommunityDetectionRequestStatus(CommunityDetectionResult cdr){
        if (cdr == null){
            return;
        }
        _status = cdr.getStatus();
        _message = cdr.getMessage();
        _progress = cdr.getProgress();
        _wallTime = cdr.getWallTime();
        _startTime = cdr.getStartTime();
    }
 
    /**
     * Updates start time with value from {@code cdrs} passed in if that
     * time is greater then the time in this object.
     * @param cdrs
     * @return Returns this object
     */
    public CommunityDetectionRequestStatus updateStartTime(CommunityDetectionRequestStatus cdrs){
        if (cdrs == null){
            return this;
        }
        if (cdrs.getStartTime() > _startTime){
            _startTime = cdrs.getStartTime();
        }
        return this;
    }
    
    public String getStatus() {
        return _status;
    }

    public void setStatus(String _status) {
        this._status = _status;
    }

    public String getMessage() {
        return _message;
    }

    public void setMessage(String _message) {
        this._message = _message;
    }

    public int getProgress() {
        return _progress;
    }

    public void setProgress(int _progress) {
        this._progress = _progress;
    }

    public long getWallTime() {
        return _wallTime;
    }

    public void setWallTime(long _wallTime) {
        this._wallTime = _wallTime;
    }

    public long getStartTime() {
        return _startTime;
    }

    public void setStartTime(long _startTime) {
        this._startTime = _startTime;
    }
}
