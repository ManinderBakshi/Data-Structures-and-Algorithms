class Main {
  public static int[] insertionSort(int a[]){
    int i,j,l=a.length;
    for ( i = 1; i < l; ++i) { 
            int key = a[i]; 
             j = i - 1; 
            while (j >= 0 && a[j] > key) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        } 
    return a;
  }
  public static void main(String[] args) {
    int[] a ={5,7,15,33,14,99,1,100,3,155};
    a = insertionSort(a);
    for(int i=0;i<a.length;i++)
      System.out.println(a[i]);
  }
}
// 1 5 7 14 15 33 99
