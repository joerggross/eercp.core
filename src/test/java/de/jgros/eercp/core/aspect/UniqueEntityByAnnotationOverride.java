/*
 * Copyright by J�rg Gro�.
 */
package de.jgros.eercp.core.aspect;

import de.jgros.eercp.core.type.ImplementsJPAUnique;

/**
 * Test stub that overloads methods and implements uses JPA.
 * 
 * @author J�rg Gro�
 * 
 */
@ImplementsJPAUnique
public class UniqueEntityByAnnotationOverride {

	/**
	 * Sets the unique id and adds an 'A' at the end of the given string.
	 * 
	 * @{inheritDoc
	 */
	public void setUniqueId(String aUniqueId) {
		super.setUniqueId(aUniqueId + "A");
	}

	/**
	 * Override aspect implementation.
	 * 
	 * @{inheritDoc
	 */
	@Override
	public int hashCode() {
		return "BBB".hashCode();
	}

}
