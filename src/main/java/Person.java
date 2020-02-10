import java.util.ArrayList;


public class Person {

    private String name;
    private int age;
    private String gender;
    String[] interests;

    public String getGender() {
        return gender;
    }

    public int getage() {
        return age;
    }

    public String[] getInterests() {
        return interests;
    }


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
        int len = interests.length - 1;
        String lastText = interests[len];


        ArrayList last = new ArrayList();

        for(int i=0; i< interests.length - 1; i++){
            last.add(interests[i]);
            System.out.println(interests[i]);
        }

        String text = last.toString();
        text = text.substring(1, text.length() - 1);


        String txt="Hello, My name is "+ name+" and I am " + age +" years old." +
                " My interests are being a "+ text + " and " + lastText + ".";
       return txt;
    }

    public int getAge() {
        return age;
    }


}
