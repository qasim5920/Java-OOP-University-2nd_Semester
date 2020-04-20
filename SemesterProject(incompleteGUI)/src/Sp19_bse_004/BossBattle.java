package Sp19_bse_004;

import java.util.*;

public class BossBattle extends Battle {

    @Override
    public void battle() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("choose the correct pokemon from your team to win the battle");
        System.out.println("press 1 to select" + StoryMode.myList.get(0));
        System.out.println("press 2 to select" + StoryMode.myList.get(1));
        System.out.println("press 3 to select" + StoryMode.myList.get(2));
        System.out.println("press 4 to select" + StoryMode.myList.get(3));
        System.out.println("press 5 to select" + StoryMode.myList.get(4));
        System.out.println("press 6 to select" + StoryMode.myList.get(5));

        int r = random.nextInt(2);
        int i = 0;
        int a = scanner.nextInt();
        System.out.println("your opponent is " + StoryMode.list.get(143));
        if (a == 1) {
            System.out.println("you choosed" + StoryMode.myList.get(0));
            if (r == 0) {
                System.out.println(StoryMode.myList.get(0) + "has faded you Lost");
            }
            if (r == 1) {
                System.out.println(StoryMode.list.get(143) + "has faded you won");
                i += 1;
            }
        }
        if (a == 2) {
            System.out.println("you choosed" + StoryMode.myList.get(1));

            System.out.println(StoryMode.list.get(143) + "has faded you won");
            i += 1;

        }
        if (a == 3) {
            System.out.println("you choosed" + StoryMode.myList.get(2));
            System.out.println(StoryMode.list.get(143) + "has faded you won");
            i += 1;
        }
        if (a == 4) {
            System.out.println("you choosed" + StoryMode.myList.get(3));
            if (r == 0) {
                System.out.println(StoryMode.myList.get(3) + "has faded you Lost");
            }
            if (r == 1) {
                System.out.println(StoryMode.list.get(143) + "has faded you won");
                i += 1;
            }
        }
        if (a == 5) {
            System.out.println("you choosed" + StoryMode.myList.get(4));
            if (r == 0) {
                System.out.println(StoryMode.myList.get(4) + "has faded you Lost");
            }
            if (r == 1) {
                System.out.println(StoryMode.list.get(143) + "has faded you won");
                i += 1;
            }
        }
        if (a == 6) {
            System.out.println("you choosed" + StoryMode.myList.get(5));
            if (r == 0) {
                System.out.println(StoryMode.myList.get(5) + "has faded you Lost");
            }
            if (r == 1) {
                System.out.println(StoryMode.list.get(143) + "has faded you won");
                i += 1;
            }
        }
        //level 2
        if (i == 1) {
            System.out.println("choose the correct pokemon from your team to win the battle");
            System.out.println("press 1 to select" + StoryMode.myList.get(0));
            System.out.println("press 2 to select" + StoryMode.myList.get(1));
            System.out.println("press 3 to select" + StoryMode.myList.get(2));
            System.out.println("press 4 to select" + StoryMode.myList.get(3));
            System.out.println("press 5 to select" + StoryMode.myList.get(4));
            System.out.println("press 6 to select" + StoryMode.myList.get(5));
            System.out.println("your opponent is " + StoryMode.list.get(144));
            a = scanner.nextInt();
            if (a == 1) {
                System.out.println("you choosed" + StoryMode.myList.get(0));
                if (r == 0) {
                    System.out.println(StoryMode.myList.get(0) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(144) + "has faded you won");
                    i += 1;
                }
            }
            if (a == 2) {
                System.out.println("you choosed" + StoryMode.myList.get(1));

                if (r == 0) {
                    System.out.println(StoryMode.myList.get(1) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(144) + "has faded you won");
                    i += 1;
                }

            }
            if (a == 3) {
                System.out.println("you choosed" + StoryMode.myList.get(2));
                System.out.println(StoryMode.myList.get(2) + "has faded you Lost");
            }
            if (a == 4) {
                System.out.println("you choosed" + StoryMode.myList.get(3));
                if (r == 0) {
                    System.out.println(StoryMode.myList.get(3) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(144) + "has faded you won");
                    i += 1;
                }
            }
            if (a == 5) {
                System.out.println("you choosed" + StoryMode.myList.get(4));

                    System.out.println(StoryMode.list.get(144) + "has faded you won");
                    i += 1;

            }
            if (a == 6) {
                System.out.println("you choosed" + StoryMode.myList.get(5));
                if (r == 0) {
                    System.out.println(StoryMode.myList.get(5) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(144) + "has faded you won");
                    i += 1;
                }
            }

        }

        //level3
        if (i == 2) {

            System.out.println("choose the correct pokemon from your team to win the battle");
            System.out.println("press 1 to select" + StoryMode.myList.get(0));
            System.out.println("press 2 to select" + StoryMode.myList.get(1));
            System.out.println("press 3 to select" + StoryMode.myList.get(2));
            System.out.println("press 4 to select" + StoryMode.myList.get(3));
            System.out.println("press 5 to select" + StoryMode.myList.get(4));
            System.out.println("press 6 to select" + StoryMode.myList.get(5));
            System.out.println("your opponent is " + StoryMode.list.get(145));
            a = scanner.nextInt();
            if (a == 1) {
                System.out.println("you choosed" + StoryMode.myList.get(0));
                System.out.println(StoryMode.list.get(0) + "has faded you lost");

            }
            if (a == 2) {
                System.out.println("you choosed" + StoryMode.myList.get(1));

                if (r == 0) {
                    System.out.println(StoryMode.myList.get(1) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(145) + "has faded you won");
                    i += 1;
                }
            }


            if (a == 3) {
                System.out.println("you choosed" + StoryMode.myList.get(2));

                    System.out.println(StoryMode.list.get(145) + "has faded you won");
                    i += 1;

            }
            if (a == 4) {
                System.out.println("you choosed" + StoryMode.myList.get(3));
                if (r == 0) {
                    System.out.println(StoryMode.myList.get(3) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(145) + "has faded you won");
                    i += 1;
                }
            }
            if (a == 5) {
                System.out.println("you choosed" + StoryMode.myList.get(4));
                if (r == 0) {
                    System.out.println(StoryMode.myList.get(4) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(145) + "has faded you won");
                    i += 1;
                }
            }
            if (a == 6) {
                System.out.println("you choosed" + StoryMode.myList.get(5));
                if (r == 0) {
                    System.out.println(StoryMode.myList.get(5) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(145) + "has faded you won");
                    i += 1;
                }
            }

        }
        //level4
        if (i == 2) {

            System.out.println("choose the correct pokemon from your team to win the battle");
            System.out.println("press 1 to select" + StoryMode.myList.get(0));
            System.out.println("press 2 to select" + StoryMode.myList.get(1));
            System.out.println("press 3 to select" + StoryMode.myList.get(2));
            System.out.println("press 4 to select" + StoryMode.myList.get(3));
            System.out.println("press 5 to select" + StoryMode.myList.get(4));
            System.out.println("press 6 to select" + StoryMode.myList.get(5));
            System.out.println("your opponent is " + StoryMode.list.get(150));
            a = scanner.nextInt();
            if (a == 1) {
                System.out.println("you choosed" + StoryMode.myList.get(0));
                if (r == 0) {
                    System.out.println(StoryMode.myList.get(0) + "has faded you Lost");
                }
                if (r == 1) {
                    System.out.println(StoryMode.list.get(150) + "has faded you won");
                    i += 1;
                }
                if (a == 2) {
                    System.out.println("you choosed" + StoryMode.myList.get(1));

                    if (r == 0) {
                        System.out.println(StoryMode.myList.get(1) + "has faded you Lost");
                    }
                    if (r == 1) {
                        System.out.println(StoryMode.list.get(150) + "has faded you won");
                        i += 1;
                    }
                }


                if (a == 3) {
                    System.out.println("you choosed" + StoryMode.myList.get(2));
                    System.out.println(StoryMode.myList.get(2) + "has faded you Lost");
                }
                if (a == 4) {
                    System.out.println("you choosed" + StoryMode.myList.get(3));
                    if (r == 0) {
                        System.out.println(StoryMode.myList.get(3) + "has faded you Lost");
                    }
                    if (r == 1) {
                        System.out.println(StoryMode.list.get(150) + "has faded you won");
                        i += 1;
                    }
                }
                if (a == 6) {
                    System.out.println("you choosed" + StoryMode.myList.get(4));
                    if (r == 0) {
                        System.out.println(StoryMode.myList.get(4) + "has faded you Lost");
                    }
                    if (r == 1) {
                        System.out.println(StoryMode.list.get(150) + "has faded you won");
                        i += 1;
                    }
                }
                if (a == 5) {
                    System.out.println("you choosed" + StoryMode.myList.get(5));

                        System.out.println(StoryMode.list.get(150) + "has faded you won");
                        i += 1;

                }

            }
        }
        //level 5
        if (i == 3) {

            System.out.println("choose the correct pokemon from your team to win the battle");
            System.out.println("press 1 to select" + StoryMode.myList.get(0));
            System.out.println("press 2 to select" + StoryMode.myList.get(1));
            System.out.println("press 3 to select" + StoryMode.myList.get(2));
            System.out.println("press 4 to select" + StoryMode.myList.get(3));
            System.out.println("press 5 to select" + StoryMode.myList.get(4));
            System.out.println("press 6 to select" + StoryMode.myList.get(5));
            System.out.println("your opponent is " + StoryMode.list.get(150));
            a = scanner.nextInt();
            if (a == 1) {
                System.out.println("you choosed" + StoryMode.myList.get(0));

                    System.out.println(StoryMode.myList.get(0) + "has faded you Lost");

                if (a == 2) {
                    System.out.println("you choosed" + StoryMode.myList.get(1));

                        System.out.println(StoryMode.myList.get(1) + "has faded you Lost");
                }


                if (a == 3) {
                    System.out.println("you choosed" + StoryMode.myList.get(2));
                    System.out.println(StoryMode.myList.get(2) + "has faded you Lost");
                }
                if (a == 4) {
                    System.out.println("you choosed" + StoryMode.myList.get(3));
                        System.out.println(StoryMode.myList.get(3) + "has faded you Lost");

                }
                if (a == 6) {
                    System.out.println("you choosed" + StoryMode.myList.get(4));

                        System.out.println(StoryMode.myList.get(4) + "has faded you Lost");

                }
                if (a == 5) {
                    System.out.println("you choosed" + StoryMode.myList.get(5));

                    System.out.println(StoryMode.list.get(150) + "has faded you won");
                    i += 1;

                }
                }

            }

        if(i==4){
            System.out.println("you have defeated all legendary pokemon");
        }
    }
}
