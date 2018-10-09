/**
 * 
 */
package de.unitymedia.ws.data.xml.request;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ramesh.kandula
 *
 */

@XmlRootElement(name = "Request",namespace="http://unitymedia.webservices.de/request")
public class Request {

	
	private String applicationId;
	
	
	private String data;
	
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	
}
