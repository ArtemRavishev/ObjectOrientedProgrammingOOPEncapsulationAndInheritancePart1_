public class RavenclawStudent extends  HogwartsStudent {

    private final int wisdom;

    private final int  intelligence;

    private final int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int wisdom, int intelligence, int creativity) {
        super(name, magic, transgression);
        this.wisdom = wisdom;
        this.intelligence = intelligence;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }



    public int getIntelligence() {
        return intelligence;
    }



    public int getCreativity() {
        return creativity;
    }

    public int ability() {
        return wisdom + intelligence + creativity;
    }
    public void compareHogwarts (RavenclawStudent ravenclawStudent ) {
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Когтевранец " + getNameAndSurname() + " лучше чем Когтевранец " +  ravenclawStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Когтевранец " + getNameAndSurname() + " лучше чем Когтевранец " +  ravenclawStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Когтевранец " + getNameAndSurname() + " такой же,как и Когтевранец " +  ravenclawStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);

        }
    }
    @Override
    public String toString() {
        return String.format("%s; Мудрость :  %d; Интеллект : %d; Креативность : %d",super.toString(), wisdom,intelligence,creativity);
    }
}
