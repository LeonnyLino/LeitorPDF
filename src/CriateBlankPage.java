import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class CriateBlankPage {
	
	public static void main(String[] args) throws IOException {
		//instanciando pdf(documento)
		PDDocument pdf = new PDDocument();
				
		for(int i = 0; i < 10; i++) {
			//instanciando paginas em branco.	
			PDPage criaPagina = new PDPage();
			//adicionando pagina em branco no documento pdf.
			pdf.addPage(criaPagina);
		}
				
			//salvando documento no caminho especificado
			pdf.save("C:/test/add10page.pdf");
			System.out.println("PDF criado!");
				
			pdf.close();
	}
}
