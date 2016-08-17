package com.jlgm.zwa.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCommonChimpanzee extends ModelBase
{
	//fields
		ModelRenderer Head;
		ModelRenderer Ear1;
		ModelRenderer Ear2;
		ModelRenderer Snout;
		ModelRenderer Body;
		ModelRenderer Botty;
		ModelRenderer Arm1;
		ModelRenderer Forearm1;
		ModelRenderer Hand1;
		ModelRenderer Arm2;
		ModelRenderer Forearm2;
		ModelRenderer Hand2;
		ModelRenderer Leg1;
		ModelRenderer Leg2;
	
	public ModelCommonChimpanzee(){
		textureWidth = 64;
		textureHeight = 256;
			Head = new ModelRenderer(this, 0, 0);
			Head.addBox(-4F, -7F, -7F, 8, 7, 7);
			Head.setRotationPoint(0F, 8F, -1F);
			Head.setTextureSize(64, 256);
			Head.mirror = true;
			setRotation(Head, 0.1047198F, 0F, 0F);
			Ear1 = new ModelRenderer(this, 0, 64);
			Ear1.addBox(0F, -2F, -0.5F, 3, 4, 1);
			Ear1.setRotationPoint(3F, 5F, -5F);
			Ear1.setTextureSize(64, 256);
			Ear1.mirror = true;
			setRotation(Ear1, 0.1047198F, 0F, 0F);
			Ear2 = new ModelRenderer(this, 0, 56);
			Ear2.addBox(-3F, -2F, -0.5F, 3, 4, 1);
			Ear2.setRotationPoint(-3F, 5F, -5F);
			Ear2.setTextureSize(64, 256);
			Ear2.mirror = true;
			setRotation(Ear2, 0.1047198F, 0F, 0F);
			Snout = new ModelRenderer(this, 0, 110);
			Snout.addBox(-2F, -2F, -4F, 4, 4, 4);
			Snout.setRotationPoint(0F, 6F, -6F);
			Snout.setTextureSize(64, 256);
			Snout.mirror = true;
			setRotation(Snout, 0.2617994F, 0F, 0F);
			
			Head.addChild(Ear1);
			Head.addChild(Ear2);
			Head.addChild(Snout);
			
			Body = new ModelRenderer(this, 16, 90);
			Body.addBox(-4F, 0F, -4F, 8, 11, 8);
			Body.setRotationPoint(0F, 7F, -3F);
			Body.setTextureSize(64, 256);
			Body.mirror = true;
			setRotation(Body, 1.343904F, 0F, 0F);
			Botty = new ModelRenderer(this, 0, 40);
			Botty.addBox(-4F, -3.5F, 0F, 8, 7, 5);
			Botty.setRotationPoint(0F, 9.5F, 7F);
			Botty.setTextureSize(64, 256);
			Botty.mirror = true;
			setRotation(Botty, -0.2617994F, 0F, 0F);
			
			
			Arm1 = new ModelRenderer(this, 40, 16);
			Arm1.addBox(-1F, -2F, -2F, 5, 12, 4);
			Arm1.setRotationPoint(5F, 6F, 0F);
			Arm1.setTextureSize(64, 256);
			Arm1.mirror = true;
			setRotation(Arm1, -0.2059489F, 0F, 0F);
			Forearm1 = new ModelRenderer(this, 40, 33);
			Forearm1.addBox(-2.5F, 0F, -2F, 5, 7, 4);
			Forearm1.setRotationPoint(6.5F, 15F, -2F);
			Forearm1.setTextureSize(64, 256);
			Forearm1.mirror = true;
			setRotation(Forearm1, 0F, 0F, 0F);
			Hand1 = new ModelRenderer(this, 0, 71);
			Hand1.addBox(-2.5F, 0F, -2F, 5, 3, 4);
			Hand1.setRotationPoint(6.5F, 21F, -2F);
			Hand1.setTextureSize(64, 256);
			Hand1.mirror = true;
			setRotation(Hand1, 0.1745329F, 0F, 0F);
			
			
			Arm2 = new ModelRenderer(this, 40, 16);
			Arm2.addBox(-4F, -2F, -2F, 5, 12, 4);
			Arm2.setRotationPoint(-5F, 6F, 0F);
			Arm2.setTextureSize(64, 256);
			Arm2.mirror = true;
			setRotation(Arm2, -0.2059489F, 0F, 0F);
			Forearm2 = new ModelRenderer(this, 40, 33);
			Forearm2.addBox(-2.5F, 0F, -2F, 5, 7, 4);
			Forearm2.setRotationPoint(-6.5F, 15F, -2F);
			Forearm2.setTextureSize(64, 256);
			Forearm2.mirror = true;
			setRotation(Forearm2, 0F, 0F, 0F);
			Hand2 = new ModelRenderer(this, 0, 80);
			Hand2.addBox(-2.5F, 0F, -2F, 5, 3, 4);
			Hand2.setRotationPoint(-6.5F, 21F, -2F);
			Hand2.setTextureSize(64, 256);
			Hand2.mirror = true;
			setRotation(Hand2, 0.1745329F, 0F, 0F);
			
			
			Leg1 = new ModelRenderer(this, 0, 16);
			Leg1.addBox(-2F, 0F, -2F, 5, 12, 4);
			Leg1.setRotationPoint(4F, 12F, 9F);
			Leg1.setTextureSize(64, 256);
			Leg1.mirror = true;
			setRotation(Leg1, 0F, 0F, 0F);
			
			
			Leg2 = new ModelRenderer(this, 0, 16);
			Leg2.addBox(-3F, 0F, -2F, 5, 12, 4);
			Leg2.setRotationPoint(-4F, 12F, 9F);
			Leg2.setTextureSize(64, 256);
			Leg2.mirror = true;
			setRotation(Leg2, 0F, 0F, 0F);
	}
	
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale){
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		Head.render(scale);
		/*Ear1.render(scale);
		Ear2.render(scale);
		Snout.render(scale);*/
		Body.render(scale);
		Botty.render(scale);
		Arm1.render(scale);
		Forearm1.render(scale);
		Hand1.render(scale);
		Arm2.render(scale);
		Forearm2.render(scale);
		Hand2.render(scale);
		Leg1.render(scale);
		Leg2.render(scale);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn){
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
		this.Head.rotateAngleX = headPitch * 0.017453292F;
		this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.Ear1.rotateAngleX = headPitch * 0.017453292F;
		this.Ear1.rotateAngleY = netHeadYaw * 0.017453292F;
		this.Ear2.rotateAngleX = headPitch * 0.017453292F;
		this.Ear2.rotateAngleY = netHeadYaw * 0.017453292F;
		this.Snout.rotateAngleX = headPitch * 0.017453292F;
		this.Snout.rotateAngleY = netHeadYaw * 0.017453292F;

		this.Arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.Arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.Leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.Leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}
