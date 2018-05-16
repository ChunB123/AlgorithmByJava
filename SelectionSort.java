package Test;

public class SelectionSort {
  //从大到小选择排序
    public int[] selectionSort(int[] ini) {
        int[] array=new int[ini.length];
        for(int  i=0;i<ini.length-1;i++){
            int max=ini[i];
            int index=i;
            for(int t=i+1;t<ini.length;t++){
                if(ini[t]>max){
                    max=ini[t];
                    index=t;
                }
            }
            //和最大元素交换
            int tmp=ini[i];
            ini[i]=max;
            ini[index]=tmp;
        }

        return ini;
    }
}
