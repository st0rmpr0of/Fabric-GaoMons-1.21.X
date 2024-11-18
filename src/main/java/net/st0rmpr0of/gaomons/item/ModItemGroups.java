package net.st0rmpr0of.gaomons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.st0rmpr0of.gaomons.GaoMons;

public class ModItemGroups {
    public static final ItemGroup GAOMONS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GaoMons.MOD_ID, "gaomons_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GROWL_PHONE))
                    .displayName(Text.translatable("itemgroup.gaomons.gaomons_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GROWL_PHONE);
                    }).build());

    public static void registerItemGroups() {
        GaoMons.LOGGER.info("Registering Item Groups for" + GaoMons.MOD_ID);
    }
}
