package com.jlgm.zwa.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIClimb extends EntityAIBase{
    private final EntityCreature entityClimber;
	
	public EntityAIClimb(EntityCreature entity){
	    this.entityClimber = entity;
	    this.setMutexBits(7);
	}
	
	@Override
    public boolean shouldExecute(){
        return this.entityClimber.getRNG().nextFloat() < 0.02F;
    }
	
	@Override
    public void startExecuting(){
		
	}
	
	@Override
	public boolean continueExecuting(){
		boolean continueEx = true;
		return continueEx;
	}
}