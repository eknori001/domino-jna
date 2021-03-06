package com.mindoo.domino.jna.structs.viewformat;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesViewTableFormat5Struct extends Structure {
	/** Length of this structure */
	public short Length;
	/** Reserved for future use */
	public int Flags;
	/** see viewprop.h - way to repeat image */
	public short RepeatType;
	
	public NotesViewTableFormat5Struct() {
		super();
	}
	
	public static NotesViewTableFormat5Struct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesViewTableFormat5Struct>() {

			@Override
			public NotesViewTableFormat5Struct run() {
				return new NotesViewTableFormat5Struct();
			}
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("Length", "Flags", "RepeatType");
	}
	/**
	 * @param Length Length of this structure<br>
	 * @param Flags Reserved for future use<br>
	 * @param RepeatType see viewprop.h - way to repeat image
	 */
	public NotesViewTableFormat5Struct(short Length, int Flags, short RepeatType) {
		super();
		this.Length = Length;
		this.Flags = Flags;
		this.RepeatType = RepeatType;
	}
	
	public static NotesViewTableFormat5Struct newInstance(final short Length, final int Flags, final short RepeatType) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesViewTableFormat5Struct>() {

			@Override
			public NotesViewTableFormat5Struct run() {
				return new NotesViewTableFormat5Struct(Length, Flags, RepeatType);
			}
		});
	}

	public NotesViewTableFormat5Struct(Pointer peer) {
		super(peer);
	}
	
	public static NotesViewTableFormat5Struct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesViewTableFormat5Struct>() {

			@Override
			public NotesViewTableFormat5Struct run() {
				return new NotesViewTableFormat5Struct(peer);
			}
		});
	}

	public static class ByReference extends NotesViewTableFormat5Struct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesViewTableFormat5Struct implements Structure.ByValue {
		
	};
}
