import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гари Поттер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        GryffindorStudent hermione = generateGryffindorStudent("Гермиона Грейнджер");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent greg = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent goyle = generateSlytherinStudent("Грегори Гойл");
        HufflepuffStudent zachariah = generateHufflepuffStudent("Захария Сми");
        HufflepuffStudent cedric  = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent justin= generateHufflepuffStudent("Джастин Финч");
        RavenclawStudent zhou = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        RavenclawStudent marcus = generateRavenclawStudent("Маркус Белби");


        harry.print();
        ron.print();
        hermione.print();
        draco.print();
        greg.print();
        goyle.print();
        zachariah.print();
        cedric.print();
        justin.print();
        zhou.print();
        padma.print();
        marcus.print();



        cedric.compareHogwarts(harry);
        draco.compareHogwarts(goyle);

    }

    private static GryffindorStudent generateGryffindorStudent (String name){
    return new GryffindorStudent(name,
                 RANDOM.nextInt (100),
                 RANDOM.nextInt (100),
                 RANDOM.nextInt (100),
                 RANDOM.nextInt (100),
                 RANDOM.nextInt (100)
    );
    }
    private static HufflepuffStudent generateHufflepuffStudent (String name){
        return new HufflepuffStudent(name,
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100)
        );
    }
    private static RavenclawStudent generateRavenclawStudent (String name){
        return new RavenclawStudent(name,
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100)
        );
    }
    private static SlytherinStudent generateSlytherinStudent (String name){
        return new SlytherinStudent(name,
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100),
                RANDOM.nextInt (100)
        );
    }
}