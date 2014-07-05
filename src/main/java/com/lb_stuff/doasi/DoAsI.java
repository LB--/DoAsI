package com.lb_stuff.doasi;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.*;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.entity.Player;
import org.bukkit.help.HelpTopic;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;

import java.util.*;

public class DoAsI extends JavaPlugin implements TabCompleter, CommandExecutor
{
	@Override
	public void onEnable()
	{
		getCommand("doasi").setTabCompleter(this);
		getCommand("doasi").setExecutor(this);
	}
	@Override
	public void onDisable()
	{
	}

	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args)
	{
		List<String> suggestions = new ArrayList<>();
		if(sender instanceof Player)
		{
			Player permitter = (Player)sender;
			if(args.length == 1)
			{
				for(Player p : getServer().getOnlinePlayers())
				{
					if(p.getName().substring(0, args[0].length()).equalsIgnoreCase(args[0]))
					{
						suggestions.add(p.getName());
					}
				}
			}
			else if(args.length == 2)
			{
				for(HelpTopic ht : getServer().getHelpMap().getHelpTopics())
				{
					String c = ht.getName();
					if(c.length() >= args[1].length() && c.substring(0, args[1].length()).equalsIgnoreCase(args[1]))
					{
						suggestions.add(c);
					}
				}
			}
			else if(args.length > 2)
			{
				Player p = getServer().getPlayer(args[0]);
				String message = args[1].substring(1);
				String[] cargs = new String[args.length-2];
				for(int i = 2; i < args.length; ++i)
				{
					message += " " + args[i];
					cargs[i-2] = args[i];
				}
				if(p != null)
				{
					PermittedPlayerProxy ppp = new PermittedPlayerProxy(p, permitter);
					PluginCommand pc = getServer().getPluginCommand(args[1].substring(1));
					if(pc != null)
					{
						List<String> sugg = pc.getTabCompleter().onTabComplete(ppp, pc, args[1].substring(1), cargs);
						PlayerChatTabCompleteEvent pctce = new PlayerChatTabCompleteEvent(ppp, message, sugg);
						getServer().getPluginManager().callEvent(pctce);
						suggestions.addAll(sugg);
					}
				}
			}
		}
		sender.sendMessage(Arrays.deepToString(suggestions.toArray(new String[0])));
		return suggestions;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player permitter = (Player)sender;
			if(args.length == 0)
			{
				PluginDescriptionFile d = getDescription();
				sender.sendMessage(d.getName()+" v"+d.getVersion()+" by "+d.getAuthors().get(0));
				sender.sendMessage("For help, use /help "+d.getName()+" [page-#]");
				return true;
			}
			else if(args.length >= 2)
			{
				Player p = getServer().getPlayer(args[0]);
				if(p != null)
				{
					String command = args[1].substring(1);
					for(int i = 2; i < args.length; ++i)
					{
						command += " " + args[i];
					}
					PermittedPlayerProxy ppp = new PermittedPlayerProxy(p, permitter);
					if(!getServer().dispatchCommand(ppp, command))
					{
						sender.sendMessage("[DoAsI] Command sudo failed");
					}
				}
				else
				{
					sender.sendMessage("[DoAsI] Player not found");
				}
				return true;
			}
		}
		return false;
	}
}
