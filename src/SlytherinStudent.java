public class SlytherinStudent extends  HogwartsStudent {

    private final int cunning;

    private final int determination;

    private final int ambition;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }



    public int getDetermination() {
        return determination;
    }



    public int getAmbition() {
        return ambition;
    }



    public int ability() {
        return cunning + determination + ambition;
    }
    public void compareHogwarts (SlytherinStudent slytherinStudent ) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Слизернец " + getNameAndSurname() + " лучше чем Слизернец " +  slytherinStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Слизернец " + getNameAndSurname() + " лучше чем Слизернец " +  slytherinStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Слизернец " + getNameAndSurname() + " такой же,как и Слизернец " +  slytherinStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);

        }
    }

    @Override
    public String toString() {
        return String.format("%s; Хитрость :  %d; Решительность : %d; Амбиции : %d", super.toString(),cunning,determination,ambition);
    }
}
