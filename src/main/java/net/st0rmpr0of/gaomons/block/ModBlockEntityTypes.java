package net.st0rmpr0of.gaomons.block;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.st0rmpr0of.gaomons.GaoMons;
import net.st0rmpr0of.gaomons.block.entity.FuserBlockEntity;

public class ModBlockEntityTypes {
    public static final BlockEntityType<FuserBlockEntity> FUSER_BLOCK_ENTITY = registerBlockEntityType("fuser_block_entity",
            BlockEntityType.Builder.create(FuserBlockEntity::new, ModBlocks.FUSER_BLOCK)
                    .build());

    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntityType(String name, BlockEntityType<T> type) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, GaoMons.MOD_ID, type);
    }

    public static void registerModBlockEntityTypes(){
        GaoMons.LOGGER.info("Registering Mod Block Entity Types for " + GaoMons.MOD_ID);
    }
}
