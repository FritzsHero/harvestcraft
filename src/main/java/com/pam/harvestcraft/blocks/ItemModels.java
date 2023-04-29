package com.pam.harvestcraft.blocks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;


public class ItemModels 
{
	private static HashMap<Item, ItemModelList> models = new HashMap<Item, ItemModelList>();


	public static void preInit()
	{
		DefineItemModels();
		prepareModels();
	}


	public static void init()
	{
		registerModels();
	}


	// Shorthand utility method for Item.getItemFromBlock(block)
	private static Item getItem(Block block)
	{
		return Item.getItemFromBlock(block);
	}


	private static void RegisterCropModels()
	{
		RegisterCropModel(BlockRegistry.AgaveCrop, "agave");
		RegisterCropModel(BlockRegistry.AmaranthCrop, "amaranth");
		RegisterCropModel(BlockRegistry.ArrowrootCrop, "arrowroot");
		RegisterCropModel(BlockRegistry.CassavaCrop, "cassava");
		RegisterCropModel(BlockRegistry.ChickpeaCrop, "chickpea");
		RegisterCropModel(BlockRegistry.ElderberryCrop, "elderberry");
		RegisterCropModel(BlockRegistry.FlaxCrop, "flax");
		RegisterCropModel(BlockRegistry.GigaPickleCrop, "gigapickle");
		RegisterCropModel(BlockRegistry.GreenGrapeCrop, "greengrape");
		RegisterCropModel(BlockRegistry.HuckleberryCrop, "huckleberry");
		RegisterCropModel(BlockRegistry.JicamaCrop, "jicama");
		RegisterCropModel(BlockRegistry.pamblackberryCrop, "blackberry");
		RegisterCropModel(BlockRegistry.pamblueberryCrop, "blueberry");
		RegisterCropModel(BlockRegistry.pamcandleberryCrop, "candleberry");
		RegisterCropModel(BlockRegistry.pamraspberryCrop, "raspberry");
		RegisterCropModel(BlockRegistry.pamstrawberryCrop, "strawberry");
		RegisterCropModel(BlockRegistry.pamcactusfruitCrop, "cactusfruit");
		RegisterCropModel(BlockRegistry.pamasparagusCrop, "asparagus");
		RegisterCropModel(BlockRegistry.pambarleyCrop, "barley");
		RegisterCropModel(BlockRegistry.pamoatsCrop, "oats");
		RegisterCropModel(BlockRegistry.pamryeCrop, "rye");
		RegisterCropModel(BlockRegistry.pamcornCrop, "corn");
		RegisterCropModel(BlockRegistry.pambambooshootCrop, "bambooshoot");
		RegisterCropModel(BlockRegistry.pamcantaloupeCrop, "cantaloupe");
		RegisterCropModel(BlockRegistry.pamcucumberCrop, "cucumber");
		RegisterCropModel(BlockRegistry.pamwintersquashCrop, "wintersquash");
		RegisterCropModel(BlockRegistry.pamzucchiniCrop, "zucchini");
		RegisterCropModel(BlockRegistry.pambeetCrop, "beet");
		RegisterCropModel(BlockRegistry.pamonionCrop, "onion");
		RegisterCropModel(BlockRegistry.pamparsnipCrop, "parsnip");
		RegisterCropModel(BlockRegistry.pampeanutCrop, "peanut");
		RegisterCropModel(BlockRegistry.pamradishCrop, "radish");
		RegisterCropModel(BlockRegistry.pamrutabagaCrop, "rutabaga");
		RegisterCropModel(BlockRegistry.pamsweetpotatoCrop, "sweetpotato");
		RegisterCropModel(BlockRegistry.pamturnipCrop, "turnip");
		RegisterCropModel(BlockRegistry.pamrhubarbCrop, "rhubarb");
		RegisterCropModel(BlockRegistry.pamceleryCrop, "celery");
		RegisterCropModel(BlockRegistry.pamgarlicCrop, "garlic");
		RegisterCropModel(BlockRegistry.pamgingerCrop, "ginger");
		RegisterCropModel(BlockRegistry.pamspiceleafCrop, "spiceleaf");
		RegisterCropModel(BlockRegistry.pamtealeafCrop, "tealeaf");
		RegisterCropModel(BlockRegistry.pamcoffeebeanCrop, "coffeebean");
		RegisterCropModel(BlockRegistry.pammustardseedsCrop, "mustardseeds");
		RegisterCropModel(BlockRegistry.pambroccoliCrop, "broccoli");
		RegisterCropModel(BlockRegistry.pamcauliflowerCrop, "cauliflower");
		RegisterCropModel(BlockRegistry.pamleekCrop, "leek");
		RegisterCropModel(BlockRegistry.pamlettuceCrop, "lettuce");
		RegisterCropModel(BlockRegistry.pamscallionCrop, "scallion");
		RegisterCropModel(BlockRegistry.pamartichokeCrop, "artichoke");
		RegisterCropModel(BlockRegistry.pambrusselsproutCrop, "brusselsprout");
		RegisterCropModel(BlockRegistry.pamcabbageCrop, "cabbage");
		RegisterCropModel(BlockRegistry.pamspinachCrop, "spinach");
		RegisterCropModel(BlockRegistry.pamwhitemushroomCrop, "whitemushroom");
		RegisterCropModel(BlockRegistry.pambeanCrop, "bean");
		RegisterCropModel(BlockRegistry.pamsoybeanCrop, "soybean");
		RegisterCropModel(BlockRegistry.pambellpepperCrop, "bellpepper");
		RegisterCropModel(BlockRegistry.pamchilipepperCrop, "chilipepper");
		RegisterCropModel(BlockRegistry.pameggplantCrop, "eggplant");
		RegisterCropModel(BlockRegistry.pamokraCrop, "okra");
		RegisterCropModel(BlockRegistry.pampeasCrop, "peas");
		RegisterCropModel(BlockRegistry.pamtomatoCrop, "tomato");
		RegisterCropModel(BlockRegistry.pamcottonCrop, "cotton");
		RegisterCropModel(BlockRegistry.pampineappleCrop, "pineapple");
		RegisterCropModel(BlockRegistry.pamgrapeCrop, "grape");
		RegisterCropModel(BlockRegistry.pamkiwiCrop, "kiwi");
		RegisterCropModel(BlockRegistry.pamcranberryCrop, "cranberry");
		RegisterCropModel(BlockRegistry.pamriceCrop, "rice");
		RegisterCropModel(BlockRegistry.pamseaweedCrop, "seaweed");
		RegisterCropModel(BlockRegistry.pamcurryleafCrop, "curryleaf");
		RegisterCropModel(BlockRegistry.pamsesameseedsCrop, "sesameseeds");
		RegisterCropModel(BlockRegistry.pamwaterchestnutCrop, "waterchestnut");
	}


	private static void RegisterCropModel(Block _cropBlock, String _name)
	{
		registerItemModels(getItem(_cropBlock), new ItemModelList("crops/")
			.add(0, _name + "_stage0")
			.add(1, _name + "_stage1")
			.add(2, _name + "_stage2")
			.add(3, _name + "_stage3"));
	}
	

	private static void DefineItemModels()
	{
		registerItemModels(getItem(BlockRegistry.AridGardenBlock), new ItemModelList("gardens/")
				.add(0, "aridgarden"));
		registerItemModels(getItem(BlockRegistry.FrostGardenBlock), new ItemModelList("gardens/")
				.add(0, "frostgarden"));
		registerItemModels(getItem(BlockRegistry.ShadedGardenBlock), new ItemModelList("gardens/")
				.add(0, "shadedgarden"));
		registerItemModels(getItem(BlockRegistry.SoggyGardenBlock), new ItemModelList("gardens/")
				.add(0, "soggygarden"));
		registerItemModels(getItem(BlockRegistry.TropicalGardenBlock), new ItemModelList("gardens/")
				.add(0, "tropicalgarden"));
		registerItemModels(getItem(BlockRegistry.WindyGardenBlock), new ItemModelList("gardens/")
				.add(0, "windygarden"));


		RegisterCropModels();
		
		
		
		registerItemModels(getItem(BlockRegistry.pamApple), new ItemModelList("fruits/")
				.add(0, "apple_stage0")
				.add(1, "apple_stage1")
				.add(2, "apple_stage2"));
		registerItemModels(getItem(BlockRegistry.pamappleSapling), new ItemModelList("saplings/")
				.add(0, "apple_sapling"));
		registerItemModels(getItem(BlockRegistry.pamCinnamon), new ItemModelList("fruits/")
				.add(0, "cinnamon_stage0")
				.add(1, "cinnamon_stage1")
				.add(2, "cinnamon_stage2"));
		registerItemModels(getItem(BlockRegistry.pamcinnamonSapling), new ItemModelList("saplings/")
				.add(0, "cinnamon_sapling"));
		registerItemModels(getItem(BlockRegistry.pamMaple), new ItemModelList("fruits/")
				.add(0, "maple_stage0")
				.add(1, "maple_stage1")
				.add(2, "maple_stage2"));
		registerItemModels(getItem(BlockRegistry.pammapleSapling), new ItemModelList("saplings/")
				.add(0, "maple_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPaperbark), new ItemModelList("fruits/")
				.add(0, "paperbark_stage0")
				.add(1, "paperbark_stage1")
				.add(2, "paperbark_stage2"));
		registerItemModels(getItem(BlockRegistry.pampaperbarkSapling), new ItemModelList("saplings/")
				.add(0, "paperbark_sapling"));
		
		registerItemModels(getItem(BlockRegistry.pamAlmond), new ItemModelList("fruits/")
				.add(0, "almond_stage0")
				.add(1, "almond_stage1")
				.add(2, "almond_stage2"));
		registerItemModels(getItem(BlockRegistry.pamalmondSapling), new ItemModelList("saplings/")
				.add(0, "almond_sapling"));
		registerItemModels(getItem(BlockRegistry.pamApricot), new ItemModelList("fruits/")
				.add(0, "apricot_stage0")
				.add(1, "apricot_stage1")
				.add(2, "apricot_stage2"));
		registerItemModels(getItem(BlockRegistry.pamapricotSapling), new ItemModelList("saplings/")
				.add(0, "apricot_sapling"));
		registerItemModels(getItem(BlockRegistry.pamAvocado), new ItemModelList("fruits/")
				.add(0, "avocado_stage0")
				.add(1, "avocado_stage1")
				.add(2, "avocado_stage2"));
		registerItemModels(getItem(BlockRegistry.pamavocadoSapling), new ItemModelList("saplings/")
				.add(0, "avocado_sapling"));
		registerItemModels(getItem(BlockRegistry.pamBanana), new ItemModelList("fruits/")
				.add(0, "banana_stage0")
				.add(1, "banana_stage1")
				.add(2, "banana_stage2"));
		registerItemModels(getItem(BlockRegistry.pambananaSapling), new ItemModelList("saplings/")
				.add(0, "banana_sapling"));
		registerItemModels(getItem(BlockRegistry.pamCashew), new ItemModelList("fruits/")
				.add(0, "cashew_stage0")
				.add(1, "cashew_stage1")
				.add(2, "cashew_stage2"));
		registerItemModels(getItem(BlockRegistry.pamcashewSapling), new ItemModelList("saplings/")
				.add(0, "cashew_sapling"));
		registerItemModels(getItem(BlockRegistry.pamCherry), new ItemModelList("fruits/")
				.add(0, "cherry_stage0")
				.add(1, "cherry_stage1")
				.add(2, "cherry_stage2"));
		registerItemModels(getItem(BlockRegistry.pamcherrySapling), new ItemModelList("saplings/")
				.add(0, "cherry_sapling"));
		registerItemModels(getItem(BlockRegistry.pamChestnut), new ItemModelList("fruits/")
				.add(0, "chestnut_stage0")
				.add(1, "chestnut_stage1")
				.add(2, "chestnut_stage2"));
		registerItemModels(getItem(BlockRegistry.pamchestnutSapling), new ItemModelList("saplings/")
				.add(0, "chestnut_sapling"));
		registerItemModels(getItem(BlockRegistry.pamCoconut), new ItemModelList("fruits/")
				.add(0, "coconut_stage0")
				.add(1, "coconut_stage1")
				.add(2, "coconut_stage2"));
		registerItemModels(getItem(BlockRegistry.pamcoconutSapling), new ItemModelList("saplings/")
				.add(0, "coconut_sapling"));
		registerItemModels(getItem(BlockRegistry.pamDate), new ItemModelList("fruits/")
				.add(0, "date_stage0")
				.add(1, "date_stage1")
				.add(2, "date_stage2"));
		registerItemModels(getItem(BlockRegistry.pamdateSapling), new ItemModelList("saplings/")
				.add(0, "date_sapling"));
		registerItemModels(getItem(BlockRegistry.pamDragonfruit), new ItemModelList("fruits/")
				.add(0, "dragonfruit_stage0")
				.add(1, "dragonfruit_stage1")
				.add(2, "dragonfruit_stage2"));
		registerItemModels(getItem(BlockRegistry.pamdragonfruitSapling), new ItemModelList("saplings/")
				.add(0, "dragonfruit_sapling"));
		registerItemModels(getItem(BlockRegistry.pamDurian), new ItemModelList("fruits/")
				.add(0, "durian_stage0")
				.add(1, "durian_stage1")
				.add(2, "durian_stage2"));
		registerItemModels(getItem(BlockRegistry.pamdurianSapling), new ItemModelList("saplings/")
				.add(0, "durian_sapling"));
		registerItemModels(getItem(BlockRegistry.pamFig), new ItemModelList("fruits/")
				.add(0, "fig_stage0")
				.add(1, "fig_stage1")
				.add(2, "fig_stage2"));
		registerItemModels(getItem(BlockRegistry.pamfigSapling), new ItemModelList("saplings/")
				.add(0, "fig_sapling"));
		registerItemModels(getItem(BlockRegistry.pamGooseberry), new ItemModelList("fruits/")
				.add(0, "gooseberry_stage0")
				.add(1, "gooseberry_stage1")
				.add(2, "gooseberry_stage2"));
		registerItemModels(getItem(BlockRegistry.pamgooseberrySapling), new ItemModelList("saplings/")
				.add(0, "gooseberry_sapling"));
		registerItemModels(getItem(BlockRegistry.pamGrapefruit), new ItemModelList("fruits/")
				.add(0, "grapefruit_stage0")
				.add(1, "grapefruit_stage1")
				.add(2, "grapefruit_stage2"));
		registerItemModels(getItem(BlockRegistry.pamgrapefruitSapling), new ItemModelList("saplings/")
				.add(0, "grapefruit_sapling"));
		registerItemModels(getItem(BlockRegistry.pamLemon), new ItemModelList("fruits/")
				.add(0, "lemon_stage0")
				.add(1, "lemon_stage1")
				.add(2, "lemon_stage2"));
		registerItemModels(getItem(BlockRegistry.pamlemonSapling), new ItemModelList("saplings/")
				.add(0, "lemon_sapling"));
		registerItemModels(getItem(BlockRegistry.pamLime), new ItemModelList("fruits/")
				.add(0, "lime_stage0")
				.add(1, "lime_stage1")
				.add(2, "lime_stage2"));
		registerItemModels(getItem(BlockRegistry.pamlimeSapling), new ItemModelList("saplings/")
				.add(0, "lime_sapling"));
		registerItemModels(getItem(BlockRegistry.pamMango), new ItemModelList("fruits/")
				.add(0, "mango_stage0")
				.add(1, "mango_stage1")
				.add(2, "mango_stage2"));
		registerItemModels(getItem(BlockRegistry.pammangoSapling), new ItemModelList("saplings/")
				.add(0, "mango_sapling"));
		registerItemModels(getItem(BlockRegistry.pamNutmeg), new ItemModelList("fruits/")
				.add(0, "nutmeg_stage0")
				.add(1, "nutmeg_stage1")
				.add(2, "nutmeg_stage2"));
		registerItemModels(getItem(BlockRegistry.pamnutmegSapling), new ItemModelList("saplings/")
				.add(0, "nutmeg_sapling"));
		registerItemModels(getItem(BlockRegistry.pamOlive), new ItemModelList("fruits/")
				.add(0, "olive_stage0")
				.add(1, "olive_stage1")
				.add(2, "olive_stage2"));
		registerItemModels(getItem(BlockRegistry.pamoliveSapling), new ItemModelList("saplings/")
				.add(0, "olive_sapling"));
		registerItemModels(getItem(BlockRegistry.pamOrange), new ItemModelList("fruits/")
				.add(0, "orange_stage0")
				.add(1, "orange_stage1")
				.add(2, "orange_stage2"));
		registerItemModels(getItem(BlockRegistry.pamorangeSapling), new ItemModelList("saplings/")
				.add(0, "orange_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPapaya), new ItemModelList("fruits/")
				.add(0, "papaya_stage0")
				.add(1, "papaya_stage1")
				.add(2, "papaya_stage2"));
		registerItemModels(getItem(BlockRegistry.pampapayaSapling), new ItemModelList("saplings/")
				.add(0, "papaya_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPeach), new ItemModelList("fruits/")
				.add(0, "peach_stage0")
				.add(1, "peach_stage1")
				.add(2, "peach_stage2"));
		registerItemModels(getItem(BlockRegistry.pampeachSapling), new ItemModelList("saplings/")
				.add(0, "peach_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPear), new ItemModelList("fruits/")
				.add(0, "pear_stage0")
				.add(1, "pear_stage1")
				.add(2, "pear_stage2"));
		registerItemModels(getItem(BlockRegistry.pampearSapling), new ItemModelList("saplings/")
				.add(0, "pear_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPecan), new ItemModelList("fruits/")
				.add(0, "pecan_stage0")
				.add(1, "pecan_stage1")
				.add(2, "pecan_stage2"));
		registerItemModels(getItem(BlockRegistry.pampecanSapling), new ItemModelList("saplings/")
				.add(0, "pecan_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPeppercorn), new ItemModelList("fruits/")
				.add(0, "peppercorn_stage0")
				.add(1, "peppercorn_stage1")
				.add(2, "peppercorn_stage2"));
		registerItemModels(getItem(BlockRegistry.pampeppercornSapling), new ItemModelList("saplings/")
				.add(0, "peppercorn_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPersimmon), new ItemModelList("fruits/")
				.add(0, "persimmon_stage0")
				.add(1, "persimmon_stage1")
				.add(2, "persimmon_stage2"));
		registerItemModels(getItem(BlockRegistry.pampersimmonSapling), new ItemModelList("saplings/")
				.add(0, "persimmon_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPistachio), new ItemModelList("fruits/")
				.add(0, "pistachio_stage0")
				.add(1, "pistachio_stage1")
				.add(2, "pistachio_stage2"));
		registerItemModels(getItem(BlockRegistry.pampistachioSapling), new ItemModelList("saplings/")
				.add(0, "pistachio_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPlum), new ItemModelList("fruits/")
				.add(0, "plum_stage0")
				.add(1, "plum_stage1")
				.add(2, "plum_stage2"));
		registerItemModels(getItem(BlockRegistry.pamplumSapling), new ItemModelList("saplings/")
				.add(0, "plum_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPomegranate), new ItemModelList("fruits/")
				.add(0, "pomegranate_stage0")
				.add(1, "pomegranate_stage1")
				.add(2, "pomegranate_stage2"));
		registerItemModels(getItem(BlockRegistry.pampomegranateSapling), new ItemModelList("saplings/")
				.add(0, "pomegranate_sapling"));
		registerItemModels(getItem(BlockRegistry.pamStarfruit), new ItemModelList("fruits/")
				.add(0, "starfruit_stage0")
				.add(1, "starfruit_stage1")
				.add(2, "starfruit_stage2"));
		registerItemModels(getItem(BlockRegistry.pamstarfruitSapling), new ItemModelList("saplings/")
				.add(0, "starfruit_sapling"));
		registerItemModels(getItem(BlockRegistry.pamVanillabean), new ItemModelList("fruits/")
				.add(0, "vanillabean_stage0")
				.add(1, "vanillabean_stage1")
				.add(2, "vanillabean_stage2"));
		registerItemModels(getItem(BlockRegistry.pamvanillabeanSapling), new ItemModelList("saplings/")
				.add(0, "vanillabean_sapling"));
		registerItemModels(getItem(BlockRegistry.pamWalnut), new ItemModelList("fruits/")
				.add(0, "walnut_stage0")
				.add(1, "walnut_stage1")
				.add(2, "walnut_stage2"));
		registerItemModels(getItem(BlockRegistry.pamwalnutSapling), new ItemModelList("saplings/")
				.add(0, "walnut_sapling"));
	}
	

	private static void registerItemModels(Item item, ItemModelList list)
	{
		models.put(item, list);
	}


	private static void prepareModels()
	{
		for (Map.Entry<Item, ItemModelList> entry : models.entrySet())
		{
			Item item = entry.getKey();

			Collection<String> registrations = entry.getValue().getRegistrations().values();

			for (String registration : registrations)
			{
				ModelBakery.addVariantName(item, registration);
			}
		}
	}


	private static void registerModels()
	{
		for (HashMap.Entry<Item, ItemModelList> entry : models.entrySet())
		{
			Item item = entry.getKey();

			HashMap<Integer, String> registrations = entry.getValue().getRegistrations();

			for (Map.Entry<Integer, String> registration : registrations.entrySet())
			{
				int meta = registration.getKey();
				String path = registration.getValue();

				ModelResourceLocation resource = new ModelResourceLocation(path, "inventory");

				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, resource);
			}
		}
	}
}
