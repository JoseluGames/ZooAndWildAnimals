package com.jlgm.zwa.renderer.entity;

import com.jlgm.zwa.entity.EntityCommonChimpanzee;
import com.jlgm.zwa.lib.ZWAConstants;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCommonChimpanzee extends RenderLiving<EntityCommonChimpanzee>{
	
    private static final ResourceLocation[] commonChimpanzeeTexture = new ResourceLocation[]{new ResourceLocation(ZWAConstants.MODID, "textures/entity/common_chimpanzee/Common_Chimpanzee1.png"),
    		new ResourceLocation(ZWAConstants.MODID, "textures/entity/common_chimpanzee/Common_Chimpanzee2.png"),
    		new ResourceLocation(ZWAConstants.MODID, "textures/entity/common_chimpanzee/Common_Chimpanzee3.png"),
    		new ResourceLocation(ZWAConstants.MODID, "textures/entity/common_chimpanzee/Common_Chimpanzee4.png")};
    
	public RenderCommonChimpanzee(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}
	
    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityCommonChimpanzee entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityCommonChimpanzee entitylivingbaseIn, float partialTickTime)
    {
        //GlStateManager.scale(1.2F, 1.2F, 1.2F);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityCommonChimpanzee entity) {
		return commonChimpanzeeTexture[entity.getVariant()];
	}

}
