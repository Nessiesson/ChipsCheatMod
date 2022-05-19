package net.dugged.chipscheatmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public class ChipsCheatMod implements ModInitializer {
	public static boolean hackerman = false;
	public static KeyBinding key = new KeyBinding("key.chipscheatmod.keyName", InputUtil.UNKNOWN_KEY.getCode(), "ChipsCheatMod");

	@Override
	public void onInitialize() {
		KeyBindingHelper.registerKeyBinding(key);
	}
}
