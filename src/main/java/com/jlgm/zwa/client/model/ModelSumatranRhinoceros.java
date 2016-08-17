package com.jlgm.zwa.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Sumatran Rhinoceros.tcn - TechneToTabulaImporter
 * Created using Tabula 5.1.0
 */
public class ModelSumatranRhinoceros extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Botty;
    public ModelRenderer Thight1;
    public ModelRenderer Hump2;
    public ModelRenderer Hump1;
    public ModelRenderer Thight2;
    public ModelRenderer Neck;
    public ModelRenderer Tail;
    public ModelRenderer Thight3;
    public ModelRenderer Thight4;
    public ModelRenderer Leg3;
    public ModelRenderer Foot3;
    public ModelRenderer Leg4;
    public ModelRenderer Foot4;
    public ModelRenderer Leg1;
    public ModelRenderer Foot1;
    public ModelRenderer Leg2;
    public ModelRenderer Foot2;
    public ModelRenderer Head;
    public ModelRenderer Ear1;
    public ModelRenderer Ear2;
    public ModelRenderer Horn2;
    public ModelRenderer Snout;
    public ModelRenderer Horn1Base;
    public ModelRenderer Mouth;
    public ModelRenderer Horn1;

    public ModelSumatranRhinoceros() {
        this.textureWidth = 100;
        this.textureHeight = 256;
        this.Mouth = new ModelRenderer(this, 32, 93);
        this.Mouth.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.Mouth.addBox(-3.0F, -1.5F, -4.0F, 6, 3, 4, 0.0F);
        this.setRotateAngle(Mouth, 0.4363323129985824F, -0.0F, 0.0F);
        this.Foot3 = new ModelRenderer(this, 64, 114);
        this.Foot3.setRotationPoint(0.0F, 6.5F, -0.1F);
        this.Foot3.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
        this.setRotateAngle(Foot3, 0.03490658503988659F, -0.0F, 0.0F);
        this.Horn1 = new ModelRenderer(this, 71, 13);
        this.Horn1.setRotationPoint(0.0F, -2.0F, -0.5F);
        this.Horn1.addBox(-2.0F, -5.0F, -1.5F, 4, 5, 3, 0.0F);
        this.setRotateAngle(Horn1, -0.5235987755982988F, -0.0F, 0.0F);
        this.Thight4 = new ModelRenderer(this, 0, 59);
        this.Thight4.setRotationPoint(-3.0F, 5.0F, 2.0F);
        this.Thight4.addBox(-7.0F, -6.0F, -4.0F, 7, 12, 8, 0.0F);
        this.setRotateAngle(Thight4, 0.17453292519943295F, -0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 0, 18);
        this.Tail.setRotationPoint(0.0F, -3.0F, 4.5F);
        this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        this.setRotateAngle(Tail, 0.2617993877991494F, -0.0F, 0.0F);
        this.Foot2 = new ModelRenderer(this, 64, 114);
        this.Foot2.setRotationPoint(0.0F, 7.5F, -0.1F);
        this.Foot2.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
        this.setRotateAngle(Foot2, 0.08726646259971647F, -0.0F, 0.0F);
        this.Foot1 = new ModelRenderer(this, 64, 114);
        this.Foot1.setRotationPoint(0.0F, 7.5F, -0.1F);
        this.Foot1.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
        this.setRotateAngle(Foot1, 0.08726646259971647F, -0.0F, 0.0F);
        this.Thight2 = new ModelRenderer(this, 63, 93);
        this.Thight2.setRotationPoint(-2.5F, 4.0F, -6.5F);
        this.Thight2.addBox(-7.0F, -5.5F, -4.5F, 7, 11, 9, 0.0F);
        this.Neck = new ModelRenderer(this, 29, 40);
        this.Neck.setRotationPoint(0.0F, -2.5F, -8.5F);
        this.Neck.addBox(-5.0F, -4.5F, -8.0F, 10, 9, 8, 0.0F);
        this.setRotateAngle(Neck, 0.2617993877991494F, 0.0F, 0.0F);
        this.Leg2 = new ModelRenderer(this, 0, 94);
        this.Leg2.setRotationPoint(-3.5F, 3.4F, -0.7F);
        this.Leg2.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
        this.setRotateAngle(Leg2, -0.08726646259971647F, -0.0F, 0.0F);
        this.Hump1 = new ModelRenderer(this, 29, 58);
        this.Hump1.setRotationPoint(0.0F, -2.7F, -1.5F);
        this.Hump1.addBox(-6.5F, -7.0F, -4.5F, 13, 7, 9, 0.0F);
        this.setRotateAngle(Hump1, 0.4363323129985824F, -0.0F, 0.0F);
        this.Thight1 = new ModelRenderer(this, 63, 93);
        this.Thight1.setRotationPoint(2.5F, 4.0F, -6.5F);
        this.Thight1.addBox(0.0F, -5.5F, -4.5F, 7, 11, 9, 0.0F);
        this.Leg1 = new ModelRenderer(this, 0, 94);
        this.Leg1.setRotationPoint(3.5F, 3.4F, -0.7F);
        this.Leg1.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
        this.setRotateAngle(Leg1, -0.08726646259971647F, -0.0F, 0.0F);
        this.Thight3 = new ModelRenderer(this, 0, 59);
        this.Thight3.setRotationPoint(3.0F, 5.0F, 2.0F);
        this.Thight3.addBox(0.0F, -6.0F, -4.0F, 7, 12, 8, 0.0F);
        this.setRotateAngle(Thight3, 0.17453292519943295F, -0.0F, 0.0F);
        this.Horn2 = new ModelRenderer(this, 72, 3);
        this.Horn2.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Horn2.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Horn2, -0.17453292519943295F, -0.0F, 0.0F);
        this.Hump2 = new ModelRenderer(this, 0, 114);
        this.Hump2.setRotationPoint(0.0F, -3.5F, 5.5F);
        this.Hump2.addBox(-6.0F, -5.0F, -8.0F, 12, 5, 16, 0.0F);
        this.setRotateAngle(Hump2, -0.3490658503988659F, -0.0F, 0.0F);
        this.Botty = new ModelRenderer(this, 0, 138);
        this.Botty.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Botty.addBox(-6.5F, -5.5F, -5.5F, 13, 11, 11, 0.0F);
        this.Head = new ModelRenderer(this, 48, 145);
        this.Head.setRotationPoint(0.0F, 0.2F, -7.0F);
        this.Head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(Head, -0.22689280275926282F, -0.0F, 0.0F);
        this.Ear2 = new ModelRenderer(this, 22, 89);
        this.Ear2.mirror = true;
        this.Ear2.setRotationPoint(-4.0F, -4.0F, 2.5F);
        this.Ear2.addBox(-0.5F, -4.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(Ear2, -0.5235987755982988F, -0.5235987755982988F, 0.0F);
        this.Snout = new ModelRenderer(this, 33, 76);
        this.Snout.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Snout.addBox(-3.5F, -3.0F, -6.0F, 7, 6, 6, 0.0F);
        this.setRotateAngle(Snout, 0.08726646259971647F, -0.0F, 0.0F);
        this.Horn1Base = new ModelRenderer(this, 64, 81);
        this.Horn1Base.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.Horn1Base.addBox(-3.0F, -3.0F, -2.5F, 6, 3, 5, 0.0F);
        this.setRotateAngle(Horn1Base, 0.2617993877991494F, -0.0F, 0.0F);
        this.Leg3 = new ModelRenderer(this, 0, 94);
        this.Leg3.setRotationPoint(3.5F, 3.5F, 0.0F);
        this.Leg3.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.setRotateAngle(Leg3, -0.20943951023931953F, 0.0F, 0.0F);
        this.Ear1 = new ModelRenderer(this, 22, 89);
        this.Ear1.setRotationPoint(4.0F, -4.0F, 2.5F);
        this.Ear1.addBox(-0.5F, -4.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(Ear1, -0.5235987755982988F, 0.5235987755982988F, 0.0F);
        this.Leg4 = new ModelRenderer(this, 0, 94);
        this.Leg4.setRotationPoint(-3.5F, 3.5F, 0.0F);
        this.Leg4.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.setRotateAngle(Leg4, -0.20943951023931953F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 4);
        this.Body.setRotationPoint(0.0F, 5.0F, 3.7F);
        this.Body.addBox(-8.0F, -7.0F, -10.0F, 16, 14, 20, 0.0F);
        this.Foot4 = new ModelRenderer(this, 64, 114);
        this.Foot4.setRotationPoint(0.0F, 6.5F, -0.1F);
        this.Foot4.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
        this.setRotateAngle(Foot4, 0.03490658503988659F, -0.0F, 0.0F);
        this.Snout.addChild(this.Mouth);
        this.Leg3.addChild(this.Foot3);
        this.Horn1Base.addChild(this.Horn1);
        this.Botty.addChild(this.Thight4);
        this.Botty.addChild(this.Tail);
        this.Leg2.addChild(this.Foot2);
        this.Leg1.addChild(this.Foot1);
        this.Body.addChild(this.Thight2);
        this.Body.addChild(this.Neck);
        this.Thight2.addChild(this.Leg2);
        this.Body.addChild(this.Hump1);
        this.Body.addChild(this.Thight1);
        this.Thight1.addChild(this.Leg1);
        this.Botty.addChild(this.Thight3);
        this.Head.addChild(this.Horn2);
        this.Body.addChild(this.Hump2);
        this.Body.addChild(this.Botty);
        this.Neck.addChild(this.Head);
        this.Head.addChild(this.Ear2);
        this.Head.addChild(this.Snout);
        this.Snout.addChild(this.Horn1Base);
        this.Thight3.addChild(this.Leg3);
        this.Head.addChild(this.Ear1);
        this.Thight4.addChild(this.Leg4);
        this.Leg4.addChild(this.Foot4);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale){
    	setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.Body.render(scale);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn){
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
		this.Head.rotateAngleX = headPitch * 0.017453292F;
		this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
        
		this.Leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.Leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.Leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.Leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}
