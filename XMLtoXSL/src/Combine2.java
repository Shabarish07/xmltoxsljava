import java.io.*;
import java.util.Scanner;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class Combine2 {

	public static void main(String[] args) throws TransformerException
	{
		String stylesheetpathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Multiplexmlwid1xslt\\a2.xsl";
		String input1pathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Multiplexmlwid1xslt\\combine.xml";
		String outputpathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Multiplexmlwid1xslt\\outputcombine2.html";
		
		TransformerFactory factory=TransformerFactory.newInstance();
		Source stylesheetSource=new StreamSource(new File(stylesheetpathname).getAbsoluteFile());
		Transformer transformer=factory.newTransformer(stylesheetSource);
		Source input1Source=new StreamSource(new File(input1pathname).getAbsoluteFile());
		Result outputResult=new StreamResult(new File(outputpathname).getAbsoluteFile());
		transformer.transform(input1Source,outputResult);
		System.out.println("succsefully completed");
		
	}

}
