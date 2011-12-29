/*
 * Copyright by J�rg Gro�.
 */
package de.jgros.eercp.core.aspect;

import de.jgros.eercp.core.type.ImplementsJPAUnique;
import de.jgros.eercp.core.type.JPAUnique;
import de.jgros.eercp.core.type.Unique;

/**
 * Aspect that adds {@link Unique} as super class (by inter-type declaration) 
 * to all classes with a {@link ImplementsJPAUnique}.
 * 
 * @author J�rg Gro�
 *
 */
public privileged aspect JPAUniqueAspect {

     declare parents : @ImplementsJPAUnique * extends JPAUnique;
}
