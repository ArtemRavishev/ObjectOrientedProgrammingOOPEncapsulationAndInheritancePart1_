public abstract class HogwartsStudent {

    private final String name;

    private final int magic;

    private final int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }



    public int getMagic() {
        return magic;
    }


    public int getTransgression() {
        return transgression;
    }



    private int ability() {
        return magic + transgression;
    }

    public void compareHogwarts (HogwartsStudent hogwartsStudent ) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент " + getName() + " лучше чем студент " + hogwartsStudent.getName() + " : " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент  " + getName() + " лучше чем студент " + hogwartsStudent.getName() + " : " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Студент " + getName() + " такой же, как студент " + hogwartsStudent.getName() + " : " + ability1 + " VS " + ability2);

        }
    }

    public void print() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return String.format("Студент %s; Сила магиии: %d; Сила трансгрессии: %d", name, magic, transgression);
    }
}
