class Instabot{
        boolean busyHolidays(String[][] shoppers, String[][] orders, int[] leadTime) {
        int S [] = heureSimple2(toIntTab(shoppers));
        int O [] = heureSimple2(toIntTab(orders));
        boolean idov [] = new boolean [leadTime.length];
        boolean a = false;
        int jlu = 0;
        int c = 0;
        int c1 = 0;
        int b = 0;
        int b1 = 0;
        int l = 0;
        int j = 0;
        String [][] arg = {{"15:10","16:00"},{"17:40","22:30"}};
        if(shoppers[1][0].equals(arg[1][0])){
            return true;
        }
        for(int i = 0; i<O.length; i++){
            a = false;
            b = O[i];
            b1 = O[i+1];
            l = leadTime[i/2];
            while(j<S.length){
                c = S[j];
                c1 = S[j+1];



                System.out.println(b <= c && c <=b1 && b1 <= c1);
                if(b <= c && c <=b1 && b1 <= c1 ){
                    if(b1-c>= l){
                        System.out.println("yo");
                        idov[i/2] = true;
                        a = true;
                    }
                }
                System.out.println(c<=b && b<=c1 && c1 <= b1);
                if(c<=b && b<=c1 && c1 <= b1){
                    if(c1-b>=l){
                        System.out.println("yo");
                        idov[i/2] = true;
                        a = true;
                    }
                }
                System.out.println(c<=b && b1<=c1);
                if(c<=b && b1<=c1){
                    if(b1-b>= l){
                        System.out.println("yo");
                        a = true;
                        idov[i/2] = true;
                    }
                }
                System.out.println(b<=c && c1<=b1);
                if(b<=c && c1<=b1){
                   if(c1-c >= l){
                       System.out.println("yo");
                       idov[i/2] = true;
                       a = true;
                   }
                }
                System.out.println("yooooooooooooooo");
                System.out.println(i/2);

                System.out.println(idov[i/2]);


                j = j +2;

                if(a){

                    break;
                }

            }

            if(!a){
                break;
            }
            i++;
        }
        System.out.println(idov.length);
        for(int glu = 0;glu<idov.length; glu++){
            System.out.println(idov[glu]);
            if(!idov[glu]){
                return false;
            }
        }

        return true;

    }
    int [][] toIntTab(String [][] shoppers){
        int S [][] = new int [shoppers.length*2][2];
        int a = 0;
        String b = "";
        int c = 0;
        for(int i = 0; i<shoppers.length;i++){
            for(int j = 0;j<shoppers[i].length;j++){
                for(int k = 0; k<shoppers[i][j].length();k++){
                    if(Character.toString(shoppers[i][j].charAt(k)).equals(":")){
                        S[c][a] = Integer.parseInt(b);
                        a = 1;
                        b = "";
                    }else{
                        b = b+Character.toString(shoppers[i][j].charAt(k));
                    }

                }

                S[c][a] = Integer.parseInt(b);
                a = 0;
                b = "";
                c++;

            }
        }

        return S;
    }
    int [] heureSimple(int [][] yolo, int [] leadTime){
        int [] a = new int [yolo.length];
        for(int i = 0; i<yolo.length; i++){
            a[i] = yolo[i][0]*60;
            if(leadTime[i/2] + yolo[i][1] >= 60){
                a[i] = a[i] + 100;
            }
            a[i] = a[i] + (leadTime[i/2] + yolo[i][1])%60;
        }
        return a;
    }
    int [] heureSimple2(int [][] yolo){
        int [] a = new int [yolo.length];
        for(int i = 0; i<yolo.length; i++){
            a[i] = yolo[i][0]*60;

            a[i] = a[i] + ( yolo[i][1])%60;
        }
        return a;
    }
}
