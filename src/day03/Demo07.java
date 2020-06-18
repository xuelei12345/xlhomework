package day03;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int [] input ={2,4,5,8,10,12,16,17};
        int a=0,b=0;
        for(int i=0;i<8;i++){
            if(input[i]%2==0){
                a++;//偶数的个数

            }else{
                b++;//奇数的个数
            }
        }
        int [] even =new int [a];
        int [] odd = new int[b];
        int index = 0;
        int index1 = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2==0){
                even[index] = input[i];
                index++;
            }else{
                odd [index1] =input[i];
                index1++;
            }
        }
        System.out.println("偶数数组输出为:"+ Arrays.toString(even));
        System.out.println("奇数数组输出为:"+Arrays.toString(odd));
        int [] combin=combine(even,odd);
        System.out.println("交替输出的数组为:"+Arrays.toString(combin));


    }
    private static int [] combine(int [] even,int [] odd){
        int [] combin = new int[even.length+odd.length];
        int i=0,j=0,index=0;
        while(i<even.length && j<odd.length){
            combin[index++]=even[i++];//index变化使两个数组交替放到大数组中
            combin[index++]=odd[j++];
        }
        while(i<even.length){
            combin[index++]=even[i++];
        }
        while(j<odd.length){
            combin[index++]=odd[j++];
        }
        return combin;
    }

}




