package day03;

public class HomeWork {
    public static void main(String[] args){
        //打印等腰三角形
        print();
        System.out.println("打印成功");
        System.out.println();
        System.out.println("************************************************");
        System.out.println();
        //100以内质数的和
        primeAdd();
    }
    //打印等腰三角形的方法
    public static void print(){
        for(int i = 1;i<5;i++){//打印三角形所占行数
            for(int j=1;j<5-i;j++){//控制每行空格的个数
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");//打印星号的个数
            }
            System.out.println();
        }

    }

    //100以内质数的和的方法
    public static void primeAdd(){
        int sum = 0;
        for (int i=2;i<=100;i++){//一不是质数从2到100
            boolean b=true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){// i一定 j变化 取余为零，证明不是一和它本身
                    b=false;
                    break;//跳出内循环，继续外循环
                }
            }
            if (b){
                sum+=i;
            }
        }
        System.out.println("100以内的质数的和为:"+sum);

    }
}
