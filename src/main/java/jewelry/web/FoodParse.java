package jewelry.web;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class FoodParse {
    public String[] init() throws ParserConfigurationException, IOException, SAXException {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//созд.фабрики
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();//созд.построителя
            Document doc = documentBuilder.parse(FoodParse.class.getClassLoader().getResourceAsStream("lab3.xml"));

            String[] result = new String[2];

            NodeList nodeList = doc.getElementsByTagName("food");
            String shop , name , maker ,group, composition , price;



            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                shop = element.getElementsByTagName("shop").item(0).getTextContent();
                maker = element.getElementsByTagName("maker").item(0).getTextContent();
                name = element.getElementsByTagName("name").item(0).getTextContent();
                composition = element.getElementsByTagName("composition").item(0).getTextContent();
                group = element.getElementsByTagName("group").item(0).getTextContent();
                price = element.getElementsByTagName("price").item(0).getTextContent();
                /*Integer.parseInt(element.getParentNode().getAttributes().getNamedItem("id").getNodeValue())*/
                result[i] = (shop + ", " + name + ", " +maker + ", "+ group + ", "+ composition + ", " + price);
            }
            return result;


    }
}
