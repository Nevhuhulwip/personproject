public class MainProgram {
    public static void main(String args[]) {


        Person person=new Person("Ryan", 30, "female", new String[]{
                "Hardarse", "agile", "ssd hard drives", "Games"
        });

        System.out.println(person.Hello());
    }
}
