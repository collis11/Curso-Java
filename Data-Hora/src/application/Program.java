package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
	LocalDate d01 = LocalDate.now();
	LocalDateTime d02 = LocalDateTime.now();
	Instant d03 = Instant.now();
	
	LocalDate d04 = LocalDate.parse("2026-07-20");
	LocalDateTime d05 = LocalDateTime.parse("2026-07-20T01:30:26");
	Instant d06 = Instant.parse("2026-07-20T01:30:26Z");
	LocalDate d08 = LocalDate.parse("20/07/2026", fmt1);
	LocalDate d09 = LocalDate.of(2026, 7, 1);
	LocalDateTime d10 = LocalDateTime.of(2026, 7 ,20,  1 , 30 );
	
	System.out.println(d01);
	System.out.println(d02);
	System.out.println(d03);
	System.out.println(d04);
	System.out.println(d05);
	System.out.println(d06);
	System.out.println(d08);
	System.out.println(d09);
	System.out.println(d10);


	}
}
