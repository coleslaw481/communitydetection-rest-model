package org.ndexbio.communitydetection.rest.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;


/**
 * Server Meta data
 * @author churas
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommunityDetectionMetaData {
	private String _name;
	private String _description;
	private List<CommunityDetectionAlgorithm> _algorithms;

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String _description) {
		this._description = _description;
	}

	public List<CommunityDetectionAlgorithm> getAlgorithms() {
		return _algorithms;
	}

	public void setAlgorithms(List<CommunityDetectionAlgorithm> _algorithms) {
		this._algorithms = _algorithms;
	}
	
	
}
