public class HufflepuffStudents extends AllStudents{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    private int ability(){
        return loyalty+honesty+diligence;
    }
    public void compareHufflepuffStudents(HufflepuffStudents hufflepuffStudents){
        int ability1 = ability();
        int ability2 = hufflepuffStudents.ability();
        if(ability1>ability2){
            System.out.printf("Студент Пуффендуй %s лучше Студента Пуффендуй %s(%d VS %d)%n", getName(),hufflepuffStudents.getName(), ability1, ability2);
        }else if (ability2>ability1){
            System.out.printf("Студент Пуффендуй %s лучше Студента Пуффендуй %s(%d VS %d)%n", hufflepuffStudents.getName(),getName(), ability2, ability1);
        }else {
            System.out.printf("Студент Пуффендуй %s такой же, как Студент Пуффендуй %s(%d VS %d)%n", hufflepuffStudents.getName(),getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s, трудолюбие=%d; верность=%d; честь=%d", super.toString(), diligence,loyalty,honesty);
    }
}
