package com.time.findday;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;

public class DayCalculator {

	public static void main(String[] args) {
		System.out.println( calculateDayseAfter(100));
		System.out.println( calculateDayseBefore(100));

	}

	public static LocalDate calculateDayseBefore(long days) {
		LocalDate today=  LocalDate.now(ZoneId.of("Asia/Tokyo"));
		return today.minusDays(days);	
	}

	
	public static LocalDate calculateDayseAfter(long days) {
		LocalDate today=  LocalDate.now(ZoneId.of("Asia/Tokyo"));
		return today.plusDays(days);
		
	}
	
	public static  void displayallZoneIds(){	
		Set<String> zoneIds=	ZoneId.getAvailableZoneIds();
		for(String name:zoneIds) {
			System.out.println(name);
		}
		
		
	}
}
