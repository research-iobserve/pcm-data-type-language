/**
 * 
 */
package org.spp.cocome.types.typing;

/**
 * @author Reiner Jung
 * 
 */
public enum PrimitiveTypes {
	BOOLEAN("boolean"),
	BYTE("byte"),
	SHORT("short"),
	INTEGER("int"),
	LONG("long"),
	FLOAT("float"),
	DOUBLE("double"),
	CHARACTER("char"),
	STRING("string"),
	DATE("date"),
	ID("id"),
	CURRENCY("currency");

	private String name;

	private PrimitiveTypes(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
