package com.mindoo.domino.jna.structs;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;

import com.mindoo.domino.jna.internal.NotesJNAContext;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.TypeMapper;

/**
 * Extension of {@link Structure} to make it work in an execution environment
 * that is secured by the Domino SecurityManager.
 * 
 * @author Karsten Lehmann
 */
public abstract class BaseStructure extends Structure {

	protected BaseStructure() {
		super();
		setAlignType(NotesJNAContext.getPlatformAlignment());
	}
	
	public BaseStructure(int alignType, TypeMapper mapper) {
		super(alignType, mapper);
		setAlignType(NotesJNAContext.getPlatformAlignment());
	}

	public BaseStructure(int alignType) {
		super(alignType);
		setAlignType(NotesJNAContext.getPlatformAlignment());
	}

	public BaseStructure(Pointer p, int alignType, TypeMapper mapper) {
		super(p, alignType, mapper);
		setAlignType(NotesJNAContext.getPlatformAlignment());
	}

	public BaseStructure(Pointer p, int alignType) {
		super(p, alignType);
		setAlignType(NotesJNAContext.getPlatformAlignment());
	}

	public BaseStructure(Pointer p) {
		super(p);
		setAlignType(NotesJNAContext.getPlatformAlignment());
	}

	public BaseStructure(TypeMapper mapper) {
		super(mapper);
		setAlignType(NotesJNAContext.getPlatformAlignment());
	}
	
	@Override
	protected List<Field> getFieldList() {
		return AccessController.doPrivileged(new PrivilegedAction<List<Field>>() {

			@Override
			public List<Field> run() {
				return BaseStructure.super.getFieldList();
			}
		});
	}
	
	@Override
	public void read() {
		AccessController.doPrivileged(new PrivilegedAction<Object>() {

			@Override
			public Object run() {
				BaseStructure.super.read();
				return null;
			}
		});
	}
	
	@Override
	public void write() {
		AccessController.doPrivileged(new PrivilegedAction<Object>() {

			@Override
			public Object run() {
				BaseStructure.super.write();
				return null;
			}
		});
	}
	
}
