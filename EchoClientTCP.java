import java.net.*;
import java.io.*;
public class EchoClientTCP {
	private static final String HOST = "localhost";
	private static final int PORT = 1337;
	
	public static void main(String args[]) throws IOException {

		Socket dataSocket = new Socket(HOST, PORT);
		
		InputStream is = dataSocket.getInputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		OutputStream os = dataSocket.getOutputStream();
		PrintWriter out = new PrintWriter(os,true);
		       	
		String inmsg, outmsg;
		ClientProtocol app = new ClientProtocol();
		int i = 1;
		String std = "10.10.10.";
		outmsg = std + Integer.toString(i);
		while(true) {
			out.println(outmsg);
			inmsg = in.readLine();
			app.processReply(inmsg);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) { }
			i++;
			outmsg = std + Integer.toString(i);
		}
	}
}			

