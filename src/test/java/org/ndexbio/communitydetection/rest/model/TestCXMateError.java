package org.ndexbio.communitydetection.rest.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author churas
 */
public class TestCXMateError {
	
	@Test
	public void testGettersAndSetters(){
		CXMateError error = new CXMateError();
		assertEquals(null, error.getType());
		assertEquals(null, error.getMessage());
		assertEquals(null, error.getLink());
		assertEquals(0, error.getStatus());
		error.setType("type");
		error.setMessage("message");
		error.setLink("link");
		error.setStatus(1);
		
		assertEquals("type", error.getType());
		assertEquals("message", error.getMessage());
		assertEquals("link", error.getLink());
		assertEquals(1, error.getStatus());

		assertEquals("{\"type\":\"type\",\"message\":\"message\","
				+ "\"link\":\"link\",\"status\":1}",
				error.asJson().replaceAll("\\s+", ""));
	}
	
}
