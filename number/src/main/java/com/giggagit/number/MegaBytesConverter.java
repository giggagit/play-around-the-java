package com.giggagit.number;

/**
 * MegaBytesConverter
 */
public class MegaBytesConverter {

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int megabytesResult = kiloBytes / 1024;
			int kiloBytesResult = kiloBytes % 1024;

			System.out.println(kiloBytes + " KB = " + megabytesResult + " MB and " + kiloBytesResult + " KB");
		}
	}

}
