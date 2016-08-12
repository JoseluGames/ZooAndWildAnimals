package com.jlgm.zwa.main;

import com.jlgm.zwa.block.ZWABlock;
import com.jlgm.zwa.item.ZWAItem;
import com.jlgm.zwa.tileentity.ZWATileEntity;
import com.jlgm.zwa.creativetab.ZWACreativeTab;
import com.jlgm.zwa.entity.ZWAEntity;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ZWACommonProxy{

	public void preInit(FMLPreInitializationEvent preInitEvent){
		Configuration config = new Configuration(preInitEvent.getSuggestedConfigurationFile());
		config.load();

		config.save();

		ZWABlock.initialiseBlock();
		ZWAItem.initialiseItem();
		ZWACreativeTab.initialiseCreativeTab();
		
		ZWATileEntity.registerTileEntity();
		ZWAEntity.registerEntity();
	}

	public void init(FMLInitializationEvent initEvent){
		ZWABlock.registerBlock();
		ZWAItem.registerItem();
	}

	public void postInit(FMLPostInitializationEvent postInitEvent){

	}
}
