package org.ndexbio.communitydetection.rest.model;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * Represents status of the server
 * @author churas
 */
public class ServerStatus {
    
    
    public static final String OK_STATUS = "ok";
    public static final String ERROR_STATUS = "error";
    
    private String status;
    private int pcDiskFull;
    private List<Float> load;
    private List<Integer> queries;
    private String restVersion;
    

    public ServerStatus(){
    }

    /**
     * Gets status of server which can be either {@link #OK_STATUS} or
     * {@link #ERROR_STATUS}
     * @return Status as a string
     */
    @Schema(description="Status of server", allowableValues={ServerStatus.OK_STATUS,
                                                             ServerStatus.ERROR_STATUS})
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Schema(description="Gets how full disk is as a percentage 0 - 100")
    public int getPcDiskFull() {
        return pcDiskFull;
    }

    public void setPcDiskFull(int pcDiskFull) {
        this.pcDiskFull = pcDiskFull;
    }

    @Schema(description="List of 3 floats containing 1 minute, 5 minute, 15minute load")
    public List<Float> getLoad() {
        return load;
    }

    public void setLoad(List<Float> load) {
        this.load = load;
    }

    @Schema(description="List of 5 integers containing # queries in last minute, 5 minutes, 15 minutes, hour, 24 hours")
    public List<Integer> getQueries() {
        return queries;
    }

    public void setQueries(List<Integer> queries) {
        this.queries = queries;
    }

   
    @Schema(description="Gets version of this service")
    public String getRestVersion() {
        return restVersion;
    }

    public void setRestVersion(String restVersion) {
        this.restVersion = restVersion;
    }    
}
