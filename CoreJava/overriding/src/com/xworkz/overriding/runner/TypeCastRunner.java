package com.xworkz.overriding.runner;

import com.xworkz.overriding.external.TypeCasting;
import com.xworkz.overriding.internal.*;
import javafx.util.Builder;

public class TypeCastRunner {
    public static void main(String[] args) {
        TypeCasting typeCasting = new TypeCasting();


        Actor actor = new Actor();
        ShahRukhKhan shahRukhKhan = new ShahRukhKhan();

        typeCasting.increaseFans(actor);
        typeCasting.increaseFans(shahRukhKhan);

        System.out.println("==================================");
        Actress actress = new Actress();
        Deepika deepika = new Deepika();

        typeCasting.giveAudition(actress);
        typeCasting.giveAudition(deepika);

        System.out.println("==================================");

        Agent agent = new Agent();
        Broker broker = new Broker();

        typeCasting.bookHouse(broker);
        typeCasting.bookHouse(agent);
        System.out.println("==================================");

        Notification notification = new Notification();
        Alarm alarm = new Alarm();

        typeCasting.triggerAlert(notification);
        typeCasting.triggerAlert(alarm);
        System.out.println("==================================");

        Software software = new Software();
        Antivirus antivirus = new Antivirus();

        typeCasting.runScan(software);
        typeCasting.runScan(antivirus);
        System.out.println("==================================");

        Armor armor = new Armor();
        Shield shield = new Shield();

        typeCasting.blockAttack(armor);
        typeCasting.blockAttack(shield);
        System.out.println("==================================");

        Author author = new Author();
        Shakespeare shakespeare = new Shakespeare();

        typeCasting.writePlay(author);
        typeCasting.writePlay(shakespeare);
        System.out.println("==================================");

        Backup backup = new Backup();
        Generator generator = new Generator();

        typeCasting.startBackup(backup);
        typeCasting.startBackup(generator);
        System.out.println("==================================");

        Carrier carrier = new Carrier();
        Basket basket = new Basket();

        typeCasting.storeGoods(carrier);
        typeCasting.storeGoods(basket);
        System.out.println("==================================");

        PowerSource powerSource = new PowerSource();
        Battery battery = new Battery();

        typeCasting.chargeDevice(powerSource);
        typeCasting.chargeDevice(battery);
        System.out.println("==================================");

        Composer composer = new Composer();
        Beethoven beethoven = new Beethoven();

        typeCasting.playSymphony(composer);
        typeCasting.playSymphony(beethoven);
        System.out.println("==================================");

        Berry berry = new Berry();
        Strawberry strawberry = new Strawberry();
        typeCasting.pickFruit(berry);
        typeCasting.pickFruit(strawberry);
        System.out.println("==================================");

        Blanket blanket = new Blanket();
        Quilt quilt = new Quilt();
        typeCasting.warmUp(blanket);
        typeCasting.warmUp(quilt);
        System.out.println("==================================");

        Notebook notebook = new Notebook();
        Diary diary = new Diary();
        typeCasting.writeSecret(notebook);
        typeCasting.writeSecret(diary);
        System.out.println("==================================");

        Brand brand = new Brand();
        Honda honda = new Honda();
        typeCasting.launchProduct(brand);
        typeCasting.launchProduct(honda);
        System.out.println("==================================");

        Brush brush = new Brush();
        Toothbrush toothBrush = new Toothbrush();
        typeCasting.cleanTeeth(brush);
        typeCasting.cleanTeeth(toothBrush);
        System.out.println("==================================");

        Train train = new Train();
        VandeBharath vandebharath = new VandeBharath();
        typeCasting.startJourney(train);
        typeCasting.startJourney(vandebharath);
        System.out.println("==================================");

        Trap trap = new Trap();
        Net net = new Net();
        typeCasting.catchAnimal(trap);
        typeCasting.catchAnimal(net);
        System.out.println("==================================");

        Room room = new Room();
        LivingRoom livingRoom = new LivingRoom();
        typeCasting.decorateHouse(room);
        typeCasting.decorateHouse(livingRoom);
        System.out.println("==================================");

        Dessert dessert = new Dessert();
        Cake cake = new Cake();
        typeCasting.bakeSweet(dessert);
        typeCasting.bakeSweet(cake);
        System.out.println("==================================");

        Desert desert = new Desert();
        Sahara sahara = new Sahara();
        typeCasting.exploreSand(desert);
        typeCasting.exploreSand(sahara);
        System.out.println("==================================");

        Camera camera = new Camera();
        DSLR dslr = new DSLR();
        typeCasting.capturePhoto(camera);
        typeCasting.capturePhoto(dslr);
        System.out.println("==================================");

        Vegetable vegetable = new Vegetable();
        Capsicum capsicum = new Capsicum();
        typeCasting.cookDish(vegetable);
        typeCasting.cookDish(capsicum);
        System.out.println("==================================");

        Card card = new Card();
        CreditCard creditCard = new CreditCard();
        typeCasting.swipePayment(card);
        typeCasting.swipePayment(creditCard);
        System.out.println("==================================");

        Sport sport = new Sport();
        Cricket cricket = new Cricket();
        typeCasting.playMatch(sport);
        typeCasting.playMatch(cricket);

        System.out.println("==================================");
        Gym gym = new Gym();
        CultFit cultFit = new CultFit();
        typeCasting.joinSession(gym);
        typeCasting.joinSession(cultFit);
        System.out.println("==================================");

        Doctor doctor = new Doctor();
        Cardiologist cardiologist = new Cardiologist();
        typeCasting.consultPatient(doctor);
        typeCasting.consultPatient(cardiologist);
        System.out.println("==================================");

        Cleanser cleanser = new Cleanser();
        FaceWash faceWash = new FaceWash();
        typeCasting.hydrateFace(cleanser);
        typeCasting.hydrateFace(faceWash);

        System.out.println("==================================");
        Color color = new Color();
        Yellow yellow = new Yellow();
        typeCasting.paintWall(color);
        typeCasting.paintWall(yellow);

        System.out.println("==================================");
        Witch witch = new Witch();
        WandaMaximoff wandaMaximoff = new WandaMaximoff();
        typeCasting.makeAlternateReality(witch);
        typeCasting.makeAlternateReality(wandaMaximoff);

        System.out.println("==================================");
        Wizard wizard = new Wizard();
        DoctorStrange doctorStrange = new DoctorStrange();
        typeCasting.performMagic(wizard);
        typeCasting.performMagic(doctorStrange);

        System.out.println("==================================");
        Fabric fabric = new Fabric();
        Denim denim = new Denim();
        typeCasting.stitchCloth(fabric);
        typeCasting.stitchCloth(denim);

        System.out.println("==================================");
        Herbivore herbivore = new Herbivore();
        Cow cow = new Cow();
        typeCasting.grazeGrass(herbivore);
        typeCasting.grazeGrass(cow);

        System.out.println("==================================");
        Processor processor = new Processor();
        CPU cpu = new CPU();
        typeCasting.processData(processor);
        typeCasting.processData(cpu);

        System.out.println("==================================");
        Cushion cushion = new Cushion();
        Pillow pillow = new Pillow();
        typeCasting.restHead(cushion);
        typeCasting.restHead(pillow);

        System.out.println("==================================");
        Prey prey = new Prey();
        Deer deer = new Deer();
        typeCasting.escapeHunt(prey);
        typeCasting.escapeHunt(deer);

        System.out.println("==================================");
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
        typeCasting.stalkPrey(predator);
        typeCasting.stalkPrey(tiger);

        System.out.println("==================================");
        Fish fish = new Fish();
        Tuna tuna = new Tuna();
        typeCasting.swimDeep(fish);
        typeCasting.swimDeep(tuna);
        System.out.println("==================================");

        Flask flask = new Flask();
        Thermos thermos = new Thermos();
        typeCasting.keepHot(flask);
        typeCasting.keepHot(thermos);

        System.out.println("==================================");
        Footwear footwear = new Footwear();
        FlipFlop flipFlop = new FlipFlop();
        typeCasting.wearOnFeet(footwear);
        typeCasting.wearOnFeet(flipFlop);

        System.out.println("==================================");
        Cutter cutter = new Cutter();
        Saw saw = new Saw();
        typeCasting.cutWood(cutter);
        typeCasting.cutWood(saw);

        System.out.println("==================================");
        Spaceship spaceship = new Spaceship();
        Satellite satellite = new Satellite();
        typeCasting.orbitEarth(spaceship);
        typeCasting.orbitEarth(satellite);

        System.out.println("==================================");
        Drawing drawing = new Drawing();
        Stickman stickman = new Stickman();
        typeCasting.sketchFigure(drawing);
        typeCasting.sketchFigure(stickman);

        System.out.println("==================================");
        Stick stick = new Stick();
        Twig twig = new Twig();
        typeCasting.collectBranch(stick);
        typeCasting.collectBranch(twig);

        System.out.println("==================================");
        Tree tree = new Tree();
        Peepal peepal = new Peepal();
        typeCasting.growShade(tree);
        typeCasting.growShade(peepal);
        System.out.println("==================================");

        Painting painting = new Painting();
        StarryNight starryNight = new StarryNight();
        typeCasting.displayArt(painting);
        typeCasting.displayArt(starryNight);

        System.out.println("==================================");
        Fruit fruit = new Fruit();
        Mango mango = new Mango();
        typeCasting.pluckFruit(fruit);
        typeCasting.pluckFruit(mango);

        System.out.println("==================================");
        Paint paint = new Paint();
        FabricPaint fabricPaint = new FabricPaint();
        typeCasting.colorFabric(paint);
        typeCasting.colorFabric(fabricPaint);

        System.out.println("==================================");
        Turbine turbine = new Turbine();
        Windmill windmill = new Windmill();
        typeCasting.spinBlade(turbine);
        typeCasting.spinBlade(windmill);

        System.out.println("==================================");
        Mountain mountain = new Mountain();
        Everest everest = new Everest();
        typeCasting.climbPeak(mountain);
        typeCasting.climbPeak(everest);

        System.out.println("==================================");
        OutputDevice outputDevice = new OutputDevice();
        Monitor monitor = new Monitor();
        typeCasting.displayScreen(outputDevice);
        typeCasting.displayScreen(monitor);

        System.out.println("==================================");
        Flower flower = new Flower();
        Tulip tulip = new Tulip();
        typeCasting.bloomPetal(flower);
        typeCasting.bloomPetal(tulip);

        System.out.println("==================================");
        Snack snack = new Snack();
        FrenchFry frenchFry = new FrenchFry();
        typeCasting.serveSnack(snack);
        typeCasting.serveSnack(frenchFry);

        System.out.println("==================================");
        Snake snake = new Snake();
        Python python = new Python();
        typeCasting.slitherFast(snake);
        typeCasting.slitherFast(python);

        System.out.println("==================================");
        Toy toy = new Toy();
        Frisbee frisbee = new Frisbee();
        typeCasting.tossPlay(toy);
        typeCasting.tossPlay(frisbee);

        System.out.println("==================================");
        Furniture furniture = new Furniture();
        Table table = new Table();
        typeCasting.placeItems(furniture);
        typeCasting.placeItems(table);

        System.out.println("==================================");
        Galaxy galaxy = new Galaxy();
        Milkyway milkyWay = new Milkyway();
        typeCasting.rotateStars(galaxy);
        typeCasting.rotateStars(milkyWay);

        System.out.println("==================================");
        InputDevice inputDevice = new InputDevice();
        Mouse mouse = new Mouse();
        typeCasting.clickButton(inputDevice);
        typeCasting.clickButton(mouse);

        System.out.println("==================================");
        Garden garden = new Garden();
        Park park = new Park();
        typeCasting.relaxPlace(garden);
        typeCasting.relaxPlace(park);

        System.out.println("==================================");
        Gemstone gemstone = new Gemstone();
        Sapphire sapphire = new Sapphire();
        typeCasting.sparkleBright(gemstone);
        typeCasting.sparkleBright(sapphire);

        System.out.println("==================================");
        Metal metal = new Metal();
        Gold gold = new Gold();
        typeCasting.forgeShape(metal);
        typeCasting.forgeShape(gold);

        System.out.println("==================================");
        SearchEngine searchEngine = new SearchEngine();
        Google google = new Google();
        typeCasting.searchInfo(searchEngine);
        typeCasting.searchInfo(google);

        System.out.println("==================================");
        Tool tool = new Tool();
        Hammer hammer = new Hammer();
        typeCasting.hitNail(tool);
        typeCasting.hitNail(hammer);
        System.out.println("==================================");

        Holder holder = new Holder();
        Hanger hanger = new Hanger();
        typeCasting.holdClothes(holder);
        typeCasting.holdClothes(hanger);

        System.out.println("==================================");
        Outfit outfit = new Outfit();
        Hoodie hoodie = new Hoodie();
        typeCasting.wearWarm(outfit);
        typeCasting.wearWarm(hoodie);

        System.out.println("==================================");
        Hotel hotel = new Hotel();
        Taj taj = new Taj();
        typeCasting.bookStay(hotel);
        typeCasting.bookStay(taj);

        System.out.println("==================================");
        OutdoorGame outdoorGame = new OutdoorGame();
        Soccer soccer = new Soccer();
        typeCasting.kickBall(outdoorGame);
        typeCasting.kickBall(soccer);

        System.out.println("==================================");
        IndoorGame indoorGame = new IndoorGame();
        Ludo ludo = new Ludo();
        typeCasting.rollDice(indoorGame);
        typeCasting.rollDice(ludo);

        System.out.println("==================================");
        Container container = new Container();
        Jar jar = new Jar();
        typeCasting.storeStuff(container);
        typeCasting.storeStuff(jar);

        System.out.println("==================================");
        Planet planet = new Planet();
        Jupiter jupiter = new Jupiter();
        typeCasting.orbitSun(planet);
        typeCasting.orbitSun(jupiter);

        System.out.println("==================================");
        Oil oil = new Oil();
        OliveOil oliveOil = new OliveOil();
        typeCasting.pourHealthy(oil);
        typeCasting.pourHealthy(oliveOil);

        System.out.println("==================================");
        Jewellery jewellery = new Jewellery();
        Necklace necklace = new Necklace();
        typeCasting.wearJewellery(jewellery);
        typeCasting.wearJewellery(necklace);

        System.out.println("==================================");
        Ornament ornament = new Ornament();
        Ring ring = new Ring();
        typeCasting.wearOrnament(ornament);
        typeCasting.wearOrnament(ring);

        System.out.println("==================================");
        Bird bird = new Bird();
        Parrot parrot = new Parrot();
        typeCasting.chirpFly(bird);
        typeCasting.chirpFly(parrot);

        System.out.println("==================================");
        River river = new River();
        Nile nile = new Nile();
        typeCasting.stream(river);
        typeCasting.stream(nile);

        System.out.println("==================================");
        Book book = new Book();
        Novel novel = new Novel();
        typeCasting.tellStory(book);
        typeCasting.tellStory(novel);

        System.out.println("==================================");
        Protector protector = new Protector();
        Helmet helmet = new Helmet();
        typeCasting.guardHead(protector);
        typeCasting.guardHead(helmet);

        System.out.println("==================================");
        Lamp lamp = new Lamp();
        Lantern lantern = new Lantern();
        typeCasting.lightUp(lamp);
        typeCasting.lightUp(lantern);

        System.out.println("==================================");
        BodyWash bodyWash = new BodyWash();
        Lux lux = new Lux();
        typeCasting.washSkin(bodyWash);
        typeCasting.washSkin(lux);

        System.out.println("==================================");
        Shampoo shampoo = new Shampoo();
        Dove dove = new Dove();
        typeCasting.cleanHair(shampoo);
        typeCasting.cleanHair(dove);

        System.out.println("==================================");
        Piano piano = new Piano();
        Keyboard keyboard = new Keyboard();
        typeCasting.playKeys(piano);
        typeCasting.playKeys(keyboard);

        System.out.println("==================================");
        Pencil pencil = new Pencil();
        PenPencil penPencil = new PenPencil();
        typeCasting.writeDraw(pencil);
        typeCasting.writeDraw(penPencil);

        System.out.println("==================================");
        Story story = new Story();
        Othello othello = new Othello();
        typeCasting.narrateTale(story);
        typeCasting.narrateTale(othello);

        System.out.println("==================================");
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        typeCasting.measureSides(shape);
        typeCasting.measureSides(rectangle);

        System.out.println("==================================");
        Serum serum = new Serum();
        VitaminC vitaminC = new VitaminC();
        typeCasting.applyOnFace(serum);
        typeCasting.applyOnFace(vitaminC);

        System.out.println("==================================");
        Mentor mentor = new Mentor();
        Coach coach = new Coach();
        typeCasting.trainSkills(mentor);
        typeCasting.trainSkills(coach);

        System.out.println("==================================");
        Guide guide = new Guide();
        Teacher teacher = new Teacher();
        typeCasting.explainConcept(guide);
        typeCasting.explainConcept(teacher);

        System.out.println("==================================");
        Student student = new Student();
        Pupil pupil = new Pupil();
        typeCasting.attendClass(student);
        typeCasting.attendClass(pupil);

        System.out.println("==================================");
        Purse purse = new Purse();
        Wallet wallet = new Wallet();
        typeCasting.carryMoney(purse);
        typeCasting.carryMoney(wallet);

        System.out.println("==================================");
        HairStyle hairstyle = new HairStyle();
        Pony pony = new Pony();
        typeCasting.styleHair(hairstyle);
        typeCasting.styleHair(pony);

        System.out.println("==================================");
        Device device = new Device();
        Microscope microscope = new Microscope();
        typeCasting.zoomTiny(device);
        typeCasting.zoomTiny(microscope);

        System.out.println("==================================");
        Road road = new Road();
        Highway highway = new Highway();
        typeCasting.driveFast(road);
        typeCasting.driveFast(highway);

        System.out.println("==================================");
        Watch watch = new Watch();
        Rolex rolex = new Rolex();
        typeCasting.showTime(watch);
        typeCasting.showTime(rolex);

        System.out.println("==================================");
        Text text = new Text();
        Message message = new Message();
        typeCasting.sendNote(text);
        typeCasting.sendNote(message);

        System.out.println("==================================");
        House house = new House();
        Villa villa = new Villa();
        typeCasting.stayLuxury(house);
        typeCasting.stayLuxury(villa);

        System.out.println("==================================");
        Ride ride = new Ride();
        Scooter scooter = new Scooter();
        typeCasting.zoomAround(ride);
        typeCasting.zoomAround(scooter);

        System.out.println("==================================");
        Scientist scientist = new Scientist();
        Tesla tesla = new Tesla();
        typeCasting.inventPhysics(scientist);
        typeCasting.inventPhysics(tesla);

        System.out.println("==================================");
        Vehicle vehicle = new Vehicle();
        Truck truck = new Truck();
        typeCasting.carryGoods(vehicle);
        typeCasting.carryGoods(truck);


    }
}
