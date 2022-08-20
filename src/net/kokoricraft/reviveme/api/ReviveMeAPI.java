package net.kokoricraft.reviveme.api;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import net.kokoricraft.reviveme.objects.DownedPlayer;

public interface ReviveMeAPI {
	
	static Boolean hasDowned(Player player) {
		throw new AbstractMethodError();
	}
	
	static Boolean isReliver(Player player) {
		throw new AbstractMethodError();
	}
	
	 static DownedPlayer getDownedPlayer(Player player) {
		 throw new AbstractMethodError();
	}
	
	static DownedPlayer getDownedPlayerByReliver(Player reviver) {
		throw new AbstractMethodError();
	}
	
	static void revivePlayer(Player player) {
		throw new AbstractMethodError();
	}
	
	static void revivePlayer(Player player, Player reviver) {
		throw new AbstractMethodError();
	}
	
	static void downPlayer(Player player) {
		throw new AbstractMethodError();
	}
	
	static void downPlayer(Player player, Player enemy) {
		throw new AbstractMethodError();
	}
	
	static void downPlayer(Player player, DamageCause cause) {
		throw new AbstractMethodError();
	}
	
	static void downPlayer(Player player, DamageCause cause, Player enemy) {
		throw new AbstractMethodError();
	}
	
	static Boolean isDownable(EntityDamageEvent event) {
		throw new AbstractMethodError();
	}
	
	static void setDownedEntityPlayer(Entity entity) {
		throw new AbstractMethodError();
	}
	
	static void setStandEntityPlayer(Entity entity) {
		throw new AbstractMethodError();
	}
}
