package net.dugged.chipscheatmod.mixin;

import net.dugged.chipscheatmod.ChipsCheatMod;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.text.LiteralText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public abstract class MinecraftClientMixin {
	@Inject(at = @At("HEAD"), method = "handleInputEvents()V")
	private void onHandleInputEvents(final CallbackInfo ci) {
		while (ChipsCheatMod.key.wasPressed()) {
			ChipsCheatMod.hackerman = !ChipsCheatMod.hackerman;
			final InGameHud hud = MinecraftClient.getInstance().inGameHud;
			if (ChipsCheatMod.hackerman) {
				hud.setOverlayMessage(new LiteralText("prepare ship for ludicrous speed"), true);
			} else {
				hud.setOverlayMessage(new LiteralText("tfw no ludicrous speed"), false);
			}
		}
	}
}
