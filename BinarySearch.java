//二分查找法:提供一个有序数组,一个元素.存在该元素,返回元素索引.否则,返回-1
class BinarySearch {
    public static int binarySearch(int[] ini,int index){
        //low,high,middle索引
        int low=0;
        int high=ini.length-1;
        int time=0;
        int middle;
        //题目的算法
        while(high>=low){
            time++;
            System.out.println("第"+time+"次检索");
            middle=(low+high)/2;
            if (index>ini[middle]){
                low=middle+1;
            }else if(index<ini[middle]){
                high=middle-1;
            }else if(index==ini[middle]){
                return middle;
            }
        }
        return -1;
        //自创的算法
        /*while (true) {
                time++;
                int middle1 = (low + high) / 2;
                if (index > ini[middle1]) {
                    low = middle1+1;
                } else if(ini[middle]>index){
                    high = middle1-1;
                }else if(ini[middle]==index){
                    return middle1;
                }
                if(low==high){
                    System.out.println("输入的元素索引为"+low+",检索了"+time+"次");
                    return low;
                }
            }
            */
    }
}
