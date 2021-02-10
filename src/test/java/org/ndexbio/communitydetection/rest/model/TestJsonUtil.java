package org.ndexbio.communitydetection.rest.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author churas
 */
public class TestJsonUtil {
	
	@Test
	public void testConstructor(){
		JsonUtil j = new JsonUtil();
		assertNotNull(j);
	}
	
	@Test
	public void testGetValueAsJsonString(){
		assertEquals("null", JsonUtil.getValueAsJsonString(null));
		
		//test with \n \r \t and " characters
		assertEquals("\"\\\"quote\\\"       \"",
				JsonUtil.getValueAsJsonString("\"quote\" \n\t\r\n\r\t"));
		
	}
}
