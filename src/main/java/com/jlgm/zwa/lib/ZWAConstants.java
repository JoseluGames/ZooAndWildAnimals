package com.jlgm.zwa.lib;

public class ZWAConstants{
	//The name "behind the scenes"
	public static final String MODID = "jlgm_zwa";
	//The public name
	public static final String NAME = "Zoo And Wild Animals";
	
	//Version parts ( https://mcforge.readthedocs.io/en/latest/conventions/versioning/ )
	public static final String MCVERSION = "1.10.2";
	public static final String MAJOR = "0";
	public static final String MINOR = "1";
	public static final String PATCH = "0";
	public static final String RELEASETYPE = "";
	
	//The version of the mod
	public static final String VERSION = MCVERSION + "-" + MAJOR + "." + MINOR + "." + PATCH + RELEASETYPE;
	//The Minecraft verstion this mod is focused to work with
	public static final String ACCEPTEDMINECRAFTVERSIONS = "[1.10.2]";
	
	//The package route of the proxys
	public static final String CLIENT_PROXY = "com.jlgm.zwa.main.ZWAClientProxy";
	public static final String SERVER_PROXY = "com.jlgm.zwa.main.ZWAServerProxy";
}
