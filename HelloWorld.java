package crunchify.com.web.service;

public class HelloWorld {

	public float addValue(float value) {
		return (value + 10);
	}
 
	public float subtractValue(float value) {
		return (value - 10);
	}
	
	public String append (String A, String B) {
		return A + " " + B;
	}

	public boolean equal (String A, String B) {
		return A.equals(B);
	}
	
}
