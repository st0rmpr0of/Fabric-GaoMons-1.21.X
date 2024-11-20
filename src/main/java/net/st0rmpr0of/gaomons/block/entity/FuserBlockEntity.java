package net.st0rmpr0of.gaomons.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.st0rmpr0of.gaomons.block.ModBlockEntityTypes;

public class FuserBlockEntity extends BlockEntity {
    public FuserBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.FUSER_BLOCK_ENTITY, pos, state);
    }
}
