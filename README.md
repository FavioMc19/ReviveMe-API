# ReviveMe-API:
#Check if the player is injured
Boolean isDowned = ReviveMeAPI.hasDowned(player);

#check if the player is reviving someone
Boolean  isReliver = ReviveMeAPI.isReliver(player);

#get injured player by reliver
DownedPlayer downed = ReviveMeAPI.getDownedPlayerByReliver(player);

#get injured player
DownedPlayer downed = ReviveMeAPI.getDownedPlayer(player);

#Revive an injured player
ReviveMeAPI.revivePlayer(player);

#set down to player
ReviveMeAPI.downPlayer(player);

#set down to player
ReviveMeAPI.downPlayer(player, DamageCause.FALL);

#set down to player
ReviveMeAPI.downPlayer(player, player);

#set down to player
ReviveMeAPI.downPlayer(player, DamageCause.ENTITY_ATTACK, player);

@EventHandler
public void onPlayerDowned(PlayerDownedEvent event) {
    #code this
}

@EventHandler
public void onPlayerDropDowned(PlayerDropDownedEvent event) {
    #code this
}

@EventHandler
public void onPlayerPickupDowned(PlayerPickupDownedEvent event) {
    #code this
}

@EventHandler
public void onPlayerRelivingDowned(PlayerRelivingEvent event) {
    #code this
}

@EventHandler
public void onPlayerRevive(PlayerReviveEvent event) {
    #code this
}

@EventHandler
public void onPlayerStartReliving(PlayerStartRelivingEvent event) {
    #code this
}

@EventHandler
public void onPlayerStopReliving(PlayerStopRelivingEvent event) {
    #code this
}
