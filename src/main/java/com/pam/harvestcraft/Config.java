package com.pam.harvestcraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pam.harvestcraft.blocks.*;
import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Config 
{
	public static final Config instance = new Config();
	
	public static final String CATEGORY_CROPS = "crops";
	public static final String CATEGORY_GARDENS = "gardens";
	public static final String CATEGORY_FRUIT_TREES = "fruit trees";
	public static final String CATEGORY_SALT = "salt";
	public static final String CATEGORY_BEE = "beekeeping";
	public static final String CATEGORY_MARKET_SALES = "market sales";
	public static final String CATEGORY_MARKET_PRICES = "market prices";
	public static final String CATEGORY_MARKET_CURRENCY = "market currency";
	public static final String CATEGORY_CANDLES = "candles";
	public static final String CATEGORY_DIMENSIONS = "dimensions";
	public static final String CATEGORY_SEEDS = "seeds";
	public static final String CATEGORY_MISC_RECIPES = "miscellaneous recipes";

	private Map<String, String[]> dropConfig = new HashMap<String, String[]>();
	

	public void load(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		BlockRegistry.initBlocks(event, config);
		ItemRegistry.initItems(event, config);

		dropConfig.put("aridGarden", config.getStringList("aridGarden", "drops",
				new String[]{"harvestcraft:cactusfruitItem", "harvestcraft:AgaveItem", "harvestcraft:CassavaItem",
						"harvestcraft:ChickpeaItem", "harvestcraft:LentilItem", "harvestcraft:SisalItem"},
				"comment"));
		dropConfig.put("frostGarden", config.getStringList("frostGarden", "drops",
				new String[]{"harvestcraft:raspberryItem", "harvestcraft:oatsItem", "harvestcraft:ryeItem",
						"harvestcraft:celeryItem", "harvestcraft:peasItem", "harvestcraft:beetItem",
						"harvestcraft:rutabagaItem", "harvestcraft:broccoliItem", "harvestcraft:cauliflowerItem",
						"harvestcraft:cabbageItem", "harvestcraft:spinachItem", "harvestcraft:HuckleberryItem",
						"harvestcraft:JuniperberryItem", "harvestcraft:KohlrabiItem", "harvestcraft:QuinoaItem"},
				"comment"));
		dropConfig.put("shadedGarden", config.getStringList("shadedGarden", "drops",
				new String[]{"harvestcraft:whitemushroomItem", "harvestcraft:blackberryItem", "harvestcraft:zucchiniItem",
						"harvestcraft:radishItem", "harvestcraft:rhubarbItem", "harvestcraft:tealeafItem",
						"harvestcraft:garlicItem", "harvestcraft:sweetpotatoItem", "harvestcraft:turnipItem",
						"harvestcraft:spiceleafItem", "harvestcraft:beanItem", "harvestcraft:leekItem",
						"harvestcraft:scallionItem", "harvestcraft:tomatoItem", "harvestcraft:GigaPickleItem",
						"harvestcraft:JuteItem"},
				"comment"));
		dropConfig.put("soggyGarden", config.getStringList("soggyGarden", "drops",
				new String[]{"harvestcraft:brusselsproutItem", "harvestcraft:spiceleafItem", "harvestcraft:blueberryItem",
						"harvestcraft:asparagusItem", "harvestcraft:cranberryItem", "harvestcraft:riceItem",
						"harvestcraft:seaweedItem", "harvestcraft:waterchestnutItem", "harvestcraft:okraItem",
						"harvestcraft:GreenGrapeItem", "harvestcraft:JicamaItem", "harvestcraft:KaleItem",
						"harvestcraft:MilletItem", "harvestcraft:MulberryItem", "harvestcraft:TomatilloItem"},
				"comment"));
		dropConfig.put("tropicalGarden", config.getStringList("tropicalGarden", "drops",
				new String[]{"harvestcraft:grapeItem", "harvestcraft:pineappleItem", "harvestcraft:kiwiItem",
						"harvestcraft:sesameseedsItem", "harvestcraft:curryleafItem", "harvestcraft:bambooshootItem",
						"harvestcraft:cantaloupeItem", "harvestcraft:gingerItem", "harvestcraft:coffeebeanItem",
						"harvestcraft:soybeanItem", "harvestcraft:eggplantItem", "harvestcraft:ArrowrootItem",
						"harvestcraft:KenafItem", "harvestcraft:TaroItem"},
				"comment"));
		dropConfig.put("windyGarden", config.getStringList("windyGarden", "drops",
				new String[]{"harvestcraft:strawberryItem", "harvestcraft:barleyItem", "harvestcraft:cornItem",
						"harvestcraft:cucumberItem", "harvestcraft:wintersquashItem", "harvestcraft:mustardseedsItem",
						"harvestcraft:onionItem", "harvestcraft:parsnipItem", "harvestcraft:peanutItem",
						"minecraft:potato", "minecraft:carrot", "harvestcraft:lettuceItem",
						"harvestcraft:artichokeItem", "harvestcraft:bellpepperItem", "harvestcraft:chilipepperItem",
						"minecraft:wheat","harvestcraft:cottonItem", "harvestcraft:AmaranthItem", "harvestcraft:ElderberryItem",
						"harvestcraft:FlaxItem"},
				"comment"));

		if (config.hasChanged())
		{
			config.save();
		}
	}

	
	/**
	 * Configures drops from the various gardens; this needs to happen after the item registries are updated
     */
	public void configureGardenDrops() {
		final Pattern ITEM_STACK_PATTERN = Pattern.compile("(?:([0-9]+)x)?([\\w:]+)(?:[@:]([0-9]+))?");
		final Matcher ITEM_STACK_MATCHER = ITEM_STACK_PATTERN.matcher("");

		for(String garden : dropConfig.keySet()) {
			System.out.println("Registering drops for '" + garden + "'.");

			List<ItemStack> drops = new ArrayList<ItemStack>();
			String[] itemNames = dropConfig.get(garden);

			for(String baseItemName : itemNames) {
				ITEM_STACK_MATCHER.reset(baseItemName);
				if(ITEM_STACK_MATCHER.find()) {
					String itemName = ITEM_STACK_MATCHER.group(2);
					int metadata = 0;
					if(ITEM_STACK_MATCHER.group(3) != null) {
						metadata = Integer.parseInt(ITEM_STACK_MATCHER.group(3));
					}
					int stackSize = 1;
					if(ITEM_STACK_MATCHER.group(1) != null) {
						stackSize = Integer.parseInt(ITEM_STACK_MATCHER.group(1));
					}
					ItemStack drop = GameRegistry.makeItemStack(itemName, metadata, stackSize, null);

					// Check to make sure we got a valid item
					if(drop != null) {
						drops.add(drop);
					} else {
						// Otherwise, let the user know about it...
						System.err.println("Unable to find item '" + baseItemName + "' to add to this garden.");
					}
				}
			}

			BlockBaseGarden.drops.put(garden, drops);
		}
	}
}
