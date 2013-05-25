package com.PlayPrey.MoReeds;

import com.PlayPrey.MoReeds.blocks.ModBlocks;
import com.PlayPrey.MoReeds.core.handler.LocalizationHandler;
import com.PlayPrey.MoReeds.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(
		modid = Reference.MOD_ID,
		name = Reference.MOD_NAME,
		version = Reference.MOD_VERSION)

@NetworkMod
(
		serverSideRequired = false,
		clientSideRequired = true)

public class MoReeds 
{

	@PreInit
	public void preInit (FMLPreInitializationEvent Event)
	{
		ModBlocks.BlocksInit();
		
		LocalizationHandler.loadLanguages();
	}
	@Init
	public void init(FMLInitializationEvent event)
	{
		
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
}
