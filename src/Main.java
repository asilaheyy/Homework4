public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
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
    }
}


