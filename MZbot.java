class MZbot{
    int allianceHelp(int t, int allianceSize) {
        int a = t;
        for(int i = 0; i<allianceSize;i++){
            if(i>=10){
                break;
            }
            if(t/10 > 60){
                a = a-t/10;
            }else{
                a = a-60;
            }
        }
        if(a<0){
            a = 0;
        }
        return a;
    }


}
