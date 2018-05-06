public class classB extends amB {
    classB(){
        System.out.println("Creating abstract B");
    }

    public String whatAmI(){
        return super.whatAmI() + "I am class B";
    }
}
