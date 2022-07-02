
public class Main {

    public static void main(String[] args) {
        GryffindorStudents harry = new GryffindorStudents ("Гарри Поттер", 21, 34,54,78,85);
        GryffindorStudents hermione = new GryffindorStudents ("Гермиона Грейнджер", 55, 45,20,34,75);
        GryffindorStudents ron = new GryffindorStudents ("Рон Уизли", 19, 20,30,55,80);

        SlytherinStudents drago = new SlytherinStudents ("Драко Малфой",20, 33, 29, 55,64,53,80);
        SlytherinStudents graham = new SlytherinStudents ("Грэхэм Монтегю",15, 20, 30, 45,36,60,54);
        SlytherinStudents gregory = new SlytherinStudents ("Драко Малфой",27, 10, 30, 15,34,65,76);

        HufflepuffStudents zachariah = new HufflepuffStudents("Захария Смит", 39,58,98,52,13);
        HufflepuffStudents cedric = new HufflepuffStudents("Седрик Диггори", 19,18,38,72,63);
        HufflepuffStudents justin = new HufflepuffStudents("Джфстин Финч-Флетчли", 59,28,48,12,23);

        RavenclawStudets chang = new RavenclawStudets("Чжоу Чанг",36,46,75,53,23,12);
        RavenclawStudets padma = new RavenclawStudets("Падма Патил",43,31,23,13,24,15);
        RavenclawStudets marcus = new RavenclawStudets("Маркус Белби",12,45,48,36,17,95);

        harry.print();
        hermione.print();
        ron.print();
        drago.print();
        graham.print();
        gregory.print();
        zachariah.print();
        cedric.print();
        justin.print();
        chang.print();
        padma.print();
        marcus.print();

        harry.compareGriffindorStudents(hermione);
        hermione.compareHogwartsStudents(chang);
        zachariah.compareHufflepuffStudents(justin);

    }

}