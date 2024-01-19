package org.ndexbio.communitydetection.rest.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;


/**
 * Server Meta data
 * @author churas
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceMetaData {
	private String _name;
	private String _description;
	private String _inputDataFormat;
    private String _outputDataFormat;
	private List<ServiceAlgorithm> _algorithms;

	@Schema(description="Name of App/Service")
	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	@Schema(description="App/Service description")
	public String getDescription() {
		return _description;
	}

	public void setDescription(String _description) {
		this._description = _description;
	}

	@Schema(description="List of algorithms service/app provides")
	public List<ServiceAlgorithm> getAlgorithms() {
		return _algorithms;
	}

	public void setAlgorithms(List<ServiceAlgorithm> _algorithms) {
		this._algorithms = _algorithms;
	}

	@Schema(description="Expected format of input data. For supported formats see: "
            + " https://github.com/cytoscape/communitydetection-rest-server/wiki/Data-formats\n")
	public String getInputDataFormat() {
		return _inputDataFormat;
	}

	public void setInputDataFormat(String _inputDataFormat) {
		this._inputDataFormat = _inputDataFormat;
	}

	@Schema(description="Expected format of output data. For supported formats see: "
            + " https://github.com/cytoscape/communitydetection-rest-server/wiki/Data-formats\n")
	public String getOutputDataFormat() {
		return _outputDataFormat;
	}

	public void setOutputDataFormat(String _outputDataFormat) {
		this._outputDataFormat = _outputDataFormat;
	}
	
	
	
	
}
