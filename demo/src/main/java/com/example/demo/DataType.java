/**
 * 
 */
package com.example.demo;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lungwil
 *
 */
public enum DataType {

	NUMERIC('N'), ALPHANUMERIC('A');

	private static final Map<Character, DataType> characterMap = new HashMap<Character, DataType>();

	static {
		for (DataType dataType : EnumSet.allOf(DataType.class)) {
			characterMap.put(dataType.getCharacter(), dataType);
		}
	}

	private final Character character;

	private DataType(Character character) {
		this.character = character;
	}

	public Character getCharacter() {
		return character;
	}
		
	public static DataType findById(Character character) {
		return characterMap.get(character);
	}
	
}
