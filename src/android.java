
public class android<HttpResponse, client> {
	HttpClient client = new DefaultHttpClient();
	URI uri = new URI("http://www.edureka.co");

	HttpGet request = new HttpGet();
	request.setURI(uri);
	HttpResponse response = client.execute(request);
}
