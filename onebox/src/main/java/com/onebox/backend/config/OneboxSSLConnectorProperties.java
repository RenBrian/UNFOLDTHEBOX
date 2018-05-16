package com.onebox.backend.config;

import java.io.File;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="onebox.https")
public class OneboxSSLConnectorProperties {
	private Integer port;
	private Boolean ssl = true;
	private Boolean secure = true;
	private String scheme = "https";
	private File keystore;
	private String keystorePassword;
	
	public void configureConnector(Connector connector) {
		if (port!=null) {
			connector.setPort(port);
		}
		if (secure!=null) {
			connector.setSecure(secure);
		}
	}

}
