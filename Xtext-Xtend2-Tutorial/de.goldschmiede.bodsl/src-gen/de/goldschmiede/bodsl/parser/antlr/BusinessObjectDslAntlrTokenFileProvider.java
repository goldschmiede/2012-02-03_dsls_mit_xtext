/*
* generated by Xtext
*/
package de.goldschmiede.bodsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BusinessObjectDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.tokens");
	}
}