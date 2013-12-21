package com.sandeep.core;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class ContentRenderer {
	
	
	public static String getRenderedContent(String xmlPath,String xslPath)
	{
		String content="";
		TransformerFactory tf = TransformerFactory.newInstance();
        StreamSource xslt = new StreamSource(xslPath);
        Transformer transformer;
		try {
			
			transformer = tf.newTransformer(xslt); 
			// Source
			StreamSource xml = new StreamSource(xmlPath);         
			Writer outWriter = new StringWriter();
			//result
			StreamResult result = new StreamResult( outWriter );
			// Transform
			transformer.transform(xml, result);
			//Save as html
			content = outWriter.toString();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
		}

}
