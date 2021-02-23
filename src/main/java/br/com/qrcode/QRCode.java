package br.com.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCode {
	
	public BufferedImage geraImagemQRCode(String barcodeText) throws Exception {
	    QRCodeWriter qrcodeWriter = new QRCodeWriter();
	    BitMatrix bitMatrix = 
	    		qrcodeWriter.encode(barcodeText, BarcodeFormat.QR_CODE, 200, 200);

	    return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}
	
	public void gravaImagem(BufferedImage bufferedImage, String nomeArquivo, String formatoArquivo) {
		File arquivo = new File(nomeArquivo);
		try {
			ImageIO.write(bufferedImage, formatoArquivo, arquivo);
			System.out.println("Gravando arquivo "+ nomeArquivo);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
