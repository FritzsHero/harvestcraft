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


	private static void RegisterGardenModels()
	{
		RegisterGardenModel(BlockRegistry.AridGardenBlock, "aridgarden");
		RegisterGardenModel(BlockRegistry.FrostGardenBlock, "frostgarden");
		RegisterGardenModel(BlockRegistry.ShadedGardenBlock, "shadedgarden");
		RegisterGardenModel(BlockRegistry.SoggyGardenBlock, "soggygarden");
		RegisterGardenModel(BlockRegistry.TropicalGardenBlock, "tropicalgarden");
		RegisterGardenModel(BlockRegistry.WindyGardenBlock, "windygarden");
	}


	private static void RegisterGardenModel(Block _gardenBlock, String _name)
	{
		registerItemModels(getItem(_gardenBlock), new ItemModelList("gardens/")
			.add(0, _name));
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
		RegisterCropModel(BlockRegistry.JuniperberryCrop, "juniperberry");
		RegisterCropModel(BlockRegistry.JuteCrop, "jute");
		RegisterCropModel(BlockRegistry.KaleCrop, "kale");
		RegisterCropModel(BlockRegistry.KenafCrop, "kenaf");
		RegisterCropModel(BlockRegistry.KohlrabiCrop, "kohlrabi");
		RegisterCropModel(BlockRegistry.LentilCrop, "lentil");
		RegisterCropModel(BlockRegistry.MilletCrop, "millet");
		RegisterCropModel(BlockRegistry.MulberryCrop, "mulberry");
		RegisterCropModel(BlockRegistry.QuinoaCrop, "quinoa");
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


	private static void RegisterFruitModels()
	{
		RegisterFruitModel(BlockRegistry.pamApple, "apple");
		RegisterFruitModel(BlockRegistry.pamCinnamon, "cinnamon");
		RegisterFruitModel(BlockRegistry.pamMaple, "maple");
		RegisterFruitModel(BlockRegistry.pamPaperbark, "paperbark");
		RegisterFruitModel(BlockRegistry.pamAlmond, "almond");
		RegisterFruitModel(BlockRegistry.pamApricot, "apricot");
		RegisterFruitModel(BlockRegistry.pamAvocado, "avocado");
		RegisterFruitModel(BlockRegistry.pamBanana, "banana");
		RegisterFruitModel(BlockRegistry.pamCashew, "cashew");
		RegisterFruitModel(BlockRegistry.pamCherry, "cherry");
		RegisterFruitModel(BlockRegistry.pamChestnut, "chestnut");
		RegisterFruitModel(BlockRegistry.pamCoconut, "coconut");
		RegisterFruitModel(BlockRegistry.pamDate, "date");
		RegisterFruitModel(BlockRegistry.pamDragonfruit, "dragonfruit");
		RegisterFruitModel(BlockRegistry.pamDurian, "durian");
		RegisterFruitModel(BlockRegistry.pamFig, "fig");
		RegisterFruitModel(BlockRegistry.pamGooseberry, "gooseberry");
		RegisterFruitModel(BlockRegistry.pamGrapefruit, "grapefruit");
		RegisterFruitModel(BlockRegistry.pamLemon, "lemon");
		RegisterFruitModel(BlockRegistry.pamLime, "lime");
		RegisterFruitModel(BlockRegistry.pamMango, "mango");
		RegisterFruitModel(BlockRegistry.pamNutmeg, "nutmeg");
		RegisterFruitModel(BlockRegistry.pamOlive, "olive");
		RegisterFruitModel(BlockRegistry.pamOrange, "orange");
		RegisterFruitModel(BlockRegistry.pamPapaya, "papaya");
		RegisterFruitModel(BlockRegistry.pamPeach, "peach");
		RegisterFruitModel(BlockRegistry.pamPear, "pear");
		RegisterFruitModel(BlockRegistry.pamPecan, "pecan");
		RegisterFruitModel(BlockRegistry.pamPeppercorn, "peppercorn");
		RegisterFruitModel(BlockRegistry.pamPersimmon, "persimmon");
		RegisterFruitModel(BlockRegistry.pamPistachio, "pistachio");
		RegisterFruitModel(BlockRegistry.pamPlum, "plum");
		RegisterFruitModel(BlockRegistry.pamPomegranate, "pomegranate");
		RegisterFruitModel(BlockRegistry.pamStarfruit, "starfruit");
		RegisterFruitModel(BlockRegistry.pamVanillabean, "vanillabean");
		RegisterFruitModel(BlockRegistry.pamWalnut, "walnut");
	}


	private static void RegisterFruitModel(Block _fruitBlock, String _name)
	{
		registerItemModels(getItem(_fruitBlock), new ItemModelList("fruits/")
			.add(0, _name + "_stage0")
			.add(1, _name + "_stage1")
			.add(2, _name + "_stage2"));
	}


	private static void RegisterSaplingModels()
	{
		RegisterSaplingModel(BlockRegistry.pamappleSapling, "apple");
		RegisterSaplingModel(BlockRegistry.pamcinnamonSapling, "cinnamon");
		RegisterSaplingModel(BlockRegistry.pammapleSapling, "maple");
		RegisterSaplingModel(BlockRegistry.pampaperbarkSapling, "paperbark");
		RegisterSaplingModel(BlockRegistry.pamalmondSapling, "almond");
		RegisterSaplingModel(BlockRegistry.pamapricotSapling, "apricot");
		RegisterSaplingModel(BlockRegistry.pamavocadoSapling, "avocado");
		RegisterSaplingModel(BlockRegistry.pambananaSapling, "banana");
		RegisterSaplingModel(BlockRegistry.pamcashewSapling, "cashew");
		RegisterSaplingModel(BlockRegistry.pamcherrySapling, "cherry");
		RegisterSaplingModel(BlockRegistry.pamchestnutSapling, "chestnut");
		RegisterSaplingModel(BlockRegistry.pamcoconutSapling, "coconut");
		RegisterSaplingModel(BlockRegistry.pamdateSapling, "date");
		RegisterSaplingModel(BlockRegistry.pamdragonfruitSapling, "dragonfruit");
		RegisterSaplingModel(BlockRegistry.pamdurianSapling, "durian");
		RegisterSaplingModel(BlockRegistry.pamfigSapling, "fig");
		RegisterSaplingModel(BlockRegistry.pamgooseberrySapling, "gooseberry");
		RegisterSaplingModel(BlockRegistry.pamgrapefruitSapling, "grapefruit");
		RegisterSaplingModel(BlockRegistry.pamlemonSapling, "lemon");
		RegisterSaplingModel(BlockRegistry.pamlimeSapling, "lime");
		RegisterSaplingModel(BlockRegistry.pammangoSapling, "mango");
		RegisterSaplingModel(BlockRegistry.pamnutmegSapling, "nutmeg");
		RegisterSaplingModel(BlockRegistry.pamoliveSapling, "olive");
		RegisterSaplingModel(BlockRegistry.pamorangeSapling, "orange");
		RegisterSaplingModel(BlockRegistry.pampapayaSapling, "papaya");
		RegisterSaplingModel(BlockRegistry.pampeachSapling, "peach");
		RegisterSaplingModel(BlockRegistry.pampearSapling, "pear");
		RegisterSaplingModel(BlockRegistry.pampecanSapling, "pecan");
		RegisterSaplingModel(BlockRegistry.pampeppercornSapling, "peppercorn");
		RegisterSaplingModel(BlockRegistry.pampersimmonSapling, "persimmon");
		RegisterSaplingModel(BlockRegistry.pampistachioSapling, "pistachio");
		RegisterSaplingModel(BlockRegistry.pamplumSapling, "plum");
		RegisterSaplingModel(BlockRegistry.pampomegranateSapling, "pomegranate");
		RegisterSaplingModel(BlockRegistry.pamstarfruitSapling, "starfruit");
		RegisterSaplingModel(BlockRegistry.pamvanillabeanSapling, "vanillabean");
		RegisterSaplingModel(BlockRegistry.pamwalnutSapling, "walnut");
	}


	private static void RegisterSaplingModel(Block _saplingBlock, String _name)
	{
		registerItemModels(getItem(_saplingBlock), new ItemModelList("saplings/")
			.add(0, _name + "_sapling"));
	}


	private static void DefineItemModels()
	{
		RegisterGardenModels();
		RegisterCropModels();
		RegisterFruitModels();
		RegisterSaplingModels();
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
