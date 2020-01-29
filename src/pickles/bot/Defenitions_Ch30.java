package pickles.bot;

import java.util.*;
public class Defenitions_Ch30 
{
	int c = 0;
	String t;
	String di;
	String[] term = {"Scopes Trial", "Red Scare", "Soviet Ark", "Immigration Act of 1942", "18th Amendment/Volstead Act",
			"Fundamentalism", "F. Scott Fitzgerald", "(UNIA) United Negro Improvement Association", "A. Mitchell Palmer",
			"Sacco and Vanzetti", "Al Capone", "David Wark Griffith", "Henry Ford", "Charles A. Lindbergh", "Harlem Renaissance",
			"Bull Market", "Langston Hughes", "Bruce Barton"};
	String[] def = {
			//Term 1
			"A Biology teacher in Dayton, Tennessee was put on trial by Fundamentalists for teaching evolution", 
			//Term 2
			"A social/political movement designed to prevent a socialist/communist/radical movement in this country by finding "
			+ "\"radicals,\" incarcerating them, deporting them, and subverting their activities", 
			//Term 3
			"Ship which deported communists and socialists to Russia", 
			//Term 4
			"Federal law limiting the number of immigrants that could be admitted from any country to 2% of the amount of people "
			+ "from that country who were already living in the U.S. as of the census of 1890.",
			//Term 5
			"This bill made the manufacture and distribution of alcohol illegal within the borders of the United States.",
			//Term 6
			"Literal interpretation and strict adherence to basic principles of the Bible.",
			//Term 7
			"(1896-1940) American writer famous for his novels and stories, such as The Great Gatsby, capturing the mood of the 1920s. "
			+ "He gave the decade the nickname the \"Jazz Age.\"",
			//Term 8
			"A group founded by Marcus Garvey to promote the settlement of American blacks in their own \"African homeland\" (pg 741), "
			+ "founded by Marcus Garvey in 1916 ; pressed for the creation of black businesses ; promoted the idea of settling Africa "
			+ "because blacks could not live with whites ; declined after Garvey was charged with business fraud and deported back to Jamaica.",
			//Term 9
			"\"Fighting Quaker\", went a little crazy w/ \"seeing red\"; suspected/jailed 6,000 people, Attorney general",
			//Term 10
			"Italian anarchists who were put on trial and executed as a result of bias against radicals",
			//Term 11
			"A mob king in Chicago who controlled a large network of speakeasies with enormous profits. His illegal activities convey the failure "
			+ "of prohibition in the twenties and the problems with gangs.",
			//Term 12
			"Film director who influenced the development of the film industry",
			//Term 13
			"1863-1947. American businessman, founder of Ford Motor Company, father of modern assembly lines, and inventor credited with 161 patents.",
			//Term 14
			"He was the first person to fly to paris france a trans atlantic flight. He flew around the eifel tower and arrived in paris.",
			//Term 15
			"A period in the 1920s when African-American achievements in art and music and literature flourished",
			//Term 16
			"Market trend in which buyers are encouraged to acquire stocks",
			//Term 17
			"A leading poet of the Harlem Renaissance. He wrote \"The Negro Speaks of Rivers\" and \"My People\"",
			//Term 18
			"Influenced advertising in the consumer age"};
	Defenitions_Ch30()
	{
		Random r = new Random();
		int rand;
		rand = r.nextInt(18);
		this.t = term[rand];
		this.di = def[rand];
		this.c = c;
	}
}
