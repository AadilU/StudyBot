package pickles.bot;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageReaction.ReactionEmote;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChangeCard extends ListenerAdapter
{
	public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event)
	{
		Defenitions_Ch26 de = DisplayCard.d;
		Defenitions_Ch27 de1 = DisplayCard.d1;
		Defenitions_Ch28 de2 = DisplayCard.d2;
		Defenitions_Ch29 de3 = DisplayCard.d3;
		EmbedBuilder b = new EmbedBuilder();
		
		if(event.getReactionEmote().getName().equals("😎"))
		{
			Color d = new Color(240, 10,  10);
			Color c = Color.cyan;
			if((de.c % 2) == 0)
			{
				b.setTitle(de.di);
				b.setColor(c);
			}
			else
			{
				b.setTitle(de.t);
				b.setColor(c);
			}
			
			if(!event.getMember().getUser().equals(event.getJDA().getSelfUser()))
			{
				event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("😎").queue());
				de.c++;
			}
		}
		else
			if(event.getReactionEmote().getName().equals("👌"))
			{
				Color n = Color.red;
				if((de1.c % 2) == 0)
				{
					b.setTitle(de1.di);
					b.setColor(n);
				}
				else
				{
					b.setTitle(de1.t);
					b.setColor(n);
				}
				
				if(!event.getMember().getUser().equals(event.getJDA().getSelfUser()))
				{
					event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("👌").queue());
					de1.c++;
				}
			}
			else
				if(event.getReactionEmote().getName().equals("👍"))
				{
					Color n = Color.MAGENTA;
					if((de2.c % 2) == 0)
					{
						b.setTitle(de2.di);
						b.setColor(n);
					}
					else
					{
						b.setTitle(de2.t);
						b.setColor(n);
					}
					
					if(!event.getMember().getUser().equals(event.getJDA().getSelfUser()))
					{
						event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("👍").queue());
						de2.c++;
					}
				}
				else
					if(event.getReactionEmote().getName().equals("👏"))
					{
						Color n = Color.ORANGE;
						if((de3.c % 2) == 0)
						{
							b.setTitle(de3.di);
							b.setColor(n);
						}
						else
						{
							b.setTitle(de3.t);
							b.setColor(n);
						}
						
						if(!event.getMember().getUser().equals(event.getJDA().getSelfUser()))
						{
							event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("👏").queue());
							de3.c++;
						}
					}
	}
}
