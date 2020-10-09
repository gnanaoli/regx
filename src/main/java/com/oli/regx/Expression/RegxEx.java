/**
 * 
 */
package com.oli.regx.Expression;

/**
 * @author Gnanaoli
 *
 */
public class RegxEx {

	public static final String PAN_CARD = "[A-Z]{5}[0-9]{4}[A-Za-z]{1}";

	public static final String NUMBER_ONLY = "[0-9]+";

	public static final String ALPHA_ONLY = "[A-Z]+";

	public static final String ALPHA_NUMERIC = "^[a-zA-Z0-9]+$";

}
