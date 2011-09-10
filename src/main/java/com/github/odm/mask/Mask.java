package com.github.odm.mask;

import com.github.odm.model.Column;

/**
 * <p>
 * Mask a column data
 * </p>
 * 
 * @author felipecrp
 * 
 */
public interface Mask {
	/**
	 * <p>
	 * Mask an object
	 * </p>
	 * 
	 * @param obj
	 *            the object
	 * @return the masked object
	 */
	Object mask(Object obj);

	/**
	 * <p>
	 * Check if the mask can be applied to the column
	 * </p>
	 * 
	 * @param column
	 *            the column
	 * @return true if the column can be masked
	 */
	boolean canMask(Column column);
}