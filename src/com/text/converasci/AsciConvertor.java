package com.text.converasci;
import java.util.stream.Collectors;

public class AsciConvertor {

	public static void main(String[] args) {
		
		String str = "abc **";
		
		String asci=str.chars()
				.mapToObj(c-> ((char) c!=' ')? c: " ")
				.map( Object::toString )
				.collect( Collectors.joining());
		
		System.out.println(asci);


	 
	}

	}

