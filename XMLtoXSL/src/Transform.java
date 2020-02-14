import java.io.*;
import java.util.Scanner;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class Transform {

	public static void main(String[] args) throws TransformerException
	{
		String stylesheetpathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Assignmnt\\1\\1.xsl";
		String inputpathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Assignmnt\\1\\1.xml";
		String outputpathname="D:\\SHABARISH\\FEBRUARY\\XSLT\\Assignmnt\\1\\output.html";
		
		TransformerFactory factory=TransformerFactory.newInstance();
		Source stylesheetSource=new StreamSource(new File(stylesheetpathname).getAbsoluteFile());
		Transformer transformer=factory.newTransformer(stylesheetSource);
		Source inputSource=new StreamSource(new File(inputpathname).getAbsoluteFile());
		Result outputResult=new StreamResult(new File(outputpathname).getAbsoluteFile());
		transformer.transform(inputSource,outputResult);
		System.out.println("succsefully completed");
		try {
			File x= new File("D:\\SHABARISH\\FEBRUARY\\XSLT\\Assignmnt\\1\\output.html");
			Scanner Reader = new Scanner(x);
			while(Reader.hasNextLine()) {
				String data=Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
			}
			catch(IOException e)
			{
				System.out.println("error occured");
				e.printStackTrace();
			}
		
	}

}
