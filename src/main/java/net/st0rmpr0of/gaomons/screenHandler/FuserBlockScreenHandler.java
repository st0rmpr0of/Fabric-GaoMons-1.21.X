package net.st0rmpr0of.gaomons.screenHandler;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.st0rmpr0of.gaomons.block.ModBlocks;
import net.st0rmpr0of.gaomons.block.custom.FuserBlock;
import net.st0rmpr0of.gaomons.block.entity.FuserBlockEntity;
import net.st0rmpr0of.gaomons.network.BlockPosPayload;

public class FuserBlockScreenHandler extends ScreenHandler {
    private final FuserBlockEntity blockEntity;
    private final ScreenHandlerContext context;

    // Client Constructor
    public FuserBlockScreenHandler(int syncId, PlayerInventory playerInventory, BlockPosPayload payload) {
        this(syncId, playerInventory, (FuserBlockEntity) playerInventory.player.getWorld().getBlockEntity(payload.pos()));
    }

    // Main Constructor - (Directly called from server)
    public FuserBlockScreenHandler(int syncId, PlayerInventory playerInventory, FuserBlockEntity blockEntity) {
        super(ModScreenHandlerTypes.FUSER_BLOCK, syncId);

        this.blockEntity = blockEntity;
        this.context = ScreenHandlerContext.create(this.blockEntity.getWorld(), this.blockEntity.getPos());
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return canUse(this.context, player, ModBlocks.FUSER_BLOCK);
    }
}
