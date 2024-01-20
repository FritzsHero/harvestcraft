package com.pam.harvestcraft.item;
 
import java.util.List;

import com.pam.harvestcraft.blocks.BlockRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;


public class FoodRecipes
{
     private static List<IRecipe> recipeList;


     public static void getRecipes()
     {
          recipeList = CraftingManager.getInstance().getRecipeList();


          RegisterSmelting();

          for (int i = 0; i < 9; i++)
          {
               AddRecipe(BlockRegistry.PamTemperateSaplings[i], new Object[] { ItemRegistry.PamTemperateFruits[i], ItemRegistry.PamTemperateFruits[i], ItemRegistry.PamTemperateFruits[i], new ItemStack(Blocks.sapling, 1, 0) });
          }
          for (int i = 0; i < 24; i++)
          {
               AddRecipe(BlockRegistry.PamWarmSaplings[i], new Object[] { ItemRegistry.PamWarmFruits[i], ItemRegistry.PamWarmFruits[i], ItemRegistry.PamWarmFruits[i], new ItemStack(Blocks.sapling, 1, 3) });
          }
     
          AddRecipe(BlockRegistry.pamcinnamonSapling, new Object[] { ItemRegistry.cinnamonItem, ItemRegistry.cinnamonItem, ItemRegistry.cinnamonItem, new ItemStack(Blocks.sapling, 1, 3) });
          AddRecipe(BlockRegistry.pampaperbarkSapling, new Object[] { Items.paper, Items.paper, Items.paper, new ItemStack(Blocks.sapling, 1, 3) });
          AddRecipe(BlockRegistry.pammapleSapling, new Object[] { ItemRegistry.maplesyrupItem, ItemRegistry.maplesyrupItem, ItemRegistry.maplesyrupItem, new ItemStack(Blocks.sapling, 1, 1) });
     
          if (ItemRegistry.enablecroptoseedRecipe)
          {
               for (int i = 0; i < ItemRegistry.PamCropItems.length; i++)
               {
                    if ((!BlockRegistry.enablecropspecialplanting) || ((ItemRegistry.PamCropItems[i] != ItemRegistry.cranberryItem) && (ItemRegistry.PamCropItems[i] != ItemRegistry.riceItem) && (ItemRegistry.PamCropItems[i] != ItemRegistry.seaweedItem)))
                    {
                         AddRecipe(ItemRegistry.PamSeeds[i], new Object[] { ItemRegistry.PamCropItems[i] });
                    }
               }
          }
     
          AddRecipe(new ItemStack(ItemRegistry.sunflowerseedsItem, 2, 0), new Object[] { new ItemStack(Blocks.double_plant, 1, 0), new ItemStack(Blocks.double_plant, 1, 0) });
     
          if (ItemRegistry.isSaltFromWaterEnabled)
          {
               AddRecipe(ItemRegistry.saltItem, new Object[] { "toolPot", "listAllwater" });
          }
     
          AddRecipe(Items.sugar, new Object[] { "toolPot", "foodHoneydrop" });
          AddRecipe(Items.sugar, new Object[] { "toolPot", "dropHoney" });
     
          AddRecipe(Items.fish, new Object[] { "listAllfishraw" });
     
 
          AddRecipe(new ItemStack(ItemRegistry.freshwaterItem, ItemRegistry.amountFreshWaterFromBucket), new Object[] { Items.water_bucket });
          AddRecipe(new ItemStack(ItemRegistry.freshmilkItem, ItemRegistry.amountFreshMilkFromBucket), new Object[] { Items.milk_bucket });
          AddSmelting(ItemRegistry.freshwaterItem, ItemRegistry.bubblywaterItem);
     
          AddRecipe(new ItemStack(Items.cake, 1), new Object[] { "AAA", "BEB", "CCC", Character.valueOf('A'), "listAllmilk", Character.valueOf('B'), "honeyEqualssugar", Character.valueOf('C'), "flourEqualswheat", Character.valueOf('E'), "listAllegg" });
     
          AddRecipe(Items.mushroom_stew, new Object[] { Items.bowl, "listAllmushroom", "listAllmushroom" });
     
          AddRecipe(ItemRegistry.silkentofuItem, new Object[] { "toolSaucepan", "cropSoybean" });
          AddRecipe(ItemRegistry.firmtofuItem, new Object[] { "toolSkillet", "foodSilkentofu" });
          AddRecipe(ItemRegistry.soymilkItem, new Object[] { "toolPot", "foodSilkentofu" });

          AddRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", Items.wheat });
          AddRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropRice" });
          AddRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", Items.potato });
          AddRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropRye" });
          AddRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropOats" });
          AddRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropBarley" });
          AddRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "foodSalt" });
          AddRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "dustSalt" });
          AddRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "itemSalt" });
     
          AddRecipe(ItemRegistry.pastaItem, new Object[] { "toolMixingbowl", "foodDough", "foodButter" });
          AddRecipe(ItemRegistry.heavycreamItem, new Object[] { "toolMixingbowl", "listAllmilk" });
          AddRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "foodSalt" });
          AddRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "dustSalt" });
          AddRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "itemSalt" });
     
 
          AddRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "foodSalt" });
          AddRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "dustSalt" });
          AddRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "itemSalt" });
     
 
          AddRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "foodSalt", Items.snowball });
          AddRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "dustSalt", Items.snowball });
          AddRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "itemSalt", Items.snowball });
     
          AddRecipe(ItemRegistry.grilledcheeseItem, new Object[] { "toolSkillet", "foodToast", "foodButter", "foodCheese" });
          AddRecipe(ItemRegistry.applesauceItem, new Object[] { "toolPot", "cropApple" });
          AddRecipe(ItemRegistry.applejuiceItem, new Object[] { "toolJuicer", "cropApple" });
          AddRecipe(ItemRegistry.applepieItem, new Object[] { "toolBakeware", "cropApple", "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.caramelappleItem, new Object[] { "cropApple", "foodCaramel", "stickWood" });
          AddRecipe(ItemRegistry.pumpkinbreadItem, new Object[] { "toolBakeware", Blocks.pumpkin, "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.pumpkinsoupItem, new Object[] { "toolPot", Blocks.pumpkin, "listAllheavycream", "foodStock" });
          AddRecipe(ItemRegistry.melonjuiceItem, new Object[] { "toolJuicer", Items.melon });
          AddRecipe(ItemRegistry.melonsmoothieItem, new Object[] { "toolJuicer", Items.melon, Items.snowball });
          AddRecipe(ItemRegistry.carrotjuiceItem, new Object[] { "toolJuicer", Items.carrot });
          AddRecipe(ItemRegistry.carrotcakeItem, new Object[] { "toolBakeware", Items.carrot, "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.carrotsoupItem, new Object[] { "toolPot", Items.carrot, "listAllheavycream", "foodStock" });
          AddRecipe(ItemRegistry.glazedcarrotsItem, new Object[] { "toolSaucepan", Items.carrot, "foodButter", "listAllsugar" });
          AddRecipe(ItemRegistry.butteredpotatoItem, new Object[] { Items.baked_potato, "foodButter" });
          AddRecipe(ItemRegistry.loadedbakedpotatoItem, new Object[] { "foodButteredpotato", "listAllporkcooked", "foodCheese" });
          AddRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "foodSalt" });
          AddRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "dustSalt" });
          AddRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "itemSalt" });
     
          AddRecipe(ItemRegistry.potatosaladItem, new Object[] { "toolCuttingboard", Items.baked_potato, "foodMayo" });
          AddRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "foodSalt", "foodStock" });
          AddRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "dustSalt", "foodStock" });
          AddRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "itemSalt", "foodStock" });
     
          AddRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "foodSalt" });
          AddRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "dustSalt" });
          AddRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "itemSalt" });
     
          AddRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" });
          AddRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" });
          AddRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" });
          AddRecipe(ItemRegistry.grilledmushroomItem, new Object[] { "toolSkillet", "listAllmushroom" });
          AddRecipe(ItemRegistry.chickensandwichItem, new Object[] { "toolSkillet", "listAllchickenraw", Items.bread, "foodMayo" });
          AddRecipe(ItemRegistry.chickennoodlesoupItem, new Object[] { "toolPot", "listAllchickenraw", Items.carrot, "foodPasta", "foodStock" });
          AddRecipe(ItemRegistry.chickenpotpieItem, new Object[] { "toolBakeware", "listAllchickenraw", Items.potato, Items.carrot, "foodDough" });
          AddRecipe(ItemRegistry.breadedporkchopItem, new Object[] { "toolSkillet", "listAllporkraw", "foodFlour" });
          AddRecipe(ItemRegistry.hotdogItem, new Object[] { "toolPot", "listAllporkraw", Items.bread });
          AddRecipe(ItemRegistry.bakedhamItem, new Object[] { "toolBakeware", "listAllporkraw", "cropApple", "listAllsugar" });
          AddRecipe(ItemRegistry.hamburgerItem, new Object[] { "toolSkillet", "listAllbeefraw", "foodToast" });
          AddRecipe(ItemRegistry.cheeseburgerItem, new Object[] { "foodHamburger", "foodCheese" });
          AddRecipe(ItemRegistry.baconcheeseburgerItem, new Object[] { "foodCheeseburger", "listAllporkcooked" });
          AddRecipe(ItemRegistry.potroastItem, new Object[] { "toolPot", "listAllbeefraw", Items.potato, Items.carrot, "foodStock" });
          AddRecipe(ItemRegistry.fishsandwichItem, new Object[] { "toolSkillet", "listAllfishraw", "foodMayo", Items.bread });
          AddRecipe(ItemRegistry.fishsticksItem, new Object[] { "toolBakeware", "listAllfishraw", "foodFlour" });
          AddRecipe(ItemRegistry.fishandchipsItem, new Object[] { "foodFishsticks", "foodFries" });
          AddRecipe(ItemRegistry.mayoItem, new Object[] { "toolJuicer", "listAllegg" });
          AddRecipe(ItemRegistry.friedeggItem, new Object[] { "toolSkillet", "listAllegg" });
          AddRecipe(ItemRegistry.scrambledeggItem, new Object[] { "toolSaucepan", "listAllegg" });
          AddRecipe(ItemRegistry.boiledeggItem, new Object[] { "toolPot", "listAllegg" });
          AddRecipe(ItemRegistry.eggsaladItem, new Object[] { "toolCuttingboard", "foodBoiledegg", "foodMayo" });
          AddRecipe(ItemRegistry.caramelItem, new Object[] { "toolSaucepan", "listAllsugar" });
          AddRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "foodSalt" });
          AddRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "dustSalt" });
          AddRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "itemSalt" });
     
          AddRecipe(ItemRegistry.spidereyesoupItem, new Object[] { "toolPot", Items.spider_eye, "foodStock" });
          AddRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "foodSalt", "foodSalt" });
          AddRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "dustSalt", "dustSalt" });
          AddRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "itemSalt" });
          AddRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "dustSalt" });
          AddRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "foodSalt" });
          AddRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "foodSalt", "dustSalt" });
     
          AddRecipe(ItemRegistry.cocoapowderItem, new Object[] { "toolMortarandpestle", new ItemStack(Items.dye, 1, 3) });
          AddRecipe(ItemRegistry.chocolatebarItem, new Object[] { "toolSaucepan", "foodCocoapowder", "foodButter", "listAllmilk" });
          AddRecipe(ItemRegistry.hotchocolateItem, new Object[] { "toolJuicer", "foodCocoapowder", "listAllmilk" });
          AddRecipe(ItemRegistry.chocolateicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodCocoapowder" });
          AddRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" });
          AddRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" });
          AddRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" });
          AddRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", Items.bone });
          AddRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", "listAllmeatraw" });
          AddRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", "listAllveggie" });
          AddRecipe(ItemRegistry.fruitsaladItem, new Object[] { "toolCuttingboard", "listAllfruit", "listAllfruit" });
     
          AddRecipe(ItemRegistry.spagettiItem, new Object[] { "toolSaucepan", "cropTomato", "foodPasta", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.spagettiandmeatballsItem, new Object[] { "toolMixingbowl", "foodSpagetti", "listAllbeefcooked" });
          AddRecipe(ItemRegistry.tomatosoupItem, new Object[] { "toolPot", "cropTomato", "foodStock" });
          AddRecipe(ItemRegistry.ketchupItem, new Object[] { "toolJuicer", "cropTomato" });
          AddRecipe(ItemRegistry.chickenparmasanItem, new Object[] { "toolBakeware", "listAllchickencooked", "cropTomato", "foodCheese" });
          AddRecipe(ItemRegistry.pizzaItem, new Object[] { "toolBakeware", "foodDough", "cropTomato", "foodCheese", "listAllporkraw" });
     
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", Items.carrot });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropOnion" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropRadish" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropCucumber" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropBellpepper" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropZucchini" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropASparagus" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropBroccoli" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropPeas" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropTomato" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropSunflower" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropWalnut" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropCauliflower" });
          AddRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropRhubarb" });
          AddRecipe(ItemRegistry.porklettucewrapItem, new Object[] { "toolCuttingboard", "cropLettuce", "listAllporkcooked" });
          AddRecipe(ItemRegistry.fishlettucewrapItem, new Object[] { "toolCuttingboard", "cropLettuce", "listAllfishcooked" });
          AddRecipe(ItemRegistry.bltItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropTomato", "listAllporkcooked", "foodToast" });
          AddRecipe(ItemRegistry.leafychickensandwichItem, new Object[] { "foodChickensandwich", "cropLettuce" });
          AddRecipe(ItemRegistry.leafyfishsandwichItem, new Object[] { "foodFishsandwich", "cropLettuce" });
          AddRecipe(ItemRegistry.deluxecheeseburgerItem, new Object[] { "foodCheeseburger", "cropLettuce", "cropTomato" });
          AddRecipe(ItemRegistry.delightedmealItem, new Object[] { "foodDeluxecheeseburger", "foodFries", "listAllsmoothie" });
          AddRecipe(ItemRegistry.delightedmealItem, new Object[] { "foodDeluxecheeseburger", "foodZucchinifries", "listAllsmoothie" });
     
          AddRecipe(ItemRegistry.onionsoupItem, new Object[] { "toolPot", "cropOnion", "foodStock", "foodGrilledcheese" });
          AddRecipe(ItemRegistry.potatocakesItem, new Object[] { "toolSkillet", "cropOnion", Items.potato, "foodButter" });
          AddRecipe(ItemRegistry.hashItem, new Object[] { "toolSkillet", "cropOnion", "listAllbeefcooked", Items.potato, "foodKetchup" });
          AddRecipe(ItemRegistry.braisedonionsItem, new Object[] { "toolSaucepan", "cropOnion", "foodButter", "foodStock" });
          AddRecipe(ItemRegistry.heartybreakfastItem, new Object[] { "listAllporkcooked", "foodFriedegg", "foodToast", "foodPotatocakes", "listAlljuice" });
          AddRecipe(ItemRegistry.heartybreakfastItem, new Object[] { "listAllporkcooked", "foodFriedegg", "foodToast", "foodPotatocakes", "foodChocolatemilk" });
     
          AddRecipe(ItemRegistry.cornonthecobItem, new Object[] { "cropCorn", "foodButter" });
          AddRecipe(ItemRegistry.cornmealItem, new Object[] { "toolMortarandpestle", "cropCorn" });
          AddRecipe(ItemRegistry.cornbreadItem, new Object[] { "toolSkillet", "foodCornmeal", "listAllegg", "listAllmilk" });
          AddRecipe(ItemRegistry.tortillaItem, new Object[] { "toolSkillet", "foodCornmeal", "listAllwater" });
          AddRecipe(ItemRegistry.nachoesItem, new Object[] { "toolCuttingboard", "foodTortilla", "foodCheese" });
          AddRecipe(ItemRegistry.tacoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodCheese", "foodTortilla" });
          AddRecipe(ItemRegistry.fishtacoItem, new Object[] { "toolCuttingboard", "listAllfishcooked", "cropLettuce", "foodCheese", "foodTortilla" });
          AddRecipe(ItemRegistry.creamedcornItem, new Object[] { "toolSaucepan", "cropCorn", "cropOnion", "foodHeavycream" });
     
          AddRecipe(ItemRegistry.strawberrysmoothieItem, new Object[] { "toolJuicer", "cropStrawberry", Items.snowball });
          AddRecipe(ItemRegistry.strawberrypieItem, new Object[] { "toolBakeware", "cropStrawberry", "foodDough", "listAllsugar" });
          AddRecipe(ItemRegistry.strawberrysaladItem, new Object[] { "cropStrawberry", "foodFruitsalad" });
          AddRecipe(ItemRegistry.strawberryjuiceItem, new Object[] { "toolJuicer", "cropStrawberry" });
          AddRecipe(ItemRegistry.chocolatestrawberryItem, new Object[] { "toolSaucepan", "cropStrawberry", "foodChocolatebar" });
     
          AddRecipe(ItemRegistry.peanutbutterItem, new Object[] { "toolJuicer", "cropPeanut" });
          AddRecipe(ItemRegistry.trailmixItem, new Object[] { "listAllseed", "listAllseed", "listAllseed", "listAllseed", "listAllseed", "listAllseed", "foodRaisins", "foodChocolatebar" });
          AddRecipe(ItemRegistry.trailmixItem, new Object[] { "foodSaltedsunflowerseeds", "foodRaisins", "foodChocolatebar" });
          AddRecipe(ItemRegistry.trailmixItem, new Object[] { "listAllnut", "listAllnut", "foodRaisins", "foodChocolatebar" });
          AddRecipe(ItemRegistry.trailmixItem, new Object[] { "foodRoastedpumpkinseeds", "foodRaisins", "foodChocolatebar" });
          AddRecipe(ItemRegistry.pbandjItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGrapejelly", Items.bread });
          AddRecipe(ItemRegistry.peanutbuttercookiesItem, new Object[] { "toolBakeware", "listAllnutbutter", "foodFlour", "listAllegg", "listAllsugar" });
     
          AddRecipe(ItemRegistry.grapejuiceItem, new Object[] { "toolJuicer", "cropGrape" });
          AddRecipe(ItemRegistry.vinegarItem, new Object[] { "toolPot", "foodGrapejuice" });
          AddRecipe(ItemRegistry.grapejellyItem, new Object[] { "toolSaucepan", "cropGrape", "listAllsugar" });
          AddRecipe(ItemRegistry.grapesaladItem, new Object[] { "cropGrape", "foodFruitsalad" });
          AddRecipe(ItemRegistry.raisincookiesItem, new Object[] { "toolBakeware", "foodFlour", "listAllegg", "listAllsugar", "foodRaisins" });
     
          AddRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "foodSalt", "foodVinegar" });
          AddRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "dustSalt", "foodVinegar" });
          AddRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "itemSalt", "foodVinegar" });
     
          AddRecipe(ItemRegistry.cucumbersaladItem, new Object[] { "toolCuttingboard", "cropCucumber", "foodSpringsalad" });
          AddRecipe(ItemRegistry.cucumbersoupItem, new Object[] { "toolPot", "cropCucumber", "foodStock", "listAllheavycream" });
          AddRecipe(ItemRegistry.vegetarianlettucewrapItem, new Object[] { "toolCuttingboard", "cropCucumber", "cropLettuce", "cropTomato" });
          AddRecipe(ItemRegistry.marinatedcucumbersItem, new Object[] { "toolPot", "cropCucumber", "cropOnion", "listAllsugar", "foodVinegar" });
     
          AddRecipe(ItemRegistry.ricesoupItem, new Object[] { "toolPot", "cropRice", "foodStock" });
          AddRecipe(ItemRegistry.friedriceItem, new Object[] { "toolSkillet", "cropRice", Items.carrot, "listAllegg", "cropOnion" });
          AddRecipe(ItemRegistry.mushroomrisottoItem, new Object[] { "toolBakeware", "cropRice", "listAllmushroom", "cropOnion", "foodCheese" });
          AddRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "foodSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" });
          AddRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "dustSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" });
          AddRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "itemSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" });
     
          AddRecipe(ItemRegistry.rainbowcurryItem, new Object[] { "toolSkillet", "cropRice", "flowerRed", "flowerYellow", "flowerOrange", "flowerGreen", "flowerPurple", "flowerBlue" });
     
          AddRecipe(ItemRegistry.refriedbeansItem, new Object[] { "toolSkillet", "cropBean", "cropOnion", "foodButter" });
          AddRecipe(ItemRegistry.bakedbeansItem, new Object[] { "toolPot", "cropBean", "listAllporkcooked", "listAllsugar" });
          AddRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropOnion", "listAllporkcooked" });
          AddRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropBellpepper", "listAllporkcooked" });
          AddRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropChilipepper", "listAllporkcooked" });
          AddRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropOnion", "listAllbeefcooked" });
          AddRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropBellpepper", "listAllbeefcooked" });
          AddRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropChilipepper", "listAllbeefcooked" });
          AddRecipe(ItemRegistry.beanburritoItem, new Object[] { "toolSkillet", "cropBean", "foodTortilla", "cropRice", "foodCheese" });
     
          AddRecipe(ItemRegistry.stuffedpepperItem, new Object[] { "toolBakeware", "cropBellpepper", "cropTomato", "cropRice" });
          AddRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "cropBean" });
          AddRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "cropChilipepper" });
          AddRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" });
          AddRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" });
          AddRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" });
          AddRecipe(ItemRegistry.grilledskewersItem, new Object[] { "toolCuttingboard", "cropBellpepper", "cropOnion", Items.carrot, "stickWood" });
          AddRecipe(ItemRegistry.supremepizzaItem, new Object[] { "toolCuttingboard", "foodPizza", "cropBellpepper", "cropOnion", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.omeletItem, new Object[] { "toolSkillet", "listAllegg", "cropBellpepper", "cropOnion" });
     
          AddRecipe(ItemRegistry.hotwingsItem, new Object[] { "toolSkillet", "cropChilipepper", "listAllchickencooked", "foodButter" });
          AddRecipe(ItemRegistry.chilipoppersItem, new Object[] { "toolBakeware", "cropChilipepper", "foodFlour", "foodCheese" });
          AddRecipe(ItemRegistry.extremechiliItem, new Object[] { "foodChili", "cropChilipepper" });
          AddRecipe(ItemRegistry.chilichocolateItem, new Object[] { "toolMixingbowl", "foodChocolatebar", "cropChilipepper" });
     
          AddRecipe(new ItemStack(ItemRegistry.lemonaideItem, 1), new Object[] { "toolJuicer", "cropLemon" });
          AddRecipe(new ItemStack(ItemRegistry.lemonbarItem, 1), new Object[] { "toolBakeware", "cropLemon", "foodDough", "listAllsugar" });
          AddRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), new Object[] { "toolSkillet", "cropLemon", "foodFlour", "listAllfishraw", "foodMayo" });
          AddRecipe(new ItemStack(ItemRegistry.lemonsmoothieItem, 1), new Object[] { "toolJuicer", "cropLemon", Items.snowball });
          AddRecipe(new ItemStack(ItemRegistry.lemonmeringueItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllsugar", "foodDough", "listAllheavycream" });
          AddRecipe(new ItemStack(ItemRegistry.candiedlemonItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllsugar" });
          AddRecipe(new ItemStack(ItemRegistry.lemonchickenItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllchickenraw", "foodButter" });
     
          AddRecipe(ItemRegistry.blueberrysmoothieItem, new Object[] { "toolJuicer", "cropBlueberry", Items.snowball });
          AddRecipe(ItemRegistry.blueberrypieItem, new Object[] { "toolBakeware", "cropBlueberry", "foodDough", "listAllsugar" });
          AddRecipe(ItemRegistry.blueberrymuffinItem, new Object[] { "toolBakeware", "cropBlueberry", "foodFlour", "listAllegg" });
          AddRecipe(ItemRegistry.blueberryjuiceItem, new Object[] { "toolJuicer", "cropBlueberry" });
          AddRecipe(ItemRegistry.pancakesItem, new Object[] { "toolSkillet", "foodFlour", "listAllegg", "listAllmilk" });
          AddRecipe(ItemRegistry.blueberrypancakesItem, new Object[] { "cropBlueberry", "foodPancakes" });
     
          AddRecipe(new ItemStack(ItemRegistry.cherryjuiceItem, 1), new Object[] { "toolJuicer", "cropCherry" });
          AddRecipe(new ItemStack(ItemRegistry.cherrypieItem, 1), new Object[] { "toolBakeware", "cropCherry", "foodDough", "listAllsugar" });
          AddRecipe(new ItemStack(ItemRegistry.chocolatecherryItem, 1), new Object[] { "toolSaucepan", "cropCherry", "foodChocolatebar" });
          AddRecipe(new ItemStack(ItemRegistry.cherrysmoothieItem, 1), new Object[] { "toolJuicer", "cropCherry", Items.snowball });
          AddRecipe(new ItemStack(ItemRegistry.cheesecakeItem, 1), new Object[] { "toolBakeware", "foodFlour", "listAllheavycream", "listAllsugar", "listAllegg" });
          AddRecipe(new ItemStack(ItemRegistry.cherrycheesecakeItem, 1), new Object[] { "cropCherry", "foodCheesecake" });
     
          AddRecipe(ItemRegistry.stuffedeggplantItem, new Object[] { "toolBakeware", "cropEggplant", "cropOnion", "cropBellpepper", "foodButter", "listAllegg" });
          AddRecipe(ItemRegistry.stuffedeggplantItem, new Object[] { "toolBakeware", "cropEggplant", "cropGarlic" });
          AddRecipe(ItemRegistry.eggplantparmItem, new Object[] { "toolBakeware", "cropEggplant", "cropTomato", "foodPasta", "foodCheese" });
     
          AddRecipe(ItemRegistry.raspberryicedteaItem, new Object[] { "cropTea", Items.snowball, "cropRaspberry" });
          AddRecipe(ItemRegistry.chaiteaItem, new Object[] { "cropTea", "foodGroundcinnamon", "foodBlackpepper" });
     
          AddRecipe(ItemRegistry.espressoItem, new Object[] { "cropCoffee", "cropCoffee", "cropCoffee", "listAllsugar" });
          AddRecipe(ItemRegistry.coffeeconlecheItem, new Object[] { "foodEspresso", "listAllmilk", "foodGroundcinnamon" });
          AddRecipe(ItemRegistry.mochaicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropCoffee", "foodCocoapowder" });
     
          AddRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "foodSalt" });
          AddRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "dustSalt" });
          AddRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "itemSalt" });
     
          AddRecipe(ItemRegistry.beetsaladItem, new Object[] { "toolMixingbowl", "cropBeet", "cropLettuce", "foodVinegar", "foodCheese" });
          AddRecipe(ItemRegistry.beetsoupItem, new Object[] { "toolPot", "cropBeet", "cropOnion", "foodBlackpepper", "listAllmilk" });
          AddRecipe(ItemRegistry.bakedbeetsItem, new Object[] { "toolBakeware", "cropBeet", "foodButter", "foodBlackpepper" });
     
          AddRecipe(ItemRegistry.broccolimacItem, new Object[] { "toolPot", "cropBroccoli", "foodPasta", "foodCheese" });
          AddRecipe(ItemRegistry.broccolindipItem, new Object[] { "toolMixingbowl", "cropBroccoli", "cropOnion", "listAllheavycream" });
          AddRecipe(ItemRegistry.creamedbroccolisoupItem, new Object[] { "toolPot", "cropBroccoli", Items.carrot, "foodFlour", "foodBlackpepper", "foodStock" });
     
          AddRecipe(ItemRegistry.sweetpotatopieItem, new Object[] { "toolBakeware", "cropSweetpotato", "foodDough", "foodGroundcinnamon", "foodMarshmellows" });
          AddRecipe(ItemRegistry.candiedsweetpotatoesItem, new Object[] { "toolSaucepan", "cropSweetpotato", "listAllsugar", "foodGroundcinnamon" });
          AddRecipe(ItemRegistry.mashedsweetpotatoesItem, new Object[] { "toolSaucepan", "cropSweetpotato", "foodButter" });
     
          AddRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "foodSalt" });
          AddRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "dustSalt" });
          AddRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "itemSalt" });
     
          AddRecipe(ItemRegistry.splitpeasoupItem, new Object[] { "toolPot", "cropPeas", "listAllporkcooked", "foodBlackpepper", "foodStock" });
     
          AddRecipe(ItemRegistry.pineappleupsidedowncakeItem, new Object[] { "toolBakeware", "cropPineapple", "foodDough", "cropCherry", "cropWalnut" });
          AddRecipe(ItemRegistry.pineapplehamItem, new Object[] { "toolBakeware", "cropPineapple", "listAllporkraw", "cropCherry", "listAllsugar" });
          AddRecipe(ItemRegistry.pineappleyogurtItem, new Object[] { "cropPineapple", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.turnipsoupItem, new Object[] { "toolPot", "cropTurnip", Blocks.pumpkin, "foodButter", "foodStock" });
          AddRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropTurnip", Items.carrot, "cropOnion", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", Blocks.pumpkin, Items.carrot, "cropOnion", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", Items.potato, Items.carrot, "cropOnion", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropSweetpotato", Items.carrot, "cropOnion", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropRadish", Items.carrot, "cropOnion", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropParsnip", Items.carrot, "cropOnion", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "foodSalt", "foodBlackpepper" });
          AddRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "dustSalt", "foodBlackpepper" });
          AddRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "itemSalt", "foodBlackpepper" });
     
          AddRecipe(ItemRegistry.gingerbreadItem, new Object[] { "toolBakeware", "cropGinger", "foodFlour", "foodButter", "listAllegg", "foodGroundcinnamon" });
          AddRecipe(ItemRegistry.gingersnapsItem, new Object[] { "toolBakeware", "cropGinger", "foodFlour", "listAllsugar" });
          AddRecipe(ItemRegistry.candiedgingerItem, new Object[] { "toolSaucepan", "cropGinger", "listAllsugar" });
     
          AddRecipe(ItemRegistry.mustardItem, new Object[] { "toolJuicer", "cropMustard" });
          AddRecipe(ItemRegistry.softpretzelandmustardItem, new Object[] { "foodSoftpretzel", "foodMustard" });
          AddRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "foodBlackpepper" });
          AddRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "cropGarlic" });
          AddRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "foodSalt" });
          AddRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "dustSalt" });
          AddRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "itemSalt" });
     
          AddRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropLettuce", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" });
          AddRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropBroccoli", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" });
          AddRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropPeas", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" });
     
          AddRecipe(ItemRegistry.garlicbreadItem, new Object[] { "cropGarlic", "foodToast", "foodButter" });
          AddRecipe(ItemRegistry.garlicmashedpotatoesItem, new Object[] { "foodMashedpotatoes", "cropGarlic" });
          AddRecipe(ItemRegistry.garlicchickenItem, new Object[] { "toolBakeware", "cropGarlic", "cropGarlic", "cropGarlic", "foodOliveoil", "listAllchickenraw" });
     
          AddRecipe(ItemRegistry.summerradishsaladItem, new Object[] { "toolMixingbowl", "cropRadish", "cropOnion", "cropCucumber", "foodVinegar" });
          AddRecipe(ItemRegistry.summersquashwithradishItem, new Object[] { "toolMixingbowl", "cropRadish", "cropZucchini", Blocks.pumpkin, "cropSpiceleaf", "foodOliveoil" });
     
          AddRecipe(ItemRegistry.celeryandpeanutbutterItem, new Object[] { "cropCelery", "listAllnutbutter" });
          AddRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" });
          AddRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" });
          AddRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" });
          AddRecipe(ItemRegistry.peasandceleryItem, new Object[] { "toolMixingbowl", "cropCelery", "cropPeas", "cropLemon", "foodBlackpepper" });
          AddRecipe(ItemRegistry.celerysoupItem, new Object[] { "toolPot", "cropCelery", "cropOnion", Items.carrot, "foodStock" });
     
          AddRecipe(ItemRegistry.zucchinibreadItem, new Object[] { "toolBakeware", "cropZucchini", "foodDough", "foodGroundcinnamon", "cropWalnut" });
          AddRecipe(ItemRegistry.zucchinifriesItem, new Object[] { "toolBakeware", "cropZucchini", "foodToast", "foodCheese", "listAllegg" });
          AddRecipe(ItemRegistry.zestyzucchiniItem, new Object[] { "toolBakeware", "cropZucchini", "foodPasta", "cropChilipepper", "cropGarlic", "foodCheese" });
          AddRecipe(ItemRegistry.zucchinibakeItem, new Object[] { "toolBakeware", "cropZucchini", "cropTomato", "foodToast", "cropCorn", "foodCheese" });
     
          AddRecipe(ItemRegistry.asparagusquicheItem, new Object[] { "toolSkillet", "cropAsparagus", "listAllegg", "cropOnion", "foodCheese" });
          AddRecipe(ItemRegistry.asparagussoupItem, new Object[] { "toolPot", "cropAsparagus", "cropOnion", "foodButter", "foodStock" });
     
          AddRecipe(ItemRegistry.walnutraisinbreadItem, new Object[] { "toolBakeware", "cropWalnut", "foodRaisins", "foodDough", "foodGroundcinnamon" });
          AddRecipe(ItemRegistry.candiedwalnutsItem, new Object[] { "toolSaucepan", "cropWalnut", "foodVanilla", "foodGroundcinnamon", "listAllsugar" });
          AddRecipe(ItemRegistry.brownieItem, new Object[] { "toolBakeware", "cropWalnut", "foodFlour", "listAllegg", "foodButter", "listAllsugar", "foodCocoapowder", "foodVanilla" });
     
          AddRecipe(ItemRegistry.papayajuiceItem, new Object[] { "toolJuicer", "cropPapaya" });
          AddRecipe(ItemRegistry.papayasmoothieItem, new Object[] { "toolJuicer", "cropPapaya", Items.snowball });
          AddRecipe(ItemRegistry.papayayogurtItem, new Object[] { "cropPapaya", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.starfruitjuiceItem, new Object[] { "toolJuicer", "cropStarfruit" });
          AddRecipe(ItemRegistry.starfruitsmoothieItem, new Object[] { "toolJuicer", "cropStarfruit", Items.snowball });
          AddRecipe(ItemRegistry.starfruityogurtItem, new Object[] { "cropStarfruit", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.guacamoleItem, new Object[] { "toolCuttingboard", "cropAvocado", "cropChilipepper", "cropTomato", "cropOnion", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.creamofavocadosoupItem, new Object[] { "toolPot", "cropAvocado", "listAllheavycream", "cropLime", "cropSpiceleaf", "foodStock" });
          AddRecipe(ItemRegistry.avocadoburritoItem, new Object[] { "toolCuttingboard", "cropAvocado", "foodTortilla", "foodCheese", "listAllchickencooked" });
          AddRecipe(ItemRegistry.avocadoburritoItem, new Object[] { "toolCuttingboard", "cropAvocado", "foodTortilla", "foodCheese", "listAllporkcooked" });
     
          AddRecipe(ItemRegistry.poachedpearItem, new Object[] { "toolSaucepan", "cropPear", "foodVanilla", "listAllsugar" });
          AddRecipe(ItemRegistry.fruitcrumbleItem, new Object[] { "toolBakeware", "listAllfruit", "foodGroundcinnamon", "foodFlour", "foodButter" });
          AddRecipe(ItemRegistry.pearyogurtItem, new Object[] { "cropPear", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.plumyogurtItem, new Object[] { "cropPlum", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.bananasplitItem, new Object[] { "toolMixingbowl", "cropBanana", "foodCocoapowder", "cropCherry", "listAllicecream", "cropStrawberry" });
          AddRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "foodSalt" });
          AddRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "dustSalt" });
          AddRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "itemSalt" });
     
          AddRecipe(ItemRegistry.bananasmoothieItem, new Object[] { "toolJuicer", "cropBanana", Items.snowball });
          AddRecipe(ItemRegistry.bananayogurtItem, new Object[] { "cropBanana", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.coconutmilkItem, new Object[] { "toolJuicer", "cropCoconut" });
          AddRecipe(ItemRegistry.chickencurryItem, new Object[] { "toolPot", "cropCoconut", "foodPlainyogurt", "listAllchickenraw", "listAllspice", "cropChilipepper", "cropRice", "foodGroundcinnamon", "cropGarlic" });
          AddRecipe(ItemRegistry.coconutshrimpItem, new Object[] { "toolSkillet", "cropCoconut", "listAllegg", "foodFlour", "foodShrimpraw", "foodOliveoil" });
          AddRecipe(ItemRegistry.coconutshrimpItem, new Object[] { "toolSkillet", "cropCoconut", "listAllegg", "foodFlour", "foodRawshrimp", "foodOliveoil" });
          AddRecipe(ItemRegistry.coconutyogurtItem, new Object[] { "cropCoconut", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.orangejuiceItem, new Object[] { "toolJuicer", "cropOrange" });
          AddRecipe(ItemRegistry.orangechickenItem, new Object[] { "toolSaucepan", "cropOrange", "listAllchickenraw", "listAllsugar", "cropRice", "cropBroccoli" });
          AddRecipe(ItemRegistry.orangesmoothieItem, new Object[] { "toolJuicer", "cropOrange", Items.snowball });
          AddRecipe(ItemRegistry.orangeyogurtItem, new Object[] { "cropOrange", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.peachjuiceItem, new Object[] { "toolJuicer", "cropPeach" });
          AddRecipe(ItemRegistry.peachcobblerItem, new Object[] { "toolBakeware", "cropPeach", "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.peachsmoothieItem, new Object[] { "toolJuicer", "cropPeach", Items.snowball });
          AddRecipe(ItemRegistry.peachyogurtItem, new Object[] { "cropPeach", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.limejuiceItem, new Object[] { "toolJuicer", "cropLime" });
          AddRecipe(ItemRegistry.keylimepieItem, new Object[] { "toolBakeware", "cropLime", "listAllheavycream", "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.limesmoothieItem, new Object[] { "toolJuicer", "cropLime", Items.snowball });
          AddRecipe(ItemRegistry.limeyogurtItem, new Object[] { "cropLime", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.mangojuiceItem, new Object[] { "toolJuicer", "cropMango" });
          AddRecipe(ItemRegistry.mangosmoothieItem, new Object[] { "toolJuicer", "cropMango", Items.snowball });
          AddRecipe(ItemRegistry.mangoyogurtItem, new Object[] { "cropMango", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.pomegranatejuiceItem, new Object[] { "toolJuicer", "cropPomegranate" });
          AddRecipe(ItemRegistry.pomegranatesmoothieItem, new Object[] { "toolJuicer", "cropPomegranate", Items.snowball });
          AddRecipe(ItemRegistry.pomegranateyogurtItem, new Object[] { "cropPomegranate", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.vanillayogurtItem, new Object[] { "foodVanilla", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.cinnamonrollItem, new Object[] { "toolBakeware", "foodGroundcinnamon", "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.frenchtoastItem, new Object[] { "toolSkillet", "foodGroundcinnamon", "foodToast", "listAllsugar", "listAllegg" });
     
          AddRecipe(ItemRegistry.marshmellowsItem, new Object[] { "toolPot", "listAllsugar", "listAllwater", "listAllegg" });
          AddRecipe(ItemRegistry.donutItem, new Object[] { "toolPot", "foodDough", "foodOliveoil" });
          AddRecipe(ItemRegistry.chocolatedonutItem, new Object[] { "foodDonut", "foodChocolatebar" });
          AddRecipe(ItemRegistry.powdereddonutItem, new Object[] { "foodDonut", "listAllsugar" });
          AddRecipe(ItemRegistry.jellydonutItem, new Object[] { "foodDonut", "foodGrapejelly" });
          AddRecipe(ItemRegistry.frosteddonutItem, new Object[] { "foodDonut", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 11) });
     
          AddRecipe(ItemRegistry.cactussoupItem, new Object[] { "toolPot", Blocks.cactus, "foodStock" });
          AddRecipe(ItemRegistry.wafflesItem, new Object[] { "toolSkillet", "foodFlour", "listAllegg", "listAllmilk", "foodButter" });
          AddRecipe(ItemRegistry.seedsoupItem, new Object[] { "toolPot", "listAllseed", "foodStock" });
          AddRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "foodSalt" });
          AddRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "dustSalt" });
          AddRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "itemSalt" });
     
          AddRecipe(ItemRegistry.jellybeansItem, new Object[] { "toolSaucepan", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11) });
          AddRecipe(ItemRegistry.biscuitItem, new Object[] { "toolBakeware", "foodDough", "foodButter" });
     
          AddRecipe(ItemRegistry.creamcookieItem, new Object[] { "toolBakeware", "foodDough", "listAllheavycream", "listAllsugar", "foodCocoapowder" });
          AddRecipe(ItemRegistry.jaffaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "foodFlour", "foodChocolatebar", "cropOrange" });
          AddRecipe(ItemRegistry.friedchickenItem, new Object[] { "toolPot", "listAllchickenraw", "foodFlour", "cropSpiceleaf", "foodBlackpepper", "foodOliveoil" });
          AddRecipe(ItemRegistry.chocolatesprinklecakeItem, new Object[] { "toolBakeware", "foodCocoapowder", "listAllsugar", "foodDough", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 11) });
          AddRecipe(ItemRegistry.redvelvetcakeItem, new Object[] { "toolBakeware", "listAllmilk", "foodFlour", "listAllheavycream", "listAllsugar", "listAllegg", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1) });
          AddRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllbeefcooked", "cropLettuce", "cropTomato", "foodMayo" });
          AddRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllchickencooked", "cropLettuce", "cropTomato", "foodMayo" });
          AddRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllporkcooked", "cropLettuce", "cropTomato", "foodMayo" });
     
          AddRecipe(ItemRegistry.blueberryyogurtItem, new Object[] { "cropBlueberry", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.lemonyogurtItem, new Object[] { "cropLemon", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.cherryyogurtItem, new Object[] { "cropCherry", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.strawberryyogurtItem, new Object[] { "cropStrawberry", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.grapeyogurtItem, new Object[] { "cropGrape", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.chocolateyogurtItem, new Object[] { "foodCocoapowder", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.blackberryjuiceItem, new Object[] { "toolJuicer", "cropBlackberry" });
          AddRecipe(ItemRegistry.blackberrycobblerItem, new Object[] { "cropBlackberry", "toolBakeware", "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.blackberrysmoothieItem, new Object[] { "toolJuicer", "cropBlackberry", Items.snowball });
          AddRecipe(ItemRegistry.blackberryyogurtItem, new Object[] { "cropBlackberry", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.chocolatemilkItem, new Object[] { "listAllmilk", "foodCocoapowder" });
          AddRecipe(ItemRegistry.pumpkinyogurtItem, new Object[] { Blocks.pumpkin, "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.raspberryjuiceItem, new Object[] { "toolJuicer", "cropRaspberry" });
          AddRecipe(ItemRegistry.raspberrypieItem, new Object[] { "cropRaspberry", "toolBakeware", "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.raspberrysmoothieItem, new Object[] { "toolJuicer", "cropRaspberry", Items.snowball });
          AddRecipe(ItemRegistry.raspberryyogurtItem, new Object[] { "cropRaspberry", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.cinnamonsugardonutItem, new Object[] { "foodDonut", "listAllsugar", "foodGroundcinnamon" });
          AddRecipe(ItemRegistry.melonyogurtItem, new Object[] { Items.melon, "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.kiwijuiceItem, new Object[] { "toolJuicer", "cropKiwi" });
          AddRecipe(ItemRegistry.kiwismoothieItem, new Object[] { "toolJuicer", "cropKiwi", Items.snowball });
          AddRecipe(ItemRegistry.kiwiyogurtItem, new Object[] { "cropKiwi", "foodPlainyogurt" });
          AddRecipe(new ItemStack(ItemRegistry.plainyogurtItem, 4, 0), new Object[] { "listAllmilk", Items.leather });
          AddRecipe(ItemRegistry.plainyogurtItem, new Object[] { "toolPot", "listAllmilk" });
          AddRecipe(ItemRegistry.appleyogurtItem, new Object[] { "cropApple", "foodPlainyogurt" });
     
          AddRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "foodSalt" });
          AddRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "dustSalt" });
          AddRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "itemSalt" });
     
          AddRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "foodSalt", "foodOliveoil" });
          AddRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "dustSalt", "foodOliveoil" });
          AddRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "itemSalt", "foodOliveoil" });
     
          AddRecipe(ItemRegistry.sunflowerbroccolisaladItem, new Object[] { "toolCuttingboard", "cropSunflower", "cropBroccoli", "foodMayo", "listAllsugar", "listAllporkcooked" });
     
          AddRecipe(ItemRegistry.cranberryjuiceItem, new Object[] { "toolJuicer", "cropCranberry", "listAllsugar" });
          AddRecipe(ItemRegistry.cranberrysauceItem, new Object[] { "toolPot", "cropCranberry", "listAllsugar" });
          AddRecipe(ItemRegistry.cranberrybarItem, new Object[] { "toolBakeware", "cropCranberry", "listAllsugar", "foodDough" });
     
          AddRecipe(ItemRegistry.peppermintItem, new Object[] { "toolSaucepan", "cropSpiceleaf", "listAllsugar" });
     
          AddRecipe(ItemRegistry.cactusfruitjuiceItem, new Object[] { "toolJuicer", "cropCactusfruit" });
     
          AddRecipe(ItemRegistry.blackpepperItem, new Object[] { "toolMortarandpestle", "cropPeppercorn" });
          AddRecipe(ItemRegistry.groundcinnamonItem, new Object[] { "toolMortarandpestle", "cropCinnamon" });
          AddRecipe(ItemRegistry.groundnutmegItem, new Object[] { "toolMortarandpestle", "cropNutmeg" });
          AddRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropOlive" });
          AddRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropSunflower" });
          AddRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropWalnut" });
     
          AddRecipe(ItemRegistry.baklavaItem, new Object[] { "toolBakeware", "foodDough", "cropWalnut", "cropCinnamon", "foodButter", "listAllsugar" });
          AddRecipe(ItemRegistry.gummybearsItem, new Object[] { "toolSaucepan", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2) });
          AddRecipe(ItemRegistry.baconmushroomburgerItem, new Object[] { "foodBaconcheeseburger", "listAllmushroom" });
          AddRecipe(ItemRegistry.baconmushroomburgerItem, new Object[] { "foodBaconcheeseburger", "cropWhitemushroom" });
          AddRecipe(ItemRegistry.fruitpunchItem, new Object[] { "toolJuicer", "listAllfruit", "listAllsugar" });
          AddRecipe(ItemRegistry.meatystewItem, new Object[] { "toolPot", "listAllmeatraw", "foodFlour", "foodStock" });
          AddRecipe(ItemRegistry.mixedsaladItem, new Object[] { "toolCuttingboard", "listAllveggie", "listAllveggie", "foodSaladdressing" });
          AddRecipe(ItemRegistry.pinacoladaItem, new Object[] { "toolJuicer", "cropCoconut", "cropPineapple" });
          AddRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "foodSalt", "foodVinegar" });
          AddRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "dustSalt", "foodVinegar" });
          AddRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "itemSalt", "foodVinegar" });
     
          AddRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodMayo", "cropSpiceleaf", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.shepardspieItem, new Object[] { "toolBakeware", "listAllmuttonraw", Items.potato, Items.carrot, "foodDough", "cropPeas" });
          AddRecipe(ItemRegistry.eggnogItem, new Object[] { "toolJuicer", "listAllegg", "foodGroundnutmeg", "cropCinnamon", "listAllheavycream" });
          AddRecipe(ItemRegistry.custardItem, new Object[] { "toolSaucepan", "listAllegg", "foodGroundnutmeg", "cropCinnamon", "listAllheavycream" });
          AddRecipe(ItemRegistry.sushiItem, new Object[] { "toolCuttingboard", "listAllfishraw", "cropSeaweed", "cropRice" });
          AddRecipe(ItemRegistry.gardensoupItem, new Object[] { "toolPot", "foodStock", "listAllveggie", "listAllveggie" });
     
          AddRecipe(ItemRegistry.applejellyItem, new Object[] { "toolSaucepan", "cropApple", "listAllsugar" });
          AddRecipe(ItemRegistry.blackberryjellyItem, new Object[] { "toolSaucepan", "cropBlackberry", "listAllsugar" });
          AddRecipe(ItemRegistry.blueberryjellyItem, new Object[] { "toolSaucepan", "cropBlueberry", "listAllsugar" });
          AddRecipe(ItemRegistry.cherryjellyItem, new Object[] { "toolSaucepan", "cropCherry", "listAllsugar" });
          AddRecipe(ItemRegistry.cranberryjellyItem, new Object[] { "toolSaucepan", "cropCranberry", "listAllsugar" });
          AddRecipe(ItemRegistry.kiwijellyItem, new Object[] { "toolSaucepan", "cropKiwi", "listAllsugar" });
          AddRecipe(ItemRegistry.lemonjellyItem, new Object[] { "toolSaucepan", "cropLemon", "listAllsugar" });
          AddRecipe(ItemRegistry.limejellyItem, new Object[] { "toolSaucepan", "cropLime", "listAllsugar" });
          AddRecipe(ItemRegistry.mangojellyItem, new Object[] { "toolSaucepan", "cropMango", "listAllsugar" });
          AddRecipe(ItemRegistry.orangejellyItem, new Object[] { "toolSaucepan", "cropOrange", "listAllsugar" });
          AddRecipe(ItemRegistry.papayajellyItem, new Object[] { "toolSaucepan", "cropPapaya", "listAllsugar" });
          AddRecipe(ItemRegistry.peachjellyItem, new Object[] { "toolSaucepan", "cropPeach", "listAllsugar" });
          AddRecipe(ItemRegistry.pomegranatejellyItem, new Object[] { "toolSaucepan", "cropPomegranate", "listAllsugar" });
          AddRecipe(ItemRegistry.raspberryjellyItem, new Object[] { "toolSaucepan", "cropRaspberry", "listAllsugar" });
          AddRecipe(ItemRegistry.starfruitjellyItem, new Object[] { "toolSaucepan", "cropStarfruit", "listAllsugar" });
          AddRecipe(ItemRegistry.strawberryjellyItem, new Object[] { "toolSaucepan", "cropStrawberry", "listAllsugar" });
          AddRecipe(ItemRegistry.watermelonjellyItem, new Object[] { "toolSaucepan", Items.melon, Items.melon, "listAllsugar" });
     
          AddRecipe(ItemRegistry.applejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodApplejelly", Items.bread });
          AddRecipe(ItemRegistry.blackberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodBlackberryjelly", Items.bread });
          AddRecipe(ItemRegistry.blueberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodBlueberryjelly", Items.bread });
          AddRecipe(ItemRegistry.cherryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodCherryjelly", Items.bread });
          AddRecipe(ItemRegistry.cranberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodCranberryjelly", Items.bread });
          AddRecipe(ItemRegistry.kiwijellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodKiwijelly", Items.bread });
          AddRecipe(ItemRegistry.lemonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodLemonjelly", Items.bread });
          AddRecipe(ItemRegistry.limejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodLimejelly", Items.bread });
          AddRecipe(ItemRegistry.mangojellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodMangojelly", Items.bread });
          AddRecipe(ItemRegistry.orangejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodOrangejelly", Items.bread });
          AddRecipe(ItemRegistry.papayajellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPapayajelly", Items.bread });
          AddRecipe(ItemRegistry.peachjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPeachjelly", Items.bread });
          AddRecipe(ItemRegistry.pomegranatejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPomegranatejelly", Items.bread });
          AddRecipe(ItemRegistry.raspberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodRaspberryjelly", Items.bread });
          AddRecipe(ItemRegistry.starfruitjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodStarfruitjelly", Items.bread });
          AddRecipe(ItemRegistry.strawberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodStrawberryjelly", Items.bread });
          AddRecipe(ItemRegistry.watermelonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodWatermelonjelly", Items.bread });
     
          AddRecipe(ItemRegistry.cherrysodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodCherryjuice" });
          AddRecipe(ItemRegistry.colasodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.gingersodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropGinger" });
          AddRecipe(ItemRegistry.grapesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodGrapejuice" });
          AddRecipe(ItemRegistry.lemonlimesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropLemon", "foodLimejuice" });
          AddRecipe(ItemRegistry.orangesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodOrangejuice" });
          AddRecipe(ItemRegistry.rootbeersodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropEdibleroot" });
          AddRecipe(ItemRegistry.strawberrysodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodStrawberryjuice" });
     
          AddRecipe(ItemRegistry.caramelicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodCaramel" });
          AddRecipe(ItemRegistry.mintchocolatechipicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropSpiceleaf", "foodChocolatebar" });
          AddRecipe(ItemRegistry.strawberryicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropStrawberry" });
          AddRecipe(ItemRegistry.vanillaicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodVanilla" });
     
          AddRecipe(ItemRegistry.ediblerootItem, new Object[] { "toolCuttingboard", "cropSpiceleaf" });
     
          AddRecipe(ItemRegistry.gingerchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropGinger", "cropScallion", "foodHoneydrop" });
          AddRecipe(ItemRegistry.gingerchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropGinger", "cropScallion", "dropHoney" });
     
          AddRecipe(ItemRegistry.oldworldveggiesoupItem, new Object[] { "toolPot", "foodStock", "cropOnion", "cropPeas", "cropBarley" });
          AddRecipe(ItemRegistry.spicebunItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "foodGroundnutmeg", "foodGroundcinnamon", "foodRaisins" });
          AddRecipe(ItemRegistry.gingeredrhubarbtartItem, new Object[] { "toolBakeware", "foodDough", "cropRhubarb", "cropGinger", "listAllsugar", "listAllegg" });
          AddRecipe(ItemRegistry.lambbarleysoupItem, new Object[] { "toolPot", "foodStock", "listAllmuttonraw", "cropOnion", Items.carrot, "cropBarley" });
          AddRecipe(ItemRegistry.honeylemonlambItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropLemon", "foodMustard", "foodHoneydrop" });
          AddRecipe(ItemRegistry.honeylemonlambItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropLemon", "foodMustard", "dropHoney" });
          AddRecipe(ItemRegistry.pumpkinoatsconesItem, new Object[] { "toolBakeware", "foodFlour", "cropOats", Blocks.pumpkin, "foodButter" });
          AddRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "foodSalt" });
          AddRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "dustSalt" });
          AddRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "itemSalt" });
     
          AddRecipe(ItemRegistry.plumjuiceItem, new Object[] { "toolJuicer", "cropPlum" });
          AddRecipe(ItemRegistry.pearjuiceItem, new Object[] { "toolJuicer", "cropPear" });
     
          AddRecipe(ItemRegistry.ovenroastedcauliflowerItem, new Object[] { "toolBakeware", "cropCauliflower", "foodOliveoil", "cropGarlic", "cropLemon" });
          AddRecipe(ItemRegistry.leekbaconsoupItem, new Object[] { "toolPot", "cropLeek", "listAllporkcooked", Items.potato, "listAllheavycream" });
          AddRecipe(ItemRegistry.herbbutterparsnipsItem, new Object[] { "toolSaucepan", "cropParsnip", "foodButter", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.scallionbakedpotatoItem, new Object[] { Items.baked_potato, "cropScallion", "listAllheavycream" });
     
          AddRecipe(ItemRegistry.bamboosteamedriceItem, new Object[] { "toolPot", "cropRice", "cropBambooshoot" });
          AddRecipe(ItemRegistry.sweetpotatosouffleItem, new Object[] { "toolBakeware", "cropSweetpotato", "cropPecan", "foodDough", "foodButter" });
          AddRecipe(ItemRegistry.cashewchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropCashew", "cropRice", "listAllpepper" });
          AddRecipe(ItemRegistry.apricotjuiceItem, new Object[] { "toolJuicer", "cropApricot" });
          AddRecipe(ItemRegistry.apricotyogurtItem, new Object[] { "cropApricot", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.apricotglazedporkItem, new Object[] { "listAllporkcooked", "foodApricotjelly" });
          AddRecipe(ItemRegistry.apricotjellyItem, new Object[] { "toolSaucepan", "cropApricot", "listAllsugar" });
          AddRecipe(ItemRegistry.apricotjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodApricotjelly", Items.bread });
          AddRecipe(ItemRegistry.apricotsmoothieItem, new Object[] { "toolJuicer", "cropApricot", Items.snowball });
          AddRecipe(ItemRegistry.figbarItem, new Object[] { "toolBakeware", "cropFig", "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.figjellyItem, new Object[] { "toolSaucepan", "cropFig", "listAllsugar" });
          AddRecipe(ItemRegistry.figjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodFigjelly", Items.bread });
          AddRecipe(ItemRegistry.figsmoothieItem, new Object[] { "toolJuicer", "cropFig", Items.snowball });
          AddRecipe(ItemRegistry.figyogurtItem, new Object[] { "cropFig", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.figjuiceItem, new Object[] { "toolJuicer", "cropFig" });
          AddRecipe(ItemRegistry.grapefruitjuiceItem, new Object[] { "toolJuicer", "cropGrapefruit" });
          AddRecipe(ItemRegistry.grapefruitjellyItem, new Object[] { "toolSaucepan", "cropGrapefruit", "listAllsugar" });
          AddRecipe(ItemRegistry.grapefruitjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGrapefruitjelly", Items.bread });
          AddRecipe(ItemRegistry.grapefruitsmoothieItem, new Object[] { "toolJuicer", "cropGrapefruit", Items.snowball });
          AddRecipe(ItemRegistry.grapefruityogurtItem, new Object[] { "cropGrapefruit", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.grapefruitsodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodGrapefruitjuice" });
          AddRecipe(ItemRegistry.citrussaladItem, new Object[] { "toolCuttingboard", "listAllcitrus", "cropLettuce" });
          AddRecipe(ItemRegistry.pecanpieItem, new Object[] { "toolBakeware", "cropPecan", "foodDough", "listAllsugar", "foodButter" });
          AddRecipe(ItemRegistry.pralinesItem, new Object[] { "toolSaucepan", "cropPecan", "listAllsugar" });
          AddRecipe(ItemRegistry.persimmonjuiceItem, new Object[] { "toolJuicer", "cropPersimmon" });
          AddRecipe(ItemRegistry.persimmonyogurtItem, new Object[] { "cropPersimmon", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.persimmonsmoothieItem, new Object[] { "toolJuicer", "cropPersimmon", Items.snowball });
          AddRecipe(ItemRegistry.persimmonjellyItem, new Object[] { "toolSaucepan", "cropPersimmon", "listAllsugar" });
          AddRecipe(ItemRegistry.persimmonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPersimmonjelly", Items.bread });
          AddRecipe(ItemRegistry.pistachiobakedsalmonItem, new Object[] { "toolBakeware", "cropPistachio", "foodSalmonraw" });
          AddRecipe(ItemRegistry.baconwrappeddatesItem, new Object[] { "toolBakeware", "cropDate", "listAllporkcooked" });
          AddRecipe(ItemRegistry.datenutbreadItem, new Object[] { "toolBakeware", "cropDate", "foodDough", "listAllnut" });
          AddRecipe(ItemRegistry.maplesyruppancakesItem, new Object[] { "foodPancakes", "cropMaplesyrup" });
          AddRecipe(ItemRegistry.maplesyrupwafflesItem, new Object[] { "foodWaffles", "cropMaplesyrup" });
          AddRecipe(ItemRegistry.maplesausageItem, new Object[] { "listAllbeefraw", "cropSpiceleaf", "cropMaplesyrup" });
          AddRecipe(ItemRegistry.mapleoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "cropMaplesyrup" });
          AddRecipe(ItemRegistry.peachesandcreamoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "cropPeach", "listAllheavycream" });
          AddRecipe(ItemRegistry.cinnamonappleoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "foodGroundcinnamon", "cropApple" });
          AddRecipe(ItemRegistry.maplecandiedbaconItem, new Object[] { "toolBakeware", "listAllporkcooked", "cropMaplesyrup" });
          AddRecipe(ItemRegistry.toastsandwichItem, new Object[] { "foodToast", "foodToast" });
          AddRecipe(ItemRegistry.potatoandcheesepirogiItem, new Object[] { "toolSkillet", "foodDough", "cropPotato", "foodCheese" });
          AddRecipe(ItemRegistry.zeppoleItem, new Object[] { "toolPot", "foodOliveoil", "foodDough", "foodGroundcinnamon" });
          AddRecipe(ItemRegistry.sausageinbreadItem, new Object[] { "foodMaplesausage", Items.bread, "foodKetchup", "cropOnion" });
          AddRecipe(ItemRegistry.chocolatecaramelfudgeItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodCaramel" });
          AddRecipe(ItemRegistry.lavendershortbreadItem, new Object[] { "toolBakeware", "dyePurple", "foodDough" });
          AddRecipe(ItemRegistry.beefwellingtonItem, new Object[] { "listAllbeefraw", "foodDough", "listAllmushroom", "cropSpinach" });
          AddRecipe(ItemRegistry.epicbaconItem, new Object[] { "listAllporkcooked", "dyeRed", "dyeOrange", "dyeYellow", "dyeGreen", "dyeBlue", "dyePurple", "dyeMagenta" });
          AddRecipe(ItemRegistry.manjuuItem, new Object[] { "toolMixingbowl", "listAllsugar", "cropRice", "cropBean" });
     
          AddRecipe(ItemRegistry.chickengumboItem, new Object[] { "toolPot", "cropOkra", "listAllchickenraw", "cropCelery", "cropOnion", "foodStock", "listAllspice", "cropBellpepper" });
          AddRecipe(ItemRegistry.generaltsochickenItem, new Object[] { "toolSkillet", "listAllchickenraw", "cropBroccoli", "listAllsugar", "foodFlour", "cropChilipepper", "cropRice" });
          AddRecipe(ItemRegistry.californiarollItem, new Object[] { "toolCuttingboard", "listAllfishraw", "cropAvocado", "cropCucumber", "cropSeaweed", "cropRice" });
          AddRecipe(ItemRegistry.futomakiItem, new Object[] { "toolCuttingboard", "foodBoiledegg", "cropCucumber", "cropWintersquash", "cropRadish", "cropSeaweed", "cropGinger", "cropRice" });
          AddRecipe(ItemRegistry.beansontoastItem, new Object[] { "toolCuttingboard", "foodToast", "foodButter", "foodBakedbeans" });
          AddRecipe(ItemRegistry.vegemiteItem, new Object[] { "toolPot", "listAllsugar", "cropBarley", "listAllwater", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.honeycombchocolatebarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "materialHoneycomb" });
          AddRecipe(ItemRegistry.cherrycoconutchocolatebarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "cropCherry", "foodToastedcoconut" });
          AddRecipe(ItemRegistry.fairybreadItem, new Object[] { "toolBakeware", Items.bread, "foodButter", "dyeRed", "dyeGreen", "dyeYellow" });
          AddRecipe(ItemRegistry.lamingtonItem, new Object[] { "toolBakeware", "foodDough", "foodChocolatebar", "foodToastedcoconut" });
          AddRecipe(ItemRegistry.timtamItem, new Object[] { "toolBakeware", "listAllsugar", "foodFlour", "listAllmilk", "foodChocolatebar" });
          AddRecipe(ItemRegistry.meatpieItem, new Object[] { "toolBakeware", "listAllbeefraw", "foodDough", "cropOnion", "cropGarlic", "foodBlackpepper", "foodStock" });
          AddRecipe(ItemRegistry.chikorollItem, new Object[] { "toolPot", "foodOliveoil", "foodDough", "listAllchickencooked", "cropCarrot", "cropCabbage", "cropLeek", "cropOnion" });
          AddRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "foodSalt", "foodButter" });
          AddRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "oreSalt", "foodButter" });
          AddRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "dustSalt", "foodButter" });
          AddRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "itemSalt", "foodButter" });
          AddRecipe(ItemRegistry.beetburgerItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropBeet", "foodFriedegg", "listAllporkcooked", "cropPineapple", "foodToast" });
          AddRecipe(ItemRegistry.pavlovaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropLemon", "listAllheavycream", "cropStrawberry" });
          AddRecipe(ItemRegistry.pavlovaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropLemon", "listAllheavycream", "cropStrawberry" });
          AddRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "foodSalt", "cropSpiceleaf", "cropCucumber" });
          AddRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "oreSalt", "cropSpiceleaf", "cropCucumber" });
          AddRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "dustSalt", "cropSpiceleaf", "cropCucumber" });
          AddRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "itemSalt", "cropSpiceleaf", "cropCucumber" });
          AddRecipe(ItemRegistry.mcpamItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodPickles", "cropOnion", "foodToast", "foodSaladdressing" });
          AddRecipe(ItemRegistry.mcpamItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodGherkin", "cropOnion", "foodToast", "foodSaladdressing" });
     
          AddRecipe(ItemRegistry.ceasarsaladItem, new Object[] { "toolMixingbowl", "cropLettuce", "foodToast", "foodCheese", "cropGarlic", "foodBlackpepper" });
          AddRecipe(ItemRegistry.chaoscookieItem, new Object[] { "toolBakeware", "foodFlour", "foodChocolatebar", new ItemStack(Items.dye, 1, 5) });
          AddRecipe(ItemRegistry.chocolatebaconItem, new Object[] { "toolSaucepan", "listAllporkcooked", "foodChocolatebar" });
          AddRecipe(ItemRegistry.lambkebabItem, new Object[] { "toolCuttingboard", "listAllmuttoncooked", "cropOnion", "cropBellpepper", "stickWood" });
          AddRecipe(ItemRegistry.nutellaItem, new Object[] { "toolSaucepan", "foodChocolatebar", "foodGroundnutmeg" });
          AddRecipe(ItemRegistry.snickersbarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "cropPeanut", "foodOliveoil" });
          AddRecipe(ItemRegistry.spinachpieItem, new Object[] { "toolBakeware", "foodDough", "cropSpinach", "foodCheese", "foodToast" });
          AddRecipe(ItemRegistry.steamedspinachItem, new Object[] { "toolPot", "cropSpinach", "listAllwater" });
          AddRecipe(ItemRegistry.vegemiteontoastItem, new Object[] { "toolCuttingboard", "foodVegemite", "foodToast" });
     
          AddRecipe(ItemRegistry.holidaycakeItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropCherry", "listAllheavycream", "cropSpiceleaf" });
     
 
          AddRecipe(ItemRegistry.appleciderItem, new Object[] { "toolPot", "cropApple", "listAllsugar" });
          AddRecipe(ItemRegistry.bangersandmashItem, new Object[] { "toolSkillet", "foodPorksausage", "foodMashedpotatoes" });
          AddRecipe(ItemRegistry.batteredsausageItem, new Object[] { "toolPot", "foodPorksausage", "foodBatter" });
          AddRecipe(ItemRegistry.batterItem, new Object[] { "toolMixingbowl", "foodFlour", "listAllegg" });
          AddRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "foodSalt" });
          AddRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "dustSalt" });
          AddRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "itemSalt" });
     
          AddRecipe(ItemRegistry.coleslawItem, new Object[] { "toolMixingbowl", "cropCabbage", "cropCarrot", "foodMayo", "foodBlackpepper" });
          AddRecipe(ItemRegistry.energydrinkItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", Items.redstone });
          AddRecipe(ItemRegistry.friedonionsItem, new Object[] { "toolPot", "cropOnion", "foodOliveoil" });
          AddRecipe(ItemRegistry.meatfeastpizzaItem, new Object[] { "toolPot", "foodPizza", "foodPepperoni", "foodPorksausage", "listAllbeefcooked", Items.cooked_chicken });
          AddRecipe(ItemRegistry.mincepieItem, new Object[] { "toolBakeware", "listAllbeefcooked", "listAllfruit", "listAllnut", "foodDough", "foodButter" });
          AddRecipe(ItemRegistry.onionhamburgerItem, new Object[] { "toolCuttingboard", "foodHamburger", "foodFriedonions" });
          AddRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "foodSalt" });
          AddRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "dustSalt" });
          AddRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "itemSalt" });
          AddRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "foodSalt", "foodVinegar" });
          AddRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "dustSalt", "foodVinegar" });
          AddRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "itemSalt", "foodVinegar" });
          AddRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "foodSalt" });
          AddRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "dustSalt" });
          AddRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "itemSalt" });
          AddRecipe(ItemRegistry.raspberrytrifleItem, new Object[] { "toolBakeware", "cropRaspberry", "listAllheavycream", "foodVanilla", "foodDough" });
     
          AddRecipe(new ItemStack(ItemRegistry.pumpkincheesecakeItem, 1), new Object[] { Blocks.pumpkin, "foodCheesecake" });
          AddRecipe(ItemRegistry.pumpkinmuffinItem, new Object[] { "toolBakeware", Blocks.pumpkin, "foodFlour", "listAllegg" });
          AddRecipe(ItemRegistry.suaderoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "foodOliveoil" });
          AddRecipe(ItemRegistry.randomtacoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropOnion", "foodCheese", "cropAvocado", "listAllspice", "foodLimejuice", "foodTortilla" });
     
          AddRecipe(ItemRegistry.strawberrymilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropStrawberry", Items.snowball });
          AddRecipe(ItemRegistry.chocolatemilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "foodCocoapowder", Items.snowball });
          AddRecipe(ItemRegistry.bananamilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropBanana", Items.snowball });
          AddRecipe(ItemRegistry.cornflakesItem, new Object[] { "toolMixingbowl", "listAllmilk", "cropCorn" });
          AddRecipe(ItemRegistry.coleslawburgerItem, new Object[] { "toolCuttingboard", "foodHamburger", "foodColeslaw" });
          AddRecipe(ItemRegistry.roastchickenItem, new Object[] { "toolBakeware", "listAllchickenraw", "foodSalt", "foodBlackpepper" });
          AddRecipe(ItemRegistry.roastpotatoesItem, new Object[] { "toolBakeware", "cropPotato", "foodSalt", "foodBlackpepper" });
          AddRecipe(ItemRegistry.sundayroastItem, new Object[] { "toolBakeware", "foodRoastchicken", "foodRoastpotatoes", "listAllgreenveggie" });
          AddRecipe(ItemRegistry.bbqpulledporkItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "foodToast", "cropTomato", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.lambwithmintsauceItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropSpiceleaf", "foodVinegar", "listAllsugar" });
          AddRecipe(ItemRegistry.steakandchipsItem, new Object[] { "toolSkillet", "listAllbeefraw", "foodFries" });
     
          AddRecipe(ItemRegistry.cherryicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropCherry" });
          AddRecipe(ItemRegistry.pistachioicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropPistachio" });
          AddRecipe(new ItemStack(ItemRegistry.neapolitanicecreamItem, 3), new Object[] { "foodChocolateicecream", "foodStrawberryicecream", "foodVanillaicecream" });
          AddRecipe(new ItemStack(ItemRegistry.spumoniicecreamItem, 3), new Object[] { "foodCherryicecream", "foodPistachioicecream", "foodVanillaicecream" });
     
          AddRecipe(new ItemStack(ItemRegistry.plainyogurtItem, 2), new Object[] { "foodPlainyogurt", "listAllmilk" });
     
          AddRecipe(ItemRegistry.almondbutterItem, new Object[] { "toolJuicer", "cropAlmond" });
          AddRecipe(ItemRegistry.cashewbutterItem, new Object[] { "toolJuicer", "cropCashew" });
          AddRecipe(ItemRegistry.chestnutbutterItem, new Object[] { "toolJuicer", "cropChestnut" });
          AddRecipe(ItemRegistry.cornishpastyItem, new Object[] { "toolBakeware", "listAllbeefraw", "cropPotato", "foodDough", "cropRutabaga", "foodBlackpepper" });
          AddRecipe(ItemRegistry.cottagepieItem, new Object[] { "toolBakeware", "listAllbeefraw", "cropPotato", "cropCarrot", "foodDough", "cropPeas" });
          AddRecipe(ItemRegistry.croissantItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "listAllegg" });
          AddRecipe(ItemRegistry.currypowderItem, new Object[] { "toolMortarandpestle", "cropCurryleaf" });
          AddRecipe(ItemRegistry.dimsumItem, new Object[] { "toolPot", "cropRice", "foodDough", "cropWaterchestnut", "listAllmushroom", "listAllmeatraw" });
          AddRecipe(ItemRegistry.friedpecanokraItem, new Object[] { "toolSkillet", "cropOkra", "cropPecan", "foodOliveoil", "foodBlackpepper" });
          AddRecipe(ItemRegistry.gooseberryjellyItem, new Object[] { "toolSaucepan", "cropGooseberry", "listAllsugar" });
          AddRecipe(ItemRegistry.gooseberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGooseberryjelly", Items.bread });
          AddRecipe(ItemRegistry.gooseberrymilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropGooseberry", Items.snowball });
          AddRecipe(ItemRegistry.gooseberrypieItem, new Object[] { "toolBakeware", "cropGooseberry", "listAllsugar", "foodDough" });
          AddRecipe(ItemRegistry.gooseberrysmoothieItem, new Object[] { "toolJuicer", "cropGooseberry", Items.snowball });
          AddRecipe(ItemRegistry.pineappleyogurtItem, new Object[] { "cropGooseberry", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.hamsweetpicklesandwichItem, new Object[] { "toolCuttingboard", "foodSweetpickle", Items.bread, "listAllporkcooked", "foodMayo" });
          AddRecipe(ItemRegistry.hushpuppiesItem, new Object[] { "toolPot", "foodCornmeal", "listAllegg", "cropOnion", "foodOliveoil" });
          AddRecipe(ItemRegistry.kimchiItem, new Object[] { "toolPot", "foodSalt", "cropCabbage", "cropGarlic", "cropGinger", "cropRadish", "cropScallion", "listAllspice", "cropSesame" });
          AddRecipe(ItemRegistry.mochiItem, new Object[] { "toolMortarandpPestle", "cropRice", "listAllsugar", "listAllwater" });
          AddRecipe(ItemRegistry.museliItem, new Object[] { "toolMixingbowl", "listAllgrain", "foodRaisins", "cropPecan", "listAllsugar", "listAllmilk" });
          AddRecipe(ItemRegistry.naanItem, new Object[] { "toolSkillet", "foodDough", "cropOnion", "foodOliveoil" });
          AddRecipe(ItemRegistry.okrachipsItem, new Object[] { "toolBakeware", "cropOkra", "foodSalt", "cropSpiceleaf" });
          AddRecipe(ItemRegistry.okracreoleItem, new Object[] { "toolSkillet", "cropOkra", "cropGarlic", "cropTomato", "cropBellpepper", "cropOnion", "listAllspice" });
          AddRecipe(ItemRegistry.pistachiobutterItem, new Object[] { "toolJuicer", "cropPistachio" });
          AddRecipe(ItemRegistry.ploughmanslunchItem, new Object[] { "toolCuttingboard", Items.bread, "cropApple", "foodCheese", "foodSweetpickle", "cropOnion", "listAllporkcooked", "foodBoiledegg" });
          AddRecipe(ItemRegistry.porklomeinItem, new Object[] { "toolPot", "listAllporkraw", "foodPasta", "cropOnion", "cropCarrot", "cropCabbage", "cropGarlic", "foodSoysauce" });
          AddRecipe(ItemRegistry.salmonpattiesItem, new Object[] { "toolSkillet", "foodSalmonraw", "foodToast", "listAllegg", "foodOliveoil" });
          AddRecipe(ItemRegistry.sausageItem, new Object[] { "toolCuttingboard", "listAllmeatraw", "foodSalt", "listAllspice" });
          AddRecipe(ItemRegistry.sausagerollItem, new Object[] { "toolCuttingboard", "foodSausage", "foodDough", "listAllegg" });
          AddRecipe(ItemRegistry.sesameballItem, new Object[] { "toolPot", "cropSesame", "foodOliveoil", "cropBean", "listAllsugar", "foodFlour" });
          AddRecipe(ItemRegistry.sesamesnapsItem, new Object[] { "toolSkillet", "cropSesame", "listAllsugar" });
          AddRecipe(ItemRegistry.shrimpokrahushpuppiesItem, new Object[] { "toolPot", "foodCornmeal", "listAllegg", "cropOnion", "foodOliveoil", "foodShrimpraw", "cropOkra" });
          AddRecipe(ItemRegistry.soysauceItem, new Object[] { "toolJuicer", "cropSoybean", "listAllwater", "foodSalt" });
          AddRecipe(ItemRegistry.sweetpickleItem, new Object[] { "toolPot", "foodVinegar", "foodSalt", "cropSpiceleaf", "cropCucumber", "listAllsugar" });
          AddRecipe(ItemRegistry.veggiestripsItem, new Object[] { "toolBakeware", "listAllveggie", "listAllveggie", "listAllveggie", "foodSalt", "listAllspice" });
          AddRecipe(ItemRegistry.vindalooItem, new Object[] { "toolSaucepan", "listAllmeatraw", "foodCurrypowder", "foodButter", "foodBlackpepper", "cropOnion" });

          AddRecipe(ItemRegistry.applesmoothieItem, new Object[] { "toolJuicer", "cropApple", Items.snowball });
          AddRecipe(ItemRegistry.cheeseontoastItem, new Object[] { "toolBakeware", "foodToast", "foodCheese" });
          AddRecipe(ItemRegistry.chocolaterollItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodFlour", "listAllheavycream"});
          AddRecipe(ItemRegistry.coconutcreamItem, new Object[] { "toolPot", "cropCoconut"});
          AddRecipe(ItemRegistry.coconutsmoothieItem, new Object[] { "toolJuicer", "cropCoconut", Items.snowball });
          AddRecipe(ItemRegistry.crackerItem, new Object[] { "toolBakeware", "foodFlour", "foodOliveoil", "foodSalt", "listAllwater" });
          AddRecipe(ItemRegistry.cranberrysmoothieItem, new Object[] { "toolJuicer", "cropCranberry", Items.snowball });
          AddRecipe(ItemRegistry.cranberryyogurtItem, new Object[] { "cropCranberry", "foodPlainyogurt" });
          AddRecipe(ItemRegistry.deluxechickencurryItem, new Object[] { "toolCuttingboard", "foodChickencurry", "cropRice", "foodNaan", "foodMangochutney"});
          AddRecipe(new ItemStack(ItemRegistry.garammasalaItem, 4), new Object[] { "toolMortarandpestle", "foodBlackpepper", "foodGroundcinnamon", "cropSpiceleaf", "foodGroundnutmeg"});
          AddRecipe(ItemRegistry.grapesmoothieItem, new Object[] { "toolJuicer", "cropGrape", Items.snowball });
          AddRecipe(ItemRegistry.gravyItem, new Object[] { "foodStock", "foodFlour"});
          AddRecipe(ItemRegistry.honeysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", ItemRegistry.honeyItem, Items.bread });
          AddRecipe(ItemRegistry.jamrollItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodFlour", "foodRaspberryjam"});
          AddRecipe(ItemRegistry.mangochutneyItem, new Object[] { "toolPot", "cropMango", "cropSpiceleaf", "cropMustard", "foodOliveoil"});
          AddRecipe(ItemRegistry.marzipanItem, new Object[] { "toolMortarandpestle", ItemRegistry.honeyItem, "cropAlmond"});
          AddRecipe(ItemRegistry.paneerItem, new Object[] { "toolPot", "listAllmilk", "foodVinegar", "foodLemonjuice"});
          AddRecipe(ItemRegistry.paneertikkamasalaItem, new Object[] { "toolSaucepan", "foodPaneer", "foodGarammasala", "foodCurrypowder", "foodCoconutcream", "cropOnion", "cropBellpepper", "cropTomato", "cropGinger", "cropGarlic"});
          AddRecipe(ItemRegistry.peaandhamsoupItem, new Object[] { "toolPot", "cropPeas", "listAllporkraw", "cropOnion", "cropCarrot", "cropCelery", "foodBlackpepper"});
          AddRecipe(ItemRegistry.pearjellyItem, new Object[] { "toolSaucepan", "cropPear", "listAllsugar" });
          AddRecipe(ItemRegistry.pearjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPearjelly", Items.bread });
          AddRecipe(ItemRegistry.pearsmoothieItem, new Object[] { "toolJuicer", "cropPear", Items.snowball });
          AddRecipe(ItemRegistry.plumjellyItem, new Object[] { "toolSaucepan", "cropPlum", "listAllsugar" });
          AddRecipe(ItemRegistry.plumjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPlumjelly", Items.bread });
          AddRecipe(ItemRegistry.plumsmoothieItem, new Object[] { "toolJuicer", "cropPlum", Items.snowball });
          AddRecipe(ItemRegistry.potatoandleeksoupItem, new Object[] { "toolPot", "cropPotato", "cropLeek", "foodStock", "listAllheavycream", "cropSpiceleaf", "foodBlackpepper"});
          AddRecipe(ItemRegistry.toadintheholeItem, new Object[] { "toolBakeware", "foodYorkshirepudding", "foodSausage"});
          AddRecipe(ItemRegistry.tunapotatoItem, new Object[] { "toolCuttingboard", "foodButteredpotato", "cropCorn", "listAllfishcooked"});
          AddRecipe(ItemRegistry.yorkshirepuddingItem, new Object[] { "toolBakeware", "foodFlour", "foodSalt", "foodStock", "listAllegg", "listAllmilk"});
	
          AddRecipe(ItemRegistry.tunasaladItem, new Object[] { "toolCuttingboard", ItemRegistry.tunarawItem, "foodPickles", "foodMayo", "cropCelery", "foodBlackpepper" });
          AddRecipe(ItemRegistry.TurkishDelightItem, new Object[] { "toolPot", "listAllwater", "listAllsugar", "cropOrange", ItemRegistry.vanillabeanItem, "cropPistachio" });
          AddRecipe(ItemRegistry.VanillaConchasBreadItem, new Object[] { "toolBakeware", "foodDough", "listAllsugar", "listAllegg", "foodVanilla" });
          AddRecipe(ItemRegistry.VanillaCupcakeItem, new Object[] { "toolBakeware", "foodBatter", "listAllsugar", "listAllheavycream", "foodButter", "foodVanilla" });
          AddRecipe(ItemRegistry.wontonsoupItem, new Object[] { "toolPot", "foodStock", "foodDough", "cropScallion", "cropGinger", "foodSoysauce" });
          AddRecipe(ItemRegistry.schnitzelItem, new Object[] { "toolSkillet", "listAllporkraw", "foodFlour", "cropLemon", "foodOliveoil", "foodBlackpepper" });
          AddRecipe(ItemRegistry.bratwurstItem, new Object[] { "toolCuttingboard", "foodPorksausage", "foodPickles", "cropOnion", Items.bread });
     }


     private static void AddRecipe(Block _output, Object[] _input)
     {
          recipeList.add(new ShapelessOreRecipe(_output, _input));
     }


     private static void AddRecipe(Item _output, Object[] _input)
     {
          recipeList.add(new ShapelessOreRecipe(_output, _input));
     }


     private static void AddRecipe(ItemStack _output, Object[] _input)
     {
          recipeList.add(new ShapelessOreRecipe(_output, _input));
     }


     //#region Smelting
     private static void RegisterSmelting()
     {
          RegisterGeneralSmelting();
          RegisterCookedFish();
          RegisterOtherCookedFish();
     }


     private static void AddSmelting(Item _input, Item _output)
     {
          GameRegistry.addSmelting(_input, new ItemStack(_output, 1, 0), 0.1F);
     }


     private static void RegisterGeneralSmelting()
     {
          AddSmelting(ItemRegistry.doughItem, Items.bread);
          AddSmelting(Items.bread, ItemRegistry.toastItem);
          AddSmelting(Items.pumpkin_seeds, ItemRegistry.roastedpumpkinseedsItem);
          GameRegistry.addSmelting(Blocks.brown_mushroom, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
          GameRegistry.addSmelting(Blocks.red_mushroom, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);

          AddSmelting(ItemRegistry.asparagusItem, ItemRegistry.grilledasparagusItem);
          AddSmelting(ItemRegistry.riceItem, ItemRegistry.ricecakeItem);
          AddSmelting(ItemRegistry.tealeafItem, ItemRegistry.teaItem);
          AddSmelting(ItemRegistry.cornItem, ItemRegistry.popcornItem);
          AddSmelting(ItemRegistry.sweetpotatoItem, ItemRegistry.bakedsweetpotatoItem);
          AddSmelting(ItemRegistry.coffeebeanItem, ItemRegistry.coffeeItem);
          AddSmelting(ItemRegistry.eggplantItem, ItemRegistry.grilledeggplantItem);
          AddSmelting(ItemRegistry.grapeItem, ItemRegistry.raisinsItem);
          AddSmelting(ItemRegistry.whitemushroomItem, ItemRegistry.grilledmushroomItem);
          AddSmelting(ItemRegistry.coconutItem, ItemRegistry.toastedcoconutItem);
          AddSmelting(ItemRegistry.vanillabeanItem, ItemRegistry.vanillaItem);
          AddSmelting(ItemRegistry.chestnutItem, ItemRegistry.roastedchestnutItem);
          AddSmelting(ItemRegistry.sesameseedsItem, ItemRegistry.toastedsesameseedsItem);
     }


     private static void RegisterCookedFish()
     {
          AddSmelting(ItemRegistry.anchovyrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.bassrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.carprawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.catfishrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.charrrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.eelrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.grouperrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.herringrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.mudfishrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.perchrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.snapperrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.tilapiarawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.troutrawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.tunarawItem, Items.cooked_fish);
          AddSmelting(ItemRegistry.walleyerawItem, Items.cooked_fish);
     }


     private static void RegisterOtherCookedFish()
     {
          AddSmelting(ItemRegistry.calamarirawItem, ItemRegistry.calamaricookedItem);
          AddSmelting(ItemRegistry.clamrawItem, ItemRegistry.clamcookedItem);
          AddSmelting(ItemRegistry.crabrawItem, ItemRegistry.crabcookedItem);
          AddSmelting(ItemRegistry.crayfishrawItem, ItemRegistry.crayfishcookedItem);
          AddSmelting(ItemRegistry.frograwItem, ItemRegistry.frogcookedItem);
          AddSmelting(ItemRegistry.octopusrawItem, ItemRegistry.octopuscookedItem);
          AddSmelting(ItemRegistry.scalloprawItem, ItemRegistry.scallopcookedItem);
          AddSmelting(ItemRegistry.shrimprawItem, ItemRegistry.shrimpcookedItem);
          AddSmelting(ItemRegistry.snailrawItem, ItemRegistry.snailcookedItem);
          AddSmelting(ItemRegistry.turtlerawItem, ItemRegistry.turtlecookedItem);
     }
     //#endregion
}
