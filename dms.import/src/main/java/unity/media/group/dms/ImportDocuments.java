/**
 * 
 */
package unity.media.group.dms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * @author ramesh.kandula
 *
 */
public class ImportDocuments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Document Correspondency Invoice
		 * 
		 */

		FileInputStream fileIS;
		try {
			fileIS = new FileInputStream("test.xml");
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document xmlDocument = builder.parse(fileIS);
			XPath xPath = XPathFactory.newInstance().newXPath();
			Map<String, XPathExpression> xPathExpressionMap = loadXPathExpression(
					new File("closed_correspondency.properties"), xPath);

			String expression = "/UNITYMEDIA/CUSTOMERNUMBER";

			XPathExpression exp = xPath.compile(expression);
			try {
				// NodeList nodeList = (NodeList)
				// xPath.compile(expression).evaluate(xmlDocument,
				// XPathConstants.NODESET);
				Node node = (Node) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODE);
				System.out.println(node.getTextContent());
			} catch (XPathExpressionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static Map<String, XPathExpression> loadXPathExpression(File file, XPath xPath) {
		Map<String, XPathExpression> xPathExpressionMap = new HashMap<String, XPathExpression>();
		Properties properties = new Properties();
		FileInputStream inStream = null;
		try {
			inStream = new FileInputStream(file);
			properties.load(inStream);

			for (Entry<Object, Object> entry : properties.entrySet()) {
				System.out.println("-> " + entry.getKey().toString() + "->" + entry.getValue().toString());
				// xPath.compile(expression).evaluate(xmlDocument,
				// XPathConstants.NODE);
				xPathExpressionMap.put(entry.getKey().toString().trim(),
						xPath.compile(entry.getValue().toString().trim()));

			}
			;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xPathExpressionMap;
	}

	public static Map<String, String> getDocAttrMap(Document xmlDocument,
			Map<String, XPathExpression> xPathExpressionMap) {
		Map<String, String> documentAttributes = new HashMap<String, String>();
		for (Entry<String, XPathExpression> entry : xPathExpressionMap.entrySet()) {

			Node node;
			try {
				node = (Node) entry.getValue().evaluate(xmlDocument, XPathConstants.NODE);
				System.out.println("->" + entry.getKey() + " = " + node.getTextContent());
				documentAttributes.put(entry.getKey(), node.getTextContent());
			} catch (XPathExpressionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return documentAttributes;
	}
}
