package us.team7pro.EventTicketsApp.DatabaseLoaders;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import us.team7pro.EventTicketsApp.Models.Event;
import us.team7pro.EventTicketsApp.Repositories.EventRepository;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;



@Component
public class DatabaseSeeder implements CommandLineRunner {
    private EventRepository eventRepository;

    @Autowired
    public DatabaseSeeder(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        List<Event> event =  new ArrayList<>();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy-HH:mm");

        Date d0 = df.parse("12-09-2018-10:00");
        Date d1 = df.parse("12-09-2018-11:00");
        Date d2 = df.parse("12-09-2018-13:30");
        Date d3 = df.parse("12-09-2018-15:30");
        Date d4 = df.parse("12-09-2018-18:45");
        Date d5 = df.parse("12-09-2018-21:00");
        Date d6 = df.parse("12-09-2018-22:15");
        Date d7 = df.parse("12-10-2018-14:00");
        Date d8 = df.parse("12-10-2018-15:00");
        Date d9 = df.parse("12-10-2018-21:00");
        Date d10= df.parse("12-11-2018-15:00");
        Date d11= df.parse("12-12-2018-16:00");
        Date d12= df.parse("12-12-2018-16:00");
        Date d13= df.parse("12-12-2018-20:00");
        Date d14= df.parse("12-13-2018-17:00");
        Date d15= df.parse("12-15-2018-18:00");
        Date d16= df.parse("12-15-2018-18:30");
        Date d17= df.parse("12-18-2018-14:00");
        Date d18= df.parse("12-18-2018-21:00");
        Date d19= df.parse("12-19-2018-22:00");
        Date d20= df.parse("12-21-2018-18:00");
        Date d21= df.parse("12-22-2018-17:00");
        Date d22= df.parse("12-28-2018-19:00");
        Date d23= df.parse("12-28-2018-19:00");
        Date d24= df.parse("12-29-2018-19:30");
        Date d25= df.parse("12-29-2018-20:00");
        Date d26= df.parse("12-31-2018-19:00");
        Date d27= df.parse("01-05-2019-21:00");
        Date d28= df.parse("01-08-2019-12:00");
        Date d29= df.parse("01-09-2019-20:00");
        Date d30= df.parse("01-11-2019-16:00");
        Date d31= df.parse("01-11-2019-17:00");
        Date d32= df.parse("01-19-2019-20:00");
        Date d33= df.parse("01-20-2019-13:00");
        Date d34= df.parse("01-23-2019-16:00");
        Date d35= df.parse("01-24-2019-21:00");
        Date d36= df.parse("01-25-2019-15:00");
        Date d37= df.parse("01-26-2019-12:00");
        Date d38= df.parse("01-26-2019-17:00");
        Date d39= df.parse("01-26-2019-19:00");
        Date d40= df.parse("01-27-2019-17:00");
        Date d41= df.parse("01-30-2019-13:00");
        Date d42= df.parse("01-31-2019-15:00");
        Date d43= df.parse("01-31-2019-20:00");
        Date d44= df.parse("02-05-2019-19:00");
        Date d45= df.parse("02-07-2019-15:30");
        Date d46= df.parse("02-12-2019-16:00");
        Date d47= df.parse("02-12-2019-18:00");
        Date d48= df.parse("02-14-2019-18:30");
        Date d49= df.parse("02-15-2019-10:00");
        Date d50= df.parse("02-15-2019-17:30");
        Date d51= df.parse("02-15-2019-18:00");
        Date d52= df.parse("02-17-2019-21:00");
        Date d53= df.parse("02-19-2019-18:00");
        Date d54= df.parse("02-20-2019-19:30");
        Date d55= df.parse("02-22-2019-18:45");
        Date d56= df.parse("02-23-2019-19:00");
        Date d57= df.parse("02-24-2019-21:00");
        Date d58= df.parse("02-26-2019-18:30");
        Date d59= df.parse("02-26-2019-19:00");
        Date d60= df.parse("03-01-2019-19:00");
        Date d61= df.parse("03-05-2019-18:00");
        Date d62= df.parse("03-07-2019-20:00");
        Date d63= df.parse("03-08-2019-18:00");
        Date d64= df.parse("03-08-2019-20:00");
        Date d65= df.parse("03-09-2019-19:00");
        Date d66= df.parse("03-11-2019-17:45");
        Date d67= df.parse("03-12-2019-19:30");
        Date d68= df.parse("03-14-2019-18:30");
        Date d69= df.parse("03-14-2019-20:30");
        Date d70= df.parse("03-15-2019-17:00");
        Date d71= df.parse("03-15-2019-19:00");
        Date d72= df.parse("03-17-2019-19:00");
        Date d73= df.parse("03-19-2019-20:00");
        Date d74= df.parse("03-24-2019-19:30");
        Date d75= df.parse("03-26-2019-20:30");
        Date d76= df.parse("03-29-2019-20:00");
        Date d77= df.parse("03-29-2019-20:45");
        Date d78= df.parse("03-30-2019-18:00");
        Date d79= df.parse("04-05-2019-18:00");
        Date d80= df.parse("04-05-2019-19:00");
        Date d81= df.parse("04-05-2019-20:00");
        Date d82= df.parse("04-06-2019-19:00");
        Date d83= df.parse("04-06-2019-21:00");
        Date d84= df.parse("04-07-2019-16:30");
        Date d85= df.parse("04-09-2019-21:00");
        Date d86= df.parse("04-10-2019-19:30");
        Date d87= df.parse("04-11-2019-20:20");
        Date d88= df.parse("04-12-2019-19:30");
        Date d89= df.parse("04-12-2019-20:30");
        Date d90= df.parse("04-13-2019-17:30");
        Date d91= df.parse("04-13-2019-20:00");
        Date d92= df.parse("04-16-2019-20:00");
        Date d93= df.parse("04-19-2019-20:30");
        Date d94= df.parse("04-26-2019-21:00");
        Date d95= df.parse("04-27-2019-18:30");
        Date d96= df.parse("04-27-2019-20:45");
        Date d97= df.parse("05-12-2019-20:00");
        Date d98= df.parse("09-11-2019-16:30");
        Date d99= df.parse("11-23-2019-17:00");
        Date d100= df.parse("11-30-2019-11:00");
        Date d101= df.parse("12-03-2019-17:00");
        Date d102= df.parse("12-04-2019-14:00");
        Date d103= df.parse("12-05-2019-17:00");
        Date d104= df.parse("12-06-2019-18:00");
        Date d105= df.parse("12-07-2019-20:00");


        event.add(new Event(0, "Kygo Music" ,"Concert", "New York", d0 , "Kygo is a Electronic Dance Music DJ", 19.99f, "img/bg-img/kygo.jpg", true));
        event.add(new Event(0, "Ultra Music Festival" ,"Festival", "Miami", d1 , "Top 10 Dj's playing", 27.49f, "img/bg-img/bg-3.jpg", true));
        event.add(new Event(0, "Marshmello" ,"Concert", "Chicago", d2 , "Marshmello plays Techno", 13.99f, "img/dummy/Marshmello.jpg", true));
        event.add(new Event(0, "VH1 Supersonic" ,"Festival", "California", d3 , "Sponsered by Sreekar Dhaduvai", 15.99f, "img/bg-img/bg-5.jpg", false));
        event.add(new Event(0, "Donald Duck vs Daffy Duck" ,"Sport", "London", d4 , "The boxing match of the century.", 89.99f, "img/dummy/DonaldDuckVsDaffyDuck.jpg", true));
        event.add(new Event(0, "The tragedy of Elmer Fudd" ,"Theater", "California", d5 , "No sadder tale than this.", 10.00f, "img/dummy/Elmer.jpg", true));
        event.add(new Event(0, "I can't believe this is a party" ,"Party", "Florida", d6 , "Crabs having a blast on the beach.", 54.49f, "img/dummy/CrabRave2.jpg", true));
        event.add(new Event(0, "Fresh Doge Memes" ,"Gallery", "New York", d6 , "A social commentary through memes.", 39.99f, "img/dummy/DogeArtGallery.jpg", false));
        event.add(new Event(0, "Film: RAIDERS OF THE LOST ARK w/Pre-Show Party" ,"Concert", "MainStage at Proctors", d7 , "RAIDERS OF THE LOST ARK!", 19.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11712", true));
        event.add(new Event(0, "The First Night of Funny New Year’s Event" ,"Festival", "MainStage at Proctors", d8 , "This New Year’s Eve say GOODBYE to 2018", 29.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11332", true));
        event.add(new Event(0, "Lou Gramm: The Juke Box Hero" ,"Sport", "MainStage at Proctors", d9 , "Founding member of Foreigner – one of the greatest singers in Rock music", 15.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11452", true));
        event.add(new Event(0, "Pretty Much the Best Comedy Show – Adam Mamawala" ,"Theater", "Proctors Theatre", d10 , "Upstate New York’s premiere stand-up showcase", 24.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11468", true));
        event.add(new Event(0, "The Naughty List: Staged Readings" ,"Party", "The Addy at Proctors", d11 , "On Christmas Eve in 1934, a hard-hearted nightclub chanteuse rekindles her Christmas", 23.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11905", true));
        event.add(new Event(0, "The Wizard of Oz" ,"Concert", "MainStage at Proctors", d13 , "This beloved tale, in which a Kansas farm girl travels over the rainbow", 35.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11388", true));
        event.add(new Event(0, "Hamilton Private Box VIP Raffle" ,"Festival", "Proctors Theatre", d14 , "WIN PRIVATE BOX SEATING AT HAMILTON FOR YOU AND 5 OF YOUR FRIENDS!", 59.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11914", true));
        event.add(new Event(0, "It’s a Wonderful Life: Live from WVL Radio Theatre" ,"Sport", "GE Theatre at Proctors", d15 , "It’s Christmas Eve in 1945, and only a handful", 99.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11374", true));
        event.add(new Event(0, "Film: Bolshoi Ballet ENCORE: Don Quixote" ,"Theater", "GE Theatre at Proctors", d16 , "Inspired by heroic stories of brave knights, with his faithful servant Sancho Panza at his side", 29.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11339", true));
        event.add(new Event(0, "Film: NORTH POLE, NY" ,"Party", "GE Theatre at Proctors", d17 , "Santa is alive and well in upstate New York!  Or is he?", 34.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11885", true));
        event.add(new Event(0, "Film: ELF with All-You-Can-Eat popcorn" ,"Gallery", "GE Theatre at Proctors", d18 , "After inadvertently wreaking havoc on the elf community due to his ungainly size ", 14.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11913", true));
        event.add(new Event(0, "WRGB Melodies of Christmas" ,"Concert", "MainStage at Proctors", d19 , "Celebrating 39 years CBS 6 Melodies of Christmas is the Capital Region’s premiere holiday extravaganza!", 48.37f, "https://tickets.proctors.org/TheatreManager/95/image?event=11628", false));
        event.add(new Event(0, "Rochmon presents Bruce Springsteen" ,"Festival", "GE Theatre at Proctors", d20 , "A Rochmon Record Club Listening Party is a multi-media event meant to inform and deepen our understanding", 50.03f, "https://tickets.proctors.org/TheatreManager/95/image?event=11715", true));
        event.add(new Event(0, "Film: KING COHEN" ,"Sport", "GE Theatre at Proctors", d21 , "This documentary looks at the acclaimed and eclectic career of maverick filmmaker, Larry Cohen.", 51.69f, "https://tickets.proctors.org/TheatreManager/95/image?event=11892", true));
        event.add(new Event(0, "The Best Christmas Pageant Ever" ,"Theater", "The Addy at Proctors", d22 , "In this hilarious popular Christmas classic, a couple struggling to put on a church Christmas", 53.35f, "https://tickets.proctors.org/TheatreManager/95/image?event=11538", true));
        event.add(new Event(0, "Film: National Theatre: MADNESS OF GEORGE III" ,"Party", "GE Theatre at Proctors", d23 , "National Geographic Live Ocean Soul Brian Skerry, Underwater Photographer", 55.01f, "https://tickets.proctors.org/TheatreManager/95/image?event=11249", false));
        event.add(new Event(0, "Lunch with Santa" ,"Gallery", "Proctors Theatre", d24 , "Santa’s making his list and checking it twice…will YOU be on it?Whether you’re attending.", 56.67f, "https://tickets.proctors.org/TheatreManager/95/image?event=11776", true));
        event.add(new Event(0, "Piff the Magic Dragon" ,"Concert", "GE Theatre at Proctors", d25 , "Piff the Magic Dragon.The star of NBC’s America’s Got Talent and Penn &amp; Teller: Fool Us", 58.33f, "https://tickets.proctors.org/TheatreManager/95/image?event=11626", true));
        event.add(new Event(0, "Turning of the Year Celtic Celebration:" ,"Festival", "GE Theatre at Proctors", d26 , "the warmth and good cheer would have felt good in any season", 59.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11193", true));
        event.add(new Event(0, "The Gibson Brothers: North Country Christmas Show" ,"Sport", "GE Theatre at Proctors", d27 , "THE GIBSON BROTHERS’ BRAND of bluegrass is a visceral mix of heritage", 61.66f, "https://tickets.proctors.org/TheatreManager/95/image?event=11409", true));
        event.add(new Event(0, "Angelo Michael Mazzone Fundraiser" ,"Theater", "GE Theatre at Proctors", d28 , "Join us for an inspiring event featuring Angelo Michael Mazzone, along with his pianist Mun Tzung Wong", 63.32f, "https://tickets.proctors.org/TheatreManager/95/image?event=11921", true));
        event.add(new Event(0, "Dr. Seuss’ How the Grinch Stole Christmas! The Musical" ,"Party", "MainStage at Proctors", d29 , "Dr. Seuss’ How The Grinch Stole Christmas! ", 64.98f, "https://tickets.proctors.org/TheatreManager/95/image?event=11282", true));
        event.add(new Event(0, "Film: Bolshoi Ballet: LA SYLPHIDE" ,"Gallery", "GE Theatre at Proctors", d30 , "On his wedding day, the young Scotsman James is awakened with a kiss  ", 66.64f, "https://tickets.proctors.org/TheatreManager/95/image?event=11337", true));
        event.add(new Event(0, "Keith Lockhart & The Boston Pops On Tour" ,"Concert", "MainStage at Proctors", d31 , "Proctors presents a Holiday Pops Concert with Keith Lockhart and the Boston", 68.30f, "https://tickets.proctors.org/TheatreManager/95/image?event=11373", false));
        event.add(new Event(0, "Film: COLETTE" ,"Festival", "The Addy at Proctors", d32 , "In this fact-based story, author Sidonie-Gabrielle Colette  agrees to ghostwrite a semi-autobiographical novel .", 69.96f, "https://tickets.proctors.org/TheatreManager/95/image?event=11906", true));
        event.add(new Event(0, "Miss Bennet: Christmas at Pemberly" ,"Sport", "Capital Repertory Theatre", d33 , "By Lauren Gunderson and Margot Melcon. Directed by Maggie Mancinelli-Cahill", 71.62f, "https://tickets.proctors.org/TheatreManager/95/image?event=10865", true));
        event.add(new Event(0, "Organ Concert Series" ,"Theater", "MainStage at Proctors", d34 , "All concerts are on Tuesday at noon on the MainStage at Proctors. Unless otherwise noted below.", 73.28f, "https://tickets.proctors.org/TheatreManager/95/image?event=11642", true));
        event.add(new Event(0, "Schenectady Symphony Orchestra" ,"Party", "MainStage at Proctors", d35 , "Dancing With Strings.Ancient Airs and Dances No. 3 Ottorino Respighi Rumanian Folk Dances ", 74.94f, "https://tickets.proctors.org/TheatreManager/95/image?event=11331", true));
        event.add(new Event(0, "The Phantom of the Opera" ,"Gallery", "MainStage at Proctors", d36 , "Cameron Mackintosh’s spectacular new production of Andrew Lloyd Webber’s THE PHANTOM OF THE OPERA", 76.60f, "https://tickets.proctors.org/TheatreManager/95/image?event=11283", true));
        event.add(new Event(0, "Pretty Much the Best Comedy Show – Apr. 27th" ,"Concert", "Proctors Theatre", d37 , "Pretty Much The Best Comedy Show</a> includes a host, feature act, and guest comedians", 78.26f, "https://tickets.proctors.org/TheatreManager/95/image?event=11561", true));
        event.add(new Event(0, "Rochmon Presents Queen" ,"Festival", "GE Theatre at Proctors", d38 , "No details!", 79.92f, "https://tickets.proctors.org/TheatreManager/95/image?event=11716", true));
        event.add(new Event(0, "Rock of Ages" ,"Sport", "MainStage at Proctors", d39 , "Arrangements and Orchestrations by Ethan Popp.", 81.59f, "https://tickets.proctors.org/TheatreManager/95/image?event=11435", false));
        event.add(new Event(0, "Film: Exhibition on Screen: Rembrandt" ,"Theater", "GE Theatre at Proctors", d40 , "For many, Rembrandt is the greatest artist that ever lived .", 83.25f, "https://tickets.proctors.org/TheatreManager/95/image?event=11514", true));
        event.add(new Event(0, "Dougie MacLean" ,"Party", "GE Theatre at Proctors", d41 , "Multi-instrumentalist Dougie MacLean lives in Perthshire, Scotland. From here he has earned on his own", 84.91f, "https://tickets.proctors.org/TheatreManager/95/image?event=11207", true));
        event.add(new Event(0, "Golden Oldies Spectacular" ,"Gallery", "MainStage at Proctors", d42 , "An amazing seven act Golden Oldies spectacular comes to Proctors on Saturday, April 13 at 7:00.", 86.57f, "https://tickets.proctors.org/TheatreManager/95/image?event=11308", true));
        event.add(new Event(0, "Capital Records Live!" ,"Concert", "GE Theatre at Proctors", d43 , "No details!", 88.23f, "https://tickets.proctors.org/TheatreManager/95/image?event=11637", false));
        event.add(new Event(0, "8th Annual Gospel Jubilee" ,"Festival", "MainStage at Proctors", d44 , "This annual event will bring great joy and uplifting music to all in attendance. ", 89.89f, "https://tickets.proctors.org/TheatreManager/95/image?event=11638", true));
        event.add(new Event(0, "Passport Series: Mokoomba" ,"Sport", "GE Theatre at Proctors", d45 , "Mokoomba is one of Africa’s most exciting young bands, dazzling audiences worldwide with their knockout live shows", 91.55f, "https://tickets.proctors.org/TheatreManager/95/image?event=11430", true));
        event.add(new Event(0, "Tap Dogs" ,"Theater", "MainStage at Proctors", d46 , "Experience the thrill of a revitalized genre of dance. Seventy-five action packed minutes of part theatre, part dance, part rock concert", 93.21f, "https://tickets.proctors.org/TheatreManager/95/image?event=11433", true));
        event.add(new Event(0, "Film: Bolshoi Ballet ENCORE: Golden Age" ,"Party", "GE Theatre at Proctors", d47 , "In the 1920’s, The Golden Age cabaret is a favorite nightly haunt. The young fisherman Boris falls in love with Rita.", 94.87f, "https://tickets.proctors.org/TheatreManager/95/image?event=11346", true));
        event.add(new Event(0, "Word Plays: Shenanigans" ,"Gallery", "Proctors Theatre", d48 , "If you’re one of those people who lingers in your car long after reaching a destination just to hear the end", 96.53f, "https://tickets.proctors.org/TheatreManager/95/image?event=11754", true));
        event.add(new Event(0, "Two Left Feet" ,"Concert", "GE Theatre at Proctors", d49 , "Community dance for everyone! In association with the .DanceFlurry Organization and Old Songs, Inc.", 98.19f, "https://tickets.proctors.org/TheatreManager/95/image?event=11570", true));
        event.add(new Event(0, "Cirque Eloize Saloon" ,"Festival", "MainStage at Proctors", d50 , "Picture this: America is under construction.", 99.85f, "https://tickets.proctors.org/TheatreManager/95/image?event=11437", true));
        event.add(new Event(0, "Shakespeare in Love" ,"Sport", "Capital Repertory Theatre", d51 , "Based on the screenplay by Marc Norman and Tom Stoppard Directed by Maggie Mancinelli-Cahill.", 19.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=10868", false));
        event.add(new Event(0, "Peg + Cat – Live! SD" ,"Theater", "MainStage at Proctors", d52 , "CREATED BY BILLY ARONSON &amp; JENNIFER OXLEY, THE CO-CREATORS OF THE PEG ", 29.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11343", true));
        event.add(new Event(0, "Peg + Cat Live!" ,"Party", "MainStage at Proctors", d53 , "Based on the Emmy-winning PBS Kids show, this totally awesome musical features wild comedy", 15.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11439", true));
        event.add(new Event(0, "Pretty Much the Best Comedy Show – Mar. 30th" ,"Gallery", "Proctors Theatre", d54 , "includes a host, feature act, and guest comedians, providing nearly two hours.", 24.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11560", true));
        event.add(new Event(0, "PB&J Cafe: Stuart Little" ,"Concert", "GE Theatre at Proctors", d55 , "Adapted by Joseph Robinette. Based on the book by E.B. White.This is the endearing.", 59.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11679", true));
        event.add(new Event(0, "Cruel Intentions: The 90s Musical" ,"Festival", "MainStage at Proctors", d56 , "Based on the French novel, Les Liasions Dangereuses, and the classic cult film starring Reese Witherspoon,", 23.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11630", true));
        event.add(new Event(0, "Film: Tragedy of King Richard the Second" ,"Sport", "GE Theatre at Proctors", d57 , "The Tragedy of King Richard the Second By William Shakespeare", 35.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11799", true));
        event.add(new Event(0, "Schenectady Symphony Orchestra" ,"Theater", "GE Theatre at Proctors", d58 , "Dancing With Strings.Ancient Airs and Dances No. 3 Ottorino Respighi", 59.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=10901", true));
        event.add(new Event(0, "Currents by Mayumana" ,"Party", "MainStage at Proctors", d59 , "Curriculum Connections: SCIENCE, HISTORY, DANCE.This spectacular show was inspired ", 99.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11444", false));
        event.add(new Event(0, "The Temptations and The Four Tops" ,"Gallery", "MainStage at Proctors", d60 , "The Temptations and The Four Tops.Two musical giants of Motown and inductees in The Rock.", 29.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11441", true));
        event.add(new Event(0, "Winston Churchill: The Blitz SD" ,"Concert", "GE Theatre at Proctors", d61 , "Randy Otto portrays Churchill’s unwavering, audacious belief that if the British people were simply trusted ", 34.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11345", true));
        event.add(new Event(0, "Winston Churchill: The Blitz" ,"Festival", "GE Theatre at Proctors", d62 , "Experience the astonishingly nuanced, humorous, witty, REAL Winston Churchill with gravitas  ", 14.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11443", true));
        event.add(new Event(0, "Bobby Collins" ,"Sport", "GE Theatre at Proctors", d63 , "Comedian Bobby Collins has an ability to truthfully translate the human condition.", 48.37f, "https://tickets.proctors.org/TheatreManager/95/image?event=11751", false));
        event.add(new Event(0, "National Geographic Live! Brian Skerry" ,"Theater", "MainStage at Proctors", d64 , "National Geographic Live Ocean Soul.Voyage across the oceans .", 50.03f, "https://tickets.proctors.org/TheatreManager/95/image?event=11366", true));
        event.add(new Event(0, "Film: Bolshoi Ballet ENCORE: Sleeping Beauty" ,"Party", "GE Theatre at Proctors", d65 , "THE SLEEPING BEAUTY.On her sixteenth birthday, Princess Aurora falls under the curse ", 51.69f, "https://tickets.proctors.org/TheatreManager/95/image?event=11344", true));
        event.add(new Event(0, "Currents by Mayumana SD" ,"Gallery", "MainStage at Proctors", d66 , "Curriculum Connections: SCIENCE, HISTORY, DANCE.This spectacular show was inspired by the historical Battle", 53.35f, "https://tickets.proctors.org/TheatreManager/95/image?event=11342", true));
        event.add(new Event(0, "11th Annual Capital Region Wine Festival" ,"Concert", "Proctors Theatre", d67 , "Join us for the 11th annual Capital Region Wine Festival — sample a wide variety of exceptional red", 55.01f, "https://tickets.proctors.org/TheatreManager/95/image?event=11639", true));
        event.add(new Event(0, "Thruway: A Sing Off" ,"Festival", "MainStage at Proctors", d68 , "Union and groups from 3 other regional colleges will compete for the title of best singing group.", 56.67f, "https://tickets.proctors.org/TheatreManager/95/image?event=11814", true));
        event.add(new Event(0, "John McCutcheon" ,"Sport", "GE Theatre at Proctors", d69 , "JOHN McCUTCHEON. CD Release: Pete Seeger Tribute Album.“Uncanny ability to breathe new life into the familiar. His storytelling has the richness of fine literature", 58.33f, "https://tickets.proctors.org/TheatreManager/95/image?event=11313", true));
        event.add(new Event(0, "Storm Large & Le Bonheur" ,"Theater", "GE Theatre at Proctors", d70 , "Storm Large: musician, actor, playwright, author, awesome. She shot to national prominence as a contestant on the CBS show Rock Star: Supernova", 59.99f, "https://tickets.proctors.org/TheatreManager/95/image?event=11451", true));
        event.add(new Event(0, "Burlesque W/Live Post-Film Performance!" ,"Party", "GE Theatre at Proctors", d71 , "Ali, a small-town gal with a great voice (Christina Aguilera), leaves a troubled life behind and follows her dreams to Los Angeles.", 61.66f, "https://tickets.proctors.org/TheatreManager/95/image?event=11801", false));
        event.add(new Event(0, "The Irish Comedy Tour" ,"Gallery", "GE Theatre at Proctors", d72 , " Irish Comedy Tour takes the party atmosphere of a Dublin pub and combines it with a boisterous, belly-laugh band of hooligans.", 63.32f, "https://tickets.proctors.org/TheatreManager/95/image?event=11450", true));
        event.add(new Event(0, "Friend of a Friend SD" ,"Concert", "GE Theatre at Proctors", d73 , "This original docu-play, developed by theREP, used New York State archival documents to bring to life the impact of the Fugitive Slave Act in the Capital Region.", 64.98f, "https://tickets.proctors.org/TheatreManager/95/image?event=11131", true));
        event.add(new Event(0, "Roald Dahl’s Charlie and the Chocolate Factory" ,"Festival", "MainStage at Proctors", d74 , "Roald Dahl’s amazing tale is now Schenectady’s golden ticket! It’s the perfect recipe for a delectable treat: songs from the original film", 66.64f, "https://tickets.proctors.org/TheatreManager/95/image?event=11274", true));
        event.add(new Event(0, "Word Plays: Inside Out" ,"Sport", "Proctors Theatre", d75 , "Have you ever felt that you knew something really well, “inside out” so to speak? ", 68.30f, "https://tickets.proctors.org/TheatreManager/95/image?event=11753", true));
        event.add(new Event(0, "Pretty Much the Best Comedy Show – Feb. 23rd" ,"Theater", "Proctors Theatre", d76 , "Upstate New York’s premiere stand-up showcase, Pretty Much the Best Comedy Show, has been thriving at Proctors since summer 2014", 69.96f, "https://tickets.proctors.org/TheatreManager/95/image?event=11559", true));
        event.add(new Event(0, "The Lightning Thief" ,"Party", "MainStage at Proctors", d77 , "The Lightning Thief: The Percy Jackson Musical.", 71.62f, "https://tickets.proctors.org/TheatreManager/95/image?event=11636", true));
        event.add(new Event(0, "Mardi Gras 2019" ,"Gallery", "GE Theatre at Proctors", d78 , "Celebrate Mardi Gras with The Dirty Dozen Brass Band and Cha Wa!.The Dirty Dozen Brass Band celebrating over 40 years since their founding in 1977.", 73.28f, "https://tickets.proctors.org/TheatreManager/95/image?event=11836", true));
        event.add(new Event(0, "Film: National Theatre: I’m Not Running" ,"Concert", "GE Theatre at Proctors", d79 , "I’m Not Running is an explosive new play by David Hare, premiering at the National Theatre and broadcast to cinemas.", 74.94f, "https://tickets.proctors.org/TheatreManager/95/image?event=11463", false));
        event.add(new Event(0, "Steve Martin and Martin Short" ,"Festival", "MainStage at Proctors", d80 , "Now You See Them, Soon You Won’t.Featuring the Steep Canyon Rangers and Jeff Babko.", 76.60f, "https://tickets.proctors.org/TheatreManager/95/image?event=11767", true));
        event.add(new Event(0, "Erth’s Prehistoric Aquarium Adventure" ,"Sport", "MainStage at Proctors", d81 , "The creators of Erth’s Dinosaur Zoo Live want to take your family on an all new adventure", 78.26f, "https://tickets.proctors.org/TheatreManager/95/image?event=11431", true));
        event.add(new Event(0, "Passport Series: Banda Magda" ,"Theater", "GE Theatre at Proctors", d82 , "Led by Greek-born composer, orchestrator, singer and accordionist Magda Giannikou (Kronos Quartet, Louis CK), Banda Magda moves from samba", 79.92f, "https://tickets.proctors.org/TheatreManager/95/image?event=11428", true));
        event.add(new Event(0, "Erth’s Prehistoric Aquarium SD" ,"Party", "MainStage at Proctors", d83 , "Deep below the surface, submerged below time, swam some of the world’s most amazing prehistoric marine reptiles. ", 81.59f, "https://tickets.proctors.org/TheatreManager/95/image?event=11341", false));
        event.add(new Event(0, "Salsa Dance Night" ,"Gallery", "GE Theatre at Proctors", d84 , "Salsa Dance Night with  and His Latin Orchestra.Celebrate Valentine’s Day with dancing, food, and salsa lessons all for a great cause! ", 83.25f, "https://tickets.proctors.org/TheatreManager/95/image?event=11798", true));
        event.add(new Event(0, "I Have a Dream SD" ,"Concert", "MainStage at Proctors", d85 , "This compelling dramatization of the life and times of one of the most influential and charismatic leaders of the American Century s", 84.91f, "https://tickets.proctors.org/TheatreManager/95/image?event=11340", true));
        event.add(new Event(0, "Film: Bolshoi Ballet: LA BAYADERE" ,"Festival", "GE Theatre at Proctors", d86 , "The temple dancer Nikiya and the warrior Solor fall deeply in love, igniting heated passions and murderous intrigues when the Rajah", 86.57f, "https://tickets.proctors.org/TheatreManager/95/image?event=11347", true));
        event.add(new Event(0, "Mrs. Krishnan’s Party" ,"Sport", "GE Theatre at Proctors", d87 , "Indians throw crazy parties. Heard of Diwali? A million lamps floating on a river and fireworks to wake the dead.", 88.23f, "https://tickets.proctors.org/TheatreManager/95/image?event=11601", true));
        event.add(new Event(0, "Film: Exhibition on Screen: Young Picasso" ,"Theater", "GE Theatre at Proctors", d88 , "YOUNG PICASSO.Pablo Picasso is one of the greatest artists of all time – and right up until his death in 1973 he was also one of the most prolific.", 89.89f, "https://tickets.proctors.org/TheatreManager/95/image?event=11513", true));
        event.add(new Event(0, "National Geographic Live! Terry Virts" ,"Party", "MainStage at Proctors", d89 , "Sometimes, a little distance is all you need to see things in a brand-new way. For astronaut Terry Virts, ", 91.55f, "https://tickets.proctors.org/TheatreManager/95/image?event=11365", true));
        event.add(new Event(0, "Film: RAIDERS! The Story of Greatest Fan Film Ever Made" ,"Gallery", "GE Theatre at Proctors", d90 , "Seven years later, they managed to complete all but one scene – the exploding airplane climax", 93.21f, "https://tickets.proctors.org/TheatreManager/95/image?event=11891", true));
        event.add(new Event(0, "Diavolo" ,"Concert", "MainStage at Proctors", d91 , "Following their success as one of the top 10 finalists in Season 12 of NBC’s America’s Got Talent, Los Angeles-based DIAVOLO continues pushing a new edge of performance ", 94.87f, "https://tickets.proctors.org/TheatreManager/95/image?event=11394", false));
        event.add(new Event(0, "Word Plays: Starting Over" ,"Festival", "Proctors Theatre", d92 , "Sometimes you can’t continue on - you just have to start over. Come hear stories of how people dealt with, coped, and/or survived starting over.", 96.53f, "https://tickets.proctors.org/TheatreManager/95/image?event=11752", true));
        event.add(new Event(0, "Pretty Much the Best Comedy Show – Jan. 26th" ,"Sport", "Proctors Theatre", d93 , "Icons of Vinyl is The Ultimate Tribute Tour. This special night features the highest tribute grossing acts to The Eagles, Eric Clapton and Tom Petty.", 98.19f, "https://tickets.proctors.org/TheatreManager/95/image?event=11558", true));
        event.add(new Event(0, "Icons of Vinyl" ,"Theater", "MainStage at Proctors", d94 , "Fans will get to hear three amazing sets, featuring hits and b-sides from their favorite acts they know and love.", 99.85f, "https://tickets.proctors.org/TheatreManager/95/image?event=11837", true));
        event.add(new Event(0, "One-Man Star Wars Trilogy" ,"Party", "GE Theatre at Proctors", d95 , "Canadian actor and uber geek, Charles Ross, brings his solo madcap creationOne-Man Star Wars Trilogy to the stage in this mind-bending whirlwind of a show.", 74.94f, "https://tickets.proctors.org/TheatreManager/95/image?event=11392", true));
        event.add(new Event(0, "Red Maple" ,"Gallery", "Capital Repertory Theatre", d96 , "World Premiere.RED MAPLE.By David Bunce.Directed by Margaret E. Hall.Everyone wants to know, “What’s the matter with Robert?", 76.60f, "https://tickets.proctors.org/TheatreManager/95/image?event=10867", true));
        event.add(new Event(0, "Jazz is PHSH" ,"Concert", "GE Theatre at Proctors", d97 , "JAZZ IS PHSH is an instrumental tribute to Phish inspired by the popular tribute to The Grateful Dead", 78.26f, "https://tickets.proctors.org/TheatreManager/95/image?event=11830", true));
        event.add(new Event(0, "Monty Python’s Spamalot" ,"Festival", "MainStage at Proctors", d98 , "This outrageous musical comedy is lovingly ripped off from the film classic Monty Python and the Holy Grail", 79.92f, "https://tickets.proctors.org/TheatreManager/95/image?event=11421", true));
        event.add(new Event(0, "Schenectady Symphony Orchestra" ,"Sport", "MainStage at Proctors", d99 , "Dancing With Strings.Ancient Airs and Dances No. 3 Ottorino Respighi", 81.59f, "https://tickets.proctors.org/TheatreManager/95/image?event=11330", false));
        event.add(new Event(0, "Film: Saturday Morning Cartoon Cereal Bowl!" ,"Theater", "GE Theatre at Proctors", d100 , "It Came from Schenectady presents.ALL-YOU-CAN-EAT CARTOON CEREAL BOWL.One of ICFS’s most popular events is back! ", 83.25f, "https://tickets.proctors.org/TheatreManager/95/image?event=11890", true));
        event.add(new Event(0, "Max Weinberg’s Jukebox" ,"Party", "GE Theatre at Proctors", d101 , "Fresh off the hugely successful The River Tour 2016-2017 of Bruce Springsteen", 84.91f, "https://tickets.proctors.org/TheatreManager/95/image?event=11571", true));
        event.add(new Event(0, "Jack Hanna’s Into the Wild Live!" ,"Gallery", "MainStage at Proctors", d102 , "JACK HANNA’S INTO THE WILD LIVE! Presented by NationwideJanuary 11, 2019.", 86.57f, "https://tickets.proctors.org/TheatreManager/95/image?event=11391", true));
        event.add(new Event(0, "The Phantom Tollbooth SD" ,"Concert", "MainStage at Proctors", d103 , "A limited number of single tickets are available, please contact the Box Office at (518) 346-6204 to purchase.", 88.23f, "https://tickets.proctors.org/TheatreManager/95/image?event=11338", false));
        event.add(new Event(0, "Film: National Theatre: Antony & Cleopatra" ,"Festival", "GE Theatre at Proctors", d104 , "Broadcast from the National Theatre, Ralph Fiennes and Sophie Okonedo play ", 89.89f, "https://tickets.proctors.org/TheatreManager/95/image?event=11462", true));
        event.add(new Event(0, "School of Rock" ,"Sport", "MainStage at Proctors", d105 , "Based on the hit Jack Black film, SCHOOL OF ROCK follow Dewey Finn, a wannabe rock star who turns a class of straight-A students into grade-A rockers. ", 91.55f, "https://tickets.proctors.org/TheatreManager/95/image?event=11273", true));

        eventRepository.saveAll(event);

    }
}
