package xyz.fragmentmc.fragmentcore.api.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MultiDispenserEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Block block;
    private final Entity entity;
    private final int amount;
    private final int fuse;

    public MultiDispenserEvent(boolean cancelled, Block block, Entity entity, int amount, int fuse) {
        this.cancelled = cancelled;
        this.block = block;
        this.entity = entity;
        this.amount = amount;
        this.fuse = fuse;
    }

    public Block getBlock() {
        return block;
    }

    public Entity getEntity() {
        return entity;
    }

    public int getAmount() {
        return amount;
    }

    public int getFuse() {
        return fuse;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
