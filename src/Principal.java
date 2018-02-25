import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
			
		System.out.println("Inicio");
		
		PDFManager pdf = new PDFManager();
		pdf.setFilePath("C:/test/teste.pdf");
		System.out.println(pdf.ToText());
		
		System.out.println("FIM");
	}
	
}
