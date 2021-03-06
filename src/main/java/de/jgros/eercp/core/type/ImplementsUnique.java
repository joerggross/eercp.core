/*
 * Copyright by J�rg Gro�.
 */
package de.jgros.eercp.core.type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import de.jgros.eercp.core.aspect.UniqueAspect;

/**
 * Annotation that signals the implementation of the {@link IUnique} interface
 * by the {@link UniqueAspect}.
 * <p>
 * 
 * @author J�rg Gro�
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ImplementsUnique {

}
