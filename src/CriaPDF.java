import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;


public class CriaPDF {
	
	public static void main(String[] args) throws IOException {
		
		//criando PDF
		System.out.println("test main 2");
		//instanciando pdf
		PDDocument pdf = new PDDocument();
		
		pdf.save("C:/test/my_doc.pdf");
		
		System.out.println("PDF criado");
		
		pdf.close();
		
	}
}
