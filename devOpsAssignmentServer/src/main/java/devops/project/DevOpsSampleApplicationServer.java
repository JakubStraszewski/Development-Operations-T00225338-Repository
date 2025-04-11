package devops.project;

import java.io.*;
import java.net.*;

public class DevOpsSampleApplicationServer {
	public static void main(String args[]) {
		try {
			ServerSocket serverSocket = new ServerSocket(8087);
			Socket clientSocket = serverSocket.accept();
			InputStream stream = clientSocket.getInputStream();
			byte[] buffer = new byte[10];
			stream.read(buffer, 0, 10);
			System.out.println(new String(buffer));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}