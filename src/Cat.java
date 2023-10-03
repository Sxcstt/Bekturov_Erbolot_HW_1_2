final public class Cat extends Pet{
        public Cat(int age, String name, EnumColor enumColor) {
            super(age, name, enumColor);
        }

        @Override
        public void makeVoice() {
            System.out.println("the cat purrs");
        }
    }
