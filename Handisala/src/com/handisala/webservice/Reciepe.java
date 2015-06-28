package com.handisala.webservice;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import com.sun.xml.internal.ws.developer.SchemaValidation;

@WebService(serviceName="HandisalaService", name="HandisalaPortType", 
        targetNamespace="http://webservice.handisala.com")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, 
        parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
@SchemaValidation
public class Reciepe {
	@Resource
	private WebServiceContext ctx; 

	@WebMethod()
	@WebResult(name="greetings", targetNamespace="http://webservice.handisala.com")
	public String postReciepe(@WebParam(name="name", 
	       targetNamespace="http://webservice.handisala.com") String arg) throws Exception{
		MessageContext context=ctx.getMessageContext();
		
		@SuppressWarnings("rawtypes")
		Map requestHeaders = (Map)context.get(MessageContext.HTTP_REQUEST_HEADERS);
		
		@SuppressWarnings("unchecked")
		ArrayList<String> value =  (ArrayList<String>) requestHeaders.get("token");
		
		if(!value.get(0).equals("my")){
			throw new Exception("Invalid Parameter");
		}
		return "Hello " + arg;
	}

}
