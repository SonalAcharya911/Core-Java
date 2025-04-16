package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.*;


public class Runner {
    public static void main(String[] args) {
        Piano piano=new Piano();
        piano.play();
        Piano piano1=new Keyboard();
        piano1.play();

        Keyboard keyboard=new Keyboard();
        keyboard.play();
        keyboard.pressKey();

        System.out.println("=================================");
        Actor actor=new Actor();
        actor.act();
        Actor actor1=new ShahRukhKhan();
        actor1.act();

        ShahRukhKhan shahRukhKhan=new ShahRukhKhan();
        shahRukhKhan.act();
        shahRukhKhan.smile();

        System.out.println("=================================");
        Actress actress=new Actress();
        actress.dance();
        Actress actress1=new Deepika();
        actress1.dance();

        Deepika deepika=new Deepika();
        deepika.dance();
        deepika.perform();

        System.out.println("=================================");
        Agent agent=new Agent();
        agent.deal();
        Agent agent1=new Broker();
        agent1.deal();

        Broker broker=new Broker();
        broker.call();
        broker.deal();

        System.out.println("=================================");
        Notification notification=new Notification();
        notification.checkNotification();

        Alarm alarm=new Alarm();
        alarm.checkNotification();
        alarm.ring();

        System.out.println("=================================");
        Software software=new Software();
        software.developSoftware();
        Software software1=new Antivirus();
        software1.developSoftware();

        Antivirus antivirus=new Antivirus();
        antivirus.developSoftware();
        antivirus.scan();

        System.out.println("=================================");
        Armor armor = new Armor();
        armor.protect();
        Armor armor1 = new Shield();
        armor1.protect();
        Shield shield = new Shield();
        shield.holdShield();
        shield.protect();

        System.out.println("=================================");

        Author author = new Author();
        author.write();
        Author author1 = new Shakespeare();
        author1.write();
        Shakespeare shakespeare = new Shakespeare();
        shakespeare.recite();
        shakespeare.write();

        System.out.println("=================================");
        Backup backup = new Backup();
        backup.store();
        Backup backup1 = new Generator();
        backup1.store();
        Generator generator = new Generator();
        generator.store();
        generator.generate();

        System.out.println("=================================");
        Carrier carrier = new Carrier();
        Carrier carrier1 = new Basket();
        Basket basket = new Basket();
        carrier1.hold();
        carrier.hold();
        basket.hold();
        basket.carry();

        System.out.println("=================================");
        PowerSource powersource = new PowerSource();
        PowerSource powersource1 = new Battery();
        Battery battery = new Battery();
        powersource1.supplyPowerSource();
        powersource.supplyPowerSource();
        battery.charge();
        battery.supplyPowerSource();

        System.out.println("=================================");
        Composer composer = new Composer();
        Composer composer1 = new Beethoven();
        Beethoven beethoven = new Beethoven();
        composer1.orchestrate();
        composer.orchestrate();
        beethoven.compose();
        beethoven.orchestrate();

        System.out.println("=================================");
        Berry berry = new Berry();
        Berry berry1 = new Strawberry();
        Strawberry strawberry = new Strawberry();
        berry.taste();
        berry1.taste();
        strawberry.taste();
        strawberry.eatStrawberry();

        System.out.println("=================================");

        Blanket blanket = new Blanket();
        Blanket blanket1 = new Quilt();
        Quilt quilt = new Quilt();
        blanket.cover();
        blanket1.cover();
        quilt.cover();
        quilt.coverQuilt();

        System.out.println("=================================");

        Notebook notebook = new Notebook();
        Notebook notebook1 = new Diary();
        Diary diary = new Diary();
        notebook1.writeNotebook();
        notebook.writeNotebook();
        diary.writeDiary();
        diary.writeNotebook();

        System.out.println("=================================");
        Brand brand = new Brand();
        Brand brand1 = new Honda();
        Honda honda = new Honda();
        brand.promote();
        brand1.promote();
        honda.promote();
        honda.rideHonda();

        System.out.println("=================================");
        Brush brush = new Brush();
        Brush brush1 = new Toothbrush();
        Toothbrush toothbrush = new Toothbrush();
        brush.clean();
        brush1.clean();
        toothbrush.brush();
        toothbrush.clean();

        System.out.println("=================================");
        Train train = new Train();
        Train train1 = new VandeBharath();
        VandeBharath vandebharath = new VandeBharath();
        train.rideTrain();
        train1.rideTrain();
        vandebharath.rideTrain();
        vandebharath.orderFood();


        System.out.println("=================================");
        Trap trap = new Trap();
        Trap trap1 = new Net();
        Net net = new Net();
        trap.setTrap();
        trap1.setTrap();
        net.catchNet();
        net.setTrap();

        System.out.println("=================================");
        Room room = new Room();
        Room room1 = new LivingRoom();
        LivingRoom livingRoom = new LivingRoom();
        room.cleanRoom();
        room1.cleanRoom();
        livingRoom.cleanLivingRoom();
        livingRoom.cleanRoom();

        System.out.println("=================================");
        Dessert dessert = new Dessert();
        Dessert dessert1 = new Cake();
        Cake cake = new Cake();
        dessert1.enjoy();
        dessert.enjoy();
        cake.bake();
        cake.enjoy();

        System.out.println("=================================");
        Desert desert = new Desert();
        Desert desert1 = new Sahara();
        Sahara sahara = new Sahara();
        desert1.heat();
        desert.heat();
        sahara.exploreSahara();
        sahara.heat();

        System.out.println("=================================");
        Camera camera = new Camera();
        Camera camera1 = new DSLR();
        DSLR dslr = new DSLR();
        camera.capture();
        camera1.capture();
        dslr.capture();
        dslr.clickPic();

        System.out.println("=================================");
        Vegetable vegetable = new Vegetable();
        Vegetable vegetable1 = new Capsicum();
        Capsicum capsicum = new Capsicum();
        vegetable1.cook();
        vegetable.cook();
        capsicum.cook();
        capsicum.grate();

        System.out.println("=================================");
        Card card = new Card();
        Card card1 = new CreditCard();
        CreditCard creditcard = new CreditCard();
        card.swipe();
        card1.swipe();
        creditcard.swipe();
        creditcard.drawMoney();

        System.out.println("=================================");
        Sport sport = new Sport();
        Sport sport1 = new Cricket();
        Cricket cricket = new Cricket();
        sport.playSport();
        sport1.playSport();
        cricket.play();
        cricket.playSport();

        System.out.println("=================================");
        Gym gym = new Gym();
        Gym gym1 = new CultFit();
        CultFit cultFit = new CultFit();
        gym.workout();
        gym1.workout();
        cultFit.workout();
        cultFit.train();

        System.out.println("=================================");
        Doctor doctor = new Doctor();
        Doctor doctor1 = new Cardiologist();
        Cardiologist cardiologist = new Cardiologist();
        doctor1.treatPatient();
        doctor.treatPatient();
        cardiologist.diagnose();
        cardiologist.treatPatient();

        System.out.println("=================================");
        Cleanser cleanser = new Cleanser();
        Cleanser cleanser1 = new FaceWash();
        FaceWash faceWash = new FaceWash();
        cleanser1.refresh();
        cleanser.refresh();
        faceWash.refresh();
        faceWash.cleanFace();

        System.out.println("=================================");
        Color color = new Color();
        Color color1 = new Yellow();
        Yellow yellow = new Yellow();
        color.blend();
        color1.blend();
        yellow.blend();
        yellow.shade();

        System.out.println("=================================");
        Witch witch = new Witch();
        Witch witch1 = new WandaMaximoff();
        WandaMaximoff wandaMaximoff = new WandaMaximoff();
        witch.mindControl();
        witch1.mindControl();
        wandaMaximoff.mindControl();
        wandaMaximoff.readDarkhold();

        System.out.println("=================================");
        Wizard wizard = new Wizard();
        Wizard wizard1 = new DoctorStrange();
        DoctorStrange doctorStrange = new DoctorStrange();
        wizard1.performMagic();
        wizard.performMagic();
        doctorStrange.castSpell();
        doctorStrange.performMagic();

        System.out.println("=================================");
        Fabric fabric = new Fabric();
        Fabric fabric1 = new Denim();
        Denim denim = new Denim();
        fabric.weaveFabric();
        fabric1.weaveFabric();
        denim.weaveFabric();
        denim.wear();

        System.out.println("=================================");
        Herbivore herbivore = new Herbivore();
        Herbivore herbivore1 = new Cow();
        Cow cow = new Cow();
        herbivore.eat();
        herbivore1.eat();
        cow.eat();
        cow.moo();


        System.out.println("=================================");
        Processor processor = new Processor();
        Processor processor1 = new CPU();
        CPU cpu = new CPU();
        processor1.useProcessor();
        cpu.process();
        cpu.useProcessor();

        System.out.println("=================================");
        Cushion cushion = new Cushion();
        Cushion cushion1 = new Pillow();
        Pillow pillow = new Pillow();
        cushion1.comfort();
        pillow.comfort();
        pillow.usePillow();

        System.out.println("=================================");
        Prey prey = new Prey();
        Prey prey1 = new Deer();
        Deer deer = new Deer();
        prey.avoidPredator();
        prey1.avoidPredator();
        deer.avoidPredator();
        deer.leap();

        System.out.println("=================================");
        Predator predator = new Predator();
        Predator predator1 = new Tiger();
        Tiger tiger = new Tiger();
        predator1.chase();
        tiger.chase();
        tiger.roar();

        System.out.println("=================================");
        Fish fish = new Fish();
        Fish fish1 = new Tuna();
        Tuna tuna = new Tuna();
        fish.swim();
        tuna.die();
        tuna.swim();

        System.out.println("=================================");
        Flask flask = new Flask();
        Flask flask1 = new Thermos();
        Thermos thermos = new Thermos();
        flask.fillFlask();
        thermos.fillFlask();
        thermos.fillThermos();


        System.out.println("=================================");
        Footwear footwear = new Footwear();
        Footwear footwear1 = new FlipFlop();
        FlipFlop flipFlop = new FlipFlop();
        footwear1.wearFootwear();
        flipFlop.wearFlipFlop();
        flipFlop.wearFootwear();

        System.out.println("=================================");
        Cutter cutter = new Cutter();
        Cutter cutter1 = new Saw();
        Saw saw = new Saw();
        cutter.slice();
        cutter1.slice();
        saw.cutSaw();
        saw.slice();

        System.out.println("=================================");
        Spaceship spaceship = new Spaceship();
        Spaceship spaceship1 = new Satellite();
        Satellite satellite = new Satellite();
        spaceship.flySpaceship();
        spaceship1.flySpaceship();
        satellite.flySpaceship();
        satellite.launchSatellite();

        System.out.println("=================================");
        Drawing drawing = new Drawing();
        drawing.makeDrawing();
        Drawing drawing1 = new Stickman();
        Stickman stickman = new Stickman();
        stickman.drawStickman();
        stickman.makeDrawing();

        System.out.println("=================================");
        Stick stick = new Stick();
        Stick stick1 = new Twig();
        Twig twig = new Twig();
        stick.holdStick();
        twig.holdStick();
        twig.poke();


        System.out.println("=================================");
        Tree tree = new Tree();
        Tree tree1 = new Peepal();
        Peepal peepal = new Peepal();
        tree.growTree();
        peepal.growTree();
        peepal.worshipPeepal();

        System.out.println("=================================");
        Painting painting = new Painting();
        Painting painting1 = new StarryNight();
        StarryNight starryNight = new StarryNight();
        painting.makePainting();
        starryNight.makePainting();
        starryNight.paintStarryNight();

        System.out.println("=================================");
        Fruit fruit = new Fruit();
        Fruit fruit1 = new Mango();
        Mango mango = new Mango();
        fruit.eatFruit();
        mango.eatFruit();
        mango.eatMango();

        System.out.println("=================================");
        Paint paint = new Paint();
        Paint paint1 = new FabricPaint();
        FabricPaint fabricPaint = new FabricPaint();
        paint1.applyPaint();
        fabricPaint.applyPaint();
        fabricPaint.paintFabric();

        System.out.println("=================================");
        Turbine turbine = new Turbine();
        Turbine turbine1 = new Windmill();
        Windmill windmill = new Windmill();
        turbine1.turn();
        windmill.turn();
        windmill.generateElectricity();

        System.out.println("=================================");
        Mountain mountain = new Mountain();
        Mountain mountain1 = new Everest();
        Everest everest = new Everest();
        mountain1.climbMountain();
        everest.climbMountain();
        everest.climbEverest();

        System.out.println("=================================");
        OutputDevice outputDevice = new OutputDevice();
        OutputDevice outputDevice1 = new Monitor();
        Monitor monitor = new Monitor();
        outputDevice1.useOutputDevice();
        monitor.displayMonitor();
        monitor.useOutputDevice();

        System.out.println("=================================");
        Flower flower = new Flower();
        Flower flower1 = new Tulip();
        Tulip tulip = new Tulip();
        flower.bloomFlower();
        tulip.plantTulip();
        tulip.bloomFlower();

        System.out.println("=================================");
        Snack snack = new Snack();
        Snack snack1 = new FrenchFry();
        FrenchFry frenchFry = new FrenchFry();
        snack.eatSnack();
        frenchFry.eatFrenchFry();
        frenchFry.eatSnack();

        System.out.println("=================================");
        Snake snake = new Snake();
        Snake snake1 = new Python();
        Python python = new Python();
        snake.slitherSnake();
        python.crawl();
        python.slitherSnake();

        System.out.println("=================================");
        Toy toy = new Toy();
        Toy toy1 = new Frisbee();
        Frisbee frisbee = new Frisbee();
        toy.playToy();
        frisbee.playToy();
        frisbee.throwFrisbee();

        System.out.println("=================================");
        Furniture furniture = new Furniture();
        Furniture furniture1 = new Table();
        Table table = new Table();
        furniture1.useFurniture();
        table.useFurniture();
        table.useTable();

        System.out.println("=================================");
        Galaxy galaxy = new Galaxy();
        Galaxy galaxy1 = new Milkyway();
        Milkyway milkyWay = new Milkyway();
        galaxy.exploreGalaxy();
        milkyWay.exploreGalaxy();
        milkyWay.observeMilkyway();

        System.out.println("=================================");
        InputDevice inputDevice = new InputDevice();
        InputDevice inputDevice1 = new Mouse();
        Mouse mouse = new Mouse();
        inputDevice1.input();
        mouse.click();
        mouse.input();

        System.out.println("=================================");
        Garden garden = new Garden();
        Garden garden1 = new Park();
        Park park = new Park();
        garden1.plant();
        park.plant();
        park.walkInPark();

        System.out.println("=================================");
        Gemstone gemstone = new Gemstone();
        Gemstone gemstone1 = new Sapphire();
        Sapphire sapphire = new Sapphire();
        gemstone1.polish();
        sapphire.polish();
        sapphire.shine();

        System.out.println("=================================");
        Metal metal = new Metal();
        Metal metal1 = new Gold();
        Gold gold = new Gold();
        metal.meltMetal();
        gold.buy();
        gold.meltMetal();


        System.out.println("=================================");
        SearchEngine searchEngine = new SearchEngine();
        SearchEngine searchEngine1 = new Google();
        Google google = new Google();
        searchEngine1.useSearchEngine();
        google.search();
        google.useSearchEngine();

        System.out.println("=================================");
        Tool tool = new Tool();
        Tool tool1 = new Hammer();
        Hammer hammer = new Hammer();
        tool.useTool();
        hammer.hit();
        hammer.useTool();


        System.out.println("=================================");
        Holder holder = new Holder();
        Holder holder1 = new Hanger();
        Hanger hanger = new Hanger();
        holder.hold();
        hanger.hold();
        hanger.hang();

        System.out.println("=================================");
        Outfit outfit = new Outfit();
        Outfit outfit1 = new Hoodie();
        Hoodie hoodie = new Hoodie();
        outfit.tryOutfit();
        hoodie.tryOutfit();
        hoodie.wear();

        System.out.println("=================================");
        Hotel hotel = new Hotel();
        Hotel hotel1 = new Taj();
        Taj taj = new Taj();
        hotel.book();
        taj.book();
        taj.visitTaj();

        System.out.println("=================================");
        OutdoorGame outdoorGame = new OutdoorGame();
        OutdoorGame outdoorGame1 = new Soccer();
        Soccer soccer = new Soccer();
        outdoorGame1.enjoyOutdoorGame();
        soccer.enjoyOutdoorGame();
        soccer.playSoccer();


        System.out.println("=================================");
        IndoorGame indoorGame = new IndoorGame();
        IndoorGame indoorGame1 = new Ludo();
        Ludo ludo = new Ludo();
        indoorGame1.playIndoor();
        ludo.playIndoor();
        ludo.playLudo();

        System.out.println("=================================");
        Container container = new Container();
        Container container1 = new Jar();
        Jar jar = new Jar();
        container.hold();
        jar.hold();
        jar.openJar();

        System.out.println("=================================");
        Planet planet = new Planet();
        Planet planet1 = new Jupiter();
        Jupiter jupiter = new Jupiter();
        planet.rotatePlanet();
        jupiter.observe();
        jupiter.rotatePlanet();

        System.out.println("=================================");
        Oil oil = new Oil();
        Oil oil1 = new OliveOil();
        OliveOil oliveOil = new OliveOil();
        oil.applyOil();
        oliveOil.applyOil();
        oliveOil.cookWithOliveOil();

        System.out.println("=================================");
        Jewellery jewellery = new Jewellery();
        Jewellery jewellery1 = new Necklace();
        Necklace necklace = new Necklace();
        jewellery1.wearJewels();
        necklace.wearJewels();
        necklace.wearNecklace();

        System.out.println("=================================");
        Ornament ornament = new Ornament();
        Ornament ornament1 = new Ring();
        Ring ring = new Ring();
        ornament.wearOrnament();
        ring.wearOrnament();
        ring.wearRing();


        System.out.println("=================================");
        Bird bird = new Bird();
        Bird bird1 = new Parrot();
        Parrot parrot = new Parrot();
        bird.fly();
        parrot.feedParrot();
        parrot.fly();

        System.out.println("=================================");
        River river = new River();
        River river1 = new Nile();
        Nile nile = new Nile();
        river.flow();
        nile.flow();
        nile.visitNile();

        System.out.println("=================================");
        Book book = new Book();
        Book book1 = new Novel();
        Novel novel = new Novel();
        book.open();
        novel.open();
        novel.readNovel();


        System.out.println("=================================");
        Protector protector = new Protector();
        Protector protector1 = new Helmet();
        Helmet helmet = new Helmet();
        protector1.wearProtector();
        helmet.helmet();
        helmet.wearProtector();

        System.out.println("=================================");
        Lamp lamp = new Lamp();
        Lamp lamp1 = new Lantern();
        Lantern lantern = new Lantern();
        lamp.light();
        lantern.lightLantern();
        lantern.light();

        System.out.println("=================================");
        BodyWash bodyWash = new BodyWash();
        BodyWash bodyWash1 = new Lux();
        Lux lux = new Lux();
        bodyWash1.cleanse();
        lux.cleanse();
        lux.useLux();

        System.out.println("=================================");
        Shampoo shampoo = new Shampoo();
        Shampoo shampoo1 = new Dove();
        Dove dove = new Dove();
        shampoo.useShampoo();
        dove.lather();
        dove.useShampoo();


        System.out.println("=================================");
        Pencil pencil = new Pencil();
        Pencil pencil1 = new PenPencil();
        PenPencil penPencil = new PenPencil();
        pencil.usePencil();
        penPencil.usePencil();
        penPencil.writeWithPenPencil();

        System.out.println("=================================");
        Story story = new Story();
        Story story1 = new Othello();
        Othello othello = new Othello();
        story.tellStory();
        othello.playOthello();
        othello.tellStory();

        System.out.println("=================================");
        Shape shape = new Shape();
        Shape shape1 = new Rectangle();
        Rectangle rectangle = new Rectangle();
        shape.drawShape();
        rectangle.drawRectangle();
        rectangle.drawShape();

        System.out.println("=================================");
        Serum serum = new Serum();
        Serum serum1 = new VitaminC();
        VitaminC vitaminC = new VitaminC();
        serum.applySerum();
        vitaminC.applySerum();
        vitaminC.takeSupplement();

        System.out.println("=================================");
        Mentor mentor = new Mentor();
        Mentor mentor1 = new Coach();
        Coach coach = new Coach();
        mentor.guideMentor();
        coach.guideMentor();
        coach.train();

        System.out.println("=================================");
        Guide guide = new Guide();
        Guide guide1 = new Teacher();
        Teacher teacher = new Teacher();
        guide.guide();
        teacher.teach();
        teacher.guide();

        System.out.println("=================================");
        Student student = new Student();
        Student student1 = new Pupil();
        Pupil pupil = new Pupil();
        student.studyStudent();
        pupil.dilatePupil();
        pupil.studyStudent();

        System.out.println("=================================");
        Purse purse = new Purse();
        Purse purse1 = new Wallet();
        Wallet wallet = new Wallet();
        purse.carryPurse();
        wallet.carryPurse();
        wallet.keepMoney();

        System.out.println("=================================");
        HairStyle hairstyle = new HairStyle();
        HairStyle hairstyle1 = new Pony();
        Pony pony = new Pony();
        hairstyle1.style();
        pony.style();
        pony.tiePony();

        System.out.println("=================================");
        Device device = new Device();
        Device device1 = new Microscope();
        Microscope microscope = new Microscope();
        device1.useDevice();
        microscope.useDevice();
        microscope.useMicroscope();

        System.out.println("=================================");
        Road road = new Road();
        Road road1 = new Highway();
        Highway highway = new Highway();
        road.travelRoad();
        highway.drive();
        highway.travelRoad();

        System.out.println("=================================");
        Watch watch = new Watch();
        Watch watch1 = new Rolex();
        Rolex rolex = new Rolex();
        watch.viewTime();
        rolex.viewTime();
        rolex.wearRolex();

        System.out.println("=================================");
        Text text = new Text();
        Text text1 = new Message();
        Message message = new Message();
        text.sendText();
        message.sendMessage();
        message.sendText();

        System.out.println("=================================");
        House house = new House();
        House house1 = new Villa();
        Villa villa = new Villa();
        house.build();
        villa.build();
        villa.live();

        System.out.println("=================================");
        Ride ride = new Ride();
        Ride ride1 = new Scooter();
        Scooter scooter = new Scooter();
        ride.goRide();
        scooter.goRide();
        scooter.rideScooter();

        System.out.println("=================================");
        Scientist scientist = new Scientist();
        Scientist scientist1 = new Tesla();
        Tesla tesla = new Tesla();
        scientist1.researchScientist();
        tesla.invent();
        tesla.researchScientist();

        System.out.println("=================================");
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Truck();
        Truck truck = new Truck();
        vehicle.repair();
        truck.driveTruck();
        truck.repair();

        System.out.println("=================================");
        Mammal mammal=new Mammal();
        Mammal mammal1=new Monkey();
        Monkey monkey=new Monkey();
        mammal.identifyMammal();
        mammal1.identifyMammal();
        monkey.swingMonkey();
        monkey.identifyMammal();


    }

}
