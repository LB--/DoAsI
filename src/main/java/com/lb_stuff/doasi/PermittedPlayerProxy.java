package com.lb_stuff.doasi;

import java.net.InetSocketAddress;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.*;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.Vector;

import java.util.*;

public class PermittedPlayerProxy implements Player
{
	private final Player p;
	private final Player perm;
	public PermittedPlayerProxy(Player player, Player permitter)
	{
		p = player;
		perm = permitter;
	}

	@Override
	public String getDisplayName()
	{
		return p.getDisplayName();
	}
	@Override
	public void setDisplayName(String string)
	{
		p.setDisplayName(string);
	}
	@Override
	public String getPlayerListName()
	{
		return p.getPlayerListName();
	}
	@Override
	public void setPlayerListName(String string)
	{
		p.setPlayerListName(string);
	}
	@Override
	public void setCompassTarget(Location lctn)
	{
		p.setCompassTarget(lctn);
	}
	@Override
	public Location getCompassTarget()
	{
		return p.getCompassTarget();
	}
	@Override
	public InetSocketAddress getAddress()
	{
		return p.getAddress();
	}
	@Override
	public void sendRawMessage(String string)
	{
		p.sendRawMessage(string);
	}
	@Override
	public void kickPlayer(String string)
	{
		p.kickPlayer(string);
	}
	@Override
	public void chat(String string)
	{
		p.chat(string);
	}
	@Override
	public boolean performCommand(String string)
	{
		return p.performCommand(string);
	}
	@Override
	public boolean isSneaking()
	{
		return p.isSneaking();
	}
	@Override
	public void setSneaking(boolean bln)
	{
		p.setSneaking(bln);
	}
	@Override
	public boolean isSprinting()
	{
		return p.isSprinting();
	}
	@Override
	public void setSprinting(boolean bln)
	{
		p.setSprinting(bln);
	}
	@Override
	public void saveData()
	{
		p.saveData();
	}
	@Override
	public void loadData()
	{
		p.loadData();
	}
	@Override
	public void setSleepingIgnored(boolean bln)
	{
		p.setSleepingIgnored(bln);
	}
	@Override
	public boolean isSleepingIgnored()
	{
		return p.isSleepingIgnored();
	}
	@Override
	public void playNote(Location lctn, byte b, byte b1)
	{
		p.playNote(lctn, b, b1);
	}
	@Override
	public void playNote(Location lctn, Instrument i, Note note)
	{
		p.playNote(lctn, i, note);
	}
	@Override
	public void playSound(Location lctn, Sound sound, float f, float f1)
	{
		p.playSound(lctn, sound, f, f1);
	}
	@Override
	public void playSound(Location lctn, String string, float f, float f1)
	{
		p.playSound(lctn, string, f, f1);
	}
	@Override
	public void playEffect(Location lctn, Effect effect, int i)
	{
		p.playEffect(lctn, effect, i);
	}
	@Override
	public <T> void playEffect(Location lctn, Effect effect, T t)
	{
		p.playEffect(lctn, effect, t);
	}
	@Override
	public void sendBlockChange(Location lctn, Material mtrl, byte b)
	{
		p.sendBlockChange(lctn, mtrl, b);
	}
	@Override
	public boolean sendChunkChange(Location lctn, int i, int i1, int i2, byte[] bytes)
	{
		return p.sendChunkChange(lctn, i, i1, i2, bytes);
	}
	@Override
	public void sendBlockChange(Location lctn, int i, byte b)
	{
		p.sendBlockChange(lctn, i, b);
	}
	@Override
	public void sendSignChange(Location lctn, String[] strings) throws IllegalArgumentException
	{
		p.sendSignChange(lctn, strings);
	}
	@Override
	public void sendMap(MapView mv)
	{
		p.sendMap(mv);
	}
	@Override
	public void updateInventory()
	{
		p.updateInventory();
	}
	@Override
	public void awardAchievement(Achievement a)
	{
		p.awardAchievement(a);
	}
	@Override
	public void removeAchievement(Achievement a)
	{
		p.removeAchievement(a);
	}
	@Override
	public boolean hasAchievement(Achievement a)
	{
		return p.hasAchievement(a);
	}
	@Override
	public void incrementStatistic(Statistic ststc) throws IllegalArgumentException
	{
		p.incrementStatistic(ststc);
	}
	@Override
	public void decrementStatistic(Statistic ststc) throws IllegalArgumentException
	{
		p.decrementStatistic(ststc);
	}
	@Override
	public void incrementStatistic(Statistic ststc, int i) throws IllegalArgumentException
	{
		p.incrementStatistic(ststc, i);
	}
	@Override
	public void decrementStatistic(Statistic ststc, int i) throws IllegalArgumentException
	{
		p.decrementStatistic(ststc, i);
	}
	@Override
	public void setStatistic(Statistic ststc, int i) throws IllegalArgumentException
	{
		p.setStatistic(ststc, i);
	}
	@Override
	public int getStatistic(Statistic ststc) throws IllegalArgumentException
	{
		return p.getStatistic(ststc);
	}
	@Override
	public void incrementStatistic(Statistic ststc, Material mtrl) throws IllegalArgumentException
	{
		p.incrementStatistic(ststc, mtrl);
	}
	@Override
	public void decrementStatistic(Statistic ststc, Material mtrl) throws IllegalArgumentException
	{
		p.decrementStatistic(ststc, mtrl);
	}
	@Override
	public int getStatistic(Statistic ststc, Material mtrl) throws IllegalArgumentException
	{
		return p.getStatistic(ststc, mtrl);
	}
	@Override
	public void incrementStatistic(Statistic ststc, Material mtrl, int i) throws IllegalArgumentException
	{
		p.incrementStatistic(ststc, mtrl, i);
	}
	@Override
	public void decrementStatistic(Statistic ststc, Material mtrl, int i) throws IllegalArgumentException
	{
		p.decrementStatistic(ststc, mtrl, i);
	}
	@Override
	public void setStatistic(Statistic ststc, Material mtrl, int i) throws IllegalArgumentException
	{
		p.setStatistic(ststc, mtrl, i);
	}
	@Override
	public void incrementStatistic(Statistic ststc, EntityType et) throws IllegalArgumentException
	{
		p.incrementStatistic(ststc, et);
	}
	@Override
	public void decrementStatistic(Statistic ststc, EntityType et) throws IllegalArgumentException
	{
		p.decrementStatistic(ststc, et);
	}
	@Override
	public int getStatistic(Statistic ststc, EntityType et) throws IllegalArgumentException
	{
		return p.getStatistic(ststc, et);
	}
	@Override
	public void incrementStatistic(Statistic ststc, EntityType et, int i) throws IllegalArgumentException
	{
		p.incrementStatistic(ststc, et, i);
	}
	@Override
	public void decrementStatistic(Statistic ststc, EntityType et, int i)
	{
		p.decrementStatistic(ststc, et, i);
	}
	@Override
	public void setStatistic(Statistic ststc, EntityType et, int i)
	{
		p.setStatistic(ststc, et, i);
	}
	@Override
	public void setPlayerTime(long l, boolean bln)
	{
		p.setPlayerTime(l, bln);
	}
	@Override
	public long getPlayerTime()
	{
		return p.getPlayerTime();
	}
	@Override
	public long getPlayerTimeOffset()
	{
		return p.getPlayerTimeOffset();
	}
	@Override
	public boolean isPlayerTimeRelative()
	{
		return p.isPlayerTimeRelative();
	}
	@Override
	public void resetPlayerTime()
	{
		p.resetPlayerTime();
	}
	@Override
	public void setPlayerWeather(WeatherType wt)
	{
		p.setPlayerWeather(wt);
	}
	@Override
	public WeatherType getPlayerWeather()
	{
		return p.getPlayerWeather();
	}
	@Override
	public void resetPlayerWeather()
	{
		p.resetPlayerWeather();
	}
	@Override
	public void giveExp(int i)
	{
		p.giveExp(i);
	}
	@Override
	public void giveExpLevels(int i)
	{
		p.giveExpLevels(i);
	}
	@Override
	public float getExp()
	{
		return p.getExp();
	}
	@Override
	public void setExp(float f)
	{
		p.setExp(f);
	}
	@Override
	public int getLevel()
	{
		return p.getLevel();
	}
	@Override
	public void setLevel(int i)
	{
		p.setLevel(i);
	}
	@Override
	public int getTotalExperience()
	{
		return p.getTotalExperience();
	}
	@Override
	public void setTotalExperience(int i)
	{
		p.setTotalExperience(i);
	}
	@Override
	public float getExhaustion()
	{
		return p.getExhaustion();
	}
	@Override
	public void setExhaustion(float f)
	{
		p.setExhaustion(f);
	}
	@Override
	public float getSaturation()
	{
		return p.getSaturation();
	}
	@Override
	public void setSaturation(float f)
	{
		p.setSaturation(f);
	}
	@Override
	public int getFoodLevel()
	{
		return p.getFoodLevel();
	}
	@Override
	public void setFoodLevel(int i)
	{
		p.setFoodLevel(i);
	}
	@Override
	public Location getBedSpawnLocation()
	{
		return p.getBedSpawnLocation();
	}
	@Override
	public void setBedSpawnLocation(Location lctn)
	{
		p.setBedSpawnLocation(lctn);
	}
	@Override
	public void setBedSpawnLocation(Location lctn, boolean bln)
	{
		p.setBedSpawnLocation(lctn, bln);
	}
	@Override
	public boolean getAllowFlight()
	{
		return p.getAllowFlight();
	}
	@Override
	public void setAllowFlight(boolean bln)
	{
		p.setAllowFlight(bln);
	}
	@Override
	public void hidePlayer(Player player)
	{
		p.hidePlayer(player);
	}
	@Override
	public void showPlayer(Player player)
	{
		p.showPlayer(player);
	}
	@Override
	public boolean canSee(Player player)
	{
		return p.canSee(player);
	}
	@Override
	public boolean isOnGround()
	{
		return p.isOnGround();
	}
	@Override
	public boolean isFlying()
	{
		return p.isFlying();
	}
	@Override
	public void setFlying(boolean bln)
	{
		p.setFlying(bln);
	}
	@Override
	public void setFlySpeed(float f) throws IllegalArgumentException
	{
		p.setFlySpeed(f);
	}
	@Override
	public void setWalkSpeed(float f) throws IllegalArgumentException
	{
		p.setWalkSpeed(f);
	}
	@Override
	public float getFlySpeed()
	{
		return p.getFlySpeed();
	}
	@Override
	public float getWalkSpeed()
	{
		return p.getWalkSpeed();
	}
	@Override
	public void setTexturePack(String string)
	{
		p.setTexturePack(string);
	}
	@Override
	public void setResourcePack(String string)
	{
		p.setResourcePack(string);
	}
	@Override
	public Scoreboard getScoreboard()
	{
		return p.getScoreboard();
	}
	@Override
	public void setScoreboard(Scoreboard scrbrd) throws IllegalArgumentException, IllegalStateException
	{
		p.setScoreboard(scrbrd);
	}
	@Override
	public boolean isHealthScaled()
	{
		return p.isHealthScaled();
	}
	@Override
	public void setHealthScaled(boolean bln)
	{
		p.setHealthScaled(bln);
	}
	@Override
	public void setHealthScale(double d) throws IllegalArgumentException
	{
		p.setHealthScale(d);
	}
	@Override
	public double getHealthScale()
	{
		return p.getHealthScale();
	}
	@Override
	public String getName()
	{
		return p.getName();
	}
	@Override
	public PlayerInventory getInventory()
	{
		return p.getInventory();
	}
	@Override
	public Inventory getEnderChest()
	{
		return p.getEnderChest();
	}
	@Override
	public boolean setWindowProperty(InventoryView.Property prprt, int i)
	{
		return p.setWindowProperty(prprt, i);
	}
	@Override
	public InventoryView getOpenInventory()
	{
		return p.getOpenInventory();
	}
	@Override
	public InventoryView openInventory(Inventory invntr)
	{
		return p.openInventory(invntr);
	}
	@Override
	public InventoryView openWorkbench(Location lctn, boolean bln)
	{
		return p.openWorkbench(lctn, bln);
	}
	@Override
	public InventoryView openEnchanting(Location lctn, boolean bln)
	{
		return p.openEnchanting(lctn, bln);
	}
	@Override
	public void openInventory(InventoryView iv)
	{
		p.openInventory(iv);
	}
	@Override
	public void closeInventory()
	{
		p.closeInventory();
	}
	@Override
	public ItemStack getItemInHand()
	{
		return p.getItemInHand();
	}
	@Override
	public void setItemInHand(ItemStack is)
	{
		p.setItemInHand(is);
	}
	@Override
	public ItemStack getItemOnCursor()
	{
		return p.getItemOnCursor();
	}
	@Override
	public void setItemOnCursor(ItemStack is)
	{
		p.setItemOnCursor(is);
	}
	@Override
	public boolean isSleeping()
	{
		return p.isSleeping();
	}
	@Override
	public int getSleepTicks()
	{
		return p.getSleepTicks();
	}
	@Override
	public GameMode getGameMode()
	{
		return p.getGameMode();
	}
	@Override
	public void setGameMode(GameMode gm)
	{
		p.setGameMode(gm);
	}
	@Override
	public boolean isBlocking()
	{
		return p.isBlocking();
	}
	@Override
	public int getExpToLevel()
	{
		return p.getExpToLevel();
	}
	@Override
	public double getEyeHeight()
	{
		return p.getEyeHeight();
	}
	@Override
	public double getEyeHeight(boolean bln)
	{
		return p.getEyeHeight();
	}
	@Override
	public Location getEyeLocation()
	{
		return p.getEyeLocation();
	}
	@Override
	public List<Block> getLineOfSight(HashSet<Byte> hs, int i)
	{
		return p.getLineOfSight(hs, i);
	}
	@Override
	public Block getTargetBlock(HashSet<Byte> hs, int i)
	{
		return p.getTargetBlock(hs, i);
	}
	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> hs, int i)
	{
		return p.getLastTwoTargetBlocks(hs, i);
	}
	@Override
	public Egg throwEgg()
	{
		return p.throwEgg();
	}
	@Override
	public Snowball throwSnowball()
	{
		return p.throwSnowball();
	}
	@Override
	public Arrow shootArrow()
	{
		return p.shootArrow();
	}
	@Override
	public int getRemainingAir()
	{
		return p.getRemainingAir();
	}
	@Override
	public void setRemainingAir(int i)
	{
		p.setRemainingAir(i);
	}
	@Override
	public int getMaximumAir()
	{
		return p.getMaximumAir();
	}
	@Override
	public void setMaximumAir(int i)
	{
		p.setMaximumAir(i);
	}
	@Override
	public int getMaximumNoDamageTicks()
	{
		return p.getMaximumNoDamageTicks();
	}
	@Override
	public void setMaximumNoDamageTicks(int i)
	{
		p.setMaximumNoDamageTicks(i);
	}
	@Override
	public double getLastDamage()
	{
		return p.getLastDamage();
	}
	@Override
	public int _INVALID_getLastDamage()
	{
		return p._INVALID_getLastDamage();
	}
	@Override
	public void setLastDamage(double d)
	{
		p.setLastDamage(d);
	}
	@Override
	public void _INVALID_setLastDamage(int i)
	{
		p._INVALID_setLastDamage(i);
	}
	@Override
	public int getNoDamageTicks()
	{
		return p.getNoDamageTicks();
	}
	@Override
	public void setNoDamageTicks(int i)
	{
		p.setNoDamageTicks(i);
	}
	@Override
	public Player getKiller()
	{
		return p.getKiller();
	}
	@Override
	public boolean addPotionEffect(PotionEffect pe)
	{
		return p.addPotionEffect(pe);
	}
	@Override
	public boolean addPotionEffect(PotionEffect pe, boolean bln)
	{
		return p.addPotionEffect(pe, bln);
	}
	@Override
	public boolean addPotionEffects(Collection<PotionEffect> clctn)
	{
		return p.addPotionEffects(clctn);
	}
	@Override
	public boolean hasPotionEffect(PotionEffectType pet)
	{
		return p.hasPotionEffect(pet);
	}
	@Override
	public void removePotionEffect(PotionEffectType pet)
	{
		p.removePotionEffect(pet);
	}
	@Override
	public Collection<PotionEffect> getActivePotionEffects()
	{
		return p.getActivePotionEffects();
	}
	@Override
	public boolean hasLineOfSight(Entity entity)
	{
		return p.hasLineOfSight(entity);
	}
	@Override
	public boolean getRemoveWhenFarAway()
	{
		return p.getRemoveWhenFarAway();
	}
	@Override
	public void setRemoveWhenFarAway(boolean bln)
	{
		p.setRemoveWhenFarAway(bln);
	}
	@Override
	public EntityEquipment getEquipment()
	{
		return p.getEquipment();
	}
	@Override
	public void setCanPickupItems(boolean bln)
	{
		p.setCanPickupItems(bln);
	}
	@Override
	public boolean getCanPickupItems()
	{
		return p.getCanPickupItems();
	}
	@Override
	public void setCustomName(String string)
	{
		p.setCustomName(string);
	}
	@Override
	public String getCustomName()
	{
		return p.getCustomName();
	}
	@Override
	public void setCustomNameVisible(boolean bln)
	{
		p.setCustomNameVisible(bln);
	}
	@Override
	public boolean isCustomNameVisible()
	{
		return p.isCustomNameVisible();
	}
	@Override
	public boolean isLeashed()
	{
		return p.isLeashed();
	}
	@Override
	public Entity getLeashHolder() throws IllegalStateException
	{
		return p.getLeashHolder();
	}
	@Override
	public boolean setLeashHolder(Entity entity)
	{
		return p.setLeashHolder(entity);
	}
	@Override
	public Location getLocation()
	{
		return p.getLocation();
	}
	@Override
	public Location getLocation(Location lctn)
	{
		return p.getLocation();
	}
	@Override
	public void setVelocity(Vector vector)
	{
		p.setVelocity(vector);
	}
	@Override
	public Vector getVelocity()
	{
		return p.getVelocity();
	}
	@Override
	public World getWorld()
	{
		return p.getWorld();
	}
	@Override
	public boolean teleport(Location lctn)
	{
		return p.teleport(lctn);
	}
	@Override
	public boolean teleport(Location lctn, PlayerTeleportEvent.TeleportCause tc)
	{
		return p.teleport(lctn, tc);
	}
	@Override
	public boolean teleport(Entity entity)
	{
		return p.teleport(entity);
	}
	@Override
	public boolean teleport(Entity entity, PlayerTeleportEvent.TeleportCause tc)
	{
		return p.teleport(entity, tc);
	}
	@Override
	public List<Entity> getNearbyEntities(double d, double d1, double d2)
	{
		return p.getNearbyEntities(d, d1, d2);
	}
	@Override
	public int getEntityId()
	{
		return p.getEntityId();
	}
	@Override
	public int getFireTicks()
	{
		return p.getFireTicks();
	}
	@Override
	public int getMaxFireTicks()
	{
		return p.getMaxFireTicks();
	}
	@Override
	public void setFireTicks(int i)
	{
		p.setFireTicks(i);
	}
	@Override
	public void remove()
	{
		p.remove();
	}
	@Override
	public boolean isDead()
	{
		return p.isDead();
	}
	@Override
	public boolean isValid()
	{
		return p.isValid();
	}
	@Override
	public Server getServer()
	{
		return p.getServer();
	}
	@Override
	public Entity getPassenger()
	{
		return p.getPassenger();
	}
	@Override
	public boolean setPassenger(Entity entity)
	{
		return p.setPassenger(entity);
	}
	@Override
	public boolean isEmpty()
	{
		return p.isEmpty();
	}
	@Override
	public boolean eject()
	{
		return p.eject();
	}
	@Override
	public float getFallDistance()
	{
		return p.getFallDistance();
	}
	@Override
	public void setFallDistance(float f)
	{
		p.setFallDistance(f);
	}
	@Override
	public void setLastDamageCause(EntityDamageEvent ede)
	{
		p.setLastDamageCause(ede);
	}
	@Override
	public EntityDamageEvent getLastDamageCause()
	{
		return p.getLastDamageCause();
	}
	@Override
	public UUID getUniqueId()
	{
		return p.getUniqueId();
	}
	@Override
	public int getTicksLived()
	{
		return p.getTicksLived();
	}
	@Override
	public void setTicksLived(int i)
	{
		p.setTicksLived(i);
	}
	@Override
	public void playEffect(EntityEffect ee)
	{
		p.playEffect(ee);
	}
	@Override
	public EntityType getType()
	{
		return p.getType();
	}
	@Override
	public boolean isInsideVehicle()
	{
		return p.isInsideVehicle();
	}
	@Override
	public boolean leaveVehicle()
	{
		return p.leaveVehicle();
	}
	@Override
	public Entity getVehicle()
	{
		return p.getVehicle();
	}
	@Override
	public void setMetadata(String string, MetadataValue mv)
	{
		p.setMetadata(string, mv);
	}
	@Override
	public List<MetadataValue> getMetadata(String string)
	{
		return p.getMetadata(string);
	}
	@Override
	public boolean hasMetadata(String string)
	{
		return p.hasMetadata(string);
	}
	@Override
	public void removeMetadata(String string, Plugin plugin)
	{
		p.removeMetadata(string, plugin);
	}
	@Override
	public void damage(double d)
	{
		p.damage(d);
	}
	@Override
	public void _INVALID_damage(int i)
	{
		p._INVALID_damage(i);
	}
	@Override
	public void damage(double d, Entity entity)
	{
		p.damage(d, entity);
	}
	@Override
	public void _INVALID_damage(int i, Entity entity)
	{
		p._INVALID_damage(i, entity);
	}
	@Override
	public double getHealth()
	{
		return p.getHealth();
	}
	@Override
	public int _INVALID_getHealth()
	{
		return p._INVALID_getHealth();
	}
	@Override
	public void setHealth(double d)
	{
		p.setHealth(d);
	}
	@Override
	public void _INVALID_setHealth(int i)
	{
		p._INVALID_setHealth(i);
	}
	@Override
	public double getMaxHealth()
	{
		return p.getMaxHealth();
	}
	@Override
	public int _INVALID_getMaxHealth()
	{
		return p._INVALID_getMaxHealth();
	}
	@Override
	public void setMaxHealth(double d)
	{
		p.setMaxHealth(d);
	}
	@Override
	public void _INVALID_setMaxHealth(int i)
	{
		p._INVALID_setMaxHealth(i);
	}
	@Override
	public void resetMaxHealth()
	{
		p.resetMaxHealth();
	}
	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> type)
	{
		return p.launchProjectile(type);
	}
	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> type, Vector vector)
	{
		return p.launchProjectile(type, vector);
	}
	@Override
	public boolean isPermissionSet(String string)
	{
		return perm.isPermissionSet(string);
	}
	@Override
	public boolean isPermissionSet(Permission prmsn)
	{
		return perm.isPermissionSet(prmsn);
	}
	@Override
	public boolean hasPermission(String string)
	{
		return perm.hasPermission(string);
	}
	@Override
	public boolean hasPermission(Permission prmsn)
	{
		return perm.hasPermission(prmsn);
	}
	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String string, boolean bln)
	{
		return perm.addAttachment(plugin, string, bln);
	}
	@Override
	public PermissionAttachment addAttachment(Plugin plugin)
	{
		return perm.addAttachment(plugin);
	}
	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String string, boolean bln, int i)
	{
		return perm.addAttachment(plugin, string, bln, i);
	}
	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int i)
	{
		return perm.addAttachment(plugin, i);
	}
	@Override
	public void removeAttachment(PermissionAttachment pa)
	{
		perm.removeAttachment(pa);
	}
	@Override
	public void recalculatePermissions()
	{
		perm.recalculatePermissions();
	}
	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions()
	{
		return perm.getEffectivePermissions();
	}
	@Override
	public boolean isOp()
	{
		return perm.isOp();
	}
	@Override
	public void setOp(boolean bln)
	{
		p.setOp(bln);
	}
	@Override
	public boolean isConversing()
	{
		return p.isConversing();
	}
	@Override
	public void acceptConversationInput(String string)
	{
		p.acceptConversationInput(string);
	}
	@Override
	public boolean beginConversation(Conversation c)
	{
		return p.beginConversation(c);
	}
	@Override
	public void abandonConversation(Conversation c)
	{
		p.abandonConversation(c);
	}
	@Override
	public void abandonConversation(Conversation c, ConversationAbandonedEvent cae)
	{
		p.abandonConversation(c, cae);
	}
	@Override
	public void sendMessage(String string)
	{
		p.sendMessage(string);
	}
	@Override
	public void sendMessage(String[] strings)
	{
		p.sendMessage(strings);
	}
	@Override
	public boolean isOnline()
	{
		return p.isOnline();
	}
	@Override
	public boolean isBanned()
	{
		return p.isBanned();
	}
	@Override
	public void setBanned(boolean bln)
	{
		p.setBanned(bln);
	}
	@Override
	public boolean isWhitelisted()
	{
		return p.isWhitelisted();
	}
	@Override
	public void setWhitelisted(boolean bln)
	{
		p.setWhitelisted(bln);
	}
	@Override
	public Player getPlayer()
	{
		return p.getPlayer();
	}
	@Override
	public long getFirstPlayed()
	{
		return p.getFirstPlayed();
	}
	@Override
	public long getLastPlayed()
	{
		return p.getLastPlayed();
	}
	@Override
	public boolean hasPlayedBefore()
	{
		return p.hasPlayedBefore();
	}
	@Override
	public Map<String, Object> serialize()
	{
		return p.serialize();
	}
	@Override
	public void sendPluginMessage(Plugin plugin, String string, byte[] bytes)
	{
		p.sendPluginMessage(plugin, string, bytes);
	}
	@Override
	public Set<String> getListeningPluginChannels()
	{
		return p.getListeningPluginChannels();
	}
}