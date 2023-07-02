public class Species {

    public static class Dog extends Animal {

        public Dog(String name) {
            super(String.format("������� � %d",++Animal.number),
                    Animal.r.nextInt(1,30),
                    Animal.r.nextInt(3,50),
                    Animal.r.nextInt(15,150));
        }
        public Dog(){
            super(String.format("��������� �%d",++Animal.number),
                    Animal.r.nextInt(1,30),
                    Animal.r.nextInt(3,50),
                    Animal.r.nextInt(15,150));
        }
//        public String getInfo() {
//            return super.getInfo();
//        }
        public String voice (){
            return String.format("%s���",super.voice());
        }

    }


    public static class Cat extends Animal {

        public Cat(String name) {
            super(String.format("������� � %d",++Animal.number),
                    Animal.r.nextInt(1,20),
                    Animal.r.nextInt(3,15),
                    Animal.r.nextInt(15,20));
        }
        public Cat(){
            super(String.format("����� � %d",++Animal.number),
                    Animal.r.nextInt(1,20),
                    Animal.r.nextInt(3,15),
                    Animal.r.nextInt(15,20));
        }
        public String voice (){
            return String.format("%s���",super.voice());
        }
    }
}
