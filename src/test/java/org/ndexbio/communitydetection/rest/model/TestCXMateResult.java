package org.ndexbio.communitydetection.rest.model;

import com.fasterxml.jackson.databind.node.TextNode;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author churas
 */
public class TestCXMateResult {
	
	@Test
	public void testConstructorOverloadedWithAlgoAndErrorNull(){	
		
		CXMateResult res = new CXMateResult(null, null);
		assertTrue(res.getData().asText().equals(""));
		assertEquals(1, res.getErrors().size());
		CXMateError cError = res.getErrors().get(0);
		assertEquals("Unknown", cError.getMessage());
		assertEquals(CXMateResult.URN + "unknown:500", cError.getType());
		assertEquals(500, cError.getStatus());
		assertEquals(CXMateResult.LINK, cError.getLink());
		
		assertEquals("{\"data\":\"\",\"errors\":[{\"type\":\"urn:cytoscape:communitydetection:unknown:500\",\"message\":\"Unknown\",\"link\":\"https://github.com/cytoscape/communitydetection-rest-server\",\"status\":500}]}",
				res.asJson().replaceAll("\\s+", ""));
	}
	
	@Test
	public void testConstructorOverloadedWithAlgoAndErrorUnSet(){
		ErrorResponse er = new ErrorResponse();
		
		CXMateResult res = new CXMateResult(null, er);
		assertTrue(res.getData().asText().equals(""));
		assertEquals(1, res.getErrors().size());
		CXMateError cError = res.getErrors().get(0);
		assertEquals("Unknown", cError.getMessage());
		assertEquals(CXMateResult.URN + "unknown:500", cError.getType());
		assertEquals(500, cError.getStatus());
		assertEquals(CXMateResult.LINK, cError.getLink());
		
		assertEquals("{\"data\":\"\",\"errors\":[{\"type\":\"urn:cytoscape:communitydetection:unknown:500\",\"message\":\"Unknown\",\"link\":\"https://github.com/cytoscape/communitydetection-rest-server\",\"status\":500}]}",
				res.asJson().replaceAll("\\s+", ""));
	}
	
	@Test
	public void testConstructorOverloadedWithAlgoAndErrorAllSet(){
		ErrorResponse er = new ErrorResponse();
		er.setDescription("description");
		er.setMessage("message");
		
		CXMateResult res = new CXMateResult("algo", er);
		assertTrue(res.getData().asText().equals(""));
		assertEquals(1, res.getErrors().size());
		CXMateError cError = res.getErrors().get(0);
		assertEquals("message : description", cError.getMessage());
		assertEquals(CXMateResult.URN + "algo:500", cError.getType());
		assertEquals(500, cError.getStatus());
		assertEquals(CXMateResult.LINK, cError.getLink());
		
		assertEquals("{\"data\":\"\",\"errors\":[{\"type\":\"urn:cytoscape:communitydetection:algo:500\",\"message\":\"message:description\",\"link\":\"https://github.com/cytoscape/communitydetection-rest-server\",\"status\":500}]}",
				res.asJson().replaceAll("\\s+", ""));
	}
	
	@Test
	public void testConstructorOverloadedWithExceptionUnset(){
		CXMateResult res = new CXMateResult(null, null, 1, null);
		assertTrue(res.getData().asText().equals(""));
		assertEquals(1, res.getErrors().size());
		CXMateError cError = res.getErrors().get(0);
		assertEquals("Unknown", cError.getMessage());
		assertEquals(CXMateResult.URN + "unknown:1", cError.getType());
		assertEquals(1, cError.getStatus());
		assertEquals(CXMateResult.LINK, cError.getLink());
		
		assertEquals("{\"data\":\"\",\"errors\":[{\"type\":\"urn:cytoscape:communitydetection:unknown:1\",\"message\":\"Unknown\",\"link\":\"https://github.com/cytoscape/communitydetection-rest-server\",\"status\":1}]}",
				res.asJson().replaceAll("\\s+", ""));
	}
	
	@Test
	public void testConstructorOverloadedWithExceptionWithNullMessage(){
		CXMateResult res = new CXMateResult("anerror", "algo", 1, new Exception());
		assertTrue(res.getData().asText().equals(""));
		assertEquals(1, res.getErrors().size());
		CXMateError cError = res.getErrors().get(0);
		assertEquals("anerror", cError.getMessage());
		assertEquals(CXMateResult.URN + "algo:1", cError.getType());
		assertEquals(1, cError.getStatus());
		assertEquals(CXMateResult.LINK, cError.getLink());
		
		assertEquals("{\"data\":\"\",\"errors\":[{\"type\":\"urn:cytoscape:communitydetection:algo:1\",\"message\":\"anerror\",\"link\":\"https://github.com/cytoscape/communitydetection-rest-server\",\"status\":1}]}",
				res.asJson().replaceAll("\\s+", ""));
	}
	
	@Test
	public void testConstructorOverloadedWithException(){
		CXMateResult res = new CXMateResult("anerror", "algo", 1, new Exception("foo"));
		assertTrue(res.getData().asText().equals(""));
		assertEquals(1, res.getErrors().size());
		CXMateError cError = res.getErrors().get(0);
		assertEquals("anerror : foo", cError.getMessage());
		assertEquals(CXMateResult.URN + "algo:1", cError.getType());
		assertEquals(1, cError.getStatus());
		assertEquals(CXMateResult.LINK, cError.getLink());
		
		assertEquals("{\"data\":\"\",\"errors\":[{\"type\":\"urn:cytoscape:communitydetection:algo:1\",\"message\":\"anerror:foo\",\"link\":\"https://github.com/cytoscape/communitydetection-rest-server\",\"status\":1}]}",
				res.asJson().replaceAll("\\s+", ""));
	}
	
	@Test
	public void testGettersAndSettersWithEmptyConstructor(){
		CXMateResult res = new CXMateResult();
		assertTrue(res.getData().asText().equals(""));
		assertNull(res.getErrors());
		
		assertEquals("{\"data\":\"\",\"errors\":[]}",
				res.asJson().replaceAll("\\s+", ""));
		
		res.setErrors(new ArrayList<>());
		assertEquals("{\"data\":\"\",\"errors\":[]}",
				res.asJson().replaceAll("\\s+", ""));

		res.setData(new TextNode("hi"));
		
		CXMateError error = new CXMateError();
		error.setLink("link");
		error.setMessage("message");
		error.setStatus(4);
		error.setType("type");
		res.setErrors(Arrays.asList(error));
		
		assertTrue(res.getData().asText().equals("hi"));
		assertEquals(1, res.getErrors().size());
		assertEquals("link", res.getErrors().get(0).getLink());
		assertEquals("message", res.getErrors().get(0).getMessage());
		assertEquals(4, res.getErrors().get(0).getStatus());
		assertEquals("type", res.getErrors().get(0).getType());
	}
}
