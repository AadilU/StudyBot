package pickles.bot;

import java.util.*;
public class Defenitions_Ch32 
{
	int c = 0;
	String t;
	String di;
	String[] term = {"Brain Trust", 
			"New Deal", 
			"Hundred Days", 
			"Glass-Steagall Banking Reform Act",
			"Civilian Conservation Corps",
			"National Recovery Administration",
			"Agricultural Adjustment Administration",
			"Dust Bowl",
			"Tennessee Valley Authority",
			"Social Security Act",
			"Wagner Act",
			"Fair Labor Standards Act",
			"Congress of Industrial Organizations",
			"Court-packing plan",
			"Keynesianism",
			"Eleanor Roosevelt",
			"Harry L. Hopkins",
			"Father Charles Coughlin",
			"Francis E. Townsend",
			"Huey P. (Kingfish) Long",
			"Frances Perkins",
			"Mary McLeod Bethune",
			"Schechter Case"};
	String[] def = {
			//Term 1
			"Many of the advisers who helped Roosevelt during his presidential candidacy continued to aid him after "
			+ "he entered the White House.", 
			//Term 2
			"The name of President Roosevelt's economic policy for getting the United States out of the depression", 
			//Term 3
			"special session of Congress that Roosevelt called to launch his New Deal programs. The special session lasted about three months: 100 days.", 
			//Term 4
			"forbade commercial banks from engaging in excessive speculation, added $1 billion in gold to economy and established "
			+ "the Federal Deposit Insurance Corporation (FDIC).",
			//Term 5
			"1933. This unemployment relief act hired young men for reforestation programs, firefighting. flood control, spawn drainage",
			//Term 6
			"Directed by Hugh John, this agency set up a system of codes of business practice, including giving fair wages and work hours. Businesses and labor unions "
			+ "who followed such codes could advertise as such (symbol: Blue Eagle) and thus gain more membership. Was limited in success.\r\n" + 
			"\r\n" + 
			"",
			//Term 7
			"restricted crop production to reduce crop surplus; goal was to reduce surplus to raise value of crops; farmers paid subsidies by federal government; declared "
			+ "unconstitutional by the Supreme Court in US vs Butler on January 6, 1936",
			//Term 8
			"A horrible natural disaster in which Midwestern dust from millions of acres of dry, arid land was blown up into the air and "
			+ "carried as far as Boston. Caused much suffering.",
			//Term 9
			"A New Deal agency created to generate electric power and control floods in a seven-U.S.-state region around the Tennessee River Valley . It created many dams that provided electricity as well as jobs.\r\n" + 
			"\r\n" + 
			"",
			//Term 10
			"created pension and insurance for the old-aged, the blind, the physically handicapped, delinquent children, and other dependents by taxing employees and employers",
			//Term 11
			"Created National Labor Relations board for administrative purposes & reasserted rights to unionize & bargain through reps.",
			//Term 12
			"This act federally established minimum wage and overtime pay.",
			//Term 13
			" Organizations\r\n" + 
			"Union organization of unskilled workers; broke away from the American Federation of Labor in 1935 and rejoined it in 1955.",
			//Term 14
			"\r\n" + 
			"Franklin Roosevelt's politically motivated and ill-fated scheme to add a new justice to the Supreme Court for every member over seventy who would not retire. His objective was to overcome "
			+ "the Court's objections to New Deal reforms.",
			//Term 15
			"British economist believed its okay for government to do deficit spending",
			//Term 16
			"\r\n" + 
			"FDR's Wife and New Deal supporter. Was a great supporter of civil rights and opposed the Jim Crow laws. She also worked for birth control and better conditions for working women",
			//Term 17
			"A New York social worker who headed the Federal Emergency Relief Administration and Civil Works Administration. He helped grant over 3 billion dollars to the states wages for work projects, and "
			+ "granted thousands of jobs for jobless Americans.",
			//Term 18
			"Catholic priest who used his popular radio program to criticize the New Deal; he grew increasingly anti-Roosevelt and anti-Semitic until the Catholic Church pulled him off the air.",
			//Term 19
			"This man was a critic of the new deal. He developed the Townsend Plan as a way for the elderly to gain a monthly pension of $200 that must be spent within 30 days.",
			//Term 20
			"As senator in 1932 of Washington preached his \"Share Our Wealth\" programs. It was a 100% tax on all annual incomes over $1 million and appropriation of all fortunes in excess of $5 million. "
			+ "With this money Long proposed to give every American family a comfortable income of 5K",
			//Term 21
			"\r\n" + 
			"Roosevelt's secretary of labor (1993-1945); the first woman to serve as a federal Cabinet officer, she had a great influence on many New Deal programs, "
			+ "most significantly the Social Security Act.",
			//Term 22
			"United States educator who worked to improve race relations and educational opportunities for Black Americans",
			//Term 23
			"Declared the National Recovery Administration (part of FDR's New Deal) unconstitutional on the basis that the NRA gave the executive branch regulatory powers that belonged exclusively to Congress."
			};
	Defenitions_Ch32()
	{
		Random r = new Random();
		int rand;
		rand = r.nextInt(23);
		this.t = term[rand];
		this.di = def[rand];
		this.c = c;
	}
}