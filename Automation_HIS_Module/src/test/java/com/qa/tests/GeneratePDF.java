package com.qa.tests;

import java.io.FileOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {
	static Document document = new Document();
	static PdfWriter writer ;

	static {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("C:PATHip" + "series of screenshots" + ".pdf");
			writer = PdfWriter.getInstance(document, fos);

			// open the pdf for writing
			writer.open();
			document.open();
		} catch (Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}

	public static void writeScreenShotToDocument(ArrayList<byte[]> byteArray) throws Exception {
		System.out.println("writeScreenShotToDocument started########## : "+byteArray.size());
		Image im = null;
		for (byte[] bytes: byteArray) {

			// process content into an image
			im = Image.getInstance(bytes);
			//set the size of the image
			im.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());

			document.add(new Paragraph(" "));
			document.add(new Paragraph("Chercher Tech website"));

			// add the image to PDF
			document.add(im);
			System.out.println("added");
		}
	}

	public static void writeScreenShotDocumentToPDF() throws Exception {
		System.out.println("writeScreenShotDocumentToPDF started@@@@@@@@@ ");

		//close the files and write to the local system
		document.close();
		writer.close();
	}

}
