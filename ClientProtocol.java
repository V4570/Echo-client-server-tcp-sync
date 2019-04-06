import java.net.*;
import java.io.*;

public class ClientProtocol {

	public String prepareRequest() throws IOException {
	
     		String theOutput = "INC ";
		return theOutput;
        }

	public void processReply(String theInput) throws IOException {
	
		System.out.println("Reply: " + theInput);
	}
}