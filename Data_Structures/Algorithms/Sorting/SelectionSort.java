class Main {
  public static int[] selectionSort(int a[]){
    int i,j,l=a.length,temp,temp1,pos;
    for(i=0;i<l;i++){
      temp1=a[i];
      pos=i;
      for(j=i+1;j<l;j++)
        if(a[j]<temp1){
          pos=j;
          temp1=a[j];
        }
        if(pos!=i){
          temp=a[pos];
          a[pos]=a[i];
          a[i]=temp;
        }
    }
    return a;
  }
  public static void main(String[] args) {
    int[] a ={5,7,15,33,14,99,1,100,3,155};
    a = selectionSort(a);
    for(int i=0;i<a.length;i++)
      System.out.println(a[i]);
  }
}
