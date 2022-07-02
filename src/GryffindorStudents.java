public class GryffindorStudents extends AllStudents{
    public GryffindorStudents(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    private int nobility;
    private int honor;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int ability(){
        return nobility+honor+bravery;
    }
    public void compareGriffindorStudents(GryffindorStudents griffindorStudent){
        int ability1 = ability();
        int ability2 = griffindorStudent.ability();
        if(ability1>ability2){
            System.out.printf("Студент Гриффиндора %s лучше Студента Гриффиндора %s(%d VS %d)%n", getName(),griffindorStudent.getName(), ability1, ability2);
        }else if (ability2>ability1){
            System.out.printf("Студент Гриффиндора %s лучше Студента Гриффиндора %s(%d VS %d)%n", griffindorStudent.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент Гриффиндора %s такой же, как Студент Гриффиндора %s(%d VS %d)%n", griffindorStudent.getName(),getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s, благородство=%d; честь=%d; храбрость=%d", super.toString(), nobility,honor,bravery);
    }
}
