package generatedOriginal;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.naming.spi.DirStateFactory.Result;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.stream.StreamResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

public class MySchemaOutputResolver extends SchemaOutputResolver {
    //private StringWriter stringWriter = new StringWriter();    
    //TODO Needs to close it later lol
    
    public javax.xml.transform.Result createOutput(String namespaceURI, String suggestedFileName) throws IOException  {
    	StringWriter stringWriter = new StringWriter();
    	
    	StreamResult result = new StreamResult(stringWriter);
        result.setSystemId(suggestedFileName);
        
        stringWriter.close();
        return result;
    }
    /*
    public String getSchema() {
    	StringWriter stringWriter = new StringWriter();
    	//Can't close this???
        return stringWriter.toString();
    }
	*/
}