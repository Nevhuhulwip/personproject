public class Person {

    private String name;
    private int age;
    private String gender;
    private String[] interests;

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }


    public String getName() {
        return name;
    }



    public String Hello() {
        String txt="Hello, My name is: "+ name+" I am " + age +" years old." +
                " I am " + gender +", My interests are "+ interests[0]+", "+interests[1]+", "+interests[2];
       return txt;
    }

    public int getAge() {
        return age;
    }


}
