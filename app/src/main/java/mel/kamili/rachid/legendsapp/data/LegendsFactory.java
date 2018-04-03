package mel.kamili.rachid.legendsapp.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mel.kamili.rachid.legendsapp.model.Legend;
import mel.kamili.rachid.legendsapp.model.LegendGroup;

public class LegendsFactory {

    public Map<LegendGroup, List<Legend>> createLegends(){

        Map<LegendGroup,List<Legend>> legendMap = new HashMap<>();

        //Group data
        LegendGroup tanks = new LegendGroup("Tanks", "CAN TAKE IT",
                "Resilient bruisers, Tanks excel at shrugging off blows that would obliterate lesser allies.",
                "https://vignette.wikia.nocookie.net/leagueoflegends/images/5/5a/Tank_icon.png",
                "https://lolstatic-a.akamaihd.net/frontpage/apps/prod/playnow-global/en_US/7e291d303c042e243dbfb8a1479cb8c0b1438a4b/assets/img/champions_tanks.jpg");
        LegendGroup fighters = new LegendGroup("Fighters", "LOVE TO DUEL",
                "A balance of power and defense, Fighters are born to brawl, preferring their bouts up close and personal.",
                "https://vignette.wikia.nocookie.net/leagueoflegends/images/8/8f/Fighter_icon.png",
                "https://lolstatic-a.akamaihd.net/frontpage/apps/prod/playnow-global/en_US/7e291d303c042e243dbfb8a1479cb8c0b1438a4b/assets/img/champions_fighter.jpg");
        LegendGroup mages = new LegendGroup("Mages", "SURGE WITH POWER",
                "Aggressive casters, Mages seek to destroy opponents through a range of mystical attacks, spells and abilities.",
                "https://vignette.wikia.nocookie.net/leagueoflegends/images/2/28/Mage_icon.png",
                "https://lolstatic-a.akamaihd.net/frontpage/apps/prod/playnow-global/en_US/7e291d303c042e243dbfb8a1479cb8c0b1438a4b/assets/img/champions_mages.jpg");
        LegendGroup assassins = new LegendGroup("Assassins", "CRAVE THE HUNT",
                "Masters of precision, Assassins are agile hunters on the lookout for the perfect kill.",
                "https://vignette.wikia.nocookie.net/leagueoflegends/images/2/28/Slayer_icon.png",
                "https://lolstatic-a.akamaihd.net/frontpage/apps/prod/playnow-global/en_US/7e291d303c042e243dbfb8a1479cb8c0b1438a4b/assets/img/champions_assassins.jpg");
        LegendGroup marksmen = new LegendGroup("Marksmen", "BRING THE PAIN",
                "Ranged fighters, Marksmen are powerful but fragile. While they rely on their team to soak up damage, teams rely on them to deal it.",
                "https://vignette.wikia.nocookie.net/leagueoflegends/images/7/7f/Marksman_icon.png",
                "https://lolstatic-a.akamaihd.net/frontpage/apps/prod/playnow-global/en_US/7e291d303c042e243dbfb8a1479cb8c0b1438a4b/assets/img/champions_marksmen.jpg");
        LegendGroup supports = new LegendGroup("Supports", "HAVE YOUR BACK",
                "Stalwart defenders, Supports control the battlefield by augmenting allies and locking down enemies.",
                "https://vignette.wikia.nocookie.net/leagueoflegends/images/5/58/Controller_icon.png",
                "https://lolstatic-a.akamaihd.net/frontpage/apps/prod/playnow-global/en_US/7e291d303c042e243dbfb8a1479cb8c0b1438a4b/assets/img/champions_support.jpg");

        //Legends Data

        //Tanks
        List<Legend> tankList = new ArrayList<>();
        tankList.add( new Legend("Sion", 0, "THE UNDEAD JUGGERNAUT",
            "A war hero from a bygone era, Sion was revered in Noxus for choking the life out of a Demacian king with his bare hands—but, denied oblivion, he was resurrected to serve his empire even in death. His indiscriminate slaughter claimed all who stood in his way, regardless of allegiance, proving he no longer retained his former humanity. Even so, with crude armor bolted onto rotten flesh, Sion continues to charge into battle with reckless abandon, struggling to remember his true self between the swings of his mighty axe.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Sion.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/6/64/Sion_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/2/2c/Sion.start03.ogg"));
        tankList.add( new Legend("Alistar", 1, "THE MINOTAUR",
            "Always a mighty warrior with a fearsome reputation, Alistar seeks revenge for the death of his clan at the hands of the Noxian empire. Though he was enslaved and forced into the life of a gladiator, his unbreakable will was what kept him from truly becoming a beast. Now, free of the chains of his former masters, he fights in the name of the downtrodden and the disadvantaged, his rage as much a weapon as his horns, hooves and fists.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Alistar.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/5/54/Alistar_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/1/13/Alistar.attack4.ogg"));
        tankList.add( new Legend("Blitzcrank", 1, "THE GREAT STEAM GOLEM",
            "Blitzcrank is an enormous, near-indestructible steam golem originally built to dispose of hazardous waste in Zaun. Evolved beyond his primary purpose, Blitzcrank selflessly uses his strength and durability to protect others. Able to see past false veneers and artifice to the truth of an intention, Blitzcrank moves to help those in need.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Blitzcrank.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/d/dc/Blitzcrank_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/b/b8/BlitzcrankLancerRogue_01.ogg"));
        tankList.add( new Legend("Leona", 2, "THE RADIANT DAWN",
            "Imbued with the fire of the sun, Leona is a warrior templar of the Locket of the Iron Solari item Solari who defends Mount Targon with her Zenith Blade Zenith Blade and Shield of Daybreak Shield of Daybreak. Her skin shimmers with starfire while her eyes burn with the power of the celestial Aspect within her. Armored in gold and bearing a terrible burden of ancient knowledge, Leona brings enlightenment to some, death to others.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Leona.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/3/3e/Leona_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/e/e5/Leona.attack3.ogg"));
        legendMap.put(tanks,tankList);

        //Fighters
        List<Legend> fighterList = new ArrayList<>();
        fighterList.add( new Legend( "Darius", 0, "THE HAND OF NOXUS",
            "There is no greater symbol of Noxian might than Darius, the nation's most feared and battle-hardened leader. Rising from humble origins to become the Hand of Noxus, he cleaves through the empire's enemies—many of them Noxians themselves. Knowing that he never doubts his cause is just, and never hesitates once his axe is raised, those who stand against the commander of the Trifarian Legion can expect no mercy.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Darius.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/1/18/Darius_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/e/e0/Darius.attack2.ogg"));
        fighterList.add( new Legend( "Gangplank", 0, "THE SALTWATER SCOURGE",
            "As unpredictable as he is brutal, the dethroned reaver king Gangplank is feared far and wide. Once, he ruled the port city of Bilgewater, and while his reign is over, there are those who believe this has only made him more dangerous. Gangplank would see Bilgewater bathed in blood once more before letting someone else take it—and now with pistol, cutlass, and barrels of gunpowder, he is determined to reclaim what he has lost.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Gangplank.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/8/80/Gangplank_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/b/b9/Gangplank.start03.ogg"));
        fighterList.add( new Legend( "Camille", 1, "THE STEEL SHADOW",
            "Weaponized to operate outside the boundaries of the law, Camille is the Principal Intelligencer of Clan Ferros—an elegant and elite agent who ensures the Piltover machine and its Zaunite underbelly runs smoothly. Adaptable and precise, she views sloppy technique as an embarrassment that must be put to order. With a mind as sharp as the blades she bears, Camille's pursuit of superiority through hextech body augmentation has left many to wonder if she is now more machine than woman.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Camille.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/3/32/Camille_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/a/a4/Camille.start02.ogg"));
        fighterList.add( new Legend( "Lee Sin", 2, "THE BLIND MONK",
            "A master of Ionia's ancient martial arts, Lee Sin is a principled fighter who channels the essence of the dragon spirit to face any challenge. Though he lost his sight many years ago, the warrior-monk has devoted his life to protecting his homeland against any who would dare upset its sacred balance. Enemies who underestimate his meditative demeanor will endure his fabled burning fists and blazing roundhouse kicks.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/LeeSin.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/1/1b/Lee_Sin_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/b/b4/Lee_Sin_Select.ogg"));
        legendMap.put(fighters,fighterList);

        //Mages
        List<Legend> mageList = new ArrayList<>();
        mageList.add( new Legend( "Swain", 0, "THE NOXIAN GRAND GENERAL",
            "Jericho Swain is the visionary ruler of Noxus, an expansionist nation that reveres only strength. Though he was cast down and crippled in the Ionian wars, his left arm severed, he seized control of the empire with ruthless determination... and a new, demonic hand. Now, Swain commands from the front lines, marching against a coming darkness that only he can see-- in glimpses gathered by shadowy ravens from the corpses all around him. In a swirl of sacrifice and secrets, the greatest secret of all is that the true enemy lies within.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Swain.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/d/d1/Swain_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/1/18/SwainDragonMaster011.ogg"));
        mageList.add( new Legend( "Karthus", 2, "THE DEATHSINGER",
            "The harbinger of oblivion, Karthus is an undying spirit whose haunting songs are a prelude to the horror of his nightmarish appearance. The living fear the eternity of undeath, but Karthus sees only beauty and purity in its embrace, a perfect union of life and death. When Karthus emerges from the Shadow Isles, it is to bring the joy of death to mortals as an apostle of the unliving.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Karthus.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/c/c9/Karthus_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/3/38/Karthus.attack11.ogg"));
        mageList.add( new Legend( "Brand", 2, "THE BURNING VENGEANCE",
            "Once a tribesman of the icy Freljord named Kegan Rodhe, the creature known as Brand is a lesson in the temptation of greater power. Seeking one of the legendary World Runes, Kegan betrayed his companions and seized it for himself—and, in an instant, the man was no more. His soul burned away, his body a vessel of living flame, Brand now roams Valoran in search of other Runes, swearing revenge for wrongs he could never possibly have suffered in a dozen mortal lifetimes.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Brand.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/5/5c/Brand_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/8/8c/Brand.attack6.ogg"));
        legendMap.put(mages,mageList);

        //Assassins
        List<Legend> assassinList = new ArrayList<>();
        assassinList.add( new Legend( "Kha'Zix", 0, "THE VOIDREAVER",
            "The Void grows, and the Void adapts—in none of its myriad spawn are these truths more apparent than Kha'Zix. Evolution drives the core of this mutating horror, born to survive and to slay the strong. Where it struggles to do so, it grows new, more effective ways to counter and kill its prey. Initially a mindless beast, Kha'Zix's intelligence has developed as much as its form. Now, the creature plans out its hunts, and even utilizes the visceral terror it engenders in its victims.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Khazix.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/a/a2/Kha%27Zix_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/b/b5/Khazix.attack1.ogg"));
        assassinList.add( new Legend( "Zed", 0, "THE MASTER OF SHADOWS",
            "Utterly ruthless and without mercy, Zed is the leader of the Order of Shadow, an organization he created with the intent of militarizing Ionia's martial arts traditions to drive out Noxian invaders. During the war, desperation led him to unlock the secret shadow form—a malevolent spirit magic as dangerous and corrupting as it is powerful. Zed has mastered all of these forbidden techniques to destroy anything he sees as a threat to his nation, or his new order.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Zed.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/b/b4/Zed_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/8/84/Zed.move1.ogg"));
        assassinList.add( new Legend( "Nocturne", 1, "THE ETERNAL NIGHTMARE",
            "A demonic amalgamation drawn from the nightmares that haunt every sentient mind, the thing known as Nocturne has become a primordial force of pure evil. It is liquidly chaotic in aspect, a faceless shadow with cold eyes and armed with wicked-looking blades. After freeing itself from the spirit realm, Nocturne descended upon the waking world, to feed upon the kind of terror that can only thrive in true darkness.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Nocturne.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/4/45/Nocturne_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/f/ff/Nocturne.attack6.ogg"));
        assassinList.add( new Legend( "Master Yi", 1, "THE WUJU BLADESMAN",
            "Master Yi has tempered his body and sharpened his mind, so that thought and action have become almost as one. Though he chooses to enter into violence only as a last resort, the grace and speed of his Highlander blade ensures resolution is always swift. As one of the last living practitioners of the Ionian art of wuju, Yi has devoted his life to continuing the legacy of his people—scrutinizing potential new disciples with the Seven Lenses of Insight to identify the most worthy among them.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/MasterYi.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/0/09/Master_Yi_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/e/ef/MasterYi_Select.ogg"));
        legendMap.put(assassins,assassinList);

        //Marksmen
        List<Legend> marksmenList = new ArrayList<>();
        marksmenList.add( new Legend( "Jinx", 1, "THE LOOSE CANNON",
            "A manic and impulsive criminal from Zaun, Jinx lives to wreak havoc without care for the consequences. With an arsenal of deadly weapons, she unleashes the loudest blasts and brightest explosions to leave a trail of mayhem and panic in her wake. Jinx despises boredom, and gleefully brings her own chaotic brand of pandemonium wherever she goes.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Jinx.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/2/21/Jinx_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/1/1b/Jinx.attack06.ogg"));
        marksmenList.add( new Legend( "Twitch", 1, "THE PLAGUE RAT",
            "A Zaunite plague rat by birth, but a connoisseur of filth by passion, Twitch is not afraid to get his paws dirty. Aiming a chem-powered crossbow at the gilded heart of Piltover, he has vowed to show those in the city above just how filthy they really are. Always a sneaky sneak, when he's not rooting around in the Sump, he's digging deep into other people's garbage for discarded treasures… and perhaps a moldy sandwich.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Twitch.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/9/9a/Twitch_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/f/fd/Twitch.attack20.ogg"));
        marksmenList.add( new Legend( "Ashe", 2, "THE FROST ARCHER",
            "Iceborn warmother of the Avarosan profileicon Avarosan tribe, Ashe commands the most populous horde in the north. Stoic, intelligent, and idealistic, yet uncomfortable with her role as leader, she taps into the ancestral magics of her lineage to wield a bow of True Ice. With her people's belief that she is the mythological hero Avarosa reincarnated, Ashe hopes to unify the Freljord once more by retaking their ancient, tribal lands.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Ashe.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/c/c0/Ashe_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/6/60/Ashe.attack05.ogg"));
        marksmenList.add( new Legend( "Varus", 2, "THE ARROW OF RETRIBUTION",
            "One of the ancient race of darkin, Varus was a deadly killer who loved to torment his foes with arrows, driving them to insanity before closing for the kill. Possessed of wondrous beauty, Varus was imprisoned at the end of the Darkin War, but escaped, centuries later, in the remade flesh of two Ionian hunters. The two men had unwittingly released Varus and now bear the bow containing his bound essence. Varus now hunts those who trapped him in order to enact his brutal vengeance, but the souls bound within him fight him every step of the way.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Varus.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/1/16/Varus_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/e/e2/Varus.attack3.ogg"));
        legendMap.put(marksmen,marksmenList);

        //Supports
        List<Legend> supportList = new ArrayList<>();
        supportList.add( new Legend( "Darius", 0,"THE HAND OF NOXUS",
            "There is no greater symbol of Noxian might than Darius, the nation's most feared and battle-hardened leader. Rising from humble origins to become the Hand of Noxus, he cleaves through the empire's enemies—many of them Noxians themselves. Knowing that he never doubts his cause is just, and never hesitates once his axe is raised, those who stand against the commander of the Trifarian Legion can expect no mercy.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Darius.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/1/18/Darius_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/e/e0/Darius.attack2.ogg"));
        supportList.add( new Legend( "Janna", 0,"THE STORM'S FURY",
            "Armed with the power of Runeterra's gales, Janna is a mysterious, elemental wind spirit who protects the dispossessed of Zaun. Some believe she was brought into existence by the pleas of Runeterra's sailors who prayed for fair winds as they navigated treacherous waters and braved rough tempests. Her favor and protection has since been called into the depths of Zaun, where Janna has become a beacon of hope to those in need. No one knows where or when she will appear, but more often than not, she's come to help.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Janna.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/c/c9/Janna_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/4/47/Janna.attack5.ogg"));
        supportList.add( new Legend( "Thresh", 2,"THE CHAIN WARDEN",
            "Sadistic and cunning, Thresh is an ambitious and restless spirit of the Shadow Isles. Once the custodian of countless arcane secrets, he sought a power greater than life or death, and now sustains himself by tormenting and breaking others with slow, excruciating inventiveness. His victims suffer far beyond their brief mortal coil as Thresh wreaks agony upon their souls, imprisoning them in his unholy lantern to torture for all eternity.",
            "http://ddragon.leagueoflegends.com/cdn/8.6.1/img/champion/Thresh.png",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/f/f3/Thresh_OriginalSkin.jpg",
            "https://vignette.wikia.nocookie.net/leagueoflegends/images/a/a0/Thresh.attack3.ogg"));
        legendMap.put(supports,supportList);

        return legendMap;
    }

}
