package com.example.demo.point.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class SocketDemo {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://openplanning.net/13527/java-inputstream");    
			URLConnection urlcon=url.openConnection();    
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			InputStream stream=urlcon.getInputStream();    
			int i;    
			while((i=stream.read())!=-1){    
//			System.out.print((char)i);  
			}
			
			//
			
			for (int j = 1; j <= 8; j++) {
				System.out.println(huc.getHeaderFieldKey(j) + " = " + huc.getHeaderField(j));
			}
			huc.disconnect();

			//
			
			InetAddress ip =  InetAddress.getByName("www.javatpoint.com");
			System.out.println("Host Name: "+ip.getHostName());  
			System.out.println("IP Address: "+ip.getHostAddress());  
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}