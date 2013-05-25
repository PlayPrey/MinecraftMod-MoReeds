package com.PlayPrey.MoReeds.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks 
{
	public static Block DiamondCane;
	
	
	
	
	
	
	
	
	
	public static void BlocksInit()
	{
		
		DiamondCane = new DiamondCane(190);
		
		GameRegistry.registerBlock(DiamondCane);
		
		
		
		
		
	}
}
