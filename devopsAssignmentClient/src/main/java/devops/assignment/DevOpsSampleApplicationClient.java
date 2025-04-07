package devops.project;

import java.io.*;
import java.net.*;

public class DevOpsSampleApplicationClient {
	public static void main(String args[]) {
		try {
			Socket serverSocket = new Socket(InetAddress.getByName("localhost"), 8087);
			OutputStream stream = serverSocket.getOutputStream();
			stream.write("Tester".getBytes());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
