public class GryffindorStudent extends  HogwartsStudent {

    private final int nobility;

    private final int honor;

    private final int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }



    public int getHonor() {
        return honor;
    }



    public int getBravery() {
        return bravery;
    }



    public int ability() {
        return nobility + bravery + honor;
    }
    public void compareHogwarts (GryffindorStudent gryffindorStudent ) {
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Грифиндорец " + getNameAndSurname() + " лучше чем Грифиндорец " +  gryffindorStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Грифиндорец " + getNameAndSurname() + " лучше чем Грифиндорец " +  gryffindorStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Грифиндорец " + getNameAndSurname() + " точно такой же,как и Грифиндорец " +  gryffindorStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; Благородство:  %d; Честь: %d; Храбрость: %d",super.toString(), nobility, honor, bravery);
    }
}
