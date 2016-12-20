package com.mindoo.domino.jna.structs;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesSearchMatch32 extends BaseStructure {
	/**
	 * identity of the note within the file<br>
	 * C type : GLOBALINSTANCEID
	 */
	public NotesGlobalInstanceId32 ID;
	/**
	 * identity of the note in the<br>
	 * universe<br>
	 * C type : ORIGINATORID
	 */
	public NotesOriginatorId OriginatorID;
	/** class of the note */
	public short NoteClass;
	/** match indicator */
	public byte SERetFlags;
	/** note privileges */
	public byte Privileges;
	/** summary information length */
	public short SummaryLength;
	public NotesSearchMatch32() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ID", "OriginatorID", "NoteClass", "SERetFlags", "Privileges", "SummaryLength");
	}
	/**
	 * @param ID identity of the note within the file<br>
	 * C type : GLOBALINSTANCEID<br>
	 * @param OriginatorID identity of the note in the<br>
	 * universe<br>
	 * C type : ORIGINATORID<br>
	 * @param NoteClass class of the note<br>
	 * @param SERetFlags match indicator<br>
	 * @param Privileges note privileges<br>
	 * @param SummaryLength summary information length
	 */
	public NotesSearchMatch32(NotesGlobalInstanceId32 ID, NotesOriginatorId OriginatorID, short NoteClass, byte SERetFlags, byte Privileges, short SummaryLength) {
		super();
		this.ID = ID;
		this.OriginatorID = OriginatorID;
		this.NoteClass = NoteClass;
		this.SERetFlags = SERetFlags;
		this.Privileges = Privileges;
		this.SummaryLength = SummaryLength;
	}
	public NotesSearchMatch32(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends NotesSearchMatch32 implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesSearchMatch32 implements Structure.ByValue {
		
	};
}
