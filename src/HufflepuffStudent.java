public class HufflepuffStudent extends  HogwartsStudent {

    private final int diligence;

    private final int loyalty;

    private final int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }



    public int getLoyalty() {
        return loyalty;
    }



    public int getHonesty() {
        return honesty;
    }


    public int ability() {
        return diligence + loyalty + honesty;
    }
    public void compareHogwarts (HufflepuffStudent hufflepuffStudent ) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Пуфендуец " + getNameAndSurname() + " лучше чем Пуфендуец " +  hufflepuffStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Пуфендуец " + getNameAndSurname() + " лучше чем Пуфендуец " +  hufflepuffStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Пуфендуец " + getNameAndSurname() + " такой же,как и Пуфендуец " +  hufflepuffStudent.getNameAndSurname() + " : " + ability1 + " VS " + ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; Трудолюбивость :  %d; Верность : %d; Честность : %d",super.toString(), diligence, loyalty, honesty);
    }
}
