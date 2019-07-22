package com.example.demo;

import java.io.FileReader;
import java.util.Iterator;

import org.junit.Test;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class UtilsTest {

	@Test
	public void testMapJavaBeanExample() throws Exception {
		
		String fileName = "test.csv";

		 CsvToBean<Record> csvToBean = new CsvToBeanBuilder<Record>(new FileReader(getClass().getClassLoader().getResource(fileName).getFile()))
                 .withType(Record.class)
                 .withIgnoreLeadingWhiteSpace(true)
                 .build();
		
		Iterator<Record> iterator = csvToBean.iterator();
		
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}
