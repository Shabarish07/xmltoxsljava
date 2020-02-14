import java.io.*;
import java.util.Scanner;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class Multiple {

	public static void main(String[] args) throws TransformerException
	{
		String stylesheetpathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Multiplexmlwid1xslt\\a.xsl";
		String input1pathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Multiplexmlwid1xslt\\1.xml";
		String input2pathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Multiplexmlwid1xslt\\2.xml";
		String input3pathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Multiplexmlwid1xslt\\3.xml";
		String outputpathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Multiplexmlwid1xslt\\outputmultiple.html";
		TransformerFactory factory=TransformerFactory.newInstance();
		Source stylesheetSource=new StreamSource(new File(stylesheetpathname).getAbsoluteFile());
		Transformer transformer=factory.newTransformer(stylesheetSource);
		Source input1Source=new StreamSource(new File(input1pathname).getAbsoluteFile());
		Source input2Source=new StreamSource(new File(input2pathname).getAbsoluteFile());
		Source input3Source=new StreamSource(new File(input3pathname).getAbsoluteFile());
		Result outputResult=new StreamResult(new File(outputpathname).getAbsoluteFile());
		transformer.transform(input1Source,outputResult);
		transformer.transform(input2Source,outputResult);
		transformer.transform(input3Source,outputResult);
		System.out.println("succsefully completed");
		
	}

}
