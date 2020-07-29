package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.User;
// Type your code
public class AstroCalculator{
	//LocalDate ariesStart = LocalDate.of(Month.MARCH, 21);
	public String findSign(User user)
	{
		LocalDate dateOfBirth = user.getDob();
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yy");
		String DOB = dateOfBirth.format(myFormat);
		String[] datePartition = DOB.split("-");
		int date = Integer.parseInt(datePartition[0]);
		int month = Integer.parseInt(datePartition[1]);
		String sign = "";
		if(month == 3 && date >= 21 || month == 4 && date <= 19)
		{
			sign = "Aries";
		}
		else if(month == 4 && date >= 20 || month == 5 && date <= 20)
		{
			sign = "Taurus";
		}
		else if(month == 5 && date >= 21 || month == 6 && date <= 20)
		{
			sign = "Gemini";
		}
		else if(month == 6 && date >= 21 || month == 7 && date <= 20)
		{
			sign = "Cancer";
		}
		else if(month == 7 && date >= 23 || month == 8 && date <= 22)
		{
			sign = "Leo";
		}
		else if(month == 8 && date >= 23 || month == 9 && date <= 22)
		{
			sign = "Virgo";
		}
		else if(month == 9 && date >= 23 || month == 10 && date <= 22)
		{
			sign = "Libra";
		}
		else if(month == 10 && date >= 23 || month == 11 && date <= 21)
		{
			sign = "Scorpio";
		}
		else if(month == 11 && date >= 22 || month == 12 && date <= 21)
		{
			sign = "Sagittarius";
		}
		else if(month == 12 && date >= 22 || month == 1 && date <= 19)
		{
			sign = "Capricorn";
		}
		else if(month == 1 && date >= 20 || month == 2 && date <= 18)
		{
			sign = "Aquarius";
		}
		else if(month == 2 && date >= 19 || month == 3 && date <= 20)
		{
			sign = "Pisces";
		}
	return sign;
	}
}