package Sp19_bse_004;

public class Pokemon {
    private int id;
   private int lvl;
   private int health;
  private  Type type;
   private  String name;
    private int attack;

    public Pokemon(int id,int lvl, int health, Type type, String name, int attack) throws QasimException {
        this.id = id;
        this.lvl = lvl;
        this.health = health;
        this.type = type;
        this.name = name;
        this.attack = attack;
        if(id>151){
            throw new QasimException("QasimException");
        }
    }

    public  int getId() {
       return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", lvl=" + lvl +
                ", health=" + health +
                ", type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
