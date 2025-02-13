package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.BlockRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class PamFoodOreDictionaryRegistry
{
	public static void getRegistry()
	{
		RegisterAllSeeds();

		OreDictionary.registerOre("listAllveggie", Items.carrot);
		OreDictionary.registerOre("listAllveggie", Items.potato);
		OreDictionary.registerOre("listAllveggie", Blocks.pumpkin);

		OreDictionary.registerOre("cropCarrot", Items.carrot);
		OreDictionary.registerOre("cropPotato", Items.potato);
		OreDictionary.registerOre("cropPumpkin", Blocks.pumpkin);

		OreDictionary.registerOre("listAllgrain", Items.wheat);

		OreDictionary.registerOre("flourEqualswheat", Items.wheat);
		OreDictionary.registerOre("flourEqualswheat", ItemRegistry.flourItem);

		OreDictionary.registerOre("listAllmushroom", Blocks.red_mushroom);
		OreDictionary.registerOre("listAllmushroom", Blocks.brown_mushroom);
		OreDictionary.registerOre("listAllmushroom", ItemRegistry.whitemushroomItem);

		OreDictionary.registerOre("cropApple", Items.apple);
		OreDictionary.registerOre("listAllfruit", Items.apple);

		OreDictionary.registerOre("listAllmeatraw", Items.beef);
		OreDictionary.registerOre("listAllmeatraw", Items.chicken);
		OreDictionary.registerOre("listAllmeatraw", Items.porkchop);
		OreDictionary.registerOre("listAllmeatraw", Items.mutton);
		OreDictionary.registerOre("listAllmeatraw", ItemRegistry.turkeyrawItem);
		OreDictionary.registerOre("listAllmeatraw", Items.rabbit);
		OreDictionary.registerOre("listAllmeatraw", ItemRegistry.venisonrawItem);

		OreDictionary.registerOre("listAllmeatcooked", Items.cooked_beef);
		OreDictionary.registerOre("listAllmeatcooked", Items.cooked_chicken);
		OreDictionary.registerOre("listAllmeatcooked", Items.cooked_porkchop);
		OreDictionary.registerOre("listAllmeatcooked", Items.cooked_mutton);
		OreDictionary.registerOre("listAllmeatcooked", ItemRegistry.turkeycookedItem);
		OreDictionary.registerOre("listAllmeatcooked", Items.cooked_rabbit);
		OreDictionary.registerOre("listAllmeatcooked", ItemRegistry.venisoncookedItem);

		OreDictionary.registerOre("listAllfishraw", Items.fish);
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.fish, 1, 1));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.fish, 1, 2));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.fish, 1, 3));
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.calamarirawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.firmtofuItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.anchovyrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.bassrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.carprawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.catfishrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.charrrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.crayfishrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.eelrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.grouperrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.herringrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.mudfishrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.octopusrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.perchrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.scalloprawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.shrimprawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.snailrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.snapperrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.tilapiarawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.troutrawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.tunarawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.walleyerawItem);
		OreDictionary.registerOre("listAllfishraw", ItemRegistry.greenheartfishItem);

		OreDictionary.registerOre("listAllfishcooked", Items.cooked_fish);
		OreDictionary.registerOre("listAllfishcooked", new ItemStack(Items.cooked_fish, 1, 1));
		OreDictionary.registerOre("listAllfishcooked", ItemRegistry.calamaricookedItem);

		OreDictionary.registerOre("salmonRaw", new ItemStack(Items.fish, 1));

		if (ItemRegistry.isTofuAsMeatEnabled)
		{
			OreDictionary.registerOre("listAllmeatraw", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllmeatcooked", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllfishcooked", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllegg", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllchickenraw", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllchickencooked", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllporkraw", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllporkcooked", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllbeefraw", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllbeefcooked", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllmuttonraw", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllmuttoncooked", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllturkeyraw", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllturkeycooked", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllrabbitraw", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllrabbitcooked", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllvenisonraw", ItemRegistry.firmtofuItem);
			OreDictionary.registerOre("listAllvenisoncooked", ItemRegistry.firmtofuItem);
		}

		OreDictionary.registerOre("listAllegg", Items.egg);
		OreDictionary.registerOre("listAllchickenraw", Items.chicken);
		OreDictionary.registerOre("listAllchickencooked", Items.cooked_chicken);
		OreDictionary.registerOre("listAllporkraw", Items.porkchop);
		OreDictionary.registerOre("listAllporkcooked", Items.cooked_porkchop);
		OreDictionary.registerOre("listAllbeefraw", Items.beef);
		OreDictionary.registerOre("listAllbeefcooked", Items.cooked_beef);
		OreDictionary.registerOre("listAllmuttonraw", Items.mutton);
		OreDictionary.registerOre("listAllmuttoncooked", Items.cooked_mutton);
		OreDictionary.registerOre("listAllturkeyraw", ItemRegistry.turkeyrawItem);
		OreDictionary.registerOre("listAllturkeycooked", ItemRegistry.turkeycookedItem);
		OreDictionary.registerOre("listAllrabbitraw", Items.rabbit);
		OreDictionary.registerOre("listAllrabbitcooked", Items.cooked_rabbit);
		OreDictionary.registerOre("listAllvenisonraw", ItemRegistry.venisonrawItem);
		OreDictionary.registerOre("listAllvenisoncooked", ItemRegistry.venisoncookedItem);


		if (ItemRegistry.enablelistAllwatervanillawaterbucket)
		{
			OreDictionary.registerOre("listAllwater", Items.water_bucket);
		}

		if (ItemRegistry.enablelistAllwaterfreshwater)
		{
			OreDictionary.registerOre("listAllwater", ItemRegistry.freshwaterItem);
		}

		OreDictionary.registerOre("listAllheavycream", ItemRegistry.heavycreamItem);
		OreDictionary.registerOre("listAllicecream", ItemRegistry.icecreamItem);
		OreDictionary.registerOre("listAllmilk", Items.milk_bucket);
		OreDictionary.registerOre("listAllmilk", ItemRegistry.freshmilkItem);

		if (ItemRegistry.isTofuAsMilkEnabled)
		{
			OreDictionary.registerOre("listAllheavycream", ItemRegistry.silkentofuItem);
			OreDictionary.registerOre("listAllicecream", ItemRegistry.silkentofuItem);
			OreDictionary.registerOre("listAllmilk", ItemRegistry.soymilkItem);
		}

		OreDictionary.registerOre("listAllsugar", Items.sugar);
		OreDictionary.registerOre("listAllsugar", ItemRegistry.honeyItem);

		OreDictionary.registerOre("listAllveggie", ItemRegistry.asparagusItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.asparagusItem);
		OreDictionary.registerOre("cropAsparagus", ItemRegistry.asparagusItem);
		OreDictionary.registerOre("foodGrilledasparagus", ItemRegistry.grilledasparagusItem);
		OreDictionary.registerOre("listAllgrain", ItemRegistry.barleyItem);
		OreDictionary.registerOre("cropBarley", ItemRegistry.barleyItem);
		OreDictionary.registerOre("cropBean", ItemRegistry.beanItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.beanItem);
		OreDictionary.registerOre("cropBeet", ItemRegistry.beetItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.beetItem);
		OreDictionary.registerOre("cropBroccoli", ItemRegistry.broccoliItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.broccoliItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.broccoliItem);
		OreDictionary.registerOre("cropCauliflower", ItemRegistry.cauliflowerItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.cauliflowerItem);
		OreDictionary.registerOre("cropCelery", ItemRegistry.celeryItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.celeryItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.celeryItem);
		OreDictionary.registerOre("listAllberry", ItemRegistry.cranberryItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.cranberryItem);
		OreDictionary.registerOre("cropCranberry", ItemRegistry.cranberryItem);
		OreDictionary.registerOre("cropGarlic", ItemRegistry.garlicItem);
		OreDictionary.registerOre("listAllherb", ItemRegistry.garlicItem);
		OreDictionary.registerOre("cropGinger", ItemRegistry.gingerItem);
		OreDictionary.registerOre("listAllspice", ItemRegistry.gingerItem);
		OreDictionary.registerOre("cropLeek", ItemRegistry.leekItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.leekItem);
		OreDictionary.registerOre("cropLettuce", ItemRegistry.lettuceItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.lettuceItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.lettuceItem);
		OreDictionary.registerOre("cropOats", ItemRegistry.oatsItem);
		OreDictionary.registerOre("listAllgrain", ItemRegistry.oatsItem);
		OreDictionary.registerOre("cropOnion", ItemRegistry.onionItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.onionItem);
		OreDictionary.registerOre("cropParsnip", ItemRegistry.parsnipItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.parsnipItem);
		OreDictionary.registerOre("listAllrootveggie", ItemRegistry.parsnipItem);
		OreDictionary.registerOre("listAllnut", ItemRegistry.peanutItem);
		OreDictionary.registerOre("cropPeanut", ItemRegistry.peanutItem);
		OreDictionary.registerOre("cropPineapple", ItemRegistry.pineappleItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.pineappleItem);
		OreDictionary.registerOre("cropRadish", ItemRegistry.radishItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.radishItem);
		OreDictionary.registerOre("listAllrootveggie", ItemRegistry.radishItem);
		OreDictionary.registerOre("cropRice", ItemRegistry.riceItem);
		OreDictionary.registerOre("foodRicecake", ItemRegistry.ricecakeItem);
		OreDictionary.registerOre("cropRutabaga", ItemRegistry.rutabagaItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.rutabagaItem);
		OreDictionary.registerOre("listAllrootveggie", ItemRegistry.rutabagaItem);
		OreDictionary.registerOre("cropRye", ItemRegistry.ryeItem);
		OreDictionary.registerOre("listAllgrain", ItemRegistry.ryeItem);
		OreDictionary.registerOre("cropScallion", ItemRegistry.scallionItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.scallionItem);
		OreDictionary.registerOre("cropSoybean", ItemRegistry.soybeanItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.soybeanItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.spiceleafItem);
		OreDictionary.registerOre("listAllspice", ItemRegistry.spiceleafItem);
		OreDictionary.registerOre("cropSpiceleaf", ItemRegistry.spiceleafItem);
		OreDictionary.registerOre("cropSunflower", ItemRegistry.sunflowerseedsItem);
		OreDictionary.registerOre("cropSweetpotato", ItemRegistry.sweetpotatoItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.sweetpotatoItem);
		OreDictionary.registerOre("listAllrootveggie", ItemRegistry.sweetpotatoItem);
		OreDictionary.registerOre("cropTea", ItemRegistry.tealeafItem);
		OreDictionary.registerOre("foodTea", ItemRegistry.teaItem);
		OreDictionary.registerOre("cropTurnip", ItemRegistry.turnipItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.turnipItem);
		OreDictionary.registerOre("listAllrootveggie", ItemRegistry.turnipItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.whitemushroomItem);
		OreDictionary.registerOre("listAllmushroom", ItemRegistry.whitemushroomItem);
		OreDictionary.registerOre("cropWhitemushroom", ItemRegistry.whitemushroomItem);

		OreDictionary.registerOre("cropAgave", ItemRegistry.AgaveItem);
		OreDictionary.registerOre("cropAmaranth", ItemRegistry.AmaranthItem);
		OreDictionary.registerOre("cropArrowroot", ItemRegistry.ArrowrootItem);
		OreDictionary.registerOre("cropArtichoke", ItemRegistry.artichokeItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.artichokeItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.artichokeItem);
		OreDictionary.registerOre("cropBellpepper", ItemRegistry.bellpepperItem);
		OreDictionary.registerOre("listAllpepper", ItemRegistry.bellpepperItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.bellpepperItem);
		OreDictionary.registerOre("listAllberry", ItemRegistry.blackberryItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.blackberryItem);
		OreDictionary.registerOre("cropBlackberry", ItemRegistry.blackberryItem);
		OreDictionary.registerOre("listAllberry", ItemRegistry.blueberryItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.blueberryItem);
		OreDictionary.registerOre("cropBlueberry", ItemRegistry.blueberryItem);
		OreDictionary.registerOre("cropBrusselsprout", ItemRegistry.brusselsproutItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.brusselsproutItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.brusselsproutItem);
		OreDictionary.registerOre("cropCabbage", ItemRegistry.cabbageItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.cabbageItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.cabbageItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.cactusfruitItem);
		OreDictionary.registerOre("cropCactusfruit", ItemRegistry.cactusfruitItem);
		OreDictionary.registerOre("cropCantaloupe", ItemRegistry.cantaloupeItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.cantaloupeItem);
		OreDictionary.registerOre("cropChilipepper", ItemRegistry.chilipepperItem);
		OreDictionary.registerOre("listAllpepper", ItemRegistry.chilipepperItem);
		OreDictionary.registerOre("cropCoffee", ItemRegistry.coffeebeanItem);
		OreDictionary.registerOre("foodCoffee", ItemRegistry.coffeeItem);
		OreDictionary.registerOre("cropCorn", ItemRegistry.cornItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.cornItem);
		OreDictionary.registerOre("cropCucumber", ItemRegistry.cucumberItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.cucumberItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.cucumberItem);
		OreDictionary.registerOre("cropEggplant", ItemRegistry.eggplantItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.eggplantItem);
		OreDictionary.registerOre("foodGrilledeggplant", ItemRegistry.grilledeggplantItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.grapeItem);
		OreDictionary.registerOre("cropGrape", ItemRegistry.grapeItem);
		OreDictionary.registerOre("foodRaisins", ItemRegistry.raisinsItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.kiwiItem);
		OreDictionary.registerOre("cropKiwi", ItemRegistry.kiwiItem);
		OreDictionary.registerOre("cropMustard", ItemRegistry.mustardseedsItem);
		OreDictionary.registerOre("listAllspice", ItemRegistry.mustardseedsItem);
		OreDictionary.registerOre("cropOkra", ItemRegistry.okraItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.okraItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.okraItem);
		OreDictionary.registerOre("cropPeas", ItemRegistry.peasItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.peasItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.peasItem);
		OreDictionary.registerOre("listAllberry", ItemRegistry.raspberryItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.raspberryItem);
		OreDictionary.registerOre("cropRaspberry", ItemRegistry.raspberryItem);
		OreDictionary.registerOre("cropRhubarb", ItemRegistry.rhubarbItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.rhubarbItem);
		OreDictionary.registerOre("cropSeaweed", ItemRegistry.seaweedItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.seaweedItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.seaweedItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.strawberryItem);
		OreDictionary.registerOre("listAllberry", ItemRegistry.strawberryItem);
		OreDictionary.registerOre("cropStrawberry", ItemRegistry.strawberryItem);
		OreDictionary.registerOre("cropTomato", ItemRegistry.tomatoItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.tomatoItem);
		OreDictionary.registerOre("cropWintersquash", ItemRegistry.wintersquashItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.wintersquashItem);
		OreDictionary.registerOre("cropZucchini", ItemRegistry.zucchiniItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.zucchiniItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.zucchiniItem);
		OreDictionary.registerOre("cropBambooshoot", ItemRegistry.bambooshootItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.bambooshootItem);
		OreDictionary.registerOre("cropSpinach", ItemRegistry.spinachItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.spinachItem);
		OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.spinachItem);

		OreDictionary.registerOre("cropCurryleaf", ItemRegistry.curryleafItem);
		OreDictionary.registerOre("listAllspice", ItemRegistry.currypowderItem);

		OreDictionary.registerOre("cropSesame", ItemRegistry.sesameseedsItem);

		OreDictionary.registerOre("cropWaterchestnut", ItemRegistry.waterchestnutItem);
		OreDictionary.registerOre("listAllveggie", ItemRegistry.waterchestnutItem);

		OreDictionary.registerOre("cropAvocado", ItemRegistry.avocadoItem);
		OreDictionary.registerOre("cropBanana", ItemRegistry.bananaItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.bananaItem);
		OreDictionary.registerOre("cropCherry", ItemRegistry.cherryItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.cherryItem);
		OreDictionary.registerOre("cropCinnamon", ItemRegistry.cinnamonItem);
		OreDictionary.registerOre("cropCoconut", ItemRegistry.coconutItem);
		OreDictionary.registerOre("foodToastedcoconut", ItemRegistry.toastedcoconutItem);
		OreDictionary.registerOre("cropDragonfruit", ItemRegistry.dragonfruitItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.dragonfruitItem);
		OreDictionary.registerOre("cropLemon", ItemRegistry.lemonItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.lemonItem);
		OreDictionary.registerOre("listAllcitrus", ItemRegistry.lemonItem);
		OreDictionary.registerOre("cropLime", ItemRegistry.limeItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.limeItem);
		OreDictionary.registerOre("listAllcitrus", ItemRegistry.limeItem);
		OreDictionary.registerOre("cropMango", ItemRegistry.mangoItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.mangoItem);
		OreDictionary.registerOre("cropNutmeg", ItemRegistry.nutmegItem);
		OreDictionary.registerOre("cropOlive", ItemRegistry.oliveItem);
		OreDictionary.registerOre("cropOrange", ItemRegistry.orangeItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.orangeItem);
		OreDictionary.registerOre("listAllcitrus", ItemRegistry.orangeItem);
		OreDictionary.registerOre("cropPapaya", ItemRegistry.papayaItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.papayaItem);
		OreDictionary.registerOre("cropPeach", ItemRegistry.peachItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.peachItem);
		OreDictionary.registerOre("cropPear", ItemRegistry.pearItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.pearItem);
		OreDictionary.registerOre("cropPeppercorn", ItemRegistry.peppercornItem);
		OreDictionary.registerOre("cropPlum", ItemRegistry.plumItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.plumItem);
		OreDictionary.registerOre("cropPomegranate", ItemRegistry.pomegranateItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.pomegranateItem);
		OreDictionary.registerOre("cropStarfruit", ItemRegistry.starfruitItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.starfruitItem);
		OreDictionary.registerOre("cropVanillabean", ItemRegistry.vanillabeanItem);
		OreDictionary.registerOre("foodVanilla", ItemRegistry.vanillaItem);
		OreDictionary.registerOre("cropWalnut", ItemRegistry.walnutItem);
		OreDictionary.registerOre("listAllnut", ItemRegistry.walnutItem);
		OreDictionary.registerOre("cropGooseberry", ItemRegistry.gooseberryItem);
		OreDictionary.registerOre("listAllberry", ItemRegistry.gooseberryItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.gooseberryItem);

		OreDictionary.registerOre("cropAlmond", ItemRegistry.almondItem);
		OreDictionary.registerOre("listAllnut", ItemRegistry.almondItem);
		OreDictionary.registerOre("cropApricot", ItemRegistry.apricotItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.apricotItem);
		OreDictionary.registerOre("cropCashew", ItemRegistry.cashewItem);
		OreDictionary.registerOre("listAllnut", ItemRegistry.cashewItem);
		OreDictionary.registerOre("cropChestnut", ItemRegistry.chestnutItem);
		OreDictionary.registerOre("listAllnut", ItemRegistry.chestnutItem);
		OreDictionary.registerOre("cropDate", ItemRegistry.dateItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.dateItem);
		OreDictionary.registerOre("cropDurian", ItemRegistry.durianItem);
		OreDictionary.registerOre("cropFig", ItemRegistry.figItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.figItem);
		OreDictionary.registerOre("cropGrapefruit", ItemRegistry.grapefruitItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.grapefruitItem);
		OreDictionary.registerOre("listAllcitrus", ItemRegistry.grapefruitItem);
		OreDictionary.registerOre("cropMaplesyrup", ItemRegistry.maplesyrupItem);
		OreDictionary.registerOre("cropPecan", ItemRegistry.pecanItem);
		OreDictionary.registerOre("listAllnut", ItemRegistry.pecanItem);
		OreDictionary.registerOre("cropPersimmon", ItemRegistry.persimmonItem);
		OreDictionary.registerOre("listAllfruit", ItemRegistry.persimmonItem);
		OreDictionary.registerOre("cropPistachio", ItemRegistry.pistachioItem);
		OreDictionary.registerOre("listAllnut", ItemRegistry.pistachioItem);

		OreDictionary.registerOre("foodSalt", ItemRegistry.saltItem);
		OreDictionary.registerOre("foodFlour", ItemRegistry.flourItem);
		OreDictionary.registerOre("foodDough", ItemRegistry.doughItem);
		OreDictionary.registerOre("foodToast", ItemRegistry.toastItem);
		OreDictionary.registerOre("foodPasta", ItemRegistry.pastaItem);
		OreDictionary.registerOre("foodHeavycream", ItemRegistry.heavycreamItem);
		OreDictionary.registerOre("foodButter", ItemRegistry.butterItem);
		OreDictionary.registerOre("foodCheese", ItemRegistry.cheeseItem);
		OreDictionary.registerOre("foodIcecream", ItemRegistry.icecreamItem);
		OreDictionary.registerOre("foodGrilledcheese", ItemRegistry.grilledcheeseItem);
		OreDictionary.registerOre("foodApplesauce", ItemRegistry.applesauceItem);
		OreDictionary.registerOre("foodApplejuice", ItemRegistry.applejuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.applejuiceItem);
		OreDictionary.registerOre("foodApplepie", ItemRegistry.applepieItem);
		OreDictionary.registerOre("foodCaramelapple", ItemRegistry.caramelappleItem);
		OreDictionary.registerOre("foodPumpkinbread", ItemRegistry.pumpkinbreadItem);
		OreDictionary.registerOre("foodRoastedpumpkinseeds", ItemRegistry.roastedpumpkinseedsItem);
		OreDictionary.registerOre("foodPumpkinsoup", ItemRegistry.pumpkinsoupItem);
		OreDictionary.registerOre("foodMelonjuice", ItemRegistry.melonjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.melonjuiceItem);
		OreDictionary.registerOre("foodMelonsmoothie", ItemRegistry.melonsmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.melonsmoothieItem);
		OreDictionary.registerOre("foodCarrotjuice", ItemRegistry.carrotjuiceItem);
		OreDictionary.registerOre("foodCarrotcake", ItemRegistry.carrotcakeItem);
		OreDictionary.registerOre("foodCarrotsoup", ItemRegistry.carrotsoupItem);
		OreDictionary.registerOre("foodGlazedcarrots", ItemRegistry.glazedcarrotsItem);
		OreDictionary.registerOre("foodButteredpotato", ItemRegistry.butteredpotatoItem);
		OreDictionary.registerOre("foodLoadedbakedpotato", ItemRegistry.loadedbakedpotatoItem);
		OreDictionary.registerOre("foodMashedpotatoes", ItemRegistry.mashedpotatoesItem);
		OreDictionary.registerOre("foodPotatosalad", ItemRegistry.potatosaladItem);
		OreDictionary.registerOre("foodPotatosoup", ItemRegistry.potatosoupItem);
		OreDictionary.registerOre("foodFries", ItemRegistry.friesItem);
		OreDictionary.registerOre("foodGrilledmushroom", ItemRegistry.grilledmushroomItem);
		OreDictionary.registerOre("foodStuffedmushroom", ItemRegistry.stuffedmushroomItem);
		OreDictionary.registerOre("foodChickensandwich", ItemRegistry.chickensandwichItem);
		OreDictionary.registerOre("foodChickennoodlesoup", ItemRegistry.chickennoodlesoupItem);
		OreDictionary.registerOre("foodChickenpotpie", ItemRegistry.chickenpotpieItem);
		OreDictionary.registerOre("foodBreadedporkchop", ItemRegistry.breadedporkchopItem);
		OreDictionary.registerOre("foodHotdog", ItemRegistry.hotdogItem);
		OreDictionary.registerOre("foodBakedham", ItemRegistry.bakedhamItem);
		OreDictionary.registerOre("foodHamburger", ItemRegistry.hamburgerItem);
		OreDictionary.registerOre("foodCheeseburger", ItemRegistry.cheeseburgerItem);
		OreDictionary.registerOre("foodBaconcheeseburger", ItemRegistry.baconcheeseburgerItem);
		OreDictionary.registerOre("foodPotroast", ItemRegistry.potroastItem);
		OreDictionary.registerOre("foodFishsandwich", ItemRegistry.fishsandwichItem);
		OreDictionary.registerOre("foodFishsticks", ItemRegistry.fishsticksItem);
		OreDictionary.registerOre("foodFishandchips", ItemRegistry.fishandchipsItem);
		OreDictionary.registerOre("foodMayo", ItemRegistry.mayoItem);
		OreDictionary.registerOre("foodFriedegg", ItemRegistry.friedeggItem);
		OreDictionary.registerOre("foodScrambledegg", ItemRegistry.scrambledeggItem);
		OreDictionary.registerOre("foodBoiledegg", ItemRegistry.boiledeggItem);
		OreDictionary.registerOre("foodEggsalad", ItemRegistry.eggsaladItem);
		OreDictionary.registerOre("foodCaramel", ItemRegistry.caramelItem);
		OreDictionary.registerOre("foodTaffy", ItemRegistry.taffyItem);
		OreDictionary.registerOre("foodSpidereyesoup", ItemRegistry.spidereyesoupItem);
		OreDictionary.registerOre("foodZombiejerky", ItemRegistry.zombiejerkyItem);
		OreDictionary.registerOre("foodCocoapowder", ItemRegistry.cocoapowderItem);
		OreDictionary.registerOre("foodChocolatebar", ItemRegistry.chocolatebarItem);
		OreDictionary.registerOre("foodHotchocolate", ItemRegistry.hotchocolateItem);
		OreDictionary.registerOre("foodChocolateicecream", ItemRegistry.chocolateicecreamItem);
		OreDictionary.registerOre("foodVegetablesoup", ItemRegistry.vegetablesoupItem);
		OreDictionary.registerOre("foodStock", ItemRegistry.stockItem);
		OreDictionary.registerOre("foodFruitsalad", ItemRegistry.fruitsaladItem);

		OreDictionary.registerOre("foodSpagetti", ItemRegistry.spagettiItem);
		OreDictionary.registerOre("foodSpagettiandmeatballs", ItemRegistry.spagettiandmeatballsItem);
		OreDictionary.registerOre("foodTomatosoup", ItemRegistry.tomatosoupItem);
		OreDictionary.registerOre("foodKetchup", ItemRegistry.ketchupItem);
		OreDictionary.registerOre("foodChickenparmasan", ItemRegistry.chickenparmasanItem);
		OreDictionary.registerOre("foodPizza", ItemRegistry.pizzaItem);

		OreDictionary.registerOre("foodSpringsalad", ItemRegistry.springsaladItem);
		OreDictionary.registerOre("foodPorklettucewrap", ItemRegistry.porklettucewrapItem);
		OreDictionary.registerOre("foodFishlettucewrap", ItemRegistry.fishlettucewrapItem);
		OreDictionary.registerOre("foodBlt", ItemRegistry.bltItem);
		OreDictionary.registerOre("foodLeafychickensandwich", ItemRegistry.leafychickensandwichItem);
		OreDictionary.registerOre("foodLeafyfishsandwich", ItemRegistry.leafyfishsandwichItem);
		OreDictionary.registerOre("foodDeluxecheeseburger", ItemRegistry.deluxecheeseburgerItem);
		OreDictionary.registerOre("foodDelightedmeal", ItemRegistry.delightedmealItem);

		OreDictionary.registerOre("foodOnionsoup", ItemRegistry.onionsoupItem);
		OreDictionary.registerOre("foodPotatocakes", ItemRegistry.potatocakesItem);
		OreDictionary.registerOre("foodHash", ItemRegistry.hashItem);
		OreDictionary.registerOre("foodBraisedonions", ItemRegistry.braisedonionsItem);
		OreDictionary.registerOre("foodHeartyBreakfast", ItemRegistry.heartybreakfastItem);

		OreDictionary.registerOre("foodCornonthecob", ItemRegistry.cornonthecobItem);
		OreDictionary.registerOre("foodCornmeal", ItemRegistry.cornmealItem);
		OreDictionary.registerOre("foodCornbread", ItemRegistry.cornbreadItem);
		OreDictionary.registerOre("foodTortilla", ItemRegistry.tortillaItem);
		OreDictionary.registerOre("foodNachoes", ItemRegistry.nachoesItem);
		OreDictionary.registerOre("foodTaco", ItemRegistry.tacoItem);
		OreDictionary.registerOre("foodFishtaco", ItemRegistry.fishtacoItem);
		OreDictionary.registerOre("foodCreamedcorn", ItemRegistry.creamedcornItem);

		OreDictionary.registerOre("foodStrawberrysmoothie", ItemRegistry.strawberrysmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.strawberrysmoothieItem);
		OreDictionary.registerOre("foodStrawberrypie", ItemRegistry.strawberrypieItem);
		OreDictionary.registerOre("foodStrawberrysalad", ItemRegistry.strawberrysaladItem);
		OreDictionary.registerOre("foodStrawberryjuice", ItemRegistry.strawberryjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.strawberryjuiceItem);
		OreDictionary.registerOre("foodChocolatestrawberry", ItemRegistry.chocolatestrawberryItem);

		OreDictionary.registerOre("foodPeanutbutter", ItemRegistry.peanutbutterItem);
		OreDictionary.registerOre("listAllnutbutter", ItemRegistry.peanutbutterItem);
		OreDictionary.registerOre("foodTrailmix", ItemRegistry.trailmixItem);
		OreDictionary.registerOre("foodPbandj", ItemRegistry.pbandjItem);
		OreDictionary.registerOre("foodPeanutbuttercookies", ItemRegistry.peanutbuttercookiesItem);

		OreDictionary.registerOre("foodGrapejuice", ItemRegistry.grapejuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.grapejuiceItem);
		OreDictionary.registerOre("foodVinegar", ItemRegistry.vinegarItem);
		OreDictionary.registerOre("foodGrapejelly", ItemRegistry.grapejellyItem);
		OreDictionary.registerOre("foodGrapesalad", ItemRegistry.grapesaladItem);
		OreDictionary.registerOre("foodRaisincookies", ItemRegistry.raisincookiesItem);

		OreDictionary.registerOre("foodPickles", ItemRegistry.picklesItem);
		OreDictionary.registerOre("foodCucumbersalad", ItemRegistry.cucumbersaladItem);
		OreDictionary.registerOre("foodCucumbersoup", ItemRegistry.cucumbersoupItem);
		OreDictionary.registerOre("foodVegetarianlettucewrap", ItemRegistry.vegetarianlettucewrapItem);
		OreDictionary.registerOre("foodMarinatedcucumbers", ItemRegistry.marinatedcucumbersItem);

		OreDictionary.registerOre("foodRicesoup", ItemRegistry.ricesoupItem);
		OreDictionary.registerOre("foodFriedrice", ItemRegistry.friedriceItem);
		OreDictionary.registerOre("foodMushroomrisotto", ItemRegistry.mushroomrisottoItem);
		OreDictionary.registerOre("foodCurry", ItemRegistry.curryItem);
		OreDictionary.registerOre("foodRainbowcurry", ItemRegistry.rainbowcurryItem);

		OreDictionary.registerOre("foodRefriedbeans", ItemRegistry.refriedbeansItem);
		OreDictionary.registerOre("foodBakedbeans", ItemRegistry.bakedbeansItem);
		OreDictionary.registerOre("foodBeansandrice", ItemRegistry.beansandriceItem);
		OreDictionary.registerOre("foodChili", ItemRegistry.chiliItem);
		OreDictionary.registerOre("foodBeanburrito", ItemRegistry.beanburritoItem);

		OreDictionary.registerOre("foodStuffedpepper", ItemRegistry.stuffedpepperItem);
		OreDictionary.registerOre("foodVeggiestirfry", ItemRegistry.veggiestirfryItem);
		OreDictionary.registerOre("foodGrilledskewers", ItemRegistry.grilledskewersItem);
		OreDictionary.registerOre("foodSupremepizza", ItemRegistry.supremepizzaItem);
		OreDictionary.registerOre("foodOmelet", ItemRegistry.omeletItem);

		OreDictionary.registerOre("foodHotwings", ItemRegistry.hotwingsItem);
		OreDictionary.registerOre("foodChilipoppers", ItemRegistry.chilipoppersItem);
		OreDictionary.registerOre("foodExtremechili", ItemRegistry.extremechiliItem);
		OreDictionary.registerOre("foodChilichocolate", ItemRegistry.chilichocolateItem);

		OreDictionary.registerOre("foodLemonaide", ItemRegistry.lemonaideItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.lemonaideItem);
		OreDictionary.registerOre("foodLemonbar", ItemRegistry.lemonbarItem);
		OreDictionary.registerOre("foodFishdinner", ItemRegistry.fishdinnerItem);
		OreDictionary.registerOre("foodLemonsmoothie", ItemRegistry.lemonsmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.lemonsmoothieItem);
		OreDictionary.registerOre("foodLemonmeringue", ItemRegistry.lemonmeringueItem);
		OreDictionary.registerOre("foodCandiedlemon", ItemRegistry.candiedlemonItem);
		OreDictionary.registerOre("foodLemonchicken", ItemRegistry.lemonchickenItem);

		OreDictionary.registerOre("foodBlueberrysmoothie", ItemRegistry.blueberrysmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.blueberrysmoothieItem);
		OreDictionary.registerOre("foodBlueberrypie", ItemRegistry.blueberrypieItem);
		OreDictionary.registerOre("foodBlueberrymuffin", ItemRegistry.blueberrymuffinItem);
		OreDictionary.registerOre("foodBlueberryjuice", ItemRegistry.blueberryjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.blueberryjuiceItem);
		OreDictionary.registerOre("foodPancakes", ItemRegistry.pancakesItem);
		OreDictionary.registerOre("foodBlueberrypancakes", ItemRegistry.blueberrypancakesItem);

		OreDictionary.registerOre("foodCherryjuice", ItemRegistry.cherryjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.cherryjuiceItem);
		OreDictionary.registerOre("foodCherrypie", ItemRegistry.cherrypieItem);
		OreDictionary.registerOre("foodChocolatecherry", ItemRegistry.chocolatecherryItem);
		OreDictionary.registerOre("foodCherrysmoothie", ItemRegistry.cherrysmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.cherrysmoothieItem);
		OreDictionary.registerOre("foodCheesecake", ItemRegistry.cheesecakeItem);
		OreDictionary.registerOre("foodCherrycheesecake", ItemRegistry.cherrycheesecakeItem);

		OreDictionary.registerOre("foodStuffedeggplant", ItemRegistry.stuffedeggplantItem);
		OreDictionary.registerOre("foodEggplantparm", ItemRegistry.eggplantparmItem);

		OreDictionary.registerOre("foodRaspberryicedtea", ItemRegistry.raspberryicedteaItem);
		OreDictionary.registerOre("foodChaitea", ItemRegistry.chaiteaItem);

		OreDictionary.registerOre("foodEspresso", ItemRegistry.espressoItem);
		OreDictionary.registerOre("foodCoffeeconleche", ItemRegistry.coffeeconlecheItem);
		OreDictionary.registerOre("foodMochaicecream", ItemRegistry.mochaicecreamItem);

		OreDictionary.registerOre("foodPickledbeets", ItemRegistry.pickledbeetsItem);
		OreDictionary.registerOre("foodBeetsalad", ItemRegistry.beetsaladItem);
		OreDictionary.registerOre("foodBeetsoup", ItemRegistry.beetsoupItem);
		OreDictionary.registerOre("foodBakedbeets", ItemRegistry.bakedbeetsItem);

		OreDictionary.registerOre("foodBroccolimac", ItemRegistry.broccolimacItem);
		OreDictionary.registerOre("foodBroccolindip", ItemRegistry.broccolindipItem);
		OreDictionary.registerOre("foodCreamedbroccolisoup", ItemRegistry.creamedbroccolisoupItem);

		OreDictionary.registerOre("foodSweetpotatopie", ItemRegistry.sweetpotatopieItem);
		OreDictionary.registerOre("foodCandiedsweetpotatoes", ItemRegistry.candiedsweetpotatoesItem);
		OreDictionary.registerOre("foodMashedsweetpotatoes", ItemRegistry.mashedsweetpotatoesItem);

		OreDictionary.registerOre("foodSteamedpeas", ItemRegistry.steamedpeasItem);
		OreDictionary.registerOre("foodSplitpeasoup", ItemRegistry.splitpeasoupItem);

		OreDictionary.registerOre("foodPineappleupsidedowncake", ItemRegistry.pineappleupsidedowncakeItem);
		OreDictionary.registerOre("foodPineappleham", ItemRegistry.pineapplehamItem);
		OreDictionary.registerOre("foodPineappleyogurt", ItemRegistry.pineappleyogurtItem);

		OreDictionary.registerOre("foodTurnipsoup", ItemRegistry.turnipsoupItem);
		OreDictionary.registerOre("foodRoastedrootveggiemedley", ItemRegistry.roastedrootveggiemedleyItem);
		OreDictionary.registerOre("foodBakedturnips", ItemRegistry.bakedturnipsItem);

		OreDictionary.registerOre("foodGingerbread", ItemRegistry.gingerbreadItem);
		OreDictionary.registerOre("foodGingersnaps", ItemRegistry.gingersnapsItem);
		OreDictionary.registerOre("foodCandiedginger", ItemRegistry.candiedgingerItem);

		OreDictionary.registerOre("foodMustard", ItemRegistry.mustardItem);
		OreDictionary.registerOre("foodSoftpretzelandmustard", ItemRegistry.softpretzelandmustardItem);
		OreDictionary.registerOre("foodSpicymustardpork", ItemRegistry.spicymustardporkItem);
		OreDictionary.registerOre("foodSpicygreens", ItemRegistry.spicygreensItem);

		OreDictionary.registerOre("foodGarlicbread", ItemRegistry.garlicbreadItem);
		OreDictionary.registerOre("foodGarlicmashedpotatoes", ItemRegistry.garlicmashedpotatoesItem);
		OreDictionary.registerOre("foodGarlicchicken", ItemRegistry.garlicchickenItem);

		OreDictionary.registerOre("foodSummerradishsalad", ItemRegistry.summerradishsaladItem);
		OreDictionary.registerOre("foodSummersquashwithradish", ItemRegistry.summersquashwithradishItem);

		OreDictionary.registerOre("foodCeleryandpeanutbutter", ItemRegistry.celeryandpeanutbutterItem);
		OreDictionary.registerOre("foodChickencelerycasserole", ItemRegistry.chickencelerycasseroleItem);
		OreDictionary.registerOre("foodPeasandcelery", ItemRegistry.peasandceleryItem);
		OreDictionary.registerOre("foodCelerysoup", ItemRegistry.celerysoupItem);

		OreDictionary.registerOre("foodZucchinibread", ItemRegistry.zucchinibreadItem);
		OreDictionary.registerOre("foodZucchinifries", ItemRegistry.zucchinifriesItem);
		OreDictionary.registerOre("foodZestyzucchini", ItemRegistry.zestyzucchiniItem);
		OreDictionary.registerOre("foodZucchinibake", ItemRegistry.zucchinibakeItem);

		OreDictionary.registerOre("foodAsparagusquiche", ItemRegistry.asparagusquicheItem);
		OreDictionary.registerOre("foodAsparagussoup", ItemRegistry.asparagussoupItem);

		OreDictionary.registerOre("foodWalnutraisinbread", ItemRegistry.walnutraisinbreadItem);
		OreDictionary.registerOre("foodCandiedwalnuts", ItemRegistry.candiedwalnutsItem);
		OreDictionary.registerOre("foodBrownie", ItemRegistry.brownieItem);

		OreDictionary.registerOre("foodPapayajuice", ItemRegistry.papayajuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.papayajuiceItem);
		OreDictionary.registerOre("foodPapayasmoothie", ItemRegistry.papayasmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.papayasmoothieItem);
		OreDictionary.registerOre("foodPapayayogurt", ItemRegistry.papayayogurtItem);

		OreDictionary.registerOre("foodStarfruitjuice", ItemRegistry.starfruitjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.starfruitjuiceItem);
		OreDictionary.registerOre("foodStarfruitsmoothie", ItemRegistry.starfruitsmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.starfruitsmoothieItem);
		OreDictionary.registerOre("foodStarfruityogurt", ItemRegistry.starfruityogurtItem);

		OreDictionary.registerOre("foodGuacamole", ItemRegistry.guacamoleItem);
		OreDictionary.registerOre("foodCreamofavocadosoup", ItemRegistry.creamofavocadosoupItem);
		OreDictionary.registerOre("foodAvocadoburrito", ItemRegistry.avocadoburritoItem);

		OreDictionary.registerOre("foodPoachedpear", ItemRegistry.poachedpearItem);
		OreDictionary.registerOre("foodFruitcrumble", ItemRegistry.fruitcrumbleItem);
		OreDictionary.registerOre("foodPearyogurt", ItemRegistry.pearyogurtItem);
		OreDictionary.registerOre("foodPlumyogurt", ItemRegistry.plumyogurtItem);

		OreDictionary.registerOre("foodBananasplit", ItemRegistry.bananasplitItem);
		OreDictionary.registerOre("foodBanananutbread", ItemRegistry.banananutbreadItem);
		OreDictionary.registerOre("foodBananasmoothie", ItemRegistry.bananasmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.bananasmoothieItem);
		OreDictionary.registerOre("foodBananayogurt", ItemRegistry.bananayogurtItem);

		OreDictionary.registerOre("foodCoconutmilk", ItemRegistry.coconutmilkItem);
		OreDictionary.registerOre("foodChickencurry", ItemRegistry.chickencurryItem);
		OreDictionary.registerOre("foodCoconutshrimp", ItemRegistry.coconutshrimpItem);
		OreDictionary.registerOre("foodCoconutyogurt", ItemRegistry.coconutyogurtItem);

		OreDictionary.registerOre("foodOrangejuice", ItemRegistry.orangejuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.orangejuiceItem);
		OreDictionary.registerOre("foodOrangechicken", ItemRegistry.orangechickenItem);
		OreDictionary.registerOre("foodOrangesmoothie", ItemRegistry.orangesmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.orangesmoothieItem);
		OreDictionary.registerOre("foodOrangeyogurt", ItemRegistry.orangeyogurtItem);

		OreDictionary.registerOre("foodPeachjuice", ItemRegistry.peachjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.peachjuiceItem);
		OreDictionary.registerOre("foodPeachcobbler", ItemRegistry.peachcobblerItem);
		OreDictionary.registerOre("foodPeachsmoothie", ItemRegistry.peachsmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.peachsmoothieItem);
		OreDictionary.registerOre("foodPeachyogurt", ItemRegistry.peachyogurtItem);

		OreDictionary.registerOre("foodLimejuice", ItemRegistry.limejuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.limejuiceItem);
		OreDictionary.registerOre("foodKeylimepie", ItemRegistry.keylimepieItem);
		OreDictionary.registerOre("foodLimesmoothie", ItemRegistry.limesmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.limesmoothieItem);
		OreDictionary.registerOre("foodLimeyogurt", ItemRegistry.limeyogurtItem);

		OreDictionary.registerOre("foodMangojuice", ItemRegistry.mangojuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.mangojuiceItem);
		OreDictionary.registerOre("foodMangosmoothie", ItemRegistry.mangosmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.mangosmoothieItem);
		OreDictionary.registerOre("foodMangoyogurt", ItemRegistry.mangoyogurtItem);

		OreDictionary.registerOre("foodPomegranatejuice", ItemRegistry.pomegranatejuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.pomegranatejuiceItem);
		OreDictionary.registerOre("foodPomegranatesmoothie", ItemRegistry.pomegranatesmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.pomegranatesmoothieItem);
		OreDictionary.registerOre("foodPomegranateyogurt", ItemRegistry.pomegranateyogurtItem);

		OreDictionary.registerOre("foodVanillayogurt", ItemRegistry.vanillayogurtItem);

		OreDictionary.registerOre("foodCinnamonroll", ItemRegistry.cinnamonrollItem);
		OreDictionary.registerOre("foodFrenchtoast", ItemRegistry.frenchtoastItem);

		OreDictionary.registerOre("foodMarshmellows", ItemRegistry.marshmellowsItem);
		OreDictionary.registerOre("foodDonut", ItemRegistry.donutItem);
		OreDictionary.registerOre("foodChocolatedonut", ItemRegistry.chocolatedonutItem);
		OreDictionary.registerOre("foodPowdereddonut", ItemRegistry.powdereddonutItem);
		OreDictionary.registerOre("foodJellydonut", ItemRegistry.jellydonutItem);
		OreDictionary.registerOre("foodFrosteddonut", ItemRegistry.frosteddonutItem);

		OreDictionary.registerOre("foodCactussoup", ItemRegistry.cactussoupItem);
		OreDictionary.registerOre("foodWaffles", ItemRegistry.wafflesItem);
		OreDictionary.registerOre("foodSeedsoup", ItemRegistry.seedsoupItem);
		OreDictionary.registerOre("foodSoftpretzel", ItemRegistry.softpretzelItem);
		OreDictionary.registerOre("foodJellybeans", ItemRegistry.jellybeansItem);
		OreDictionary.registerOre("foodBiscuit", ItemRegistry.biscuitItem);

		OreDictionary.registerOre("foodCreamcookie", ItemRegistry.creamcookieItem);
		OreDictionary.registerOre("foodJaffa", ItemRegistry.jaffaItem);
		OreDictionary.registerOre("foodFriedchicken", ItemRegistry.friedchickenItem);
		OreDictionary.registerOre("foodChocolatesprinklecake", ItemRegistry.chocolatesprinklecakeItem);
		OreDictionary.registerOre("foodRedvelvetcake", ItemRegistry.redvelvetcakeItem);
		OreDictionary.registerOre("foodFootlong", ItemRegistry.footlongItem);

		OreDictionary.registerOre("foodBlueberryyogurt", ItemRegistry.blueberryyogurtItem);
		OreDictionary.registerOre("foodLemonyogurt", ItemRegistry.lemonyogurtItem);
		OreDictionary.registerOre("foodCherryyogurt", ItemRegistry.cherryyogurtItem);
		OreDictionary.registerOre("foodStrawberryyogurt", ItemRegistry.strawberryyogurtItem);
		OreDictionary.registerOre("foodGrapeyogurt", ItemRegistry.grapeyogurtItem);
		OreDictionary.registerOre("foodChocolateyogurt", ItemRegistry.chocolateyogurtItem);

		OreDictionary.registerOre("foodBlackberryjuice", ItemRegistry.blackberryjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.blackberryjuiceItem);
		OreDictionary.registerOre("foodBlackberrycobbler", ItemRegistry.blackberrycobblerItem);
		OreDictionary.registerOre("foodBlackberrysmoothie", ItemRegistry.blackberrysmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.blackberrysmoothieItem);
		OreDictionary.registerOre("foodBlackberryyogurt", ItemRegistry.blackberryyogurtItem);
		OreDictionary.registerOre("foodChocolatemilk", ItemRegistry.chocolatemilkItem);
		OreDictionary.registerOre("foodPumpkinyogurt", ItemRegistry.pumpkinyogurtItem);

		OreDictionary.registerOre("foodRaspberryjuice", ItemRegistry.raspberryjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.raspberryjuiceItem);
		OreDictionary.registerOre("foodRaspberrypie", ItemRegistry.raspberrypieItem);
		OreDictionary.registerOre("foodRaspberrysmoothie", ItemRegistry.raspberrysmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.raspberrysmoothieItem);
		OreDictionary.registerOre("foodRaspberryyogurt", ItemRegistry.raspberryyogurtItem);
		OreDictionary.registerOre("foodCinnamonsugardonut", ItemRegistry.cinnamonsugardonutItem);
		OreDictionary.registerOre("foodMelonyogurt", ItemRegistry.melonyogurtItem);

		OreDictionary.registerOre("foodKiwijuice", ItemRegistry.kiwijuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.kiwijuiceItem);
		OreDictionary.registerOre("foodKiwismoothie", ItemRegistry.kiwismoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.kiwismoothieItem);
		OreDictionary.registerOre("foodKiwiyogurt", ItemRegistry.kiwiyogurtItem);
		OreDictionary.registerOre("foodPlainyogurt", ItemRegistry.plainyogurtItem);
		OreDictionary.registerOre("foodAppleyogurt", ItemRegistry.appleyogurtItem);

		OreDictionary.registerOre("foodSaltedsunflowerseeds", ItemRegistry.saltedsunflowerseedsItem);
		OreDictionary.registerOre("foodSunflowerwheatrolls", ItemRegistry.sunflowerwheatrollsItem);
		OreDictionary.registerOre("foodSunflowerbroccolisalad", ItemRegistry.sunflowerbroccolisaladItem);

		OreDictionary.registerOre("foodCranberryjuice", ItemRegistry.cranberryjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.cranberryjuiceItem);
		OreDictionary.registerOre("foodCranberrysauce", ItemRegistry.cranberrysauceItem);
		OreDictionary.registerOre("foodCranberrybar", ItemRegistry.cranberrybarItem);

		OreDictionary.registerOre("foodPeppermint", ItemRegistry.peppermintItem);

		OreDictionary.registerOre("foodCactusfruitjuice", ItemRegistry.cactusfruitjuiceItem);
		OreDictionary.registerOre("listAlljuice", ItemRegistry.cactusfruitjuiceItem);

		OreDictionary.registerOre("foodBlackpepper", ItemRegistry.blackpepperItem);
		OreDictionary.registerOre("foodGroundcinnamon", ItemRegistry.groundcinnamonItem);
		OreDictionary.registerOre("foodGroundnutmeg", ItemRegistry.groundnutmegItem);
		OreDictionary.registerOre("foodOliveoil", ItemRegistry.oliveoilItem);

		OreDictionary.registerOre("foodBaklava", ItemRegistry.baklavaItem);
		OreDictionary.registerOre("foodGummybears", ItemRegistry.gummybearsItem);
		OreDictionary.registerOre("foodBaconmushroomburger", ItemRegistry.baconmushroomburgerItem);
		OreDictionary.registerOre("foodFruitpunch", ItemRegistry.fruitpunchItem);
		OreDictionary.registerOre("foodMeatystew", ItemRegistry.meatystewItem);
		OreDictionary.registerOre("foodMixedsalad", ItemRegistry.mixedsaladItem);
		OreDictionary.registerOre("foodPinacolada", ItemRegistry.pinacoladaItem);
		OreDictionary.registerOre("foodSaladdressing", ItemRegistry.saladdressingItem);
		OreDictionary.registerOre("foodShepherdspie", ItemRegistry.shepardspieItem);
		OreDictionary.registerOre("foodEggnog", ItemRegistry.eggnogItem);
		OreDictionary.registerOre("foodCustard", ItemRegistry.custardItem);
		OreDictionary.registerOre("foodSushi", ItemRegistry.sushiItem);
		OreDictionary.registerOre("foodGardensoup", ItemRegistry.gardensoupItem);

		OreDictionary.registerOre("foodMuttonraw", Items.mutton);
		OreDictionary.registerOre("foodMuttoncooked", Items.cooked_mutton);
		//OreDictionary.registerOre("foodMuttonraw", ItemRegistry.muttonrawItem);
		// OreDictionary.registerOre("foodMuttoncooked", ItemRegistry.muttoncookedItem);
		OreDictionary.registerOre("foodCalamariraw", ItemRegistry.calamarirawItem);
		OreDictionary.registerOre("foodCalamaricooked", ItemRegistry.calamaricookedItem);

		OreDictionary.registerOre("foodApplejelly", ItemRegistry.applejellyItem);
		OreDictionary.registerOre("foodApplejellysandwich", ItemRegistry.applejellysandwichItem);
		OreDictionary.registerOre("foodBlackberryjelly", ItemRegistry.blackberryjellyItem);
		OreDictionary.registerOre("foodBlackberryjellysandwich", ItemRegistry.blackberryjellysandwichItem);
		OreDictionary.registerOre("foodBlueberryjelly", ItemRegistry.blueberryjellyItem);
		OreDictionary.registerOre("foodBlueberryjellysandwich", ItemRegistry.blueberryjellysandwichItem);
		OreDictionary.registerOre("foodCherryjelly", ItemRegistry.cherryjellyItem);
		OreDictionary.registerOre("foodCherryjellysandwich", ItemRegistry.cherryjellysandwichItem);
		OreDictionary.registerOre("foodCranberryjelly", ItemRegistry.cranberryjellyItem);
		OreDictionary.registerOre("foodCranberryjellysandwich", ItemRegistry.cranberryjellysandwichItem);
		OreDictionary.registerOre("foodKiwijelly", ItemRegistry.kiwijellyItem);
		OreDictionary.registerOre("foodKiwijellysandwich", ItemRegistry.kiwijellysandwichItem);
		OreDictionary.registerOre("foodLemonjelly", ItemRegistry.lemonjellyItem);
		OreDictionary.registerOre("foodLemonjellysandwich", ItemRegistry.lemonjellysandwichItem);
		OreDictionary.registerOre("foodLimejelly", ItemRegistry.limejellyItem);
		OreDictionary.registerOre("foodLimejellysandwich", ItemRegistry.limejellysandwichItem);
		OreDictionary.registerOre("foodMangojelly", ItemRegistry.mangojellyItem);
		OreDictionary.registerOre("foodMangojellysandwich", ItemRegistry.mangojellysandwichItem);
		OreDictionary.registerOre("foodOrangejelly", ItemRegistry.orangejellyItem);
		OreDictionary.registerOre("foodOrangejellysandwich", ItemRegistry.orangejellysandwichItem);
		OreDictionary.registerOre("foodPapayajelly", ItemRegistry.papayajellyItem);
		OreDictionary.registerOre("foodPapayajellysandwich", ItemRegistry.papayajellysandwichItem);
		OreDictionary.registerOre("foodPeachjelly", ItemRegistry.peachjellyItem);
		OreDictionary.registerOre("foodPeachjellysandwich", ItemRegistry.peachjellysandwichItem);
		OreDictionary.registerOre("foodPomegranatejelly", ItemRegistry.pomegranatejellyItem);
		OreDictionary.registerOre("foodPomegranatejellysandwich", ItemRegistry.pomegranatejellysandwichItem);
		OreDictionary.registerOre("foodRaspberryjelly", ItemRegistry.raspberryjellyItem);
		OreDictionary.registerOre("foodRaspberryjellysandwich", ItemRegistry.raspberryjellysandwichItem);
		OreDictionary.registerOre("foodStarfruitjelly", ItemRegistry.starfruitjellyItem);
		OreDictionary.registerOre("foodStarfruitjellysandwich", ItemRegistry.starfruitjellysandwichItem);
		OreDictionary.registerOre("foodStrawberryjelly", ItemRegistry.strawberryjellyItem);
		OreDictionary.registerOre("foodStrawberryjellysandwich", ItemRegistry.strawberryjellysandwichItem);
		OreDictionary.registerOre("foodWatermelonjelly", ItemRegistry.watermelonjellyItem);
		OreDictionary.registerOre("foodWatermelonjellysandwich", ItemRegistry.watermelonjellysandwichItem);

		OreDictionary.registerOre("foodBubblywater", ItemRegistry.bubblywaterItem);
		OreDictionary.registerOre("foodCherrysoda", ItemRegistry.cherrysodaItem);
		OreDictionary.registerOre("foodColasoda", ItemRegistry.colasodaItem);
		OreDictionary.registerOre("foodGingersoda", ItemRegistry.gingersodaItem);
		OreDictionary.registerOre("foodGrapesoda", ItemRegistry.grapesodaItem);
		OreDictionary.registerOre("foodLemonlimesoda", ItemRegistry.lemonlimesodaItem);
		OreDictionary.registerOre("foodOrangesoda", ItemRegistry.orangesodaItem);
		OreDictionary.registerOre("foodRootbeersoda", ItemRegistry.rootbeersodaItem);
		OreDictionary.registerOre("foodStrawberrysoda", ItemRegistry.strawberrysodaItem);

		OreDictionary.registerOre("foodCaramelicecream", ItemRegistry.caramelicecreamItem);
		OreDictionary.registerOre("foodMintchocolatechipicecream", ItemRegistry.mintchocolatechipicecreamItem);
		OreDictionary.registerOre("foodStrawberryicecream", ItemRegistry.strawberryicecreamItem);
		OreDictionary.registerOre("foodVanillaicecream", ItemRegistry.vanillaicecreamItem);

		OreDictionary.registerOre("cropEdibleroot", ItemRegistry.ediblerootItem);

		OreDictionary.registerOre("foodGingerchicken", ItemRegistry.gingerchickenItem);

		OreDictionary.registerOre("foodOldworldveggiesoup", ItemRegistry.oldworldveggiesoupItem);
		OreDictionary.registerOre("foodSpicebun", ItemRegistry.spicebunItem);
		OreDictionary.registerOre("foodGingeredrhubarbtart", ItemRegistry.gingeredrhubarbtartItem);
		OreDictionary.registerOre("foodLambbarleysoup", ItemRegistry.lambbarleysoupItem);
		OreDictionary.registerOre("foodHoneylemonlamb", ItemRegistry.honeylemonlambItem);
		OreDictionary.registerOre("foodPumpkinoatscones", ItemRegistry.pumpkinoatsconesItem);
		OreDictionary.registerOre("foodBeefjerky", ItemRegistry.beefjerkyItem);
		OreDictionary.registerOre("foodPlumjuice", ItemRegistry.plumjuiceItem);
		OreDictionary.registerOre("foodPearjuice", ItemRegistry.pearjuiceItem);
		OreDictionary.registerOre("foodOvenroastedcauliflower", ItemRegistry.ovenroastedcauliflowerItem);
		OreDictionary.registerOre("foodLeekbaconsoup", ItemRegistry.leekbaconsoupItem);
		OreDictionary.registerOre("foodHerbbutterparsnips", ItemRegistry.herbbutterparsnipsItem);
		OreDictionary.registerOre("foodScallionbakedpotato", ItemRegistry.scallionbakedpotatoItem);
		OreDictionary.registerOre("foodSoymilk", ItemRegistry.soymilkItem);
		OreDictionary.registerOre("foodFirmtofu", ItemRegistry.firmtofuItem);
		OreDictionary.registerOre("foodSilkentofu", ItemRegistry.silkentofuItem);

		OreDictionary.registerOre("foodBamboosteamedrice", ItemRegistry.bamboosteamedriceItem);
		OreDictionary.registerOre("foodRoastedchestnut", ItemRegistry.roastedchestnutItem);
		OreDictionary.registerOre("foodSweetpotatosouffle", ItemRegistry.sweetpotatosouffleItem);
		OreDictionary.registerOre("foodCashewchicken", ItemRegistry.cashewchickenItem);
		OreDictionary.registerOre("foodApricotjuice", ItemRegistry.apricotjuiceItem);
		OreDictionary.registerOre("foodApricotyogurt", ItemRegistry.apricotyogurtItem);
		OreDictionary.registerOre("foodApricotglazedpork", ItemRegistry.apricotglazedporkItem);
		OreDictionary.registerOre("foodApricotjelly", ItemRegistry.apricotjellyItem);
		OreDictionary.registerOre("foodApricotjellysandwich", ItemRegistry.apricotjellysandwichItem);
		OreDictionary.registerOre("foodApricotsmoothie", ItemRegistry.apricotsmoothieItem);
		OreDictionary.registerOre("foodFigbar", ItemRegistry.figbarItem);
		OreDictionary.registerOre("foodFigjelly", ItemRegistry.figjellyItem);
		OreDictionary.registerOre("foodFigjellysandwich", ItemRegistry.figjellysandwichItem);
		OreDictionary.registerOre("foodFigsmoothie", ItemRegistry.figsmoothieItem);
		OreDictionary.registerOre("foodFigyogurt", ItemRegistry.figyogurtItem);
		OreDictionary.registerOre("foodFigjuice", ItemRegistry.figjuiceItem);
		OreDictionary.registerOre("foodGrapefruitjuice", ItemRegistry.grapefruitjuiceItem);
		OreDictionary.registerOre("foodGrapefruitjelly", ItemRegistry.grapefruitjellyItem);
		OreDictionary.registerOre("foodGrapefruitjellysandwich", ItemRegistry.grapefruitjellysandwichItem);
		OreDictionary.registerOre("foodGrapefruitjellysmoothie", ItemRegistry.grapefruitsmoothieItem);
		OreDictionary.registerOre("foodGrapefruityogurt", ItemRegistry.grapefruityogurtItem);
		OreDictionary.registerOre("foodGrapefruitsoda", ItemRegistry.grapefruitsodaItem);
		OreDictionary.registerOre("foodCitrussalad", ItemRegistry.citrussaladItem);
		OreDictionary.registerOre("foodPecanpie", ItemRegistry.pecanpieItem);
		OreDictionary.registerOre("foodPralines", ItemRegistry.pralinesItem);
		OreDictionary.registerOre("foodPersimmonjuice", ItemRegistry.persimmonjuiceItem);
		OreDictionary.registerOre("foodPersimmonyogurt", ItemRegistry.persimmonyogurtItem);
		OreDictionary.registerOre("foodPersimmonsmoothie", ItemRegistry.persimmonsmoothieItem);
		OreDictionary.registerOre("foodPersimmonjelly", ItemRegistry.persimmonjellyItem);
		OreDictionary.registerOre("foodPersimmonjellysanwich", ItemRegistry.persimmonjellysandwichItem);
		OreDictionary.registerOre("foodPistachiobakedsalmon", ItemRegistry.pistachiobakedsalmonItem);
		OreDictionary.registerOre("foodBaconwrappeddates", ItemRegistry.baconwrappeddatesItem);
		OreDictionary.registerOre("foodDatenutbread", ItemRegistry.datenutbreadItem);
		OreDictionary.registerOre("foodMaplesyruppancakes", ItemRegistry.maplesyruppancakesItem);
		OreDictionary.registerOre("foodMaplesyrupwaffles", ItemRegistry.maplesyrupwafflesItem);
		OreDictionary.registerOre("foodMaplesausage", ItemRegistry.maplesausageItem);
		OreDictionary.registerOre("foodMapleoatmeal", ItemRegistry.mapleoatmealItem);
		OreDictionary.registerOre("foodPeachesandcreamoatmeal", ItemRegistry.peachesandcreamoatmealItem);
		OreDictionary.registerOre("foodCinnamonappleoatmeal", ItemRegistry.cinnamonappleoatmealItem);
		OreDictionary.registerOre("foodMaplecandiedbacon", ItemRegistry.maplecandiedbaconItem);
		OreDictionary.registerOre("foodToastsandwich", ItemRegistry.toastsandwichItem);
		OreDictionary.registerOre("foodPotatoandcheesepirogi", ItemRegistry.potatoandcheesepirogiItem);
		OreDictionary.registerOre("foodZeppole", ItemRegistry.zeppoleItem);
		OreDictionary.registerOre("foodSausageinbread", ItemRegistry.sausageinbreadItem);
		OreDictionary.registerOre("foodChocolatecaramelfudge", ItemRegistry.chocolatecaramelfudgeItem);
		OreDictionary.registerOre("foodLavendershortbread", ItemRegistry.lavendershortbreadItem);
		OreDictionary.registerOre("foodBeefwellington", ItemRegistry.beefwellingtonItem);
		OreDictionary.registerOre("foodEpicbacon", ItemRegistry.epicbaconItem);
		OreDictionary.registerOre("foodManjuu", ItemRegistry.manjuuItem);

		OreDictionary.registerOre("foodTunasalad", ItemRegistry.tunasaladItem);
		OreDictionary.registerOre("foodTurkishDelight", ItemRegistry.TurkishDelightItem);
		OreDictionary.registerOre("foodVanillaConchasBread", ItemRegistry.VanillaConchasBreadItem);
		OreDictionary.registerOre("foodVanillaCupcake", ItemRegistry.VanillaCupcakeItem);
		OreDictionary.registerOre("foodWontonsoup", ItemRegistry.wontonsoupItem);
		OreDictionary.registerOre("foodSchnitzel", ItemRegistry.schnitzelItem);
		OreDictionary.registerOre("foodBratwurst", ItemRegistry.bratwurstItem);
		OreDictionary.registerOre("foodChickengumbo", ItemRegistry.chickengumboItem);
		OreDictionary.registerOre("foodGeneraltsochicken", ItemRegistry.generaltsochickenItem);
		OreDictionary.registerOre("foodCaliforniaroll", ItemRegistry.californiarollItem);
		OreDictionary.registerOre("foodFutomaki", ItemRegistry.futomakiItem);
		OreDictionary.registerOre("foodBeansontoast", ItemRegistry.beansontoastItem);
		OreDictionary.registerOre("foodVegemite", ItemRegistry.vegemiteItem);
		OreDictionary.registerOre("foodHoneycombchocolatebar", ItemRegistry.honeycombchocolatebarItem);
		OreDictionary.registerOre("foodCherrycoconutchocolatebar", ItemRegistry.cherrycoconutchocolatebarItem);
		OreDictionary.registerOre("foodFairybread", ItemRegistry.fairybreadItem);
		OreDictionary.registerOre("foodLamington", ItemRegistry.lamingtonItem);
		OreDictionary.registerOre("foodTimtam", ItemRegistry.timtamItem);
		OreDictionary.registerOre("foodMeatpie", ItemRegistry.meatpieItem);
		OreDictionary.registerOre("foodChikoroll", ItemRegistry.chikorollItem);
		OreDictionary.registerOre("foodDamper", ItemRegistry.damperItem);
		OreDictionary.registerOre("foodBeetburger", ItemRegistry.beetburgerItem);
		OreDictionary.registerOre("foodPavlova", ItemRegistry.pavlovaItem);
		OreDictionary.registerOre("foodGherkin", ItemRegistry.gherkinItem);
		OreDictionary.registerOre("foodMcpam", ItemRegistry.mcpamItem);

		OreDictionary.registerOre("foodCeasarsalad", ItemRegistry.ceasarsaladItem);
		OreDictionary.registerOre("foodChaoscookie", ItemRegistry.chaoscookieItem);
		OreDictionary.registerOre("foodChocolatecookie", ItemRegistry.chocolatebaconItem);
		OreDictionary.registerOre("foodLambkebab", ItemRegistry.lambkebabItem);
		OreDictionary.registerOre("foodNutella", ItemRegistry.nutellaItem);
		OreDictionary.registerOre("foodSnickersbar", ItemRegistry.snickersbarItem);
		OreDictionary.registerOre("foodSpinachpie", ItemRegistry.spinachpieItem);
		OreDictionary.registerOre("foodSteamedspinach", ItemRegistry.steamedspinachItem);
		OreDictionary.registerOre("foodVegemiteontoast", ItemRegistry.vegemiteontoastItem);

		OreDictionary.registerOre("foodSalmonraw", new ItemStack(Items.fish, 1, 1));
		OreDictionary.registerOre("foodAnchovyraw", ItemRegistry.anchovyrawItem);
		OreDictionary.registerOre("foodBassraw", ItemRegistry.bassrawItem);
		OreDictionary.registerOre("foodCarpraw", ItemRegistry.carprawItem);
		OreDictionary.registerOre("foodCatfishraw", ItemRegistry.catfishrawItem);
		OreDictionary.registerOre("foodCharrraw", ItemRegistry.charrrawItem);
		OreDictionary.registerOre("foodClamraw", ItemRegistry.clamrawItem);
		OreDictionary.registerOre("foodCrabraw", ItemRegistry.crabrawItem);
		OreDictionary.registerOre("foodCrayfishraw", ItemRegistry.crayfishrawItem);
		OreDictionary.registerOre("foodEelraw", ItemRegistry.eelrawItem);
		OreDictionary.registerOre("foodFrograw", ItemRegistry.frograwItem);
		OreDictionary.registerOre("foodGrouperraw", ItemRegistry.grouperrawItem);
		OreDictionary.registerOre("foodHerringraw", ItemRegistry.herringrawItem);
		OreDictionary.registerOre("foodJellyfishraw", ItemRegistry.jellyfishrawItem);
		OreDictionary.registerOre("foodMudfishraw", ItemRegistry.mudfishrawItem);
		OreDictionary.registerOre("foodOctopusraw", ItemRegistry.octopusrawItem);
		OreDictionary.registerOre("foodPerchraw", ItemRegistry.perchrawItem);
		OreDictionary.registerOre("foodScallopraw", ItemRegistry.scalloprawItem);
		OreDictionary.registerOre("foodShrimpraw", ItemRegistry.shrimprawItem);
		OreDictionary.registerOre("foodSnailraw", ItemRegistry.snailrawItem);
		OreDictionary.registerOre("foodSnapperraw", ItemRegistry.snapperrawItem);
		OreDictionary.registerOre("foodTilapiaraw", ItemRegistry.tilapiarawItem);
		OreDictionary.registerOre("foodTroutraw", ItemRegistry.troutrawItem);
		OreDictionary.registerOre("foodTunaraw", ItemRegistry.tunarawItem);
		OreDictionary.registerOre("foodTurtleraw", ItemRegistry.turtlerawItem);
		OreDictionary.registerOre("foodWalleyraw", ItemRegistry.walleyerawItem);


		OreDictionary.registerOre("foodHolidaycake", ItemRegistry.holidaycakeItem);

		OreDictionary.registerOre("foodClamcooked", ItemRegistry.clamcookedItem);
		OreDictionary.registerOre("foodCrabcooked", ItemRegistry.crabcookedItem);
		OreDictionary.registerOre("foodCrayfishcooked", ItemRegistry.crayfishcookedItem);
		OreDictionary.registerOre("foodFrogcooked", ItemRegistry.frogcookedItem);
		OreDictionary.registerOre("foodOctopuscooked", ItemRegistry.octopuscookedItem);
		OreDictionary.registerOre("foodScallopcooked", ItemRegistry.scallopcookedItem);
		OreDictionary.registerOre("foodShrimpcooked", ItemRegistry.shrimpcookedItem);
		OreDictionary.registerOre("foodSnailcooked", ItemRegistry.snailcookedItem);
		OreDictionary.registerOre("foodTurtlecooked", ItemRegistry.turtlecookedItem);

		OreDictionary.registerOre("foodApplecider", ItemRegistry.appleciderItem);
		OreDictionary.registerOre("foodBangersandmash", ItemRegistry.bangersandmashItem);
		OreDictionary.registerOre("foodBatteredsausage", ItemRegistry.batteredsausageItem);
		OreDictionary.registerOre("foodBatter", ItemRegistry.batterItem);
		OreDictionary.registerOre("foodchorizo", ItemRegistry.chorizoItem);
		OreDictionary.registerOre("foodColeslaw", ItemRegistry.coleslawItem);
		OreDictionary.registerOre("foodEnergydrink", ItemRegistry.energydrinkItem);
		OreDictionary.registerOre("foodFriedonions", ItemRegistry.friedonionsItem);
		OreDictionary.registerOre("foodMeatfeastpizza", ItemRegistry.meatfeastpizzaItem);
		OreDictionary.registerOre("foodMincepie", ItemRegistry.mincepieItem);
		OreDictionary.registerOre("foodOnionhamburger", ItemRegistry.onionhamburgerItem);
		OreDictionary.registerOre("foodPepperoni", ItemRegistry.pepperoniItem);
		OreDictionary.registerOre("foodPickledonions", ItemRegistry.pickledonionsItem);
		OreDictionary.registerOre("foodPorksausage", ItemRegistry.porksausageItem);
		OreDictionary.registerOre("foodRaspberrytrifle", ItemRegistry.raspberrytrifleItem);

		OreDictionary.registerOre("foodTurkeyraw", ItemRegistry.turkeyrawItem);
		OreDictionary.registerOre("foodTurkeycooked", ItemRegistry.turkeycookedItem);
		OreDictionary.registerOre("foodRabbitraw", Items.rabbit);
		OreDictionary.registerOre("foodRabbitcooked", Items.cooked_rabbit);
		//OreDictionary.registerOre("foodRabbitraw", ItemRegistry.rabbitrawItem);
		//OreDictionary.registerOre("foodRabbitcooked", ItemRegistry.rabbitcookedItem);
		OreDictionary.registerOre("foodVenisonraw", ItemRegistry.venisonrawItem);
		OreDictionary.registerOre("foodVenisoncooked", ItemRegistry.venisoncookedItem);

		OreDictionary.registerOre("foodStrawberrymilkshake", ItemRegistry.strawberrymilkshakeItem);
		OreDictionary.registerOre("foodChocolatemilkshake", ItemRegistry.chocolatemilkshakeItem);
		OreDictionary.registerOre("foodBananamilkshake", ItemRegistry.bananamilkshakeItem);
		OreDictionary.registerOre("foodCornflakes", ItemRegistry.cornflakesItem);
		OreDictionary.registerOre("foodColeslawburger", ItemRegistry.coleslawburgerItem);
		OreDictionary.registerOre("foodRoastchicken", ItemRegistry.roastchickenItem);
		OreDictionary.registerOre("foodRoastpotatoes", ItemRegistry.roastpotatoesItem);
		OreDictionary.registerOre("foodSundayroast", ItemRegistry.sundayroastItem);
		OreDictionary.registerOre("foodBbqpulledpork", ItemRegistry.bbqpulledporkItem);
		OreDictionary.registerOre("foodLambwithmintsauce", ItemRegistry.lambwithmintsauceItem);
		OreDictionary.registerOre("foodSteakandchips", ItemRegistry.steakandchipsItem);

		OreDictionary.registerOre("foodCherryicecream", ItemRegistry.cherryicecreamItem);
		OreDictionary.registerOre("foodPistachioicecream", ItemRegistry.pistachioicecreamItem);
		OreDictionary.registerOre("foodNeapolitanicecream", ItemRegistry.neapolitanicecreamItem);
		OreDictionary.registerOre("foodSpumoniicecream", ItemRegistry.spumoniicecreamItem);

		OreDictionary.registerOre("foodAlmondbutter", ItemRegistry.almondbutterItem);
		OreDictionary.registerOre("foodCashewbutter", ItemRegistry.cashewbutterItem);
		OreDictionary.registerOre("foodChestnutbutter", ItemRegistry.chestnutbutterItem);
		OreDictionary.registerOre("foodCornishpasty", ItemRegistry.cornishpastyItem);
		OreDictionary.registerOre("foodCottagepie", ItemRegistry.cottagepieItem);
		OreDictionary.registerOre("foodCroissant", ItemRegistry.croissantItem);
		OreDictionary.registerOre("foodCurrypowder", ItemRegistry.currypowderItem);
		OreDictionary.registerOre("listAllspice", ItemRegistry.currypowderItem);
		OreDictionary.registerOre("foodDimsum", ItemRegistry.dimsumItem);
		OreDictionary.registerOre("foodFriedpecanokra", ItemRegistry.friedpecanokraItem);
		OreDictionary.registerOre("foodGooseberryjelly", ItemRegistry.gooseberryjellyItem);
		OreDictionary.registerOre("foodGooseberryjellysandwich", ItemRegistry.gooseberryjellysandwichItem);
		OreDictionary.registerOre("foodGooseberrymilkeshake", ItemRegistry.gooseberrymilkshakeItem);
		OreDictionary.registerOre("foodGooseberrypie", ItemRegistry.gooseberrypieItem);
		OreDictionary.registerOre("foodGooseberrysmoothie", ItemRegistry.gooseberrysmoothieItem);
		OreDictionary.registerOre("listAllsmoothie", ItemRegistry.gooseberrysmoothieItem);
		OreDictionary.registerOre("foodGooseberryyogurt", ItemRegistry.gooseberryyogurtItem);
		OreDictionary.registerOre("foodGreenheartfish", ItemRegistry.greenheartfishItem);
		OreDictionary.registerOre("foodHamsweetpicklesandwich", ItemRegistry.hamsweetpicklesandwichItem);
		OreDictionary.registerOre("foodHushpuppies", ItemRegistry.hushpuppiesItem);
		OreDictionary.registerOre("foodKimchi", ItemRegistry.kimchiItem);
		OreDictionary.registerOre("foodMochi", ItemRegistry.mochiItem);
		OreDictionary.registerOre("foodMuseli", ItemRegistry.museliItem);
		OreDictionary.registerOre("foodNaan", ItemRegistry.naanItem);
		OreDictionary.registerOre("foodOkrachips", ItemRegistry.okrachipsItem);
		OreDictionary.registerOre("foodOkracreole", ItemRegistry.okracreoleItem);
		OreDictionary.registerOre("foodPistachiobutter", ItemRegistry.pistachiobutterItem);
		OreDictionary.registerOre("foodPloughmanslunch", ItemRegistry.ploughmanslunchItem);
		OreDictionary.registerOre("foodPorklomein", ItemRegistry.porklomeinItem);
		OreDictionary.registerOre("foodSalmonpatties", ItemRegistry.salmonpattiesItem);
		OreDictionary.registerOre("foodSausage", ItemRegistry.sausageItem);
		OreDictionary.registerOre("foodSausageroll", ItemRegistry.sausagerollItem);
		OreDictionary.registerOre("foodSesameball", ItemRegistry.sesameballItem);
		OreDictionary.registerOre("foodSesamesnaps", ItemRegistry.sesamesnapsItem);
		OreDictionary.registerOre("foodShrimpokrahushpuppies", ItemRegistry.shrimpokrahushpuppiesItem);
		OreDictionary.registerOre("foodSoysauce", ItemRegistry.soysauceItem);
		OreDictionary.registerOre("foodSweetpickle", ItemRegistry.sweetpickleItem);
		OreDictionary.registerOre("foodVeggiestrips", ItemRegistry.veggiestripsItem);
		OreDictionary.registerOre("foodVindaloo", ItemRegistry.vindalooItem);

		OreDictionary.registerOre("listAllnutbutter", ItemRegistry.almondbutterItem);
		OreDictionary.registerOre("listAllnutbutter", ItemRegistry.cashewbutterItem);
		OreDictionary.registerOre("listAllnutbutter", ItemRegistry.chestnutbutterItem);
		OreDictionary.registerOre("listAllnutbutter", ItemRegistry.pistachiobutterItem);

		OreDictionary.registerOre("foodApplesmoothie", ItemRegistry.applesmoothieItem);
		OreDictionary.registerOre("foodCheeseontoast", ItemRegistry.cheeseontoastItem);
		OreDictionary.registerOre("foodChocolateroll", ItemRegistry.chocolaterollItem);
		OreDictionary.registerOre("foodCoconutcream", ItemRegistry.coconutcreamItem);
		OreDictionary.registerOre("foodCoconutsmoothie", ItemRegistry.coconutsmoothieItem);
		OreDictionary.registerOre("foodCracker", ItemRegistry.crackerItem);
		OreDictionary.registerOre("foodCranberrysmoothie", ItemRegistry.cranberrysmoothieItem);
		OreDictionary.registerOre("foodCranberryyogurt", ItemRegistry.cranberryyogurtItem);
		OreDictionary.registerOre("foodDeluxechickencurry", ItemRegistry.deluxechickencurryItem);
		OreDictionary.registerOre("foodGarammasala", ItemRegistry.garammasalaItem);
		OreDictionary.registerOre("foodGrapesmoothie", ItemRegistry.grapesmoothieItem);
		OreDictionary.registerOre("foodGravy", ItemRegistry.gravyItem);
		OreDictionary.registerOre("foodHoneysandwich", ItemRegistry.honeysandwichItem);
		OreDictionary.registerOre("foodJamroll", ItemRegistry.jamrollItem);
		OreDictionary.registerOre("foodMangochutney", ItemRegistry.mangochutneyItem);
		OreDictionary.registerOre("foodMarzipan", ItemRegistry.marzipanItem);
		OreDictionary.registerOre("foodPaneer", ItemRegistry.paneerItem);
		OreDictionary.registerOre("foodPaneertikkamasala", ItemRegistry.paneertikkamasalaItem);
		OreDictionary.registerOre("foodPeaandhamsoup", ItemRegistry.peaandhamsoupItem);
		OreDictionary.registerOre("foodPearjelly", ItemRegistry.pearjellyItem);
		OreDictionary.registerOre("foodPearjellysandwich", ItemRegistry.pearjellysandwichItem);
		OreDictionary.registerOre("foodPearsmoothie", ItemRegistry.pearsmoothieItem);
		OreDictionary.registerOre("foodPlumjelly", ItemRegistry.plumjellyItem);
		OreDictionary.registerOre("foodPlumjellysandwich", ItemRegistry.plumjellysandwichItem);
		OreDictionary.registerOre("foodPlumsmoothie", ItemRegistry.plumsmoothieItem);
		OreDictionary.registerOre("foodPotatoandleeksoup", ItemRegistry.potatoandleeksoupItem);
		OreDictionary.registerOre("foodToadinthehole", ItemRegistry.toadintheholeItem);
		OreDictionary.registerOre("foodTunapotato", ItemRegistry.tunapotatoItem);
		OreDictionary.registerOre("foodYorkshirepudding", ItemRegistry.yorkshirepuddingItem);

		
		GetAdditionalRegistry();
	}


	private static void RegisterAllSeeds()
	{
		OreDictionary.registerOre("listAllseed", Items.wheat_seeds);
		OreDictionary.registerOre("listAllseed", Items.pumpkin_seeds);
		OreDictionary.registerOre("listAllseed", Items.melon_seeds);

		OreDictionary.registerOre("listAllseed", ItemRegistry.sunflowerseedsItem);
		//sunflowerseedsItem is also registered as "cropSunflower"
		
		for(int i = 0; i < ItemRegistry.PamSeeds.length; i++)
		{
			OreDictionary.registerOre("listAllseed", ItemRegistry.PamSeeds[i]);
		}


		OreDictionary.registerOre("seedAgave", ItemRegistry.AgaveSeedItem);
		OreDictionary.registerOre("seedAmaranth", ItemRegistry.AmaranthSeedItem);
		OreDictionary.registerOre("seedArrowroot", ItemRegistry.ArrowrootSeedItem);
		OreDictionary.registerOre("seedCassava", ItemRegistry.CassavaSeedItem);
		OreDictionary.registerOre("seedChickpea", ItemRegistry.ChickpeaSeedItem);
		OreDictionary.registerOre("seedElderberry", ItemRegistry.ElderberrySeedItem);
		OreDictionary.registerOre("seedFlax", ItemRegistry.FlaxSeedItem);
		OreDictionary.registerOre("seedGigaPickle", ItemRegistry.GigaPickleSeedItem);
		OreDictionary.registerOre("seedGreenGrape", ItemRegistry.GreenGrapeSeedItem);
		OreDictionary.registerOre("seedHuckleberry", ItemRegistry.HuckleberrySeedItem);
		OreDictionary.registerOre("seedJicama", ItemRegistry.JicamaSeedItem);
		OreDictionary.registerOre("seedJuniperberry", ItemRegistry.JuniperberrySeedItem);
		OreDictionary.registerOre("seedJute", ItemRegistry.JuteSeedItem);
		OreDictionary.registerOre("seedKale", ItemRegistry.KaleSeedItem);
		OreDictionary.registerOre("seedKenaf", ItemRegistry.KenafSeedItem);
		OreDictionary.registerOre("seedKohlrabi", ItemRegistry.KohlrabiSeedItem);
		OreDictionary.registerOre("seedLentil", ItemRegistry.LentilSeedItem);
		OreDictionary.registerOre("seedMillet", ItemRegistry.MilletSeedItem);
		OreDictionary.registerOre("seedMulberry", ItemRegistry.MulberrySeedItem);
		OreDictionary.registerOre("seedQuinoa", ItemRegistry.QuinoaSeedItem);
		OreDictionary.registerOre("seedSisal", ItemRegistry.SisalSeedItem);
		OreDictionary.registerOre("seedTaro", ItemRegistry.TaroSeedItem);
		OreDictionary.registerOre("seedTomatillo", ItemRegistry.TomatilloSeedItem);
		OreDictionary.registerOre("seedAsparagus", ItemRegistry.asparagusseedItem);
		OreDictionary.registerOre("seedBarley", ItemRegistry.barleyseedItem);
		OreDictionary.registerOre("seedBean", ItemRegistry.beanseedItem);
		OreDictionary.registerOre("seedBeet", ItemRegistry.beetseedItem);
		OreDictionary.registerOre("seedBroccoli", ItemRegistry.broccoliseedItem);
		OreDictionary.registerOre("seedCauliflower", ItemRegistry.cauliflowerseedItem);
		OreDictionary.registerOre("seedCelery", ItemRegistry.celeryseedItem);
		OreDictionary.registerOre("seedCranberry", ItemRegistry.cranberryseedItem);
		OreDictionary.registerOre("seedGarlic", ItemRegistry.garlicseedItem);
		OreDictionary.registerOre("seedGinger", ItemRegistry.gingerseedItem);
		OreDictionary.registerOre("seedLeek", ItemRegistry.leekseedItem);
		OreDictionary.registerOre("seedLettuce", ItemRegistry.lettuceseedItem);
		OreDictionary.registerOre("seedOats", ItemRegistry.oatsseedItem);
		OreDictionary.registerOre("seedOnion", ItemRegistry.onionseedItem);
		OreDictionary.registerOre("seedParsnip", ItemRegistry.parsnipseedItem);
		OreDictionary.registerOre("seedPeanut", ItemRegistry.peanutseedItem);
		OreDictionary.registerOre("seedPineapple", ItemRegistry.pineappleseedItem);
		OreDictionary.registerOre("seedRadish", ItemRegistry.radishseedItem);
		OreDictionary.registerOre("seedRice", ItemRegistry.riceseedItem);
		OreDictionary.registerOre("seedRutabaga", ItemRegistry.rutabagaseedItem);
		OreDictionary.registerOre("seedRye", ItemRegistry.ryeseedItem);
		OreDictionary.registerOre("seedScallion", ItemRegistry.scallionseedItem);
		OreDictionary.registerOre("seedSoybean", ItemRegistry.soybeanseedItem);
		OreDictionary.registerOre("seedSpiceleaf", ItemRegistry.spiceleafseedItem);
		OreDictionary.registerOre("seedSweetpotato", ItemRegistry.sweetpotatoseedItem);
		OreDictionary.registerOre("seedTea", ItemRegistry.teaseedItem);
		OreDictionary.registerOre("seedTurnip", ItemRegistry.turnipseedItem);
		OreDictionary.registerOre("seedWhitemushroom", ItemRegistry.whitemushroomseedItem);

		OreDictionary.registerOre("seedArtichoke", ItemRegistry.artichokeseedItem);
		OreDictionary.registerOre("seedBellpepper", ItemRegistry.bellpepperseedItem);
		OreDictionary.registerOre("seedBlackberry", ItemRegistry.blackberryseedItem);
		OreDictionary.registerOre("seedBlueberry", ItemRegistry.blueberryseedItem);
		OreDictionary.registerOre("seedBrusselsprout", ItemRegistry.brusselsproutseedItem);
		OreDictionary.registerOre("seedCabbage", ItemRegistry.cabbageseedItem);
		OreDictionary.registerOre("seedCactusfruit", ItemRegistry.cactusfruitseedItem);
		OreDictionary.registerOre("seedCantaloupe", ItemRegistry.cantaloupeseedItem);
		OreDictionary.registerOre("seedChilipepper", ItemRegistry.chilipepperseedItem);
		OreDictionary.registerOre("seedCoffee", ItemRegistry.coffeeseedItem);
		OreDictionary.registerOre("seedCorn", ItemRegistry.cornseedItem);
		OreDictionary.registerOre("seedCucumber", ItemRegistry.cucumberseedItem);
		OreDictionary.registerOre("seedEggplant", ItemRegistry.eggplantseedItem);
		OreDictionary.registerOre("seedGrape", ItemRegistry.grapeseedItem);
		OreDictionary.registerOre("seedKiwi", ItemRegistry.kiwiseedItem);
		OreDictionary.registerOre("seedMustard", ItemRegistry.mustardseedItem);
		OreDictionary.registerOre("seedOkra", ItemRegistry.okraseedItem);
		OreDictionary.registerOre("seedPeas", ItemRegistry.peasseedItem);
		OreDictionary.registerOre("seedRaspberry", ItemRegistry.raspberryseedItem);
		OreDictionary.registerOre("seedRhubarb", ItemRegistry.rhubarbseedItem);
		OreDictionary.registerOre("seedSeaweed", ItemRegistry.seaweedseedItem);
		OreDictionary.registerOre("seedStrawberry", ItemRegistry.strawberryseedItem);
		OreDictionary.registerOre("seedTomato", ItemRegistry.tomatoseedItem);
		OreDictionary.registerOre("seedWintersquash", ItemRegistry.wintersquashseedItem);
		OreDictionary.registerOre("seedZucchini", ItemRegistry.zucchiniseedItem);
		OreDictionary.registerOre("seedBambooshoot", ItemRegistry.bambooshootseedItem);
		OreDictionary.registerOre("seedSpinach", ItemRegistry.spinachseedItem);
		OreDictionary.registerOre("seedCurryleaf", ItemRegistry.curryleafseedItem);
		OreDictionary.registerOre("seedSesameseed", ItemRegistry.sesameseedsseedItem);
		OreDictionary.registerOre("seedWaterchestnut", ItemRegistry.waterchestnutseedItem);
	}


	public static void RegisterTools()
	{
		OreDictionary.registerOre("toolPot", ItemRegistry.potItem);
		OreDictionary.registerOre("toolSkillet", ItemRegistry.skilletItem);
		OreDictionary.registerOre("toolSaucepan", ItemRegistry.saucepanItem);
		OreDictionary.registerOre("toolBakeware", ItemRegistry.bakewareItem);
		OreDictionary.registerOre("toolCuttingboard", ItemRegistry.cuttingboardItem);
		OreDictionary.registerOre("toolMortarandpestle", ItemRegistry.mortarandpestleItem);
		OreDictionary.registerOre("toolMixingbowl", ItemRegistry.mixingbowlItem);
		OreDictionary.registerOre("toolJuicer", ItemRegistry.juicerItem);
	}


	public static void GetAdditionalRegistry()
	{
		RegisterTools();

		OreDictionary.registerOre("cropCotton", ItemRegistry.cottonItem);
		OreDictionary.registerOre("seedCotton", ItemRegistry.cottonseedItem);
		OreDictionary.registerOre("materialCloth", ItemRegistry.wovencottonItem);

		OreDictionary.registerOre("cropCandle", ItemRegistry.candleberryItem);
		OreDictionary.registerOre("cropCandleberry", ItemRegistry.candleberryItem);
		OreDictionary.registerOre("seedCandleberry", ItemRegistry.candleberryseedItem);
		//OreDictionary.registerOre("materialPressedwax", ItemRegistry.waxItem);

		//OreDictionary.registerOre("grainBait", ItemRegistry.grainbaitItem);
		//OreDictionary.registerOre("veggieBait", ItemRegistry.veggiebaitItem);
		//OreDictionary.registerOre("fruitBait", ItemRegistry.fruitbaitItem);
		//OreDictionary.registerOre("fishtrapBait", ItemRegistry.fishtrapbaitItem);

		OreDictionary.registerOre("dustSalt", ItemRegistry.saltItem);
		OreDictionary.registerOre("itemSalt", ItemRegistry.saltItem);

		//OreDictionary.registerOre("beeQueen", ItemRegistry.queenbeeItem);
		//OreDictionary.registerOre("materialWaxcomb", ItemRegistry.waxcombItem);
		//OreDictionary.registerOre("materialHoneycomb", ItemRegistry.honeycombItem);
		OreDictionary.registerOre("foodHoneydrop", ItemRegistry.honeyItem);
		OreDictionary.registerOre("dropHoney", ItemRegistry.honeyItem);
		//OreDictionary.registerOre("materialPressedwax", ItemRegistry.beeswaxItem);
		//OreDictionary.registerOre("grubBee", ItemRegistry.grubItem);

		OreDictionary.registerOre("flowerRed", Blocks.red_flower);
		OreDictionary.registerOre("flowerYellow", Blocks.yellow_flower);
		OreDictionary.registerOre("blockTorch", Blocks.torch);

		OreDictionary.registerOre("logWood", BlockRegistry.pamMaple);
		OreDictionary.registerOre("logWood", BlockRegistry.pamPaperbark);
		OreDictionary.registerOre("logWood", BlockRegistry.pamCinnamon);
	}
}
