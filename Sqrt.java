package IteratedAlgorithm;
//指定精度范围求开方
//精度:最大误差=测量值-真实值
public class Sqrt {
    public double sqrt(double d,Double precision){
        double x0=d,x1,offest,
                prec=precision!=null?precision:0.01;
        while(true){
            x1=(x0*x0+d)/2/x0;
            offest=x1*x1-d;
            if(offest<prec&&offest>-prec){
                return x1;
            }
            x0=x1;
        }
    }
}
