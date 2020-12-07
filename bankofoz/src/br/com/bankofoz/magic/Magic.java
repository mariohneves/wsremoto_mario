package br.com.bankofoz.magic;

import javax.swing.JOptionPane;

public class Magic {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}

	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}

	public static float f(String msg) {
		return Float.parseFloat(s(msg));

	}

	public static short sho(String msg) {
		return Short.parseShort(s(msg));

	}
	
	public static byte by(String msg) {
		return Byte.parseByte(s(msg));
		
	}

	public static boolean b(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Título", JOptionPane.YES_NO_OPTION) == 0) {
			return true;
		}
		return false;

	}
}
