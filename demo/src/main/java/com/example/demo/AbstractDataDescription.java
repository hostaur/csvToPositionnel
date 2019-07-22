/**
 * 
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import be.fgov.faofat.infra.common.Constants;
import be.fgov.faofat.infra.common.StringUtils;

/**
 * 
 * Abstract classe simulate cobol copybook.
 * 
 * @author lungwil
 * 
 */
public abstract class AbstractDataDescription {

    private List<DataDescriptionEntry> datasList = new ArrayList<DataDescriptionEntry>();

    /**
	 * 
	 */
    public AbstractDataDescription() {
	init();
    }

    public abstract void init();

    public List<DataDescriptionEntry> getDatasList() {
	return datasList;
    }

    public void setDatasList(List<DataDescriptionEntry> datasList) {
	this.datasList = datasList;
    }

    protected boolean addElement(DataDescriptionEntry dataDescriptionEntry) {
	return datasList.add(dataDescriptionEntry);
    }

    public DataType getTypeOf(String key) {
	DataDescriptionEntry entry = findByKey(key);
	if (entry != null) {
	    return entry.getDataType();
	}
	return null;
    }

    public boolean setTypeOf(String key, DataType dataType) {
	DataDescriptionEntry entry = findByKey(key);
	if (entry != null) {
	    entry.setDataType(dataType);
	}
	return (entry == null) ? false : true;
    }

    public int getLengthOf(String key) {
	DataDescriptionEntry entry = findByKey(key);
	if (entry != null) {
	    return entry.getLength();
	}
	return 0;
    }

    public boolean setLengthOf(String key, int length) {
	DataDescriptionEntry entry = findByKey(key);
	if (entry != null) {
	    entry.setLength(length);
	}
	return (entry == null) ? false : true;
    }

    public String getValueOf(String key) {
	DataDescriptionEntry entry = findByKey(key);
	if (entry != null) {
	    return entry.getValue();
	}
	return null;
    }

    public boolean setValueOf(String key, String value) {
	DataDescriptionEntry entry = findByKey(key);
	if (entry != null) {
	    entry.setValue(value);
	}
	return (entry == null) ? false : true;
    }

    public DataDescriptionEntry findByKey(String key) {
	if (datasList != null) {
	    for (DataDescriptionEntry dataDescriptionEntry : datasList) {
		if (dataDescriptionEntry.getName().equals(key)) {
		    return dataDescriptionEntry;
		}
	    }
	}
	return null;
    }

    public String toStringValue() throws Exception {
	if (datasList != null) {
	    StringBuffer sBuffer = new StringBuffer();
	    for (DataDescriptionEntry dataDescriptionEntry : datasList) {
		if (dataDescriptionEntry.getDataType() == DataType.NUMERIC) {
		    sBuffer.append(StringUtils.fillLeftBy(dataDescriptionEntry
			    .getLength(),
			    dataDescriptionEntry.getValue() == null ? null
				    : dataDescriptionEntry.getValue().trim(),
				    Constants.CHAR_ZERO));
		} else {// Alphanumeric type
		    sBuffer.append(StringUtils.fillRightBy(dataDescriptionEntry
			    .getLength(),
			    dataDescriptionEntry.getValue() == null ? null
				    : dataDescriptionEntry.getValue(),
				    Constants.CHAR_BLANK));
		}
	    }
	    return sBuffer.toString();
	}
	return null;
    }

    /**
     * @param message
     *            String
     */
    public void resolveDataDescriptionList(String message) throws Exception {
	/* Resolve message datas according 'positions'=(begin,length) */
	if ((message != null) && (message.length() > 0) && (datasList != null)) {
	    int start = 0;
	    int end = 0;
	    int maxLength = message.length();
	    StringBuffer sbMessage = new StringBuffer(message);
	    for (DataDescriptionEntry entry : datasList) {
		start = end;
		end = start + entry.getLength();
		// retrieve datas
		if ((start < maxLength) && (end <= maxLength)) {
		    entry.setValue(sbMessage.substring(start, end));
		} else if (start < maxLength) {
		    entry.setValue(sbMessage.substring(start));
		}
	    }
	}
    }

}
