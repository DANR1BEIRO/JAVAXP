package Intermediate.Generics;

public class Pergaminho extends Equipamentos {
    public Pergaminho(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
