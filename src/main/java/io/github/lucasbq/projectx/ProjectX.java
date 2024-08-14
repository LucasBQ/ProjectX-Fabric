package io.github.lucasbq.projectx;

import io.github.lucasbq.projectx.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectX implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ProjectX");
	public static final String MOD_ID = "projectx";

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ItemInit.load();

	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}