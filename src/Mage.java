public class Mage {
    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return String.format(this.name + ", " + this.level + ", " + this.damage + ", " + this.type);
    }

    public String fight(Mage mage) {
        String str = "";
        if (this.type.equals("fire") && mage.type.equals("ice")) {
            str = this.name;
        } else if (mage.type.equals("fire") && this.type.equals("ice")) {
            str = mage.name;

        } else if (this.type.equals("ice") && mage.type.equals("earth")) {
            str =this.name;
        } else if (mage.type.equals("ice") && this.type.equals("earth")) {
            str = mage.name;

        } else if (this.type.equals("earth") && mage.type.equals("fire")) {
            str = this.name;
        } else if (mage.type.equals("earth") && this.type.equals("fire")) {
            str = mage.name;
        }

        if (this.type.equals(mage.type) && this.level > mage.level) {
            str = this.name;
        } else if (this.type.equals(mage.type) && this.level < mage.level) {
            str = mage.name;
        }

        if (this.type.equals(mage.type) && this.level == mage.level && this.damage > mage.damage) {
            str =this.name;
        } else if (this.type.equals(mage.type) && this.level == mage.level && this.damage < mage.damage) {
            str = mage.name;
        } else if (this.type.equals(mage.type) && this.level == mage.level && this.damage == mage.damage) {
            str = "draw";
        }
        return str;
    }
}
