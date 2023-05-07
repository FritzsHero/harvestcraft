package com.pam.harvestcraft.item;

import com.pam.harvestcraft.harvestcraft;
import com.pam.harvestcraft.blocks.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegistry
{
        //#region "Vars"
        public static Item[] PamCropItems;
        public static Item[] PamSeeds;
        public static Item[] PamTemperateFruits;
        public static Item[] PamWarmFruits;
        public static Item[] PamLogFruits;
        public static Item[] PamAllItems;

        // #region "Tools"
        public static Item cuttingboardItem;
        public static Item potItem;
        public static Item skilletItem;
        public static Item saucepanItem;
        public static Item bakewareItem;
        public static Item mortarandpestleItem;
        public static Item mixingbowlItem;
        public static Item juicerItem;
        // #endregion

        // public static Item pamscookbookItem;
        // public static Item queenbeeItem;
        // public static Item waxcombItem;
        // public static Item honeycombItem;
        // public static Item beeswaxItem;
        public static Item honeyItem;
        // public static Item grubItem;
        // public static Item royaljellyItem;
        public static Item saltItem;
        // public static Item waxItem;
        public static Item wovencottonItem;
        public static Item freshwaterItem;
        public static Item freshmilkItem;
        // public static Item grainbaitItem;
        // public static Item veggiebaitItem;
        // public static Item fruitbaitItem;
        // public static Item fishtrapbaitItem;

        // #region "Juice"
        public static Item applejuiceItem;
        public static Item melonjuiceItem;
        public static Item carrotjuiceItem;
        public static Item strawberryjuiceItem;
        public static Item grapejuiceItem;
        public static Item blueberryjuiceItem;
        public static Item cherryjuiceItem;
        public static Item papayajuiceItem;
        public static Item starfruitjuiceItem;
        public static Item orangejuiceItem;
        public static Item peachjuiceItem;
        public static Item limejuiceItem;
        public static Item mangojuiceItem;
        public static Item pomegranatejuiceItem;
        public static Item blackberryjuiceItem;
        public static Item raspberryjuiceItem;
        public static Item kiwijuiceItem;
        public static Item cranberryjuiceItem;
        public static Item cactusfruitjuiceItem;
        public static Item plumjuiceItem;
        public static Item pearjuiceItem;
        public static Item apricotjuiceItem;
        public static Item figjuiceItem;
        public static Item grapefruitjuiceItem;
        public static Item persimmonjuiceItem;
        // #endregion

        // #region "Fish"
        public static Item anchovyrawItem;
        public static Item bassrawItem;
        public static Item carprawItem;
        public static Item catfishrawItem;
        public static Item charrrawItem;
        public static Item clamrawItem;
        public static Item crabrawItem;
        public static Item crayfishrawItem;
        public static Item eelrawItem;
        public static Item frograwItem;
        public static Item grouperrawItem;
        public static Item herringrawItem;
        public static Item jellyfishrawItem;
        public static Item mudfishrawItem;
        public static Item octopusrawItem;
        public static Item perchrawItem;
        public static Item scalloprawItem;
        public static Item shrimprawItem;
        public static Item snailrawItem;
        public static Item snapperrawItem;
        public static Item tilapiarawItem;
        public static Item troutrawItem;
        public static Item tunarawItem;
        public static Item turtlerawItem;
        public static Item walleyerawItem;
        public static Item greenheartfishItem;
        public static Item calamarirawItem;
        // #endregion

        public static Item calamaricookedItem;
        public static Item sunflowerseedsItem;
        public static Item AgaveItem;
        public static Item AmaranthItem;
        public static Item ArrowrootItem;
        public static Item CassavaItem;
        public static Item ChickpeaItem;
        public static Item ElderberryItem;
        public static Item FlaxItem;
        public static Item GigaPickleItem;
        public static Item GreenGrapeItem;
        public static Item HuckleberryItem;
        public static Item JicamaItem;
        public static Item JuniperberryItem;
        public static Item JuteItem;
        public static Item KaleItem;
        public static Item KenafItem;
        public static Item KohlrabiItem;
        public static Item LentilItem;
        public static Item MilletItem;
        public static Item MulberryItem;
        public static Item QuinoaItem;
        public static Item SisalItem;
        public static Item TaroItem;
        public static Item TomatilloItem;
        public static Item blackberryItem;
        public static Item blueberryItem;
        public static Item candleberryItem;
        public static Item raspberryItem;
        public static Item strawberryItem;
        public static Item grapeItem;
        public static Item cactusfruitItem;
        public static Item asparagusItem;
        public static Item barleyItem;
        public static Item oatsItem;
        public static Item ryeItem;
        public static Item cornItem;
        public static Item bambooshootItem;
        public static Item cantaloupeItem;
        public static Item cucumberItem;
        public static Item wintersquashItem;
        public static Item zucchiniItem;
        public static Item beetItem;
        public static Item onionItem;
        public static Item parsnipItem;
        public static Item peanutItem;
        public static Item radishItem;
        public static Item rutabagaItem;
        public static Item sweetpotatoItem;
        public static Item turnipItem;
        public static Item rhubarbItem;
        public static Item celeryItem;
        public static Item garlicItem;
        public static Item gingerItem;
        public static Item spiceleafItem;
        public static Item ediblerootItem;
        public static Item tealeafItem;
        public static Item coffeebeanItem;
        public static Item mustardseedsItem;
        public static Item broccoliItem;
        public static Item cauliflowerItem;
        public static Item leekItem;
        public static Item lettuceItem;
        public static Item scallionItem;
        public static Item artichokeItem;
        public static Item brusselsproutItem;
        public static Item cabbageItem;
        public static Item spinachItem;
        public static Item whitemushroomItem;
        public static Item beanItem;
        public static Item soybeanItem;
        public static Item bellpepperItem;
        public static Item chilipepperItem;
        public static Item eggplantItem;
        public static Item okraItem;
        public static Item peasItem;
        public static Item tomatoItem;
        public static Item cottonItem;
        public static Item pineappleItem;
        public static Item kiwiItem;
        public static Item sesameseedsItem;
        public static Item curryleafItem;
        public static Item cranberryItem;
        public static Item riceItem;
        public static Item seaweedItem;
        public static Item waterchestnutItem;
        public static Item AgaveSeedItem;
        public static Item AmaranthSeedItem;
        public static Item ArrowrootSeedItem;
        public static Item CassavaSeedItem;
        public static Item ChickpeaSeedItem;
        public static Item ElderberrySeedItem;
        public static Item FlaxSeedItem;
        public static Item GigaPickleSeedItem;
        public static Item GreenGrapeSeedItem;
        public static Item HuckleberrySeedItem;
        public static Item JicamaSeedItem;
        public static Item JuniperberrySeedItem;
        public static Item JuteSeedItem;
        public static Item KaleSeedItem;
        public static Item KenafSeedItem;
        public static Item KohlrabiSeedItem;
        public static Item LentilSeedItem;
        public static Item MilletSeedItem;
        public static Item MulberrySeedItem;
        public static Item QuinoaSeedItem;
        public static Item SisalSeedItem;
        public static Item TaroSeedItem;
        public static Item TomatilloSeedItem;
        public static Item cottonseedItem;
        public static Item asparagusseedItem;
        public static Item barleyseedItem;
        public static Item beanseedItem;
        public static Item beetseedItem;
        public static Item broccoliseedItem;
        public static Item whitemushroomseedItem;
        public static Item cauliflowerseedItem;
        public static Item celeryseedItem;
        public static Item cranberryseedItem;
        public static Item garlicseedItem;
        public static Item gingerseedItem;
        public static Item leekseedItem;
        public static Item lettuceseedItem;
        public static Item oatsseedItem;
        public static Item onionseedItem;
        public static Item parsnipseedItem;
        public static Item peanutseedItem;
        public static Item pineappleseedItem;
        public static Item radishseedItem;
        public static Item riceseedItem;
        public static Item rutabagaseedItem;
        public static Item ryeseedItem;
        public static Item scallionseedItem;
        public static Item soybeanseedItem;
        public static Item spiceleafseedItem;
        public static Item sweetpotatoseedItem;
        public static Item teaseedItem;
        public static Item turnipseedItem;
        public static Item artichokeseedItem;
        public static Item bellpepperseedItem;
        public static Item blackberryseedItem;
        public static Item blueberryseedItem;
        public static Item brusselsproutseedItem;
        public static Item cabbageseedItem;
        public static Item cactusfruitseedItem;
        public static Item candleberryseedItem;
        public static Item cantaloupeseedItem;
        public static Item chilipepperseedItem;
        public static Item coffeeseedItem;
        public static Item cornseedItem;
        public static Item cucumberseedItem;
        public static Item eggplantseedItem;
        public static Item grapeseedItem;
        public static Item kiwiseedItem;
        public static Item mustardseedItem;
        public static Item okraseedItem;
        public static Item peasseedItem;
        public static Item raspberryseedItem;
        public static Item rhubarbseedItem;
        public static Item seaweedseedItem;
        public static Item strawberryseedItem;
        public static Item tomatoseedItem;
        public static Item wintersquashseedItem;
        public static Item zucchiniseedItem;
        public static Item bambooshootseedItem;
        public static Item spinachseedItem;
        public static Item curryleafseedItem;
        public static Item sesameseedsseedItem;
        public static Item waterchestnutseedItem;

        public static Item almondItem;
        public static Item apricotItem;
        public static Item avocadoItem;
        public static Item bananaItem;
        public static Item cashewItem;
        public static Item cherryItem;
        public static Item chestnutItem;
        public static Item cinnamonItem;
        public static Item coconutItem;
        public static Item dateItem;
        public static Item dragonfruitItem;
        public static Item durianItem;
        public static Item figItem;
        public static Item grapefruitItem;
        public static Item lemonItem;
        public static Item limeItem;
        public static Item maplesyrupItem;
        public static Item mangoItem;
        public static Item nutmegItem;
        public static Item oliveItem;
        public static Item orangeItem;
        public static Item papayaItem;
        public static Item peachItem;
        public static Item pearItem;
        public static Item pecanItem;
        public static Item peppercornItem;
        public static Item persimmonItem;
        public static Item pistachioItem;
        public static Item plumItem;
        public static Item pomegranateItem;
        public static Item starfruitItem;
        public static Item vanillabeanItem;
        public static Item walnutItem;
        public static Item gooseberryItem;
        public static Item grilledasparagusItem;
        public static Item bakedsweetpotatoItem;
        public static Item teaItem;
        public static Item coffeeItem;
        public static Item popcornItem;
        public static Item grilledeggplantItem;
        public static Item raisinsItem;
        public static Item ricecakeItem;
        public static Item toastedcoconutItem;
        public static Item vanillaItem;
        public static Item toastedsesameseedsItem;
        public static Item flourItem;
        public static Item doughItem;
        public static Item toastItem;
        public static Item pastaItem;
        public static Item heavycreamItem;
        public static Item butterItem;
        public static Item cheeseItem;
        public static Item icecreamItem;
        public static Item grilledcheeseItem;
        public static Item applesauceItem;
        public static Item applepieItem;
        public static Item caramelappleItem;
        public static Item pumpkinbreadItem;
        public static Item roastedpumpkinseedsItem;
        public static Item pumpkinsoupItem;
        public static Item melonsmoothieItem;
        public static Item carrotcakeItem;
        public static Item carrotsoupItem;
        public static Item glazedcarrotsItem;
        public static Item butteredpotatoItem;
        public static Item loadedbakedpotatoItem;
        public static Item mashedpotatoesItem;
        public static Item potatosaladItem;
        public static Item potatosoupItem;
        public static Item friesItem;
        public static Item grilledmushroomItem;
        public static Item stuffedmushroomItem;
        public static Item chickensandwichItem;
        public static Item chickennoodlesoupItem;
        public static Item chickenpotpieItem;
        public static Item breadedporkchopItem;
        public static Item hotdogItem;
        public static Item bakedhamItem;
        public static Item hamburgerItem;
        public static Item cheeseburgerItem;
        public static Item baconcheeseburgerItem;
        public static Item potroastItem;
        public static Item fishsandwichItem;
        public static Item fishsticksItem;
        public static Item fishandchipsItem;
        public static Item mayoItem;
        public static Item friedeggItem;
        public static Item scrambledeggItem;
        public static Item boiledeggItem;
        public static Item eggsaladItem;
        public static Item caramelItem;
        public static Item taffyItem;
        public static Item spidereyesoupItem;
        public static Item zombiejerkyItem;
        public static Item cocoapowderItem;
        public static Item chocolatebarItem;
        public static Item hotchocolateItem;
        public static Item chocolateicecreamItem;
        public static Item vegetablesoupItem;
        public static Item stockItem;
        public static Item fruitsaladItem;
        public static Item spagettiItem;
        public static Item spagettiandmeatballsItem;
        public static Item tomatosoupItem;
        public static Item ketchupItem;
        public static Item chickenparmasanItem;
        public static Item pizzaItem;
        public static Item springsaladItem;
        public static Item porklettucewrapItem;
        public static Item fishlettucewrapItem;
        public static Item bltItem;
        public static Item leafychickensandwichItem;
        public static Item leafyfishsandwichItem;
        public static Item deluxecheeseburgerItem;
        public static Item delightedmealItem;
        public static Item onionsoupItem;
        public static Item potatocakesItem;
        public static Item hashItem;
        public static Item braisedonionsItem;
        public static Item heartybreakfastItem;
        public static Item cornonthecobItem;
        public static Item cornmealItem;
        public static Item cornbreadItem;
        public static Item tortillaItem;
        public static Item nachoesItem;
        public static Item tacoItem;
        public static Item fishtacoItem;
        public static Item creamedcornItem;
        public static Item strawberrysmoothieItem;
        public static Item strawberrypieItem;
        public static Item strawberrysaladItem;
        public static Item chocolatestrawberryItem;
        public static Item peanutbutterItem;
        public static Item trailmixItem;
        public static Item pbandjItem;
        public static Item peanutbuttercookiesItem;
        public static Item vinegarItem;
        public static Item grapejellyItem;
        public static Item grapesaladItem;
        public static Item raisincookiesItem;
        public static Item picklesItem;
        public static Item cucumbersaladItem;
        public static Item cucumbersoupItem;
        public static Item vegetarianlettucewrapItem;
        public static Item marinatedcucumbersItem;
        public static Item ricesoupItem;
        public static Item friedriceItem;
        public static Item mushroomrisottoItem;
        public static Item curryItem;
        public static Item rainbowcurryItem;
        public static Item refriedbeansItem;
        public static Item bakedbeansItem;
        public static Item beansandriceItem;
        public static Item chiliItem;
        public static Item beanburritoItem;
        public static Item stuffedpepperItem;
        public static Item veggiestirfryItem;
        public static Item grilledskewersItem;
        public static Item supremepizzaItem;
        public static Item omeletItem;
        public static Item hotwingsItem;
        public static Item chilipoppersItem;
        public static Item extremechiliItem;
        public static Item chilichocolateItem;
        public static Item lemonaideItem;
        public static Item lemonbarItem;
        public static Item fishdinnerItem;
        public static Item lemonsmoothieItem;
        public static Item lemonmeringueItem;
        public static Item candiedlemonItem;
        public static Item lemonchickenItem;
        public static Item blueberrysmoothieItem;
        public static Item blueberrypieItem;
        public static Item blueberrymuffinItem;
        public static Item pancakesItem;
        public static Item blueberrypancakesItem;
        public static Item cherrypieItem;
        public static Item chocolatecherryItem;
        public static Item cherrysmoothieItem;
        public static Item cheesecakeItem;
        public static Item cherrycheesecakeItem;
        public static Item stuffedeggplantItem;
        public static Item eggplantparmItem;
        public static Item raspberryicedteaItem;
        public static Item chaiteaItem;
        public static Item espressoItem;
        public static Item coffeeconlecheItem;
        public static Item mochaicecreamItem;
        public static Item pickledbeetsItem;
        public static Item beetsaladItem;
        public static Item beetsoupItem;
        public static Item bakedbeetsItem;
        public static Item broccolimacItem;
        public static Item broccolindipItem;
        public static Item creamedbroccolisoupItem;
        public static Item sweetpotatopieItem;
        public static Item candiedsweetpotatoesItem;
        public static Item mashedsweetpotatoesItem;
        public static Item steamedpeasItem;
        public static Item splitpeasoupItem;
        public static Item pineappleupsidedowncakeItem;
        public static Item pineapplehamItem;
        public static Item pineappleyogurtItem;
        public static Item turnipsoupItem;
        public static Item roastedrootveggiemedleyItem;
        public static Item bakedturnipsItem;
        public static Item gingerbreadItem;
        public static Item gingersnapsItem;
        public static Item candiedgingerItem;
        public static Item mustardItem;
        public static Item softpretzelandmustardItem;
        public static Item spicymustardporkItem;
        public static Item spicygreensItem;
        public static Item garlicbreadItem;
        public static Item garlicmashedpotatoesItem;
        public static Item garlicchickenItem;
        public static Item summerradishsaladItem;
        public static Item summersquashwithradishItem;
        public static Item celeryandpeanutbutterItem;
        public static Item chickencelerycasseroleItem;
        public static Item peasandceleryItem;
        public static Item celerysoupItem;
        public static Item zucchinibreadItem;
        public static Item zucchinifriesItem;
        public static Item zestyzucchiniItem;
        public static Item zucchinibakeItem;
        public static Item asparagusquicheItem;
        public static Item asparagussoupItem;
        public static Item walnutraisinbreadItem;
        public static Item candiedwalnutsItem;
        public static Item brownieItem;
        public static Item papayasmoothieItem;
        public static Item papayayogurtItem;
        public static Item starfruitsmoothieItem;
        public static Item starfruityogurtItem;
        public static Item guacamoleItem;
        public static Item creamofavocadosoupItem;
        public static Item avocadoburritoItem;
        public static Item poachedpearItem;
        public static Item fruitcrumbleItem;
        public static Item pearyogurtItem;
        public static Item plumyogurtItem;
        public static Item bananasplitItem;
        public static Item banananutbreadItem;
        public static Item bananasmoothieItem;
        public static Item bananayogurtItem;
        public static Item coconutmilkItem;
        public static Item chickencurryItem;
        public static Item coconutshrimpItem;
        public static Item coconutyogurtItem;
        public static Item orangechickenItem;
        public static Item orangesmoothieItem;
        public static Item orangeyogurtItem;
        public static Item peachcobblerItem;
        public static Item peachsmoothieItem;
        public static Item peachyogurtItem;
        public static Item keylimepieItem;
        public static Item limesmoothieItem;
        public static Item limeyogurtItem;
        public static Item mangosmoothieItem;
        public static Item mangoyogurtItem;
        public static Item pomegranatesmoothieItem;
        public static Item pomegranateyogurtItem;
        public static Item vanillayogurtItem;
        public static Item cinnamonrollItem;
        public static Item frenchtoastItem;
        public static Item marshmellowsItem;
        public static Item donutItem;
        public static Item chocolatedonutItem;
        public static Item powdereddonutItem;
        public static Item jellydonutItem;
        public static Item frosteddonutItem;
        public static Item cactussoupItem;
        public static Item wafflesItem;
        public static Item seedsoupItem;
        public static Item softpretzelItem;
        public static Item jellybeansItem;
        public static Item biscuitItem;
        public static Item creamcookieItem;
        public static Item jaffaItem;
        public static Item friedchickenItem;
        public static Item chocolatesprinklecakeItem;
        public static Item redvelvetcakeItem;
        public static Item footlongItem;
        public static Item blueberryyogurtItem;
        public static Item lemonyogurtItem;
        public static Item cherryyogurtItem;
        public static Item strawberryyogurtItem;
        public static Item grapeyogurtItem;
        public static Item chocolateyogurtItem;
        public static Item blackberrycobblerItem;
        public static Item blackberrysmoothieItem;
        public static Item blackberryyogurtItem;
        public static Item chocolatemilkItem;
        public static Item pumpkinyogurtItem;
        public static Item raspberrypieItem;
        public static Item raspberrysmoothieItem;
        public static Item raspberryyogurtItem;
        public static Item cinnamonsugardonutItem;
        public static Item melonyogurtItem;
        public static Item kiwismoothieItem;
        public static Item kiwiyogurtItem;
        public static Item plainyogurtItem;
        public static Item appleyogurtItem;
        public static Item saltedsunflowerseedsItem;
        public static Item sunflowerwheatrollsItem;
        public static Item sunflowerbroccolisaladItem;
        public static Item cranberrysauceItem;
        public static Item cranberrybarItem;
        public static Item peppermintItem;
        public static Item blackpepperItem;
        public static Item groundcinnamonItem;
        public static Item groundnutmegItem;
        public static Item oliveoilItem;
        public static Item baklavaItem;
        public static Item gummybearsItem;
        public static Item baconmushroomburgerItem;
        public static Item fruitpunchItem;
        public static Item meatystewItem;
        public static Item mixedsaladItem;
        public static Item pinacoladaItem;
        public static Item saladdressingItem;
        public static Item shepardspieItem;
        public static Item eggnogItem;
        public static Item custardItem;
        public static Item sushiItem;
        public static Item gardensoupItem;
        public static Item applejellyItem;
        public static Item applejellysandwichItem;
        public static Item blackberryjellyItem;
        public static Item blackberryjellysandwichItem;
        public static Item blueberryjellyItem;
        public static Item blueberryjellysandwichItem;
        public static Item cherryjellyItem;
        public static Item cherryjellysandwichItem;
        public static Item cranberryjellyItem;
        public static Item cranberryjellysandwichItem;
        public static Item kiwijellyItem;
        public static Item kiwijellysandwichItem;
        public static Item lemonjellyItem;
        public static Item lemonjellysandwichItem;
        public static Item limejellyItem;
        public static Item limejellysandwichItem;
        public static Item mangojellyItem;
        public static Item mangojellysandwichItem;
        public static Item orangejellyItem;
        public static Item orangejellysandwichItem;
        public static Item papayajellyItem;
        public static Item papayajellysandwichItem;
        public static Item peachjellyItem;
        public static Item peachjellysandwichItem;
        public static Item pomegranatejellyItem;
        public static Item pomegranatejellysandwichItem;
        public static Item raspberryjellyItem;
        public static Item raspberryjellysandwichItem;
        public static Item starfruitjellyItem;
        public static Item starfruitjellysandwichItem;
        public static Item strawberryjellyItem;
        public static Item strawberryjellysandwichItem;
        public static Item watermelonjellyItem;
        public static Item watermelonjellysandwichItem;
        public static Item bubblywaterItem;
        public static Item cherrysodaItem;
        public static Item colasodaItem;
        public static Item gingersodaItem;
        public static Item grapesodaItem;
        public static Item lemonlimesodaItem;
        public static Item orangesodaItem;
        public static Item rootbeersodaItem;
        public static Item strawberrysodaItem;
        public static Item caramelicecreamItem;
        public static Item mintchocolatechipicecreamItem;
        public static Item strawberryicecreamItem;
        public static Item vanillaicecreamItem;
        public static Item gingerchickenItem;
        public static Item oldworldveggiesoupItem;
        public static Item spicebunItem;
        public static Item gingeredrhubarbtartItem;
        public static Item lambbarleysoupItem;
        public static Item honeylemonlambItem;
        public static Item pumpkinoatsconesItem;
        public static Item beefjerkyItem;
        public static Item ovenroastedcauliflowerItem;
        public static Item leekbaconsoupItem;
        public static Item herbbutterparsnipsItem;
        public static Item scallionbakedpotatoItem;
        public static Item soymilkItem;
        public static Item firmtofuItem;
        public static Item silkentofuItem;
        public static Item bamboosteamedriceItem;
        public static Item roastedchestnutItem;
        public static Item sweetpotatosouffleItem;
        public static Item cashewchickenItem;
        public static Item apricotyogurtItem;
        public static Item apricotglazedporkItem;
        public static Item apricotjellyItem;
        public static Item apricotjellysandwichItem;
        public static Item apricotsmoothieItem;
        public static Item figbarItem;
        public static Item figjellyItem;
        public static Item figjellysandwichItem;
        public static Item figsmoothieItem;
        public static Item figyogurtItem;
        public static Item grapefruitjellyItem;
        public static Item grapefruitjellysandwichItem;
        public static Item grapefruitsmoothieItem;
        public static Item grapefruityogurtItem;
        public static Item grapefruitsodaItem;
        public static Item citrussaladItem;
        public static Item pecanpieItem;
        public static Item pralinesItem;
        public static Item persimmonyogurtItem;
        public static Item persimmonsmoothieItem;
        public static Item persimmonjellyItem;
        public static Item persimmonjellysandwichItem;
        public static Item pistachiobakedsalmonItem;
        public static Item baconwrappeddatesItem;
        public static Item datenutbreadItem;
        public static Item maplesyruppancakesItem;
        public static Item maplesyrupwafflesItem;
        public static Item maplesausageItem;
        public static Item mapleoatmealItem;
        public static Item peachesandcreamoatmealItem;
        public static Item cinnamonappleoatmealItem;
        public static Item maplecandiedbaconItem;
        public static Item toastsandwichItem;
        public static Item potatoandcheesepirogiItem;
        public static Item zeppoleItem;
        public static Item sausageinbreadItem;
        public static Item chocolatecaramelfudgeItem;
        public static Item lavendershortbreadItem;
        public static Item beefwellingtonItem;
        public static Item epicbaconItem;
        public static Item manjuuItem;
        public static Item chickengumboItem;
        public static Item generaltsochickenItem;
        public static Item californiarollItem;
        public static Item futomakiItem;
        public static Item beansontoastItem;
        public static Item vegemiteItem;
        public static Item honeycombchocolatebarItem;
        public static Item cherrycoconutchocolatebarItem;
        public static Item fairybreadItem;
        public static Item lamingtonItem;
        public static Item timtamItem;
        public static Item meatpieItem;
        public static Item chikorollItem;
        public static Item damperItem;
        public static Item beetburgerItem;
        public static Item pavlovaItem;
        public static Item gherkinItem;
        public static Item mcpamItem;
        public static Item ceasarsaladItem;
        public static Item chaoscookieItem;
        public static Item chocolatebaconItem;
        public static Item lambkebabItem;
        public static Item nutellaItem;
        public static Item snickersbarItem;
        public static Item spinachpieItem;
        public static Item steamedspinachItem;
        public static Item vegemiteontoastItem;
        public static Item holidaycakeItem;
        public static Item clamcookedItem;
        public static Item crabcookedItem;
        public static Item crayfishcookedItem;
        public static Item frogcookedItem;
        public static Item octopuscookedItem;
        public static Item scallopcookedItem;
        public static Item shrimpcookedItem;
        public static Item snailcookedItem;
        public static Item turtlecookedItem;
        public static Item appleciderItem;
        public static Item bangersandmashItem;
        public static Item batteredsausageItem;
        public static Item batterItem;
        public static Item chorizoItem;
        public static Item coleslawItem;
        public static Item energydrinkItem;
        public static Item friedonionsItem;
        public static Item meatfeastpizzaItem;
        public static Item mincepieItem;
        public static Item onionhamburgerItem;
        public static Item pepperoniItem;
        public static Item pickledonionsItem;
        public static Item porksausageItem;
        public static Item raspberrytrifleItem;
        public static Item pumpkincheesecakeItem;
        public static Item pumpkinmuffinItem;
        public static Item suaderoItem;
        public static Item randomtacoItem;
        public static Item turkeyrawItem;
        public static Item turkeycookedItem;
        // public static Item rabbitrawItem;
        // public static Item rabbitcookedItem;
        public static Item venisonrawItem;
        public static Item venisoncookedItem;
        public static Item strawberrymilkshakeItem;
        public static Item chocolatemilkshakeItem;
        public static Item bananamilkshakeItem;
        public static Item cornflakesItem;
        public static Item coleslawburgerItem;
        public static Item roastchickenItem;
        public static Item roastpotatoesItem;
        public static Item sundayroastItem;
        public static Item bbqpulledporkItem;
        public static Item lambwithmintsauceItem;
        public static Item steakandchipsItem;
        public static Item cherryicecreamItem;
        public static Item pistachioicecreamItem;
        public static Item neapolitanicecreamItem;
        public static Item spumoniicecreamItem;
        public static Item almondbutterItem;
        public static Item cashewbutterItem;
        public static Item chestnutbutterItem;
        public static Item cornishpastyItem;
        public static Item cottagepieItem;
        public static Item croissantItem;
        public static Item currypowderItem;
        public static Item dimsumItem;
        public static Item friedpecanokraItem;
        public static Item gooseberryjellyItem;
        public static Item gooseberryjellysandwichItem;
        public static Item gooseberrymilkshakeItem;
        public static Item gooseberrypieItem;
        public static Item gooseberrysmoothieItem;
        public static Item gooseberryyogurtItem;
        public static Item hamsweetpicklesandwichItem;
        public static Item hushpuppiesItem;
        public static Item kimchiItem;
        public static Item mochiItem;
        public static Item museliItem;
        public static Item naanItem;
        public static Item okrachipsItem;
        public static Item okracreoleItem;
        public static Item pistachiobutterItem;
        public static Item ploughmanslunchItem;
        public static Item porklomeinItem;
        public static Item salmonpattiesItem;
        public static Item sausageItem;
        public static Item sausagerollItem;
        public static Item sesameballItem;
        public static Item sesamesnapsItem;
        public static Item shrimpokrahushpuppiesItem;
        public static Item soysauceItem;
        public static Item sweetpickleItem;
        public static Item veggiestripsItem;
        public static Item vindalooItem;

        public static Item applesmoothieItem;
        public static Item cheeseontoastItem;
        public static Item chocolaterollItem;
        public static Item coconutcreamItem;
        public static Item coconutsmoothieItem;
        public static Item crackerItem;
        public static Item cranberrysmoothieItem;
        public static Item cranberryyogurtItem;
        public static Item deluxechickencurryItem;
        public static Item garammasalaItem;
        public static Item grapesmoothieItem;
        public static Item gravyItem;
        public static Item honeysandwichItem;
        public static Item jamrollItem;
        public static Item mangochutneyItem;
        public static Item marzipanItem;
        public static Item paneerItem;
        public static Item paneertikkamasalaItem;
        public static Item peaandhamsoupItem;
        public static Item pearjellyItem;
        public static Item pearjellysandwichItem;
        public static Item pearsmoothieItem;
        public static Item plumjellyItem;
        public static Item plumjellysandwichItem;
        public static Item plumsmoothieItem;
        public static Item potatoandleeksoupItem;
        public static Item toadintheholeItem;
        public static Item tunapotatoItem;
        public static Item yorkshirepuddingItem;
        public static Item tunasaladItem;
        public static Item TurkishDelightItem;
        public static Item VanillaConchasBreadItem;
        public static Item VanillaCupcakeItem;
        public static Item wontonsoupItem;
        public static Item schnitzelItem;
        public static Item bratwurstItem;

        public static int cropfoodRestore;
        public static float cropsaturationRestore;
        public static boolean squiddropCalamari;
        public static float snacksaturation;
        public static float mealsaturation;
        public static float meatymealsaturation;
        public static int freshmilkfrombucket = 8;
        public static int freshwaterfrombucket = 8;
        public static int seedrarity;
        public static boolean enablecropitemsasseeds;

        public static boolean isSaltFromWaterEnabled;
        public static boolean isSeedDroppingFromGrass;
        public static boolean enablecroptoseedRecipe;
        public static boolean isTofuAsMeatEnabled;
        public static boolean isTofuAsMilkEnabled;
        public static boolean enableharvestcraftfish;
        public static int fishtrapbaitrecipeamount;
        public static int grainbaitrecipeamount;
        public static int veggiebaitrecipeamount;
        public static int fruitbaitrecipeamount;
        public static boolean enablelistAllwaterfreshwater;
        public static boolean enablelistAllwatervanillawaterbucket;
        //#endregion


        public static void initItems(FMLPreInitializationEvent event, Configuration config)
        {
                String common = "miscellaneous recipes";

                cropfoodRestore = config.get("crops", "cropfoodRestore", 1).getInt();
                cropsaturationRestore = (float)config.get("crops", "cropsaturationRestore", 0.6D).getDouble(0.6D);
                squiddropCalamari = config.get("general", "squiddropCalamari", true).getBoolean(true);
                snacksaturation = (float)config.get("crops", "snacksaturation", 0.6D).getDouble(0.6D);
                mealsaturation = (float)config.get("crops", "mealsaturation", 1.2D).getDouble(1.2D);
                meatymealsaturation = (float)config.get("crops", "meatymealsaturation", 1.6D).getDouble(1.6D);
                //freshmilkfrombucket = config.get(common, "freshmilkfrombucket", 4).getInt();
                //freshwaterfrombucket = config.get(common, "freshwaterfrombucket", 1).getInt();
                seedrarity = config.get("seeds", "seedrarity", 1).getInt();
                enablecropitemsasseeds = config.get(common, "enablecropitemsasseeds", true).getBoolean(true);
                isSaltFromWaterEnabled = config.get(common, "isSaltFromWaterEnabled", true).getBoolean(true);
                isSeedDroppingFromGrass = config.get("seeds", "isSeedDroppingFromGrass", false).getBoolean(false);


                isTofuAsMeatEnabled = config.get(common, "isTofuAsMeatEnabled", true).getBoolean(true);
                isTofuAsMilkEnabled = config.get(common, "isTofuAsMilkEnabled", true).getBoolean(true);
                enablecroptoseedRecipe = config.get(common, "enablecroptoseedRecipe", true).getBoolean(true);

                //enableharvestcraftfish = config.get(common, "enableharvestcraftfish", true).getBoolean(true);
                //fishtrapbaitrecipeamount = config.get(common, "fishtrapbaitrecipeamount", 4).getInt();
                //grainbaitrecipeamount = config.get(common, "grainbaitrecipeamount", 4).getInt();
                //veggiebaitrecipeamount = config.get(common, "veggiebaitrecipeamount", 4).getInt();
                //fruitbaitrecipeamount = config.get(common, "fruitbaitrecipeamount", 4).getInt();

                enablelistAllwaterfreshwater = config.get(common, "enablelistAllwaterfreshwater", true).getBoolean(true);
                enablelistAllwatervanillawaterbucket = config.get(common, "enablelistAllwatervanillawaterbucket", true).getBoolean(true);
        }


        public static void loadItemRegistry()
        {
                RegisterTools();
                RegisterJuices();
                RegisterFish();


//GameRegistry.registerItem(queenbeeItem = new ItemPamBee().setUnlocalizedName("queenbeeItem").setCreativeTab(harvestcraft.modTab), "queenbeeItem");
//GameRegistry.registerItem(waxcombItem = new Item().setUnlocalizedName("waxcombItem").setCreativeTab(harvestcraft.modTab), "waxcombItem");
//GameRegistry.registerItem(honeycombItem = new Item().setUnlocalizedName("honeycombItem").setCreativeTab(harvestcraft.modTab), "honeycombItem");
//GameRegistry.registerItem(beeswaxItem = new Item().setUnlocalizedName("beeswaxItem").setCreativeTab(harvestcraft.modTab), "beeswaxItem");
GameRegistry.registerItem(honeyItem = new ItemFood(4, 0.6F, false).setUnlocalizedName("honeyItem").setCreativeTab(harvestcraft.modTab), "honeyItem");
//GameRegistry.registerItem(grubItem = new Item().setUnlocalizedName("grubItem").setCreativeTab(harvestcraft.modTab), "grubItem");
//GameRegistry.registerItem(royaljellyItem = new Item().setUnlocalizedName("royaljellyItem").setCreativeTab(harvestcraft.modTab), "royaljellyItem");
GameRegistry.registerItem(saltItem = new Item().setUnlocalizedName("saltItem").setCreativeTab(harvestcraft.modTab), "saltItem");
//GameRegistry.registerItem(waxItem = new Item().setUnlocalizedName("waxItem").setCreativeTab(harvestcraft.modTab), "waxItem");
GameRegistry.registerItem(wovencottonItem = new Item().setUnlocalizedName("wovencottonItem").setCreativeTab(harvestcraft.modTab), "wovencottonItem");
//GameRegistry.registerItem(hardenedleatherItem = new Item().setUnlocalizedName("hardenedleatherItem").setCreativeTab(harvestcraft.modTab), "hardenedleatherItem");
//GameRegistry.registerItem(grainbaitItem = new Item().setUnlocalizedName("grainbaitItem").setCreativeTab(harvestcraft.modTab), "grainbaitItem");
//GameRegistry.registerItem(veggiebaitItem = new Item().setUnlocalizedName("veggiebaitItem").setCreativeTab(harvestcraft.modTab), "veggiebaitItem");
//GameRegistry.registerItem(fruitbaitItem = new Item().setUnlocalizedName("fruitbaitItem").setCreativeTab(harvestcraft.modTab), "fruitbaitItem");
//GameRegistry.registerItem(fishtrapbaitItem = new Item().setUnlocalizedName("fishtrapbaitItem").setCreativeTab(harvestcraft.modTab), "fishtrapbaitItem");
GameRegistry.registerItem(freshwaterItem = new Item().setUnlocalizedName("freshwaterItem").setCreativeTab(harvestcraft.modTab), "freshwaterItem");
GameRegistry.registerItem(freshmilkItem = new Item().setUnlocalizedName("freshmilkItem").setCreativeTab(harvestcraft.modTab), "freshmilkItem");


                RegisterCrops();
                RegisterSeeds();
                RegisterFruits();
                RegisterSmoothies();
                RegisterPies();
                RegisterBurgers();
                RegisterJellySandwich();

                

GameRegistry.registerItem(calamaricookedItem = new ItemFood(5, meatymealsaturation, false).setUnlocalizedName("calamaricookedItem").setCreativeTab(harvestcraft.modTab), "calamaricookedItem");
GameRegistry.registerItem(sunflowerseedsItem = new ItemFood(cropfoodRestore, cropsaturationRestore, false).setUnlocalizedName("sunflowerseedsItem").setCreativeTab(harvestcraft.modTab), "sunflowerseedsItem");
GameRegistry.registerItem(gooseberryItem = new ItemFood(cropfoodRestore, false).setUnlocalizedName("gooseberryItem").setCreativeTab(harvestcraft.modTab), "gooseberryItem");
GameRegistry.registerItem(grilledasparagusItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("grilledasparagusItem").setCreativeTab(harvestcraft.modTab), "grilledasparagusItem");
GameRegistry.registerItem(bakedsweetpotatoItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("bakedsweetpotatoItem").setCreativeTab(harvestcraft.modTab), "bakedsweetpotatoItem");
GameRegistry.registerItem(teaItem = new ItemPamPotionFood(4, snacksaturation, false).setUnlocalizedName("teaItem").setCreativeTab(harvestcraft.modTab), "teaItem");
GameRegistry.registerItem(coffeeItem = new ItemPamPotionFood(4, snacksaturation, false).setUnlocalizedName("coffeeItem").setCreativeTab(harvestcraft.modTab), "coffeeItem");
GameRegistry.registerItem(popcornItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("popcornItem").setCreativeTab(harvestcraft.modTab), "popcornItem");
GameRegistry.registerItem(grilledeggplantItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("grilledeggplantItem").setCreativeTab(harvestcraft.modTab), "grilledeggplantItem");
GameRegistry.registerItem(raisinsItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("raisinsItem").setCreativeTab(harvestcraft.modTab), "raisinsItem");
GameRegistry.registerItem(ricecakeItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("ricecakeItem").setCreativeTab(harvestcraft.modTab), "ricecakeItem");
GameRegistry.registerItem(toastedcoconutItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("toastedcoconutItem").setCreativeTab(harvestcraft.modTab), "toastedcoconutItem");
GameRegistry.registerItem(vanillaItem = new Item().setUnlocalizedName("vanillaItem").setCreativeTab(harvestcraft.modTab), "vanillaItem");
GameRegistry.registerItem(toastedsesameseedsItem = new Item().setUnlocalizedName("toastedsesameseedsItem").setCreativeTab(harvestcraft.modTab), "toastedsesameseedsItem");
GameRegistry.registerItem(flourItem = new Item().setUnlocalizedName("flourItem").setCreativeTab(harvestcraft.modTab), "flourItem");
GameRegistry.registerItem(doughItem = new Item().setUnlocalizedName("doughItem").setCreativeTab(harvestcraft.modTab), "doughItem");
GameRegistry.registerItem(toastItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("toastItem").setCreativeTab(harvestcraft.modTab), "toastItem");
GameRegistry.registerItem(pastaItem = new Item().setUnlocalizedName("pastaItem").setCreativeTab(harvestcraft.modTab), "pastaItem");
GameRegistry.registerItem(heavycreamItem = new Item().setUnlocalizedName("heavycreamItem").setCreativeTab(harvestcraft.modTab), "heavycreamItem");
GameRegistry.registerItem(butterItem = new Item().setUnlocalizedName("butterItem").setCreativeTab(harvestcraft.modTab), "butterItem");
GameRegistry.registerItem(cheeseItem = new ItemFood(2, mealsaturation, false).setUnlocalizedName("cheeseItem").setCreativeTab(harvestcraft.modTab), "cheeseItem");
GameRegistry.registerItem(icecreamItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("icecreamItem").setCreativeTab(harvestcraft.modTab), "icecreamItem");
GameRegistry.registerItem(grilledcheeseItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("grilledcheeseItem").setCreativeTab(harvestcraft.modTab), "grilledcheeseItem");
GameRegistry.registerItem(applesauceItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("applesauceItem").setCreativeTab(harvestcraft.modTab), "applesauceItem");
GameRegistry.registerItem(caramelappleItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("caramelappleItem").setCreativeTab(harvestcraft.modTab), "caramelappleItem");
GameRegistry.registerItem(pumpkinbreadItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("pumpkinbreadItem").setCreativeTab(harvestcraft.modTab), "pumpkinbreadItem");
GameRegistry.registerItem(roastedpumpkinseedsItem = new ItemFood(2, snacksaturation, false).setUnlocalizedName("roastedpumpkinseedsItem").setCreativeTab(harvestcraft.modTab), "roastedpumpkinseedsItem");
GameRegistry.registerItem(pumpkinsoupItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("pumpkinsoupItem").setCreativeTab(harvestcraft.modTab), "pumpkinsoupItem");
GameRegistry.registerItem(carrotcakeItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("carrotcakeItem").setCreativeTab(harvestcraft.modTab), "carrotcakeItem");
GameRegistry.registerItem(carrotsoupItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("carrotsoupItem").setCreativeTab(harvestcraft.modTab), "carrotsoupItem");
GameRegistry.registerItem(glazedcarrotsItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("glazedcarrotsItem").setCreativeTab(harvestcraft.modTab), "glazedcarrotsItem");
GameRegistry.registerItem(butteredpotatoItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("butteredpotatoItem").setCreativeTab(harvestcraft.modTab), "butteredpotatoItem");
GameRegistry.registerItem(loadedbakedpotatoItem = new ItemFood(11, meatymealsaturation, false).setUnlocalizedName("loadedbakedpotatoItem").setCreativeTab(harvestcraft.modTab), "loadedbakedpotatoItem");
GameRegistry.registerItem(mashedpotatoesItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("mashedpotatoesItem").setCreativeTab(harvestcraft.modTab), "mashedpotatoesItem");
GameRegistry.registerItem(potatosaladItem = new ItemFood(7, meatymealsaturation, false).setUnlocalizedName("potatosaladItem").setCreativeTab(harvestcraft.modTab), "potatosaladItem");
GameRegistry.registerItem(potatosoupItem = new ItemFood(6, meatymealsaturation, false).setUnlocalizedName("potatosoupItem").setCreativeTab(harvestcraft.modTab), "potatosoupItem");
GameRegistry.registerItem(friesItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("friesItem").setCreativeTab(harvestcraft.modTab), "friesItem");
GameRegistry.registerItem(grilledmushroomItem = new ItemFood(2, mealsaturation, false).setUnlocalizedName("grilledmushroomItem").setCreativeTab(harvestcraft.modTab), "grilledmushroomItem");
GameRegistry.registerItem(stuffedmushroomItem = new ItemFood(6, meatymealsaturation, false).setUnlocalizedName("stuffedmushroomItem").setCreativeTab(harvestcraft.modTab), "stuffedmushroomItem");
GameRegistry.registerItem(chickensandwichItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("chickensandwichItem").setCreativeTab(harvestcraft.modTab), "chickensandwichItem");
GameRegistry.registerItem(chickennoodlesoupItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("chickennoodlesoupItem").setCreativeTab(harvestcraft.modTab), "chickennoodlesoupItem");
GameRegistry.registerItem(breadedporkchopItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("breadedporkchopItem").setCreativeTab(harvestcraft.modTab), "breadedporkchopItem");
GameRegistry.registerItem(hotdogItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("hotdogItem").setCreativeTab(harvestcraft.modTab), "hotdogItem");
GameRegistry.registerItem(bakedhamItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("bakedhamItem").setCreativeTab(harvestcraft.modTab), "bakedhamItem");
GameRegistry.registerItem(potroastItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("potroastItem").setCreativeTab(harvestcraft.modTab), "potroastItem");
GameRegistry.registerItem(fishsandwichItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("fishsandwichItem").setCreativeTab(harvestcraft.modTab), "fishsandwichItem");
GameRegistry.registerItem(fishsticksItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("fishsticksItem").setCreativeTab(harvestcraft.modTab), "fishsticksItem");
GameRegistry.registerItem(fishandchipsItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("fishandchipsItem").setCreativeTab(harvestcraft.modTab), "fishandchipsItem");
GameRegistry.registerItem(mayoItem = new Item().setUnlocalizedName("mayoItem").setCreativeTab(harvestcraft.modTab), "mayoItem");
GameRegistry.registerItem(friedeggItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("friedeggItem").setCreativeTab(harvestcraft.modTab), "friedeggItem");
GameRegistry.registerItem(scrambledeggItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("scrambledeggItem").setCreativeTab(harvestcraft.modTab), "scrambledeggItem");
GameRegistry.registerItem(boiledeggItem = new ItemFood(2, mealsaturation, false).setUnlocalizedName("boiledeggItem").setCreativeTab(harvestcraft.modTab), "boiledeggItem");
GameRegistry.registerItem(eggsaladItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("eggsaladItem").setCreativeTab(harvestcraft.modTab), "eggsaladItem");
GameRegistry.registerItem(caramelItem = new ItemFood(2, snacksaturation, false).setUnlocalizedName("caramelItem").setCreativeTab(harvestcraft.modTab), "caramelItem");
GameRegistry.registerItem(taffyItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("taffyItem").setCreativeTab(harvestcraft.modTab), "taffyItem");
GameRegistry.registerItem(spidereyesoupItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("spidereyesoupItem").setCreativeTab(harvestcraft.modTab), "spidereyesoupItem");
GameRegistry.registerItem(zombiejerkyItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("zombiejerkyItem").setCreativeTab(harvestcraft.modTab), "zombiejerkyItem");
GameRegistry.registerItem(cocoapowderItem = new Item().setUnlocalizedName("cocoapowderItem").setCreativeTab(harvestcraft.modTab), "cocoapowderItem");
GameRegistry.registerItem(chocolatebarItem = new ItemFood(5, snacksaturation, false).setUnlocalizedName("chocolatebarItem").setCreativeTab(harvestcraft.modTab), "chocolatebarItem");
GameRegistry.registerItem(hotchocolateItem = new ItemPamPotionFood(4, mealsaturation, false).setUnlocalizedName("hotchocolateItem").setCreativeTab(harvestcraft.modTab), "hotchocolateItem");
GameRegistry.registerItem(chocolateicecreamItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("chocolateicecreamItem").setCreativeTab(harvestcraft.modTab), "chocolateicecreamItem");
GameRegistry.registerItem(vegetablesoupItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("vegetablesoupItem").setCreativeTab(harvestcraft.modTab), "vegetablesoupItem");
GameRegistry.registerItem(stockItem = new ItemFood(3, mealsaturation, false).setUnlocalizedName("stockItem").setCreativeTab(harvestcraft.modTab), "stockItem");
GameRegistry.registerItem(fruitsaladItem = new ItemFood(6, meatymealsaturation, false).setUnlocalizedName("fruitsaladItem").setCreativeTab(harvestcraft.modTab), "fruitsaladItem");
GameRegistry.registerItem(spagettiItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("spagettiItem").setCreativeTab(harvestcraft.modTab), "spagettiItem");
GameRegistry.registerItem(spagettiandmeatballsItem = new ItemFood(11, meatymealsaturation, false).setUnlocalizedName("spagettiandmeatballsItem").setCreativeTab(harvestcraft.modTab), "spagettiandmeatballsItem");
GameRegistry.registerItem(tomatosoupItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("tomatosoupItem").setCreativeTab(harvestcraft.modTab), "tomatosoupItem");
GameRegistry.registerItem(ketchupItem = new Item().setUnlocalizedName("ketchupItem").setCreativeTab(harvestcraft.modTab), "ketchupItem");
GameRegistry.registerItem(chickenparmasanItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("chickenparmasanItem").setCreativeTab(harvestcraft.modTab), "chickenparmasanItem");
GameRegistry.registerItem(pizzaItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("pizzaItem").setCreativeTab(harvestcraft.modTab), "pizzaItem");
GameRegistry.registerItem(springsaladItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("springsaladItem").setCreativeTab(harvestcraft.modTab), "springsaladItem");
GameRegistry.registerItem(porklettucewrapItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("porklettucewrapItem").setCreativeTab(harvestcraft.modTab), "porklettucewrapItem");
GameRegistry.registerItem(fishlettucewrapItem = new ItemFood(6, meatymealsaturation, false).setUnlocalizedName("fishlettucewrapItem").setCreativeTab(harvestcraft.modTab), "fishlettucewrapItem");
GameRegistry.registerItem(bltItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("bltItem").setCreativeTab(harvestcraft.modTab), "bltItem");
GameRegistry.registerItem(leafychickensandwichItem = new ItemFood(11, meatymealsaturation, false).setUnlocalizedName("leafychickensandwichItem").setCreativeTab(harvestcraft.modTab), "leafychickensandwichItem");
GameRegistry.registerItem(leafyfishsandwichItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("leafyfishsandwichItem").setCreativeTab(harvestcraft.modTab), "leafyfishsandwichItem");
GameRegistry.registerItem(delightedmealItem = new ItemFood(18, meatymealsaturation, false).setUnlocalizedName("delightedmealItem").setCreativeTab(harvestcraft.modTab), "delightedmealItem");
GameRegistry.registerItem(onionsoupItem = new ItemFood(12, mealsaturation, false).setUnlocalizedName("onionsoupItem").setCreativeTab(harvestcraft.modTab), "onionsoupItem");
GameRegistry.registerItem(potatocakesItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("potatocakesItem").setCreativeTab(harvestcraft.modTab), "potatocakesItem");
GameRegistry.registerItem(hashItem = new ItemFood(11, mealsaturation, false).setUnlocalizedName("hashItem").setCreativeTab(harvestcraft.modTab), "hashItem");
GameRegistry.registerItem(braisedonionsItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("braisedonionsItem").setCreativeTab(harvestcraft.modTab), "braisedonionsItem");
GameRegistry.registerItem(heartybreakfastItem = new ItemFood(18, meatymealsaturation, false).setUnlocalizedName("heartybreakfastItem").setCreativeTab(harvestcraft.modTab), "heartybreakfastItem");
GameRegistry.registerItem(cornonthecobItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("cornonthecobItem").setCreativeTab(harvestcraft.modTab), "cornonthecobItem");
GameRegistry.registerItem(cornmealItem = new Item().setUnlocalizedName("cornmealItem").setCreativeTab(harvestcraft.modTab), "cornmealItem");
GameRegistry.registerItem(cornbreadItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("cornbreadItem").setCreativeTab(harvestcraft.modTab), "cornbreadItem");
GameRegistry.registerItem(tortillaItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("tortillaItem").setCreativeTab(harvestcraft.modTab), "tortillaItem");
GameRegistry.registerItem(nachoesItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("nachoesItem").setCreativeTab(harvestcraft.modTab), "nachoesItem");
GameRegistry.registerItem(tacoItem = new ItemFood(11, meatymealsaturation, false).setUnlocalizedName("tacoItem").setCreativeTab(harvestcraft.modTab), "tacoItem");
GameRegistry.registerItem(fishtacoItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("fishtacoItem").setCreativeTab(harvestcraft.modTab), "fishtacoItem");
GameRegistry.registerItem(creamedcornItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("creamedcornItem").setCreativeTab(harvestcraft.modTab), "creamedcornItem");
GameRegistry.registerItem(strawberrysaladItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("strawberrysaladItem").setCreativeTab(harvestcraft.modTab), "strawberrysaladItem");
GameRegistry.registerItem(chocolatestrawberryItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("chocolatestrawberryItem").setCreativeTab(harvestcraft.modTab), "chocolatestrawberryItem");
GameRegistry.registerItem(peanutbutterItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("peanutbutterItem").setCreativeTab(harvestcraft.modTab), "peanutbutterItem");
GameRegistry.registerItem(trailmixItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("trailmixItem").setCreativeTab(harvestcraft.modTab), "trailmixItem");
GameRegistry.registerItem(pbandjItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("pbandjItem").setCreativeTab(harvestcraft.modTab), "pbandjItem");
GameRegistry.registerItem(peanutbuttercookiesItem = new ItemFood(9, snacksaturation, false).setUnlocalizedName("peanutbuttercookiesItem").setCreativeTab(harvestcraft.modTab), "peanutbuttercookiesItem");
GameRegistry.registerItem(vinegarItem = new Item().setUnlocalizedName("vinegarItem").setCreativeTab(harvestcraft.modTab), "vinegarItem");
GameRegistry.registerItem(grapesaladItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("grapesaladItem").setCreativeTab(harvestcraft.modTab), "grapesaladItem");
GameRegistry.registerItem(raisincookiesItem = new ItemFood(9, snacksaturation, false).setUnlocalizedName("raisincookiesItem").setCreativeTab(harvestcraft.modTab), "raisincookiesItem");
GameRegistry.registerItem(picklesItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("picklesItem").setCreativeTab(harvestcraft.modTab), "picklesItem");
GameRegistry.registerItem(cucumbersaladItem = new ItemFood(11, mealsaturation, false).setUnlocalizedName("cucumbersaladItem").setCreativeTab(harvestcraft.modTab), "cucumbersaladItem");
GameRegistry.registerItem(cucumbersoupItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("cucumbersoupItem").setCreativeTab(harvestcraft.modTab), "cucumbersoupItem");
GameRegistry.registerItem(vegetarianlettucewrapItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("vegetarianlettucewrapItem").setCreativeTab(harvestcraft.modTab), "vegetarianlettucewrapItem");
GameRegistry.registerItem(marinatedcucumbersItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("marinatedcucumbersItem").setCreativeTab(harvestcraft.modTab), "marinatedcucumbersItem");
GameRegistry.registerItem(ricesoupItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("ricesoupItem").setCreativeTab(harvestcraft.modTab), "ricesoupItem");
GameRegistry.registerItem(friedriceItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("friedriceItem").setCreativeTab(harvestcraft.modTab), "friedriceItem");
GameRegistry.registerItem(mushroomrisottoItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("mushroomrisottoItem").setCreativeTab(harvestcraft.modTab), "mushroomrisottoItem");
GameRegistry.registerItem(curryItem = new ItemFood(11, mealsaturation, false).setUnlocalizedName("curryItem").setCreativeTab(harvestcraft.modTab), "curryItem");
GameRegistry.registerItem(rainbowcurryItem = new ItemFood(12, mealsaturation, false).setUnlocalizedName("rainbowcurryItem").setCreativeTab(harvestcraft.modTab), "rainbowcurryItem");
GameRegistry.registerItem(refriedbeansItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("refriedbeansItem").setCreativeTab(harvestcraft.modTab), "refriedbeansItem");
GameRegistry.registerItem(bakedbeansItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("bakedbeansItem").setCreativeTab(harvestcraft.modTab), "bakedbeansItem");
GameRegistry.registerItem(beansandriceItem = new ItemFood(11, meatymealsaturation, false).setUnlocalizedName("beansandriceItem").setCreativeTab(harvestcraft.modTab), "beansandriceItem");
GameRegistry.registerItem(chiliItem = new ItemFood(13, meatymealsaturation, false).setUnlocalizedName("chiliItem").setCreativeTab(harvestcraft.modTab), "chiliItem");
GameRegistry.registerItem(beanburritoItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("beanburritoItem").setCreativeTab(harvestcraft.modTab), "beanburritoItem");
GameRegistry.registerItem(stuffedpepperItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("stuffedpepperItem").setCreativeTab(harvestcraft.modTab), "stuffedpepperItem");
GameRegistry.registerItem(veggiestirfryItem = new ItemFood(12, mealsaturation, false).setUnlocalizedName("veggiestirfryItem").setCreativeTab(harvestcraft.modTab), "veggiestirfryItem");
GameRegistry.registerItem(grilledskewersItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("grilledskewersItem").setCreativeTab(harvestcraft.modTab), "grilledskewersItem");
GameRegistry.registerItem(supremepizzaItem = new ItemFood(13, meatymealsaturation, false).setUnlocalizedName("supremepizzaItem").setCreativeTab(harvestcraft.modTab), "supremepizzaItem");
GameRegistry.registerItem(omeletItem = new ItemFood(7, meatymealsaturation, false).setUnlocalizedName("omeletItem").setCreativeTab(harvestcraft.modTab), "omeletItem");
GameRegistry.registerItem(hotwingsItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("hotwingsItem").setCreativeTab(harvestcraft.modTab), "hotwingsItem");
GameRegistry.registerItem(chilipoppersItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("chilipoppersItem").setCreativeTab(harvestcraft.modTab), "chilipoppersItem");
GameRegistry.registerItem(extremechiliItem = new ItemFood(14, meatymealsaturation, false).setUnlocalizedName("extremechiliItem").setCreativeTab(harvestcraft.modTab), "extremechiliItem");
GameRegistry.registerItem(chilichocolateItem = new ItemFood(6, snacksaturation, false).setUnlocalizedName("chilichocolateItem").setCreativeTab(harvestcraft.modTab), "chilichocolateItem");
GameRegistry.registerItem(lemonaideItem = new ItemPamPotionFood(6, mealsaturation, false).setUnlocalizedName("lemonaideItem").setCreativeTab(harvestcraft.modTab), "lemonaideItem");
GameRegistry.registerItem(lemonbarItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("lemonbarItem").setCreativeTab(harvestcraft.modTab), "lemonbarItem");
GameRegistry.registerItem(fishdinnerItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("fishdinnerItem").setCreativeTab(harvestcraft.modTab), "fishdinnerItem");
GameRegistry.registerItem(lemonmeringueItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("lemonmeringueItem").setCreativeTab(harvestcraft.modTab), "lemonmeringueItem");
GameRegistry.registerItem(candiedlemonItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("candiedlemonItem").setCreativeTab(harvestcraft.modTab), "candiedlemonItem");
GameRegistry.registerItem(lemonchickenItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("lemonchickenItem").setCreativeTab(harvestcraft.modTab), "lemonchickenItem");
GameRegistry.registerItem(blueberrymuffinItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("blueberrymuffinItem").setCreativeTab(harvestcraft.modTab), "blueberrymuffinItem");
GameRegistry.registerItem(pancakesItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("pancakesItem").setCreativeTab(harvestcraft.modTab), "pancakesItem");
GameRegistry.registerItem(blueberrypancakesItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("blueberrypancakesItem").setCreativeTab(harvestcraft.modTab), "blueberrypancakesItem");
GameRegistry.registerItem(chocolatecherryItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("chocolatecherryItem").setCreativeTab(harvestcraft.modTab), "chocolatecherryItem");
GameRegistry.registerItem(cheesecakeItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("cheesecakeItem").setCreativeTab(harvestcraft.modTab), "cheesecakeItem");
GameRegistry.registerItem(cherrycheesecakeItem = new ItemFood(12, snacksaturation, false).setUnlocalizedName("cherrycheesecakeItem").setCreativeTab(harvestcraft.modTab), "cherrycheesecakeItem");
GameRegistry.registerItem(stuffedeggplantItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("stuffedeggplantItem").setCreativeTab(harvestcraft.modTab), "stuffedeggplantItem");
GameRegistry.registerItem(eggplantparmItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("eggplantparmItem").setCreativeTab(harvestcraft.modTab), "eggplantparmItem");
GameRegistry.registerItem(raspberryicedteaItem = new ItemPamPotionFood(7, snacksaturation, false).setUnlocalizedName("raspberryicedteaItem").setCreativeTab(harvestcraft.modTab), "raspberryicedteaItem");
GameRegistry.registerItem(chaiteaItem = new ItemPamPotionFood(9, snacksaturation, false).setUnlocalizedName("chaiteaItem").setCreativeTab(harvestcraft.modTab), "chaiteaItem");
GameRegistry.registerItem(espressoItem = new ItemPamPotionFood(8, snacksaturation, false).setUnlocalizedName("espressoItem").setCreativeTab(harvestcraft.modTab), "espressoItem");
GameRegistry.registerItem(coffeeconlecheItem = new ItemPamPotionFood(10, snacksaturation, false).setUnlocalizedName("coffeeconlecheItem").setCreativeTab(harvestcraft.modTab), "coffeeconlecheItem");
GameRegistry.registerItem(mochaicecreamItem = new ItemFood(10, snacksaturation, false).setUnlocalizedName("mochaicecreamItem").setCreativeTab(harvestcraft.modTab), "mochaicecreamItem");
GameRegistry.registerItem(pickledbeetsItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("pickledbeetsItem").setCreativeTab(harvestcraft.modTab), "pickledbeetsItem");
GameRegistry.registerItem(beetsaladItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("beetsaladItem").setCreativeTab(harvestcraft.modTab), "beetsaladItem");
GameRegistry.registerItem(beetsoupItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("beetsoupItem").setCreativeTab(harvestcraft.modTab), "beetsoupItem");
GameRegistry.registerItem(bakedbeetsItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("bakedbeetsItem").setCreativeTab(harvestcraft.modTab), "bakedbeetsItem");
GameRegistry.registerItem(broccolimacItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("broccolimacItem").setCreativeTab(harvestcraft.modTab), "broccolimacItem");
GameRegistry.registerItem(broccolindipItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("broccolindipItem").setCreativeTab(harvestcraft.modTab), "broccolindipItem");
GameRegistry.registerItem(creamedbroccolisoupItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("creamedbroccolisoupItem").setCreativeTab(harvestcraft.modTab), "creamedbroccolisoupItem");
GameRegistry.registerItem(candiedsweetpotatoesItem = new ItemFood(7, snacksaturation, false).setUnlocalizedName("candiedsweetpotatoesItem").setCreativeTab(harvestcraft.modTab), "candiedsweetpotatoesItem");
GameRegistry.registerItem(mashedsweetpotatoesItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("mashedsweetpotatoesItem").setCreativeTab(harvestcraft.modTab), "mashedsweetpotatoesItem");
GameRegistry.registerItem(steamedpeasItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("steamedpeasItem").setCreativeTab(harvestcraft.modTab), "steamedpeasItem");
GameRegistry.registerItem(splitpeasoupItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("splitpeasoupItem").setCreativeTab(harvestcraft.modTab), "splitpeasoupItem");
GameRegistry.registerItem(pineappleupsidedowncakeItem = new ItemFood(10, snacksaturation, false).setUnlocalizedName("pineappleupsidedowncakeItem").setCreativeTab(harvestcraft.modTab), "pineappleupsidedowncakeItem");
GameRegistry.registerItem(pineapplehamItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("pineapplehamItem").setCreativeTab(harvestcraft.modTab), "pineapplehamItem");
GameRegistry.registerItem(turnipsoupItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("turnipsoupItem").setCreativeTab(harvestcraft.modTab), "turnipsoupItem");
GameRegistry.registerItem(roastedrootveggiemedleyItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("roastedrootveggiemedleyItem").setCreativeTab(harvestcraft.modTab), "roastedrootveggiemedleyItem");
GameRegistry.registerItem(bakedturnipsItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("bakedturnipsItem").setCreativeTab(harvestcraft.modTab), "bakedturnipsItem");
GameRegistry.registerItem(gingerbreadItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("gingerbreadItem").setCreativeTab(harvestcraft.modTab), "gingerbreadItem");
GameRegistry.registerItem(gingersnapsItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("gingersnapsItem").setCreativeTab(harvestcraft.modTab), "gingersnapsItem");
GameRegistry.registerItem(candiedgingerItem = new ItemFood(6, snacksaturation, false).setUnlocalizedName("candiedgingerItem").setCreativeTab(harvestcraft.modTab), "candiedgingerItem");
GameRegistry.registerItem(mustardItem = new Item().setUnlocalizedName("mustardItem").setCreativeTab(harvestcraft.modTab), "mustardItem");
GameRegistry.registerItem(softpretzelandmustardItem = new ItemFood(10, snacksaturation, false).setUnlocalizedName("softpretzelandmustardItem").setCreativeTab(harvestcraft.modTab), "softpretzelandmustardItem");
GameRegistry.registerItem(spicymustardporkItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("spicymustardporkItem").setCreativeTab(harvestcraft.modTab), "spicymustardporkItem");
GameRegistry.registerItem(spicygreensItem = new ItemFood(11, mealsaturation, false).setUnlocalizedName("spicygreensItem").setCreativeTab(harvestcraft.modTab), "spicygreensItem");
GameRegistry.registerItem(garlicbreadItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("garlicbreadItem").setCreativeTab(harvestcraft.modTab), "garlicbreadItem");
GameRegistry.registerItem(garlicmashedpotatoesItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("garlicmashedpotatoesItem").setCreativeTab(harvestcraft.modTab), "garlicmashedpotatoesItem");
GameRegistry.registerItem(garlicchickenItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("garlicchickenItem").setCreativeTab(harvestcraft.modTab), "garlicchickenItem");
GameRegistry.registerItem(summerradishsaladItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("summerradishsaladItem").setCreativeTab(harvestcraft.modTab), "summerradishsaladItem");
GameRegistry.registerItem(summersquashwithradishItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("summersquashwithradishItem").setCreativeTab(harvestcraft.modTab), "summersquashwithradishItem");
GameRegistry.registerItem(celeryandpeanutbutterItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("celeryandpeanutbutterItem").setCreativeTab(harvestcraft.modTab), "celeryandpeanutbutterItem");
GameRegistry.registerItem(chickencelerycasseroleItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("chickencelerycasseroleItem").setCreativeTab(harvestcraft.modTab), "chickencelerycasseroleItem");
GameRegistry.registerItem(peasandceleryItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("peasandceleryItem").setCreativeTab(harvestcraft.modTab), "peasandceleryItem");
GameRegistry.registerItem(celerysoupItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("celerysoupItem").setCreativeTab(harvestcraft.modTab), "celerysoupItem");
GameRegistry.registerItem(zucchinibreadItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("zucchinibreadItem").setCreativeTab(harvestcraft.modTab), "zucchinibreadItem");
GameRegistry.registerItem(zucchinifriesItem = new ItemFood(12, mealsaturation, false).setUnlocalizedName("zucchinifriesItem").setCreativeTab(harvestcraft.modTab), "zucchinifriesItem");
GameRegistry.registerItem(zestyzucchiniItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("zestyzucchiniItem").setCreativeTab(harvestcraft.modTab), "zestyzucchiniItem");
GameRegistry.registerItem(zucchinibakeItem = new ItemFood(12, mealsaturation, false).setUnlocalizedName("zucchinibakeItem").setCreativeTab(harvestcraft.modTab), "zucchinibakeItem");
GameRegistry.registerItem(asparagusquicheItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("asparagusquicheItem").setCreativeTab(harvestcraft.modTab), "asparagusquicheItem");
GameRegistry.registerItem(asparagussoupItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("asparagussoupItem").setCreativeTab(harvestcraft.modTab), "asparagussoupItem");
GameRegistry.registerItem(walnutraisinbreadItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("walnutraisinbreadItem").setCreativeTab(harvestcraft.modTab), "walnutraisinbreadItem");
GameRegistry.registerItem(candiedwalnutsItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("candiedwalnutsItem").setCreativeTab(harvestcraft.modTab), "candiedwalnutsItem");
GameRegistry.registerItem(brownieItem = new ItemFood(10, snacksaturation, false).setUnlocalizedName("brownieItem").setCreativeTab(harvestcraft.modTab), "brownieItem");
GameRegistry.registerItem(guacamoleItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("guacamoleItem").setCreativeTab(harvestcraft.modTab), "guacamoleItem");
GameRegistry.registerItem(creamofavocadosoupItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("creamofavocadosoupItem").setCreativeTab(harvestcraft.modTab), "creamofavocadosoupItem");
GameRegistry.registerItem(avocadoburritoItem = new ItemFood(14, meatymealsaturation, false).setUnlocalizedName("avocadoburritoItem").setCreativeTab(harvestcraft.modTab), "avocadoburritoItem");
GameRegistry.registerItem(poachedpearItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("poachedpearItem").setCreativeTab(harvestcraft.modTab), "poachedpearItem");
GameRegistry.registerItem(fruitcrumbleItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("fruitcrumbleItem").setCreativeTab(harvestcraft.modTab), "fruitcrumbleItem");
GameRegistry.registerItem(bananasplitItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("bananasplitItem").setCreativeTab(harvestcraft.modTab), "bananasplitItem");
GameRegistry.registerItem(banananutbreadItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("banananutbreadItem").setCreativeTab(harvestcraft.modTab), "banananutbreadItem");
GameRegistry.registerItem(coconutmilkItem = new ItemPamPotionFood(5, mealsaturation, false).setUnlocalizedName("coconutmilkItem").setCreativeTab(harvestcraft.modTab), "coconutmilkItem");
GameRegistry.registerItem(chickencurryItem = new ItemFood(14, meatymealsaturation, false).setUnlocalizedName("chickencurryItem").setCreativeTab(harvestcraft.modTab), "chickencurryItem");
GameRegistry.registerItem(coconutshrimpItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("coconutshrimpItem").setCreativeTab(harvestcraft.modTab), "coconutshrimpItem");
GameRegistry.registerItem(orangechickenItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("orangechickenItem").setCreativeTab(harvestcraft.modTab), "orangechickenItem");
GameRegistry.registerItem(peachcobblerItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("peachcobblerItem").setCreativeTab(harvestcraft.modTab), "peachcobblerItem");
GameRegistry.registerItem(cinnamonrollItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("cinnamonrollItem").setCreativeTab(harvestcraft.modTab), "cinnamonrollItem");
GameRegistry.registerItem(frenchtoastItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("frenchtoastItem").setCreativeTab(harvestcraft.modTab), "frenchtoastItem");
GameRegistry.registerItem(marshmellowsItem = new ItemFood(5, snacksaturation, false).setUnlocalizedName("marshmellowsItem").setCreativeTab(harvestcraft.modTab), "marshmellowsItem");
GameRegistry.registerItem(donutItem = new ItemFood(6, snacksaturation, false).setUnlocalizedName("donutItem").setCreativeTab(harvestcraft.modTab), "donutItem");
GameRegistry.registerItem(chocolatedonutItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("chocolatedonutItem").setCreativeTab(harvestcraft.modTab), "chocolatedonutItem");
GameRegistry.registerItem(powdereddonutItem = new ItemFood(7, snacksaturation, false).setUnlocalizedName("powdereddonutItem").setCreativeTab(harvestcraft.modTab), "powdereddonutItem");
GameRegistry.registerItem(jellydonutItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("jellydonutItem").setCreativeTab(harvestcraft.modTab), "jellydonutItem");
GameRegistry.registerItem(frosteddonutItem = new ItemFood(9, snacksaturation, false).setUnlocalizedName("frosteddonutItem").setCreativeTab(harvestcraft.modTab), "frosteddonutItem");
GameRegistry.registerItem(cactussoupItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("cactussoupItem").setCreativeTab(harvestcraft.modTab), "cactussoupItem");
GameRegistry.registerItem(wafflesItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("wafflesItem").setCreativeTab(harvestcraft.modTab), "wafflesItem");
GameRegistry.registerItem(seedsoupItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("seedsoupItem").setCreativeTab(harvestcraft.modTab), "seedsoupItem");
GameRegistry.registerItem(softpretzelItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("softpretzelItem").setCreativeTab(harvestcraft.modTab), "softpretzelItem");
GameRegistry.registerItem(jellybeansItem = new ItemFood(5, snacksaturation, false).setUnlocalizedName("jellybeansItem").setCreativeTab(harvestcraft.modTab), "jellybeansItem");
GameRegistry.registerItem(biscuitItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("biscuitItem").setCreativeTab(harvestcraft.modTab), "biscuitItem");
GameRegistry.registerItem(creamcookieItem = new ItemFood(7, snacksaturation, false).setUnlocalizedName("creamcookieItem").setCreativeTab(harvestcraft.modTab), "creamcookieItem");
GameRegistry.registerItem(jaffaItem = new ItemFood(9, snacksaturation, false).setUnlocalizedName("jaffaItem").setCreativeTab(harvestcraft.modTab), "jaffaItem");
GameRegistry.registerItem(friedchickenItem = new ItemFood(11, meatymealsaturation, false).setUnlocalizedName("friedchickenItem").setCreativeTab(harvestcraft.modTab), "friedchickenItem");
GameRegistry.registerItem(chocolatesprinklecakeItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("chocolatesprinklecakeItem").setCreativeTab(harvestcraft.modTab), "chocolatesprinklecakeItem");
GameRegistry.registerItem(redvelvetcakeItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("redvelvetcakeItem").setCreativeTab(harvestcraft.modTab), "redvelvetcakeItem");
GameRegistry.registerItem(footlongItem = new ItemFood(14, meatymealsaturation, false).setUnlocalizedName("footlongItem").setCreativeTab(harvestcraft.modTab), "footlongItem");
GameRegistry.registerItem(blackberrycobblerItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("blackberrycobblerItem").setCreativeTab(harvestcraft.modTab), "blackberrycobblerItem");
GameRegistry.registerItem(chocolatemilkItem = new ItemPamPotionFood(6, mealsaturation, false).setUnlocalizedName("chocolatemilkItem").setCreativeTab(harvestcraft.modTab), "chocolatemilkItem");
GameRegistry.registerItem(cinnamonsugardonutItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("cinnamonsugardonutItem").setCreativeTab(harvestcraft.modTab), "cinnamonsugardonutItem");
GameRegistry.registerItem(saltedsunflowerseedsItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("saltedsunflowerseedsItem").setCreativeTab(harvestcraft.modTab), "saltedsunflowerseedsItem");
GameRegistry.registerItem(sunflowerwheatrollsItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("sunflowerwheatrollsItem").setCreativeTab(harvestcraft.modTab), "sunflowerwheatrollsItem");
GameRegistry.registerItem(sunflowerbroccolisaladItem = new ItemFood(13, mealsaturation, false).setUnlocalizedName("sunflowerbroccolisaladItem").setCreativeTab(harvestcraft.modTab), "sunflowerbroccolisaladItem");
GameRegistry.registerItem(cranberrysauceItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("cranberrysauceItem").setCreativeTab(harvestcraft.modTab), "cranberrysauceItem");
GameRegistry.registerItem(cranberrybarItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("cranberrybarItem").setCreativeTab(harvestcraft.modTab), "cranberrybarItem");
GameRegistry.registerItem(peppermintItem = new ItemFood(5, snacksaturation, false).setUnlocalizedName("peppermintItem").setCreativeTab(harvestcraft.modTab), "peppermintItem");
GameRegistry.registerItem(blackpepperItem = new Item().setUnlocalizedName("blackpepperItem").setCreativeTab(harvestcraft.modTab), "blackpepperItem");
GameRegistry.registerItem(groundcinnamonItem = new Item().setUnlocalizedName("groundcinnamonItem").setCreativeTab(harvestcraft.modTab), "groundcinnamonItem");
GameRegistry.registerItem(groundnutmegItem = new Item().setUnlocalizedName("groundnutmegItem").setCreativeTab(harvestcraft.modTab), "groundnutmegItem");
GameRegistry.registerItem(oliveoilItem = new Item().setUnlocalizedName("oliveoilItem").setCreativeTab(harvestcraft.modTab), "oliveoilItem");
GameRegistry.registerItem(baklavaItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("baklavaItem").setCreativeTab(harvestcraft.modTab), "baklavaItem");
GameRegistry.registerItem(gummybearsItem = new ItemFood(5, snacksaturation, false).setUnlocalizedName("gummybearsItem").setCreativeTab(harvestcraft.modTab), "gummybearsItem");
GameRegistry.registerItem(fruitpunchItem = new ItemPamPotionFood(6, mealsaturation, false).setUnlocalizedName("fruitpunchItem").setCreativeTab(harvestcraft.modTab), "fruitpunchItem");
GameRegistry.registerItem(meatystewItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("meatystewItem").setCreativeTab(harvestcraft.modTab), "meatystewItem");
GameRegistry.registerItem(mixedsaladItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("mixedsaladItem").setCreativeTab(harvestcraft.modTab), "mixedsaladItem");
GameRegistry.registerItem(pinacoladaItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("pinacoladaItem").setCreativeTab(harvestcraft.modTab), "pinacoladaItem");
GameRegistry.registerItem(saladdressingItem = new Item().setUnlocalizedName("saladdressingItem").setCreativeTab(harvestcraft.modTab), "saladdressingItem");
GameRegistry.registerItem(eggnogItem = new ItemPamPotionFood(6, mealsaturation, false).setUnlocalizedName("eggnogItem").setCreativeTab(harvestcraft.modTab), "eggnogItem");
GameRegistry.registerItem(custardItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("custardItem").setCreativeTab(harvestcraft.modTab), "custardItem");
GameRegistry.registerItem(sushiItem = new ItemFood(6, meatymealsaturation, false).setUnlocalizedName("sushiItem").setCreativeTab(harvestcraft.modTab), "sushiItem");
GameRegistry.registerItem(gardensoupItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("gardensoupItem").setCreativeTab(harvestcraft.modTab), "gardensoupItem");


GameRegistry.registerItem(bubblywaterItem = new Item().setUnlocalizedName("bubblywaterItem").setCreativeTab(harvestcraft.modTab), "bubblywaterItem");
GameRegistry.registerItem(cherrysodaItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("cherrysodaItem").setCreativeTab(harvestcraft.modTab), "cherrysodaItem");
GameRegistry.registerItem(colasodaItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("colasodaItem").setCreativeTab(harvestcraft.modTab), "colasodaItem");
GameRegistry.registerItem(gingersodaItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("gingersodaItem").setCreativeTab(harvestcraft.modTab), "gingersodaItem");
GameRegistry.registerItem(grapesodaItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("grapesodaItem").setCreativeTab(harvestcraft.modTab), "grapesodaItem");
GameRegistry.registerItem(lemonlimesodaItem = new ItemPamPotionFood(3, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("lemonlimesodaItem").setCreativeTab(harvestcraft.modTab), "lemonlimesodaItem");
GameRegistry.registerItem(orangesodaItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("orangesodaItem").setCreativeTab(harvestcraft.modTab), "orangesodaItem");
GameRegistry.registerItem(rootbeersodaItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("rootbeersodaItem").setCreativeTab(harvestcraft.modTab), "rootbeersodaItem");
GameRegistry.registerItem(strawberrysodaItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("strawberrysodaItem").setCreativeTab(harvestcraft.modTab), "strawberrysodaItem");
GameRegistry.registerItem(grapefruitsodaItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("grapefruitsodaItem").setCreativeTab(harvestcraft.modTab), "grapefruitsodaItem");


GameRegistry.registerItem(caramelicecreamItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("caramelicecreamItem").setCreativeTab(harvestcraft.modTab), "caramelicecreamItem");
GameRegistry.registerItem(mintchocolatechipicecreamItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("mintchocolatechipicecreamItem").setCreativeTab(harvestcraft.modTab), "mintchocolatechipicecreamItem");
GameRegistry.registerItem(strawberryicecreamItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("strawberryicecreamItem").setCreativeTab(harvestcraft.modTab), "strawberryicecreamItem");
GameRegistry.registerItem(vanillaicecreamItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("vanillaicecreamItem").setCreativeTab(harvestcraft.modTab), "vanillaicecreamItem");
GameRegistry.registerItem(gingerchickenItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("gingerchickenItem").setCreativeTab(harvestcraft.modTab), "gingerchickenItem");
GameRegistry.registerItem(oldworldveggiesoupItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("oldworldveggiesoupItem").setCreativeTab(harvestcraft.modTab), "oldworldveggiesoupItem");
GameRegistry.registerItem(spicebunItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("spicebunItem").setCreativeTab(harvestcraft.modTab), "spicebunItem");
GameRegistry.registerItem(gingeredrhubarbtartItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("gingeredrhubarbtartItem").setCreativeTab(harvestcraft.modTab), "gingeredrhubarbtartItem");
GameRegistry.registerItem(lambbarleysoupItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("lambbarleysoupItem").setCreativeTab(harvestcraft.modTab), "lambbarleysoupItem");
GameRegistry.registerItem(honeylemonlambItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("honeylemonlambItem").setCreativeTab(harvestcraft.modTab), "honeylemonlambItem");
GameRegistry.registerItem(pumpkinoatsconesItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("pumpkinoatsconesItem").setCreativeTab(harvestcraft.modTab), "pumpkinoatsconesItem");
GameRegistry.registerItem(beefjerkyItem = new ItemFood(5, meatymealsaturation, false).setUnlocalizedName("beefjerkyItem").setCreativeTab(harvestcraft.modTab), "beefjerkyItem");
GameRegistry.registerItem(ovenroastedcauliflowerItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("ovenroastedcauliflowerItem").setCreativeTab(harvestcraft.modTab), "ovenroastedcauliflowerItem");
GameRegistry.registerItem(leekbaconsoupItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("leekbaconsoupItem").setCreativeTab(harvestcraft.modTab), "leekbaconsoupItem");
GameRegistry.registerItem(herbbutterparsnipsItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("herbbutterparsnipsItem").setCreativeTab(harvestcraft.modTab), "herbbutterparsnipsItem");
GameRegistry.registerItem(scallionbakedpotatoItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("scallionbakedpotatoItem").setCreativeTab(harvestcraft.modTab), "scallionbakedpotatoItem");
GameRegistry.registerItem(soymilkItem = new ItemPamPotionFood(4, mealsaturation, false).setUnlocalizedName("soymilkItem").setCreativeTab(harvestcraft.modTab), "soymilkItem");
GameRegistry.registerItem(firmtofuItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("firmtofuItem").setCreativeTab(harvestcraft.modTab), "firmtofuItem");
GameRegistry.registerItem(silkentofuItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("silkentofuItem").setCreativeTab(harvestcraft.modTab), "silkentofuItem");
GameRegistry.registerItem(bamboosteamedriceItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("bamboosteamedriceItem").setCreativeTab(harvestcraft.modTab), "bamboosteamedriceItem");
GameRegistry.registerItem(roastedchestnutItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("roastedchestnutItem").setCreativeTab(harvestcraft.modTab), "roastedchestnutItem");
GameRegistry.registerItem(sweetpotatosouffleItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("sweetpotatosouffleItem").setCreativeTab(harvestcraft.modTab), "sweetpotatosouffleItem");
GameRegistry.registerItem(cashewchickenItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("cashewchickenItem").setCreativeTab(harvestcraft.modTab), "cashewchickenItem");
GameRegistry.registerItem(apricotglazedporkItem = new ItemFood(6, meatymealsaturation, false).setUnlocalizedName("apricotglazedporkItem").setCreativeTab(harvestcraft.modTab), "apricotglazedporkItem");
GameRegistry.registerItem(figbarItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("figbarItem").setCreativeTab(harvestcraft.modTab), "figbarItem");
GameRegistry.registerItem(citrussaladItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("citrussaladItem").setCreativeTab(harvestcraft.modTab), "citrussaladItem");
GameRegistry.registerItem(pralinesItem = new ItemFood(6, snacksaturation, false).setUnlocalizedName("pralinesItem").setCreativeTab(harvestcraft.modTab), "pralinesItem");
GameRegistry.registerItem(pistachiobakedsalmonItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("pistachiobakedsalmonItem").setCreativeTab(harvestcraft.modTab), "pistachiobakedsalmonItem");
GameRegistry.registerItem(baconwrappeddatesItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("baconwrappeddatesItem").setCreativeTab(harvestcraft.modTab), "baconwrappeddatesItem");
GameRegistry.registerItem(datenutbreadItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("datenutbreadItem").setCreativeTab(harvestcraft.modTab), "datenutbreadItem");
GameRegistry.registerItem(maplesyruppancakesItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("maplesyruppancakesItem").setCreativeTab(harvestcraft.modTab), "maplesyruppancakesItem");
GameRegistry.registerItem(maplesyrupwafflesItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("maplesyrupwafflesItem").setCreativeTab(harvestcraft.modTab), "maplesyrupwafflesItem");
GameRegistry.registerItem(maplesausageItem = new ItemFood(1, meatymealsaturation, false).setUnlocalizedName("maplesausageItem").setCreativeTab(harvestcraft.modTab), "maplesausageItem");
GameRegistry.registerItem(mapleoatmealItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("mapleoatmealItem").setCreativeTab(harvestcraft.modTab), "mapleoatmealItem");
GameRegistry.registerItem(peachesandcreamoatmealItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("peachesandcreamoatmealItem").setCreativeTab(harvestcraft.modTab), "peachesandcreamoatmealItem");
GameRegistry.registerItem(cinnamonappleoatmealItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("cinnamonappleoatmealItem").setCreativeTab(harvestcraft.modTab), "cinnamonappleoatmealItem");
GameRegistry.registerItem(maplecandiedbaconItem = new ItemFood(6, meatymealsaturation, false).setUnlocalizedName("maplecandiedbaconItem").setCreativeTab(harvestcraft.modTab), "maplecandiedbaconItem");
GameRegistry.registerItem(toastsandwichItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("toastsandwichItem").setCreativeTab(harvestcraft.modTab), "toastsandwichItem");
GameRegistry.registerItem(potatoandcheesepirogiItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("potatoandcheesepirogiItem").setCreativeTab(harvestcraft.modTab), "potatoandcheesepirogiItem");
GameRegistry.registerItem(zeppoleItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("zeppoleItem").setCreativeTab(harvestcraft.modTab), "zeppoleItem");
GameRegistry.registerItem(sausageinbreadItem = new ItemFood(18, meatymealsaturation, false).setUnlocalizedName("sausageinbreadItem").setCreativeTab(harvestcraft.modTab), "sausageinbreadItem");
GameRegistry.registerItem(chocolatecaramelfudgeItem = new ItemFood(6, snacksaturation, false).setUnlocalizedName("chocolatecaramelfudgeItem").setCreativeTab(harvestcraft.modTab), "chocolatecaramelfudgeItem");
GameRegistry.registerItem(lavendershortbreadItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("lavendershortbreadItem").setCreativeTab(harvestcraft.modTab), "lavendershortbreadItem");
GameRegistry.registerItem(beefwellingtonItem = new ItemFood(18, meatymealsaturation, false).setUnlocalizedName("beefwellingtonItem").setCreativeTab(harvestcraft.modTab), "beefwellingtonItem");
GameRegistry.registerItem(epicbaconItem = new ItemFood(18, meatymealsaturation, false).setUnlocalizedName("epicbaconItem").setCreativeTab(harvestcraft.modTab), "epicbaconItem");
GameRegistry.registerItem(manjuuItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("manjuuItem").setCreativeTab(harvestcraft.modTab), "manjuuItem");
GameRegistry.registerItem(chickengumboItem = new ItemFood(16, meatymealsaturation, false).setUnlocalizedName("chickengumboItem").setCreativeTab(harvestcraft.modTab), "chickengumboItem");
GameRegistry.registerItem(generaltsochickenItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("generaltsochickenItem").setCreativeTab(harvestcraft.modTab), "generaltsochickenItem");
GameRegistry.registerItem(californiarollItem = new ItemFood(7, meatymealsaturation, false).setUnlocalizedName("californiarollItem").setCreativeTab(harvestcraft.modTab), "californiarollItem");
GameRegistry.registerItem(futomakiItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("futomakiItem").setCreativeTab(harvestcraft.modTab), "futomakiItem");
GameRegistry.registerItem(beansontoastItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("beansontoastItem").setCreativeTab(harvestcraft.modTab), "beansontoastItem");
GameRegistry.registerItem(vegemiteItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("vegemiteItem").setCreativeTab(harvestcraft.modTab), "vegemiteItem");
GameRegistry.registerItem(honeycombchocolatebarItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("honeycombchocolatebarItem").setCreativeTab(harvestcraft.modTab), "honeycombchocolatebarItem");
GameRegistry.registerItem(cherrycoconutchocolatebarItem = new ItemFood(10, snacksaturation, false).setUnlocalizedName("cherrycoconutchocolatebarItem").setCreativeTab(harvestcraft.modTab), "cherrycoconutchocolatebarItem");
GameRegistry.registerItem(fairybreadItem = new ItemFood(5, snacksaturation, false).setUnlocalizedName("fairybreadItem").setCreativeTab(harvestcraft.modTab), "fairybreadItem");
GameRegistry.registerItem(lamingtonItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("lamingtonItem").setCreativeTab(harvestcraft.modTab), "lamingtonItem");
GameRegistry.registerItem(timtamItem = new ItemFood(9, snacksaturation, false).setUnlocalizedName("timtamItem").setCreativeTab(harvestcraft.modTab), "timtamItem");
GameRegistry.registerItem(chikorollItem = new ItemFood(14, meatymealsaturation, false).setUnlocalizedName("chikorollItem").setCreativeTab(harvestcraft.modTab), "chikorollItem");
GameRegistry.registerItem(damperItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("damperItem").setCreativeTab(harvestcraft.modTab), "damperItem");
GameRegistry.registerItem(pavlovaItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("pavlovaItem").setCreativeTab(harvestcraft.modTab), "pavlovaItem");
GameRegistry.registerItem(gherkinItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("gherkinItem").setCreativeTab(harvestcraft.modTab), "gherkinItem");
GameRegistry.registerItem(mcpamItem = new ItemFood(16, meatymealsaturation, false).setUnlocalizedName("mcpamItem").setCreativeTab(harvestcraft.modTab), "mcpamItem");
GameRegistry.registerItem(ceasarsaladItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("ceasarsaladItem").setCreativeTab(harvestcraft.modTab), "ceasarsaladItem");
GameRegistry.registerItem(chaoscookieItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("chaoscookieItem").setCreativeTab(harvestcraft.modTab), "chaoscookieItem");
GameRegistry.registerItem(chocolatebaconItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("chocolatebaconItem").setCreativeTab(harvestcraft.modTab), "chocolatebaconItem");
GameRegistry.registerItem(lambkebabItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("lambkebabItem").setCreativeTab(harvestcraft.modTab), "lambkebabItem");
GameRegistry.registerItem(nutellaItem = new ItemFood(7, snacksaturation, false).setUnlocalizedName("nutellaItem").setCreativeTab(harvestcraft.modTab), "nutellaItem");
GameRegistry.registerItem(snickersbarItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("snickersbarItem").setCreativeTab(harvestcraft.modTab), "snickersbarItem");
GameRegistry.registerItem(steamedspinachItem = new ItemFood(2, mealsaturation, false).setUnlocalizedName("steamedspinachItem").setCreativeTab(harvestcraft.modTab), "steamedspinachItem");
GameRegistry.registerItem(vegemiteontoastItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("vegemiteontoastItem").setCreativeTab(harvestcraft.modTab), "vegemiteontoastItem");
GameRegistry.registerItem(holidaycakeItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("holidaycakeItem").setCreativeTab(harvestcraft.modTab), "holidaycakeItem");
GameRegistry.registerItem(clamcookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("clamcookedItem").setCreativeTab(harvestcraft.modTab), "clamcookedItem");
GameRegistry.registerItem(crabcookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("crabcookedItem").setCreativeTab(harvestcraft.modTab), "crabcookedItem");
GameRegistry.registerItem(crayfishcookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("crayfishcookedItem").setCreativeTab(harvestcraft.modTab), "crayfishcookedItem");
GameRegistry.registerItem(frogcookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("frogcookedItem").setCreativeTab(harvestcraft.modTab), "frogcookedItem");
GameRegistry.registerItem(octopuscookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("octopuscookedItem").setCreativeTab(harvestcraft.modTab), "octopuscookedItem");
GameRegistry.registerItem(scallopcookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("scallopcookedItem").setCreativeTab(harvestcraft.modTab), "scallopcookedItem");
GameRegistry.registerItem(shrimpcookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("shrimpcookedItem").setCreativeTab(harvestcraft.modTab), "shrimpcookedItem");
GameRegistry.registerItem(snailcookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("snailcookedItem").setCreativeTab(harvestcraft.modTab), "snailcookedItem");
GameRegistry.registerItem(turtlecookedItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("turtlecookedItem").setCreativeTab(harvestcraft.modTab), "turtlecookedItem");
GameRegistry.registerItem(appleciderItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("appleciderItem").setCreativeTab(harvestcraft.modTab), "appleciderItem");
GameRegistry.registerItem(bangersandmashItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("bangersandmashItem").setCreativeTab(harvestcraft.modTab), "bangersandmashItem");
GameRegistry.registerItem(batteredsausageItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("batteredsausageItem").setCreativeTab(harvestcraft.modTab), "batteredsausageItem");
GameRegistry.registerItem(batterItem = new Item().setUnlocalizedName("batterItem").setCreativeTab(harvestcraft.modTab), "batterItem");
GameRegistry.registerItem(chorizoItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("chorizoItem").setCreativeTab(harvestcraft.modTab), "chorizoItem");
GameRegistry.registerItem(coleslawItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("coleslawItem").setCreativeTab(harvestcraft.modTab), "coleslawItem");
GameRegistry.registerItem(energydrinkItem = new ItemPamPotionFood(2, snacksaturation, false).setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F).setAlwaysEdible().setUnlocalizedName("energydrinkItem").setCreativeTab(harvestcraft.modTab), "energydrinkItem");
GameRegistry.registerItem(friedonionsItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("friedonionsItem").setCreativeTab(harvestcraft.modTab), "friedonionsItem");
GameRegistry.registerItem(meatfeastpizzaItem = new ItemFood(18, meatymealsaturation, false).setUnlocalizedName("meatfeastpizzaItem").setCreativeTab(harvestcraft.modTab), "meatfeastpizzaItem");
GameRegistry.registerItem(pepperoniItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("pepperoniItem").setCreativeTab(harvestcraft.modTab), "pepperoniItem");
GameRegistry.registerItem(pickledonionsItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("pickledonionsItem").setCreativeTab(harvestcraft.modTab), "pickledonionsItem");
GameRegistry.registerItem(porksausageItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("porksausageItem").setCreativeTab(harvestcraft.modTab), "porksausageItem");
GameRegistry.registerItem(raspberrytrifleItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("raspberrytrifleItem").setCreativeTab(harvestcraft.modTab), "raspberrytrifleItem");
GameRegistry.registerItem(pumpkincheesecakeItem = new ItemFood(12, snacksaturation, false).setUnlocalizedName("pumpkincheesecakeItem").setCreativeTab(harvestcraft.modTab), "pumpkincheesecakeItem");
GameRegistry.registerItem(pumpkinmuffinItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("pumpkinmuffinItem").setCreativeTab(harvestcraft.modTab), "pumpkinmuffinItem");
GameRegistry.registerItem(suaderoItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("suaderoItem").setCreativeTab(harvestcraft.modTab), "suaderoItem");
GameRegistry.registerItem(randomtacoItem = new ItemFood(16, mealsaturation, false).setUnlocalizedName("randomtacoItem").setCreativeTab(harvestcraft.modTab), "randomtacoItem");
GameRegistry.registerItem(turkeyrawItem = new ItemFood(2, snacksaturation, true).setUnlocalizedName("turkeyrawItem").setCreativeTab(harvestcraft.modTab), "turkeyrawItem");
GameRegistry.registerItem(turkeycookedItem = new ItemFood(5, meatymealsaturation, true).setUnlocalizedName("turkeycookedItem").setCreativeTab(harvestcraft.modTab), "turkeycookedItem");
GameRegistry.registerItem(venisonrawItem = new ItemFood(3, snacksaturation, true).setUnlocalizedName("venisonrawItem").setCreativeTab(harvestcraft.modTab), "venisonrawItem");
GameRegistry.registerItem(venisoncookedItem = new ItemFood(8, meatymealsaturation, true).setUnlocalizedName("venisoncookedItem").setCreativeTab(harvestcraft.modTab), "venisoncookedItem");
GameRegistry.registerItem(strawberrymilkshakeItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("strawberrymilkshakeItem").setCreativeTab(harvestcraft.modTab), "strawberrymilkshakeItem");
GameRegistry.registerItem(chocolatemilkshakeItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("chocolatemilkshakeItem").setCreativeTab(harvestcraft.modTab), "chocolatemilkshakeItem");
GameRegistry.registerItem(bananamilkshakeItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("bananamilkshakeItem").setCreativeTab(harvestcraft.modTab), "bananamilkshakeItem");
GameRegistry.registerItem(cornflakesItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("cornflakesItem").setCreativeTab(harvestcraft.modTab), "cornflakesItem");
GameRegistry.registerItem(roastchickenItem = new ItemFood(9, meatymealsaturation, false).setUnlocalizedName("roastchickenItem").setCreativeTab(harvestcraft.modTab), "roastchickenItem");
GameRegistry.registerItem(roastpotatoesItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("roastpotatoesItem").setCreativeTab(harvestcraft.modTab), "roastpotatoesItem");
GameRegistry.registerItem(sundayroastItem = new ItemFood(14, meatymealsaturation, false).setUnlocalizedName("sundayroastItem").setCreativeTab(harvestcraft.modTab), "sundayroastItem");
GameRegistry.registerItem(bbqpulledporkItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("bbqpulledporkItem").setCreativeTab(harvestcraft.modTab), "bbqpulledporkItem");
GameRegistry.registerItem(lambwithmintsauceItem = new ItemFood(11, meatymealsaturation, false).setUnlocalizedName("lambwithmintsauceItem").setCreativeTab(harvestcraft.modTab), "lambwithmintsauceItem");
GameRegistry.registerItem(steakandchipsItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("steakandchipsItem").setCreativeTab(harvestcraft.modTab), "steakandchipsItem");
GameRegistry.registerItem(cherryicecreamItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("cherryicecreamItem").setCreativeTab(harvestcraft.modTab), "cherryicecreamItem");
GameRegistry.registerItem(pistachioicecreamItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("pistachioicecreamItem").setCreativeTab(harvestcraft.modTab), "pistachioicecreamItem");
GameRegistry.registerItem(neapolitanicecreamItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("neapolitanicecreamItem").setCreativeTab(harvestcraft.modTab), "neapolitanicecreamItem");
GameRegistry.registerItem(spumoniicecreamItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("spumoniicecreamItem").setCreativeTab(harvestcraft.modTab), "spumoniicecreamItem");
GameRegistry.registerItem(almondbutterItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("almondbutterItem").setCreativeTab(harvestcraft.modTab), "almondbutterItem");
GameRegistry.registerItem(cashewbutterItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("cashewbutterItem").setCreativeTab(harvestcraft.modTab), "cashewbutterItem");
GameRegistry.registerItem(chestnutbutterItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("chestnutbutterItem").setCreativeTab(harvestcraft.modTab), "chestnutbutterItem");
GameRegistry.registerItem(cornishpastyItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("cornishpastyItem").setCreativeTab(harvestcraft.modTab), "cornishpastyItem");
GameRegistry.registerItem(croissantItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("croissantItem").setCreativeTab(harvestcraft.modTab), "croissantItem");
GameRegistry.registerItem(currypowderItem = new Item().setUnlocalizedName("currypowderItem").setCreativeTab(harvestcraft.modTab), "currypowderItem");
GameRegistry.registerItem(dimsumItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("dimsumItem").setCreativeTab(harvestcraft.modTab), "dimsumItem");
GameRegistry.registerItem(friedpecanokraItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("friedpecanokraItem").setCreativeTab(harvestcraft.modTab), "friedpecanokraItem");
GameRegistry.registerItem(gooseberrymilkshakeItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("gooseberrymilkshakeItem").setCreativeTab(harvestcraft.modTab), "gooseberrymilkshakeItem");
GameRegistry.registerItem(hamsweetpicklesandwichItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("hamsweetpicklesandwichItem").setCreativeTab(harvestcraft.modTab), "hamsweetpicklesandwichItem");
GameRegistry.registerItem(hushpuppiesItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("hushpuppiesItem").setCreativeTab(harvestcraft.modTab), "hushpuppiesItem");
GameRegistry.registerItem(kimchiItem = new ItemFood(10, mealsaturation, false).setUnlocalizedName("kimchiItem").setCreativeTab(harvestcraft.modTab), "kimchiItem");
GameRegistry.registerItem(mochiItem = new ItemFood(3, snacksaturation, false).setUnlocalizedName("mochiItem").setCreativeTab(harvestcraft.modTab), "mochiItem");
GameRegistry.registerItem(museliItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("museliItem").setCreativeTab(harvestcraft.modTab), "museliItem");
GameRegistry.registerItem(naanItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("naanItem").setCreativeTab(harvestcraft.modTab), "naanItem");
GameRegistry.registerItem(okrachipsItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("okrachipsItem").setCreativeTab(harvestcraft.modTab), "okrachipsItem");
GameRegistry.registerItem(okracreoleItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("okracreoleItem").setCreativeTab(harvestcraft.modTab), "okracreoleItem");
GameRegistry.registerItem(pistachiobutterItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("pistachiobutterItem").setCreativeTab(harvestcraft.modTab), "pistachiobutterItem");
GameRegistry.registerItem(ploughmanslunchItem = new ItemFood(14, meatymealsaturation, false).setUnlocalizedName("ploughmanslunchItem").setCreativeTab(harvestcraft.modTab), "ploughmanslunchItem");
GameRegistry.registerItem(porklomeinItem = new ItemFood(14, meatymealsaturation, false).setUnlocalizedName("porklomeinItem").setCreativeTab(harvestcraft.modTab), "porklomeinItem");
GameRegistry.registerItem(salmonpattiesItem = new ItemFood(12, meatymealsaturation, false).setUnlocalizedName("salmonpattiesItem").setCreativeTab(harvestcraft.modTab), "salmonpattiesItem");
GameRegistry.registerItem(sausageItem = new ItemFood(6, meatymealsaturation, false).setUnlocalizedName("sausageItem").setCreativeTab(harvestcraft.modTab), "sausageItem");
GameRegistry.registerItem(sausagerollItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("sausagerollItem").setCreativeTab(harvestcraft.modTab), "sausagerollItem");
GameRegistry.registerItem(sesameballItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("sesameballItem").setCreativeTab(harvestcraft.modTab), "sesameballItem");
GameRegistry.registerItem(sesamesnapsItem = new ItemFood(3, snacksaturation, false).setUnlocalizedName("sesamesnapsItem").setCreativeTab(harvestcraft.modTab), "sesamesnapsItem");
GameRegistry.registerItem(shrimpokrahushpuppiesItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("shrimpokrahushpuppiesItem").setCreativeTab(harvestcraft.modTab), "shrimpokrahushpuppiesItem");
GameRegistry.registerItem(soysauceItem = new Item().setUnlocalizedName("soysauceItem").setCreativeTab(harvestcraft.modTab), "soysauceItem");
GameRegistry.registerItem(sweetpickleItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("sweetpickleItem").setCreativeTab(harvestcraft.modTab), "sweetpickleItem");
GameRegistry.registerItem(veggiestripsItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("veggiestripsItem").setCreativeTab(harvestcraft.modTab), "veggiestripsItem");
GameRegistry.registerItem(vindalooItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("vindalooItem").setCreativeTab(harvestcraft.modTab), "vindalooItem");
GameRegistry.registerItem(honeysandwichItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("honeysandwichItem").setCreativeTab(harvestcraft.modTab), "honeysandwichItem");
GameRegistry.registerItem(cheeseontoastItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("cheeseontoastItem").setCreativeTab(harvestcraft.modTab), "cheeseontoastItem");
GameRegistry.registerItem(tunapotatoItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("tunapotatoItem").setCreativeTab(harvestcraft.modTab), "tunapotatoItem");
GameRegistry.registerItem(chocolaterollItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("chocolaterollItem").setCreativeTab(harvestcraft.modTab), "chocolaterollItem");
GameRegistry.registerItem(jamrollItem = new ItemFood(8, snacksaturation, false).setUnlocalizedName("jamrollItem").setCreativeTab(harvestcraft.modTab), "jamrollItem");
GameRegistry.registerItem(coconutcreamItem = new ItemFood(2, snacksaturation, false).setUnlocalizedName("coconutcreamItem").setCreativeTab(harvestcraft.modTab), "coconutcreamItem");
GameRegistry.registerItem(crackerItem = new ItemFood(4, snacksaturation, false).setUnlocalizedName("crackerItem").setCreativeTab(harvestcraft.modTab), "crackerItem");
GameRegistry.registerItem(garammasalaItem = new Item().setUnlocalizedName("garammasalaItem").setCreativeTab(harvestcraft.modTab), "garammasalaItem");
GameRegistry.registerItem(paneerItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("paneerItem").setCreativeTab(harvestcraft.modTab), "paneerItem");
GameRegistry.registerItem(deluxechickencurryItem = new ItemFood(18, meatymealsaturation, false).setUnlocalizedName("deluxechickencurryItem").setCreativeTab(harvestcraft.modTab), "deluxechickencurryItem");
GameRegistry.registerItem(gravyItem = new ItemFood(4, mealsaturation, false).setUnlocalizedName("gravyItem").setCreativeTab(harvestcraft.modTab), "gravyItem");
GameRegistry.registerItem(mangochutneyItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("mangochutneyItem").setCreativeTab(harvestcraft.modTab), "mangochutneyItem");
GameRegistry.registerItem(marzipanItem = new ItemFood(2, snacksaturation, false).setUnlocalizedName("marzipanItem").setCreativeTab(harvestcraft.modTab), "marzipanItem");
GameRegistry.registerItem(paneertikkamasalaItem = new ItemFood(12, mealsaturation, false).setUnlocalizedName("paneertikkamasalaItem").setCreativeTab(harvestcraft.modTab), "paneertikkamasalaItem");
GameRegistry.registerItem(peaandhamsoupItem = new ItemFood(8, meatymealsaturation, false).setUnlocalizedName("peaandhamsoupItem").setCreativeTab(harvestcraft.modTab), "peaandhamsoupItem");
GameRegistry.registerItem(potatoandleeksoupItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("potatoandleeksoupItem").setCreativeTab(harvestcraft.modTab), "potatoandleeksoupItem");
GameRegistry.registerItem(yorkshirepuddingItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("yorkshirepuddingItem").setCreativeTab(harvestcraft.modTab), "yorkshirepuddingItem");
GameRegistry.registerItem(toadintheholeItem = new ItemFood(10, meatymealsaturation, false).setUnlocalizedName("toadintheholeItem").setCreativeTab(harvestcraft.modTab), "toadintheholeItem");


                RegisterJellys();
                RegisterYogurts();

                GameRegistry.registerItem(tunasaladItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("tunasaladItem").setCreativeTab(harvestcraft.modTab), "tunasaladItem");
                GameRegistry.registerItem(TurkishDelightItem = new ItemFood(5, mealsaturation, false).setUnlocalizedName("TurkishDelightItem").setCreativeTab(harvestcraft.modTab), "TurkishDelightItem");
                GameRegistry.registerItem(VanillaConchasBreadItem = new ItemFood(7, mealsaturation, false).setUnlocalizedName("VanillaConchasBreadItem").setCreativeTab(harvestcraft.modTab), "VanillaConchasBreadItem");
                GameRegistry.registerItem(VanillaCupcakeItem = new ItemFood(8, mealsaturation, false).setUnlocalizedName("VanillaCupcakeItem").setCreativeTab(harvestcraft.modTab), "VanillaCupcakeItem");
                GameRegistry.registerItem(wontonsoupItem = new ItemFood(9, mealsaturation, false).setUnlocalizedName("wontonsoupItem").setCreativeTab(harvestcraft.modTab), "wontonsoupItem");
                GameRegistry.registerItem(schnitzelItem = new ItemFood(6, mealsaturation, false).setUnlocalizedName("schnitzelItem").setCreativeTab(harvestcraft.modTab), "schnitzelItem");
                GameRegistry.registerItem(bratwurstItem = new ItemFood(13, mealsaturation, false).setUnlocalizedName("bratwurstItem").setCreativeTab(harvestcraft.modTab), "bratwurstItem");

                CreateCropAndFruitList();
        }


        private static void CreateCropAndFruitList()
        {
                PamCropItems = new Item[] { AgaveItem, AmaranthItem, ArrowrootItem, CassavaItem, ChickpeaItem,
                        ElderberryItem, FlaxItem, GigaPickleItem, GreenGrapeItem, HuckleberryItem, JicamaItem,
                        JuniperberryItem, JuteItem, KaleItem, KenafItem, KohlrabiItem, LentilItem, MilletItem,
                        MulberryItem, QuinoaItem, SisalItem, TaroItem, TomatilloItem,
                        asparagusItem, barleyItem, beanItem, beetItem, broccoliItem, cauliflowerItem, celeryItem,
                        cranberryItem, garlicItem, gingerItem, leekItem, lettuceItem, oatsItem, onionItem,
                        parsnipItem, peanutItem, pineappleItem, radishItem, riceItem, rutabagaItem, ryeItem,
                        scallionItem, soybeanItem, spiceleafItem, sweetpotatoItem, tealeafItem, turnipItem,
                        whitemushroomItem, artichokeItem, bellpepperItem, blackberryItem, blueberryItem,
                        brusselsproutItem, cabbageItem, cactusfruitItem, candleberryItem, cantaloupeItem,
                        chilipepperItem, coffeebeanItem, cornItem, cottonItem, cucumberItem, eggplantItem,
                        grapeItem, kiwiItem, mustardseedsItem, okraItem, peasItem, raspberryItem, rhubarbItem,
                        seaweedItem, strawberryItem, tomatoItem, wintersquashItem, zucchiniItem,
                        bambooshootItem, spinachItem, curryleafItem, sesameseedsItem, waterchestnutItem };
                PamSeeds = new Item[] { AgaveSeedItem, AmaranthSeedItem, ArrowrootSeedItem, CassavaSeedItem,
                        ChickpeaSeedItem, ElderberrySeedItem, FlaxSeedItem, GigaPickleSeedItem,
                        GreenGrapeSeedItem, HuckleberrySeedItem, JicamaSeedItem, JuniperberrySeedItem,
                        JuteSeedItem, KaleSeedItem, KenafSeedItem, KohlrabiSeedItem, LentilSeedItem,
                        MilletSeedItem, MulberrySeedItem, QuinoaSeedItem, SisalSeedItem, TaroSeedItem,
                        TomatilloSeedItem, asparagusseedItem,
                        barleyseedItem, beanseedItem, beetseedItem, broccoliseedItem, cauliflowerseedItem,
                        celeryseedItem, cranberryseedItem, garlicseedItem, gingerseedItem, leekseedItem,
                        lettuceseedItem, oatsseedItem, onionseedItem, parsnipseedItem, peanutseedItem,
                        pineappleseedItem, radishseedItem, riceseedItem, rutabagaseedItem, ryeseedItem,
                        scallionseedItem, soybeanseedItem, spiceleafseedItem, sweetpotatoseedItem, teaseedItem,
                        turnipseedItem, whitemushroomseedItem, artichokeseedItem, bellpepperseedItem,
                        blackberryseedItem, blueberryseedItem, brusselsproutseedItem, cabbageseedItem,
                        cactusfruitseedItem, candleberryseedItem, cantaloupeseedItem, chilipepperseedItem,
                        coffeeseedItem, cornseedItem, cottonseedItem, cucumberseedItem, eggplantseedItem,
                        grapeseedItem, kiwiseedItem, mustardseedItem, okraseedItem, peasseedItem,
                        raspberryseedItem, rhubarbseedItem, seaweedseedItem, strawberryseedItem, tomatoseedItem,
                        wintersquashseedItem, zucchiniseedItem, bambooshootseedItem, spinachseedItem,
                        curryleafseedItem, sesameseedsseedItem, waterchestnutseedItem };
                PamTemperateFruits = new Item[] { Items.apple, avocadoItem, cherryItem, chestnutItem,
                        nutmegItem, pearItem, plumItem, walnutItem, gooseberryItem };
                PamWarmFruits = new Item[] { almondItem, apricotItem, bananaItem, cashewItem, coconutItem,
                        dateItem, dragonfruitItem, durianItem, figItem, grapefruitItem, lemonItem, limeItem,
                        mangoItem, oliveItem, orangeItem, papayaItem, peachItem, pecanItem, peppercornItem,
                        persimmonItem, pistachioItem, pomegranateItem, starfruitItem, vanillabeanItem };
                PamLogFruits = new Item[] { cinnamonItem, maplesyrupItem, Items.paper };
        }


        private static void RegisterCrops()
        {
                AgaveItem = RegisterCrop(BlockRegistry.AgaveCrop, Blocks.farmland, "AgaveItem");
                AmaranthItem = RegisterCrop(BlockRegistry.AmaranthCrop, Blocks.farmland, "AmaranthItem");
                ArrowrootItem = RegisterCrop(BlockRegistry.ArrowrootCrop, Blocks.farmland, "ArrowrootItem");
                CassavaItem = RegisterCrop(BlockRegistry.CassavaCrop, Blocks.farmland, "CassavaItem");
                ChickpeaItem = RegisterCrop(BlockRegistry.ChickpeaCrop, Blocks.farmland, "ChickpeaItem");
                ElderberryItem = RegisterCrop(BlockRegistry.ElderberryCrop, Blocks.farmland, "ElderberryItem");
                FlaxItem = RegisterCrop(BlockRegistry.FlaxCrop, Blocks.farmland, "FlaxItem");
                GigaPickleItem = RegisterCrop(BlockRegistry.GigaPickleCrop, Blocks.farmland, "GigaPickleItem");
                GreenGrapeItem = RegisterCrop(BlockRegistry.GreenGrapeCrop, Blocks.farmland, "GreenGrapeItem");
                HuckleberryItem = RegisterCrop(BlockRegistry.HuckleberryCrop, Blocks.farmland, "HuckleberryItem");
                JicamaItem = RegisterCrop(BlockRegistry.JicamaCrop, Blocks.farmland, "JicamaItem");
                JuniperberryItem = RegisterCrop(BlockRegistry.JuniperberryCrop, Blocks.farmland, "JuniperberryItem");
                JuteItem = RegisterCrop(BlockRegistry.JuteCrop, Blocks.farmland, "JuteItem");
                KaleItem = RegisterCrop(BlockRegistry.KaleCrop, Blocks.farmland, "KaleItem");
                KenafItem = RegisterCrop(BlockRegistry.KenafCrop, Blocks.farmland, "KenafItem");
                KohlrabiItem = RegisterCrop(BlockRegistry.KohlrabiCrop, Blocks.farmland, "KohlrabiItem");
                LentilItem = RegisterCrop(BlockRegistry.LentilCrop, Blocks.farmland, "LentilItem");
                MilletItem = RegisterCrop(BlockRegistry.MilletCrop, Blocks.farmland, "MilletItem");
                MulberryItem = RegisterCrop(BlockRegistry.MulberryCrop, Blocks.farmland, "MulberryItem");
                QuinoaItem = RegisterCrop(BlockRegistry.QuinoaCrop, Blocks.farmland, "QuinoaItem");
                SisalItem = RegisterCrop(BlockRegistry.SisalCrop, Blocks.farmland, "SisalItem");
                TaroItem = RegisterCrop(BlockRegistry.TaroCrop, Blocks.farmland, "TaroItem");
                TomatilloItem = RegisterCrop(BlockRegistry.TomatilloCrop, Blocks.farmland, "TomatilloItem");
                blackberryItem = RegisterCrop(BlockRegistry.pamblackberryCrop, Blocks.farmland, "blackberryItem");
                blueberryItem = RegisterCrop(BlockRegistry.pamblueberryCrop, Blocks.farmland, "blueberryItem");
                candleberryItem = RegisterCrop(BlockRegistry.pamcandleberryCrop, Blocks.farmland, "candleberryItem");
                raspberryItem = RegisterCrop(BlockRegistry.pamraspberryCrop, Blocks.farmland, "raspberryItem");
                strawberryItem = RegisterCrop(BlockRegistry.pamstrawberryCrop, Blocks.farmland, "strawberryItem");
                grapeItem = RegisterCrop(BlockRegistry.pamgrapeCrop, Blocks.farmland, "grapeItem");
                cactusfruitItem = RegisterCrop(BlockRegistry.pamcactusfruitCrop, Blocks.sand, "cactusfruitItem");
                asparagusItem = RegisterCrop(BlockRegistry.pamasparagusCrop, Blocks.farmland, "asparagusItem");
                barleyItem = RegisterCrop(BlockRegistry.pambarleyCrop, Blocks.farmland, "barleyItem");
                oatsItem = RegisterCrop(BlockRegistry.pamoatsCrop, Blocks.farmland, "oatsItem");
                ryeItem = RegisterCrop(BlockRegistry.pamryeCrop, Blocks.farmland, "ryeItem");
                cornItem = RegisterCrop(BlockRegistry.pamcornCrop, Blocks.farmland, "cornItem");
                bambooshootItem = RegisterCrop(BlockRegistry.pambambooshootCrop, Blocks.farmland, "bambooshootItem");
                cantaloupeItem = RegisterCrop(BlockRegistry.pamcantaloupeCrop, Blocks.farmland, "cantaloupeItem");
                cucumberItem = RegisterCrop(BlockRegistry.pamcucumberCrop, Blocks.farmland, "cucumberItem");
                wintersquashItem = RegisterCrop(BlockRegistry.pamwintersquashCrop, Blocks.farmland, "wintersquashItem");
                zucchiniItem = RegisterCrop(BlockRegistry.pamzucchiniCrop, Blocks.farmland, "zucchiniItem");
                beetItem = RegisterCrop(BlockRegistry.pambeetCrop, Blocks.farmland, "beetItem");
                onionItem = RegisterCrop(BlockRegistry.pamonionCrop, Blocks.farmland, "onionItem");
                parsnipItem = RegisterCrop(BlockRegistry.pamparsnipCrop, Blocks.farmland, "parsnipItem");
                peanutItem = RegisterCrop(BlockRegistry.pampeanutCrop, Blocks.farmland, "peanutItem");
                radishItem = RegisterCrop(BlockRegistry.pamradishCrop, Blocks.farmland, "radishItem");
                rutabagaItem = RegisterCrop(BlockRegistry.pamrutabagaCrop, Blocks.farmland, "rutabagaItem");
                sweetpotatoItem = RegisterCrop(BlockRegistry.pamsweetpotatoCrop, Blocks.farmland, "sweetpotatoItem");
                turnipItem = RegisterCrop(BlockRegistry.pamturnipCrop, Blocks.farmland, "turnipItem");
                rhubarbItem = RegisterCrop(BlockRegistry.pamrhubarbCrop, Blocks.farmland, "rhubarbItem");
                celeryItem = RegisterCrop(BlockRegistry.pamceleryCrop, Blocks.farmland, "celeryItem");
                garlicItem = RegisterCrop(BlockRegistry.pamgarlicCrop, Blocks.farmland, "garlicItem");
                gingerItem = RegisterCrop(BlockRegistry.pamgingerCrop, Blocks.farmland, "gingerItem");
                spiceleafItem = RegisterCrop(BlockRegistry.pamspiceleafCrop, Blocks.farmland, "spiceleafItem");
                ediblerootItem = RegisterCrop(BlockRegistry.pamspiceleafCrop, Blocks.farmland, "ediblerootItem");
                tealeafItem = RegisterCrop(BlockRegistry.pamtealeafCrop, Blocks.farmland, "tealeafItem");
                coffeebeanItem = RegisterCrop(BlockRegistry.pamcoffeebeanCrop, Blocks.farmland, "coffeebeanItem");
                mustardseedsItem = RegisterCrop(BlockRegistry.pammustardseedsCrop, Blocks.farmland, "mustardseedsItem");
                broccoliItem = RegisterCrop(BlockRegistry.pambroccoliCrop, Blocks.farmland, "broccoliItem");
                cauliflowerItem = RegisterCrop(BlockRegistry.pamcauliflowerCrop, Blocks.farmland, "cauliflowerItem");
                leekItem = RegisterCrop(BlockRegistry.pamleekCrop, Blocks.farmland, "leekItem");
                lettuceItem = RegisterCrop(BlockRegistry.pamlettuceCrop, Blocks.farmland, "lettuceItem");
                scallionItem = RegisterCrop(BlockRegistry.pamscallionCrop, Blocks.farmland, "scallionItem");
                artichokeItem = RegisterCrop(BlockRegistry.pamartichokeCrop, Blocks.farmland, "artichokeItem");
                brusselsproutItem = RegisterCrop(BlockRegistry.pambrusselsproutCrop, Blocks.farmland, "brusselsproutItem");
                cabbageItem = RegisterCrop(BlockRegistry.pamcabbageCrop, Blocks.farmland, "cabbageItem");
                spinachItem = RegisterCrop(BlockRegistry.pamspinachCrop, Blocks.farmland, "spinachItem");
                whitemushroomItem = RegisterCrop(BlockRegistry.pamwhitemushroomCrop, Blocks.log, "whitemushroomItem");
                beanItem = RegisterCrop(BlockRegistry.pambeanCrop, Blocks.farmland, "beanItem");
                soybeanItem = RegisterCrop(BlockRegistry.pamsoybeanCrop, Blocks.farmland, "soybeanItem");
                bellpepperItem = RegisterCrop(BlockRegistry.pambellpepperCrop, Blocks.farmland, "bellpepperItem");
                chilipepperItem = RegisterCrop(BlockRegistry.pamchilipepperCrop, Blocks.farmland, "chilipepperItem");
                eggplantItem = RegisterCrop(BlockRegistry.pameggplantCrop, Blocks.farmland, "eggplantItem");
                okraItem = RegisterCrop(BlockRegistry.pamokraCrop, Blocks.farmland, "okraItem");
                peasItem = RegisterCrop(BlockRegistry.pampeasCrop, Blocks.farmland, "peasItem");
                tomatoItem = RegisterCrop(BlockRegistry.pamtomatoCrop, Blocks.farmland, "tomatoItem");
                pineappleItem = RegisterCrop(BlockRegistry.pampineappleCrop, Blocks.farmland, "pineappleItem");
                kiwiItem = RegisterCrop(BlockRegistry.pamkiwiCrop, Blocks.farmland, "kiwiItem");
                sesameseedsItem = RegisterCrop(BlockRegistry.pamsesameseedsCrop, Blocks.farmland, "sesameseedsItem");
                curryleafItem = RegisterCrop(BlockRegistry.pamcurryleafCrop, Blocks.farmland, "curryleafItem");
                cranberryItem = RegisterCrop(BlockRegistry.pamcranberryCrop, Blocks.water, "cranberryItem");
                riceItem = RegisterCrop(BlockRegistry.pamriceCrop, Blocks.water, "riceItem");
                seaweedItem = RegisterCrop(BlockRegistry.pamseaweedCrop, Blocks.water, "seaweedItem");
                waterchestnutItem = RegisterCrop(BlockRegistry.pamwaterchestnutCrop, Blocks.water, "waterchestnutItem");
        }


	private static Item RegisterCrop(Block _crop, Block _ground, String _name)
	{
                Item item = new ItemSeedFood(cropfoodRestore, cropsaturationRestore, _crop, _ground)
                        .setUnlocalizedName(_name).setCreativeTab(harvestcraft.modTab);
                GameRegistry.registerItem(item, _name);
                return item;
	}


        private static void RegisterSeeds()
        {
                cottonItem = RegisterSeed(BlockRegistry.pamcottonCrop, "cottonItem");
                blackberryseedItem = RegisterSeed(BlockRegistry.pamblackberryCrop, "blackberryseedItem");
                AgaveSeedItem = RegisterSeed(BlockRegistry.AgaveCrop, "AgaveSeedItem");
                AmaranthSeedItem = RegisterSeed(BlockRegistry.AmaranthCrop, "AmaranthSeedItem");
                ArrowrootSeedItem = RegisterSeed(BlockRegistry.ArrowrootCrop, "ArrowrootSeedItem");
                CassavaSeedItem = RegisterSeed(BlockRegistry.CassavaCrop, "CassavaSeedItem");
                ChickpeaSeedItem = RegisterSeed(BlockRegistry.ChickpeaCrop, "ChickpeaSeedItem");
                ElderberrySeedItem = RegisterSeed(BlockRegistry.ElderberryCrop, "ElderberrySeedItem");
                FlaxSeedItem = RegisterSeed(BlockRegistry.FlaxCrop, "FlaxSeedItem");
                GigaPickleSeedItem = RegisterSeed(BlockRegistry.GigaPickleCrop, "GigaPickleSeedItem");
                GreenGrapeSeedItem = RegisterSeed(BlockRegistry.GreenGrapeCrop, "GreenGrapeSeedItem");
                HuckleberrySeedItem = RegisterSeed(BlockRegistry.HuckleberryCrop, "HuckleberrySeedItem");
                JicamaSeedItem = RegisterSeed(BlockRegistry.JicamaCrop, "JicamaSeedItem");
                JuniperberrySeedItem = RegisterSeed(BlockRegistry.JuniperberryCrop, "JuniperberrySeedItem");
                JuteSeedItem = RegisterSeed(BlockRegistry.JuteCrop, "JuteSeedItem");
                KaleSeedItem = RegisterSeed(BlockRegistry.KaleCrop, "KaleSeedItem");
                KenafSeedItem = RegisterSeed(BlockRegistry.KenafCrop, "KenafSeedItem");
                KohlrabiSeedItem = RegisterSeed(BlockRegistry.KohlrabiCrop, "KohlrabiSeedItem");
                LentilSeedItem = RegisterSeed(BlockRegistry.LentilCrop, "LentilSeedItem");
                MilletSeedItem = RegisterSeed(BlockRegistry.MilletCrop, "MilletSeedItem");
                MulberrySeedItem = RegisterSeed(BlockRegistry.MulberryCrop, "MulberrySeedItem");
                QuinoaSeedItem = RegisterSeed(BlockRegistry.QuinoaCrop, "QuinoaSeedItem");
                SisalSeedItem = RegisterSeed(BlockRegistry.SisalCrop, "SisalSeedItem");
                TaroSeedItem = RegisterSeed(BlockRegistry.TaroCrop, "TaroSeedItem");
                TomatilloSeedItem = RegisterSeed(BlockRegistry.TomatilloCrop, "TomatilloSeedItem");
                blueberryseedItem = RegisterSeed(BlockRegistry.pamblueberryCrop, "blueberryseedItem");
                candleberryseedItem = RegisterSeed(BlockRegistry.pamcandleberryCrop, "candleberryseedItem");
                raspberryseedItem = RegisterSeed(BlockRegistry.pamraspberryCrop, "raspberryseedItem");
                strawberryseedItem = RegisterSeed(BlockRegistry.pamstrawberryCrop, "strawberryseedItem");
                grapeseedItem = RegisterSeed(BlockRegistry.pamgrapeCrop, "grapeseedItem");
                cactusfruitseedItem = RegisterSeed(BlockRegistry.pamcactusfruitCrop, "cactusfruitseedItem");
                asparagusseedItem = RegisterSeed(BlockRegistry.pamasparagusCrop, "asparagusseedItem");
                barleyseedItem = RegisterSeed(BlockRegistry.pambarleyCrop, "barleyseedItem");
                oatsseedItem = RegisterSeed(BlockRegistry.pamoatsCrop, "oatsseedItem");
                ryeseedItem = RegisterSeed(BlockRegistry.pamryeCrop, "ryeseedItem");
                cornseedItem = RegisterSeed(BlockRegistry.pamcornCrop, "cornseedItem");
                bambooshootseedItem = RegisterSeed(BlockRegistry.pambambooshootCrop, "bambooshootseedItem");
                cantaloupeseedItem = RegisterSeed(BlockRegistry.pamcantaloupeCrop, "cantaloupeseedItem");
                cucumberseedItem = RegisterSeed(BlockRegistry.pamcucumberCrop, "cucumberseedItem");
                wintersquashseedItem = RegisterSeed(BlockRegistry.pamwintersquashCrop, "wintersquashseedItem");
                zucchiniseedItem = RegisterSeed(BlockRegistry.pamzucchiniCrop, "zucchiniseedItem");
                beetseedItem = RegisterSeed(BlockRegistry.pambeetCrop, "beetseedItem");
                onionseedItem = RegisterSeed(BlockRegistry.pamonionCrop, "onionseedItem");
                parsnipseedItem = RegisterSeed(BlockRegistry.pamparsnipCrop, "parsnipseedItem");
                peanutseedItem = RegisterSeed(BlockRegistry.pampeanutCrop, "peanutseedItem");
                radishseedItem = RegisterSeed(BlockRegistry.pamradishCrop, "radishseedItem");
                rutabagaseedItem = RegisterSeed(BlockRegistry.pamrutabagaCrop, "rutabagaseedItem");
                sweetpotatoseedItem = RegisterSeed(BlockRegistry.pamsweetpotatoCrop, "sweetpotatoseedItem");
                turnipseedItem = RegisterSeed(BlockRegistry.pamturnipCrop, "turnipseedItem");
                rhubarbseedItem = RegisterSeed(BlockRegistry.pamrhubarbCrop, "rhubarbseedItem");
                celeryseedItem = RegisterSeed(BlockRegistry.pamceleryCrop, "celeryseedItem");
                garlicseedItem = RegisterSeed(BlockRegistry.pamgarlicCrop, "garlicseedItem");
                gingerseedItem = RegisterSeed(BlockRegistry.pamgingerCrop, "gingerseedItem");
                spiceleafseedItem = RegisterSeed(BlockRegistry.pamspiceleafCrop, "spiceleafseedItem");
                teaseedItem = RegisterSeed(BlockRegistry.pamtealeafCrop, "teaseedItem");
                coffeeseedItem = RegisterSeed(BlockRegistry.pamcoffeebeanCrop, "coffeeseedItem");
                mustardseedItem = RegisterSeed(BlockRegistry.pammustardseedsCrop, "mustardseedItem");
                broccoliseedItem = RegisterSeed(BlockRegistry.pambroccoliCrop, "broccoliseedItem");
                cauliflowerseedItem = RegisterSeed(BlockRegistry.pamcauliflowerCrop, "cauliflowerseedItem");
                leekseedItem = RegisterSeed(BlockRegistry.pamleekCrop, "leekseedItem");
                lettuceseedItem = RegisterSeed(BlockRegistry.pamlettuceCrop, "lettuceseedItem");
                scallionseedItem = RegisterSeed(BlockRegistry.pamscallionCrop, "scallionseedItem");
                artichokeseedItem = RegisterSeed(BlockRegistry.pamartichokeCrop, "artichokeseedItem");
                brusselsproutseedItem = RegisterSeed(BlockRegistry.pambrusselsproutCrop, "brusselsproutseedItem");
                cabbageseedItem = RegisterSeed(BlockRegistry.pamcabbageCrop, "cabbageseedItem");
                spinachseedItem = RegisterSeed(BlockRegistry.pamspinachCrop, "spinachseedItem");
                whitemushroomseedItem = RegisterSeed(BlockRegistry.pamwhitemushroomCrop, "whitemushroomseedItem");
                beanseedItem = RegisterSeed(BlockRegistry.pambeanCrop, "beanseedItem");
                soybeanseedItem = RegisterSeed(BlockRegistry.pamsoybeanCrop, "soybeanseedItem");
                bellpepperseedItem = RegisterSeed(BlockRegistry.pambellpepperCrop, "bellpepperseedItem");
                chilipepperseedItem = RegisterSeed(BlockRegistry.pamchilipepperCrop, "chilipepperseedItem");
                eggplantseedItem = RegisterSeed(BlockRegistry.pameggplantCrop, "eggplantseedItem");
                okraseedItem = RegisterSeed(BlockRegistry.pamokraCrop, "okraseedItem");
                peasseedItem = RegisterSeed(BlockRegistry.pampeasCrop, "peasseedItem");
                tomatoseedItem = RegisterSeed(BlockRegistry.pamtomatoCrop, "tomatoseedItem");
                cottonseedItem = RegisterSeed(BlockRegistry.pamcottonCrop, "cottonseedItem");
                pineappleseedItem = RegisterSeed(BlockRegistry.pampineappleCrop, "pineappleseedItem");
                curryleafseedItem = RegisterSeed(BlockRegistry.pamcurryleafCrop, "curryleafseedItem");
                sesameseedsseedItem = RegisterSeed(BlockRegistry.pamsesameseedsCrop, "sesameseedsseedItem");
                kiwiseedItem = RegisterSeed(BlockRegistry.pamkiwiCrop, "kiwiseedItem");
                cranberryseedItem = RegisterSeed(BlockRegistry.pamcranberryCrop, "cranberryseedItem");
                riceseedItem = RegisterSeed(BlockRegistry.pamriceCrop, "riceseedItem");
                seaweedseedItem = RegisterSeed(BlockRegistry.pamseaweedCrop, "seaweedseedItem");
                waterchestnutseedItem = RegisterSeed(BlockRegistry.pamwaterchestnutCrop, "waterchestnutseedItem");
        }


        private static Item RegisterSeed(Block _cropBlock, String _name)
        {
                Item seed = new ItemSeeds(_cropBlock, Blocks.farmland)
                        .setUnlocalizedName(_name).setCreativeTab(harvestcraft.modTab);
                GameRegistry.registerItem(seed, _name);
                return seed;
        }


        private static void RegisterFruits()
        {
                almondItem = RegisterFruit("almondItem");
                apricotItem = RegisterFruit("apricotItem");
                avocadoItem = RegisterFruit("avocadoItem");
                bananaItem = RegisterFruit("bananaItem");
                cashewItem = RegisterFruit("cashewItem");
                cherryItem = RegisterFruit("cherryItem");
                chestnutItem = RegisterFruit("chestnutItem");
                cinnamonItem = RegisterFruit("cinnamonItem"); 
                coconutItem = RegisterFruit("coconutItem");
                dateItem = RegisterFruit("dateItem");
                dragonfruitItem = RegisterFruit("dragonfruitItem");
                durianItem = RegisterFruit("durianItem");
                figItem = RegisterFruit("figItem");
                grapefruitItem = RegisterFruit("grapefruitItem");
                lemonItem = RegisterFruit("lemonItem");
                limeItem = RegisterFruit("limeItem");
                maplesyrupItem = RegisterFruit("maplesyrupItem");
                mangoItem = RegisterFruit("mangoItem");
                nutmegItem = RegisterFruit("nutmegItem");
                oliveItem = RegisterFruit("oliveItem");
                orangeItem = RegisterFruit("orangeItem");
                papayaItem = RegisterFruit("papayaItem");
                peachItem = RegisterFruit("peachItem");
                pearItem = RegisterFruit("pearItem");
                pecanItem = RegisterFruit("pecanItem");
                peppercornItem = RegisterFruit("peppercornItem");
                persimmonItem = RegisterFruit("persimmonItem");
                pistachioItem = RegisterFruit("pistachioItem");
                plumItem = RegisterFruit("plumItem");
                pomegranateItem = RegisterFruit("pomegranateItem");
                starfruitItem = RegisterFruit("starfruitItem");
                vanillabeanItem = RegisterFruit("vanillabeanItem");
                walnutItem = RegisterFruit("walnutItem");
        }


        private static Item RegisterFruit(String _name)
        {
                Item fruit = new ItemFood(cropfoodRestore, false).setUnlocalizedName(_name).setCreativeTab(harvestcraft.modTab);
                GameRegistry.registerItem(fruit, _name);                
                return fruit;
        }


        private static void RegisterJellys()
        {
                grapejellyItem = RegisterMeal(5, "grapejellyItem");
                applejellyItem = RegisterMeal(5, "applejellyItem");
                blackberryjellyItem = RegisterMeal(5, "blackberryjellyItem");
                blueberryjellyItem = RegisterMeal(5, "blueberryjellyItem");
                cherryjellyItem = RegisterMeal(5, "cherryjellyItem");
                cranberryjellyItem = RegisterMeal( 5, "cranberryjellyItem");
                kiwijellyItem = RegisterMeal(5, "kiwijellyItem");
                lemonjellyItem = RegisterMeal(5, "lemonjellyItem");
                limejellyItem = RegisterMeal(5, "limejellyItem");
                mangojellyItem = RegisterMeal(5, "mangojellyItem");
                orangejellyItem = RegisterMeal(5, "orangejellyItem");
                papayajellyItem = RegisterMeal(5, "papayajellyItem");
                peachjellyItem = RegisterMeal(5, "peachjellyItem");
                pomegranatejellyItem = RegisterMeal(5, "pomegranatejellyItem");
                raspberryjellyItem = RegisterMeal(5, "raspberryjellyItem");
                starfruitjellyItem = RegisterMeal(5, "starfruitjellyItem");
                strawberryjellyItem = RegisterMeal(5, "strawberryjellyItem");
                watermelonjellyItem = RegisterMeal(5, "watermelonjellyItem");
                apricotjellyItem = RegisterMeal(5, "apricotjellyItem");
                figjellyItem = RegisterMeal(5, "figjellyItem");
                grapefruitjellyItem = RegisterMeal(5, "grapefruitjellyItem");
                persimmonjellyItem = RegisterMeal(5, "persimmonjellyItem");
                gooseberryjellyItem = RegisterMeal(5, "gooseberryjellyItem");
                pearjellyItem = RegisterMeal(5, "pearjellyItem");
                plumjellyItem = RegisterMeal(5, "plumjellyItem");                
        }


        private static void RegisterYogurts()
        {
                plainyogurtItem = RegisterMeal(4, "plainyogurtItem");

                papayayogurtItem = RegisterMeal(8, "papayayogurtItem");
                starfruityogurtItem = RegisterMeal(8, "starfruityogurtItem");
                pearyogurtItem = RegisterMeal(8, "pearyogurtItem");
                plumyogurtItem = RegisterMeal(8, "plumyogurtItem");
                pineappleyogurtItem = RegisterMeal(8, "pineappleyogurtItem");
                bananayogurtItem = RegisterMeal(8, "bananayogurtItem");
                coconutyogurtItem = RegisterMeal(8, "coconutyogurtItem");
                orangeyogurtItem = RegisterMeal(8, "orangeyogurtItem");
                peachyogurtItem = RegisterMeal(8, "peachyogurtItem");
                limeyogurtItem = RegisterMeal(8, "limeyogurtItem");
                mangoyogurtItem = RegisterMeal(8, "mangoyogurtItem");
                pomegranateyogurtItem = RegisterMeal(8, "pomegranateyogurtItem");
                vanillayogurtItem = RegisterMeal(8, "vanillayogurtItem");
                blueberryyogurtItem = RegisterMeal(8, "blueberryyogurtItem");
                lemonyogurtItem = RegisterMeal(8, "lemonyogurtItem");
                cherryyogurtItem = RegisterMeal(8, "cherryyogurtItem");
                strawberryyogurtItem = RegisterMeal(8, "strawberryyogurtItem");
                grapeyogurtItem = RegisterMeal(8, "grapeyogurtItem");
                chocolateyogurtItem = RegisterMeal(8, "chocolateyogurtItem");
                blackberryyogurtItem = RegisterMeal(8, "blackberryyogurtItem");
                pumpkinyogurtItem = RegisterMeal(8, "pumpkinyogurtItem");
                raspberryyogurtItem = RegisterMeal(8, "raspberryyogurtItem");
                melonyogurtItem = RegisterMeal(6, "melonyogurtItem");
                kiwiyogurtItem = RegisterMeal(8, "kiwiyogurtItem");
                appleyogurtItem = RegisterMeal(8, "appleyogurtItem");
                apricotyogurtItem = RegisterMeal(6, "apricotyogurtItem");
                figyogurtItem = RegisterMeal(8, "figyogurtItem");
                grapefruityogurtItem = RegisterMeal(8, "grapefruityogurtItem");
                persimmonyogurtItem = RegisterMeal(8, "persimmonyogurtItem");
                gooseberryyogurtItem = RegisterMeal(8, "gooseberryyogurtItem");
                cranberryyogurtItem = RegisterMeal(8, "cranberryyogurtItem");
        }


        private static Item RegisterMeatyMeal(int _hunger, String _name)
        {
                Item food = new ItemFood(_hunger, meatymealsaturation, false).setUnlocalizedName(_name).setCreativeTab(harvestcraft.modTab);
                GameRegistry.registerItem(food, _name);
                return food;
        }


        private static Item RegisterMeal(int _hunger, String _name)
        {
                Item food = new ItemFood(_hunger, mealsaturation, false).setUnlocalizedName(_name).setCreativeTab(harvestcraft.modTab);
                GameRegistry.registerItem(food, _name);
                return food;
        }


        private static Item RegisterSnack(int _hunger, String _name)
        {
                Item food = new ItemFood(_hunger, snacksaturation, false).setUnlocalizedName(_name).setCreativeTab(harvestcraft.modTab);
                GameRegistry.registerItem(food, _name);
                return food;
        }


        private static void RegisterSmoothies()
        {
                applesmoothieItem = RegisterDrink(6, "applesmoothieItem");
                apricotsmoothieItem = RegisterDrink(6, "apricotsmoothieItem");
                bananasmoothieItem = RegisterDrink(6, "bananasmoothieItem");
                blackberrysmoothieItem = RegisterDrink( 6, "blackberrysmoothieItem");
                blueberrysmoothieItem = RegisterDrink(6, "blueberrysmoothieItem");
                cherrysmoothieItem = RegisterDrink(6, "cherrysmoothieItem");
                coconutsmoothieItem = RegisterDrink(6, "coconutsmoothieItem");
                cranberrysmoothieItem = RegisterDrink(6, "cranberrysmoothieItem");
                figsmoothieItem = RegisterDrink(6, "figsmoothieItem");
                kiwismoothieItem = RegisterDrink(6, "kiwismoothieItem");
                gooseberrysmoothieItem = RegisterDrink(6, "gooseberrysmoothieItem");
                grapesmoothieItem = RegisterDrink(6, "grapesmoothieItem");
                grapefruitsmoothieItem = RegisterDrink(6, "grapefruitsmoothieItem");
                lemonsmoothieItem = RegisterDrink(6, "lemonsmoothieItem");
                limesmoothieItem = RegisterDrink(9, "limesmoothieItem");
                mangosmoothieItem = RegisterDrink(6, "mangosmoothieItem");
                melonsmoothieItem = RegisterDrink(5, "melonsmoothieItem");
                orangesmoothieItem = RegisterDrink(6, "orangesmoothieItem");
                papayasmoothieItem = RegisterDrink(6, "papayasmoothieItem");
                peachsmoothieItem = RegisterDrink(6, "peachsmoothieItem");
                pearsmoothieItem = RegisterDrink(6, "pearsmoothieItem");
                persimmonsmoothieItem = RegisterDrink(6, "persimmonsmoothieItem");
                plumsmoothieItem = RegisterDrink(6, "plumsmoothieItem");
                pomegranatesmoothieItem = RegisterDrink(6, "pomegranatesmoothieItem");
                raspberrysmoothieItem = RegisterDrink(6, "raspberrysmoothieItem");
                starfruitsmoothieItem = RegisterDrink(6, "starfruitsmoothieItem");
                strawberrysmoothieItem = RegisterDrink(6, "strawberrysmoothieItem");
        }


        private static Item RegisterDrink(int _hunger, String _name)
        {
                Item food = new ItemPamPotionFood(_hunger, mealsaturation, false).setUnlocalizedName(_name).setCreativeTab(harvestcraft.modTab);
                GameRegistry.registerItem(food, _name);
                return food;
        }


        private static void RegisterPies()
        {
                applepieItem = RegisterMeatyMeal(8,"applepieItem");
                blueberrypieItem = RegisterMeal(8, "blueberrypieItem");
                cherrypieItem = RegisterMeal(8, "cherrypieItem");
                chickenpotpieItem = RegisterMeatyMeal(10,"chickenpotpieItem");
                cottagepieItem = RegisterMeatyMeal(12,"cottagepieItem");
                keylimepieItem = RegisterMeal(6, "keylimepieItem");
                gooseberrypieItem = RegisterMeal(8, "gooseberrypieItem");
                meatpieItem = RegisterMeatyMeal(14,"meatpieItem");
                mincepieItem = RegisterMeatyMeal(12,"mincepieItem");
                raspberrypieItem = RegisterMeal(8, "raspberrypieItem");
                shepardspieItem = RegisterMeatyMeal(12,"shepardspieItem");
                strawberrypieItem = RegisterMeal(8, "strawberrypieItem");
                spinachpieItem = RegisterMeal(8, "spinachpieItem");
                sweetpotatopieItem = RegisterMeal(10, "sweetpotatopieItem");
                pecanpieItem = RegisterMeal(6, "pecanpieItem");
        }


        private static void RegisterBurgers()
        {
                baconcheeseburgerItem = RegisterMeatyMeal(14, "baconcheeseburgerItem");
                baconmushroomburgerItem = RegisterSnack(16, "baconmushroomburgerItem");
                beetburgerItem = RegisterMeatyMeal(18, "beetburgerItem");
                cheeseburgerItem = RegisterMeal(9, "cheeseburgerItem");
                coleslawburgerItem = RegisterMeatyMeal(12, "coleslawburgerItem");
                deluxecheeseburgerItem = RegisterMeatyMeal(12, "deluxecheeseburgerItem");
                hamburgerItem = RegisterMeal(8, "hamburgerItem");
                onionhamburgerItem = RegisterMeatyMeal(10, "onionhamburgerItem");                
        }


        private static void RegisterJellySandwich()
        {
                applejellysandwichItem = RegisterMeal(10, "applejellysandwichItem");
                apricotjellysandwichItem = RegisterMeal(10, "apricotjellysandwichItem");
                blackberryjellysandwichItem = RegisterMeal(10, "blackberryjellysandwichItem");
                blueberryjellysandwichItem = RegisterMeal(10, "blueberryjellysandwichItem");
                cherryjellysandwichItem = RegisterMeal(10, "cherryjellysandwichItem");
                cranberryjellysandwichItem = RegisterMeal(10, "cranberryjellysandwichItem");
                figjellysandwichItem = RegisterMeal(10, "figjellysandwichItem");
                grapefruitjellysandwichItem = RegisterMeal(10, "grapefruitjellysandwichItem");
                gooseberryjellysandwichItem = RegisterMeal(10, "gooseberryjellysandwichItem");
                kiwijellysandwichItem = RegisterMeal(10, "kiwijellysandwichItem");
                lemonjellysandwichItem = RegisterMeal(10, "lemonjellysandwichItem");
                limejellysandwichItem = RegisterMeal(10, "limejellysandwichItem");
                mangojellysandwichItem = RegisterMeal(10, "mangojellysandwichItem");
                orangejellysandwichItem = RegisterMeal(10, "orangejellysandwichItem");
                papayajellysandwichItem = RegisterMeal(10, "papayajellysandwichItem");
                peachjellysandwichItem = RegisterMeal(10, "peachjellysandwichItem");
                pearjellysandwichItem = RegisterMeal(10, "pearjellysandwichItem");
                persimmonjellysandwichItem = RegisterMeal(10, "persimmonjellysandwichItem");
                plumjellysandwichItem = RegisterMeal(10, "plumjellysandwichItem");
                pomegranatejellysandwichItem = RegisterMeal(10, "pomegranatejellysandwichItem");
                raspberryjellysandwichItem = RegisterMeal(10, "raspberryjellysandwichItem");
                starfruitjellysandwichItem = RegisterMeal(10, "starfruitjellysandwichItem");
                strawberryjellysandwichItem = RegisterMeal(10, "strawberryjellysandwichItem");
                watermelonjellysandwichItem = RegisterMeal(10, "watermelonjellysandwichItem");
        }


        private static void RegisterTools()
        {
                cuttingboardItem = RegisterTool("cuttingboardItem");
                potItem = RegisterTool("potItem");
                skilletItem = RegisterTool("skilletItem");
                saucepanItem = RegisterTool("saucepanItem");
                bakewareItem = RegisterTool("bakewareItem");
                mortarandpestleItem = RegisterTool("mortarandpestleItem");
                mixingbowlItem = RegisterTool("mixingbowlItem");
                juicerItem = RegisterTool("juicerItem");
        }


        private static Item RegisterTool(String _name)
        {
                Item tool = new ItemPamTool().setUnlocalizedName(_name).setCreativeTab(harvestcraft.modTab);
                GameRegistry.registerItem(tool, _name);
                tool.setContainerItem(tool);
                return tool;
        }


        private static void RegisterJuices()
        {
                applejuiceItem = RegisterDrink(5, "applejuiceItem");
                melonjuiceItem = RegisterDrink(3, "melonjuiceItem");
                carrotjuiceItem = RegisterDrink(5, "carrotjuiceItem");
                strawberryjuiceItem = RegisterDrink(5, "strawberryjuiceItem");
                grapejuiceItem = RegisterDrink(5, "grapejuiceItem");
                blueberryjuiceItem = RegisterDrink(5, "blueberryjuiceItem");
                cherryjuiceItem = RegisterDrink(5, "cherryjuiceItem");
                papayajuiceItem = RegisterDrink(5, "papayajuiceItem");
                starfruitjuiceItem = RegisterDrink(5, "starfruitjuiceItem");
                orangejuiceItem = RegisterDrink(5, "orangejuiceItem");
                peachjuiceItem = RegisterDrink(5, "peachjuiceItem");
                limejuiceItem = RegisterDrink(5, "limejuiceItem");
                mangojuiceItem = RegisterDrink(5, "mangojuiceItem");
                pomegranatejuiceItem = RegisterDrink(5, "pomegranatejuiceItem");
                blackberryjuiceItem = RegisterDrink(5, "blackberryjuiceItem");
                raspberryjuiceItem = RegisterDrink(5, "raspberryjuiceItem");
                kiwijuiceItem = RegisterDrink(5, "kiwijuiceItem");
                cranberryjuiceItem = RegisterDrink(5, "cranberryjuiceItem");
                cactusfruitjuiceItem = RegisterDrink(5, "cactusfruitjuiceItem");
                plumjuiceItem = RegisterDrink(5, "plumjuiceItem");
                pearjuiceItem = RegisterDrink(5, "pearjuiceItem");
                apricotjuiceItem = RegisterDrink(5, "apricotjuiceItem");
                figjuiceItem = RegisterDrink(5, "figjuiceItem");
                grapefruitjuiceItem = RegisterDrink(5, "grapefruitjuiceItem");
                persimmonjuiceItem = RegisterDrink(5, "persimmonjuiceItem");
	}


        public static void RegisterFish()
        {
                GameRegistry.registerItem(anchovyrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("anchovyrawItem").setCreativeTab(harvestcraft.modTab), "anchovyrawItem");
                GameRegistry.registerItem(bassrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("bassrawItem").setCreativeTab(harvestcraft.modTab), "bassrawItem");
                GameRegistry.registerItem(carprawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("carprawItem").setCreativeTab(harvestcraft.modTab), "carprawItem");
                GameRegistry.registerItem(catfishrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("catfishrawItem").setCreativeTab(harvestcraft.modTab), "catfishrawItem");
                GameRegistry.registerItem(charrrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("charrrawItem").setCreativeTab(harvestcraft.modTab), "charrrawItem");
                GameRegistry.registerItem(clamrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("clamrawItem").setCreativeTab(harvestcraft.modTab), "clamrawItem");
                GameRegistry.registerItem(crabrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("crabrawItem").setCreativeTab(harvestcraft.modTab), "crabrawItem");
                GameRegistry.registerItem(crayfishrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("crayfishrawItem").setCreativeTab(harvestcraft.modTab), "crayfishrawItem");
                GameRegistry.registerItem(eelrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("eelrawItem").setCreativeTab(harvestcraft.modTab), "eelrawItem");
                GameRegistry.registerItem(frograwItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("frograwItem").setCreativeTab(harvestcraft.modTab), "frograwItem");
                GameRegistry.registerItem(grouperrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("grouperrawItem").setCreativeTab(harvestcraft.modTab), "grouperrawItem");
                GameRegistry.registerItem(herringrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("herringrawItem").setCreativeTab(harvestcraft.modTab), "herringrawItem");
                GameRegistry.registerItem(jellyfishrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("jellyfishrawItem").setCreativeTab(harvestcraft.modTab), "jellyfishrawItem");
                GameRegistry.registerItem(mudfishrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("mudfishrawItem").setCreativeTab(harvestcraft.modTab), "mudfishrawItem");
                GameRegistry.registerItem(octopusrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("octopusrawItem").setCreativeTab(harvestcraft.modTab), "octopusrawItem");
                GameRegistry.registerItem(perchrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("perchrawItem").setCreativeTab(harvestcraft.modTab), "perchrawItem");
                GameRegistry.registerItem(scalloprawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("scalloprawItem").setCreativeTab(harvestcraft.modTab), "scalloprawItem");
                GameRegistry.registerItem(shrimprawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("shrimprawItem").setCreativeTab(harvestcraft.modTab), "shrimprawItem");
                GameRegistry.registerItem(snailrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("snailrawItem").setCreativeTab(harvestcraft.modTab), "snailrawItem");
                GameRegistry.registerItem(snapperrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("snapperrawItem").setCreativeTab(harvestcraft.modTab), "snapperrawItem");
                GameRegistry.registerItem(tilapiarawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("tilapiarawItem").setCreativeTab(harvestcraft.modTab), "tilapiarawItem");
                GameRegistry.registerItem(troutrawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("troutrawItem").setCreativeTab(harvestcraft.modTab), "troutrawItem");
                GameRegistry.registerItem(tunarawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("tunarawItem").setCreativeTab(harvestcraft.modTab), "tunarawItem");
                GameRegistry.registerItem(turtlerawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("turtlerawItem").setCreativeTab(harvestcraft.modTab), "turtlerawItem");
                GameRegistry.registerItem(walleyerawItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("walleyerawItem").setCreativeTab(harvestcraft.modTab), "walleyerawItem");
                GameRegistry.registerItem(greenheartfishItem = new ItemFood(2, meatymealsaturation, false).setUnlocalizedName("greenheartfishItem").setCreativeTab(harvestcraft.modTab), "greenheartfishItem");
                GameRegistry.registerItem(calamarirawItem = new ItemFood(2, snacksaturation, false).setUnlocalizedName("calamarirawItem").setCreativeTab(harvestcraft.modTab), "calamarirawItem");
	}
}
