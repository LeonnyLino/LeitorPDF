import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class LoadFileExisting {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/test/teste.pdf");
		PDDocument pdf = PDDocument.load(file);
		
		System.out.println("pdf carregado!");
		
		//add pagina em branco no documento carregado!
		pdf.addPage(new PDPage());
		
		pdf.save("C:/test/addBrancoNoExistente.pdf");
		
		pdf.close();
	}
}
