public abstract class Animal {

    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public boolean isActive(){
         return energy > 0;
    }

    public abstract int attack();

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }


    @Override
    public String toString() {
        return "Animal " +
                "name= '" + name + '\'' +
                ", energy=" + energy;
    }


}
