public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1,2
        //1.
        int age = 18;
            if (age>=18) {
                System.out.println("Поздравляем с совершеннолетием!");
            }
            else {
                System.out.println("Вы не достигли совершеннолетнего возраста.");
            }
        //2.
        int personAge =24;
            if (personAge>= 7 && personAge <18){
                System.out.println("Вы в школе.");
            }

           else if (personAge>=18 && personAge <24){
        System.out.println("Вы можете поступать в университет.");
             }

            else{
                System.out.println("Вы можете идти на работу.");
            }
            //3.

        int placesInWagon = 102;
        int seats = 60;
        int standing = 42;
            if (seats==0){
        System.out.println("В вагоне не осталось сидячих мест.");
            }
            else {
                System.out.println("В вагоне есть сидячие места.");
            }
            if (standing ==0){
                System.out.println("В вагоне не осталось стоячих мест.");
            }
            else {
        System.out.println("В вагоне остались стоячие места.");
            }
            if (placesInWagon ==0){
        System.out.println("В вагоне не осталось мест.");
             }
            else {
        System.out.println("В вагоне остались места");
            }

            //Домашнее задание 3
            //1.
        int PersonAge =18;
            if(PersonAge>=2 && PersonAge<=6){
                System.out.println("Если возраст человека равен"+PersonAge+", то ему нужно ходить в садик.");
            }
            else if (PersonAge>=7 && PersonAge<=18){
                System.out.println("Если возраст человека равен "+PersonAge+", то ему нужно ходить в школу.");
            }
            else if (PersonAge>18 && PersonAge<24){
                System.out.println("Если возраст человека равен "+PersonAge+", то ему нужно ходить в университет.");
            }
            else {
                System.out.println("Если возраст человека равен "+PersonAge+", то ему нужно ходить на работу.");
            }

            //2.
        int ageForAttraction =8;
            if(ageForAttraction<5){
                System.out.println("Ребенок не может кататься на аттракционе.");
            }
            else if (ageForAttraction>5 && ageForAttraction<14){
                System.out.println("Ребенок может кататься на аттракционе в сопровождении взрослого.");
            }
            else {
                System.out.println("Ребенок может кататься без сопровождения.");
            }
            //3.
            int one=57;
            int two=9;
            int three=83;
            if(one>two && one>three){
                System.out.println("Самое большее из чисел: "+one);
            }
            else if(two>one && two>three){
                System.out.println("Самое большее из чисел: "+two);
            }
            else if(three>one && three>two){
                System.out.println("Самое большее из чисел:"+three);
            }
    }
}


