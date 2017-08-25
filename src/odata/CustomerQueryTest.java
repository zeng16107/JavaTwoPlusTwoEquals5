package odata;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


public class CustomerQueryTest {

	HttpClient m_httpClient;
	
	private HttpClient getHttpClient() {
		if (this.m_httpClient == null) {
			this.m_httpClient = HttpClientBuilder.create().build();
		}
		
		return this.m_httpClient;
	}
	
	private void test() throws ClientProtocolException, IOException{
		String serviceUrl = "https://qxl-cust233.dev.sapbydesign.com/sap/c4c/odata/v1/c4codata/AccountCollection/?$search='Wang'";
		serviceUrl = "http://www.baidu.com";
		final HttpGet get = new HttpGet(serviceUrl);
		get.setHeader("Authorization", "Basic V0FOR0pFUlJZNjI4MTg6U2FwdGVzdDE=");

		HttpResponse response = getHttpClient().execute(get);

		System.out.println("response: " + response.getEntity().getContent());

	}
	public static void main(String[] args) throws ClientProtocolException, IOException {
		new CustomerQueryTest().test();
	}

}
