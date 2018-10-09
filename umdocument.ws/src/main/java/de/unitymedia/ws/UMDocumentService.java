/**
 * 
 */
package de.unitymedia.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import de.unitymedia.webservice.GetOptInCorrespondenciesParameter;
import de.unitymedia.webservice.GetOptInCorrespondenciesResult;
import de.unitymedia.webservice.GetServiceProviderResponse;
import de.unitymedia.webservice.GetVersionResponse;
import de.unitymedia.webservice.LookupPair;
import de.unitymedia.webservice.UNDocumentServicePortType;
import de.unitymedia.webservice.UpdateOptInCorrespondenciesParameter;
import de.unitymedia.webservice.UpdateOptInCorrespondenciesResult;

/**
 * @author ramesh.kandula
 *
 */
@WebService(name="UMDocumentService")
public class UMDocumentService implements UNDocumentServicePortType {

	public List<LookupPair> productLookup(String applicationId) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetVersionResponse getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LookupPair> typeLookup(String applicationId, String product) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LookupPair> priorityLookup(String applicationId) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response closeActivities(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LookupPair> stateLookup(String applicationId) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response requestDocumentDuplicate(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetServiceProviderResponse getServiceProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response getAllDocuments(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response getDocument(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response getInboxDocuments(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response changeDocuments(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response getDocumentAuditTrail(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetOptInCorrespondenciesResult getOptInCorrespondencies(GetOptInCorrespondenciesParameter parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	public UpdateOptInCorrespondenciesResult updateOptInCorrespondency(
			UpdateOptInCorrespondenciesParameter parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response getCorrespondencyDocuments(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response getCorrespondencyDocumentsCount(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response getOrders(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response lockDocument(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response unlockDocument(de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public de.unitymedia.webservice.Response getCorrespondencyDocumentsWithLock(
			de.unitymedia.webservice.Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
