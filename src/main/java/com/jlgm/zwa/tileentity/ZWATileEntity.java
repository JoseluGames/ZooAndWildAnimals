package com.jlgm.zwa.tileentity;

import com.jlgm.zwa.renderer.TESRTrap;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZWATileEntity {
	public static void registerTileEntity(){
		GameRegistry.registerTileEntity(TileEntityTrap.class, "trap");
	}
	
	public static void registerTESR(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrap.class, new TESRTrap());
	}
}
