package com.qmx.work4;
import java.util.Arrays;//数组工具类Arrays
import java.util.Scanner;//输入类
//Arrays常用:
//Arrays.fill(nums,x);将数组元素的值全部变为x
//Arrays.sort(nums);升序排序
//Arrays.toString(nums);打印数组
//静态初始化:创建+赋值,此过程赋值个数即为数组元素个数:int[] num = {1,2,3,4},长度为4
//动态初始化:创建一个长度一定的数组,后期使用过程赋值:int[] num = new int[10],长度为10,默认为0
//二维数组:int[][] num = new int[2][5];
public class Application {
    public static void main(String[] args) {
        int[] ans = new int[5];//元素值默认为0
        Scanner scanner = new Scanner(System.in);//创建输入流对象scanner
        System.out.println("请输入数组元素:");
        for(int i = 0;i < ans.length;i++) {//输入数组元素
            if(scanner.hasNextInt()) {//如果输入的是整形数据
                ans[i] = scanner.nextInt();
            }
        }
        //遍历方法一: ans.for;但无法索引具体下标
        for (int an : ans) {
            System.out.print(an+" ");//print是单行输出，而println是换行输出
        }
        System.out.println(" ");
        System.out.println("=================");
        Arrays.sort(ans);//将数组排序
        //遍历方法二:
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println(" ");
        System.out.println("=================");
        Arrays.fill(ans,100);//将数组元素值全部变为100
        //遍历方法三:利用工具类
        System.out.println(Arrays.toString(ans));
        scanner.close();//凡是IO流对象使用完后最好关闭,否则会浪费资源
    }
}
//String(字符串)输入类型:
//scanner.hasNextLine()与scanner.nextLine(),以回车键为输入结束标志
//scanner.hasNext()与scanner.next(),以空格或者回车键为输入结束标志