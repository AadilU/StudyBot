package pickles.bot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.internal.handle.GuildEmojisUpdateHandler;

import java.awt.Color;
import java.util.*;
public class CommandList extends ListenerAdapter
{
	public static int i = 0;
	public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
		if(i == 1 && !event.getMember().getUser().equals(event.getJDA().getSelfUser()) )
		{
			TestCard.evAns(event, event.getMessage().getContentRaw());
			//i = 0;
		}
		String[] args;
		args = event.getMessage().getContentRaw().split("\\s+");
		switch(args[0])
		{
			case "!card":
			{
				if(args.length < 2)
				{
					event.getChannel().sendMessage("Correct Command Use: !card (Chapter number)").queue();
					break;
				}
				else
					DisplayCard.runCMD(event, args[1]);
				break;
			}
			
			case "!test":
			{
				if(args.length < 2)
				{
					event.getChannel().sendMessage("Correct Command Use: !test (Chapter number)").queue();
					break;
				}
				else
				{
					i = 1;
					TestCard.runCMD(event, args[1]);
				}
				break;
			}
			
			case "!help":
			{
				Color c = Color.green;
				EmbedBuilder helpMenu = new EmbedBuilder();
				helpMenu.setTitle("Commands");
				helpMenu.addField("!test", "Random terms to test vocab", false);
				helpMenu.addField("!card", "Displays a random card", false);
				helpMenu.setColor(c);
				event.getChannel().sendMessage(helpMenu.build()).queue();
				break;
			}
			
			case "!cardlist":
			{
				if(args.length < 2)
				{
					event.getChannel().sendMessage("Correct Command Use: !cardlist (Chapter number)").queue();
					break;
				}
				else
				{
					if(args[1].equals("27"))
					{
						EmbedBuilder cardMenu = new EmbedBuilder();
						Defenitions_Ch27 d = new Defenitions_Ch27();
						int i;
						for(i = 0; i < 12;i++)
							cardMenu.addField("" + (i + 1), d.term[i], true);
						event.getChannel().sendMessage(cardMenu.build()).queue();
					}
				}
				break;
			}
				
		}
    }
}
