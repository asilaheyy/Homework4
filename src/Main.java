public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        //1.
        int age = 18;
            if (age>= 18) {
                System.out.println("Поздравляем с совершеннолетием!");
            }
            if (age<18){
                System.out.println("Вы не достигли совершеннолетнего возраста.");
            }
        //2.
        int personAge =17;
            if (personAge>=7){
                System.out.println("Вы в школе.");
            }
            if (personAge>=18){
                System.out.println("Вы окончили школу и можете поступать в университет.");
            }
            if (personAge>=24){
                System.out.println("Вы окончили университет и можете идти на работу.");
            }
            //3.

        int placesInWagon = 102;
        int seats = 60;
        int standing = 42;
            if (seats==0){
        System.out.println("В вагоне не осталось сидячих мест.");
            }
            if (seats>=1){
                System.out.println("В вагоне есть сидячие места.");
            }
            if (standing ==0){
                System.out.println("В вагоне не осталось стоячих мест.");
            }
            if (standing>=1){
        System.out.println("В вагоне остались стоячие места.");
            }
            if (placesInWagon ==0){
        System.out.println("В вагоне не осталось мест.");
             }
            if (placesInWagon >=1){
        System.out.println("В вагоне остались места");
            }
    }
}


