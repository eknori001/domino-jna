package com.mindoo.domino.jna.utils;

import com.sun.jna.Pointer;

/**
 * Utility class to dump memory content
 * 
 * @author Karsten Lehmann
 */
public class DumpUtil {

	/**
	 * Reads memory content at the specified pointer and produces a String with hex codes and
	 * character data in case the memory contains bytes in ascii range. Calls {@link #dumpAsAscii(Pointer, int, int)}
	 * with cols = 8.
	 * 
	 * @param ptr pointer
	 * @param size number of bytes to read
	 * @return memory dump
	 */
	public static String dumpAsAscii(Pointer ptr, int size) {
		return dumpAsAscii(ptr, size, 8);
	}
	
	/**
	 * Reads memory content at the specified pointer and produces a String with hex codes and
	 * character data in case the memory contains bytes in ascii range.
	 * 
	 * @param ptr pointer
	 * @param size number of bytes to read
	 * @param cols number of bytes written in on eline
	 * @return memory dump
	 */
	public static String dumpAsAscii(Pointer ptr, int size, int cols) {
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		
		while (i < size) {
			sb.append("[");
			for (int c=0; c<cols; c++) {
				if (c>0)
					sb.append(' ');
				
				if ((i+c) < size) {
					byte b = ptr.getByte(i+c);
					 if (b >=0 && b < 16)
			                sb.append("0");
			            sb.append(Integer.toHexString(b & 0xFF));
				}
				else {
					sb.append("  ");
				}
			}
			sb.append("]");
			
			sb.append("   ");
			
			sb.append("[");
			for (int c=0; c<cols; c++) {
				byte b = ptr.getByte(i+c);
				int bAsInt = (b & 0xff);
				
				if (bAsInt >= 32 && bAsInt<=126) {
					sb.append((char) (b & 0xFF));
				}
				else {
					sb.append(".");
				}
			}
			sb.append("]\n");

			i += cols;
		}
		return sb.toString();
	}
}