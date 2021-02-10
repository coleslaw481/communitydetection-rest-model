package org.ndexbio.communitydetection.rest.model;

/**
 *
 * @author churas
 */
public class JsonUtil {
	
	public static String getValueAsJsonString(final String value){
        if (value == null){
            return "null";
        }
        return "\"" + value.replaceAll("\"", "\\\\\"").replaceAll("\n|\t|\r", " ") + "\"";
    }
}
