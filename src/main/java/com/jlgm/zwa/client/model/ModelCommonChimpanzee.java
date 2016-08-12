package com.jlgm.zwa.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCommonChimpanzee extends ModelBase
{
  //fields
    ModelRenderer Snout;
    ModelRenderer Head;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
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
  
  public ModelCommonChimpanzee()
  {
    textureWidth = 64;
    textureHeight = 256;
    
      Snout = new ModelRenderer(this, 0, 110);
      Snout.addBox(-2F, -2F, -4F, 4, 4, 4);
      Snout.setRotationPoint(0F, 6F, -6F);
      Snout.setTextureSize(64, 256);
      Snout.mirror = true;
      setRotation(Snout, 0.2617994F, 0F, 0F);
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
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Snout.render(f5);
    Head.render(f5);
    Ear1.render(f5);
    Ear2.render(f5);
    Body.render(f5);
    Botty.render(f5);
    Arm1.render(f5);
    Forearm1.render(f5);
    Hand1.render(f5);
    Arm2.render(f5);
    Forearm2.render(f5);
    Hand2.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par6Entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, par6Entity);
  }

}
