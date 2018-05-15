package SortAlgorithm;
//由大到小冒泡排序
public class BubbleSort {
    public int[] bubbleSort(int[] a){
        //是否继续排序
        boolean bool=true;
        for (int i=0;i<a.length-1&&bool;i++){
            bool=false;
            for(int t=1;t<a.length-i;t++){
                if(a[t]>a[t-1]){
                    int tmp=a[t-1];
                    a[t-1]= a[t];
                    a[t]=tmp;
                    bool=true;
                }
            }
        }
        return a;
    }
}
