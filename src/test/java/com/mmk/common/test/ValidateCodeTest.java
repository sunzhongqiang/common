package com.mmk.common.test;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import com.mmk.common.captcha.ValidateCode;

public class ValidateCodeTest {
	
	public static void main(String[] args) throws IOException {
		ValidateCode code = new ValidateCode();
		BufferedImage createImage = code.createImage(code.runValidateCode(6));
		ImageIO.write(createImage, "jpg", Files.createFile(Paths.get("c:/work/test.jpg")).toFile());
	}

}
