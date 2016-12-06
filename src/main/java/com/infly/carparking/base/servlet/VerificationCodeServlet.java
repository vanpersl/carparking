package com.infly.carparking.base.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;

import javax.imageio.ImageIO;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * CopyRright (c)2016-Carparking Infly
 * </p>
 * 验证码生成Servlet
 * 
 * @author zhoulong
 * @date 2016/12/5
 * @version 2.0
 */
public class VerificationCodeServlet extends HttpServlet implements Servlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3175463922335098195L;

	public static final String VERIFICATIONCODE_SESSION_KEY = "VERIFICATIONCODE_SESSION_KEY";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("image/jpeg");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);

		request.getSession().setAttribute(VERIFICATIONCODE_SESSION_KEY, createVerificationCode(response));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	Color getSecureRandom(SecureRandom secureRandom, int fc, int bc) {
		if (fc > 255) {
			fc = 255;
		}
		if (bc > 255) {
			bc = 255;
		}
		int r = fc + secureRandom.nextInt(bc - fc);
		int g = fc + secureRandom.nextInt(bc - fc);
		int b = fc + secureRandom.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	String createVerificationCode(HttpServletResponse response) {

		int width = 70, height = 30;
		SecureRandom random = new SecureRandom();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();

		// 背景色(因为是做背景，所以偏淡)
		g2d.setColor(getSecureRandom(random, 210, 255));
		g2d.fillRect(0, 0, width, height);

		// 噪点
		for (int i = 0; i < (random.nextInt(40) + 20); ++i) {
			g2d.setColor(getSecureRandom(random, 10, 150));
			g2d.fill(new Rectangle(random.nextInt(width), random.nextInt(height), random.nextInt(1) + 1,
					random.nextInt(1) + 1));
		}

		// 备选字体 {"DotumChe","MS Gothic","MS Mincho"};
		String[] fontTypes = { "MS Mincho" };

		int fontTypesLength = fontTypes.length;
		String base = "23456789abcdefghkmnopqrstuvwxyzABDEFGHKLMNPQRTUWY";
		int length = base.length();

		String vericationCode = "";
		int idx;
		for (int i = 0; i < 4; i++) {
			idx = random.nextInt(length);
			String rand = base.substring(idx, idx + 1);
			vericationCode += rand;

			g2d.setColor(getSecureRandom(random, 10, 150));
			g2d.setFont(new Font(fontTypes[random.nextInt(fontTypesLength)], Font.BOLD, 24));
			g2d.drawString(rand, 12 * i + 15, 13 + 12);
		}
		g2d.dispose();

		try {
			OutputStream out = response.getOutputStream();
			ImageIO.write(image, "JPEG", out);
			out.flush();
			out.close();

		} catch (Exception ex) {
		}

		return vericationCode.toUpperCase();
	}
}
