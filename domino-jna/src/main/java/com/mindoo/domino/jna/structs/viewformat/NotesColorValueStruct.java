package com.mindoo.domino.jna.structs.viewformat;
import com.mindoo.domino.jna.structs.BaseStructure;
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
public class NotesColorValueStruct extends BaseStructure {
	public short Flags;
	public byte Component1;
	public byte Component2;
	public byte Component3;
	public byte Component4;
	public NotesColorValueStruct() {
		super();
	}
	
	public static NotesColorValueStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesColorValueStruct>() {

			@Override
			public NotesColorValueStruct run() {
				return new NotesColorValueStruct();
			}
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("Flags", "Component1", "Component2", "Component3", "Component4");
	}
	public NotesColorValueStruct(short Flags, byte Component1, byte Component2, byte Component3, byte Component4) {
		super();
		this.Flags = Flags;
		this.Component1 = Component1;
		this.Component2 = Component2;
		this.Component3 = Component3;
		this.Component4 = Component4;
	}
	
	public static NotesColorValueStruct newInstance(final short Flags, final byte Component1, final byte Component2,
			final byte Component3, final byte Component4) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesColorValueStruct>() {

			@Override
			public NotesColorValueStruct run() {
				return new NotesColorValueStruct(Flags, Component1, Component2, Component3, Component4);
			}
		});
	}

	public NotesColorValueStruct(Pointer peer) {
		super(peer);
	}
	
	public static NotesColorValueStruct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesColorValueStruct>() {

			@Override
			public NotesColorValueStruct run() {
				return new NotesColorValueStruct(peer);
			}
		});
	}

	public static class ByReference extends NotesColorValueStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesColorValueStruct implements Structure.ByValue {
		
	};
}
