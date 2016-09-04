class Uberbot{
    double[] fareEstimator(int ride_time, int ride_distance, double[] cost_per_minute, double[] cost_per_mile) {
        double [] a = new double [cost_per_minute.length];
        for(int i = 0; i<a.length; i++){
            a[i] = ride_time*cost_per_minute[i]+ride_distance*cost_per_mile[i];
        }
        return a;
    }
    double perfectCity(double[] departure, double[] destination) {
        int a = (int) departure[0];
        int b = (int) departure[1];
        int c = (int) destination[0];
        int d = (int) destination[1];
        boolean inte = false;
        boolean inte2 = false;
        double plus = 0;
        if( (double)a == departure[0] ){
            inte = true;
        }
        if((double)c == destination[0]){
            inte2 = true;
        }
        if(!inte){
            if(!inte2){
                System.out.println(plus);
                if(departure[0]<= destination[0]){
                    System.out.println("C1");
                    plus = (double)Math.round(((a+1) - departure[0])*10)/10;
                    System.out.println(plus);
                    if(a != c){
                        plus =  plus + (double)destination[0] - c;
                    }else{
                        plus = plus + (double)Math.round(((c+1) - destination[0])*10)/10;
                    }
                }else{
                    System.out.println("C2");
                    plus = (double)departure[0] - a;
                    System.out.println(plus);
                }
                System.out.println(plus);
                if(departure[1] <= destination[1]){
                    plus = plus + destination[1] - departure[1];
                }else{
                    plus = plus + departure[1] - destination[1];
                }
            }else{
                System.out.println(plus);
                if(departure[0]<= destination[1]){
                    System.out.println("C1");

                    if(a != c){
                        plus = (double) destination[0] - departure[0];
                        plus =  plus + (double)destination[0] - c;
                    }else{
                        plus = (double)Math.round(((a+1) - departure[0])*10)/10;
                    System.out.println(plus);
                        plus = plus + (double)Math.round(((c+1) - destination[0])*10)/10;
                    }
                }else{
                    System.out.println("C2");
                    plus = (double)departure[0] - a;
                    System.out.println(plus);
                }
                System.out.println(plus);
                if(departure[1] <= destination[1]){
                    plus = plus + destination[1] - departure[1];
                }else{
                    plus = plus + departure[1] - destination[1];
                }
            }
        }else{
            if(inte2){
                System.out.println(plus);
                if(departure[1]<= destination[1]){
                    System.out.println("C1");
                    plus = (double) departure[1] - b;
                    System.out.println(plus);
                    if(a != c){
                        plus =  plus + (double)destination[1] - d;
                    }else{
                        plus = plus + (double)Math.round(((d+1) - destination[1])*10)/10;
                    }
                    System.out.println(plus);

                }else{
                    System.out.println("C2");
                    plus = (double)departure[1] - b;
                    System.out.println(plus);
                }
                if(departure[0] <= destination[0]){
                        plus = plus + destination[0] - departure[0];
                }else{
                        plus = plus + departure[0] - destination[0];
                }
            }else{
                System.out.println(plus);
                if(departure[1]<= destination[1]){
                    System.out.println("C1");
                    plus = (double) departure[1] - b;
                    System.out.println(plus);
                    if(a != c){
                        plus =  plus + (double)destination[1] - d;
                    }else{
                        plus = plus + (double)Math.round(((d+1) - destination[1])*10)/10;
                    }
                    System.out.println(plus);

                }else{
                    System.out.println("C2");
                    plus = (double)departure[1] - b;
                    System.out.println(plus);
                }
                if(departure[0] <= destination[0]){
                        plus = plus + destination[0] - departure[0];
                }else{
                        plus = plus + departure[0] - destination[0];
                }
            }
        }
        return plus;
    }
}
