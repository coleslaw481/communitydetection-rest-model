/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ndexbio.communitydetection.rest.model;

/**
 *
 * @author churas
 */
public class JobStatus {
    
    public static final String SUBMITTED_STATUS = "submitted";
    public static final String PROCESSING_STATUS = "processing";
    public static final String COMPLETE_STATUS = "complete";
    public static final String FAILED_STATUS = "failed";

    public static final String COMMA_DELIM_STATUS = SUBMITTED_STATUS + "," +
                                                    PROCESSING_STATUS + "," +
                                                    COMPLETE_STATUS + "," +
                                                    FAILED_STATUS;
}
