package com.xworkz.appnest.repository;

import com.xworkz.appnest.constant.Type;
import com.xworkz.appnest.constant.Version;
import com.xworkz.appnest.dto.ApplicationDto;
import com.xworkz.appnest.dto.OwnerDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

public class ApplicationRepositoryImpl implements ApplicationRepository{
    @Override
    public Collection<ApplicationDto> findAll() {

        OwnerDto owner1 = new OwnerDto("Meta Platforms Inc.", "support@whatsapp.com", 16502530000L);
        List<OwnerDto> owners1=new ArrayList<>();
        owners1.add(owner1);

        OwnerDto owner2 = new OwnerDto("Spotify AB", "help@spotify.com", 4685103100L);
        List<OwnerDto> owners2 = new ArrayList<>();
        owners2.add(owner2);

        OwnerDto owner3a = new OwnerDto("Canva Pty Ltd", "support@canva.com", 61283794000L);
        OwnerDto owner3b = new OwnerDto("Melanie Perkins", "melanie@canva.com", 61283794001L);
        List<OwnerDto> owners3 = new ArrayList<>();
        owners3.add(owner3a);
        owners3.add(owner3b);

        OwnerDto owner4 = new OwnerDto("Microsoft Corporation", "support@microsoft.com", 18006427676L);
        List<OwnerDto> owners4 = new ArrayList<>();
        owners4.add(owner4);

        OwnerDto owner5a = new OwnerDto("Zoom Video Communications", "support@zoom.us", 18887996669L);
        OwnerDto owner5b = new OwnerDto("Eric Yuan", "eric.yuan@zoom.us", 14158754865L);
        List<OwnerDto> owners5 = new ArrayList<>();
        owners5.add(owner5a);
        owners5.add(owner5b);

        OwnerDto owner6 = new OwnerDto("Duolingo Inc.", "support@duolingo.com", 14123334444L);
        List<OwnerDto> owners6 = new ArrayList<>();
        owners6.add(owner6);

        OwnerDto owner7 = new OwnerDto("Google LLC", "support@google.com", 16502530001L);
        List<OwnerDto> owners7 = new ArrayList<>();
        owners7.add(owner7);

        OwnerDto owner8 = new OwnerDto("Netflix Inc.", "support@netflix.com", 14085551234L);
        List<OwnerDto> owners8 = new ArrayList<>();
        owners8.add(owner8);

        OwnerDto owner9 = new OwnerDto("Adobe Inc.", "support@adobe.com", 14085557890L);
        List<OwnerDto> owners9 = new ArrayList<>();
        owners9.add(owner9);

        OwnerDto owner10 = new OwnerDto("Telegram FZ-LLC", "support@telegram.org", 97144551234L);
        List<OwnerDto> owners10 = new ArrayList<>();
        owners10.add(owner10);

        OwnerDto owner11 = new OwnerDto("Meta Platforms Inc.", "support@instagram.com", 16502530002L);
        List<OwnerDto> owners11 = new ArrayList<>();
        owners11.add(owner11);

        OwnerDto owner12 = new OwnerDto("Google LLC", "support@youtube.com", 16502530003L);
        List<OwnerDto> owners12 = new ArrayList<>();
        owners12.add(owner12);

        OwnerDto owner13 = new OwnerDto("Salesforce Inc.", "feedback@slack.com", 14153332222L);
        List<OwnerDto> owners13 = new ArrayList<>();
        owners13.add(owner13);

        OwnerDto owner14 = new OwnerDto("Google LLC", "drive-support@google.com", 16502530004L);
        List<OwnerDto> owners14 = new ArrayList<>();
        owners14.add(owner14);

        OwnerDto owner15 = new OwnerDto("One97 Communications", "care@paytm.com", 911123456789L);
        List<OwnerDto> owners15 = new ArrayList<>();
        owners15.add(owner15);

        OwnerDto owner16 = new OwnerDto("Flipkart Pvt Ltd", "support@flipkart.com", 911234567890L);
        List<OwnerDto> owners16 = new ArrayList<>();
        owners16.add(owner16);

        OwnerDto owner17 = new OwnerDto("Amazon Inc.", "cs-reply@amazon.in", 180030009009L);
        List<OwnerDto> owners17 = new ArrayList<>();
        owners17.add(owner17);

        OwnerDto owner18 = new OwnerDto("Apple Inc.", "support@apple.com", 180080009009L);
        List<OwnerDto> owners18 = new ArrayList<>();
        owners18.add(owner18);

        OwnerDto owner19 = new OwnerDto("Samsung Electronics", "support@samsung.com", 180057267864L);
        List<OwnerDto> owners19 = new ArrayList<>();
        owners19.add(owner19);

        OwnerDto owner20 = new OwnerDto("Swiggy", "support@swiggy.in", 918080802020L);
        List<OwnerDto> owners20 = new ArrayList<>();
        owners20.add(owner20);

        OwnerDto owner21 = new OwnerDto("Zomato Ltd", "support@zomato.com", 911144457788L);
        List<OwnerDto> owners21 = new ArrayList<>();
        owners21.add(owner21);

        OwnerDto owner22 = new OwnerDto("Ola Cabs", "support@olacabs.com", 914466509509L);
        List<OwnerDto> owners22 = new ArrayList<>();
        owners22.add(owner22);

        OwnerDto owner23 = new OwnerDto("Uber Technologies", "support@uber.com", 14155552671L);
        List<OwnerDto> owners23 = new ArrayList<>();
        owners23.add(owner23);

        OwnerDto owner24 = new OwnerDto("Google LLC", "photos-support@google.com", 16502530005L);
        List<OwnerDto> owners24 = new ArrayList<>();
        owners24.add(owner24);

        OwnerDto owner25 = new OwnerDto("PhonePe Pvt Ltd", "support@phonepe.com", 918061699999L);
        List<OwnerDto> owners25 = new ArrayList<>();
        owners25.add(owner25);

        OwnerDto owner26 = new OwnerDto("Twitter Inc.", "support@twitter.com", 14155552672L);
        List<OwnerDto> owners26 = new ArrayList<>();
        owners26.add(owner26);

        OwnerDto owner27 = new OwnerDto("LinkedIn Corporation", "support@linkedin.com", 18004242929L);
        List<OwnerDto> owners27 = new ArrayList<>();
        owners27.add(owner27);

        OwnerDto owner28 = new OwnerDto("Tata Consultancy Services", "careers@tcs.com", 912266776000L);
        List<OwnerDto> owners28 = new ArrayList<>();
        owners28.add(owner28);

        OwnerDto owner29 = new OwnerDto("Infosys Ltd", "contactus@infosys.com", 918028535555L);
        List<OwnerDto> owners29 = new ArrayList<>();
        owners29.add(owner29);

        OwnerDto owner30 = new OwnerDto("Wipro Ltd", "info@wipro.com", 918040460000L);
        List<OwnerDto> owners30 = new ArrayList<>();
        owners30.add(owner30);

        OwnerDto owner31 = new OwnerDto("Capgemini SE", "in.hr@capgemini.com", 911243993000L);
        List<OwnerDto> owners31 = new ArrayList<>();
        owners31.add(owner31);

        OwnerDto owner32 = new OwnerDto("Accenture Plc", "support@accenture.com", 918067115000L);
        List<OwnerDto> owners32 = new ArrayList<>();
        owners32.add(owner32);

        OwnerDto owner33 = new OwnerDto("Snapchat Inc.", "support@snapchat.com", 18006522277L);
        List<OwnerDto> owners33 = new ArrayList<>();
        owners33.add(owner33);

        OwnerDto owner34 = new OwnerDto("Pinterest Inc.", "support@pinterest.com", 14155552673L);
        List<OwnerDto> owners34 = new ArrayList<>();
        owners34.add(owner34);

        OwnerDto owner35 = new OwnerDto("Dropbox Inc.", "support@dropbox.com", 14156602100L);
        List<OwnerDto> owners35 = new ArrayList<>();
        owners35.add(owner35);

        OwnerDto owner36 = new OwnerDto("Asana Inc.", "support@asana.com", 14158017000L);
        List<OwnerDto> owners36 = new ArrayList<>();
        owners36.add(owner36);

        OwnerDto owner37a = new OwnerDto("Notion Labs Inc.", "support@makenotion.com", 14155552674L);
        OwnerDto owner37b = new OwnerDto("Ivan Zhao", "ivan@notion.so", 14155552680L);
        List<OwnerDto> owners37 = new ArrayList<>();
        owners37.add(owner37a);
        owners37.add(owner37b);

        OwnerDto owner38a = new OwnerDto("Koo App", "support@kooapp.com", 918080202020L);
        OwnerDto owner38b = new OwnerDto("Aprameya Radhakrishna", "aprameya@kooapp.com", 918080202021L);
        List<OwnerDto> owners38 = new ArrayList<>();
        owners38.add(owner38a);
        owners38.add(owner38b);

        OwnerDto owner39 = new OwnerDto("ShareChat", "support@sharechat.co", 918080807070L);
        List<OwnerDto> owners39 = new ArrayList<>();
        owners39.add(owner39);

        OwnerDto owner40 = new OwnerDto("Dream11", "support@dream11.com", 912261531100L);
        List<OwnerDto> owners40 = new ArrayList<>();
        owners40.add(owner40);

        OwnerDto owner41a = new OwnerDto("Myntra", "support@myntra.com", 18001080999L);
        OwnerDto owner41b = new OwnerDto("Flipkart Fashion", "fashion@flipkart.com", 911234567891L);
        List<OwnerDto> owners41 = new ArrayList<>();
        owners41.add(owner41a);
        owners41.add(owner41b);

        OwnerDto owner42 = new OwnerDto("Ajio", "customercare@ajio.com", 18008889999L);
        List<OwnerDto> owners42 = new ArrayList<>();
        owners42.add(owner42);

        OwnerDto owner43a = new OwnerDto("Hotstar", "support@hotstar.com", 911234567891L);
        OwnerDto owner43b = new OwnerDto("Novi Digital", "novi@hotstar.com", 911234567892L);
        List<OwnerDto> owners43 = new ArrayList<>();
        owners43.add(owner43a);
        owners43.add(owner43b);

        OwnerDto owner44 = new OwnerDto("Disney+ Hotstar", "disneyplus@hotstar.com", 911234567892L);
        List<OwnerDto> owners44 = new ArrayList<>();
        owners44.add(owner44);

        OwnerDto owner45 = new OwnerDto("Gaana", "feedback@gaana.com", 9118001030909L);
        List<OwnerDto> owners45 = new ArrayList<>();
        owners45.add(owner45);

        OwnerDto owner46a = new OwnerDto("JioSaavn", "help@jiosaavn.com", 9118002582636L);
        OwnerDto owner46b = new OwnerDto("Reliance Jio", "music@jio.com", 9118002582637L);
        List<OwnerDto> owners46 = new ArrayList<>();
        owners46.add(owner46a);
        owners46.add(owner46b);

        OwnerDto owner47 = new OwnerDto("Tinder", "support@gotinder.com", 14155552675L);
        List<OwnerDto> owners47 = new ArrayList<>();
        owners47.add(owner47);

        OwnerDto owner48 = new OwnerDto("Bumble", "feedback@team.bumble.com", 14155552676L);
        List<OwnerDto> owners48 = new ArrayList<>();
        owners48.add(owner48);

        OwnerDto owner49 = new OwnerDto("Coursera", "support@coursera.org", 14155552677L);
        List<OwnerDto> owners49 = new ArrayList<>();
        owners49.add(owner49);

        OwnerDto owner50a = new OwnerDto("Udemy Inc.", "support@udemy.com", 14155552678L);
        OwnerDto owner50b = new OwnerDto("Eren Bali", "eren@udemy.com", 14155552679L);
        List<OwnerDto> owners50 = new ArrayList<>();
        owners50.add(owner50a);
        owners50.add(owner50b);

        OwnerRepository ownerRepository=new OwnerRepositoryImpl();
        List<List<OwnerDto>> ownersAll=ownerRepository.getOwnerDto();

        ApplicationDto applicationDto1 = new ApplicationDto("WhatsApp", Type.COMMUNICATION, 36.5, LocalDate.of(2009, 1, 24), ownersAll.get(0), Version.V_1,false,0);
        ApplicationDto applicationDto2 = new ApplicationDto("Spotify", Type.ENTERTAINMENT, 78.2, LocalDate.of(2008, 10, 7), ownersAll.get(1),Version.V_2,true,199.00);
//        ApplicationDto applicationDto3 = new ApplicationDto("Canva", Type.CREATIVE, 102.3, LocalDate.of(2013, 1, 1), owners3);
//        ApplicationDto applicationDto4 = new ApplicationDto("Microsoft Word", Type.PRODUCTIVITY, 287.0, LocalDate.of(1983, 10, 25), owners4);
//        ApplicationDto applicationDto5 = new ApplicationDto("Zoom", Type.COMMUNICATION, 53.8, LocalDate.of(2013, 9, 10), owners5);
//        ApplicationDto applicationDto6 = new ApplicationDto("Duolingo", Type.EDUCATION, 42.1, LocalDate.of(2011, 11, 30), owners6);
//        ApplicationDto applicationDto7 = new ApplicationDto("Google Maps", Type.TRAVEL, 128.6, LocalDate.of(2005, 2, 8), owners7);
//        ApplicationDto applicationDto8 = new ApplicationDto("Netflix", Type.ENTERTAINMENT, 89.4, LocalDate.of(2007, 1, 15), owners8);
//        ApplicationDto applicationDto9 = new ApplicationDto("Adobe Photoshop", Type.CREATIVE, 142.0, LocalDate.of(1990, 2, 19), owners9);
//        ApplicationDto applicationDto10 = new ApplicationDto("Telegram", Type.COMMUNICATION, 56.2, LocalDate.of(2013, 8, 14), owners10);
//        ApplicationDto applicationDto11 = new ApplicationDto("Instagram", Type.SOCIAL, 61.0, LocalDate.of(2010, 10, 6), owners11);
//        ApplicationDto applicationDto12 = new ApplicationDto("YouTube", Type.ENTERTAINMENT, 97.3, LocalDate.of(2005, 2, 14), owners12);
//        ApplicationDto applicationDto13 = new ApplicationDto("Slack", Type.PRODUCTIVITY, 48.5, LocalDate.of(2013, 8, 14), owners13);
//        ApplicationDto applicationDto14 = new ApplicationDto("Google Drive", Type.UTILITY, 109.2, LocalDate.of(2012, 4, 24), owners14);
//        ApplicationDto applicationDto15 = new ApplicationDto("Paytm", Type.FINANCE, 40.1, LocalDate.of(2014, 2, 10), owners15);
//        ApplicationDto applicationDto16 = new ApplicationDto("Flipkart", Type.SHOPPING, 70.0, LocalDate.of(2007, 9, 15), owners16);
//        ApplicationDto applicationDto17 = new ApplicationDto("Amazon", Type.SHOPPING, 95.3, LocalDate.of(2008, 6, 11), owners17);
//        ApplicationDto applicationDto18 = new ApplicationDto("Apple Music", Type.ENTERTAINMENT, 80.0, LocalDate.of(2015, 6, 30), owners18);
//        ApplicationDto applicationDto19 = new ApplicationDto("Samsung Health", Type.HEALTH, 67.2, LocalDate.of(2013, 7, 10), owners19);
//        ApplicationDto applicationDto20 = new ApplicationDto("Swiggy", Type.FOOD, 45.8, LocalDate.of(2014, 8, 14), owners20);
//        ApplicationDto applicationDto21 = new ApplicationDto("Zomato", Type.FOOD, 43.5, LocalDate.of(2013, 1, 1), owners21);
//        ApplicationDto applicationDto22 = new ApplicationDto("Ola", Type.TRAVEL, 54.2, LocalDate.of(2011, 12, 3), owners22);
//        ApplicationDto applicationDto23 = new ApplicationDto("Uber", Type.TRAVEL, 60.3, LocalDate.of(2010, 5, 10), owners23);
//        ApplicationDto applicationDto24 = new ApplicationDto("Google Photos", Type.UTILITY, 82.1, LocalDate.of(2015, 5, 28), owners24);
//        ApplicationDto applicationDto25 = new ApplicationDto("PhonePe", Type.FINANCE, 39.9, LocalDate.of(2016, 8, 29), owners25);
//        ApplicationDto applicationDto26 = new ApplicationDto("Twitter", Type.SOCIAL, 59.0, LocalDate.of(2006, 3, 21), owners26);
//        ApplicationDto applicationDto27 = new ApplicationDto("LinkedIn", Type.SOCIAL, 78.0, LocalDate.of(2003, 5, 5), owners27);
//        ApplicationDto applicationDto28 = new ApplicationDto("TCS Careers", Type.EDUCATION, 50.0, LocalDate.of(2010, 1, 1), owners28);
//        ApplicationDto applicationDto29 = new ApplicationDto("Infosys Connect", Type.EDUCATION, 52.5, LocalDate.of(2011, 7, 19), owners29);
//        ApplicationDto applicationDto30 = new ApplicationDto("Wipro Desk", Type.UTILITY, 49.3, LocalDate.of(2012, 3, 25), owners30);
//        ApplicationDto applicationDto31 = new ApplicationDto("Capgemini Hub", Type.UTILITY, 47.8, LocalDate.of(2011, 6, 5), owners31);
//        ApplicationDto applicationDto32 = new ApplicationDto("Accenture Go", Type.PRODUCTIVITY, 44.6, LocalDate.of(2013, 9, 9), owners32);
//        ApplicationDto applicationDto33 = new ApplicationDto("Snapchat", Type.SOCIAL, 62.2, LocalDate.of(2011, 9, 1), owners33);
//        ApplicationDto applicationDto34 = new ApplicationDto("Pinterest", Type.CREATIVE, 75.4, LocalDate.of(2010, 3, 10), owners34);
//        ApplicationDto applicationDto35 = new ApplicationDto("Dropbox", Type.UTILITY, 85.1, LocalDate.of(2008, 9, 11), owners35);
//        ApplicationDto applicationDto36 = new ApplicationDto("Asana", Type.PRODUCTIVITY, 66.9, LocalDate.of(2012, 4, 1), owners36);
//        ApplicationDto applicationDto37 = new ApplicationDto("Notion", Type.PRODUCTIVITY, 73.4, LocalDate.of(2016, 3, 1), owners37);
//        ApplicationDto applicationDto38 = new ApplicationDto("Koo", Type.SOCIAL, 34.0, LocalDate.of(2020, 3, 10), owners38);
//        ApplicationDto applicationDto39 = new ApplicationDto("ShareChat", Type.SOCIAL, 48.5, LocalDate.of(2015, 1, 10), owners39);
//        ApplicationDto applicationDto40 = new ApplicationDto("Dream11", Type.ENTERTAINMENT, 92.0, LocalDate.of(2012, 6, 18), owners40);
//        ApplicationDto applicationDto41 = new ApplicationDto("Myntra", Type.SHOPPING, 60.0, LocalDate.of(2007, 11, 9), owners41);
//        ApplicationDto applicationDto42 = new ApplicationDto("Ajio", Type.SHOPPING, 58.4, LocalDate.of(2016, 3, 1), owners42);
//        ApplicationDto applicationDto43 = new ApplicationDto("Hotstar", Type.ENTERTAINMENT, 102.0, LocalDate.of(2015, 2, 11), owners43);
//        ApplicationDto applicationDto44 = new ApplicationDto("Disney+ Hotstar", Type.ENTERTAINMENT, 110.0, LocalDate.of(2020, 4, 3), owners44);
//        ApplicationDto applicationDto45 = new ApplicationDto("Gaana", Type.ENTERTAINMENT, 66.6, LocalDate.of(2010, 4, 1), owners45);
//        ApplicationDto applicationDto46 = new ApplicationDto("JioSaavn", Type.ENTERTAINMENT, 79.8, LocalDate.of(2007, 5, 1), owners46);
//        ApplicationDto applicationDto47 = new ApplicationDto("Tinder", Type.SOCIAL, 49.9, LocalDate.of(2012, 9, 12), owners47);
//        ApplicationDto applicationDto48 = new ApplicationDto("Bumble", Type.SOCIAL, 52.2, LocalDate.of(2014, 12, 1), owners48);
//        ApplicationDto applicationDto49 = new ApplicationDto("Coursera", Type.EDUCATION, 61.4, LocalDate.of(2012, 4, 18), owners49);
//        ApplicationDto applicationDto50 = new ApplicationDto("Udemy", Type.EDUCATION, 74.7, LocalDate.of(2010, 5, 11), owners50);


        Collection<ApplicationDto> applicationDTOs=new ArrayList<>();
        applicationDTOs.add(applicationDto1);
//        applicationDTOs.add(applicationDto2);
//        applicationDTOs.add(applicationDto3);
//        applicationDTOs.add(applicationDto4);
//        applicationDTOs.add(applicationDto5);
//        applicationDTOs.add(applicationDto6);
//        applicationDTOs.add(applicationDto7);
//        applicationDTOs.add(applicationDto8);
//        applicationDTOs.add(applicationDto9);
//        applicationDTOs.add(applicationDto10);
//        applicationDTOs.add(applicationDto11);
//        applicationDTOs.add(applicationDto12);
//        applicationDTOs.add(applicationDto13);
//        applicationDTOs.add(applicationDto14);
//        applicationDTOs.add(applicationDto15);
//        applicationDTOs.add(applicationDto16);
//        applicationDTOs.add(applicationDto17);
//        applicationDTOs.add(applicationDto18);
//        applicationDTOs.add(applicationDto19);
//        applicationDTOs.add(applicationDto20);
//        applicationDTOs.add(applicationDto21);
//        applicationDTOs.add(applicationDto22);
//        applicationDTOs.add(applicationDto23);
//        applicationDTOs.add(applicationDto24);
//        applicationDTOs.add(applicationDto25);
//        applicationDTOs.add(applicationDto26);
//        applicationDTOs.add(applicationDto27);
//        applicationDTOs.add(applicationDto28);
//        applicationDTOs.add(applicationDto29);
//        applicationDTOs.add(applicationDto30);
//        applicationDTOs.add(applicationDto31);
//        applicationDTOs.add(applicationDto32);
//        applicationDTOs.add(applicationDto33);
//        applicationDTOs.add(applicationDto34);
//        applicationDTOs.add(applicationDto35);
//        applicationDTOs.add(applicationDto36);
//        applicationDTOs.add(applicationDto37);
//        applicationDTOs.add(applicationDto38);
//        applicationDTOs.add(applicationDto39);
//        applicationDTOs.add(applicationDto40);
//        applicationDTOs.add(applicationDto41);
//        applicationDTOs.add(applicationDto42);
//        applicationDTOs.add(applicationDto43);
//        applicationDTOs.add(applicationDto44);
//        applicationDTOs.add(applicationDto45);
//        applicationDTOs.add(applicationDto46);
//        applicationDTOs.add(applicationDto47);
//        applicationDTOs.add(applicationDto48);
//        applicationDTOs.add(applicationDto49);
//        applicationDTOs.add(applicationDto50);

        return applicationDTOs;
    }
}
