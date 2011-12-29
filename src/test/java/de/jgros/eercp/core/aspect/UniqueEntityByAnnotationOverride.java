/*
 * Copyright by Jörg Groß.
 */
package de.jgros.eercp.core.aspect;

import de.jgros.eercp.core.type.ImplementsJPAUnique;

/**
 * Test stub that overloads methods and implements uses JPA.
 * 
 * @author Jörg Groß
 * 
 */
@ImplementsJPAUnique
public class UniqueEntityByAnnotationOverride {

	/**
	 * Override aspect implementation.
	 * 
	 * @{inheritDoc
	 */
	@Override
	public String getUniqueId() {
		return "BBB";
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
