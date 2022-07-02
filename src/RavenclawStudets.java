public class RavenclawStudets extends AllStudents{

    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudets(String name, int magic, int transgression, int cleverness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int ability(){
        return cleverness+wisdom+wit+creativity;
    }
    public void compareRavenclawStudents(RavenclawStudets ravenclawStudets){
        int ability1 = ability();
        int ability2 = ravenclawStudets.ability();
        if(ability1>ability2){
            System.out.printf("Студент Когтевран %s лучше Студента Когтевран %s(%d VS %d)%n", getName(),ravenclawStudets.getName(), ability1, ability2);
        }else if (ability2>ability1){
            System.out.printf("Студент Когтевран %s лучше Студента Когтевран %s(%d VS %d)%n", ravenclawStudets.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент Когтевран %s такой же, как Студент Когтевран %s(%d VS %d)%n", ravenclawStudets.getName(),getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s, ум=%d; мудрость=%d; сообразительность=%d; творчество=%d", super.toString(), cleverness,wisdom,wit,creativity);
    }
}
