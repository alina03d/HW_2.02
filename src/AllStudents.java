public abstract class AllStudents {
    private String name;
    private int magic;
    private int transgression;

    public AllStudents(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return String.format("Студент %s: Сила магии = %d, Трансгессия = %d", name,magic,transgression);
    }
    private  int abilityHogwartsStudent(){
        return magic+transgression;
    }

    public void compareHogwartsStudents(AllStudents hogwartsStudent){
        int ability1 = abilityHogwartsStudent();
        int ability2 = hogwartsStudent.abilityHogwartsStudent();
        if(ability1>ability2){
            System.out.printf("Студент %s лучше Студента %s(%d VS %d)%n", name,hogwartsStudent.name, ability1, ability2);
        }else if (ability2>ability1){
            System.out.printf("Студент %s лучше Студента %s(%d VS %d)%n", hogwartsStudent.name,name, ability2, ability1);
        }else {
            System.out.printf("Студент %s такой же, как Студент %s(%d VS %d)%n", hogwartsStudent.name,name, ability1, ability2);
        }
    }
    public void print(){
        System.out.println(this);
    }
}
