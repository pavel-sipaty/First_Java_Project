package Task9;

public class Person {

    String name;
    int age;
    char sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        String result = name;
        if(sex == 'M') {
            result = "Mr. " + name;
        }else if(sex == 'F') {
            result = "Mrs. " + name;
        }

        return result;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }


}
