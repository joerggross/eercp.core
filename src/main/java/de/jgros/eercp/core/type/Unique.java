/**
 * Copyright by J�rg Gro�.
 */
package de.jgros.eercp.core.type;

/**
 * @author J�rg Gro�
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
