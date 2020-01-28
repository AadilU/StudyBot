package pickles.bot;

import org.w3c.dom.events.Event;

import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TestCard
{
	static EmbedBuilder b = new EmbedBuilder();
	static Defenitions_Ch26 d = new Defenitions_Ch26();
	static Defenitions_Ch27 d1 = new Defenitions_Ch27();
	static Defenitions_Ch28 d2 = new Defenitions_Ch28();
	static Defenitions_Ch29 d3 = new Defenitions_Ch29();
	static int ci;
	static String args2;
	public static void runCMD(GuildMessageReceivedEvent event, String args1)
	{
		args2 = args1;
		switch(args1)
		{
		case("1"):
		{
			d = new Defenitions_Ch26();
			b.setTitle(d.di);
			event.getChannel().sendMessage(b.build()).queue();
			break;
		}
		
		case("27"):
		{
			d1 = new Defenitions_Ch27();
			b.setTitle(d1.di);
			event.getChannel().sendMessage(b.build()).queue();
			break;
		}
		
		case("28"):
		{
			d2 = new Defenitions_Ch28();
			b.setTitle(d2.di);
			event.getChannel().sendMessage(b.build()).queue();
			break;
		}
		case("29"):
		{
			d3 = new Defenitions_Ch29();
			b.setTitle(d3.di);
			event.getChannel().sendMessage(b.build()).queue();
			break;
		}
		default:
			event.getChannel().sendMessage("Chapter not found").queue();
			break;
		}
	}
	
	public static void evAns(GuildMessageReceivedEvent event, String args)
	{
		
		if((args.toLowerCase()).equals(d.t.toLowerCase()) || (args.toLowerCase()).equals(d1.t.toLowerCase())
				|| (args.toLowerCase()).equals(d2.t.toLowerCase()))
		{
			event.getChannel().sendMessage("Correct").queue();
		}
		else
			switch(args2.toLowerCase())
			{
			case("26"):
			{
				if((args.toLowerCase()).equals(d.t.toLowerCase()))
				{
					event.getChannel().sendMessage("Correct").queue();
				}
				else
				event.getChannel().sendMessage("Incorrect, The correct answer was " + d.t).queue();
				break;
			}
			case("27"):
			{
				if((args.toLowerCase()).equals(d1.t.toLowerCase()))
				{
					event.getChannel().sendMessage("Correct").queue();
				}
				else
				event.getChannel().sendMessage("Incorrect, The correct answer was " + d1.t).queue();
				break;
			}
			case("28"):
			{
				if((args.toLowerCase()).equals(d2.t.toLowerCase()))
				{
					event.getChannel().sendMessage("Correct").queue();
				}
				else
				event.getChannel().sendMessage("Incorrect, The correct answer was " + d2.t).queue();
				break;
			}
			case("29"):
			{
				if((args.toLowerCase()).equals(d3.t.toLowerCase()))
				{
					event.getChannel().sendMessage("Correct").queue();
				}
				else
				event.getChannel().sendMessage("Incorrect, The correct answer was " + d3.t).queue();
				break;
			}
		}
		if(ci < 5)
		{
			ci++;
			switch(args2)
			{
			case("26"):
			{
				TestCard.runCMD(event, "26");
				break;
			}
			case("27"):
			{
				TestCard.runCMD(event, "27");
				break;
			}
			case("28"):
			{
				TestCard.runCMD(event, "28");
				break;
			}
			case("29"):
			{
				TestCard.runCMD(event, "29");
				break;
			}
			}
		}
		else
		{
			helloCommand.i = 0;
			ci = 0;
		}
	}
}