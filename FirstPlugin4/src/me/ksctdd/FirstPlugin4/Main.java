package me.ksctdd.FirstPlugin4;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin{
	@Override
	public void onEnable()
	{
		this.saveDefaultConfig();
		this.getLogger().info("[OPENING]4");
	}
	@Override
	public void onDisable()
	{
		
		this.getLogger().info("[CLOSING DOWN]4");
	}
	float x = (float) this.getConfig().getInt("lobby.x");
	float y = (float) this.getConfig().getInt("lobby.y");
	float z = (float) this.getConfig().getInt("lobby.z");
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args)
	{
		
		if (cmd.getName().equalsIgnoreCase("lobby"))
		{
			
			if (args.length == 1)
			{
				if ( args[0].equalsIgnoreCase("reload"))
				{
					this.reloadConfig();
					sender.sendMessage("reloaded");
				}else{
					sender.sendMessage("Incorrect argument! /lobby");
				}
			}
			else
			{
				if (sender instanceof Player)
				{
					Player player = (Player) sender;
					
					
					if (player.hasPermission("Plugin.Lobby"))
					{
						//float x = (float) this.getConfig().getInt("lobby.x");
						//float y = (float) this.getConfig().getInt("lobby.y");
						//float z = (float) this.getConfig().getInt("lobby.z");
						World world = Bukkit.getWorld(this.getConfig().getString("lobby.world"));
						
						
						Location loc = new Location(world, x, y, z);
						if (loc==null)
						{
							sender.sendMessage("is null");
						}
						else
						{
							sender.sendMessage("is not null");
						}
						
						player.teleport(loc);
						
						
						
						for (String key : this.getConfig().getConfigurationSection("potion").getKeys(false))
						{
							PotionEffectType pet = PotionEffectType.getByName(this.getConfig().getString("potion."+key+".effect").toUpperCase());
							int dura = this.getConfig().getInt("potion."+key+".duration");
							int amp = this.getConfig().getInt(key+".amplifier");
							
							player.addPotionEffect(new PotionEffect(pet, dura, amp));
							
						}
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "welcome to the lobby"));
						player.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9[lobby] &e" + player.getName()));
						
						
						return true;
					}else {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "wrong permission level"));
						return true;
					}
					
					
				} else {
					sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "console cannot"));
					return true;
					
				}
				
			
			}
		}
			
		
		
		
		return false;
	}
}
