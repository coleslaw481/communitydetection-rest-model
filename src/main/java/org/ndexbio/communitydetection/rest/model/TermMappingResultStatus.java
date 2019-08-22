package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *
 * @author churas
 */
public class TermMappingResultStatus extends JobStatus {

    private String _id;
    private String _status;
    private String _message;
    private int _progress;
    private long _wallTime;
    private long _startTime;
    
    public TermMappingResultStatus(){
        
    }
    
    /**
     * Creates new {@link #CommunityDetectionRequestStatus} object setting {@link #getStartTime() }
     * to {@code startTime} passed into this method.
     * @param startTime Current time in milliseconds, usually set with value from {@link java.lang.System.currentTimeMillis()}
     */
    public TermMappingResultStatus(long startTime){
        _startTime = startTime;
    }
    
    /**
     * Creates new {@link #EnrichmentQueryStatus} by copying data
     * from {@code cdr} passed in
     * @param cdr {@link org.ndexbio.communitydetection.rest.model.CommunityDetectionResult} to copy from
     */
    public TermMappingResultStatus(CommunityDetectionResult cdr){
        if (cdr == null){
            return;
        }
        _id = cdr.getId();
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
    public TermMappingResultStatus updateStartTime(TermMappingResultStatus cdrs){
        if (cdrs == null){
            return this;
        }
        if (cdrs.getStartTime() > _startTime){
            _startTime = cdrs.getStartTime();
        }
        return this;
    }

    @Schema(description="Id of Community Detection Request", example="261fb9b7-75af-4f1a-9caa-e57a4b5fc349")
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }
    
    @Schema(description="Status of task can be (" + COMMA_DELIM_STATUS + ")", example=SUBMITTED_STATUS)
    public String getStatus() {
        return _status;
    }

    public void setStatus(String _status) {
        this._status = _status;
    }

    @Schema(description="null or a message denoting a possible issue")
    public String getMessage() {
        return _message;
    }

    public void setMessage(String _message) {
        this._message = _message;
    }

    @Schema(description="int between 0 and 100 denoting progress of task")
    public int getProgress() {
        return _progress;
    }

    public void setProgress(int _progress) {
        this._progress = _progress;
    }

    @Schema(description="Walltime in milliseconds task took to run")
    public long getWallTime() {
        return _wallTime;
    }

    public void setWallTime(long _wallTime) {
        this._wallTime = _wallTime;
    }

    @Schema(description="Time in milliseconds since 1969 epoch when task started")
    public long getStartTime() {
        return _startTime;
    }

    public void setStartTime(long _startTime) {
        this._startTime = _startTime;
    }
}
