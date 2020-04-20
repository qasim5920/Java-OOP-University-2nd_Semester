package Sp19_bse_004;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

public class StoryMode extends Application implements EventHandler<ActionEvent> {
   static ArrayList<Pokemon> list = new ArrayList<>();
    static ArrayList<Pokemon> myList= new ArrayList<>();
   Stage window;
   Scene scene;
  Button button;
  ListView<String> listView;
    public static void main(String []args)  throws QasimException {
        Scanner input = new Scanner(System.in);


         launch(args);
        // ........................................
        //making objects for all 1st gen Pokemons
        // ........................................

        Pokemon obj1 = new Pokemon(1,100,400,Type.Grass,"Bulbasaur",25);
        Pokemon obj2 = new Pokemon(2,100,400,Type.Grass,"Ivysaur",25);
        Pokemon obj3 = new Pokemon(3,100,400,Type.Grass,"Venusaur",25);
        Pokemon obj4 = new Pokemon(4,100,400,Type.Fire,"Charmander",25);
        Pokemon obj5 = new Pokemon(5,100,400,Type.Fire,"Charmeleon",25);
        Pokemon obj6 = new Pokemon(6,100,400,Type.Fire,"Charizard",25);
        Pokemon obj7 = new Pokemon(7,100,400,Type.Water,"Squirtle",25);
        Pokemon obj8 = new Pokemon(8,100,400,Type.Water,"Wartortle",25);
        Pokemon obj9 = new Pokemon(9,100,400,Type.Water,"Blastoise",25);
        Pokemon obj10 = new Pokemon(10,100,400,Type.Bug,"Caterpie",25);
        Pokemon obj11 = new Pokemon(11,100,400,Type.Bug,"Metapod",25);
        Pokemon obj12 = new Pokemon(12,100,400,Type.Bug,"Butterfree",25);
        Pokemon obj13 = new Pokemon(13,100,400,Type.Bug,"Weedle",25);
        Pokemon obj14 = new Pokemon(14,100,400,Type.Bug,"Kakuna",25);
        Pokemon obj15 = new Pokemon(15,100,400,Type.Bug,"Beedrill",25);
        Pokemon obj16 = new Pokemon(16,100,400,Type.Flying,"Pidgey",25);
        Pokemon obj17 = new Pokemon(17,100,400,Type.Flying,"Pidgeotto",25);
        Pokemon obj18 = new Pokemon(18,100,400,Type.Flying,"pidgeot",25);
        Pokemon obj19 = new Pokemon(19,100,400,Type.Normal,"Rattata",25);
        Pokemon obj20 = new Pokemon(20,100,400,Type.Normal,"Raticate",25);
        Pokemon obj21 = new Pokemon(21,100,400,Type.Flying,"Spearow",25);
        Pokemon obj22 = new Pokemon(22,100,400,Type.Flying,"Fearow",25);
        Pokemon obj23 = new Pokemon(23,100,400,Type.Poison,"Ekans",25);
        Pokemon obj24 = new Pokemon(24,100,400,Type.Poison,"Arbok",25);
        Pokemon obj25 = new Pokemon(25,100,400,Type.Electric,"Pikachu",25);
        Pokemon obj26 = new Pokemon(26,100,400,Type.Electric,"Raichu",25);
        Pokemon obj27 = new Pokemon(27,100,400,Type.Ground,"Sandshrew",25);
        Pokemon obj28 = new Pokemon(28,100,400,Type.Ground,"Sandslash",25);
        Pokemon obj29 = new Pokemon(29,100,400,Type.Poison,"Nidoran_F",25);
        Pokemon obj30 = new Pokemon(30,100,400,Type.Poison,"Nidorina",25);
        Pokemon obj31 = new Pokemon(31,100,400,Type.Ground,"Nidoqueen",25);
        Pokemon obj32 = new Pokemon(32,100,400,Type.Poison,"Nidoran_M",25);
        Pokemon obj33 = new Pokemon(33,100,400,Type.Poison,"Nidorino",25);
        Pokemon obj34 = new Pokemon(34,100,400,Type.Ground,"Nidoking",25);
        Pokemon obj35 = new Pokemon(35,100,400,Type.Fairy,"Clefairy",25);
        Pokemon obj36 = new Pokemon(36,100,400,Type.Fairy,"Clefable",25);
        Pokemon obj37 = new Pokemon(37,100,400,Type.Fire,"Vulpix",25);
        Pokemon obj38 = new Pokemon(38,100,400,Type.Fire,"Ninetales",25);
        Pokemon obj39 = new Pokemon(39,100,400,Type.Normal,"Jigglypuff",25);
        Pokemon obj40 = new Pokemon(40,100,400,Type.Normal,"Wigglytuff",25);
        Pokemon obj41 = new Pokemon(41,100,400,Type.Poison,"Zubat",25);
        Pokemon obj42 = new Pokemon(42,100,400,Type.Poison,"Golbat",25);
        Pokemon obj43 = new Pokemon(43,100,400,Type.Grass,"Oddish",25);
        Pokemon obj44 = new Pokemon(44,100,400,Type.Grass,"Gloom",25);
        Pokemon obj45 = new Pokemon(45,100,400,Type.Grass,"Vileplume",25);
        Pokemon obj46 = new Pokemon(46,100,400,Type.Bug,"Paras",25);
        Pokemon obj47 = new Pokemon(47,100,400,Type.Bug,"Parasect",25);
        Pokemon obj48 = new Pokemon(48,100,400,Type.Bug,"Venonat",25);
        Pokemon obj49 = new Pokemon(49,100,400,Type.Bug,"Venomoth",25);
        Pokemon obj50 = new Pokemon(50,100,400,Type.Ground,"Diglett",25);
        Pokemon obj51 = new Pokemon(51,100,400,Type.Ground,"Dugtrio",25);
        Pokemon obj52 = new Pokemon(52,100,400,Type.Normal,"Meowth",25);
        Pokemon obj53 = new Pokemon(53,100,400,Type.Normal,"Persian",25);
        Pokemon obj54 = new Pokemon(54,100,400,Type.Water,"Psyduck",25);
        Pokemon obj55 = new Pokemon(55,100,400,Type.Water,"Golduck",25);
        Pokemon obj56 = new Pokemon(56,100,400,Type.Fighting,"Mankey",25);
        Pokemon obj57 = new Pokemon(57,100,400,Type.Fighting,"Primeape",25);
        Pokemon obj58 = new Pokemon(58,100,400,Type.Fire,"Growlithe",25);
        Pokemon obj59 = new Pokemon(59,100,400,Type.Fire,"Arcanine",25);
        Pokemon obj60 = new Pokemon(60,100,400,Type.Water,"Poliwag",25);
        Pokemon obj61 = new Pokemon(61,100,400,Type.Water,"Poliwhirl",25);
        Pokemon obj62 = new Pokemon(62,100,400,Type.Water,"Poliwrath",25);
        Pokemon obj63 = new Pokemon(63,100,400,Type.Psychic,"Abra",25);
        Pokemon obj64 = new Pokemon(64,100,400,Type.Psychic,"Kadabra",25);
        Pokemon obj65 = new Pokemon(65,100,400,Type.Psychic,"Alakazam",25);
        Pokemon obj66 = new Pokemon(66,100,400,Type.Fighting,"Machop",25);
        Pokemon obj67 = new Pokemon(67,100,400,Type.Fighting,"Machoke",25);
        Pokemon obj68 = new Pokemon(68,100,400,Type.Fighting,"Machamp",25);
        Pokemon obj69 = new Pokemon(69,100,400,Type.Grass,"Bellsprout",25);
        Pokemon obj70 = new Pokemon(70,100,400,Type.Grass,"Weepinbell",25);
        Pokemon obj71 = new Pokemon(71,100,400,Type.Grass,"Victreebel",25);
        Pokemon obj72 = new Pokemon(72,100,400,Type.Water,"Tentacool",25);
        Pokemon obj73 = new Pokemon(73,100,400,Type.Water,"Tentacruel",25);
        Pokemon obj74 = new Pokemon(74,100,400,Type.Rock,"Geodude",25);
        Pokemon obj75 = new Pokemon(75,100,400,Type.Rock,"Graveler",25);
        Pokemon obj76 = new Pokemon(76,100,400,Type.Rock,"Golem",25);
        Pokemon obj77 = new Pokemon(77,100,400,Type.Fire,"Ponyta",25);
        Pokemon obj78 = new Pokemon(78,100,400,Type.Fire,"Rapidash",25);
        Pokemon obj79 = new Pokemon(79,100,400,Type.Psychic,"Slowpoke",25);
        Pokemon obj80 = new Pokemon(80,100,400,Type.Psychic,"Slowbro",25);
        Pokemon obj81 = new Pokemon(81,100,400,Type.Electric,"Magnemite",25);
        Pokemon obj82 = new Pokemon(82,100,400,Type.Electric,"Magneton",25);
        Pokemon obj83 = new Pokemon(83,100,400,Type.Normal,"Farfetchd",25);
        Pokemon obj84 = new Pokemon(84,100,400,Type.Normal,"Doduo",25);
        Pokemon obj85 = new Pokemon(85,100,400,Type.Normal,"Dodrio",25);
        Pokemon obj86 = new Pokemon(86,100,400,Type.Water,"Seel",25);
        Pokemon obj87 = new Pokemon(87,100,400,Type.Ice,"Dewgong",25);
        Pokemon obj88 = new Pokemon(88,100,400,Type.Poison,"Grimer",25);
        Pokemon obj89 = new Pokemon(89,100,400,Type.Poison,"Muk",25);
        Pokemon obj90 = new Pokemon(90,100,400,Type.Water,"Shellder",25);
        Pokemon obj91 = new Pokemon(91,100,400,Type.Ice,"Cloyster",25);
        Pokemon obj92 = new Pokemon(92,100,400,Type.Ghost,"Gastly",25);
        Pokemon obj93 = new Pokemon(93,100,400,Type.Ghost,"Haunter",25);
        Pokemon obj94 = new Pokemon(94,100,400,Type.Ghost,"Gengar",25);
        Pokemon obj95 = new Pokemon(95,100,400,Type.Rock,"Onix",25);
        Pokemon obj96 = new Pokemon(96,100,400,Type.Psychic,"Drowzee",25);
        Pokemon obj97 = new Pokemon(97,100,400,Type.Psychic,"Hypno",25);
        Pokemon obj98 = new Pokemon(98,100,400,Type.Water,"Krabby",25);
        Pokemon obj99 = new Pokemon(99,100,400,Type.Water,"Kingler",25);
        Pokemon obj100 = new Pokemon(100,100,400,Type.Electric,"Voltorb",25);
        Pokemon obj101 = new Pokemon(101,100,400,Type.Electric,"Electrode",25);
        Pokemon obj102 = new Pokemon(102,100,400,Type.Grass,"Exeggcute",25);
        Pokemon obj103 = new Pokemon(103,100,400,Type.Grass,"Exeggutor",25);
        Pokemon obj104 = new Pokemon(104,100,400,Type.Ground,"Cubone",25);
        Pokemon obj105 = new Pokemon(105,100,400,Type.Ground,"Marowak",25);
        Pokemon obj106 = new Pokemon(106,100,400,Type.Fighting,"Hitmonlee",25);
        Pokemon obj107 = new Pokemon(107,100,400,Type.Fighting,"Hitmonchan",25);
        Pokemon obj108 = new Pokemon(108,100,400,Type.Normal,"Lickitung",25);
        Pokemon obj109 = new Pokemon(109,100,400,Type.Poison,"Koffing",25);
        Pokemon obj110 = new Pokemon(110,100,400,Type.Poison,"Weezing",25);
        Pokemon obj111 = new Pokemon(111,100,400,Type.Ground,"Rhyhorn",25);
        Pokemon obj112 = new Pokemon(112,100,400,Type.Ground,"Rhydon",25);
        Pokemon obj113 = new Pokemon(113,100,400,Type.Normal,"Chansey",25);
        Pokemon obj114 = new Pokemon(114,100,400,Type.Grass,"Tangela",25);
        Pokemon obj115 = new Pokemon(115,100,400,Type.Normal,"Kangaskhan",25);
        Pokemon obj116 = new Pokemon(116,100,400,Type.Water,"Horsea",25);
        Pokemon obj117 = new Pokemon(117,100,400,Type.Water,"Seadra",25);
        Pokemon obj118 = new Pokemon(118,100,400,Type.Water,"Goldeen",25);
        Pokemon obj119 = new Pokemon(119,100,400,Type.Water,"Seaking",25);
        Pokemon obj120 = new Pokemon(120,100,400,Type.Water,"Staryu",25);
        Pokemon obj121 = new Pokemon(121,100,400,Type.Water,"Starmie",25);
        Pokemon obj122 = new Pokemon(122,100,400,Type.Psychic,"Mr. Mime",25);
        Pokemon obj123 = new Pokemon(123,100,400,Type.Bug,"Scyther",25);
        Pokemon obj124 = new Pokemon(124,100,400,Type.Ice,"Jynx",25);
        Pokemon obj125 = new Pokemon(125,100,400,Type.Electric,"Electabuzz",25);
        Pokemon obj126 = new Pokemon(126,100,400,Type.Fire,"Magmar",25);
        Pokemon obj127 = new Pokemon(127,100,400,Type.Bug,"Pinsir",25);
        Pokemon obj128 = new Pokemon(128,100,400,Type.Normal,"Tauros",25);
        Pokemon obj129 = new Pokemon(129,100,400,Type.Water,"Magikarp",25);
        Pokemon obj130 = new Pokemon(130,100,400,Type.Water,"Gyarados",25);
        Pokemon obj131 = new Pokemon(131,100,400,Type.Ice,"Lapras",25);
        Pokemon obj132 = new Pokemon(132,100,400,Type.Normal,"Ditto",25);
        Pokemon obj133 = new Pokemon(133,100,400,Type.Normal,"Eevee",25);
        Pokemon obj134 = new Pokemon(134,100,400,Type.Water,"Vaporeon",25);
        Pokemon obj135 = new Pokemon(135,100,400,Type.Electric,"Jolteon",25);
        Pokemon obj136 = new Pokemon(136,100,400,Type.Fire,"Flareon",25);
        Pokemon obj137 = new Pokemon(137,100,400,Type.Normal,"Porygon",25);
        Pokemon obj138 = new Pokemon(138,100,400,Type.Rock,"Omanyte",25);
        Pokemon obj139 = new Pokemon(139,100,400,Type.Rock,"Omastar",25);
        Pokemon obj140 = new Pokemon(140,100,400,Type.Rock,"Kabuto",25);
        Pokemon obj141 = new Pokemon(141,100,400,Type.Rock,"Kabutops",25);
        Pokemon obj142 = new Pokemon(142,100,400,Type.Rock,"Aerodactyl",25);
        Pokemon obj143 = new Pokemon(143,100,400,Type.Normal,"Snorlax",25);
        Pokemon obj144 = new Pokemon(144,100,430,Type.Ice,"Articuno",35);
        Pokemon obj145 = new Pokemon(145,100,430,Type.Electric,"Zapdos",35);
        Pokemon obj146 = new Pokemon(146,100,430,Type.Fire,"Moltres",35);
        Pokemon obj147 = new Pokemon(147,100,400,Type.Dragon,"Dratini",25);
        Pokemon obj148 = new Pokemon(148,100,400,Type.Dragon,"Dragonair",25);
        Pokemon obj149 = new Pokemon(149,100,430,Type.Dragon,"Dragonite",35);
        Pokemon obj150 = new Pokemon(150,100,460,Type.Psychic,"Mewtwo",45);
        Pokemon obj151 = new Pokemon(151,100,430,Type.Psychic,"Mew",35);
        //..................................
        //just to show exception handling
        //..................................
     //   try{ Pokemon obj152 = new Pokemon(152,100,430,Type.Psychic,"Ali",35);
    //    myList.add(obj152)}

     //   catch (QasimException e){
       //     System.out.println(e.getMessage());
       // }
        //.......................................
        //Putting all pokemon objects in arrayList
        //.......................................

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        list.add(obj6);
        list.add(obj7);
        list.add(obj8);
        list.add(obj9);
        list.add(obj10);
        list.add(obj11);
        list.add(obj12);
        list.add(obj13);
        list.add(obj14);
        list.add(obj15);
        list.add(obj16);
        list.add(obj17);
        list.add(obj18);
        list.add(obj19);
        list.add(obj20);
        list.add(obj20);
        list.add(obj21);
        list.add(obj22);
        list.add(obj23);
        list.add(obj24);
        list.add(obj25);
        list.add(obj26);
        list.add(obj27);
        list.add(obj28);
        list.add(obj29);
        list.add(obj30);
        list.add(obj31);
        list.add(obj32);
        list.add(obj33);
        list.add(obj34);
        list.add(obj35);
        list.add(obj36);
        list.add(obj37);
        list.add(obj38);
        list.add(obj39);
        list.add(obj40);
        list.add(obj41);
        list.add(obj42);
        list.add(obj43);
        list.add(obj44);
        list.add(obj45);
        list.add(obj46);
        list.add(obj47);
        list.add(obj48);
        list.add(obj49);
        list.add(obj50);
        list.add(obj51);
        list.add(obj52);
        list.add(obj53);
        list.add(obj54);
        list.add(obj55);
        list.add(obj56);
        list.add(obj57);
        list.add(obj58);
        list.add(obj59);
        list.add(obj60);
        list.add(obj61);
        list.add(obj62);
        list.add(obj63);
        list.add(obj64);
        list.add(obj65);
        list.add(obj66);
        list.add(obj67);
        list.add(obj68);
        list.add(obj69);
        list.add(obj70);
        list.add(obj71);
        list.add(obj72);
        list.add(obj73);
        list.add(obj74);
        list.add(obj75);
        list.add(obj76);
        list.add(obj77);
        list.add(obj78);
        list.add(obj79);
        list.add(obj80);
        list.add(obj81);
        list.add(obj82);
        list.add(obj83);
        list.add(obj84);
        list.add(obj85);
        list.add(obj86);
        list.add(obj87);
        list.add(obj88);
        list.add(obj89);
        list.add(obj90);
        list.add(obj91);
        list.add(obj92);
        list.add(obj93);
        list.add(obj94);
        list.add(obj95);
        list.add(obj96);
        list.add(obj97);
        list.add(obj98);
        list.add(obj99);
        list.add(obj100);
        list.add(obj101);
        list.add(obj102);
        list.add(obj103);
        list.add(obj104);
        list.add(obj105);
        list.add(obj106);
        list.add(obj107);
        list.add(obj108);
        list.add(obj109);
        list.add(obj110);
        list.add(obj111);
        list.add(obj112);
        list.add(obj113);
        list.add(obj114);
        list.add(obj115);
        list.add(obj116);
        list.add(obj117);
        list.add(obj118);
        list.add(obj119);
        list.add(obj120);
        list.add(obj121);
        list.add(obj122);
        list.add(obj123);
        list.add(obj124);
        list.add(obj125);
        list.add(obj126);
        list.add(obj127);
        list.add(obj128);
        list.add(obj129);
        list.add(obj130);
        list.add(obj131);
        list.add(obj132);
        list.add(obj133);
        list.add(obj134);
        list.add(obj135);
        list.add(obj136);
        list.add(obj137);
        list.add(obj138);
        list.add(obj139);
        list.add(obj140);
        list.add(obj141);
        list.add(obj142);
        list.add(obj143);
        list.add(obj144);
        list.add(obj145);
        list.add(obj146);
        list.add(obj147);
        list.add(obj148);
        list.add(obj149);
        list.add(obj150);
        list.add(obj151);

        //.................................
        // player Pokemon list
        //.................................
        myList.add(obj3);
        myList.add(obj6);
        myList.add(obj9);
        myList.add(obj25);
        myList.add(obj94);
        myList.add(obj143);



        //.................................
        // add all objects to database
        //.................................
        addPokemon(obj1);
        addPokemon(obj2);
        addPokemon(obj3);
        addPokemon(obj4);
        addPokemon(obj5);
        addPokemon(obj6);
        addPokemon(obj7);
        addPokemon(obj8);
        addPokemon(obj9);
        addPokemon(obj10);
        addPokemon(obj11);
        addPokemon(obj12);
        addPokemon(obj13);
        addPokemon(obj14);
        addPokemon(obj15);
        addPokemon(obj16);
        addPokemon(obj17);
        addPokemon(obj18);
        addPokemon(obj19);
        addPokemon(obj20);
        addPokemon(obj20);
        addPokemon(obj21);
        addPokemon(obj22);
        addPokemon(obj23);
        addPokemon(obj24);
        addPokemon(obj25);
        addPokemon(obj26);
        addPokemon(obj27);
        addPokemon(obj28);
        addPokemon(obj29);
        addPokemon(obj30);
        addPokemon(obj31);
        addPokemon(obj32);
        addPokemon(obj33);
        addPokemon(obj34);
        addPokemon(obj35);
        addPokemon(obj36);
        addPokemon(obj37);
        addPokemon(obj38);
        addPokemon(obj39);
        addPokemon(obj40);
        addPokemon(obj41);
        addPokemon(obj42);
        addPokemon(obj43);
        addPokemon(obj44);
        addPokemon(obj45);
        addPokemon(obj46);
        addPokemon(obj47);
        addPokemon(obj48);
        addPokemon(obj49);
        addPokemon(obj50);
        addPokemon(obj51);
        addPokemon(obj52);
        addPokemon(obj53);
        addPokemon(obj54);
        addPokemon(obj55);
        addPokemon(obj56);
        addPokemon(obj57);
        addPokemon(obj58);
        addPokemon(obj59);
        addPokemon(obj60);
        addPokemon(obj61);
        addPokemon(obj62);
        addPokemon(obj63);
        addPokemon(obj64);
        addPokemon(obj65);
        addPokemon(obj66);
        addPokemon(obj67);
        addPokemon(obj68);
        addPokemon(obj69);
        addPokemon(obj70);
        addPokemon(obj71);
        addPokemon(obj72);
        addPokemon(obj73);
        addPokemon(obj74);
        addPokemon(obj75);
        addPokemon(obj76);
        addPokemon(obj77);
        addPokemon(obj78);
        addPokemon(obj79);
        addPokemon(obj80);
        addPokemon(obj81);
        addPokemon(obj82);
        addPokemon(obj83);
        addPokemon(obj84);
        addPokemon(obj85);
        addPokemon(obj86);
        addPokemon(obj87);
        addPokemon(obj88);
        addPokemon(obj89);
        addPokemon(obj90);
        addPokemon(obj91);
        addPokemon(obj92);
        addPokemon(obj93);
        addPokemon(obj94);
        addPokemon(obj95);
        addPokemon(obj96);
        addPokemon(obj97);
        addPokemon(obj98);
        addPokemon(obj99);
        addPokemon(obj100);
        addPokemon(obj101);
        addPokemon(obj102);
        addPokemon(obj103);
        addPokemon(obj104);
        addPokemon(obj105);
        addPokemon(obj106);
        addPokemon(obj107);
        addPokemon(obj108);
        addPokemon(obj109);
        addPokemon(obj110);
        addPokemon(obj111);
        addPokemon(obj112);
        addPokemon(obj113);
        addPokemon(obj114);
        addPokemon(obj115);
        addPokemon(obj116);
        addPokemon(obj117);
        addPokemon(obj118);
        addPokemon(obj119);
        addPokemon(obj120);
        addPokemon(obj121);
        addPokemon(obj122);
        addPokemon(obj123);
        addPokemon(obj124);
        addPokemon(obj125);
        addPokemon(obj126);
        addPokemon(obj127);
        addPokemon(obj128);
        addPokemon(obj129);
        addPokemon(obj130);
        addPokemon(obj131);
        addPokemon(obj132);
        addPokemon(obj133);
        addPokemon(obj134);
        addPokemon(obj135);
        addPokemon(obj136);
        addPokemon(obj137);
        addPokemon(obj138);
        addPokemon(obj139);
        addPokemon(obj140);
        addPokemon(obj141);
        addPokemon(obj142);
        addPokemon(obj143);
        addPokemon(obj144);
        addPokemon(obj145);
        addPokemon(obj146);
        addPokemon(obj147);
        addPokemon(obj148);
        addPokemon(obj149);
        addPokemon(obj150);
        addPokemon(obj151);
        //.................................
        //adding pokemon to my team sql
        //.................................
       addTeam(obj6);
       addTeam(obj25);
       addTeam(obj9);
       addTeam(obj94);
        addTeam(obj143);
        addTeam(obj3);
        //.................................
        // Menu
        //.................................

        About A = new About();
        System.out.println("press 1 to find about developer");
        System.out.println("press 2 to find about developer");
        System.out.println("press 3 to play single battle");
        System.out.println("press 4 to play Boss battle");
        System.out.println("press 5 to play Gym battler");
        System.out.println("press 6 to see all pokemons");
        System.out.println("press 7 to see team");

        int choice = input.nextInt();
        if (choice == 1) {
            A.AboutMe();
        } else if (choice == 2) {
            A.AboutGame();
        } else if (choice == 3) {
            Battle b = new SingleBattle();
            b.battle();
        } else if (choice == 4) {
            Battle b = new BossBattle();
            b.battle();
        } else if (choice == 5) {
            Battle b = new GymBattle();
            b.battle();
        } else if (choice == 6) {
            displayPokemon();
        }else if (choice == 7) {
            displayTeam();
        }
        else { System.out.println("invalid entry");}

        //.................................
        //Dev options Do not use
        //.................................
       // deletePokemon(obj151);
       // updatePokemon(obj6);
    }
    public static  void addPokemon(Pokemon pokemon){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pokemon", "root", "Titan1999");
            statement = connection.createStatement();
            statement.executeUpdate(String.format("INSERT INTO pokemon (id, lvl, health, type, name,attack) VALUES (%d, %d,%d,'%s','%s',%d)",
                    pokemon.getId(),pokemon.getLvl() ,pokemon.getHealth(), pokemon.getType(), pokemon.getName(),pokemon.getAttack()));

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static  void addTeam(Pokemon team){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pokemon", "root", "Titan1999");
            statement = connection.createStatement();
           statement.executeUpdate(String.format("INSERT INTO team (id, lvl, health, type, name,attack) VALUES (%d, %d,%d,'%s','%s',%d)",
                   team.getId(),team.getLvl() ,team.getHealth(), team.getType(), team.getName(),team.getAttack()));

        }catch(SQLException e){
            System.out.println(e.getMessage() );
        }
    }

    public static  void displayTeam(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pokemon", "root", "Titan1999");
            statement = connection.createStatement();
            resultSet =  statement.executeQuery("SELECT * FROM team");
            while(resultSet.next()){
                System.out.println("...........................................");
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getInt("lvl"));
                System.out.println(resultSet.getInt("health"));
                System.out.println(resultSet.getString("type"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("attack"));
                System.out.println("...........................................");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static  void displayPokemon(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pokemon", "root", "Titan1999");
            statement = connection.createStatement();
            resultSet =  statement.executeQuery("SELECT * FROM pokemon");
            while(resultSet.next()){
                System.out.println("...........................................");
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getInt("lvl"));
                System.out.println(resultSet.getInt("health"));
                System.out.println(resultSet.getString("type"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("attack"));
                System.out.println("...........................................");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static  void deletePokemon(Pokemon pokemon){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pokemon", "root", "Titan1999");
            statement = connection.createStatement();
            statement.executeUpdate(String.format("DELETE FROM pokemon WHERE id ="+pokemon.getId()));

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static  void updatePokemon(Pokemon pokemon){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pokemon", "root", "Titan1999");
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE pokemon SET   name='Charizard' WHERE id =6 ");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
    window=primaryStage;
    window.setTitle(" favorite pokemon");
    button = new Button("submit");

   listView= new ListView<>();
   listView.getItems().addAll("Bulbasaur","Charizard","Pikachu","Mew","Mewtwo","Butterfree","Weedle","Venusaur","Arbok","Seadra");
   listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

   button.setOnAction(event -> buttonClicked());


    VBox layout= new VBox(10);
    layout.setPadding(new Insets(20,20,20,20));
    layout.getChildren().addAll(listView,button);
     scene = new Scene(layout,300,250);
     window.setScene(scene);
     window.show();
    }


    private void buttonClicked(){
        String message = "";
        ObservableList<String> pokemon;
        pokemon = listView.getSelectionModel().getSelectedItems();
        for(String p:pokemon){
          message+= p+"\n";
            System.out.println(message);
        }
    }



    @Override
    public void handle(ActionEvent event) {

    }


    }
