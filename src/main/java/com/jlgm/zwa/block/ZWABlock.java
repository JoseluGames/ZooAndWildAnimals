package com.jlgm.zwa.block;

import com.jlgm.zwa.lib.ZWAConstants;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZWABlock {
	
	public static Block trap_Block;
	public static ItemBlock trap_ItemBlock;
	
	public static void initialiseBlock(){
		trap_Block = new BlockTrap(Material.ROCK).setUnlocalizedName("trap").setHardness(2.0F).setResistance(10.0F).setCreativeTab(CreativeTabs.REDSTONE);
		trap_ItemBlock = new ItemBlock(trap_Block);
	}
	
	public static void registerBlock(){
		GameRegistry.register(trap_Block.setRegistryName("trap"));
		GameRegistry.register(trap_ItemBlock.setRegistryName(trap_Block.getRegistryName()));
	}
	
	public static void renderBlock(){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(trap_ItemBlock, 0,
				new ModelResourceLocation(ZWAConstants.MODID + ":" + "trap", "inventory"));
		
	}
}
