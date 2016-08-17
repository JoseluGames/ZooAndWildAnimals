package com.jlgm.zwa.renderer.entity;

import com.jlgm.zwa.entity.EntitySumatranRhinoceros;
import com.jlgm.zwa.lib.ZWAConstants;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSumatranRhinoceros extends RenderLiving<EntitySumatranRhinoceros>{
	
    private static final ResourceLocation[] SumatranRhinocerosTexture = new ResourceLocation[]{new ResourceLocation(ZWAConstants.MODID, "textures/entity/sumatran_rhinoceros/Sumatran_Rhinoceros1.png"),
    		new ResourceLocation(ZWAConstants.MODID, "textures/entity/sumatran_rhinoceros/Sumatran_Rhinoceros2.png"),
    		new ResourceLocation(ZWAConstants.MODID, "textures/entity/sumatran_rhinoceros/Sumatran_Rhinoceros3.png"),
    		new ResourceLocation(ZWAConstants.MODID, "textures/entity/sumatran_rhinoceros/Sumatran_Rhinoceros4.png")};
    
	public RenderSumatranRhinoceros(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}
	
    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntitySumatranRhinoceros entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntitySumatranRhinoceros entitylivingbaseIn, float partialTickTime)
    {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntitySumatranRhinoceros entity) {
		return SumatranRhinocerosTexture[entity.getVariant()];
	}
}