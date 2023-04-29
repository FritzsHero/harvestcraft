package com.pam.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockRegistry 
{
	public static Block AridGardenBlock;
	public static Block FrostGardenBlock;
	public static Block TropicalGardenBlock;
	public static Block WindyGardenBlock;
	public static Block ShadedGardenBlock;
	public static Block SoggyGardenBlock;
	
	public static Block[] PamTemperateSaplings;
	public static Block[] PamWarmSaplings;
	public static Block[] PamLogSaplings;
	
	public static Block AgaveCrop;
	public static Block AmaranthCrop;
	public static Block ArrowrootCrop;
	public static Block CassavaCrop;
	public static Block ChickpeaCrop;
	public static Block ElderberryCrop;
	public static Block FlaxCrop;
	public static Block GigaPickleCrop;
	public static Block GreenGrapeCrop;
	public static Block pamblackberryCrop;
	public static Block pamblueberryCrop;
	public static Block pamcandleberryCrop;
	public static Block pamraspberryCrop;
	public static Block pamstrawberryCrop;
	public static Block pamcactusfruitCrop;
	public static Block pamasparagusCrop;
	public static Block pambarleyCrop;
	public static Block pamoatsCrop;
	public static Block pamryeCrop;
	public static Block pamcornCrop;
	public static Block pambambooshootCrop;
	public static Block pamcantaloupeCrop;
	public static Block pamcucumberCrop;
	public static Block pamwintersquashCrop;
	public static Block pamzucchiniCrop;
	public static Block pambeetCrop;
	public static Block pamonionCrop;
	public static Block pamparsnipCrop;
	public static Block pampeanutCrop;
	public static Block pamradishCrop;
	public static Block pamrutabagaCrop;
	public static Block pamsweetpotatoCrop;
	public static Block pamturnipCrop;
	public static Block pamrhubarbCrop;
	public static Block pamceleryCrop;
	public static Block pamgarlicCrop;
	public static Block pamgingerCrop;
	public static Block pamspiceleafCrop;
	public static Block pamtealeafCrop;
	public static Block pamcoffeebeanCrop;
	public static Block pammustardseedsCrop;
	public static Block pambroccoliCrop;
	public static Block pamcauliflowerCrop;
	public static Block pamleekCrop;
	public static Block pamlettuceCrop;
	public static Block pamscallionCrop;
	public static Block pamartichokeCrop;
	public static Block pambrusselsproutCrop;
	public static Block pamcabbageCrop;
	public static Block pamspinachCrop;
	public static Block pamwhitemushroomCrop;
	public static Block pambeanCrop;
	public static Block pamsoybeanCrop;
	public static Block pambellpepperCrop;
	public static Block pamchilipepperCrop;
	public static Block pameggplantCrop;
	public static Block pamokraCrop;
	public static Block pampeasCrop;
	public static Block pamtomatoCrop;
	public static Block pamcottonCrop;
	public static Block pampineappleCrop;
	public static Block pamgrapeCrop;
	public static Block pamkiwiCrop;
	public static Block pamcranberryCrop;
	public static Block pamriceCrop;
	public static Block pamseaweedCrop;
	public static Block pamcurryleafCrop;
	public static Block pamsesameseedsCrop;
	public static Block pamwaterchestnutCrop;
	
	public static Block pamApple;
	public static Block pamappleSapling;
	public static Block pamAlmond;
	public static Block pamalmondSapling;
	public static Block pamApricot;
	public static Block pamapricotSapling;
	public static Block pamAvocado;
	public static Block pamavocadoSapling;
	public static Block pamBanana;
	public static Block pambananaSapling;
	public static Block pamCashew;
	public static Block pamcashewSapling;
	public static Block pamCherry;
	public static Block pamcherrySapling;
	public static Block pamChestnut;
	public static Block pamchestnutSapling;
	public static Block pamCinnamon;
	public static Block pamcinnamonSapling;
	public static Block pamCoconut;
	public static Block pamcoconutSapling;
	public static Block pamDate;
	public static Block pamdateSapling;
	public static Block pamDragonfruit;
	public static Block pamdragonfruitSapling;
	public static Block pamDurian;
	public static Block pamdurianSapling;
	public static Block pamFig;
	public static Block pamfigSapling;
	public static Block pamGooseberry;
	public static Block pamgooseberrySapling;
	public static Block pamGrapefruit;
	public static Block pamgrapefruitSapling;
	public static Block pamLemon;
	public static Block pamlemonSapling;
	public static Block pamLime;
	public static Block pamlimeSapling;
	public static Block pamMaple;
	public static Block pammapleSapling;
	public static Block pamMango;
	public static Block pammangoSapling;
	public static Block pamNutmeg;
	public static Block pamnutmegSapling;
	public static Block pamOlive;
	public static Block pamoliveSapling;
	public static Block pamOrange;
	public static Block pamorangeSapling;
	public static Block pamPapaya;
	public static Block pampapayaSapling;
	public static Block pamPaperbark;
	public static Block pampaperbarkSapling;
	public static Block pamPeach;
	public static Block pampeachSapling;
	public static Block pamPear;
	public static Block pampearSapling;
	public static Block pamPecan;
	public static Block pampecanSapling;
	public static Block pamPeppercorn;
	public static Block pampeppercornSapling;
	public static Block pamPersimmon;
	public static Block pampersimmonSapling;
	public static Block pamPistachio;
	public static Block pampistachioSapling;
	public static Block pamPlum;
	public static Block pamplumSapling;
	public static Block pamPomegranate;
	public static Block pampomegranateSapling;
	public static Block pamStarfruit;
	public static Block pamstarfruitSapling;
	public static Block pamVanillabean;
	public static Block pamvanillabeanSapling;
	public static Block pamWalnut;
	public static Block pamwalnutSapling;
	
	public static Block pamMarket;
	
	public static int gardenRarity;
	public static int gardendropAmount;
	public static boolean enablegardenSpread;
	public static int gardenspreadRate;
	public static boolean enablearidgardenGeneration;
	public static boolean enablefrostgardenGeneration;
	public static boolean enabletropicalgardenGeneration;
	public static boolean enablewindygardenGeneration;
	public static boolean enableshadedgardenGeneration;
	public static boolean enablesoggygardenGeneration;
	public static int temperatefruittreeRarity;
	public static int tropicalfruittreeRarity;
	public static int coniferousfruittreeRarity;
	public static boolean isFruitTreeGenerationEnabled;
	//public static boolean cropsdropSeeds;
	public static boolean rightclickharvestCrop;
	public static boolean rightclickharvestFruit;
	//public static boolean gardensdropSeeds;
	public static boolean enablecropspecialplanting;
	
	public static boolean marketsellSeeds;
	public static boolean marketselltemperateSaplings;
	public static boolean marketselltropicalSaplings;
	public static boolean marketsellconiferousSaplings;
	public static boolean marketsellPig;
	public static boolean marketsellSheep;
	public static boolean marketsellCow;
	public static boolean marketsellChicken;
	public static boolean marketsellHorse;
	public static boolean marketsellBonemeal;
	public static int marketblockrecipeItem;
	public static int marketseedPrice;
	public static int marketsaplingPrice;
	public static int marketpigPrice;
	public static int marketsheepPrice;
	public static int marketcowPrice;
	public static int marketchickenPrice;
	public static int markethorsePrice;
	public static int marketbonemealPrice;
	public static int marketcurrencySeeds;
	public static int marketcurrencytemperateSaplings;
	public static int marketcurrencytropicalSaplings;
	public static int marketcurrencyconiferousSaplings;
	public static int marketcurrencyPig;
	public static int marketcurrencySheep;
	public static int marketcurrencyCow;
	public static int marketcurrencyChicken;
	public static int marketcurrencyHorse;
	public static int marketcurrencyBonemeal;
	

	public static void initBlocks(FMLPreInitializationEvent event, Configuration config)
	{
		gardenRarity = config.get("gardens", "gardenRarity", 2).getInt();
		gardendropAmount = config.get("gardens", "gardendropAmount", 3).getInt();
		enablegardenSpread = config.get("gardens", "enablegardenSpread", true).getBoolean(true);
		gardenspreadRate = config.get("gardens", "gardenspreadRate", 100).getInt();
		enablearidgardenGeneration = config.get("gardens", "enablearidgardenGeneration", true).getBoolean(true);
		enablefrostgardenGeneration = config.get("gardens", "enablefrostgardenGeneration", true).getBoolean(true);
		enabletropicalgardenGeneration = config.get("gardens", "enabletropicalgardenGeneration", true).getBoolean(true);
		enablewindygardenGeneration = config.get("gardens", "enablewindygardenGeneration", true).getBoolean(true);
		enableshadedgardenGeneration = config.get("gardens", "enableshadedgardenGeneration", true).getBoolean(true);
		enablesoggygardenGeneration = config.get("gardens", "enablesoggygardenGeneration", true).getBoolean(true);
		temperatefruittreeRarity = config.get("fruit trees", "temperatefruittreeRarity", 24).getInt();
		tropicalfruittreeRarity = config.get("fruit trees", "tropicalfruittreeRarity", 32).getInt();
		coniferousfruittreeRarity = config.get("fruit trees", "coniferousfruittreeRarity", 24).getInt();
		isFruitTreeGenerationEnabled = config.get("fruit trees", "isFruitTreeGenerationEnabled", true).getBoolean(true);
	  
		//cropsdropSeeds = config.get("crops", "cropsdropSeeds", false).getBoolean(false);
		rightclickharvestCrop = config.get("crops", "rightclickharvestCrop", true).getBoolean(true);
		rightclickharvestFruit = config.get("fruit trees", "rightclickharvestFruit", true).getBoolean(true);
		//gardensdropSeeds = config.get("gardens", "gardensdropSeeds", false).getBoolean(false);
		enablecropspecialplanting = config.get("crops", "enablecropspecialplanting", true).getBoolean(true);
		marketsellSeeds = config.get("market sales", "marketsellSeeds", true).getBoolean(true);
		marketselltemperateSaplings = config.get("market sales", "marketselltemperateSaplings", true).getBoolean(true);
		marketselltropicalSaplings = config.get("market sales", "marketselltropicalSaplings", true).getBoolean(true);
		marketsellconiferousSaplings = config.get("market sales", "marketsellconiferousSaplings", true).getBoolean(true);
		marketsellPig = config.get("market sales", "marketsellPig", true).getBoolean(true);
		marketsellSheep = config.get("market sales", "marketsellSheep", true).getBoolean(true);
		marketsellCow = config.get("market sales", "marketsellCow", true).getBoolean(true);
		marketsellChicken = config.get("market sales", "marketsellChicken", true).getBoolean(true);
		marketsellHorse = config.get("market sales", "marketsellHorse", true).getBoolean(true);
		marketsellBonemeal = config.get("market sales", "marketsellBonemeal", true).getBoolean(true);
		marketblockrecipeItem = config.get("miscellaneous recipes", "marketblockrecipeItem", 0).getInt();
		marketseedPrice = config.get("market prices", "marketseedPrice", 1).getInt();
		marketsaplingPrice = config.get("market prices", "marketsaplingPrice", 3).getInt();
		marketpigPrice = config.get("market prices", "marketpigPrice", 6).getInt();
		marketsheepPrice = config.get("market prices", "marketsheepPrice", 6).getInt();
		marketcowPrice = config.get("market prices", "marketcowPrice", 9).getInt();
		marketchickenPrice = config.get("market prices", "marketchickenPrice", 3).getInt();
		markethorsePrice = config.get("market prices", "markethorsePrice", 12).getInt();
		marketbonemealPrice = config.get("market prices", "marketbonemealPrice", 3).getInt();
		marketcurrencySeeds = config.get("market currency", "marketcurrencySeeds", 0).getInt();
		marketcurrencytemperateSaplings = config.get("market currency", "marketcurrencytemperateSaplings", 0).getInt();
		marketcurrencytropicalSaplings = config.get("market currency", "marketcurrencytropicalSaplings", 0).getInt();
		marketcurrencyconiferousSaplings = config.get("market currency", "marketcurrencyconiferousSaplings", 0).getInt();
		marketcurrencyPig = config.get("market currency", "marketcurrencyPig", 0).getInt();
		marketcurrencySheep = config.get("market currency", "marketcurrencySheep", 0).getInt();
		marketcurrencyCow = config.get("market currency", "marketcurrencyCow", 0).getInt();
		marketcurrencyChicken = config.get("market currency", "marketcurrencyChicken", 0).getInt();
		marketcurrencyHorse = config.get("market currency", "marketcurrencyHorse", 0).getInt();
		marketcurrencyBonemeal = config.get("market currency", "marketcurrencyBonemeal", 0).getInt();
	}
	

	private static Block registerBlock(String name, Class<? extends ItemBlock> itemblock, Block block)
	{
		block.setUnlocalizedName(name);
		GameRegistry.registerBlock(block, itemblock, name);

		return block;
	}


	public static void loadBlockRegistry()
	{
		AridGardenBlock = new AridGardenBlock();
		FrostGardenBlock = new FrostGardenBlock();
		TropicalGardenBlock = new TropicalGardenBlock();
		WindyGardenBlock = new WindyGardenBlock();
		ShadedGardenBlock = new ShadedGardenBlock();
		SoggyGardenBlock = new SoggyGardenBlock();
		
		AgaveCrop = registerBlock("AgaveCrop", ItemBlockFruit.class, new BlockPamCrop());
		AmaranthCrop = registerBlock("AmaranthCrop", ItemBlockFruit.class, new BlockPamCrop());
		ArrowrootCrop = registerBlock("ArrowrootCrop", ItemBlockFruit.class, new BlockPamCrop());
		CassavaCrop = registerBlock("CassavaCrop", ItemBlockFruit.class, new BlockPamCrop());
		ChickpeaCrop = registerBlock("ChickpeaCrop", ItemBlockFruit.class, new BlockPamCrop());
		ElderberryCrop = registerBlock("ElderberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		FlaxCrop = registerBlock("FlaxCrop", ItemBlockFruit.class, new BlockPamCrop());
		GigaPickleCrop = registerBlock("GigaPickleCrop", ItemBlockFruit.class, new BlockPamCrop());
		GreenGrapeCrop = registerBlock("GreenGrapeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamblackberryCrop = registerBlock("pamblackberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamblueberryCrop = registerBlock("pamblueberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcandleberryCrop = registerBlock("pamcandleberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamraspberryCrop = registerBlock("pamraspberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamstrawberryCrop = registerBlock("pamstrawberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcactusfruitCrop = registerBlock("pamcactusfruitCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamasparagusCrop = registerBlock("pamasparagusCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambarleyCrop = registerBlock("pambarleyCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamoatsCrop = registerBlock("pamoatsCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamryeCrop = registerBlock("pamryeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcornCrop = registerBlock("pamcornCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambambooshootCrop = registerBlock("pambambooshootCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcantaloupeCrop = registerBlock("pamcantaloupeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcucumberCrop = registerBlock("pamcucumberCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamwintersquashCrop = registerBlock("pamwintersquashCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamzucchiniCrop = registerBlock("pamzucchiniCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambeetCrop = registerBlock("pambeetCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamonionCrop = registerBlock("pamonionCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamparsnipCrop = registerBlock("pamparsnipCrop", ItemBlockFruit.class, new BlockPamCrop());
		pampeanutCrop = registerBlock("pampeanutCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamradishCrop = registerBlock("pamradishCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamrutabagaCrop = registerBlock("pamrutabagaCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamsweetpotatoCrop = registerBlock("pamsweetpotatoCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamturnipCrop = registerBlock("pamturnipCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamrhubarbCrop = registerBlock("pamrhubarbCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamceleryCrop = registerBlock("pamceleryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamgarlicCrop = registerBlock("pamgarlicCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamgingerCrop = registerBlock("pamgingerCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamspiceleafCrop = registerBlock("pamspiceleafCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamtealeafCrop = registerBlock("pamtealeafCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcoffeebeanCrop = registerBlock("pamcoffeebeanCrop", ItemBlockFruit.class, new BlockPamCrop());
		pammustardseedsCrop = registerBlock("pammustardseedsCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambroccoliCrop = registerBlock("pambroccoliCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcauliflowerCrop = registerBlock("pamcauliflowerCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamleekCrop = registerBlock("pamleekCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamlettuceCrop = registerBlock("pamlettuceCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamscallionCrop = registerBlock("pamscallionCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamartichokeCrop = registerBlock("pamartichokeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambrusselsproutCrop = registerBlock("pambrusselsproutCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcabbageCrop = registerBlock("pamcabbageCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamspinachCrop = registerBlock("pamspinachCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamwhitemushroomCrop = registerBlock("pamwhitemushroomCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambeanCrop = registerBlock("pambeanCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamsoybeanCrop = registerBlock("pamsoybeanCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambellpepperCrop = registerBlock("pambellpepperCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamchilipepperCrop = registerBlock("pamchilipepperCrop", ItemBlockFruit.class, new BlockPamCrop());
		pameggplantCrop = registerBlock("pameggplantCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamokraCrop = registerBlock("pamokraCrop", ItemBlockFruit.class, new BlockPamCrop());
		pampeasCrop = registerBlock("pampeasCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamtomatoCrop = registerBlock("pamtomatoCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcottonCrop = registerBlock("pamcottonCrop", ItemBlockFruit.class, new BlockPamCrop());
		pampineappleCrop = registerBlock("pampineappleCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamgrapeCrop = registerBlock("pamgrapeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamkiwiCrop = registerBlock("pamkiwiCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcranberryCrop = registerBlock("pamcranberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamriceCrop = registerBlock("pamriceCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamseaweedCrop = registerBlock("pamseaweedCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcurryleafCrop = registerBlock("pamcurryleafCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamsesameseedsCrop = registerBlock("pamsesameseedsCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamwaterchestnutCrop = registerBlock("pamwaterchestnutCrop", ItemBlockFruit.class, new BlockPamCrop());
		
		pamApple = registerBlock("pamApple", ItemBlockFruit.class, new BlockPamFruit());
		pamappleSapling = new BlockPamSapling("apple_sapling");
		pamAlmond  = registerBlock("pamAlmond", ItemBlockFruit.class, new BlockPamFruit());
		pamalmondSapling = new BlockPamSapling("almond_sapling");
		pamApricot = registerBlock("pamApricot", ItemBlockFruit.class, new BlockPamFruit());
		pamapricotSapling = new BlockPamSapling("apricot_sapling");
		pamAvocado = registerBlock("pamAvocado", ItemBlockFruit.class, new BlockPamFruit());
		pamavocadoSapling = new BlockPamSapling("avocado_sapling");
		pamBanana = registerBlock("pamBanana", ItemBlockFruit.class, new BlockPamFruit());
		pambananaSapling = new BlockPamSapling("banana_sapling");
		pamCashew = registerBlock("pamCashew", ItemBlockFruit.class, new BlockPamFruit());
		pamcashewSapling = new BlockPamSapling("cashew_sapling");
		pamCherry = registerBlock("pamCherry", ItemBlockFruit.class, new BlockPamFruit());
		pamcherrySapling = new BlockPamSapling("cherry_sapling");
		pamChestnut = registerBlock("pamChestnut", ItemBlockFruit.class, new BlockPamFruit());
		pamchestnutSapling = new BlockPamSapling("chestnut_sapling");
		pamCinnamon = registerBlock("pamCinnamon", ItemBlockFruit.class, new BlockPamLogFruit());
		pamcinnamonSapling = new BlockPamSapling("cinnamon_sapling");
		pamCoconut = registerBlock("pamCoconut", ItemBlockFruit.class, new BlockPamFruit());
		pamcoconutSapling = new BlockPamSapling("coconut_sapling");
		pamDate = registerBlock("pamDate", ItemBlockFruit.class, new BlockPamFruit());
		pamdateSapling = new BlockPamSapling("date_sapling");
		pamDragonfruit = registerBlock("pamDragonfruit", ItemBlockFruit.class, new BlockPamFruit());
		pamdragonfruitSapling = new BlockPamSapling("dragonfruit_sapling");
		pamDurian = registerBlock("pamDurian", ItemBlockFruit.class, new BlockPamFruit());
		pamdurianSapling = new BlockPamSapling("durian_sapling");
		pamFig = registerBlock("pamFig", ItemBlockFruit.class, new BlockPamFruit());
		pamfigSapling = new BlockPamSapling("fig_sapling");
		pamGooseberry = registerBlock("pamGooseberry", ItemBlockFruit.class, new BlockPamFruit());
		pamgooseberrySapling = new BlockPamSapling("gooseberry_sapling");
		pamGrapefruit = registerBlock("pamGrapefruit", ItemBlockFruit.class, new BlockPamFruit());
		pamgrapefruitSapling = new BlockPamSapling("grapefruit_sapling");
		pamLemon = registerBlock("pamLemon", ItemBlockFruit.class, new BlockPamFruit());
		pamlemonSapling = new BlockPamSapling("lemon_sapling");
		pamLime = registerBlock("pamLime", ItemBlockFruit.class, new BlockPamFruit());
		pamlimeSapling = new BlockPamSapling("lime_sapling");
		pamMaple = registerBlock("pamMaple", ItemBlockFruit.class, new BlockPamLogFruit());
		pammapleSapling = new BlockPamSapling("maple_sapling");
		pamMango = registerBlock("pamMango", ItemBlockFruit.class, new BlockPamFruit());
		pammangoSapling = new BlockPamSapling("mango_sapling");
		pamNutmeg = registerBlock("pamNutmeg", ItemBlockFruit.class, new BlockPamFruit());
		pamnutmegSapling = new BlockPamSapling("nutmeg_sapling");
		pamOlive  = registerBlock("pamOlive", ItemBlockFruit.class, new BlockPamFruit());
		pamoliveSapling = new BlockPamSapling("olive_sapling");
		pamOrange = registerBlock("pamOrange", ItemBlockFruit.class, new BlockPamFruit());
		pamorangeSapling = new BlockPamSapling("orange_sapling");
		pamPapaya = registerBlock("pamPapaya", ItemBlockFruit.class, new BlockPamFruit());
		pampapayaSapling = new BlockPamSapling("papaya_sapling");
		pamPaperbark = registerBlock("pamPaperbark", ItemBlockFruit.class, new BlockPamLogFruit());
		pampaperbarkSapling = new BlockPamSapling("paperbark_sapling");
		pamPeach = registerBlock("pamPeach", ItemBlockFruit.class, new BlockPamFruit());
		pampeachSapling = new BlockPamSapling("peach_sapling");
		pamPear = registerBlock("pamPear", ItemBlockFruit.class, new BlockPamFruit());
		pampearSapling = new BlockPamSapling("pear_sapling");
		pamPecan = registerBlock("pamPecan", ItemBlockFruit.class, new BlockPamFruit());
		pampecanSapling = new BlockPamSapling("pecan_sapling");
		pamPeppercorn = registerBlock("pamPeppercorn", ItemBlockFruit.class, new BlockPamFruit());
		pampeppercornSapling = new BlockPamSapling("peppercorn_sapling");
		pamPersimmon = registerBlock("pamPersimmon", ItemBlockFruit.class, new BlockPamFruit());
		pampersimmonSapling = new BlockPamSapling("persimmon_sapling");
		pamPistachio = registerBlock("pamPistachio", ItemBlockFruit.class, new BlockPamFruit());
		pampistachioSapling = new BlockPamSapling("pistachio_sapling");
		pamPlum = registerBlock("pamPlum", ItemBlockFruit.class, new BlockPamFruit());
		pamplumSapling = new BlockPamSapling("plum_sapling");
		pamPomegranate = registerBlock("pamPomegranate", ItemBlockFruit.class, new BlockPamFruit());
		pampomegranateSapling = new BlockPamSapling("pomegranate_sapling");
		pamStarfruit = registerBlock("pamStarfruit", ItemBlockFruit.class, new BlockPamFruit());
		pamstarfruitSapling = new BlockPamSapling("starfruit_sapling");
		pamVanillabean = registerBlock("pamVanillabean", ItemBlockFruit.class, new BlockPamFruit());
		pamvanillabeanSapling = new BlockPamSapling("vanillabean_sapling");
		pamWalnut = registerBlock("pamWalnut", ItemBlockFruit.class, new BlockPamFruit());
		pamwalnutSapling = new BlockPamSapling("walnut_sapling");
		
		pamMarket = new BlockPamMarket(Material.wood).setHardness(1.0F).setResistance(1.0F);
		GameRegistry.registerBlock(pamMarket, "market");
		
		PamTemperateSaplings = new Block[] { pamappleSapling, pamavocadoSapling, pamcherrySapling, pamchestnutSapling, pamnutmegSapling, pampearSapling, pamplumSapling, pamwalnutSapling, pamgooseberrySapling };
		PamWarmSaplings = new Block[] { pamalmondSapling, pamapricotSapling, pambananaSapling, pamcashewSapling, pamcoconutSapling, pamdateSapling, pamdragonfruitSapling, pamdurianSapling, pamfigSapling, pamgrapefruitSapling, pamlemonSapling, pamlimeSapling, pammangoSapling, pamoliveSapling, pamorangeSapling, pampapayaSapling, pampeachSapling, pampecanSapling, pampeppercornSapling, pampersimmonSapling, pampistachioSapling, pampomegranateSapling, pamstarfruitSapling, pamvanillabeanSapling };
		PamLogSaplings = new Block[] { pamcinnamonSapling, pammapleSapling, pampaperbarkSapling };
	}
}
