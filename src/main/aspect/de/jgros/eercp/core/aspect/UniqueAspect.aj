/*
 * Copyright by Jörg Groß.
 */
package de.jgros.eercp.core.aspect;

import javax.persistence.Id;

import org.aspectj.lang.annotation.Aspect;
import de.jgros.eercp.core.type.ImplementsUnique;
import de.jgros.eercp.core.type.Unique;

/**
 * Aspect that adds {@link Unique} as super class (by inter-type declaration) 
 * to all classes with a {@link @UniqueImplementation}.
 * 
 * @author Jörg Groß
 *
 */
@Aspect
public privileged aspect UniqueAspect {

     declare parents : @ImplementsUnique * extends Unique;
     

}
