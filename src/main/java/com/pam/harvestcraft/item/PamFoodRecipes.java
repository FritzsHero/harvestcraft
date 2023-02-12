package com.pam.harvestcraft.item;
 
import java.util.List;

import com.pam.harvestcraft.blocks.BlockRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
 
 
 
public class PamFoodRecipes
{
     public static String[] cropName = { "cropAsparagus", "cropBarley", "cropBean", "cropBeet", "cropBroccoli", "cropCauliflower", "cropCelery", "cropCranberry", "cropGarlic", "cropGinger", "cropLeek", "cropLettuce", "cropOats", "cropOnion", "cropParsnip", "cropPeanut", "cropPineapple", "cropRadish", "cropRice", "cropRutabaga", "cropRye", "cropScallion", "cropSoybean", "cropSpiceleaf", "cropSweetpotato", "cropTea", "cropTurnip", "cropWhitemushroom", "cropArtichoke", "cropBellpepper", "cropBlackberry", "cropBlueberry", "cropBrusselsprout", "cropCabbage", "cropCactusfruit", "cropCandleberry", "cropCantaloupe", "cropChilipepper", "cropCoffee", "cropCorn", "cropCotton", "cropCucumber", "cropEggplant", "cropGrape", "cropKiwi", "cropMustard", "cropOkra", "cropPeas", "cropRaspberry", "cropRhubarb", "cropSeaweed", "cropStrawberry", "cropTomato", "cropWintersquash", "cropZucchini", "cropBambooshoot", "cropSpinach", "cropCurryleaf", "cropSesame", "cropWaterchestnut" };
   

     public static void getRecipes()
     {
          List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();


          AddSmelting();

          for (int i = 0; i < 9; i++)
          {
               recipeList.add(new ShapelessOreRecipe(BlockRegistry.PamTemperateSaplings[i], new Object[] { ItemRegistry.PamTemperateFruits[i], ItemRegistry.PamTemperateFruits[i], ItemRegistry.PamTemperateFruits[i], new ItemStack(Blocks.sapling, 1, 0) }));
          }
          for (int i = 0; i < 24; i++)
          {
               recipeList.add(new ShapelessOreRecipe(BlockRegistry.PamWarmSaplings[i], new Object[] { ItemRegistry.PamWarmFruits[i], ItemRegistry.PamWarmFruits[i], ItemRegistry.PamWarmFruits[i], new ItemStack(Blocks.sapling, 1, 3) }));
          }
     
          recipeList.add(new ShapelessOreRecipe(BlockRegistry.pamcinnamonSapling, new Object[] { ItemRegistry.cinnamonItem, ItemRegistry.cinnamonItem, ItemRegistry.cinnamonItem, new ItemStack(Blocks.sapling, 1, 3) }));
          recipeList.add(new ShapelessOreRecipe(BlockRegistry.pampaperbarkSapling, new Object[] { Items.paper, Items.paper, Items.paper, new ItemStack(Blocks.sapling, 1, 3) }));
          recipeList.add(new ShapelessOreRecipe(BlockRegistry.pammapleSapling, new Object[] { ItemRegistry.maplesyrupItem, ItemRegistry.maplesyrupItem, ItemRegistry.maplesyrupItem, new ItemStack(Blocks.sapling, 1, 1) }));
     
          if (ItemRegistry.enablecroptoseedRecipe)
          {
               for (int i = 0; i < 60; i++)
               {
                    if ((!BlockRegistry.enablecropspecialplanting) || ((ItemRegistry.PamCropItems[i] != ItemRegistry.cranberryItem) && (ItemRegistry.PamCropItems[i] != ItemRegistry.riceItem) && (ItemRegistry.PamCropItems[i] != ItemRegistry.seaweedItem)))
                    {
                         recipeList.add(new ShapelessOreRecipe(ItemRegistry.PamSeeds[i], new Object[] { ItemRegistry.PamCropItems[i] }));
                    }
               }
          }
          for (int i = 0; i < 60; i++)
          {
               recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.PamCropItems[i], 2), new Object[] { cropName[i], cropName[i] }));
          }
     
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.sunflowerseedsItem, 2, 0), new Object[] { new ItemStack(Blocks.double_plant, 1, 0), new ItemStack(Blocks.double_plant, 1, 0) }));
     
          if (ItemRegistry.isSaltFromWaterEnabled)
          {
               recipeList.add(new ShapelessOreRecipe(ItemRegistry.saltItem, new Object[] { "toolPot", "listAllwater" }));
          }
     
          //below was messing with the configurable water recipe
          //recipeList.add(new ShapelessOreRecipe(ItemRegistry.freshwaterItem, new Object[] { "listAllwater" }));
     
          recipeList.add(new ShapelessOreRecipe(Items.sugar, new Object[] { "toolPot", "foodHoneydrop" }));
          recipeList.add(new ShapelessOreRecipe(Items.sugar, new Object[] { "toolPot", "dropHoney" }));
     
          recipeList.add(new ShapelessOreRecipe(Items.fish, new Object[] { "listAllfishraw" }));
     
 
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.freshwaterItem, ItemRegistry.freshwaterfrombucket), new Object[] { Items.water_bucket }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.freshmilkItem, ItemRegistry.freshmilkfrombucket), new Object[] { Items.milk_bucket }));
          GameRegistry.addSmelting(ItemRegistry.freshwaterItem, new ItemStack(ItemRegistry.bubblywaterItem, 1, 0), 0.1F);
     
          recipeList.add(new ShapedOreRecipe(new ItemStack(Items.cake, 1), new Object[] { "AAA", "BEB", "CCC", Character.valueOf('A'), "listAllmilk", Character.valueOf('B'), "honeyEqualssugar", Character.valueOf('C'), "flourEqualswheat", Character.valueOf('E'), "listAllegg" }));
     
          recipeList.add(new ShapelessOreRecipe(Items.mushroom_stew, new Object[] { Items.bowl, "listAllmushroom", "listAllmushroom" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.silkentofuItem, new Object[] { "toolSaucepan", "cropSoybean" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.firmtofuItem, new Object[] { "toolSkillet", "foodSilkentofu" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.soymilkItem, new Object[] { "toolPot", "foodSilkentofu" }));

          recipeList.add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", Items.wheat }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropRice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", Items.potato }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropRye" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropOats" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropBarley" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pastaItem, new Object[] { "toolMixingbowl", "foodDough", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.heavycreamItem, new Object[] { "toolMixingbowl", "listAllmilk" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "itemSalt" }));
     
 
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "itemSalt" }));
     
 
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "foodSalt", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "dustSalt", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "itemSalt", Items.snowball }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grilledcheeseItem, new Object[] { "toolSkillet", "foodToast", "foodButter", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.applesauceItem, new Object[] { "toolPot", "cropApple" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.applejuiceItem, new Object[] { "toolJuicer", "cropApple" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.applepieItem, new Object[] { "toolBakeware", "cropApple", "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.caramelappleItem, new Object[] { "cropApple", "foodCaramel", "stickWood" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pumpkinbreadItem, new Object[] { "toolBakeware", Blocks.pumpkin, "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pumpkinsoupItem, new Object[] { "toolPot", Blocks.pumpkin, "listAllheavycream", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.melonjuiceItem, new Object[] { "toolJuicer", Items.melon }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.melonsmoothieItem, new Object[] { "toolJuicer", Items.melon, Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.carrotjuiceItem, new Object[] { "toolJuicer", Items.carrot }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.carrotcakeItem, new Object[] { "toolBakeware", Items.carrot, "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.carrotsoupItem, new Object[] { "toolPot", Items.carrot, "listAllheavycream", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.glazedcarrotsItem, new Object[] { "toolSaucepan", Items.carrot, "foodButter", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.butteredpotatoItem, new Object[] { Items.baked_potato, "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.loadedbakedpotatoItem, new Object[] { "foodButteredpotato", "listAllporkcooked", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.potatosaladItem, new Object[] { "toolCuttingboard", Items.baked_potato, "foodMayo" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "foodSalt", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "dustSalt", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "itemSalt", "foodStock" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grilledmushroomItem, new Object[] { "toolSkillet", "listAllmushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickensandwichItem, new Object[] { "toolSkillet", "listAllchickenraw", Items.bread, "foodMayo" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickennoodlesoupItem, new Object[] { "toolPot", "listAllchickenraw", Items.carrot, "foodPasta", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickenpotpieItem, new Object[] { "toolBakeware", "listAllchickenraw", Items.potato, Items.carrot, "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.breadedporkchopItem, new Object[] { "toolSkillet", "listAllporkraw", "foodFlour" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.hotdogItem, new Object[] { "toolPot", "listAllporkraw", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bakedhamItem, new Object[] { "toolBakeware", "listAllporkraw", "cropApple", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.hamburgerItem, new Object[] { "toolSkillet", "listAllbeefraw", "foodToast" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cheeseburgerItem, new Object[] { "foodHamburger", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.baconcheeseburgerItem, new Object[] { "foodCheeseburger", "listAllporkcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.potroastItem, new Object[] { "toolPot", "listAllbeefraw", Items.potato, Items.carrot, "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, new Object[] { "toolSkillet", "listAllfishraw", "foodMayo", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, new Object[] { "toolBakeware", "listAllfishraw", "foodFlour" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fishandchipsItem, new Object[] { "foodFishsticks", "foodFries" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mayoItem, new Object[] { "toolJuicer", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.friedeggItem, new Object[] { "toolSkillet", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.scrambledeggItem, new Object[] { "toolSaucepan", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.boiledeggItem, new Object[] { "toolPot", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.eggsaladItem, new Object[] { "toolCuttingboard", "foodBoiledegg", "foodMayo" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.caramelItem, new Object[] { "toolSaucepan", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spidereyesoupItem, new Object[] { "toolPot", Items.spider_eye, "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "foodSalt", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "dustSalt", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "itemSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "foodSalt", "dustSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cocoapowderItem, new Object[] { "toolMortarandpestle", new ItemStack(Items.dye, 1, 3) }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolatebarItem, new Object[] { "toolSaucepan", "foodCocoapowder", "foodButter", "listAllmilk" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.hotchocolateItem, new Object[] { "toolJuicer", "foodCocoapowder", "listAllmilk" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolateicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodCocoapowder" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", Items.bone }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", "listAllmeatraw" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", "listAllveggie" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fruitsaladItem, new Object[] { "toolCuttingboard", "listAllfruit", "listAllfruit" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spagettiItem, new Object[] { "toolSaucepan", "cropTomato", "foodPasta", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spagettiandmeatballsItem, new Object[] { "toolMixingbowl", "foodSpagetti", "listAllbeefcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.tomatosoupItem, new Object[] { "toolPot", "cropTomato", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.ketchupItem, new Object[] { "toolJuicer", "cropTomato" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickenparmasanItem, new Object[] { "toolBakeware", "listAllchickencooked", "cropTomato", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pizzaItem, new Object[] { "toolBakeware", "foodDough", "cropTomato", "foodCheese", "listAllporkraw" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", Items.carrot }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropOnion" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropRadish" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropCucumber" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropBellpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropZucchini" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropASparagus" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropBroccoli" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropPeas" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropTomato" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropSunflower" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropWalnut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropCauliflower" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropRhubarb" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.porklettucewrapItem, new Object[] { "toolCuttingboard", "cropLettuce", "listAllporkcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, new Object[] { "toolCuttingboard", "cropLettuce", "listAllfishcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bltItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropTomato", "listAllporkcooked", "foodToast" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.leafychickensandwichItem, new Object[] { "foodChickensandwich", "cropLettuce" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.leafyfishsandwichItem, new Object[] { "foodFishsandwich", "cropLettuce" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.deluxecheeseburgerItem, new Object[] { "foodCheeseburger", "cropLettuce", "cropTomato" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.delightedmealItem, new Object[] { "foodDeluxecheeseburger", "foodFries", "listAllsmoothie" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.delightedmealItem, new Object[] { "foodDeluxecheeseburger", "foodZucchinifries", "listAllsmoothie" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.onionsoupItem, new Object[] { "toolPot", "cropOnion", "foodStock", "foodGrilledcheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.potatocakesItem, new Object[] { "toolSkillet", "cropOnion", Items.potato, "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.hashItem, new Object[] { "toolSkillet", "cropOnion", "listAllbeefcooked", Items.potato, "foodKetchup" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.braisedonionsItem, new Object[] { "toolSaucepan", "cropOnion", "foodButter", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.heartybreakfastItem, new Object[] { "listAllporkcooked", "foodFriedegg", "foodToast", "foodPotatocakes", "listAlljuice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.heartybreakfastItem, new Object[] { "listAllporkcooked", "foodFriedegg", "foodToast", "foodPotatocakes", "foodChocolatemilk" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cornonthecobItem, new Object[] { "cropCorn", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cornmealItem, new Object[] { "toolMortarandpestle", "cropCorn" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cornbreadItem, new Object[] { "toolSkillet", "foodCornmeal", "listAllegg", "listAllmilk" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.tortillaItem, new Object[] { "toolSkillet", "foodCornmeal", "listAllwater" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.nachoesItem, new Object[] { "toolCuttingboard", "foodTortilla", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.tacoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodCheese", "foodTortilla" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, new Object[] { "toolCuttingboard", "listAllfishcooked", "cropLettuce", "foodCheese", "foodTortilla" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.creamedcornItem, new Object[] { "toolSaucepan", "cropCorn", "cropOnion", "foodHeavycream" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberrysmoothieItem, new Object[] { "toolJuicer", "cropStrawberry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberrypieItem, new Object[] { "toolBakeware", "cropStrawberry", "foodDough", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberrysaladItem, new Object[] { "cropStrawberry", "foodFruitsalad" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberryjuiceItem, new Object[] { "toolJuicer", "cropStrawberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolatestrawberryItem, new Object[] { "toolSaucepan", "cropStrawberry", "foodChocolatebar" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peanutbutterItem, new Object[] { "toolJuicer", "cropPeanut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.trailmixItem, new Object[] { "listAllseed", "listAllseed", "listAllseed", "listAllseed", "listAllseed", "listAllseed", "foodRaisins", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.trailmixItem, new Object[] { "foodSaltedsunflowerseeds", "foodRaisins", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.trailmixItem, new Object[] { "listAllnut", "listAllnut", "foodRaisins", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.trailmixItem, new Object[] { "foodRoastedpumpkinseeds", "foodRaisins", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pbandjItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGrapejelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peanutbuttercookiesItem, new Object[] { "toolBakeware", "listAllnutbutter", "foodFlour", "listAllegg", "listAllsugar" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapejuiceItem, new Object[] { "toolJuicer", "cropGrape" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vinegarItem, new Object[] { "toolPot", "foodGrapejuice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapejellyItem, new Object[] { "toolSaucepan", "cropGrape", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapesaladItem, new Object[] { "cropGrape", "foodFruitsalad" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raisincookiesItem, new Object[] { "toolBakeware", "foodFlour", "listAllegg", "listAllsugar", "foodRaisins" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "foodSalt", "foodVinegar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "dustSalt", "foodVinegar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "itemSalt", "foodVinegar" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cucumbersaladItem, new Object[] { "toolCuttingboard", "cropCucumber", "foodSpringsalad" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cucumbersoupItem, new Object[] { "toolPot", "cropCucumber", "foodStock", "listAllheavycream" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vegetarianlettucewrapItem, new Object[] { "toolCuttingboard", "cropCucumber", "cropLettuce", "cropTomato" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.marinatedcucumbersItem, new Object[] { "toolPot", "cropCucumber", "cropOnion", "listAllsugar", "foodVinegar" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.ricesoupItem, new Object[] { "toolPot", "cropRice", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.friedriceItem, new Object[] { "toolSkillet", "cropRice", Items.carrot, "listAllegg", "cropOnion" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mushroomrisottoItem, new Object[] { "toolBakeware", "cropRice", "listAllmushroom", "cropOnion", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "foodSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "dustSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "itemSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.rainbowcurryItem, new Object[] { "toolSkillet", "cropRice", "flowerRed", "flowerYellow", "flowerOrange", "flowerGreen", "flowerPurple", "flowerBlue" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.refriedbeansItem, new Object[] { "toolSkillet", "cropBean", "cropOnion", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bakedbeansItem, new Object[] { "toolPot", "cropBean", "listAllporkcooked", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropOnion", "listAllporkcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropBellpepper", "listAllporkcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropChilipepper", "listAllporkcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropOnion", "listAllbeefcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropBellpepper", "listAllbeefcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropChilipepper", "listAllbeefcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beanburritoItem, new Object[] { "toolSkillet", "cropBean", "foodTortilla", "cropRice", "foodCheese" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.stuffedpepperItem, new Object[] { "toolBakeware", "cropBellpepper", "cropTomato", "cropRice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "cropBean" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "cropChilipepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grilledskewersItem, new Object[] { "toolCuttingboard", "cropBellpepper", "cropOnion", Items.carrot, "stickWood" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.supremepizzaItem, new Object[] { "toolCuttingboard", "foodPizza", "cropBellpepper", "cropOnion", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.omeletItem, new Object[] { "toolSkillet", "listAllegg", "cropBellpepper", "cropOnion" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.hotwingsItem, new Object[] { "toolSkillet", "cropChilipepper", "listAllchickencooked", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chilipoppersItem, new Object[] { "toolBakeware", "cropChilipepper", "foodFlour", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.extremechiliItem, new Object[] { "foodChili", "cropChilipepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chilichocolateItem, new Object[] { "toolMixingbowl", "foodChocolatebar", "cropChilipepper" }));
     
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonaideItem, 1), new Object[] { "toolJuicer", "cropLemon" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonbarItem, 1), new Object[] { "toolBakeware", "cropLemon", "foodDough", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), new Object[] { "toolSkillet", "cropLemon", "foodFlour", "listAllfishraw", "foodMayo" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonsmoothieItem, 1), new Object[] { "toolJuicer", "cropLemon", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonmeringueItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllsugar", "foodDough", "listAllheavycream" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.candiedlemonItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonchickenItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllchickenraw", "foodButter" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blueberrysmoothieItem, new Object[] { "toolJuicer", "cropBlueberry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blueberrypieItem, new Object[] { "toolBakeware", "cropBlueberry", "foodDough", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blueberrymuffinItem, new Object[] { "toolBakeware", "cropBlueberry", "foodFlour", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blueberryjuiceItem, new Object[] { "toolJuicer", "cropBlueberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pancakesItem, new Object[] { "toolSkillet", "foodFlour", "listAllegg", "listAllmilk" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blueberrypancakesItem, new Object[] { "cropBlueberry", "foodPancakes" }));
     
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cherryjuiceItem, 1), new Object[] { "toolJuicer", "cropCherry" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cherrypieItem, 1), new Object[] { "toolBakeware", "cropCherry", "foodDough", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.chocolatecherryItem, 1), new Object[] { "toolSaucepan", "cropCherry", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cherrysmoothieItem, 1), new Object[] { "toolJuicer", "cropCherry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cheesecakeItem, 1), new Object[] { "toolBakeware", "foodFlour", "listAllheavycream", "listAllsugar", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cherrycheesecakeItem, 1), new Object[] { "cropCherry", "foodCheesecake" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.stuffedeggplantItem, new Object[] { "toolBakeware", "cropEggplant", "cropOnion", "cropBellpepper", "foodButter", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.stuffedeggplantItem, new Object[] { "toolBakeware", "cropEggplant", "cropGarlic" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.eggplantparmItem, new Object[] { "toolBakeware", "cropEggplant", "cropTomato", "foodPasta", "foodCheese" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raspberryicedteaItem, new Object[] { "cropTea", Items.snowball, "cropRaspberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chaiteaItem, new Object[] { "cropTea", "foodGroundcinnamon", "foodBlackpepper" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.espressoItem, new Object[] { "cropCoffee", "cropCoffee", "cropCoffee", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coffeeconlecheItem, new Object[] { "foodEspresso", "listAllmilk", "foodGroundcinnamon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mochaicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropCoffee", "foodCocoapowder" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beetsaladItem, new Object[] { "toolMixingbowl", "cropBeet", "cropLettuce", "foodVinegar", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beetsoupItem, new Object[] { "toolPot", "cropBeet", "cropOnion", "foodBlackpepper", "listAllmilk" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bakedbeetsItem, new Object[] { "toolBakeware", "cropBeet", "foodButter", "foodBlackpepper" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.broccolimacItem, new Object[] { "toolPot", "cropBroccoli", "foodPasta", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.broccolindipItem, new Object[] { "toolMixingbowl", "cropBroccoli", "cropOnion", "listAllheavycream" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.creamedbroccolisoupItem, new Object[] { "toolPot", "cropBroccoli", Items.carrot, "foodFlour", "foodBlackpepper", "foodStock" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sweetpotatopieItem, new Object[] { "toolBakeware", "cropSweetpotato", "foodDough", "foodGroundcinnamon", "foodMarshmellows" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.candiedsweetpotatoesItem, new Object[] { "toolSaucepan", "cropSweetpotato", "listAllsugar", "foodGroundcinnamon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mashedsweetpotatoesItem, new Object[] { "toolSaucepan", "cropSweetpotato", "foodButter" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.splitpeasoupItem, new Object[] { "toolPot", "cropPeas", "listAllporkcooked", "foodBlackpepper", "foodStock" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pineappleupsidedowncakeItem, new Object[] { "toolBakeware", "cropPineapple", "foodDough", "cropCherry", "cropWalnut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pineapplehamItem, new Object[] { "toolBakeware", "cropPineapple", "listAllporkraw", "cropCherry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pineappleyogurtItem, new Object[] { "cropPineapple", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.turnipsoupItem, new Object[] { "toolPot", "cropTurnip", Blocks.pumpkin, "foodButter", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropTurnip", Items.carrot, "cropOnion", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", Blocks.pumpkin, Items.carrot, "cropOnion", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", Items.potato, Items.carrot, "cropOnion", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropSweetpotato", Items.carrot, "cropOnion", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropRadish", Items.carrot, "cropOnion", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropParsnip", Items.carrot, "cropOnion", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "foodSalt", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "dustSalt", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "itemSalt", "foodBlackpepper" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gingerbreadItem, new Object[] { "toolBakeware", "cropGinger", "foodFlour", "foodButter", "listAllegg", "foodGroundcinnamon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gingersnapsItem, new Object[] { "toolBakeware", "cropGinger", "foodFlour", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.candiedgingerItem, new Object[] { "toolSaucepan", "cropGinger", "listAllsugar" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mustardItem, new Object[] { "toolJuicer", "cropMustard" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.softpretzelandmustardItem, new Object[] { "foodSoftpretzel", "foodMustard" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "cropGarlic" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropLettuce", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropBroccoli", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropPeas", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.garlicbreadItem, new Object[] { "cropGarlic", "foodToast", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.garlicmashedpotatoesItem, new Object[] { "foodMashedpotatoes", "cropGarlic" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.garlicchickenItem, new Object[] { "toolBakeware", "cropGarlic", "cropGarlic", "cropGarlic", "foodOliveoil", "listAllchickenraw" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.summerradishsaladItem, new Object[] { "toolMixingbowl", "cropRadish", "cropOnion", "cropCucumber", "foodVinegar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.summersquashwithradishItem, new Object[] { "toolMixingbowl", "cropRadish", "cropZucchini", Blocks.pumpkin, "cropSpiceleaf", "foodOliveoil" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.celeryandpeanutbutterItem, new Object[] { "cropCelery", "listAllnutbutter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peasandceleryItem, new Object[] { "toolMixingbowl", "cropCelery", "cropPeas", "cropLemon", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.celerysoupItem, new Object[] { "toolPot", "cropCelery", "cropOnion", Items.carrot, "foodStock" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zucchinibreadItem, new Object[] { "toolBakeware", "cropZucchini", "foodDough", "foodGroundcinnamon", "cropWalnut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zucchinifriesItem, new Object[] { "toolBakeware", "cropZucchini", "foodToast", "foodCheese", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zestyzucchiniItem, new Object[] { "toolBakeware", "cropZucchini", "foodPasta", "cropChilipepper", "cropGarlic", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zucchinibakeItem, new Object[] { "toolBakeware", "cropZucchini", "cropTomato", "foodToast", "cropCorn", "foodCheese" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.asparagusquicheItem, new Object[] { "toolSkillet", "cropAsparagus", "listAllegg", "cropOnion", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.asparagussoupItem, new Object[] { "toolPot", "cropAsparagus", "cropOnion", "foodButter", "foodStock" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.walnutraisinbreadItem, new Object[] { "toolBakeware", "cropWalnut", "foodRaisins", "foodDough", "foodGroundcinnamon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.candiedwalnutsItem, new Object[] { "toolSaucepan", "cropWalnut", "foodVanilla", "foodGroundcinnamon", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.brownieItem, new Object[] { "toolBakeware", "cropWalnut", "foodFlour", "listAllegg", "foodButter", "listAllsugar", "foodCocoapowder", "foodVanilla" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.papayajuiceItem, new Object[] { "toolJuicer", "cropPapaya" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.papayasmoothieItem, new Object[] { "toolJuicer", "cropPapaya", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.papayayogurtItem, new Object[] { "cropPapaya", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.starfruitjuiceItem, new Object[] { "toolJuicer", "cropStarfruit" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.starfruitsmoothieItem, new Object[] { "toolJuicer", "cropStarfruit", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.starfruityogurtItem, new Object[] { "cropStarfruit", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.guacamoleItem, new Object[] { "toolCuttingboard", "cropAvocado", "cropChilipepper", "cropTomato", "cropOnion", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.creamofavocadosoupItem, new Object[] { "toolPot", "cropAvocado", "listAllheavycream", "cropLime", "cropSpiceleaf", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.avocadoburritoItem, new Object[] { "toolCuttingboard", "cropAvocado", "foodTortilla", "foodCheese", "listAllchickencooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.avocadoburritoItem, new Object[] { "toolCuttingboard", "cropAvocado", "foodTortilla", "foodCheese", "listAllporkcooked" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.poachedpearItem, new Object[] { "toolSaucepan", "cropPear", "foodVanilla", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fruitcrumbleItem, new Object[] { "toolBakeware", "listAllfruit", "foodGroundcinnamon", "foodFlour", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pearyogurtItem, new Object[] { "cropPear", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.plumyogurtItem, new Object[] { "cropPlum", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bananasplitItem, new Object[] { "toolMixingbowl", "cropBanana", "foodCocoapowder", "cropCherry", "listAllicecream", "cropStrawberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bananasmoothieItem, new Object[] { "toolJuicer", "cropBanana", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bananayogurtItem, new Object[] { "cropBanana", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coconutmilkItem, new Object[] { "toolJuicer", "cropCoconut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickencurryItem, new Object[] { "toolPot", "cropCoconut", "foodPlainyogurt", "listAllchickenraw", "listAllspice", "cropChilipepper", "cropRice", "foodGroundcinnamon", "cropGarlic" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coconutshrimpItem, new Object[] { "toolSkillet", "cropCoconut", "listAllegg", "foodFlour", "foodShrimpraw", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coconutshrimpItem, new Object[] { "toolSkillet", "cropCoconut", "listAllegg", "foodFlour", "foodRawshrimp", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coconutyogurtItem, new Object[] { "cropCoconut", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.orangejuiceItem, new Object[] { "toolJuicer", "cropOrange" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.orangechickenItem, new Object[] { "toolSaucepan", "cropOrange", "listAllchickenraw", "listAllsugar", "cropRice", "cropBroccoli" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.orangesmoothieItem, new Object[] { "toolJuicer", "cropOrange", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.orangeyogurtItem, new Object[] { "cropOrange", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peachjuiceItem, new Object[] { "toolJuicer", "cropPeach" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peachcobblerItem, new Object[] { "toolBakeware", "cropPeach", "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peachsmoothieItem, new Object[] { "toolJuicer", "cropPeach", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peachyogurtItem, new Object[] { "cropPeach", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.limejuiceItem, new Object[] { "toolJuicer", "cropLime" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.keylimepieItem, new Object[] { "toolBakeware", "cropLime", "listAllheavycream", "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.limesmoothieItem, new Object[] { "toolJuicer", "cropLime", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.limeyogurtItem, new Object[] { "cropLime", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mangojuiceItem, new Object[] { "toolJuicer", "cropMango" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mangosmoothieItem, new Object[] { "toolJuicer", "cropMango", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mangoyogurtItem, new Object[] { "cropMango", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pomegranatejuiceItem, new Object[] { "toolJuicer", "cropPomegranate" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pomegranatesmoothieItem, new Object[] { "toolJuicer", "cropPomegranate", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pomegranateyogurtItem, new Object[] { "cropPomegranate", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vanillayogurtItem, new Object[] { "foodVanilla", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cinnamonrollItem, new Object[] { "toolBakeware", "foodGroundcinnamon", "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.frenchtoastItem, new Object[] { "toolSkillet", "foodGroundcinnamon", "foodToast", "listAllsugar", "listAllegg" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.marshmellowsItem, new Object[] { "toolPot", "listAllsugar", "listAllwater", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.donutItem, new Object[] { "toolPot", "foodDough", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolatedonutItem, new Object[] { "foodDonut", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.powdereddonutItem, new Object[] { "foodDonut", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.jellydonutItem, new Object[] { "foodDonut", "foodGrapejelly" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.frosteddonutItem, new Object[] { "foodDonut", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 11) }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cactussoupItem, new Object[] { "toolPot", Blocks.cactus, "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.wafflesItem, new Object[] { "toolSkillet", "foodFlour", "listAllegg", "listAllmilk", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.seedsoupItem, new Object[] { "toolPot", "listAllseed", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.jellybeansItem, new Object[] { "toolSaucepan", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11) }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.biscuitItem, new Object[] { "toolBakeware", "foodDough", "foodButter" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.creamcookieItem, new Object[] { "toolBakeware", "foodDough", "listAllheavycream", "listAllsugar", "foodCocoapowder" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.jaffaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "foodFlour", "foodChocolatebar", "cropOrange" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.friedchickenItem, new Object[] { "toolPot", "listAllchickenraw", "foodFlour", "cropSpiceleaf", "foodBlackpepper", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolatesprinklecakeItem, new Object[] { "toolBakeware", "foodCocoapowder", "listAllsugar", "foodDough", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 11) }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.redvelvetcakeItem, new Object[] { "toolBakeware", "listAllmilk", "foodFlour", "listAllheavycream", "listAllsugar", "listAllegg", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1) }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllbeefcooked", "cropLettuce", "cropTomato", "foodMayo" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllchickencooked", "cropLettuce", "cropTomato", "foodMayo" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllporkcooked", "cropLettuce", "cropTomato", "foodMayo" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blueberryyogurtItem, new Object[] { "cropBlueberry", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lemonyogurtItem, new Object[] { "cropLemon", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cherryyogurtItem, new Object[] { "cropCherry", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberryyogurtItem, new Object[] { "cropStrawberry", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapeyogurtItem, new Object[] { "cropGrape", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolateyogurtItem, new Object[] { "foodCocoapowder", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blackberryjuiceItem, new Object[] { "toolJuicer", "cropBlackberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blackberrycobblerItem, new Object[] { "cropBlackberry", "toolBakeware", "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blackberrysmoothieItem, new Object[] { "toolJuicer", "cropBlackberry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blackberryyogurtItem, new Object[] { "cropBlackberry", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolatemilkItem, new Object[] { "listAllmilk", "foodCocoapowder" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pumpkinyogurtItem, new Object[] { Blocks.pumpkin, "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raspberryjuiceItem, new Object[] { "toolJuicer", "cropRaspberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raspberrypieItem, new Object[] { "cropRaspberry", "toolBakeware", "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raspberrysmoothieItem, new Object[] { "toolJuicer", "cropRaspberry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raspberryyogurtItem, new Object[] { "cropRaspberry", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cinnamonsugardonutItem, new Object[] { "foodDonut", "listAllsugar", "foodGroundcinnamon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.melonyogurtItem, new Object[] { Items.melon, "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.kiwijuiceItem, new Object[] { "toolJuicer", "cropKiwi" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.kiwismoothieItem, new Object[] { "toolJuicer", "cropKiwi", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.kiwiyogurtItem, new Object[] { "cropKiwi", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.plainyogurtItem, 4, 0), new Object[] { "listAllmilk", Items.leather }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.appleyogurtItem, new Object[] { "cropApple", "foodPlainyogurt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "foodSalt", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "dustSalt", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "itemSalt", "foodOliveoil" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sunflowerbroccolisaladItem, new Object[] { "toolCuttingboard", "cropSunflower", "cropBroccoli", "foodMayo", "listAllsugar", "listAllporkcooked" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cranberryjuiceItem, new Object[] { "toolJuicer", "cropCranberry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cranberrysauceItem, new Object[] { "toolPot", "cropCranberry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cranberrybarItem, new Object[] { "toolBakeware", "cropCranberry", "listAllsugar", "foodDough" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peppermintItem, new Object[] { "toolSaucepan", "cropSpiceleaf", "listAllsugar" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cactusfruitjuiceItem, new Object[] { "toolJuicer", "cropCactusfruit" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blackpepperItem, new Object[] { "toolMortarandpestle", "cropPeppercorn" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.groundcinnamonItem, new Object[] { "toolMortarandpestle", "cropCinnamon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.groundnutmegItem, new Object[] { "toolMortarandpestle", "cropNutmeg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropOlive" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropSunflower" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropWalnut" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.baklavaItem, new Object[] { "toolBakeware", "foodDough", "cropWalnut", "cropCinnamon", "foodButter", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gummybearsItem, new Object[] { "toolSaucepan", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2) }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.baconmushroomburgerItem, new Object[] { "foodBaconcheeseburger", "listAllmushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.baconmushroomburgerItem, new Object[] { "foodBaconcheeseburger", "cropWhitemushroom" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fruitpunchItem, new Object[] { "toolJuicer", "listAllfruit", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.meatystewItem, new Object[] { "toolPot", "listAllmeatraw", "foodFlour", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mixedsaladItem, new Object[] { "toolCuttingboard", "listAllveggie", "listAllveggie", "foodSaladdressing" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pinacoladaItem, new Object[] { "toolJuicer", "cropCoconut", "cropPineapple" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "foodSalt", "foodVinegar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "dustSalt", "foodVinegar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "itemSalt", "foodVinegar" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodMayo", "cropSpiceleaf", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.shepardspieItem, new Object[] { "toolBakeware", "listAllmuttonraw", Items.potato, Items.carrot, "foodDough", "cropPeas" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.eggnogItem, new Object[] { "toolJuicer", "listAllegg", "foodGroundnutmeg", "cropCinnamon", "listAllheavycream" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.custardItem, new Object[] { "toolSaucepan", "listAllegg", "foodGroundnutmeg", "cropCinnamon", "listAllheavycream" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sushiItem, new Object[] { "toolCuttingboard", "listAllfishraw", "cropSeaweed", "cropRice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gardensoupItem, new Object[] { "toolPot", "foodStock", "listAllveggie", "listAllveggie" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.applejellyItem, new Object[] { "toolSaucepan", "cropApple", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blackberryjellyItem, new Object[] { "toolSaucepan", "cropBlackberry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blueberryjellyItem, new Object[] { "toolSaucepan", "cropBlueberry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cherryjellyItem, new Object[] { "toolSaucepan", "cropCherry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cranberryjellyItem, new Object[] { "toolSaucepan", "cropCranberry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.kiwijellyItem, new Object[] { "toolSaucepan", "cropKiwi", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lemonjellyItem, new Object[] { "toolSaucepan", "cropLemon", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.limejellyItem, new Object[] { "toolSaucepan", "cropLime", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mangojellyItem, new Object[] { "toolSaucepan", "cropMango", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.orangejellyItem, new Object[] { "toolSaucepan", "cropOrange", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.papayajellyItem, new Object[] { "toolSaucepan", "cropPapaya", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peachjellyItem, new Object[] { "toolSaucepan", "cropPeach", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pomegranatejellyItem, new Object[] { "toolSaucepan", "cropPomegranate", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raspberryjellyItem, new Object[] { "toolSaucepan", "cropRaspberry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.starfruitjellyItem, new Object[] { "toolSaucepan", "cropStarfruit", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberryjellyItem, new Object[] { "toolSaucepan", "cropStrawberry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.watermelonjellyItem, new Object[] { "toolSaucepan", Items.melon, Items.melon, "listAllsugar" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.applejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodApplejelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blackberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodBlackberryjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.blueberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodBlueberryjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cherryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodCherryjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cranberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodCranberryjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.kiwijellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodKiwijelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lemonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodLemonjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.limejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodLimejelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mangojellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodMangojelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.orangejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodOrangejelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.papayajellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPapayajelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peachjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPeachjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pomegranatejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPomegranatejelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raspberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodRaspberryjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.starfruitjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodStarfruitjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodStrawberryjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.watermelonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodWatermelonjelly", Items.bread }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cherrysodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodCherryjuice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.colasodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gingersodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropGinger" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodGrapejuice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lemonlimesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropLemon", "foodLimejuice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.orangesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodOrangejuice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.rootbeersodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropEdibleroot" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberrysodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodStrawberryjuice" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.caramelicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodCaramel" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mintchocolatechipicemcreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropSpiceleaf", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberryicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropStrawberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vanillaicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodVanilla" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.ediblerootItem, new Object[] { "toolCuttingboard", "cropSpiceleaf" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gingerchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropGinger", "cropScallion", "foodHoneydrop" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gingerchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropGinger", "cropScallion", "dropHoney" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.oldworldveggiesoupItem, new Object[] { "toolPot", "foodStock", "cropOnion", "cropPeas", "cropBarley" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spicebunItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "foodGroundnutmeg", "foodGroundcinnamon", "foodRaisins" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gingeredrhubarbtartItem, new Object[] { "toolBakeware", "foodDough", "cropRhubarb", "cropGinger", "listAllsugar", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lambbarleysoupItem, new Object[] { "toolPot", "foodStock", "listAllmuttonraw", "cropOnion", Items.carrot, "cropBarley" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.honeylemonlambItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropLemon", "foodMustard", "foodHoneydrop" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.honeylemonlambItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropLemon", "foodMustard", "dropHoney" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pumpkinoatsconesItem, new Object[] { "toolBakeware", "foodFlour", "cropOats", Blocks.pumpkin, "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.plumjuiceItem, new Object[] { "toolJuicer", "cropPlum" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pearjuiceItem, new Object[] { "toolJuicer", "cropPear" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.ovenroastedcauliflowerItem, new Object[] { "toolBakeware", "cropCauliflower", "foodOliveoil", "cropGarlic", "cropLemon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.leekbaconsoupItem, new Object[] { "toolPot", "cropLeek", "listAllporkcooked", Items.potato, "listAllheavycream" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.herbbutterparsnipsItem, new Object[] { "toolSaucepan", "cropParsnip", "foodButter", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.scallionbakedpotatoItem, new Object[] { Items.baked_potato, "cropScallion", "listAllheavycream" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bamboosteamedriceItem, new Object[] { "toolPot", "cropRice", "cropBambooshoot" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sweetpotatosouffleItem, new Object[] { "toolBakeware", "cropSweetpotato", "cropPecan", "foodDough", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cashewchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropCashew", "cropRice", "listAllpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.apricotjuiceItem, new Object[] { "toolJuicer", "cropApricot" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.apricotyogurtItem, new Object[] { "cropApricot", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.apricotglazedporkItem, new Object[] { "listAllporkcooked", "foodApricotjelly" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.apricotjellyItem, new Object[] { "toolSaucepan", "cropApricot", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.apricotjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodApricotjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.apricotsmoothieItem, new Object[] { "toolJuicer", "cropApricot", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.figbarItem, new Object[] { "toolBakeware", "cropFig", "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.figjellyItem, new Object[] { "toolSaucepan", "cropFig", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.figjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodFigjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.figsmoothieItem, new Object[] { "toolJuicer", "cropFig", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.figyogurtItem, new Object[] { "cropFig", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.figjuiceItem, new Object[] { "toolJuicer", "cropFig" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapefruitjuiceItem, new Object[] { "toolJuicer", "cropGrapefruit" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapefruitjellyItem, new Object[] { "toolSaucepan", "cropGrapefruit", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapefruitjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGrapefruitjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapefruitsmoothieItem, new Object[] { "toolJuicer", "cropGrapefruit", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapefruityogurtItem, new Object[] { "cropGrapefruit", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapefruitsodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodGrapefruitjuice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.citrussaladItem, new Object[] { "toolCuttingboard", "listAllcitrus", "cropLettuce" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pecanpieItem, new Object[] { "toolBakeware", "cropPecan", "foodDough", "listAllsugar", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pralinesItem, new Object[] { "toolSaucepan", "cropPecan", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.persimmonjuiceItem, new Object[] { "toolJuicer", "cropPersimmon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.persimmonyogurtItem, new Object[] { "cropPersimmon", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.persimmonsmoothieItem, new Object[] { "toolJuicer", "cropPersimmon", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.persimmonjellyItem, new Object[] { "toolSaucepan", "cropPersimmon", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.persimmonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPersimmonjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pistachiobakedsalmonItem, new Object[] { "toolBakeware", "cropPistachio", "foodSalmonraw" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.baconwrappeddatesItem, new Object[] { "toolBakeware", "cropDate", "listAllporkcooked" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.datenutbreadItem, new Object[] { "toolBakeware", "cropDate", "foodDough", "listAllnut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.maplesyruppancakesItem, new Object[] { "foodPancakes", "cropMaplesyrup" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.maplesyrupwafflesItem, new Object[] { "foodWaffles", "cropMaplesyrup" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.maplesausageItem, new Object[] { "listAllbeefraw", "cropSpiceleaf", "cropMaplesyrup" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mapleoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "cropMaplesyrup" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peachesandcreamoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "cropPeach", "listAllheavycream" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cinnamonappleoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "foodGroundcinnamon", "cropApple" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.maplecandiedbaconItem, new Object[] { "toolBakeware", "listAllporkcooked", "cropMaplesyrup" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.toastsandwichItem, new Object[] { "foodToast", "foodToast" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.potatoandcheesepirogiItem, new Object[] { "toolSkillet", "foodDough", "cropPotato", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.zeppoleItem, new Object[] { "toolPot", "foodOliveoil", "foodDough", "foodGroundcinnamon" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sausageinbreadItem, new Object[] { "foodMaplesausage", Items.bread, "foodKetchup", "cropOnion" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolatecaramelfudgeItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodCaramel" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lavendershortbreadItem, new Object[] { "toolBakeware", "dyePurple", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beefwellingtonItem, new Object[] { "listAllbeefraw", "foodDough", "listAllmushroom", "cropSpinach" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.epicbaconItem, new Object[] { "listAllporkcooked", "dyeRed", "dyeOrange", "dyeYellow", "dyeGreen", "dyeBlue", "dyePurple", "dyeMagenta" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.manjuuItem, new Object[] { "toolMixingbowl", "listAllsugar", "cropRice", "cropBean" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chickengumboItem, new Object[] { "toolPot", "cropOkra", "listAllchickenraw", "cropCelery", "cropOnion", "foodStock", "listAllspice", "cropBellpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.generaltsochickenItem, new Object[] { "toolSkillet", "listAllchickenraw", "cropBroccoli", "listAllsugar", "foodFlour", "cropChilipepper", "cropRice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.californiarollItem, new Object[] { "toolCuttingboard", "listAllfishraw", "cropAvocado", "cropCucumber", "cropSeaweed", "cropRice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.futomakiItem, new Object[] { "toolCuttingboard", "foodBoiledegg", "cropCucumber", "cropWintersquash", "cropRadish", "cropSeaweed", "cropGinger", "cropRice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beansontoastItem, new Object[] { "toolCuttingboard", "foodToast", "foodButter", "foodBakedbeans" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vegemiteItem, new Object[] { "toolPot", "listAllsugar", "cropBarley", "listAllwater", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.honeycombchocolatebarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "materialHoneycomb" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cherrycoconutchocolatebarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "cropCherry", "foodToastedcoconut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.fairybreadItem, new Object[] { "toolBakeware", Items.bread, "foodButter", "dyeRed", "dyeGreen", "dyeYellow" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lamingtonItem, new Object[] { "toolBakeware", "foodDough", "foodChocolatebar", "foodToastedcoconut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.timtamItem, new Object[] { "toolBakeware", "listAllsugar", "foodFlour", "listAllmilk", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.meatpieItem, new Object[] { "toolBakeware", "listAllbeefraw", "foodDough", "cropOnion", "cropGarlic", "foodBlackpepper", "foodStock" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chikorollItem, new Object[] { "toolPot", "foodOliveoil", "foodDough", "listAllchickencooked", "cropCarrot", "cropCabbage", "cropLeek", "cropOnion" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "foodSalt", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "oreSalt", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "dustSalt", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "itemSalt", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.beetburgerItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropBeet", "foodFriedegg", "listAllporkcooked", "cropPineapple", "foodToast" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pavlovaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropLemon", "listAllheavycream", "cropStrawberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pavlovaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropLemon", "listAllheavycream", "cropStrawberry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "foodSalt", "cropSpiceleaf", "cropCucumber" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "oreSalt", "cropSpiceleaf", "cropCucumber" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "dustSalt", "cropSpiceleaf", "cropCucumber" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "itemSalt", "cropSpiceleaf", "cropCucumber" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mcpamItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodPickles", "cropOnion", "foodToast", "foodSaladdressing" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mcpamItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodGherkin", "cropOnion", "foodToast", "foodSaladdressing" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.ceasarsaladItem, new Object[] { "toolMixingbowl", "cropLettuce", "foodToast", "foodCheese", "cropGarlic", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chaoscookieItem, new Object[] { "toolBakeware", "foodFlour", "foodChocolatebar", new ItemStack(Items.dye, 1, 5) }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolatebaconItem, new Object[] { "toolSaucepan", "listAllporkcooked", "foodChocolatebar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lambkebabItem, new Object[] { "toolCuttingboard", "listAllmuttoncooked", "cropOnion", "cropBellpepper", "stickWood" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.nutellaItem, new Object[] { "toolSaucepan", "foodChocolatebar", "foodGroundnutmeg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.snickersbarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "cropPeanut", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.spinachpieItem, new Object[] { "toolBakeware", "foodDough", "cropSpinach", "foodCheese", "foodToast" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.steamedspinachItem, new Object[] { "toolPot", "cropSpinach", "listAllwater" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vegemiteontoastItem, new Object[] { "toolCuttingboard", "foodVegemite", "foodToast" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.holidaycakeItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropCherry", "listAllheavycream", "cropSpiceleaf" }));
     
 
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.appleciderItem, new Object[] { "toolPot", "cropApple", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bangersandmashItem, new Object[] { "toolSkillet", "foodPorksausage", "foodMashedpotatoes" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.batteredsausageItem, new Object[] { "toolPot", "foodPorksausage", "foodBatter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.batterItem, new Object[] { "toolMixingbowl", "foodFlour", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "itemSalt" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coleslawItem, new Object[] { "toolMixingbowl", "cropCabbage", "cropCarrot", "foodMayo", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.energydrinkItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", Items.redstone }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.friedonionsItem, new Object[] { "toolPot", "cropOnion", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.meatfeastpizzaItem, new Object[] { "toolPot", "foodPizza", "foodPepperoni", "foodPorksausage", "listAllbeefcooked", Items.cooked_chicken }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mincepieItem, new Object[] { "toolBakeware", "listAllbeefcooked", "listAllfruit", "listAllnut", "foodDough", "foodButter" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.onionhamburgerItem, new Object[] { "toolCuttingboard", "foodHamburger", "foodFriedonions" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "itemSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "foodSalt", "foodVinegar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "dustSalt", "foodVinegar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "itemSalt", "foodVinegar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "dustSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "itemSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.raspberrytrifleItem, new Object[] { "toolBakeware", "cropRaspberry", "listAllheavycream", "foodVanilla", "foodDough" }));
     
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.pumpkincheesecakeItem, 1), new Object[] { Blocks.pumpkin, "foodCheesecake" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pumpkinmuffinItem, new Object[] { "toolBakeware", Blocks.pumpkin, "foodFlour", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.suaderoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.randomtacoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropOnion", "foodCheese", "cropAvocado", "listAllspice", "foodLimejuice", "foodTortilla" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.strawberrymilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropStrawberry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolatemilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "foodCocoapowder", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bananamilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropBanana", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cornflakesItem, new Object[] { "toolMixingbowl", "listAllmilk", "cropCorn" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coleslawburgerItem, new Object[] { "toolCuttingboard", "foodHamburger", "foodColeslaw" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.roastchickenItem, new Object[] { "toolBakeware", "listAllchickenraw", "foodSalt", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.roastpotatoesItem, new Object[] { "toolBakeware", "cropPotato", "foodSalt", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sundayroastItem, new Object[] { "toolBakeware", "foodRoastchicken", "foodRoastpotatoes", "listAllgreenveggie" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bbqpulledporkItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "foodToast", "cropTomato", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.lambwithmintsauceItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropSpiceleaf", "foodVinegar", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.steakandchipsItem, new Object[] { "toolSkillet", "listAllbeefraw", "foodFries" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cherryicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropCherry" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pistachioicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropPistachio" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.neapolitanicecreamItem, 3), new Object[] { "foodChocolateicecream", "foodStrawberryicecream", "foodVanillaicecream" }));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.spumoniicecreamItem, 3), new Object[] { "foodCherryicecream", "foodPistachioicecream", "foodVanillaicecream" }));
     
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.plainyogurtItem, 2), new Object[] { "foodPlainyogurt", "listAllmilk" }));
     
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.almondbutterItem, new Object[] { "toolJuicer", "cropAlmond" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cashewbutterItem, new Object[] { "toolJuicer", "cropCashew" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chestnutbutterItem, new Object[] { "toolJuicer", "cropChestnut" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cornishpastyItem, new Object[] { "toolBakeware", "listAllbeefraw", "cropPotato", "foodDough", "cropRutabaga", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cottagepieItem, new Object[] { "toolBakeware", "listAllbeefraw", "cropPotato", "cropCarrot", "foodDough", "cropPeas" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.croissantItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.currypowderItem, new Object[] { "toolMortarandpestle", "cropCurryleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.dimsumItem, new Object[] { "toolPot", "cropRice", "foodDough", "cropWaterchestnut", "listAllmushroom", "listAllmeatraw" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.friedpecanokraItem, new Object[] { "toolSkillet", "cropOkra", "cropPecan", "foodOliveoil", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gooseberryjellyItem, new Object[] { "toolSaucepan", "cropGooseberry", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gooseberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGooseberryjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gooseberrymilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropGooseberry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gooseberrypieItem, new Object[] { "toolBakeware", "cropGooseberry", "listAllsugar", "foodDough" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gooseberrysmoothieItem, new Object[] { "toolJuicer", "cropGooseberry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pineappleyogurtItem, new Object[] { "cropGooseberry", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.hamsweetpicklesandwichItem, new Object[] { "toolCuttingboard", "foodSweetpickle", Items.bread, "listAllporkcooked", "foodMayo" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.hushpuppiesItem, new Object[] { "toolPot", "foodCornmeal", "listAllegg", "cropOnion", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.kimchiItem, new Object[] { "toolPot", "foodSalt", "cropCabbage", "cropGarlic", "cropGinger", "cropRadish", "cropScallion", "listAllspice", "cropSesame" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mochiItem, new Object[] { "toolMortarandpPestle", "cropRice", "listAllsugar", "listAllwater" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.museliItem, new Object[] { "toolMixingbowl", "listAllgrain", "foodRaisins", "cropPecan", "listAllsugar", "listAllmilk" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.naanItem, new Object[] { "toolSkillet", "foodDough", "cropOnion", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.okrachipsItem, new Object[] { "toolBakeware", "cropOkra", "foodSalt", "cropSpiceleaf" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.okracreoleItem, new Object[] { "toolSkillet", "cropOkra", "cropGarlic", "cropTomato", "cropBellpepper", "cropOnion", "listAllspice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pistachiobutterItem, new Object[] { "toolJuicer", "cropPistachio" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.ploughmanslunchItem, new Object[] { "toolCuttingboard", Items.bread, "cropApple", "foodCheese", "foodSweetpickle", "cropOnion", "listAllporkcooked", "foodBoiledegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.porklomeinItem, new Object[] { "toolPot", "listAllporkraw", "foodPasta", "cropOnion", "cropCarrot", "cropCabbage", "cropGarlic", "foodSoysauce" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.salmonpattiesItem, new Object[] { "toolSkillet", "foodSalmonraw", "foodToast", "listAllegg", "foodOliveoil" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sausageItem, new Object[] { "toolCuttingboard", "listAllmeatraw", "foodSalt", "listAllspice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sausagerollItem, new Object[] { "toolCuttingboard", "foodSausage", "foodDough", "listAllegg" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sesameballItem, new Object[] { "toolPot", "cropSesame", "foodOliveoil", "cropBean", "listAllsugar", "foodFlour" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sesamesnapsItem, new Object[] { "toolSkillet", "cropSesame", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.shrimpokrahushpuppiesItem, new Object[] { "toolPot", "foodCornmeal", "listAllegg", "cropOnion", "foodOliveoil", "foodShrimpraw", "cropOkra" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.soysauceItem, new Object[] { "toolJuicer", "cropSoybean", "listAllwater", "foodSalt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.sweetpickleItem, new Object[] { "toolPot", "foodVinegar", "foodSalt", "cropSpiceleaf", "cropCucumber", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.veggiestripsItem, new Object[] { "toolBakeware", "listAllveggie", "listAllveggie", "listAllveggie", "foodSalt", "listAllspice" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.vindalooItem, new Object[] { "toolSaucepan", "listAllmeatraw", "foodCurrypowder", "foodButter", "foodBlackpepper", "cropOnion" }));

          recipeList.add(new ShapelessOreRecipe(ItemRegistry.applesmoothieItem, new Object[] { "toolJuicer", "cropApple", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cheeseontoastItem, new Object[] { "toolBakeware", "foodToast", "foodCheese" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.chocolaterollItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodFlour", "listAllheavycream"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coconutcreamItem, new Object[] { "toolPot", "cropCoconut"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.coconutsmoothieItem, new Object[] { "toolJuicer", "cropCoconut", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.crackerItem, new Object[] { "toolBakeware", "foodFlour", "foodOliveoil", "foodSalt", "listAllwater" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cranberrysmoothieItem, new Object[] { "toolJuicer", "cropCranberry", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.cranberryyogurtItem, new Object[] { "cropCranberry", "foodPlainyogurt" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.deluxechickencurryItem, new Object[] { "toolCuttingboard", "foodChickencurry", "cropRice", "foodNaan", "foodMangochutney"}));
          recipeList.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.garammasalaItem, 4), new Object[] { "toolMortarandpestle", "foodBlackpepper", "foodGroundcinnamon", "cropSpiceleaf", "foodGroundnutmeg"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.grapesmoothieItem, new Object[] { "toolJuicer", "cropGrape", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.gravyItem, new Object[] { "foodStock", "foodFlour"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.honeysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", ItemRegistry.honeyItem, Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.jamrollItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodFlour", "foodRaspberryjam"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.mangochutneyItem, new Object[] { "toolPot", "cropMango", "cropSpiceleaf", "cropMustard", "foodOliveoil"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.marzipanItem, new Object[] { "toolMortarandpestle", ItemRegistry.honeyItem, "cropAlmond"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.paneerItem, new Object[] { "toolPot", "listAllmilk", "foodVinegar", "foodLemonjuice"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.paneertikkamasalaItem, new Object[] { "toolSaucepan", "foodPaneer", "foodGarammasala", "foodCurrypowder", "foodCoconutcream", "cropOnion", "cropBellpepper", "cropTomato", "cropGinger", "cropGarlic"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.peaandhamsoupItem, new Object[] { "toolPot", "cropPeas", "listAllporkraw", "cropOnion", "cropCarrot", "cropCelery", "foodBlackpepper"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pearjellyItem, new Object[] { "toolSaucepan", "cropPear", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pearjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPearjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.pearsmoothieItem, new Object[] { "toolJuicer", "cropPear", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.plumjellyItem, new Object[] { "toolSaucepan", "cropPlum", "listAllsugar" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.plumjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPlumjelly", Items.bread }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.plumsmoothieItem, new Object[] { "toolJuicer", "cropPlum", Items.snowball }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.potatoandleeksoupItem, new Object[] { "toolPot", "cropPotato", "cropLeek", "foodStock", "listAllheavycream", "cropSpiceleaf", "foodBlackpepper"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.toadintheholeItem, new Object[] { "toolBakeware", "foodYorkshirepudding", "foodSausage"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.tunapotatoItem, new Object[] { "toolCuttingboard", "foodButteredpotato", "cropCorn", "listAllfishcooked"}));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.yorkshirepuddingItem, new Object[] { "toolBakeware", "foodFlour", "foodSalt", "foodStock", "listAllegg", "listAllmilk"}));
	
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.schnitzelItem, new Object[] { "toolSkillet", "listAllporkraw", "foodFlour", "cropLemon", "foodOliveoil", "foodBlackpepper" }));
          recipeList.add(new ShapelessOreRecipe(ItemRegistry.bratwurstItem, new Object[] { "toolCuttingboard", "foodPorksausage", "foodPickles", "cropOnion", Items.bread }));
     }


     private static void AddSmelting()
     {
          GameRegistry.addSmelting(ItemRegistry.doughItem, new ItemStack(Items.bread, 1, 0), 0.1F);
          GameRegistry.addSmelting(Items.bread, new ItemStack(ItemRegistry.toastItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(Items.pumpkin_seeds, new ItemStack(ItemRegistry.roastedpumpkinseedsItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(Blocks.brown_mushroom, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(Blocks.red_mushroom, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
     
          //GameRegistry.addSmelting(ItemRegistry.muttonrawItem, new ItemStack(ItemRegistry.muttoncookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.calamarirawItem, new ItemStack(ItemRegistry.calamaricookedItem, 1, 0), 0.1F);
     
          GameRegistry.addSmelting(ItemRegistry.asparagusItem, new ItemStack(ItemRegistry.grilledasparagusItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.riceItem, new ItemStack(ItemRegistry.ricecakeItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.tealeafItem, new ItemStack(ItemRegistry.teaItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.cornItem, new ItemStack(ItemRegistry.popcornItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.sweetpotatoItem, new ItemStack(ItemRegistry.bakedsweetpotatoItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.coffeebeanItem, new ItemStack(ItemRegistry.coffeeItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.eggplantItem, new ItemStack(ItemRegistry.grilledeggplantItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.grapeItem, new ItemStack(ItemRegistry.raisinsItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.whitemushroomItem, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.coconutItem, new ItemStack(ItemRegistry.toastedcoconutItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.vanillabeanItem, new ItemStack(ItemRegistry.vanillaItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.chestnutItem, new ItemStack(ItemRegistry.roastedchestnutItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.sesameseedsItem, new ItemStack(ItemRegistry.toastedsesameseedsItem, 1, 0), 0.1F);
     
          GameRegistry.addSmelting(ItemRegistry.anchovyrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.bassrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.carprawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.catfishrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.charrrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.eelrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.grouperrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.herringrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.mudfishrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.perchrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.snapperrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.tilapiarawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.troutrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.tunarawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.walleyerawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
     
 
          GameRegistry.addSmelting(ItemRegistry.clamrawItem, new ItemStack(ItemRegistry.clamcookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.crabrawItem, new ItemStack(ItemRegistry.crabcookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.crayfishrawItem, new ItemStack(ItemRegistry.crayfishcookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.frograwItem, new ItemStack(ItemRegistry.frogcookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.octopusrawItem, new ItemStack(ItemRegistry.octopuscookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.scalloprawItem, new ItemStack(ItemRegistry.scallopcookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.shrimprawItem, new ItemStack(ItemRegistry.shrimpcookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.snailrawItem, new ItemStack(ItemRegistry.snailcookedItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(ItemRegistry.turtlerawItem, new ItemStack(ItemRegistry.turtlecookedItem, 1, 0), 0.1F);
     }
}
