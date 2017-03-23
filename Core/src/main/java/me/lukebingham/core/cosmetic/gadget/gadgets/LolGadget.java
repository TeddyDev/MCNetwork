package me.lukebingham.core.cosmetic.gadget.gadgets;

import me.lukebingham.core.cosmetic.gadget.Gadget;
import me.lukebingham.core.cosmetic.gadget.GadgetTriggerType;
import me.lukebingham.core.cosmetic.attributes.CosmeticBuyable;
import me.lukebingham.core.cosmetic.attributes.CosmeticUnlockable;
import me.lukebingham.core.cosmetic.gadget.GadgetType;
import me.lukebingham.core.util.C;
import me.lukebingham.core.util.Dev;
import me.lukebingham.core.util.factory.ItemFactory;
import org.bukkit.Material;
import org.bukkit.entity.Player;

/**
 * Created by LukeBingham on 26/02/2017.
 */
@Dev
public class LolGadget implements Gadget, CosmeticBuyable, CosmeticUnlockable {

    @Override
    public int getUniqueId() {
        return 2;
    }

    @Override
    public String getName() {
        return "Lol";
    }

    @Override
    public String[] getDescription() {
        return new String[] {
                "This is a test gadget",
        };
    }

    @Override
    public GadgetTriggerType getTriggerType() {
        return GadgetTriggerType.RIGHT_CLICK;
    }

    @Override
    public long[] getCooldown() {
        return new long[] {
                5 * 1000, //Non-Supporter cooldown time.
                3 * 1000, //Supporter cooldown time.
        };
    }

    @Override
    public ItemFactory getItemFactory() {
        return new ItemFactory(Material.BONE);
    }

    @Override
    public GadgetType getGadgetType() {
        return GadgetType.LOL;
    }

    @Override
    public void action(Player player) {
        player.sendMessage(C.YELLOW + "Really? this is all this does? WOW..");
    }

    @Override
    public double getCost() {
        return 1000;
    }

    @Override
    public double getRarity() {
        return 20;
    }
}
