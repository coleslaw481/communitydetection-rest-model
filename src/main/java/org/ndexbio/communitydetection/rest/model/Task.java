package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *
 * @author churas
 */
public class Task {
    
    private String _id;

    @Schema(description="Id of Community Detection Request",
            example="261fb9b7-75af-4f1a-9caa-e57a4b5fc349")
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }
    
}
