package com.jlgm.zwa.renderer.entity;

import com.jlgm.zwa.client.model.ModelCommonChimpanzee;
import com.jlgm.zwa.client.model.ModelSumatranRhinoceros;
import com.jlgm.zwa.entity.EntityCommonChimpanzee;
import com.jlgm.zwa.entity.EntitySumatranRhinoceros;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ZWAEntityRenderer {
	public static void registerRenderer(){
		RenderingRegistry.registerEntityRenderingHandler(EntityCommonChimpanzee.class, new IRenderFactory<EntityCommonChimpanzee>(){
			@Override
			public Render<? super EntityCommonChimpanzee> createRenderFor(RenderManager manager) {
				return new RenderCommonChimpanzee(manager, new ModelCommonChimpanzee(), 1.5F);
			}
		});
		

		RenderingRegistry.registerEntityRenderingHandler(EntitySumatranRhinoceros.class, new IRenderFactory<EntitySumatranRhinoceros>(){
			@Override
			public Render<? super EntitySumatranRhinoceros> createRenderFor(RenderManager manager) {
				return new RenderSumatranRhinoceros(manager, new ModelSumatranRhinoceros(), 1.5F);
			}
		});
	}
}
