public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.print("Задача 1"+"\ndog="+dog+"\ncat="+cat+"\npaper="+paper);
        var tmp=4;
        dog+=tmp;
        cat+=tmp;
        paper+=tmp;
        System.out.print("\nЗадача 2"+"\ndog="+dog+"\ncat="+cat+"\npaper="+paper);
        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.print("\nЗадача 3"+"\ndog="+dog+"\ncat="+cat+"\npaper="+paper+'\n');

        System.out.println("\nЗадача 4");
        var friend=19;
        System.out.println("friend="+friend);
        friend+=2;
        System.out.println("friend="+friend);
        friend/=7;
        System.out.println("friend="+friend);

        System.out.println("\nЗадача 5");
        var frog=3.5;
        System.out.println("frog="+frog);
        frog*=10;
        System.out.println("frog="+frog);
        frog/=3.5;
        System.out.println("frog="+frog);
        frog+=4;
        System.out.println("frog="+frog);

        System.out.println("\nЗадача 6");
        var massBoxer1=78.2; var massBoxer2=82.7;
        var overallMass=0.0; var oddsMass=0.0;

        if(massBoxer1<massBoxer2)
        {
            oddsMass=massBoxer2-massBoxer1;
        }
        else {
            oddsMass=massBoxer1-massBoxer2;
        }

        overallMass=massBoxer1+massBoxer2;
        System.out.println("Масса первого "+massBoxer1+"кг\nМасса второго "+massBoxer2+"кг\nРазница между ними "+oddsMass+"кг\nОбщая масса "+overallMass+"кг");
        System.out.println("\nЗадача 7");
        var pieceOfMass=0.0;

        if(massBoxer1<massBoxer2)
        {
            pieceOfMass=massBoxer2%massBoxer1;
        }
        else {
            pieceOfMass=massBoxer1%massBoxer2;
        }
        System.out.println("Остаток от деления большей массы на меньшую "+pieceOfMass+"кг");

        var allTime=640.0;
        var timeOfOne=8.0;
        var allPiople=allTime/timeOfOne;
        System.out.println("\nЗадача 8"+"\nВсего работников в компании "+allPiople+" человек");
        System.out.println("Если в компании работает "+(allPiople+94)+" человек, то всего "+(640/(allPiople+94))+" часов работы может быть поделено между сотрудниками");
    }
}