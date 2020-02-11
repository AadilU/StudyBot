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
		Defenitions_Ch30 de4 = DisplayCard.d4;
		Defenitions_Ch31 de5 = DisplayCard.d5;
		Defenitions_Ch32 de6 = DisplayCard.d6;
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
					else
						if(event.getReactionEmote().getName().equals("😀"))
						{
							Color n = Color.YELLOW;
							if((de4.c % 2) == 0)
							{
								b.setTitle(de4.di);
								b.setColor(n);
							}
							else
							{
								b.setTitle(de4.t);
								b.setColor(n);
							}
							
							if(!event.getMember().getUser().equals(event.getJDA().getSelfUser()))
							{
								event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("😀").queue());
								de4.c++;
							}
						}
						else
							if(event.getReactionEmote().getName().equals("😃"))
							{
								Color d = Color.decode("#FF4F29");
								Color c = Color.decode("#FF4F29");
								if((de5.c % 2) == 0)
								{
									b.setTitle(de5.di);
									b.setColor(c);
								}
								else
								{
									b.setTitle(de5.t);
									b.setColor(c);
								}
								
								if(!event.getMember().getUser().equals(event.getJDA().getSelfUser()))
								{
									event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("😃").queue());
									de5.c++;
								}
							}
							else 
								if(event.getReactionEmote().getName().equals("😊"))
								{
									Color d = Color.decode("#F39C12");
									Color c = Color.decode("#F39C12");
									if((de6.c % 2) == 0)
									{
										b.setTitle(de6.di);
										b.setColor(c);
									}
									else
									{
										b.setTitle(de6.t);
										b.setColor(c);
									}
									
									if(!event.getMember().getUser().equals(event.getJDA().getSelfUser()))
									{
										event.getChannel().sendMessage(b.build()).queue(message -> message.addReaction("😊").queue());
										de6.c++;
									}
								}
	}
}
