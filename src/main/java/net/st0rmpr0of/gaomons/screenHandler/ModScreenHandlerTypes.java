package net.st0rmpr0of.gaomons.screenHandler;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.st0rmpr0of.gaomons.GaoMons;
import net.st0rmpr0of.gaomons.network.BlockPosPayload;

public class ModScreenHandlerTypes {
    public static final ScreenHandlerType<FuserBlockScreenHandler> FUSER_BLOCK =
            register("fuser_block", FuserBlockScreenHandler::new, BlockPosPayload.PACKET_CODEC);

    public static <T extends ScreenHandler, D extends CustomPayload>ExtendedScreenHandlerType<T, D>
            register(String name,
                 ExtendedScreenHandlerType.ExtendedFactory<T, D> factory,
                 PacketCodec<? super RegistryByteBuf, D> codec) {

        return Registry.register(Registries.SCREEN_HANDLER, GaoMons.id(name), new ExtendedScreenHandlerType<>(factory, codec));
    }

    public static void registerModScreenHandlerTypes() {}
}
