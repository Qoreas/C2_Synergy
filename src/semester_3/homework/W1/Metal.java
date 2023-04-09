package semester_3.homework.W1;

public abstract class Metal {
    public abstract double getEndurance();
}

class Steel extends Metal {
    @Override
    public double getEndurance() {
        return 50;
    }
}

class Copper extends Metal {
    @Override
    public double getEndurance() {
        return 20;
    }
}

class Iron extends Metal {
    @Override
    public double getEndurance() {
        return 30;
    }
}

class Plastic {
}

class Sword<T extends Metal> {
    private T material;

    public Sword(T material) {
        this.material = material;
    }

    public boolean checkEndurance() {
        return material.getEndurance() > 49;
    }
}