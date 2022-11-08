class Main {
  public static void main(String[] args) {
    for(int i = 0; i <= 10; i++){
      for(int j = i; j<10; j++){
        System.out.print("  ");
      }
      for(int k = 0; k<=i; k++){
        System.out.print(" *");
      }
      for(int l = 1; l <=i;l++){
        System.out.print(" *");;
      }
      System.out.println("");
    }
  }
}
//submitted by rakeshraj mahakud