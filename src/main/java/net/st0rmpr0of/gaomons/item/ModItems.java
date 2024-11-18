package net.st0rmpr0of.gaomons.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.st0rmpr0of.gaomons.GaoMons;

public class ModItems {
    public static final Item GROWL_PHONE = registerItem("growl_phone", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(GaoMons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GaoMons.LOGGER.info("Registering Mod Items for" + GaoMons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(GROWL_PHONE);
        });
    }
}
