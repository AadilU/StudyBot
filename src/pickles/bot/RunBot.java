package pickles.bot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class RunBot extends ListenerAdapter{
	
	public static JDA jda;
	public static String p = "!";
	public static void main(String[] args) throws LoginException
	{
		System.out.println("Starting");
		jda = new JDABuilder(AccountType.BOT).setToken("Token").build();
		jda.addEventListener(new CommandList());
		jda.addEventListener(new ChangeCard());
	}
	
}
