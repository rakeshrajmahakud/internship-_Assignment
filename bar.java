class Main {
  public static void main(String[] args) {
    int arr[]= {4,6,3,1,5};
    int len=arr.length;
    int max=0;
    
    for(int i=0;i<len;i++){
      if (arr[i]>max){
        max=arr[i];
      }
    }
    
    char [][]matrix=new char[len][max];
    for(int j=0;j<len;j++) { 
      for(int i=0;i<max-arr[j];i++)   
       matrix[j][i]=' ';
    
      for(int k=max-arr[j];k<max;k++){  
        matrix[j][k]='*';
      }  
    }
    
    for(int i=0;i<max;i++){
      for(int j=0;j<len;j++)
      System.out.print(matrix[j][i]+"  ");  
      System.out.println("");
    }
 }
}
//submitted by rakeshraj mahakud
