package com.untamedears.civchat;


import java.util.ArrayList;
import java.util.List;

import javax.tools.JavaFileManager.Location;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;


public class Listener {
	List<String> listeners= new ArrayList<String>();
	Locations ln= new Locations();
	public void PlayerChatEvent(AsyncPlayerChatEvent event){
		Player player=event.getPlayer();
		int X= player.getLocation().getBlockX();
		int Y= player.getLocation().getBlockY();
		int Z= player.getLocation().getBlockZ();
		for (Player name: event.getRecipients()){
			listeners.add(name.getName());
		}
		ln.setPlayerLocation(X,Y,Z);
		ln.SetPlayerlistners(listeners);
	}
}
