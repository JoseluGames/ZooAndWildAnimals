package com.jlgm.zwa.main;

import com.jlgm.zwa.lib.ZWAConfigStorage;
import com.jlgm.zwa.lib.ZWAConstants;
import com.jlgm.zwa.lib.ZWAVersionChecker;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ZWAConstants.MODID,
	name = ZWAConstants.NAME,
	version = ZWAConstants.VERSION,
	acceptedMinecraftVersions = ZWAConstants.ACCEPTEDMINECRAFTVERSIONS)

public class ZWAMain{

	public static ZWAConfigStorage configStorage;
	public static ZWAVersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate = false;

	@SidedProxy(clientSide = ZWAConstants.CLIENT_PROXY, serverSide = ZWAConstants.SERVER_PROXY)
	public static ZWACommonProxy proxy;
	@Instance(ZWAConstants.MODID)
	public static ZWAMain instance;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent preInitEvent){
		configStorage = new ZWAConfigStorage();
		proxy.preInit(preInitEvent);
	}

	@EventHandler
	public static void Init(FMLInitializationEvent initEvent){
		proxy.init(initEvent);
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent postInitEvent){
		proxy.postInit(postInitEvent);
	}
}
