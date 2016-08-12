package com.jlgm.zwa.entity;

import com.jlgm.zwa.main.ZWAMain;

import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ZWAEntity {
	public static void registerEntity(){
		EntityRegistry.registerModEntity(EntityCommonChimpanzee.class, "CommonChimpanzee", 0, ZWAMain.instance, 80, 3, false, 0xFF0000, 0x00FF00);
	}
}
