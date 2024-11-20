package net.st0rmpr0of.gaomons.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.st0rmpr0of.gaomons.block.ModBlockEntityTypes;
import net.st0rmpr0of.gaomons.block.entity.FuserBlockEntity;
import org.jetbrains.annotations.Nullable;

public class FuserBlock extends Block implements BlockEntityProvider {
    public FuserBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient) {
            if(world.getBlockEntity(pos) instanceof FuserBlockEntity fuserBlockEntity) {
                player.openHandledScreen(fuserBlockEntity);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return ModBlockEntityTypes.FUSER_BLOCK_ENTITY.instantiate(pos, state);
    }
}
