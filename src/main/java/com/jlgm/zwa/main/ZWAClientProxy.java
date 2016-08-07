package com.jlgm.zwa.main;

import com.jlgm.zwa.block.ZWABlock;
import com.jlgm.zwa.lib.ZWAVersionChecker;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ZWAClientProxy extends ZWACommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent preInitEvent){
		super.preInit(preInitEvent);
	}

	@Override
	public void init(FMLInitializationEvent initEvent){
		super.init(initEvent);
		ZWABlock.renderBlock();
	}

	@Override
	public void postInit(FMLPostInitializationEvent postInitEvent){
		super.postInit(postInitEvent);
		ZWAMain.versionChecker = new ZWAVersionChecker();
		Thread versionCheckThread = new Thread(ZWAMain.versionChecker, "VersionCheck");
		versionCheckThread.start();
	}
}
