class Instabot{
    boolean busyHolidays(String[][] shoppers, String[][] orders, int[] leadTime) {
        int S [][] = new int [shoppers.length*2][2];
        int O [][] = new int [orders.length*2][2];
        int a = 0;
        String b = "";
        for(int i = 0; i<shoppers.length;i++){
            for(int j = 0;j<shoppers[i].length;j++){
                System.out.println();
                System.out.println(shoppers[i][j]);
                for(int k = 0; k<shoppers[i][j].length();k++){
                    if(Character.toString(shoppers[i][j].charAt(k)).equals(":")){
                        S[i+j][a] = Integer.parseInt(b);
                        a = 1;
                        b = "";
                    }else{
                        b = b+Character.toString(shoppers[i][j].charAt(k));
                    }

                }
                S[i+j][a] = Integer.parseInt(b);
                a = 0;
                b = "";
                System.out.println(S[i+j][0]);
                System.out.println(S[i+j][1]);
            }

        }
        System.out.println("2e boucle");
        System.out.println();
          for(int i = 0; i<orders.length;i++){
            for(int j = 0;j<orders[i].length;j++){
                System.out.println();
                System.out.println(orders[i][j]);
                for(int k = 0; k<orders[i][j].length();k++){
                    System.out.println("b : "+b);
                    System.out.println("k : "+orders[i][j].charAt(k));
                    System.out.println("S : "+O[i+j][a]);
                    if(Character.toString(orders[i][j].charAt(k)).equals(":")){
                        System.out.println("yo");
                        O[i+j][a] = Integer.parseInt(b);
                        System.out.println("S : "+O[i+j][a]);
                        a = 1;
                        b = "";
                    }else{
                        b = b+Character.toString(orders[i][j].charAt(k));
                    }

                }
                O[i+j][a] = Integer.parseInt(b);
                System.out.println(O[i+j][0]);
                System.out.println(O[i+j][1]);
                a = 0;
                b = "";
            }
        }




        return false;
      }
}
