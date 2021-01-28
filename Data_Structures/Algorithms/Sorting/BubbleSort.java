class Main {
  public static int[] bubbleSort(int a[]){
    int i,j,l=a.length,temp;
    for(i=0;i<l;i++){
      for(j=0;j<l-1;j++){
        if(a[j]>a[j+1]){
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    return a;
  }
  public static void main(String[] args) {
    int[] a ={5,7,15,33,14,99,1,100,3,155};
    a = bubbleSort(a);
    for(int i=0;i<a.length;i++)
      System.out.println(a[i]);
  }
}
