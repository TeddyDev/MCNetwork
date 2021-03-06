package me.lukebingham.game.combat.indicator;

import net.minecraft.server.v1_8_R3.EntityArmorStand;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.entity.LivingEntity;

/**
 * Created by LukeBingham on 30/03/2017.
 */
public final class DamageIndicatorEntity extends EntityArmorStand {

    /**
     * Construct a new DamageIndicator {@link org.bukkit.entity.Entity}
     *
     * @param entity The entity
     */
    public DamageIndicatorEntity(LivingEntity entity) {
        super(((CraftWorld) entity.getLocation().getWorld()).getHandle());
    }

    public final void sendDirection() {
//        boolean b = Math.random() < 0.5;
        motY = locY * 1.05;
        velocityChanged = true;
    }
}
