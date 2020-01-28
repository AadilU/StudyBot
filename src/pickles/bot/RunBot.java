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
		jda = new JDABuilder(AccountType.BOT).setToken("NjM4MTk5MjQ0MjAwNjA3NzU1.Xb6Nwg.r1bSzG5q0810uZdR-PVEZgiIREc").build();
		jda.addEventListener(new helloCommand());
		jda.addEventListener(new ChangeCard());
	}
	
}
