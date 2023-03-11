package com.pam.harvestcraft.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import com.pam.harvestcraft.Reference;


public final class ItemRenderRegister
{
	public static void preInit()
	{
		//ModelBakery.registerItemVariants(ItemRegistry.metaItem, new ResourceLocation("harvestcraft:meta_item_white"), new ResourceLocation("harvestcraft:meta_item_black"));
	}


	public static void registerItemRenderer()
	{
		reg(ItemRegistry.cuttingboardItem);
		reg(ItemRegistry.potItem);
		reg(ItemRegistry.skilletItem);
		reg(ItemRegistry.saucepanItem);
		reg(ItemRegistry.bakewareItem);
		reg(ItemRegistry.mortarandpestleItem);
		reg(ItemRegistry.mixingbowlItem);
		reg(ItemRegistry.juicerItem);
		reg(ItemRegistry.honeyItem);
		reg(ItemRegistry.saltItem);
		reg(ItemRegistry.wovencottonItem);
		reg(ItemRegistry.freshwaterItem);
		reg(ItemRegistry.freshmilkItem);
		//reg(ItemRegistry.muttonrawItem);
		reg(ItemRegistry.calamarirawItem);
		//reg(ItemRegistry.muttoncookedItem);
		reg(ItemRegistry.calamaricookedItem);
		reg(ItemRegistry.sunflowerseedsItem);
		reg(ItemRegistry.AgaveItem);
		reg(ItemRegistry.AmaranthItem);
		reg(ItemRegistry.blackberryItem);
		reg(ItemRegistry.blueberryItem);
		reg(ItemRegistry.candleberryItem);
		reg(ItemRegistry.raspberryItem);
		reg(ItemRegistry.strawberryItem);
		reg(ItemRegistry.grapeItem);
		reg(ItemRegistry.cactusfruitItem);
		reg(ItemRegistry.asparagusItem);
		reg(ItemRegistry.barleyItem);
		reg(ItemRegistry.oatsItem);
		reg(ItemRegistry.ryeItem);
		reg(ItemRegistry.cornItem);
		reg(ItemRegistry.bambooshootItem);
		reg(ItemRegistry.cantaloupeItem);
		reg(ItemRegistry.cucumberItem);
		reg(ItemRegistry.wintersquashItem);
		reg(ItemRegistry.zucchiniItem);
		reg(ItemRegistry.beetItem);
		reg(ItemRegistry.onionItem);
		reg(ItemRegistry.parsnipItem);
		reg(ItemRegistry.peanutItem);
		reg(ItemRegistry.radishItem);
		reg(ItemRegistry.rutabagaItem);
		reg(ItemRegistry.sweetpotatoItem);
		reg(ItemRegistry.turnipItem);
		reg(ItemRegistry.rhubarbItem);
		reg(ItemRegistry.celeryItem);
		reg(ItemRegistry.garlicItem);
		reg(ItemRegistry.gingerItem);
		reg(ItemRegistry.spiceleafItem);
		reg(ItemRegistry.ediblerootItem);
		reg(ItemRegistry.tealeafItem);
		reg(ItemRegistry.coffeebeanItem);
		reg(ItemRegistry.mustardseedsItem);
		reg(ItemRegistry.broccoliItem);
		reg(ItemRegistry.cauliflowerItem);
		reg(ItemRegistry.leekItem);
		reg(ItemRegistry.lettuceItem);
		reg(ItemRegistry.scallionItem);
		reg(ItemRegistry.artichokeItem);
		reg(ItemRegistry.brusselsproutItem);
		reg(ItemRegistry.cabbageItem);
		reg(ItemRegistry.spinachItem);
		reg(ItemRegistry.whitemushroomItem);
		reg(ItemRegistry.beanItem);
		reg(ItemRegistry.soybeanItem);
		reg(ItemRegistry.bellpepperItem);
		reg(ItemRegistry.chilipepperItem);
		reg(ItemRegistry.eggplantItem);
		reg(ItemRegistry.okraItem);
		reg(ItemRegistry.peasItem);
		reg(ItemRegistry.tomatoItem);
		reg(ItemRegistry.cottonItem);
		reg(ItemRegistry.pineappleItem);
		reg(ItemRegistry.kiwiItem);
		reg(ItemRegistry.sesameseedsItem);
		reg(ItemRegistry.curryleafItem);
		reg(ItemRegistry.cranberryItem);
		reg(ItemRegistry.riceItem);
		reg(ItemRegistry.seaweedItem);
		reg(ItemRegistry.waterchestnutItem);
		reg(ItemRegistry.AgaveSeedItem);
		reg(ItemRegistry.AmaranthSeedItem);
		reg(ItemRegistry.cottonseedItem);
		reg(ItemRegistry.asparagusseedItem);
		reg(ItemRegistry.barleyseedItem);
		reg(ItemRegistry.beanseedItem);
		reg(ItemRegistry.beetseedItem);
		reg(ItemRegistry.broccoliseedItem);
		reg(ItemRegistry.whitemushroomseedItem);
		reg(ItemRegistry.cauliflowerseedItem);
		reg(ItemRegistry.celeryseedItem);
		reg(ItemRegistry.cranberryseedItem);
		reg(ItemRegistry.garlicseedItem);
		reg(ItemRegistry.gingerseedItem);
		reg(ItemRegistry.leekseedItem);
		reg(ItemRegistry.lettuceseedItem);
		reg(ItemRegistry.oatsseedItem);
		reg(ItemRegistry.onionseedItem);
		reg(ItemRegistry.parsnipseedItem);
		reg(ItemRegistry.peanutseedItem);
		reg(ItemRegistry.pineappleseedItem);
		reg(ItemRegistry.radishseedItem);
		reg(ItemRegistry.riceseedItem);
		reg(ItemRegistry.rutabagaseedItem);
		reg(ItemRegistry.ryeseedItem);
		reg(ItemRegistry.scallionseedItem);
		reg(ItemRegistry.soybeanseedItem);
		reg(ItemRegistry.spiceleafseedItem);
		reg(ItemRegistry.sweetpotatoseedItem);
		reg(ItemRegistry.teaseedItem);
		reg(ItemRegistry.turnipseedItem);
		reg(ItemRegistry.artichokeseedItem);
		reg(ItemRegistry.bellpepperseedItem);
		reg(ItemRegistry.blackberryseedItem);
		reg(ItemRegistry.blueberryseedItem);
		reg(ItemRegistry.brusselsproutseedItem);
		reg(ItemRegistry.cabbageseedItem);
		reg(ItemRegistry.cactusfruitseedItem);
		reg(ItemRegistry.candleberryseedItem);
		reg(ItemRegistry.cantaloupeseedItem);
		reg(ItemRegistry.chilipepperseedItem);
		reg(ItemRegistry.coffeeseedItem);
		reg(ItemRegistry.cornseedItem);
		reg(ItemRegistry.cucumberseedItem);
		reg(ItemRegistry.eggplantseedItem);
		reg(ItemRegistry.grapeseedItem);
		reg(ItemRegistry.kiwiseedItem);
		reg(ItemRegistry.mustardseedItem);
		reg(ItemRegistry.okraseedItem);
		reg(ItemRegistry.peasseedItem);
		reg(ItemRegistry.raspberryseedItem);
		reg(ItemRegistry.rhubarbseedItem);
		reg(ItemRegistry.seaweedseedItem);
		reg(ItemRegistry.strawberryseedItem);
		reg(ItemRegistry.tomatoseedItem);
		reg(ItemRegistry.wintersquashseedItem);
		reg(ItemRegistry.zucchiniseedItem);
		reg(ItemRegistry.bambooshootseedItem);
		reg(ItemRegistry.spinachseedItem);
		reg(ItemRegistry.curryleafseedItem);
		reg(ItemRegistry.sesameseedsseedItem);
		reg(ItemRegistry.waterchestnutseedItem);

		reg(ItemRegistry.almondItem);
		reg(ItemRegistry.apricotItem);
		reg(ItemRegistry.avocadoItem);
		reg(ItemRegistry.bananaItem);
		reg(ItemRegistry.cashewItem);
		reg(ItemRegistry.cherryItem);
		reg(ItemRegistry.chestnutItem);
		reg(ItemRegistry.cinnamonItem);
		reg(ItemRegistry.coconutItem);
		reg(ItemRegistry.dateItem);
		reg(ItemRegistry.dragonfruitItem);
		reg(ItemRegistry.durianItem);
		reg(ItemRegistry.figItem);
		reg(ItemRegistry.grapefruitItem);
		reg(ItemRegistry.lemonItem);
		reg(ItemRegistry.limeItem);
		reg(ItemRegistry.maplesyrupItem);
		reg(ItemRegistry.mangoItem);
		reg(ItemRegistry.nutmegItem);
		reg(ItemRegistry.oliveItem);
		reg(ItemRegistry.orangeItem);
		reg(ItemRegistry.papayaItem);
		reg(ItemRegistry.peachItem);
		reg(ItemRegistry.pearItem);
		reg(ItemRegistry.pecanItem);
		reg(ItemRegistry.peppercornItem);
		reg(ItemRegistry.persimmonItem);
		reg(ItemRegistry.pistachioItem);
		reg(ItemRegistry.plumItem);
		reg(ItemRegistry.pomegranateItem);
		reg(ItemRegistry.starfruitItem);
		reg(ItemRegistry.vanillabeanItem);
		reg(ItemRegistry.walnutItem);
		reg(ItemRegistry.gooseberryItem);
		reg(ItemRegistry.grilledasparagusItem);
		reg(ItemRegistry.bakedsweetpotatoItem);
		reg(ItemRegistry.teaItem);
		reg(ItemRegistry.coffeeItem);
		reg(ItemRegistry.popcornItem);
		reg(ItemRegistry.grilledeggplantItem);
		reg(ItemRegistry.raisinsItem);
		reg(ItemRegistry.ricecakeItem);
		reg(ItemRegistry.toastedcoconutItem);
		reg(ItemRegistry.vanillaItem);
		reg(ItemRegistry.toastedsesameseedsItem);
		reg(ItemRegistry.flourItem);
		reg(ItemRegistry.doughItem);
		reg(ItemRegistry.toastItem);
		reg(ItemRegistry.pastaItem);
		reg(ItemRegistry.heavycreamItem);
		reg(ItemRegistry.butterItem);
		reg(ItemRegistry.cheeseItem);
		reg(ItemRegistry.icecreamItem);
		reg(ItemRegistry.grilledcheeseItem);
		reg(ItemRegistry.applesauceItem);
		reg(ItemRegistry.applejuiceItem);
		reg(ItemRegistry.applepieItem);
		reg(ItemRegistry.caramelappleItem);
		reg(ItemRegistry.pumpkinbreadItem);
		reg(ItemRegistry.roastedpumpkinseedsItem);
		reg(ItemRegistry.pumpkinsoupItem);
		reg(ItemRegistry.melonjuiceItem);
		reg(ItemRegistry.melonsmoothieItem);
		reg(ItemRegistry.carrotjuiceItem);
		reg(ItemRegistry.carrotcakeItem);
		reg(ItemRegistry.carrotsoupItem);
		reg(ItemRegistry.glazedcarrotsItem);
		reg(ItemRegistry.butteredpotatoItem);
		reg(ItemRegistry.loadedbakedpotatoItem);
		reg(ItemRegistry.mashedpotatoesItem);
		reg(ItemRegistry.potatosaladItem);
		reg(ItemRegistry.potatosoupItem);
		reg(ItemRegistry.friesItem);
		reg(ItemRegistry.grilledmushroomItem);
		reg(ItemRegistry.stuffedmushroomItem);
		reg(ItemRegistry.chickensandwichItem);
		reg(ItemRegistry.chickennoodlesoupItem);
		reg(ItemRegistry.chickenpotpieItem);
		reg(ItemRegistry.breadedporkchopItem);
		reg(ItemRegistry.hotdogItem);
		reg(ItemRegistry.bakedhamItem);
		reg(ItemRegistry.hamburgerItem);
		reg(ItemRegistry.cheeseburgerItem);
		reg(ItemRegistry.baconcheeseburgerItem);
		reg(ItemRegistry.potroastItem);
		reg(ItemRegistry.fishsandwichItem);
		reg(ItemRegistry.fishsticksItem);
		reg(ItemRegistry.fishandchipsItem);
		reg(ItemRegistry.mayoItem);
		reg(ItemRegistry.friedeggItem);
		reg(ItemRegistry.scrambledeggItem);
		reg(ItemRegistry.boiledeggItem);
		reg(ItemRegistry.eggsaladItem);
		reg(ItemRegistry.caramelItem);
		reg(ItemRegistry.taffyItem);
		reg(ItemRegistry.spidereyesoupItem);
		reg(ItemRegistry.zombiejerkyItem);
		reg(ItemRegistry.cocoapowderItem);
		reg(ItemRegistry.chocolatebarItem);
		reg(ItemRegistry.hotchocolateItem);
		reg(ItemRegistry.chocolateicecreamItem);
		reg(ItemRegistry.vegetablesoupItem);
		reg(ItemRegistry.stockItem);
		reg(ItemRegistry.fruitsaladItem);
		reg(ItemRegistry.spagettiItem);
		reg(ItemRegistry.spagettiandmeatballsItem);
		reg(ItemRegistry.tomatosoupItem);
		reg(ItemRegistry.ketchupItem);
		reg(ItemRegistry.chickenparmasanItem);
		reg(ItemRegistry.pizzaItem);
		reg(ItemRegistry.springsaladItem);
		reg(ItemRegistry.porklettucewrapItem);
		reg(ItemRegistry.fishlettucewrapItem);
		reg(ItemRegistry.bltItem);
		reg(ItemRegistry.leafychickensandwichItem);
		reg(ItemRegistry.leafyfishsandwichItem);
		reg(ItemRegistry.deluxecheeseburgerItem);
		reg(ItemRegistry.delightedmealItem);
		reg(ItemRegistry.onionsoupItem);
		reg(ItemRegistry.potatocakesItem);
		reg(ItemRegistry.hashItem);
		reg(ItemRegistry.braisedonionsItem);
		reg(ItemRegistry.heartybreakfastItem);
		reg(ItemRegistry.cornonthecobItem);
		reg(ItemRegistry.cornmealItem);
		reg(ItemRegistry.cornbreadItem);
		reg(ItemRegistry.tortillaItem);
		reg(ItemRegistry.nachoesItem);
		reg(ItemRegistry.tacoItem);
		reg(ItemRegistry.fishtacoItem);
		reg(ItemRegistry.creamedcornItem);
		reg(ItemRegistry.strawberrysmoothieItem);
		reg(ItemRegistry.strawberrypieItem);
		reg(ItemRegistry.strawberrysaladItem);
		reg(ItemRegistry.strawberryjuiceItem);
		reg(ItemRegistry.chocolatestrawberryItem);
		reg(ItemRegistry.peanutbutterItem);
		reg(ItemRegistry.trailmixItem);
		reg(ItemRegistry.pbandjItem);
		reg(ItemRegistry.peanutbuttercookiesItem);
		reg(ItemRegistry.grapejuiceItem);
		reg(ItemRegistry.vinegarItem);
		reg(ItemRegistry.grapejellyItem);
		reg(ItemRegistry.grapesaladItem);
		reg(ItemRegistry.raisincookiesItem);
		reg(ItemRegistry.picklesItem);
		reg(ItemRegistry.cucumbersaladItem);
		reg(ItemRegistry.cucumbersoupItem);
		reg(ItemRegistry.vegetarianlettucewrapItem);
		reg(ItemRegistry.marinatedcucumbersItem);
		reg(ItemRegistry.ricesoupItem);
		reg(ItemRegistry.friedriceItem);
		reg(ItemRegistry.mushroomrisottoItem);
		reg(ItemRegistry.curryItem);
		reg(ItemRegistry.rainbowcurryItem);
		reg(ItemRegistry.refriedbeansItem);
		reg(ItemRegistry.bakedbeansItem);
		reg(ItemRegistry.beansandriceItem);
		reg(ItemRegistry.chiliItem);
		reg(ItemRegistry.beanburritoItem);
		reg(ItemRegistry.stuffedpepperItem);
		reg(ItemRegistry.veggiestirfryItem);
		reg(ItemRegistry.grilledskewersItem);
		reg(ItemRegistry.supremepizzaItem);
		reg(ItemRegistry.omeletItem);
		reg(ItemRegistry.hotwingsItem);
		reg(ItemRegistry.chilipoppersItem);
		reg(ItemRegistry.extremechiliItem);
		reg(ItemRegistry.chilichocolateItem);
		reg(ItemRegistry.lemonaideItem);
		reg(ItemRegistry.lemonbarItem);
		reg(ItemRegistry.fishdinnerItem);
		reg(ItemRegistry.lemonsmoothieItem);
		reg(ItemRegistry.lemonmeringueItem);
		reg(ItemRegistry.candiedlemonItem);
		reg(ItemRegistry.lemonchickenItem);
		reg(ItemRegistry.blueberrysmoothieItem);
		reg(ItemRegistry.blueberrypieItem);
		reg(ItemRegistry.blueberrymuffinItem);
		reg(ItemRegistry.blueberryjuiceItem);
		reg(ItemRegistry.pancakesItem);
		reg(ItemRegistry.blueberrypancakesItem);
		reg(ItemRegistry.cherryjuiceItem);
		reg(ItemRegistry.cherrypieItem);
		reg(ItemRegistry.chocolatecherryItem);
		reg(ItemRegistry.cherrysmoothieItem);
		reg(ItemRegistry.cheesecakeItem);
		reg(ItemRegistry.cherrycheesecakeItem);
		reg(ItemRegistry.stuffedeggplantItem);
		reg(ItemRegistry.eggplantparmItem);
		reg(ItemRegistry.raspberryicedteaItem);
		reg(ItemRegistry.chaiteaItem);
		reg(ItemRegistry.espressoItem);
		reg(ItemRegistry.coffeeconlecheItem);
		reg(ItemRegistry.mochaicecreamItem);
		reg(ItemRegistry.pickledbeetsItem);
		reg(ItemRegistry.beetsaladItem);
		reg(ItemRegistry.beetsoupItem);
		reg(ItemRegistry.bakedbeetsItem);
		reg(ItemRegistry.broccolimacItem);
		reg(ItemRegistry.broccolindipItem);
		reg(ItemRegistry.creamedbroccolisoupItem);
		reg(ItemRegistry.sweetpotatopieItem);
		reg(ItemRegistry.candiedsweetpotatoesItem);
		reg(ItemRegistry.mashedsweetpotatoesItem);
		reg(ItemRegistry.steamedpeasItem);
		reg(ItemRegistry.splitpeasoupItem);
		reg(ItemRegistry.pineappleupsidedowncakeItem);
		reg(ItemRegistry.pineapplehamItem);
		reg(ItemRegistry.pineappleyogurtItem);
		reg(ItemRegistry.turnipsoupItem);
		reg(ItemRegistry.roastedrootveggiemedleyItem);
		reg(ItemRegistry.bakedturnipsItem);
		reg(ItemRegistry.gingerbreadItem);
		reg(ItemRegistry.gingersnapsItem);
		reg(ItemRegistry.candiedgingerItem);
		reg(ItemRegistry.mustardItem);
		reg(ItemRegistry.softpretzelandmustardItem);
		reg(ItemRegistry.spicymustardporkItem);
		reg(ItemRegistry.spicygreensItem);
		reg(ItemRegistry.garlicbreadItem);
		reg(ItemRegistry.garlicmashedpotatoesItem);
		reg(ItemRegistry.garlicchickenItem);
		reg(ItemRegistry.summerradishsaladItem);
		reg(ItemRegistry.summersquashwithradishItem);
		reg(ItemRegistry.celeryandpeanutbutterItem);
		reg(ItemRegistry.chickencelerycasseroleItem);
		reg(ItemRegistry.peasandceleryItem);
		reg(ItemRegistry.celerysoupItem);
		reg(ItemRegistry.zucchinibreadItem);
		reg(ItemRegistry.zucchinifriesItem);
		reg(ItemRegistry.zestyzucchiniItem);
		reg(ItemRegistry.zucchinibakeItem);
		reg(ItemRegistry.asparagusquicheItem);
		reg(ItemRegistry.asparagussoupItem);
		reg(ItemRegistry.walnutraisinbreadItem);
		reg(ItemRegistry.candiedwalnutsItem);
		reg(ItemRegistry.brownieItem);
		reg(ItemRegistry.papayajuiceItem);
		reg(ItemRegistry.papayasmoothieItem);
		reg(ItemRegistry.papayayogurtItem);
		reg(ItemRegistry.starfruitjuiceItem);
		reg(ItemRegistry.starfruitsmoothieItem);
		reg(ItemRegistry.starfruityogurtItem);
		reg(ItemRegistry.guacamoleItem);
		reg(ItemRegistry.creamofavocadosoupItem);
		reg(ItemRegistry.avocadoburritoItem);
		reg(ItemRegistry.poachedpearItem);
		reg(ItemRegistry.fruitcrumbleItem);
		reg(ItemRegistry.pearyogurtItem);
		reg(ItemRegistry.plumyogurtItem);
		reg(ItemRegistry.bananasplitItem);
		reg(ItemRegistry.banananutbreadItem);
		reg(ItemRegistry.bananasmoothieItem);
		reg(ItemRegistry.bananayogurtItem);
		reg(ItemRegistry.coconutmilkItem);
		reg(ItemRegistry.chickencurryItem);
		reg(ItemRegistry.coconutshrimpItem);
		reg(ItemRegistry.coconutyogurtItem);
		reg(ItemRegistry.orangejuiceItem);
		reg(ItemRegistry.orangechickenItem);
		reg(ItemRegistry.orangesmoothieItem);
		reg(ItemRegistry.orangeyogurtItem);
		reg(ItemRegistry.peachjuiceItem);
		reg(ItemRegistry.peachcobblerItem);
		reg(ItemRegistry.peachsmoothieItem);
		reg(ItemRegistry.peachyogurtItem);
		reg(ItemRegistry.limejuiceItem);
		reg(ItemRegistry.keylimepieItem);
		reg(ItemRegistry.limesmoothieItem);
		reg(ItemRegistry.limeyogurtItem);
		reg(ItemRegistry.mangojuiceItem);
		reg(ItemRegistry.mangosmoothieItem);
		reg(ItemRegistry.mangoyogurtItem);
		reg(ItemRegistry.pomegranatejuiceItem);
		reg(ItemRegistry.pomegranatesmoothieItem);
		reg(ItemRegistry.pomegranateyogurtItem);
		reg(ItemRegistry.vanillayogurtItem);
		reg(ItemRegistry.cinnamonrollItem);
		reg(ItemRegistry.frenchtoastItem);
		reg(ItemRegistry.marshmellowsItem);
		reg(ItemRegistry.donutItem);
		reg(ItemRegistry.chocolatedonutItem);
		reg(ItemRegistry.powdereddonutItem);
		reg(ItemRegistry.jellydonutItem);
		reg(ItemRegistry.frosteddonutItem);
		reg(ItemRegistry.cactussoupItem);
		reg(ItemRegistry.wafflesItem);
		reg(ItemRegistry.seedsoupItem);
		reg(ItemRegistry.softpretzelItem);
		reg(ItemRegistry.jellybeansItem);
		reg(ItemRegistry.biscuitItem);
		reg(ItemRegistry.creamcookieItem);
		reg(ItemRegistry.jaffaItem);
		reg(ItemRegistry.friedchickenItem);
		reg(ItemRegistry.chocolatesprinklecakeItem);
		reg(ItemRegistry.redvelvetcakeItem);
		reg(ItemRegistry.footlongItem);
		reg(ItemRegistry.blueberryyogurtItem);
		reg(ItemRegistry.lemonyogurtItem);
		reg(ItemRegistry.cherryyogurtItem);
		reg(ItemRegistry.strawberryyogurtItem);
		reg(ItemRegistry.grapeyogurtItem);
		reg(ItemRegistry.chocolateyogurtItem);
		reg(ItemRegistry.blackberryjuiceItem);
		reg(ItemRegistry.blackberrycobblerItem);
		reg(ItemRegistry.blackberrysmoothieItem);
		reg(ItemRegistry.blackberryyogurtItem);
		reg(ItemRegistry.chocolatemilkItem);
		reg(ItemRegistry.pumpkinyogurtItem);
		reg(ItemRegistry.raspberryjuiceItem);
		reg(ItemRegistry.raspberrypieItem);
		reg(ItemRegistry.raspberrysmoothieItem);
		reg(ItemRegistry.raspberryyogurtItem);
		reg(ItemRegistry.cinnamonsugardonutItem);
		reg(ItemRegistry.melonyogurtItem);
		reg(ItemRegistry.kiwijuiceItem);
		reg(ItemRegistry.kiwismoothieItem);
		reg(ItemRegistry.kiwiyogurtItem);
		reg(ItemRegistry.plainyogurtItem);
		reg(ItemRegistry.appleyogurtItem);
		reg(ItemRegistry.saltedsunflowerseedsItem);
		reg(ItemRegistry.sunflowerwheatrollsItem);
		reg(ItemRegistry.sunflowerbroccolisaladItem);
		reg(ItemRegistry.cranberryjuiceItem);
		reg(ItemRegistry.cranberrysauceItem);
		reg(ItemRegistry.cranberrybarItem);
		reg(ItemRegistry.peppermintItem);
		reg(ItemRegistry.cactusfruitjuiceItem);
		reg(ItemRegistry.blackpepperItem);
		reg(ItemRegistry.groundcinnamonItem);
		reg(ItemRegistry.groundnutmegItem);
		reg(ItemRegistry.oliveoilItem);
		reg(ItemRegistry.baklavaItem);
		reg(ItemRegistry.gummybearsItem);
		reg(ItemRegistry.baconmushroomburgerItem);
		reg(ItemRegistry.fruitpunchItem);
		reg(ItemRegistry.meatystewItem);
		reg(ItemRegistry.mixedsaladItem);
		reg(ItemRegistry.pinacoladaItem);
		reg(ItemRegistry.saladdressingItem);
		reg(ItemRegistry.shepardspieItem);
		reg(ItemRegistry.eggnogItem);
		reg(ItemRegistry.custardItem);
		reg(ItemRegistry.sushiItem);
		reg(ItemRegistry.gardensoupItem);
		reg(ItemRegistry.applejellyItem);
		reg(ItemRegistry.applejellysandwichItem);
		reg(ItemRegistry.blackberryjellyItem);
		reg(ItemRegistry.blackberryjellysandwichItem);
		reg(ItemRegistry.blueberryjellyItem);
		reg(ItemRegistry.blueberryjellysandwichItem);
		reg(ItemRegistry.cherryjellyItem);
		reg(ItemRegistry.cherryjellysandwichItem);
		reg(ItemRegistry.cranberryjellyItem);
		reg(ItemRegistry.cranberryjellysandwichItem);
		reg(ItemRegistry.kiwijellyItem);
		reg(ItemRegistry.kiwijellysandwichItem);
		reg(ItemRegistry.lemonjellyItem);
		reg(ItemRegistry.lemonjellysandwichItem);
		reg(ItemRegistry.limejellyItem);
		reg(ItemRegistry.limejellysandwichItem);
		reg(ItemRegistry.mangojellyItem);
		reg(ItemRegistry.mangojellysandwichItem);
		reg(ItemRegistry.orangejellyItem);
		reg(ItemRegistry.orangejellysandwichItem);
		reg(ItemRegistry.papayajellyItem);
		reg(ItemRegistry.papayajellysandwichItem);
		reg(ItemRegistry.peachjellyItem);
		reg(ItemRegistry.peachjellysandwichItem);
		reg(ItemRegistry.pomegranatejellyItem);
		reg(ItemRegistry.pomegranatejellysandwichItem);
		reg(ItemRegistry.raspberryjellyItem);
		reg(ItemRegistry.raspberryjellysandwichItem);
		reg(ItemRegistry.starfruitjellyItem);
		reg(ItemRegistry.starfruitjellysandwichItem);
		reg(ItemRegistry.strawberryjellyItem);
		reg(ItemRegistry.strawberryjellysandwichItem);
		reg(ItemRegistry.watermelonjellyItem);
		reg(ItemRegistry.watermelonjellysandwichItem);
		reg(ItemRegistry.bubblywaterItem);
		reg(ItemRegistry.cherrysodaItem);
		reg(ItemRegistry.colasodaItem);
		reg(ItemRegistry.gingersodaItem);
		reg(ItemRegistry.grapesodaItem);
		reg(ItemRegistry.lemonlimesodaItem);
		reg(ItemRegistry.orangesodaItem);
		reg(ItemRegistry.rootbeersodaItem);
		reg(ItemRegistry.strawberrysodaItem);
		reg(ItemRegistry.caramelicecreamItem);
		reg(ItemRegistry.mintchocolatechipicecreamItem);
		reg(ItemRegistry.strawberryicecreamItem);
		reg(ItemRegistry.vanillaicecreamItem);
		reg(ItemRegistry.gingerchickenItem);
		reg(ItemRegistry.oldworldveggiesoupItem);
		reg(ItemRegistry.spicebunItem);
		reg(ItemRegistry.gingeredrhubarbtartItem);
		reg(ItemRegistry.lambbarleysoupItem);
		reg(ItemRegistry.honeylemonlambItem);
		reg(ItemRegistry.pumpkinoatsconesItem);
		reg(ItemRegistry.beefjerkyItem);
		reg(ItemRegistry.plumjuiceItem);
		reg(ItemRegistry.pearjuiceItem);
		reg(ItemRegistry.ovenroastedcauliflowerItem);
		reg(ItemRegistry.leekbaconsoupItem);
		reg(ItemRegistry.herbbutterparsnipsItem);
		reg(ItemRegistry.scallionbakedpotatoItem);
		reg(ItemRegistry.soymilkItem);
		reg(ItemRegistry.firmtofuItem);
		reg(ItemRegistry.silkentofuItem);
		reg(ItemRegistry.bamboosteamedriceItem);
		reg(ItemRegistry.roastedchestnutItem);
		reg(ItemRegistry.sweetpotatosouffleItem);
		reg(ItemRegistry.cashewchickenItem);
		reg(ItemRegistry.apricotjuiceItem);
		reg(ItemRegistry.apricotyogurtItem);
		reg(ItemRegistry.apricotglazedporkItem);
		reg(ItemRegistry.apricotjellyItem);
		reg(ItemRegistry.apricotjellysandwichItem);
		reg(ItemRegistry.apricotsmoothieItem);
		reg(ItemRegistry.figbarItem);
		reg(ItemRegistry.figjellyItem);
		reg(ItemRegistry.figjellysandwichItem);
		reg(ItemRegistry.figsmoothieItem);
		reg(ItemRegistry.figyogurtItem);
		reg(ItemRegistry.figjuiceItem);
		reg(ItemRegistry.grapefruitjuiceItem);
		reg(ItemRegistry.grapefruitjellyItem);
		reg(ItemRegistry.grapefruitjellysandwichItem);
		reg(ItemRegistry.grapefruitsmoothieItem);
		reg(ItemRegistry.grapefruityogurtItem);
		reg(ItemRegistry.grapefruitsodaItem);
		reg(ItemRegistry.citrussaladItem);
		reg(ItemRegistry.pecanpieItem);
		reg(ItemRegistry.pralinesItem);
		reg(ItemRegistry.persimmonjuiceItem);
		reg(ItemRegistry.persimmonyogurtItem);
		reg(ItemRegistry.persimmonsmoothieItem);
		reg(ItemRegistry.persimmonjellyItem);
		reg(ItemRegistry.persimmonjellysandwichItem);
		reg(ItemRegistry.pistachiobakedsalmonItem);
		reg(ItemRegistry.baconwrappeddatesItem);
		reg(ItemRegistry.datenutbreadItem);
		reg(ItemRegistry.maplesyruppancakesItem);
		reg(ItemRegistry.maplesyrupwafflesItem);
		reg(ItemRegistry.maplesausageItem);
		reg(ItemRegistry.mapleoatmealItem);
		reg(ItemRegistry.peachesandcreamoatmealItem);
		reg(ItemRegistry.cinnamonappleoatmealItem);
		reg(ItemRegistry.maplecandiedbaconItem);
		reg(ItemRegistry.toastsandwichItem);
		reg(ItemRegistry.potatoandcheesepirogiItem);
		reg(ItemRegistry.zeppoleItem);
		reg(ItemRegistry.sausageinbreadItem);
		reg(ItemRegistry.chocolatecaramelfudgeItem);
		reg(ItemRegistry.lavendershortbreadItem);
		reg(ItemRegistry.beefwellingtonItem);
		reg(ItemRegistry.epicbaconItem);
		reg(ItemRegistry.manjuuItem);
		reg(ItemRegistry.chickengumboItem);
		reg(ItemRegistry.generaltsochickenItem);
		reg(ItemRegistry.californiarollItem);
		reg(ItemRegistry.futomakiItem);
		reg(ItemRegistry.beansontoastItem);
		reg(ItemRegistry.vegemiteItem);
		reg(ItemRegistry.honeycombchocolatebarItem);
		reg(ItemRegistry.cherrycoconutchocolatebarItem);
		reg(ItemRegistry.fairybreadItem);
		reg(ItemRegistry.lamingtonItem);
		reg(ItemRegistry.timtamItem);
		reg(ItemRegistry.meatpieItem);
		reg(ItemRegistry.chikorollItem);
		reg(ItemRegistry.damperItem);
		reg(ItemRegistry.beetburgerItem);
		reg(ItemRegistry.pavlovaItem);
		reg(ItemRegistry.gherkinItem);
		reg(ItemRegistry.mcpamItem);
		reg(ItemRegistry.ceasarsaladItem);
		reg(ItemRegistry.chaoscookieItem);
		reg(ItemRegistry.chocolatebaconItem);
		reg(ItemRegistry.lambkebabItem);
		reg(ItemRegistry.nutellaItem);
		reg(ItemRegistry.snickersbarItem);
		reg(ItemRegistry.spinachpieItem);
		reg(ItemRegistry.steamedspinachItem);
		reg(ItemRegistry.vegemiteontoastItem);
		reg(ItemRegistry.anchovyrawItem);
		reg(ItemRegistry.bassrawItem);
		reg(ItemRegistry.carprawItem);
		reg(ItemRegistry.catfishrawItem);
		reg(ItemRegistry.charrrawItem);
		reg(ItemRegistry.clamrawItem);
		reg(ItemRegistry.crabrawItem);
		reg(ItemRegistry.crayfishrawItem);
		reg(ItemRegistry.eelrawItem);
		reg(ItemRegistry.frograwItem);
		reg(ItemRegistry.grouperrawItem);
		reg(ItemRegistry.herringrawItem);
		reg(ItemRegistry.jellyfishrawItem);
		reg(ItemRegistry.mudfishrawItem);
		reg(ItemRegistry.octopusrawItem);
		reg(ItemRegistry.perchrawItem);
		reg(ItemRegistry.scalloprawItem);
		reg(ItemRegistry.shrimprawItem);
		reg(ItemRegistry.snailrawItem);
		reg(ItemRegistry.snapperrawItem);
		reg(ItemRegistry.tilapiarawItem);
		reg(ItemRegistry.troutrawItem);
		reg(ItemRegistry.tunarawItem);
		reg(ItemRegistry.turtlerawItem);
		reg(ItemRegistry.walleyerawItem);
		reg(ItemRegistry.holidaycakeItem);
		reg(ItemRegistry.clamcookedItem);
		reg(ItemRegistry.crabcookedItem);
		reg(ItemRegistry.crayfishcookedItem);
		reg(ItemRegistry.frogcookedItem);
		reg(ItemRegistry.octopuscookedItem);
		reg(ItemRegistry.scallopcookedItem);
		reg(ItemRegistry.shrimpcookedItem);
		reg(ItemRegistry.snailcookedItem);
		reg(ItemRegistry.turtlecookedItem);
		reg(ItemRegistry.appleciderItem);
		reg(ItemRegistry.bangersandmashItem);
		reg(ItemRegistry.batteredsausageItem);
		reg(ItemRegistry.batterItem);
		reg(ItemRegistry.chorizoItem);
		reg(ItemRegistry.coleslawItem);
		reg(ItemRegistry.energydrinkItem);
		reg(ItemRegistry.friedonionsItem);
		reg(ItemRegistry.meatfeastpizzaItem);
		reg(ItemRegistry.mincepieItem);
		reg(ItemRegistry.onionhamburgerItem);
		reg(ItemRegistry.pepperoniItem);
		reg(ItemRegistry.pickledonionsItem);
		reg(ItemRegistry.porksausageItem);
		reg(ItemRegistry.raspberrytrifleItem);
		reg(ItemRegistry.pumpkincheesecakeItem);
		reg(ItemRegistry.pumpkinmuffinItem);
		reg(ItemRegistry.suaderoItem);
		reg(ItemRegistry.randomtacoItem);
		reg(ItemRegistry.turkeyrawItem);
		reg(ItemRegistry.turkeycookedItem);
		//reg(ItemRegistry.rabbitrawItem);
		//reg(ItemRegistry.rabbitcookedItem);
		reg(ItemRegistry.venisonrawItem);
		reg(ItemRegistry.venisoncookedItem);
		reg(ItemRegistry.strawberrymilkshakeItem);
		reg(ItemRegistry.chocolatemilkshakeItem);
		reg(ItemRegistry.bananamilkshakeItem);
		reg(ItemRegistry.cornflakesItem);
		reg(ItemRegistry.coleslawburgerItem);
		reg(ItemRegistry.roastchickenItem);
		reg(ItemRegistry.roastpotatoesItem);
		reg(ItemRegistry.sundayroastItem);
		reg(ItemRegistry.bbqpulledporkItem);
		reg(ItemRegistry.lambwithmintsauceItem);
		reg(ItemRegistry.steakandchipsItem);
		reg(ItemRegistry.cherryicecreamItem);
		reg(ItemRegistry.pistachioicecreamItem);
		reg(ItemRegistry.neapolitanicecreamItem);
		reg(ItemRegistry.spumoniicecreamItem);
		reg(ItemRegistry.almondbutterItem);
		reg(ItemRegistry.cashewbutterItem);
		reg(ItemRegistry.chestnutbutterItem);
		reg(ItemRegistry.cornishpastyItem);
		reg(ItemRegistry.cottagepieItem);
		reg(ItemRegistry.croissantItem);
		reg(ItemRegistry.currypowderItem);
		reg(ItemRegistry.dimsumItem);
		reg(ItemRegistry.friedpecanokraItem);
		reg(ItemRegistry.gooseberryjellyItem);
		reg(ItemRegistry.gooseberryjellysandwichItem);
		reg(ItemRegistry.gooseberrymilkshakeItem);
		reg(ItemRegistry.gooseberrypieItem);
		reg(ItemRegistry.gooseberrysmoothieItem);
		reg(ItemRegistry.gooseberryyogurtItem);
		reg(ItemRegistry.greenheartfishItem);
		reg(ItemRegistry.hamsweetpicklesandwichItem);
		reg(ItemRegistry.hushpuppiesItem);
		reg(ItemRegistry.kimchiItem);
		reg(ItemRegistry.mochiItem);
		reg(ItemRegistry.museliItem);
		reg(ItemRegistry.naanItem);
		reg(ItemRegistry.okrachipsItem);
		reg(ItemRegistry.okracreoleItem);
		reg(ItemRegistry.pistachiobutterItem);
		reg(ItemRegistry.ploughmanslunchItem);
		reg(ItemRegistry.porklomeinItem);
		reg(ItemRegistry.salmonpattiesItem);
		reg(ItemRegistry.sausageItem);
		reg(ItemRegistry.sausagerollItem);
		reg(ItemRegistry.sesameballItem);
		reg(ItemRegistry.sesamesnapsItem);
		reg(ItemRegistry.shrimpokrahushpuppiesItem);
		reg(ItemRegistry.soysauceItem);
		reg(ItemRegistry.sweetpickleItem);
		reg(ItemRegistry.veggiestripsItem);
		reg(ItemRegistry.vindalooItem);

		reg(ItemRegistry.applesmoothieItem);
		reg(ItemRegistry.cheeseontoastItem);
		reg(ItemRegistry.chocolaterollItem);
		reg(ItemRegistry.coconutcreamItem);
		reg(ItemRegistry.coconutsmoothieItem);
		reg(ItemRegistry.crackerItem);
		reg(ItemRegistry.cranberrysmoothieItem);
		reg(ItemRegistry.cranberryyogurtItem);
		reg(ItemRegistry.deluxechickencurryItem);
		reg(ItemRegistry.garammasalaItem);
		reg(ItemRegistry.grapesmoothieItem);
		reg(ItemRegistry.gravyItem);
		reg(ItemRegistry.honeysandwichItem);
		reg(ItemRegistry.jamrollItem);
		reg(ItemRegistry.mangochutneyItem);
		reg(ItemRegistry.marzipanItem);
		reg(ItemRegistry.paneerItem);
		reg(ItemRegistry.paneertikkamasalaItem);
		reg(ItemRegistry.peaandhamsoupItem);
		reg(ItemRegistry.pearjellyItem);
		reg(ItemRegistry.pearjellysandwichItem);
		reg(ItemRegistry.pearsmoothieItem);
		reg(ItemRegistry.plumjellyItem);
		reg(ItemRegistry.plumjellysandwichItem);
		reg(ItemRegistry.plumsmoothieItem);
		reg(ItemRegistry.potatoandleeksoupItem);
		reg(ItemRegistry.toadintheholeItem);
		reg(ItemRegistry.tunapotatoItem);
		reg(ItemRegistry.yorkshirepuddingItem);
		
		reg(ItemRegistry.tunasaladItem);
		reg(ItemRegistry.TurkishDelightItem);
		reg(ItemRegistry.VanillaConchasBreadItem);
		reg(ItemRegistry.VanillaCupcakeItem);
		reg(ItemRegistry.wontonsoupItem);
		reg(ItemRegistry.schnitzelItem);
		reg(ItemRegistry.bratwurstItem);
		//reg(ItemRegistry.metaItem, 0, "meta_item_white");
		//reg(ItemRegistry.metaItem, 1, "meta_item_black");
	}


	private static ItemModelMesher modelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();


	public static void reg(Item item)
	{
		modelMesher.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}


	public static void reg(Item item, int meta, String file)
	{
		modelMesher.register(item, meta, new ModelResourceLocation(Reference.MODID + ":" + file, "inventory"));
	}
}
