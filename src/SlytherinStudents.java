public class SlytherinStudents extends AllStudents{
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudents(String name, int magic, int transgression, int cunning, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    private int ability(){
        return cunning+determination+ambition+ingenuity+thirstForPower;
    }
    public void compareSlytherinStudents(SlytherinStudents slytherinStudents){
        int ability1 = ability();
        int ability2 = slytherinStudents.ability();
        if(ability1>ability2){
            System.out.printf("Студент Слизерина %s лучше Студента Слизерина %s(%d VS %d)%n", getName(),slytherinStudents.getName(), ability1, ability2);
        }else if (ability2>ability1){
            System.out.printf("Студент Слизерина %s лучше Студента Слизерина %s(%d VS %d)%n", slytherinStudents.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент Слизерина %s такой же, как Студент Слизерина %s(%d VS %d)%n", slytherinStudents.getName(),getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s, ухитростьм=%d; решительность=%d; амбициозность=%d; находчивость=%d; жажда власти=%d", super.toString(), cunning,determination,ambition,ingenuity,thirstForPower);
    }


}
