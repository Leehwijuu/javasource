package generics;

public class Fruit {
    @Override
    public String toString() {
        return super.toString();
    }
}

class Apple extends Fruit {

    @Override
    public String toString() {
        return super.toString();
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return super.toString();
    }
}

class FruitBox<T extends Fruit> extends Box3<T> {

}

class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + "";
        }
        return new Juice(tmp);
    }
}

class Toy {
    @Override
    public String toString() {
        return super.toString();
    }
}
