package com.onebox.backend.tools;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPUtil {
	
	public static String getLocalIP() {
		InetAddress ina = null;
		try {
			ina = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		String localHostName = ina.getHostName();
		String localHostIP = ina.getHostAddress();
		System.out.println("localHostName: " + localHostName + "\nlocalhostIP: " + localHostIP);
		return localHostIP;
	}
}

