import java.net.*;
import java.io.*;

public class ServerProtocol {

	private Count counter;

	public ServerProtocol (Count c) {
		
		counter = c;
        }

	public String processRequest(String theInput) {

		//There is no sync for increment and print
                counter.increment();
		String theOutput = theInput + counter.print();
		return theOutput;
	}
}