package com.allowify.client.AllowifyClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;

import com.allowify.client.model.Order;
import com.allowify.client.model.SocialUser;

/**
 * Unit test for simple App.
 */
public class AllowifyTest extends TestCase {
	
	private static String END_POINT = "http://rohterconsulting.com:8080/RohterFraud/";	
	private static String SUBMIT_ORDER_ACTION = "submitOrder";
	private static String REGISTER_USER_ACTION = "registerUser";
	
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AllowifyTest( String testName ) {
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite( AllowifyTest.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue( true );
	}
	
	/**
	 * This is a simple example of how to submit an order to Allowify
	 * so that a trust score can be calculated and returned.
	 * 
	 * NOTE: before you do this the user must be registed. See test
	 * below with an example on how to register a user in the Allowify System.
	 * 
	 * @throws IOException
	 */
	public void testOrderSubmission() throws IOException {

		String facebookID = "TheCustomersFacebookID";
		String firstName = "clientFirstName";
		String lastName = "clientLastName";
		String email = "clientEmail";
				
		URLConnection connection = buildURLConnection(SUBMIT_ORDER_ACTION);

		Order request = TestHelper.buildOrder(facebookID,firstName,lastName,email);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(connection.getOutputStream(), request);

		//JsonObject
		InputStream is = connection.getInputStream();
		String trustScoreJSON = IOUtils.toString(is, "UTF-8");
		System.out.println(trustScoreJSON);

	}
	
	/**
	 * This is an example of how to register a user to Allowify.
	 * 
	 * This gives allowify all the information/permissions it needs to handle
	 * order verification in the future.  This Step must be done before
	 * an order is submitted for trust score verification.
	 * 
	 * This action will just mirror the data submitted for now.
	 * 
	 * @throws IOException
	 */
	public void testUserSubmission() throws IOException {
		
		String facebookAppID = "theFacebookAppId";
		String facebookID = "TheCustomersFacebookID";
		String firstName = "clientFirstName";
		String lastName = "clientLastName";
		String email = "clientEmail";
		String facebookToken = "facebookToken";
		
		URLConnection connection = buildURLConnection(REGISTER_USER_ACTION);

		SocialUser socialUser = new SocialUser();
		socialUser.setEmail(email);
		socialUser.setFacebookID(facebookID);
		socialUser.setFacebookAppID(facebookAppID);
		socialUser.setFirstName(firstName);
		socialUser.setLastName(lastName);
		socialUser.setShortToken(facebookToken);
		socialUser.setShortTokenExpiration(1396850400L);

		ObjectMapper mapper = new ObjectMapper(); // from org.codeahaus.jackson.map
		mapper.writeValue(connection.getOutputStream(), socialUser);

		//JsonObject
		InputStream is = connection.getInputStream();
		String registeredUser = IOUtils.toString(is, "UTF-8");
		System.out.println(registeredUser);

	}
	
	/**
	 * Convenience method to build URL connection
	 * @param endPointAction
	 * @return
	 * @throws IOException
	 */
	private URLConnection buildURLConnection(String endPointAction) throws IOException {
		
		URL url = new URL(END_POINT+endPointAction);
		URLConnection connection = url.openConnection();
		connection.setDoInput(true);  
		connection.setDoOutput(true);
		connection.setRequestProperty("Content-Type", "application/json; charset=utf8");
		
		return connection;
		
	}
	
	
}
