import java.io.File;
import java.io.InputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfParser {

  public static void main(String[] args) {
    try {
      File file = new File("src/main/resources/StatmentSearch.pdf");
      PDDocument document = PDDocument.load(file);
      PDPage page = document.getPage(0);


      PDFTextStripper stripper = new PDFTextStripper();
      String text = stripper.getText(document);
      System.out.println(text);
      document.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
