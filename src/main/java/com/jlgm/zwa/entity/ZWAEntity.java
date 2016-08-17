package com.jlgm.zwa.entity;

import com.jlgm.zwa.main.ZWAMain;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ZWAEntity {
	public static void registerEntity(){
		EntityRegistry.registerModEntity(EntityCommonChimpanzee.class, "CommonChimpanzee", 0, ZWAMain.instance, 80, 3, false, 0xFF0000, 0x00FF00);
		EntityRegistry.registerModEntity(EntitySumatranRhinoceros.class, "SumatranRhinoceros", 1, ZWAMain.instance, 80, 3, false, 0xFF00FF, 0x0000FF);
		addNaturalSpawns();
	}
	
	public static void addNaturalSpawns(){
		EntityRegistry.addSpawn(EntityCommonChimpanzee.class, 6, 2, 5, EnumCreatureType.AMBIENT, Biomes.JUNGLE, Biomes.JUNGLE_EDGE, Biomes.JUNGLE_HILLS, Biomes.MUTATED_JUNGLE, Biomes.MUTATED_JUNGLE_EDGE);
		EntityRegistry.addSpawn(EntitySumatranRhinoceros.class, 6, 1, 3, EnumCreatureType.AMBIENT, Biomes.JUNGLE, Biomes.JUNGLE_EDGE, Biomes.JUNGLE_HILLS, Biomes.MUTATED_JUNGLE, Biomes.MUTATED_JUNGLE_EDGE, Biomes.SWAMPLAND, Biomes.MUTATED_SWAMPLAND);
	}
}