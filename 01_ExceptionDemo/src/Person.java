public class Person {
    int age;
    String name;
    public Person() {
    }

    public Person(int age) throws ThrowNoSuchAgeException {
        if(age < 0 || age > 150)
        {
            throw new ThrowNoSuchAgeException("输入年龄非法！！！");
        }
        this.age = age;
    }
}
