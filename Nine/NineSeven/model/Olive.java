package Nine.NineSeven.model;

public class Olive {

    public OliveName name= OliveName.THARUSHI;
    public long color=4567890;
    public int oil=3;

    public Olive(){};

    public Olive(OliveName name, long color, int oil){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName(){
        return name;
    }

    public void setName(OliveName name){
        this.name = name;
    }

    public long getColor(){
        return color;
    }

    public void setColor(long color){
        this.color = color;
    }

    public int crush(){
        System.out.println();
        return oil;
    }

    public void setOil(int oil){
        this.oil=oil;
    }
}

