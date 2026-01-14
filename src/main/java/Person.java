public class Person implements Printable{
    private String name;
    Person(String name){
        setName(name);
    }
    public void setName(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("my name is " + this.name);
    }
}
