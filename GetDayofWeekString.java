package com.lambda.example;

/**
 * @Author-Ankita Kalgutkar
 * This class returns the day of week by passing the calendar date in String 
 * For Ex:return "TUESDAY".  
 */
import java.time.LocalDate;
import java.util.*;

public class GetDayofWeekString {

	public static void main(String args[]) {

		// Get the day of Week for the passed Calendar date
		System.out.println(getDayofWeek(1, 4, 2022));
	}

	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return day of week
	 */
	public static String getDayofWeek(int month, int day, int year) {
		// Creating a calendar
		Calendar calndr = Calendar.getInstance();

		// Set calendar to specific date of Calendar
		calndr.set(year, month, day);

		return LocalDate.of(year, month, day).getDayOfWeek().toString();

	}
}
