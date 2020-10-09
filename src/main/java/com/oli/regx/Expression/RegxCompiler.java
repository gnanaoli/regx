/**
 * 
 */
package com.oli.regx.Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Gnanaoli
 *
 */
public class RegxCompiler {

	public boolean patternTest(String regx, String input) {

		Pattern p = Pattern.compile(regx);

		Matcher m = p.matcher(input);

		return m.matches();

	}

}
