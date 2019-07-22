/**
 * 
 */
package com.example.demo;

/**
 * 
 * Classe contains data description.  Necessary for cobol copybook !
 * 
 * @author lungwil
 *
 */
public class DataDescriptionEntry {
	
	private String name; 

	private DataType dataType;
		
	private int length = 0;
		
	private String value;

	
	public DataDescriptionEntry(String name, DataType dataType, int length) {
		super();
		this.name = name;
		this.dataType = dataType;
		this.length = length;
	}

	public DataDescriptionEntry(String name, DataType dataType, int length,
			String value) {
		super();
		this.name = name;
		this.dataType = dataType;
		this.length = length;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
