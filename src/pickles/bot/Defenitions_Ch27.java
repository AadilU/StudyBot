package pickles.bot;

import java.util.*;
public class Defenitions_Ch27
{
	int c = 0;
	String t;
	String di;
	String[] term = {"Big Sister Policy", "Great Rapprochement", "Maine", "Teller Amendment", "Anti-Imperialist League", 
			"Insular Cases", "Platt Amendment", "Rooselevelt Corollary", "Alfred Thayer Mahan", "George Dewey",
			"Emilio Aguinaldo", "Open Door Policy"};
	String[] def = {"foreign policy aimed at rallying Latin American "
			+ "nations behind U.S. leadership and opening Latin American markets to U.S. traders\r\n" + 
			"",
			//Term 2
			"reconciliation between the U.S. and Britain at the end of the 1800s", 
			//Term 3
			"Ship that explodes off the coast of Cuba in Havana harbor and "
			+ "helps contribute to the start of the Spanish-American War", 
			//Term 4
			"Legislation that promised the US would not annex Cuba after winning the Spanish-American war",
			//Term 5
			"organization that was created to protest American control of the Philippines",
			//Term 6
			"Supreme Court cases that decreed that the Constitution did not apply to newly acquired territories, "
			+ "Puerto Ricans and Filipinos had to follow American laws but did not get all American rights",
			//Term 7
			"Legislation that severely restricted Cuba's sovereignty and gave the US the right to "
			+ "intervene if Cuba got into trouble",
			//Term 8
			"policy advocated by Theodore Roosevelt that said the the US would pay off the debts of Latin America to keep European nations away\r\n" + 
			"",
			//Term 9
			"Promoted construction of a steel navy for the US",
			//Term 10
			"a United States naval officer remembered for his victory at Manila Bay in the Spanish-American War",
			//Term 11
			"Filipino revolutionary who fought with the Americans against the Spanish, "
			+ "later rebelled against American control after the US refused to free the Philippines",
			//Term 12
			"letter in which Secretary of State John Hay urged the great powers to respect "
			+ "Chinese rights and open their spheres of influence to fair competition\r\n" + 
			""};
	Defenitions_Ch27()
	{
		Random r = new Random();
		int rand;
		rand = r.nextInt(12);
		this.t = term[rand];
		this.di = def[rand];
		this.c = c;
	}
}
