package util;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xml_Reader {

	DocumentBuilderFactory factory;
	DocumentBuilder builder;
	Document document;
	String path;

	public Xml_Reader(String path) {

		this.path = path;

		try {
			factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			document = builder.parse(path);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public Object[][] getDataByTestName(String testname) {

		document.getDocumentElement().normalize();
		NodeList nodeList = document.getElementsByTagName(testname);
		int rows = nodeList.getLength();
		int cols;
		//System.out.println("\nNumber of test configs :" + rows);
		Object temp[][] = null;
		for (int i = 0; i < rows; i++) {
			Node node = nodeList.item(i);
			//System.out.println("\nNode Name :" + node.getNodeName());
			if (node.getNodeType() == Node.ELEMENT_NODE) {		
				Element eElement = (Element) node;
				String tagName = eElement.getTagName();
				// System.out.println(tagName);
				NodeList col_s = eElement.getChildNodes();
				cols = col_s.getLength();
				temp = new Object[rows][cols];
				for (int j = 0; j < cols; j++) {
					Node node2 = col_s.item(j);
					System.out.println("Node Name :" + node2.getNodeName());
					if (node2.getNodeType() == Node.ELEMENT_NODE) {						
						Element element1 = (Element) node2;
						//String tagName1 = element1.getTagName();
						String textContent = element1.getTextContent().trim();						
						temp[i][j] = textContent;						
						}						
					}
				}			
		}
			return temp;		
	}

	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException {

		String xml_path = System.getProperty("user.dir") + "\\src\\test\\resources\\xmlData\\Jpetdata.xml";
		Xml_Reader xmlR = new Xml_Reader(xml_path);
		xmlR.document.getDocumentElement().normalize();
		NodeList nodeList = xmlR.document.getElementsByTagName("verifyAllPets");
		int rows = nodeList.getLength();

		Object[][] temp;
		System.out.println("\nNumber of test configs :" + rows);
		for (int i = 0; i < rows; i++) {
			Node node = nodeList.item(i);
			System.out.println("\nNode Name :" + node.getNodeName());
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				String tagName = eElement.getTagName();
				// System.out.println(tagName);
				NodeList col_s = eElement.getChildNodes();
				int cols = col_s.getLength();
				temp = new Object[rows][cols];
				for (int j = 0; j < cols; j++) {
					Node node2 = col_s.item(j);
					if (node2.getNodeType() == Node.ELEMENT_NODE) {
						Element element1 = (Element) node2;
						String tagName1 = element1.getTagName();
						String textContent = element1.getTextContent();
						temp[i][j] = textContent;
						System.out.println(textContent);
					}
				}

			}
		}

	}

}
