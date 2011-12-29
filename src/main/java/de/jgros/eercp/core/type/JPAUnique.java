/**
 * Copyright by Jörg Groß.
 */
package de.jgros.eercp.core.type;

import javax.persistence.Id;

/**
 * @author Jörg Groß
 * 
 */
public class JPAUnique extends AbstractUnique {

	/**
	 * the uniqueId.
	 */
	@Id
	protected String uniqueId;

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public final String getUniqueId() {
		return this.uniqueId;
	}

	/**
	 * 
	 * @{inheritDoc
	 */
	public void setUniqueId(String aUniqueId) {
		this.uniqueId = aUniqueId;
	}

}
