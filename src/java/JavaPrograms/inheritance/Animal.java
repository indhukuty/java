package JavaPrograms.inheritance;

public class
Animal {
    void cat() {
        System.out.println("Meow Meow");
    }
}
    class Animal2 extends Animal {
        void dog() {
            System.out.println("bow bow");
        }
    }
        class Animal3 extends Animal {
            void cow() {
                System.out.println("Maa Maa");

            }


            public static void main(String[] args) {
                Animal3 ab = new Animal3();
                Animal2 bc= new Animal2();
                ab.cat();
                ab.cow();
                bc.dog();
            }
            }








