package com.PlayPrey.MoReeds.core.handler;

import com.PlayPrey.MoReeds.core.helper.LocalizationHelper;
import com.PlayPrey.MoReeds.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler 
{
	public static void loadLanguages()
	{
		for(String LocationFile: Localizations.localeFiles)
		{
			LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocaleFromFileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
		
		
		}
	
	
	}


}

