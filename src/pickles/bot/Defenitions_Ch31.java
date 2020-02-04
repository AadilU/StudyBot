package pickles.bot;

import java.util.*;
public class Defenitions_Ch31 
{
	int c = 0;
	String t;
	String di;
	String[] term = {"Adkins v. Children's Hospital", "Kellog-Briand Pact", "Fordney-McCumber Tariff", "Teapot dome Scandal", 
			"McNary Haugen Bill", "Al Smith", "Dawes Plan", "Agricultural Marketing Act", "Hawley-Smoot Tariff", "Black Tuesday",
			"Hoovervilles", "Reconstruction Finance Corporation", "Norris-La Guardia Anti-Injunction Act", "Bonus Army",
			"Stimson Doctrine", "Washington Disarmament Conference", "John Davis", "Good Neighbor Policy"};
	String[] def = {
			//Term 1
			"Supreme Court reversed its own reasoning in Muller v. Oregon, on the grounds that women were now the legal equals of men "
			+ "(after the Nineteenth Amendment).", 
			//Term 2
			"A rather idealistic agreement between the great world powers to never engage in war except for defensive purposes.", 
			//Term 3
			"Raised tariff from 27% to 35%, Duties on farm produce increased. Passed during the Harding Administration.", 
			//Term 4
			"the private bribery of Secretary of the Interior Albert B. Fall in exchange for government oileries.",
			//Term 5
			"Farm proposal of the 1920s, passed by Congress but vetoed by president Coolidge, that provided for the federal government to buy "
			+ "farm surpluses and sell them abroad",
			//Term 6
			"The \"Happy Warrior\" who attracted votes in the cities but lost them in the South (because he was Catholic and against prohibition)",
			//Term 7
			"This loan program was crafted to give money to Germany so that they could pay war reparations and lessen the financial crisis in Europe; the "
			+ "program ended with the 1929 stock market crash.",
			//Term 8
			"This act provided for a form of relief for farmers by creating a Federal Farm Board, which was designed to stabilize farm crop prices. lost over $150 "
			+ "billion",
			//Term 9
			"Raised tariffs to an unprecedented level and worsened the depression by raising prices and discouraging foreign trade.",
			//Term 10
			"The climactic day of the October 1929 Wall Street stock-market crash",
			//Term 11
			"Depression shantytowns, named after the president whom many blamed for their financial distress",
			//Term 12
			"This agency became a government lending bank. It was designed to provide indirect relief by assisting insurance companies, banks, agricultural organizations, "
			+ "and railroads.",
			//Term 13
			"outlawed yellow-dog contracts, during Hoover's term",
			//Term 14
			"Name given to the mass of struggling WWI vets who, in the face of hard economic times, wanted to collect their pay checks early.",
			//Term 15
			"American foreign policy that stated that the US would not formally recognize any territories that were seized by force.",
			//Term 16
			"A conference hosted by the US which called for US and British de-fortification of Far East possessions (though Japan could fortify all it wanted). Also called for "
			+ "general naval disarmament.",
			//Term 17
			"Weak, compromise Democratic candidate in 1924",
			//Term 18
			"FDR's foreign policy of promoting better relations with Latin America by using economic influence rater than military force in the region."};
	Defenitions_Ch31()
	{
		Random r = new Random();
		int rand;
		rand = r.nextInt(18);
		this.t = term[rand];
		this.di = def[rand];
		this.c = c;
	}
}