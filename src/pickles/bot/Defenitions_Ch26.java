package pickles.bot;

import java.util.*;
public class Defenitions_Ch26 
{
	int c = 0;
	String t;
	String di;
	String[] term = {"n", "n", "n", "n"};
	String[] def = {"n", "n", "n", "n"};
	Defenitions_Ch26()
	{
		Random r = new Random();
		int rand;
		rand = r.nextInt(4);
		this.t = term[rand];
		this.di = def[rand];
		this.c = c;
	}
}
