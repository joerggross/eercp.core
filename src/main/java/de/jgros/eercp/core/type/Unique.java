/**
 * Copyright by Jörg Groß.
 */
package de.jgros.eercp.core.type;

/**
 * @author Jörg Groß
 * 
 */
public class Unique extends AbstractUnique {

	/**
	 * the uniqueId.
	 */
	protected String uniqueId;

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public String getUniqueId() {
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
