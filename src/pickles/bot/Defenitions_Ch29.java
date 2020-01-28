package pickles.bot;

import java.util.*;
public class Defenitions_Ch29
{
	int c = 0;
	String t;
	String di;
	String[] term = {"New Freedom", "New Nationalism", "Federal Reserve Act", 
			"Federal Trade Commission Act", "Clayton Anti-Trust Act", "Zimmermann note", 
			"Fourteen Points", "Committee on Public Information",
			"Espionage Act", "Schneck v. United States", "16th Amendment",
			"Lusitania", "Louis D. Brandeis", "John(\"Black Jack\") Pershing", "Warehouse Act", 
			"War Industries Board", "National War Labor Board", "Industrial Workers of the World", 
			"Nineteenth Amendment", "League of Nations", "Treaty of Versailles", "Eugene V. Debs", 
			"Herbert C. Hoover", "Henry Cabot Lodge", "David Lloyd George"};
	String[] def = {
			//Term 1
			"Roosevelt's progressive political policy that favored heavy government intervention "
			+ "in order to assure social justice", 
			//Term 2
			"Woodrow Wilson's program in his campaign for the presidency in 1912, t"
			+ "he New Freedom emphasized business competition and small government. It sought to reign in federal authority, release individual energy, and restore competition. It echoed many of the progressive soc"
			+ "ial-justice objectives while pushing for a free economy rather than a planned one.",
			//Term 3
			"a 1913 law that set up a system of federal banks and gave government the power to control the money supply",
			//Term 4
			"an independent agency of the United States fedeal government that maintains fair and free competition",
			//Term 5
			"New antitrust legislation constructed to remedy deficiencies of the Sherman Antitrust Act, namely, it's effectiveness against labor unions.",
			//Term 6
			"Note sent to Mexico from Germany which sought to gain the support of Mexico in the war",
			//Term 7
			"Speech given by Wilson which supported his peaceful ideals and proposals for a post-war diplomacy",
			//Term 8
			"Use of propaganda to influence the opinion of American citizens",
			//Term 9
			"a law prohibiting interference with the draft and other acts of national \"disloyalty\"",
			//Term 10
			"a Supreme Court decision that upheld the Espionage and Sedition Acts",
			//Term 11
			"amendment to the United States Constitution (1913) gave Congress the power to tax income.",
			//Term 12
			"American boat that was sunk by the German U-boats; made America consider entering WWI",
			//Term 13
			"This lawyer and later a justice of the Supreme court spoke and wrote widely"
			+ " about the \"curse of bigness.\" He thought the government should help small businesses.",
			//Term 14
			"\r\n" + 
			"US general who chased Villa over 300 miles into Mexico but didn't capture him",
			//Term 15
			"1916 legislation that authorized loans on the security of staple crops. (Staple crops are basic crops such as corn and wheat.)",
			//Term 16
			"Headed by Bernard Baruch, this federal agency coordinated industrial production during World War I, setting production quotas, allocating raw "
			+ "materials, and pushing companies to increase efficiency and eliminate waste.",
			//Term 17
			"Organization intended to settle labor disputes",
			//Term 18
			"The IWW, also known as the \"Wobblies,\" was a radical organization that sought to build \"one big union\" and advocated industrial sabotage in defense of that goal. "
			+ "At its peak in 1923, it could claim 100,000 members and could gain the support of 300,000.",
			//Term 19
			"This constitutional amendment, finally passed by Congress in 1919 and ratified in 1920, gave women the right to vote.",
			//Term 20
			"a world organization of national governments proposed by President Woodrow Wilson and established by the Treaty "
			+ "of Versailles; it worked to facilitate peaceful international cooperation",
			//Term 21
			"established the terms of settlement of the First World War between Germany "
			+ "and the Allied and Associated Powers (most notably France, Britain, Italy, and the United States); Article 231, soon dubbed \"the war guilt clause,\" blamed the war on Germany as justification for forcing German disarmament and saddling "
			+ "Germany with heavy reparations payments to the Allied victors\r\n",
			//Term 22
			"Leader of the American Railway Union, he voted to aid workers in the Pullman strike. "
			+ "He was jailed for six months for disobeying a court order after the strike was over.",
			//Term 23
			"The Quaker-humanitarian head of the Food Administration shared his fellow war administrators' preference for relying on voluntary compliance rather than compulsory edicts. He deliberately rejected issuing ration cards, "
			+ "a practice used in Europe. Instead he waged a whirlwind propaganda campaign through posters, billboards, newspapers, pulpits, and movies. To save food for export, he proclaimed wheatless Wednesdays and meatless Tuesdays--all on a voluntary basis. "
			+ "The country soon broke out in a rash of vegetable \"victory gardens.\"",
			//Term 24
			"Wilson further ruffled Republican feathers when he snubbed the Senate in assembling his peace delegation and neglected to include a single Republican senator in his official party. The logical choice was the new chairman of the Senate Committee on Foreign Relations, "
			+ "aristocratically bewhiskered Henry Cabot Lodge of Massachusetts.",
			//Term 25
			"Prime minister of Britain during WW1"};
	Defenitions_Ch29()
	{
		Random r = new Random();
		int rand;
		rand = r.nextInt(24);
		this.t = term[rand];
		this.di = def[rand];
		this.c = c;
	}
}
