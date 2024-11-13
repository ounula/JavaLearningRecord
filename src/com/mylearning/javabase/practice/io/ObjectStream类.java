package src.com.mylearning.javabase.practice.io;

import java.io.*;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice.io
 */
/*
* 读写对象，序列化和反序列化
* 序列化是将对象的状态写入到特定的流中的过程 （将对象保存在二进制文件中）
* 反序列化则是从特定的流中获取数据重新构建对象的过程（将二进制文件读取出来生成新的对象）
* 被序列化的对象所属的类必须实现序列化接口  Serializable接口
* Serializable接口是一个空接口，相当于一个表示，表示此类可以被序列化
* 如果不希望某个属性被序列化 可以使用transient关键字修饰*/
class Student implements Serializable{
    private String name;
    private transient int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ObjectStream类 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("牛人", 22);
        Student student2 = new Student("牛人2", 23);
        FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.writeObject(student2);
        objectOutputStream.flush();
        FileInputStream fileInputStream = new FileInputStream("student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //Object o2 = objectInputStream.readObject();
        //if (o2 instanceof Student){
        //    System.out.println(((Student) o2).getName()+((Student) o2).getAge());
        //}
        if (fileInputStream.available()>0){
            Object o = objectInputStream.readObject();
            if (o instanceof Student){

                System.out.println("o= "+ ((Student) o).getAge()+((Student) o).getName());
            }
        }
    }
}
