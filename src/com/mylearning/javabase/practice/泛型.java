package src.com.mylearning.javabase.practice;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*
* ?extends 父类
表示泛型可以为父类 以及父类的任何子类类型
* ? super 类
* 表示泛型可以是热呢父类，表示设置泛型的下限，没有上限*/
public class 泛型 {
    public static void main(String[] args) {
        A<String> a1= new A();
        a1.m1("abc");
        System.out.println(a1.m2());
        InterfaceCClass interfaceCClass = new InterfaceCClass();
        System.out.println(interfaceCClass.m1("true"));
    }
}

interface InterfaceB<R,P>{
    R m1(P p);
}

class InterfaceCClass implements InterfaceB<Boolean,String>{

    @Override
    public Boolean m1(String s) {
        return Boolean.parseBoolean(s);
    }
}
class A<T> {
    public void m1(T t){

    }

    public T m2() {
        return null;
    }
}
