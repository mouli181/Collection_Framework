package Shallowcloning;

public class ShallowEx implements Cloneable {
    private StringBuilder name;

    public ShallowEx(StringBuilder name){
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public StringBuilder getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
}

class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        StringBuilder name = new StringBuilder("John");

        ShallowEx original = new ShallowEx(name);

        ShallowEx clone = (ShallowEx) original.clone();

        System.out.println(original.getName());
        System.out.println(clone.getName());

        name.append(" doe");

        System.out.println(original.getName());
        System.out.println(clone.getName());

    }
}