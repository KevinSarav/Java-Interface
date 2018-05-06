public class classA extends amA {
    classA(){
        System.out.println("Creating abstract A");
    }

    public String whatAmI(){
        return super.whatAmI() + "I am class A";
    }
}
