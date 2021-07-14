package com.qmx.work5;

public class Application {
    int method(String str,int index){
        return index/0;
    }

    public static void main(String[] args) {
        Application application = new Application();
        //ctrl+all+T快捷键
        try {//监控区域
            application.method("123",10);
            System.out.println(2);//若程序正常执行才能执行该语句
        } catch (StringIndexOutOfBoundsException e) {//catch(捕获的异常类型)
            System.out.println(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(0);
        } catch(Exception e) {
            System.out.println("出现其他异常类型");
        } finally {//进行善后处理，可以加也可以不加
            System.out.println("end");
        }
    }
}
