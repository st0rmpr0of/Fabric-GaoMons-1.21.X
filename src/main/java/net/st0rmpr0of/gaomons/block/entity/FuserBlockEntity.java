package net.st0rmpr0of.gaomons.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.st0rmpr0of.gaomons.GaoMons;
import net.st0rmpr0of.gaomons.block.ModBlockEntityTypes;
import net.st0rmpr0of.gaomons.network.BlockPosPayload;
import net.st0rmpr0of.gaomons.screenHandler.FuserBlockScreenHandler;
import org.jetbrains.annotations.Nullable;

public class FuserBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPosPayload> {
    public static final Text TITLE = Text.translatable("container." + GaoMons.MOD_ID + ".fuser_block");

    public FuserBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.FUSER_BLOCK_ENTITY, pos, state);
    }


    @Override
    public BlockPosPayload getScreenOpeningData(ServerPlayerEntity serverPlayerEntity) {
        return new BlockPosPayload(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return TITLE;
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new FuserBlockScreenHandler(syncId, playerInventory, this);
    }
}
