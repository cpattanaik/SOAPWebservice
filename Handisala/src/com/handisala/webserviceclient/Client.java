package com.handisala.webserviceclient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.handisala.stub.HandisalaPortType;
import com.handisala.stub.HandisalaService;
import com.sun.xml.internal.ws.developer.JAXWSProperties;
import com.sun.xml.internal.ws.developer.SchemaValidationFeature;

public class Client {
	
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args){
    	
    	SchemaValidationFeature feature = new SchemaValidationFeature();
    	HandisalaService hs = new HandisalaService();
    	HandisalaPortType hport = hs.getHandisalaPortTypePort(feature);
    	
    	Map requestContext = ((BindingProvider)hport).getRequestContext();
   
    	List<String> list = new ArrayList<String>();
    	list.add("my");
    	Map<String, List> header = new TreeMap<String, List>();	
    	header.put("token", list);
   
    	requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, header);
    	requestContext.put(JAXWSProperties.CONNECT_TIMEOUT, 300);
 
    	String s = hport.postReciepe("Chandra");
    	System.out.println(s);
    }
	 
}
