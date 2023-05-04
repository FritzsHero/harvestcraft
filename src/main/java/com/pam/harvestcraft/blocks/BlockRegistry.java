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
	public static Block HuckleberryCrop;
	public static Block JicamaCrop;
	public static Block JuniperberryCrop;
	public static Block JuteCrop;
	public static Block KaleCrop;
	public static Block KenafCrop;
	public static Block KohlrabiCrop;
	public static Block LentilCrop;
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
	

	private static Block registerBlock(Block block, Class<? extends ItemBlock> itemblock, String name)
	{
		block.setUnlocalizedName(name);
		GameRegistry.registerBlock(block, itemblock, name);

		return block;
	}


	private static Block RegisterPamCrop(String _name)
	{
		return registerBlock(new BlockPamCrop(), ItemBlockFruit.class, _name);
	}


	private static Block RegisterPamFruit(String _name)
	{
		return registerBlock(new BlockPamFruit(), ItemBlockFruit.class, _name);
	}


	private static Block RegisterPamLog(String _name)
	{
		return registerBlock(new BlockPamLogFruit(), ItemBlockFruit.class, _name);
	}


	public static void loadBlockRegistry()
	{
		AridGardenBlock = new AridGardenBlock();
		FrostGardenBlock = new FrostGardenBlock();
		TropicalGardenBlock = new TropicalGardenBlock();
		WindyGardenBlock = new WindyGardenBlock();
		ShadedGardenBlock = new ShadedGardenBlock();
		SoggyGardenBlock = new SoggyGardenBlock();
		
		RegisterCrops();
		RegisterTrees();
		RegisterLogTrees();

		pamMarket = new BlockPamMarket(Material.wood).setHardness(1.0F).setResistance(1.0F);
		GameRegistry.registerBlock(pamMarket, "market");
		
		PamTemperateSaplings = new Block[] { pamappleSapling, pamavocadoSapling, pamcherrySapling, pamchestnutSapling, pamnutmegSapling, pampearSapling, pamplumSapling, pamwalnutSapling, pamgooseberrySapling };
		PamWarmSaplings = new Block[] { pamalmondSapling, pamapricotSapling, pambananaSapling, pamcashewSapling, pamcoconutSapling, pamdateSapling, pamdragonfruitSapling, pamdurianSapling, pamfigSapling, pamgrapefruitSapling, pamlemonSapling, pamlimeSapling, pammangoSapling, pamoliveSapling, pamorangeSapling, pampapayaSapling, pampeachSapling, pampecanSapling, pampeppercornSapling, pampersimmonSapling, pampistachioSapling, pampomegranateSapling, pamstarfruitSapling, pamvanillabeanSapling };
		PamLogSaplings = new Block[] { pamcinnamonSapling, pammapleSapling, pampaperbarkSapling };
	}


	private static void RegisterCrops()
	{
		AgaveCrop = RegisterPamCrop("AgaveCrop");
		AmaranthCrop = RegisterPamCrop("AmaranthCrop");
		ArrowrootCrop = RegisterPamCrop("ArrowrootCrop");
		CassavaCrop = RegisterPamCrop("CassavaCrop");
		ChickpeaCrop = RegisterPamCrop("ChickpeaCrop");
		ElderberryCrop = RegisterPamCrop("ElderberryCrop");
		FlaxCrop = RegisterPamCrop("FlaxCrop");
		GigaPickleCrop = RegisterPamCrop("GigaPickleCrop");
		GreenGrapeCrop = RegisterPamCrop("GreenGrapeCrop");
		HuckleberryCrop = RegisterPamCrop("HuckleberryCrop");
		JicamaCrop = RegisterPamCrop("JicamaCrop");
		JuniperberryCrop = RegisterPamCrop("JuniperberryCrop");
		JuteCrop = RegisterPamCrop("JuteCrop");
		KaleCrop = RegisterPamCrop("KaleCrop");
		KenafCrop = RegisterPamCrop("KenafCrop");
		KohlrabiCrop = RegisterPamCrop("KohlrabiCrop");
		LentilCrop = RegisterPamCrop("LentilCrop");
		pamblackberryCrop = RegisterPamCrop("pamblackberryCrop");
		pamblueberryCrop = RegisterPamCrop("pamblueberryCrop");
		pamcandleberryCrop = RegisterPamCrop("pamcandleberryCrop");
		pamraspberryCrop = RegisterPamCrop("pamraspberryCrop");
		pamstrawberryCrop = RegisterPamCrop("pamstrawberryCrop");
		pamcactusfruitCrop = RegisterPamCrop("pamcactusfruitCrop");
		pamasparagusCrop = RegisterPamCrop("pamasparagusCrop");
		pambarleyCrop = RegisterPamCrop("pambarleyCrop");
		pamoatsCrop = RegisterPamCrop("pamoatsCrop");
		pamryeCrop = RegisterPamCrop("pamryeCrop");
		pamcornCrop = RegisterPamCrop("pamcornCrop");
		pambambooshootCrop = RegisterPamCrop("pambambooshootCrop");
		pamcantaloupeCrop = RegisterPamCrop("pamcantaloupeCrop");
		pamcucumberCrop = RegisterPamCrop("pamcucumberCrop");
		pamwintersquashCrop = RegisterPamCrop("pamwintersquashCrop");
		pamzucchiniCrop = RegisterPamCrop("pamzucchiniCrop");
		pambeetCrop = RegisterPamCrop("pambeetCrop");
		pamonionCrop = RegisterPamCrop("pamonionCrop");
		pamparsnipCrop = RegisterPamCrop("pamparsnipCrop");
		pampeanutCrop = RegisterPamCrop("pampeanutCrop");
		pamradishCrop = RegisterPamCrop("pamradishCrop");
		pamrutabagaCrop = RegisterPamCrop("pamrutabagaCrop");
		pamsweetpotatoCrop = RegisterPamCrop("pamsweetpotatoCrop");
		pamturnipCrop = RegisterPamCrop("pamturnipCrop");
		pamrhubarbCrop = RegisterPamCrop("pamrhubarbCrop");
		pamceleryCrop = RegisterPamCrop("pamceleryCrop");
		pamgarlicCrop = RegisterPamCrop("pamgarlicCrop");
		pamgingerCrop = RegisterPamCrop("pamgingerCrop");
		pamspiceleafCrop = RegisterPamCrop("pamspiceleafCrop");
		pamtealeafCrop = RegisterPamCrop("pamtealeafCrop");
		pamcoffeebeanCrop = RegisterPamCrop("pamcoffeebeanCrop");
		pammustardseedsCrop = RegisterPamCrop("pammustardseedsCrop");
		pambroccoliCrop = RegisterPamCrop("pambroccoliCrop");
		pamcauliflowerCrop = RegisterPamCrop("pamcauliflowerCrop");
		pamleekCrop = RegisterPamCrop("pamleekCrop");
		pamlettuceCrop = RegisterPamCrop("pamlettuceCrop");
		pamscallionCrop = RegisterPamCrop("pamscallionCrop");
		pamartichokeCrop = RegisterPamCrop("pamartichokeCrop");
		pambrusselsproutCrop = RegisterPamCrop("pambrusselsproutCrop");
		pamcabbageCrop = RegisterPamCrop("pamcabbageCrop");
		pamspinachCrop = RegisterPamCrop("pamspinachCrop");
		pamwhitemushroomCrop = RegisterPamCrop("pamwhitemushroomCrop");
		pambeanCrop = RegisterPamCrop("pambeanCrop");
		pamsoybeanCrop = RegisterPamCrop("pamsoybeanCrop");
		pambellpepperCrop = RegisterPamCrop("pambellpepperCrop");
		pamchilipepperCrop = RegisterPamCrop("pamchilipepperCrop");
		pameggplantCrop = RegisterPamCrop("pameggplantCrop");
		pamokraCrop = RegisterPamCrop("pamokraCrop");
		pampeasCrop = RegisterPamCrop("pampeasCrop");
		pamtomatoCrop = RegisterPamCrop("pamtomatoCrop");
		pamcottonCrop = RegisterPamCrop("pamcottonCrop");
		pampineappleCrop = RegisterPamCrop("pampineappleCrop");
		pamgrapeCrop = RegisterPamCrop("pamgrapeCrop");
		pamkiwiCrop = RegisterPamCrop("pamkiwiCrop");
		pamcranberryCrop = RegisterPamCrop("pamcranberryCrop");
		pamriceCrop = RegisterPamCrop("pamriceCrop");
		pamseaweedCrop = RegisterPamCrop("pamseaweedCrop");
		pamcurryleafCrop = RegisterPamCrop("pamcurryleafCrop");
		pamsesameseedsCrop = RegisterPamCrop("pamsesameseedsCrop");
		pamwaterchestnutCrop = RegisterPamCrop("pamwaterchestnutCrop");
	}


	private static void RegisterTrees()
	{
		pamApple = RegisterPamFruit("pamApple");
		pamappleSapling = new BlockPamSapling("apple_sapling");
		pamAlmond  = RegisterPamFruit("pamAlmond");
		pamalmondSapling = new BlockPamSapling("almond_sapling");
		pamApricot = RegisterPamFruit("pamApricot");
		pamapricotSapling = new BlockPamSapling("apricot_sapling");
		pamAvocado = RegisterPamFruit("pamAvocado");
		pamavocadoSapling = new BlockPamSapling("avocado_sapling");
		pamBanana = RegisterPamFruit("pamBanana");
		pambananaSapling = new BlockPamSapling("banana_sapling");
		pamCashew = RegisterPamFruit("pamCashew");
		pamcashewSapling = new BlockPamSapling("cashew_sapling");
		pamCherry = RegisterPamFruit("pamCherry");
		pamcherrySapling = new BlockPamSapling("cherry_sapling");
		pamChestnut = RegisterPamFruit("pamChestnut");
		pamchestnutSapling = new BlockPamSapling("chestnut_sapling");
		pamCoconut = RegisterPamFruit("pamCoconut");
		pamcoconutSapling = new BlockPamSapling("coconut_sapling");
		pamDate = RegisterPamFruit("pamDate");
		pamdateSapling = new BlockPamSapling("date_sapling");
		pamDragonfruit = RegisterPamFruit("pamDragonfruit");
		pamdragonfruitSapling = new BlockPamSapling("dragonfruit_sapling");
		pamDurian = RegisterPamFruit("pamDurian");
		pamdurianSapling = new BlockPamSapling("durian_sapling");
		pamFig = RegisterPamFruit("pamFig");
		pamfigSapling = new BlockPamSapling("fig_sapling");
		pamGooseberry = RegisterPamFruit("pamGooseberry");
		pamgooseberrySapling = new BlockPamSapling("gooseberry_sapling");
		pamGrapefruit = RegisterPamFruit("pamGrapefruit");
		pamgrapefruitSapling = new BlockPamSapling("grapefruit_sapling");
		pamLemon = RegisterPamFruit("pamLemon");
		pamlemonSapling = new BlockPamSapling("lemon_sapling");
		pamLime = RegisterPamFruit("pamLime");
		pamlimeSapling = new BlockPamSapling("lime_sapling");
		pamMango = RegisterPamFruit("pamMango");
		pammangoSapling = new BlockPamSapling("mango_sapling");
		pamNutmeg = RegisterPamFruit("pamNutmeg");
		pamnutmegSapling = new BlockPamSapling("nutmeg_sapling");
		pamOlive  = RegisterPamFruit("pamOlive");
		pamoliveSapling = new BlockPamSapling("olive_sapling");
		pamOrange = RegisterPamFruit("pamOrange");
		pamorangeSapling = new BlockPamSapling("orange_sapling");
		pamPapaya = RegisterPamFruit("pamPapaya");
		pampapayaSapling = new BlockPamSapling("papaya_sapling");
		pamPeach = RegisterPamFruit("pamPeach");
		pampeachSapling = new BlockPamSapling("peach_sapling");
		pamPear = RegisterPamFruit("pamPear");
		pampearSapling = new BlockPamSapling("pear_sapling");
		pamPecan = RegisterPamFruit("pamPecan");
		pampecanSapling = new BlockPamSapling("pecan_sapling");
		pamPeppercorn = RegisterPamFruit("pamPeppercorn");
		pampeppercornSapling = new BlockPamSapling("peppercorn_sapling");
		pamPersimmon = RegisterPamFruit("pamPersimmon");
		pampersimmonSapling = new BlockPamSapling("persimmon_sapling");
		pamPistachio = RegisterPamFruit("pamPistachio");
		pampistachioSapling = new BlockPamSapling("pistachio_sapling");
		pamPlum = RegisterPamFruit("pamPlum");
		pamplumSapling = new BlockPamSapling("plum_sapling");
		pamPomegranate = RegisterPamFruit("pamPomegranate");
		pampomegranateSapling = new BlockPamSapling("pomegranate_sapling");
		pamStarfruit = RegisterPamFruit("pamStarfruit");
		pamstarfruitSapling = new BlockPamSapling("starfruit_sapling");
		pamVanillabean = RegisterPamFruit("pamVanillabean");
		pamvanillabeanSapling = new BlockPamSapling("vanillabean_sapling");
		pamWalnut = RegisterPamFruit("pamWalnut");
		pamwalnutSapling = new BlockPamSapling("walnut_sapling");
	}


	private static void RegisterLogTrees()
	{
		pamCinnamon = RegisterPamLog("pamCinnamon");
		pamcinnamonSapling = new BlockPamSapling("cinnamon_sapling");
		pamMaple = RegisterPamLog("pamMaple");
		pammapleSapling = new BlockPamSapling("maple_sapling");
		pamPaperbark = RegisterPamLog("pamPaperbark");
		pampaperbarkSapling = new BlockPamSapling("paperbark_sapling");
	}
}
