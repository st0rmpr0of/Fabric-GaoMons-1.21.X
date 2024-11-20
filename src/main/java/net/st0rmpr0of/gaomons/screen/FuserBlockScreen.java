package net.st0rmpr0of.gaomons.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.st0rmpr0of.gaomons.GaoMons;
import net.st0rmpr0of.gaomons.screenHandler.FuserBlockScreenHandler;

import java.security.cert.CertPathBuilder;

public class FuserBlockScreen extends HandledScreen<FuserBlockScreenHandler> {
    private static final Identifier TEXTURE = GaoMons.id("textures/gui/fuser_block.png");

    public FuserBlockScreen(FuserBlockScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();

        // Add widgets here

    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        context.drawTexture(TEXTURE, this.x, this.y, 0, 0, this.backgroundWidth, this.backgroundHeight, 256, 256);

    }
}
