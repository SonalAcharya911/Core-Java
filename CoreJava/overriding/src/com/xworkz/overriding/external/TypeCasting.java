package com.xworkz.overriding.external;

import com.xworkz.overriding.internal.*;

public class TypeCasting {
    public TypeCasting(){
        System.out.println("no-arg constructor for TypeCasting");
    }
    public void increaseFans(Actor actor){
        if(actor!=null){
            actor.act();
            if(actor instanceof ShahRukhKhan){
                ((ShahRukhKhan) actor).smile();
                ShahRukhKhan shahRukhKhan=(ShahRukhKhan) actor;
                shahRukhKhan.act();
                shahRukhKhan.smile();

            }
        }
        else {
            System.out.println("actor is null");
        }
    }

    public void giveAudition(Actress actress) {
        if(actress != null) {
            actress.dance();

            if(actress instanceof Deepika) {
                Deepika deepika = (Deepika) actress;
                deepika.dance();
                deepika.perform();
            }
        } else {
            System.out.println("actress is null");
        }
    }

    public void bookHouse(Agent agent) {
        if(agent != null) {
            agent.deal();

            if(agent instanceof Broker) {
                Broker broker = (Broker) agent;
                broker.call();
                broker.deal();
            }
        } else {
            System.out.println("agent is null");
        }
    }

    public void triggerAlert(Notification notification) {
        if(notification != null) {
            notification.checkNotification();

            if(notification instanceof Alarm) {
                Alarm alarm = (Alarm) notification;
                alarm.ring();
                alarm.checkNotification();
            }
        } else {
            System.out.println("notification is null");
        }
    }

    public void runScan(Software software) {
        if(software != null) {
            software.developSoftware();

            if(software instanceof Antivirus) {
                Antivirus antivirus = (Antivirus) software;
                antivirus.scan();
                antivirus.developSoftware();
            }
        } else {
            System.out.println("software is null");
        }
    }

    public void blockAttack(Armor armor) {
        if(armor != null) {
            armor.protect();

            if(armor instanceof Shield) {
                Shield shield = (Shield) armor;
                shield.holdShield();
                shield.protect();
            }
        } else {
            System.out.println("armor is null");
        }
    }

    public void writePlay(Author author) {
        if(author != null) {
            author.write();

            if(author instanceof Shakespeare) {
                Shakespeare shakespeare = (Shakespeare) author;
                shakespeare.write();
                shakespeare.recite();
            }
        } else {
            System.out.println("author is null");
        }
    }

    public void startBackup(Backup backup) {
        if(backup != null) {
            backup.store();

            if(backup instanceof Generator) {
                Generator generator = (Generator) backup;
                generator.store();
                generator.generate();
            }
        } else {
            System.out.println("backup is null");
        }
    }

    public void storeGoods(Carrier carrier) {
        if(carrier != null) {
            carrier.hold();

            if(carrier instanceof Basket) {
                Basket basket = (Basket) carrier;
                basket.carry();
            }
        } else {
            System.out.println("carrier is null");
        }
    }

    public void chargeDevice(PowerSource powerSource) {
        if(powerSource != null) {
            powerSource.supplyPowerSource();

            if(powerSource instanceof Battery) {
                Battery battery = (Battery) powerSource;
                battery.supplyPowerSource();
                battery.charge();
            }
        } else {
            System.out.println("powerSource is null");
        }
    }

    public void playSymphony(Composer composer) {
        if(composer != null) {
            composer.orchestrate();

            if(composer instanceof Beethoven) {
                Beethoven beethoven = (Beethoven) composer;
                beethoven.orchestrate();
                beethoven.compose();
            }
        } else {
            System.out.println("composer is null");
        }
    }

    public void pickFruit(Berry berry) {
        if(berry != null) {
            berry.taste();

            if(berry instanceof Strawberry) {
                Strawberry strawberry = (Strawberry) berry;
                strawberry.eatStrawberry();
                strawberry.taste();
            }
        } else {
            System.out.println("berry is null");
        }
    }

    public void warmUp(Blanket blanket) {
        if(blanket != null) {
            blanket.cover();

            if(blanket instanceof Quilt) {
                Quilt quilt = (Quilt) blanket;
                quilt.cover();
                quilt.coverQuilt();

            }
        } else {
            System.out.println("blanket is null");
        }
    }

    public void launchProduct(Brand brand) {
        if(brand != null) {
            brand.promote();

            if(brand instanceof Honda) {
                Honda honda = (Honda) brand;
                honda.promote();
                honda.rideHonda();
            }
        } else {
            System.out.println("brand is null");
        }
    }

    public void cleanTeeth(Brush brush) {
        if(brush != null) {
            brush.clean();

            if(brush instanceof Toothbrush) {
                Toothbrush toothbrush = (Toothbrush) brush;
                toothbrush.clean();
                toothbrush.brush();
            }
        } else {
            System.out.println("brush is null");
        }
    }

    public void startJourney(Train train) {
        if(train != null) {
            train.rideTrain();

            if(train instanceof VandeBharath) {
                VandeBharath vandebharath = (VandeBharath) train;
                vandebharath.rideTrain();
                vandebharath.orderFood();
            }
        } else {
            System.out.println("train is null");
        }
    }

    public void catchAnimal(Trap trap) {
        if(trap != null) {
            trap.setTrap();

            if(trap instanceof Net) {
                Net net = (Net) trap;
                net.setTrap();
                net.catchNet();
            }
        } else {
            System.out.println("trap is null");
        }
    }

    public void decorateHouse(Room room) {
        if(room != null) {
            room.cleanRoom();

            if(room instanceof LivingRoom) {
                LivingRoom livingroom = (LivingRoom) room;
                livingroom.cleanRoom();
                livingroom.cleanLivingRoom();
            }
        } else {
            System.out.println("room is null");
        }
    }

    public void bakeSweet(Dessert dessert) {
        if(dessert != null) {
            dessert.enjoy();

            if(dessert instanceof Cake) {
                Cake cake = (Cake) dessert;
                cake.enjoy();
                cake.bake();
            }
        } else {
            System.out.println("dessert is null");
        }
    }

    public void exploreSand(Desert desert) {
        if(desert != null) {
            desert.heat();

            if(desert instanceof Sahara) {
                Sahara sahara = (Sahara) desert;
                sahara.heat();
                sahara.exploreSahara();
            }
        } else {
            System.out.println("desert is null");
        }
    }

    public void capturePhoto(Camera camera) {
        if(camera != null) {
            camera.capture();

            if(camera instanceof DSLR) {
                DSLR dslr = (DSLR) camera;
                dslr.capture();
                dslr.clickPic();
            }
        } else {
            System.out.println("camera is null");
        }
    }

    public void cookDish(Vegetable vegetable) {
        if(vegetable != null) {
            vegetable.cook();

            if(vegetable instanceof Capsicum) {
                Capsicum capsicum = (Capsicum) vegetable;
                capsicum.cook();
                capsicum.grate();
            }
        } else {
            System.out.println("vegetable is null");
        }
    }

    public void swipePayment(Card card) {
        if(card != null) {
            card.swipe();

            if(card instanceof CreditCard) {
                CreditCard creditCard = (CreditCard) card;
                creditCard.swipe();
                creditCard.drawMoney();
            }
        } else {
            System.out.println("card is null");
        }
    }

    public void playMatch(Sport sport) {
        if(sport != null) {
            sport.playSport();

            if(sport instanceof Cricket) {
                Cricket cricket = (Cricket) sport;
                cricket.play();
                cricket.playSport();
            }
        }
        else {
            System.out.println("sport is null");
        }
    }

    public void joinSession(Gym gym) {
        if(gym != null) {
            gym.workout();

            if(gym instanceof CultFit) {
                CultFit cultFit = (CultFit) gym;
                cultFit.train();
                cultFit.workout();
            }
        } else {
            System.out.println("gym is null");
        }
    }

    public void consultPatient(Doctor doctor) {
        if(doctor != null) {
            doctor.treatPatient();

            if(doctor instanceof Cardiologist) {
                Cardiologist cardiologist = (Cardiologist) doctor;
                cardiologist.diagnose();
            }
        } else {
            System.out.println("doctor is null");
        }
    }

    public void hydrateFace(Cleanser cleanser) {
        if(cleanser != null) {
            cleanser.refresh();

            if(cleanser instanceof FaceWash) {
                FaceWash faceWash = (FaceWash) cleanser;
                faceWash.refresh();
                faceWash.cleanFace();
            }
        } else {
            System.out.println("cleanser is null");
        }
    }

    public void paintWall(Color color) {
        if(color != null) {
            color.blend();

            if(color instanceof Yellow) {
                Yellow yellow = (Yellow) color;
                yellow.blend();
                yellow.shade();
            }
        } else {
            System.out.println("color is null");
        }
    }

    public void makeAlternateReality(Witch witch) {
        if(witch != null) {
            witch.mindControl();

            if(witch instanceof WandaMaximoff) {
                WandaMaximoff wandamaximoff = (WandaMaximoff) witch;
                wandamaximoff.mindControl();
                wandamaximoff.readDarkhold();
            }
        } else {
            System.out.println("witch is null");
        }
    }

    public void performMagic(Wizard wizard) {
        if(wizard != null) {
            wizard.performMagic();

            if(wizard instanceof DoctorStrange) {
                DoctorStrange doctorStrange = (DoctorStrange) wizard;
                doctorStrange.performMagic();
                doctorStrange.castSpell();
            }
        } else {
            System.out.println("wizard is null");
        }
    }

    public void stitchCloth(Fabric fabric) {
        if(fabric != null) {
            fabric.weaveFabric();

            if(fabric instanceof Denim) {
                Denim denim = (Denim) fabric;
                denim.weaveFabric();
                denim.wear();

            }
        } else {
            System.out.println("fabric is null");
        }
    }

    public void grazeGrass(Herbivore herbivore) {
        if(herbivore != null) {
            herbivore.eat();

            if(herbivore instanceof Cow) {
                Cow cow = (Cow) herbivore;
                cow.moo();
                cow.eat();
            }
        } else {
            System.out.println("herbivore is null");
        }
    }

    public void processData(Processor processor) {
        if(processor != null) {
            processor.useProcessor();

            if(processor instanceof CPU) {
                CPU cpu = (CPU) processor;
                cpu.useProcessor();
                cpu.process();
            }
        } else {
            System.out.println("processor is null");
        }
    }

    public void restHead(Cushion cushion) {
        if(cushion != null) {
            cushion.comfort();

            if(cushion instanceof Pillow) {
                Pillow pillow = (Pillow) cushion;
                pillow.comfort();

                pillow.usePillow();
            }
        } else {
            System.out.println("cushion is null");
        }
    }

    public void escapeHunt(Prey prey) {
        if(prey != null) {
            prey.avoidPredator();

            if(prey instanceof Deer) {
                Deer deer = (Deer) prey;
                deer.avoidPredator();
                deer.leap();
            }
        } else {
            System.out.println("prey is null");
        }
    }

    public void stalkPrey(Predator predator) {
        if(predator != null) {
            predator.chase();

            if(predator instanceof Tiger) {
                Tiger tiger = (Tiger) predator;
                tiger.roar();
                tiger.chase();
            }
        } else {
            System.out.println("predator is null");
        }
    }

    public void swimDeep(Fish fish) {
        if(fish != null) {
            fish.swim();

            if(fish instanceof Tuna) {
                Tuna tuna = (Tuna) fish;
                tuna.swim();
                tuna.die();

            }
        } else {
            System.out.println("fish is null");
        }
    }

    public void keepHot(Flask flask) {
        if(flask != null) {
            flask.fillFlask();

            if(flask instanceof Thermos) {
                Thermos thermos = (Thermos) flask;
                thermos.fillThermos();
                thermos.fillFlask();
            }
        } else {
            System.out.println("flask is null");
        }
    }

    public void wearOnFeet(Footwear footwear) {
        if(footwear != null) {
            footwear.wearFootwear();

            if(footwear instanceof FlipFlop) {
                FlipFlop flipflop = (FlipFlop) footwear;
                flipflop.wearFootwear();
                flipflop.wearFlipFlop();
            }
        } else {
            System.out.println("footwear is null");
        }
    }

    public void cutWood(Cutter cutter) {
        if(cutter != null) {
            cutter.slice();

            if(cutter instanceof Saw) {
                Saw saw = (Saw) cutter;
                saw.slice();
                saw.cutSaw();
            }
        } else {
            System.out.println("cutter is null");
        }
    }

    public void orbitEarth(Spaceship spaceship) {
        if(spaceship != null) {
            spaceship.flySpaceship();

            if(spaceship instanceof Satellite) {
                Satellite satellite = (Satellite) spaceship;
                satellite.flySpaceship();
                satellite.launchSatellite();
            }
        } else {
            System.out.println("spaceship is null");
        }
    }

    public void sketchFigure(Drawing drawing) {
        if(drawing != null) {
            drawing.makeDrawing();

            if(drawing instanceof Stickman) {
                Stickman stickman = (Stickman) drawing;
                stickman.makeDrawing();
                stickman.drawStickman();
            }
        } else {
            System.out.println("drawing is null");
        }
    }

    public void collectBranch(Stick stick) {
        if(stick != null) {
            stick.holdStick();

            if(stick instanceof Twig) {
                Twig twig = (Twig) stick;
                twig.holdStick();
                twig.poke();
            }
        } else {
            System.out.println("stick is null");
        }
    }

    public void growShade(Tree tree) {
        if(tree != null) {
            tree.growTree();

            if(tree instanceof Peepal) {
                Peepal peepal = (Peepal) tree;
                peepal.growTree();
                peepal.worshipPeepal();
            }
        } else {
            System.out.println("tree is null");
        }
    }

    public void displayArt(Painting painting) {
        if(painting != null) {
            painting.makePainting();

            if(painting instanceof StarryNight) {
                StarryNight starryNight = (StarryNight) painting;
                starryNight.makePainting();
                starryNight.paintStarryNight();
            }
        } else {
            System.out.println("painting is null");
        }
    }

    public void pluckFruit(Fruit fruit) {
        if(fruit != null) {
            fruit.eatFruit();

            if(fruit instanceof Mango) {
                Mango mango = (Mango) fruit;
                mango.eatMango();
                mango.eatFruit();
            }
        } else {
            System.out.println("fruit is null");
        }
    }

    public void colorFabric(Paint paint) {
        if(paint != null) {
            paint.applyPaint();

            if(paint instanceof FabricPaint) {
                FabricPaint fabricPaint = (FabricPaint) paint;
                fabricPaint.applyPaint();
                fabricPaint.paintFabric();
            }
        } else {
            System.out.println("paint is null");
        }
    }

    public void spinBlade(Turbine turbine) {
        if(turbine != null) {
            turbine.turn();

            if(turbine instanceof Windmill) {
                Windmill windmill = (Windmill) turbine;
                windmill.turn();
                windmill.generateElectricity();
            }
        } else {
            System.out.println("turbine is null");
        }
    }

    public void climbPeak(Mountain mountain) {
        if(mountain != null) {
            mountain.climbMountain();

            if(mountain instanceof Everest) {
                Everest everest = (Everest) mountain;
                everest.climbEverest();
                everest.climbMountain();
            }
        } else {
            System.out.println("mountain is null");
        }
    }

    public void displayScreen(OutputDevice outputDevice) {
        if(outputDevice != null) {
            outputDevice.useOutputDevice();

            if(outputDevice instanceof Monitor) {
                Monitor monitor = (Monitor) outputDevice;
                monitor.useOutputDevice();
                monitor.displayMonitor();

            }
        } else {
            System.out.println("outputDevice is null");
        }
    }

    public void bloomPetal(Flower flower) {
        if(flower != null) {
            flower.bloomFlower();

            if(flower instanceof Tulip) {
                Tulip tulip = (Tulip) flower;
                tulip.bloomFlower();
                tulip.plantTulip();
            }
        } else {
            System.out.println("flower is null");
        }
    }

    public void serveSnack(Snack snack) {
        if(snack != null) {
            snack.eatSnack();

            if(snack instanceof FrenchFry) {
                FrenchFry frenchFry = (FrenchFry) snack;
                frenchFry.eatSnack();
                frenchFry.eatFrenchFry();
            }
        } else {
            System.out.println("snack is null");
        }
    }

    public void slitherFast(Snake snake) {
        if(snake != null) {
            snake.slitherSnake();

            if(snake instanceof Python) {
                Python python = (Python) snake;
                python.slitherSnake();
                python.crawl();
            }
        } else {
            System.out.println("snake is null");
        }
    }

    public void tossPlay(Toy toy) {
        if(toy != null) {
            toy.playToy();

            if(toy instanceof Frisbee) {
                Frisbee frisbee = (Frisbee) toy;
                frisbee.playToy();
                frisbee.throwFrisbee();
            }
        } else {
            System.out.println("toy is null");
        }
    }

    public void placeItems(Furniture furniture) {
        if(furniture != null) {
            furniture.useFurniture();

            if(furniture instanceof Table) {
                Table table = (Table) furniture;
                table.useTable();
                table.useFurniture();
            }
        } else {
            System.out.println("furniture is null");
        }
    }

    public void rotateStars(Galaxy galaxy) {
        if(galaxy != null) {
            galaxy.exploreGalaxy();

            if(galaxy instanceof Milkyway) {
                Milkyway milkyway = (Milkyway) galaxy;
                milkyway.exploreGalaxy();
                milkyway.observeMilkyway();
            }
        } else {
            System.out.println("galaxy is null");
        }
    }

    public void clickButton(InputDevice inputDevice) {
        if(inputDevice != null) {
            inputDevice.input();

            if(inputDevice instanceof Mouse) {
                Mouse mouse = (Mouse) inputDevice;
                mouse.input();
                mouse.click();
            }
        } else {
            System.out.println("inputDevice is null");
        }
    }

    public void relaxPlace(Garden garden) {
        if(garden != null) {
            garden.plant();

            if(garden instanceof Park) {
                Park park = (Park) garden;
                park.plant();
                park.walkInPark();
            }
        } else {
            System.out.println("garden is null");
        }
    }

    public void sparkleBright(Gemstone gemstone) {
        if(gemstone != null) {
            gemstone.polish();
            if(gemstone instanceof Sapphire) {
                Sapphire sapphire = (Sapphire) gemstone;
                sapphire.polish();
                sapphire.shine();
            }
        } else {
            System.out.println("gemstone is null");
        }
    }

    public void forgeShape(Metal metal) {
        if(metal != null) {
            metal.meltMetal();

            if(metal instanceof Gold) {
                Gold gold = (Gold) metal;
                gold.buy();
                gold.meltMetal();
            }
        } else {
            System.out.println("metal is null");
        }
    }

    public void searchInfo(SearchEngine searchEngine) {
        if(searchEngine != null) {
            searchEngine.useSearchEngine();

            if(searchEngine instanceof Google) {
                Google google = (Google) searchEngine;
                google.useSearchEngine();
                google.search();
            }
        } else {
            System.out.println("searchEngine is null");
        }
    }

    public void hitNail(Tool tool) {
        if(tool != null) {
            tool.useTool();

            if(tool instanceof Hammer) {
                Hammer hammer = (Hammer) tool;
                hammer.hit();
                hammer.useTool();            }
        } else {
            System.out.println("tool is null");
        }
    }

    public void holdClothes(Holder holder) {
        if(holder != null) {
            holder.hold();


            if(holder instanceof Hanger) {
                Hanger hanger = (Hanger) holder;
                hanger.hang();
                hanger.hold();
            }
        } else {
            System.out.println("holder is null");
        }
    }

    public void wearWarm(Outfit outfit) {
        if(outfit != null) {
            outfit.tryOutfit();

            if(outfit instanceof Hoodie) {
                Hoodie hoodie = (Hoodie) outfit;
                hoodie.tryOutfit();
                hoodie.wear();
            }
        } else {
            System.out.println("outfit is null");
        }
    }

    public void bookStay(Hotel hotel) {
        if(hotel != null) {
            hotel.book();

            if(hotel instanceof Taj) {
                Taj taj = (Taj) hotel;
                taj.book();
                taj.visitTaj();
            }
        } else {
            System.out.println("hotel is null");
        }
    }

    public void kickBall(OutdoorGame outdoorGame) {
        if(outdoorGame != null) {
            outdoorGame.enjoyOutdoorGame();

            if(outdoorGame instanceof Soccer) {
                Soccer soccer = (Soccer) outdoorGame;
                soccer.enjoyOutdoorGame();
                soccer.playSoccer();
            }
        } else {
            System.out.println("outdoorGame is null");
        }
    }

    public void rollDice(IndoorGame indoorGame) {
        if(indoorGame != null) {
            indoorGame.playIndoor();

            if(indoorGame instanceof Ludo) {
                Ludo ludo = (Ludo) indoorGame;
                ludo.playLudo();
                ludo.playIndoor();
            }
        } else {
            System.out.println("indoorGames is null");
        }
    }

    public void storeStuff(Container container) {
        if(container != null) {
            container.hold();

            if(container instanceof Jar) {
                Jar jar = (Jar) container;
                jar.hold();
                jar.openJar();
            }
        } else {
            System.out.println("container is null");
        }
    }

    public void orbitSun(Planet planet) {
        if(planet != null) {
            planet.rotatePlanet();

            if(planet instanceof Jupiter) {
                Jupiter jupiter = (Jupiter) planet;
                jupiter.observe();
                jupiter.rotatePlanet();            }
        } else {
            System.out.println("planet is null");
        }
    }

    public void pourHealthy(Oil oil) {
        if(oil != null) {
            oil.applyOil();

            if(oil instanceof OliveOil) {
                OliveOil oliveOil = (OliveOil) oil;
                oliveOil.applyOil();
                oliveOil.cookWithOliveOil();
            }
        } else {
            System.out.println("oil is null");
        }
    }

    public void wearJewellery(Jewellery jewellery) {
        if(jewellery != null) {
            jewellery.wearJewels();

            if(jewellery instanceof Necklace) {
                Necklace necklace = (Necklace) jewellery;
                necklace.wearJewels();
                necklace.wearNecklace();

            }
        } else {
            System.out.println("jewellery is null");
        }
    }

    public void wearOrnament(Ornament ornament) {
        if(ornament != null) {
            ornament.wearOrnament();

            if(ornament instanceof Ring) {
                Ring ring = (Ring) ornament;
                ring.wearOrnament();
                ring.wearRing();
            }
        } else {
            System.out.println("ornament is null");
        }
    }

    public void chirpFly(Bird bird) {
        if(bird != null) {
            bird.fly();

            if(bird instanceof Parrot) {
                Parrot parrot = (Parrot) bird;
                parrot.feedParrot();
                parrot.fly();            }
        } else {
            System.out.println("bird is null");
        }
    }

    public void stream(River river) {
        if(river != null) {
            river.flow();

            if(river instanceof Nile) {
                Nile nile = (Nile) river;
                nile.flow();
                nile.visitNile();            }
        } else {
            System.out.println("river is null");
        }
    }

    public void writeSecret(Notebook notebook) {
        if(notebook != null) {
            notebook.writeNotebook();

            if(notebook instanceof Diary) {
                Diary diary = (Diary) notebook;
                diary.writeDiary();
                diary.writeNotebook();
            }
        } else {
            System.out.println("notebook is null");
        }
    }

    public void tellStory(Book book) {
        if(book != null) {
            book.open();

            if(book instanceof Novel) {
                Novel novel = (Novel) book;
                novel.open();
                novel.readNovel();
            }
        } else {
            System.out.println("book is null");
        }
    }

    public void guardHead(Protector protector) {
        if(protector != null) {
            protector.wearProtector();

            if(protector instanceof Helmet) {
                Helmet helmet = (Helmet) protector;
                helmet.helmet();
                helmet.wearProtector();            }
        } else {
            System.out.println("protector is null");
        }
    }

    public void lightUp(Lamp lamp) {
        if(lamp != null) {
            lamp.light();

            if(lamp instanceof Lantern) {
                Lantern lantern = (Lantern) lamp;
                lantern.lightLantern();
                lantern.light();            }
        } else {
            System.out.println("lamp is null");
        }
    }

    public void washSkin(BodyWash bodywash) {
        if(bodywash != null) {
            bodywash.cleanse();

            if(bodywash instanceof Lux) {
                Lux lux = (Lux) bodywash;
                lux.cleanse();
                lux.useLux();
            }
        } else {
            System.out.println("bodywash is null");
        }
    }

    public void cleanHair(Shampoo shampoo) {
        if(shampoo != null) {
            shampoo.useShampoo();

            if(shampoo instanceof Dove) {
                Dove dove = (Dove) shampoo;
                dove.lather();
                dove.useShampoo();
            }
        } else {
            System.out.println("shampoo is null");
        }
    }

    public void playKeys(Piano piano) {
        if(piano != null) {
            piano.play();

            if(piano instanceof Keyboard) {
                Keyboard keyboard = (Keyboard) piano;
                keyboard.play();
                keyboard.pressKey();
            }
        } else {
            System.out.println("piano is null");
        }
    }

    public void writeDraw(Pencil pencil) {
        if(pencil != null) {
            pencil.usePencil();

            if(pencil instanceof PenPencil) {
                PenPencil penPencil = (PenPencil) pencil;
                penPencil.usePencil();
                penPencil.writeWithPenPencil();
            }
        } else {
            System.out.println("pencil is null");
        }
    }

    public void narrateTale(Story story) {
        if(story != null) {
            story.tellStory();

            if(story instanceof Othello) {
                Othello othello = (Othello) story;
                othello.playOthello();
                othello.tellStory();
            }
        } else {
            System.out.println("story is null");
        }
    }

    public void measureSides(Shape shape) {
        if(shape != null) {
            shape.drawShape();

            if(shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.drawRectangle();
                rectangle.drawShape();
            }
        } else {
            System.out.println("shape is null");
        }
    }

    public void applyOnFace(Serum serum) {
        if(serum != null) {
            serum.applySerum();

            if(serum instanceof VitaminC) {
                VitaminC vitaminC = (VitaminC) serum;
                vitaminC.applySerum();
                vitaminC.takeSupplement();
            }
        } else {
            System.out.println("serum is null");
        }
    }

    public void trainSkills(Mentor mentor) {
        if(mentor != null) {
            mentor.guideMentor();

            if(mentor instanceof Coach) {
                Coach coach = (Coach) mentor;
                coach.guideMentor();
                coach.train();
            }
        } else {
            System.out.println("mentor is null");
        }
    }

    public void explainConcept(Guide guide) {
        if(guide != null) {
            guide.guide();

            if(guide instanceof Teacher) {
                Teacher teacher = (Teacher) guide;
                teacher.teach();
                teacher.guide();
            }
        } else {
            System.out.println("guide is null");
        }
    }

    public void attendClass(Student student) {
        if(student != null) {
            student.studyStudent();

            if(student instanceof Pupil) {
                Pupil pupil = (Pupil) student;
                pupil.dilatePupil();
                pupil.studyStudent();
            }
        } else {
            System.out.println("student is null");
        }
    }

    public void carryMoney(Purse purse) {
        if(purse != null) {
            purse.carryPurse();

            if(purse instanceof Wallet) {
                Wallet wallet = (Wallet) purse;
                wallet.carryPurse();
                wallet.keepMoney();
            }
        } else {
            System.out.println("purse is null");
        }
    }

    public void styleHair(HairStyle hairstyle) {
        if(hairstyle != null) {
            hairstyle.style();

            if(hairstyle instanceof Pony) {
                Pony pony = (Pony) hairstyle;
                pony.style();
                pony.tiePony();
            }
        } else {
            System.out.println("hairstyle is null");
        }
    }

    public void zoomTiny(Device device) {
        if(device != null) {
            device.useDevice();

            if(device instanceof Microscope) {
                Microscope microscope = (Microscope) device;
                microscope.useDevice();
                microscope.useMicroscope();
            }
        } else {
            System.out.println("device is null");
        }
    }

    public void driveFast(Road road) {
        if(road != null) {
            road.travelRoad();

            if(road instanceof Highway) {
                Highway highway = (Highway) road;
                highway.drive();
                highway.travelRoad();
            }
        } else {
            System.out.println("road is null");
        }
    }

    public void showTime(Watch watch) {
        if(watch != null) {
            watch.viewTime();

            if(watch instanceof Rolex) {
                Rolex rolex = (Rolex) watch;
                rolex.viewTime();
                rolex.wearRolex();            }
        } else {
            System.out.println("watch is null");
        }
    }

    public void sendNote(Text text) {
        if(text != null) {
            text.sendText();

            if(text instanceof Message) {
                Message message = (Message) text;
                message.sendMessage();
                message.sendText();
            }
        } else {
            System.out.println("text is null");
        }
    }

    public void stayLuxury(House house) {
        if(house != null) {
            house.build();

            if(house instanceof Villa) {
                Villa villa = (Villa) house;
                villa.build();
                villa.live();            }
        } else {
            System.out.println("house is null");
        }
    }

    public void zoomAround(Ride ride) {
        if(ride != null) {
            ride.goRide();

            if(ride instanceof Scooter) {
                Scooter scooter = (Scooter) ride;
                scooter.goRide();
                scooter.rideScooter();
            }
        } else {
            System.out.println("ride is null");
        }
    }

    public void inventPhysics(Scientist scientist) {
        if(scientist != null) {
            scientist.researchScientist();

            if(scientist instanceof Tesla) {
                Tesla tesla = (Tesla) scientist;
                tesla.invent();
                tesla.researchScientist();
            }
        } else {
            System.out.println("scientist is null");
        }
    }

    public void carryGoods(Vehicle vehicle) {
        if(vehicle != null) {
            vehicle.repair();

            if(vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                truck.driveTruck();
                truck.repair();
            }
        } else {
            System.out.println("vehicle is null");
        }
    }
}
