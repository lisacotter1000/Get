package httpConnectionExample;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.*;

import com.documents.suzanne.workspace.httpConnectionExample.HttpURLConnectionExample;

public class TestHttpClientExample {
	private static final String USER_AGENT = "Mozilla/5.0";
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		HttpURLConnectionExample http = new HttpURLConnectionExample();	
		String url = "http://www.google.com/search?q=mkyong";

		 
     
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test()  throws Exception{
		String url = "http://www.google.com/search?q=mkyong";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");

		
		//add request header
				con.setRequestProperty("User-Agent", USER_AGENT);
				int responseCode = con.getResponseCode();
		
		assertTrue(responseCode == 200);
	}

}
