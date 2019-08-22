package org.ndexbio.communitydetection.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *
 * @author churas
 */
public class TermMappingResult extends TermMappingResultStatus {
    
    private String _resultAsCX;

    @Schema(description="Result in CX format ",
            example="TODO")
    public String getResultAsCX() {
        return _resultAsCX;
    }

    public void setResultAsCX(String _resultAsCX) {
        this._resultAsCX = _resultAsCX;
    }
}
