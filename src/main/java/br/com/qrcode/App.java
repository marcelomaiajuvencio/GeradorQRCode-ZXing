package br.com.qrcode;

import java.awt.image.BufferedImage;

/**
 * Gerador de QRCode
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BufferedImage bufferedImage = null;
        
        QRCode qrCode = new QRCode();
        try {
        	bufferedImage = qrCode.geraImagemQRCode("https://www.google.com.br/");
        	System.out.println("QRCode gerado...");
        	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        
        qrCode.gravaImagem(bufferedImage, "teste.png", "png");
        System.out.println("Processo finalizado!");
        
       
        
        
    }
}
