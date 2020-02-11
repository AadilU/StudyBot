package pickles.bot;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class DisplayCard
{
	static EmbedBuilder b = new EmbedBuilder();
	static Defenitions_Ch26 d;
	static Defenitions_Ch27 d1;
	static Defenitions_Ch28 d2;
	static Defenitions_Ch29 d3;
	static Defenitions_Ch30 d4;
	static Defenitions_Ch31 d5;
	static Defenitions_Ch32 d6;
	public static void runCMD(GuildMessageReceivedEvent event, String args1)
	{
		switch(args1)
		{
		case("1"):
		{
			Color c = Color.cyan;
			d = new Defenitions_Ch26();
			b.setTitle(d.t);
			b.setColor(c);
			event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("😎").queue());
			break;
		}
		
		case("27"):
		{
			Color c = new Color(240, 10, 10);
			d1 = new Defenitions_Ch27();
			b.setTitle(d1.t);
			b.setColor(c);
			event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("👌").queue());
			break;
		}
		
		case("28"):
		{
			Color c = Color.MAGENTA;
			d2 = new Defenitions_Ch28();
			b.setTitle(d2.t);
			b.setColor(c);
			event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("👍").queue());
			break;
		}
		
		case("29"):
		{
			Color c = Color.ORANGE;
			d3 = new Defenitions_Ch29();
			b.setTitle(d3.t);
			b.setColor(c);
			event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("👏").queue());
			break;
		}
		
		case("30"):
		{
			Color c = Color.YELLOW;
			d4 = new Defenitions_Ch30();
			b.setTitle(d4.t);
			b.setColor(c);
			event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("😀").queue());
			break;
		}
		
		case("31"):
		{
			Color c = Color.decode("#FF4F29");
			d5 = new Defenitions_Ch31();
			b.setTitle(d5.t);
			b.setColor(c);
			event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("😃").queue());
			break;
		}
		
		case("32"):
		{
			Color c = Color.decode("#F39C12");
			d6 = new Defenitions_Ch32();
			b.setTitle(d6.t);
			b.setColor(c);
			event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("😊").queue());
			break;
		}
		default:
			event.getChannel().sendMessage("Chapter not found").queue();
			break;
		}
		
		//if(event1.getReactionEmote().equals("😎") && !event.getMember().getUser().equals(event.getJDA().getSelfUser()))
		//{
		//	event1.getChannel().sendMessage("hi").queue();
		//}
	}
}
