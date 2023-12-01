    //                                   A25 Random Numbers 
    //                                   Logan Weisgerber
    //                                      11/15/2023


class App {
    public static void main(String[] args) {
      for(int i = 0; i <= 10; i++){
        double a = Math.random() * 10;
        double b = Math.random() * 10;
  
        System.out.println(compare((int) a, (int) b));
      }
    }
  
  
    public static String compare(int a, int b){
      if(a > b){
        return a + "  >  " + b;
      }else if(b > a){
        return b + "  >  " + a;
      }else{
        return a + "  =  " + b;
      }
    }
  }