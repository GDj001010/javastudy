package ex02_Writer;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMainClass {
	
	/*
		XML		확장  마크업  언어
		1. eXtensible Markup Language
		2. HTML(표준 마크업 언어)의 확장 버전
		3. 정해진 태그 외 사용자 정의 태그의 사용이 가능하다.
	*/
	
	/*
		목표.
		1. 경로
			C:\storage\product.xml
		2. 내용
			<products>   <>  ← 태그라고 부름  시작 태그
				<product>
					<model>세탁기</model> 				태그 사이에 들어있는 세탁기 ← textContent 라고 부름
					<maker>삼성</maker>
					<price>100</price>
				</product>
				<product>
					<model>냉장고</model>
					<maker>LG</maker>
					<price>200</price>
				</product>
				<product>
					<model>TV</model>
					<maker>삼성</maker>
					<price>300</price>
				</product>
			</products>      ← 태그라고 부름  종료 태그
	*/
	public static void main(String[] args) {
		
		Map<String, Object> product1 = new HashMap<String, Object>();
		
		product1.put("model", "세탁기");
		product1.put("maker", "삼성");
		product1.put("price", 100);
		
		Map<String, Object> product2 = new HashMap<String, Object>();
		
		product2.put("model", "냉장고");
		product2.put("maker", "LG");
		product2.put("price", 200);
		
		Map<String, Object> product3 = new HashMap<String, Object>();
		
		product3.put("model", "TV");
		product3.put("maker", "삼성");
		product3.put("price", 300);
		
		List<Map<String, Object>> productList = Arrays.asList(product1,product2, product3);
		
		try {
			
			// Document 생성(Document는 XML문서 자체를 의미한다.)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// DocumentBuilder를 만들어주는 Factory 만들기
			DocumentBuilder builder = factory.newDocumentBuilder();
			// Document를 만들어주는 Builder 만들기
			Document document = builder.newDocument();
			document.setXmlStandalone(true);  // standalone="no" 제거하기
			
			// <products> 태그 : Element 생성
			
			Element products = document.createElement("products");
			// 문서의 자식 products
			document.appendChild(products);
			
			// productList 순회
			for(Map<String, Object> map : productList) {
				
				// <product> 태그 : Element 생성
				Element product = document.createElement("product");
				// products 의 자식 product
				products.appendChild(product);
				
				//<model> 태그 : Element 생성
				Element model = document.createElement("model");
				product.appendChild(model);
				model.setTextContent((String) map.get("model"));		// Object 인수를 String으로 변환
				
				//<maker> 태그 : Element 생성
				Element maker = document.createElement("maker");
				product.appendChild(maker);
				maker.setTextContent(map.get("maker").toString());		// Object 인수를 String으로 변환
				
				//<price> 태그 : Element 생성
				Element price = document.createElement("price");	
				product.appendChild(price);
				price.setTextContent("" + map.get("price")); 			// Object 인수를 String으로 변환
			
			}
			
			// XML 설정		크게 신경 쓸 필요 없음
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty("encoding", "UTF-8");
			transformer.setOutputProperty("indent", "yes");			// 들여쓰기
			transformer.setOutputProperty("doctype-public", "yes");  // standalone="no" 제거하기 위해서 document.setXmlStandalone(true);를 추가하면 개행(줄바꿈)이 안 되므로 추가한 코드
			
			
			// XML 문서 만들기
			File dir = new File("C:" + File.separator + "storage");
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			File file = new File(dir, "product.xml");
			
			Source source = new DOMSource(document);
			StreamResult streamResult = new StreamResult(file);
			
			transformer.transform(source, streamResult);
			
			System.out.println("XML 파일 생성");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
