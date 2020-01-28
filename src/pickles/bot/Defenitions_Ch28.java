package pickles.bot;

import java.util.*;
public class Defenitions_Ch28
{
	int c = 0;
	String t;
	String di;
	String[] term = {"t1", "t2", "t3", "t4"};
	String[] def = {"d1", "d2", "d3", "d4"};
	Defenitions_Ch28()
	{
		Random r = new Random();
		int rand;
		rand = r.nextInt(4);
		this.t = term[rand];
		this.di = def[rand];
		this.c = c;
	}
}
