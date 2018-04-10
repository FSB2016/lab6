import java.util.Scanner;
class Horse{
    public
    String name;
    String enter(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str;
    }
    Horse(){
        System.out.print("\nВведите имя лошади. " );
        name = enter();
    }
}
class Pegas extends Horse{
    public
    Pegas(){
        System.out.print("\nСейчас полетит лошадь с именем " + name + '\n');
    }
}

class Pet{
    public
    String weight, gender, age;
    String enter(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str;
    }
    Pet(){
        System.out.print("\nВведите данные для вашего питомца\nВес (кг):");
        weight = enter();
        System.out.print("\nПол :");
        gender = enter();
        System.out.print("\nВозраст :");
        age = enter();
    }
}
class Cat extends Pet {
    private
    String name;
    public

    String getName(){ return this.name; }
    void setName(String buff){ this.name = buff; }

    static void print(String name,String weight,String gender,String age){
        System.out.print("\nИнформация о вашем коте\nИмя : " + name);
        System.out.print("\nВес (кг): " + weight);
        System.out.print("\nПол : " + gender);
        System.out.print("\nВозраст : " + age);
    }
    Cat(){
        System.out.print("\nВведите имя вашего кота ");
        setName(enter());
        print(name, weight, gender, age);
    }
}
class Dog extends Pet{
    public
    String name;
    static void print(String name,String weight,String gender,String age){
        System.out.print("\nИнформация о вашей собаке\nИмя : " + name);
        System.out.print("\nВес (кг): " + weight);
        System.out.print("\nПол : " + gender);
        System.out.print("\nВозраст : " + age);
    }
    Dog(){
        System.out.print("\nВведите имя вашей собаки ");
        name = enter();
        print(name, weight, gender, age);
    }
}

class Fish{
    private void show(){
        System.out.print("\nВаш образец эволюционировал до рыбы\n");
        System.out.print("Вес : " + weight);
        System.out.print("\nПол : " + gender);
    }
    public
    String weight, gender;
    String enter(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str;
    }
    Fish(){
         System.out.print("\nВведите вес");
         weight = enter();
         System.out.print("\nВведите пол");
         gender = enter();
         show();
    }
}
class Animal extends Fish{
    private void show(){
        System.out.print("\nВаш образец эволюционировал до животного\n");
        System.out.print("Вес : " + weight);
        System.out.print("\nПол : " + gender);
        System.out.print("\nНог : " + leg);
    }
    public
    String leg;
    Animal(){
        System.out.print("\nВведите количество конечностей ");
        leg = enter();
        show();
    }
}
class Ape extends Animal{
    private void show(){
        System.out.print("\nВаш образец эволюционировал до обезьяны\n");
        System.out.print("Вес : " + weight);
        System.out.print("\nПол : " + gender);
        System.out.print("\nНог : " + leg);
        System.out.print("\nУровень IQ : " + smart);
    }
    public
    String smart;
    Ape(){
        System.out.print("\nВведите уровень IQ ");
        smart = enter();
        show();
    }
}
class Human extends Ape{
    private   void show(){
        System.out.print("\nВаш образец эволюционировал до человека\n");
        System.out.print("Вес : " + weight);
        System.out.print("\nПол : " + gender);
        System.out.print("\nНог : " + leg);
        System.out.print("\nУровень IQ : " + smart);
        System.out.print("\nСписок полученных образований: " + education);
    }
    public
    String education;
    Human(){
        System.out.print("\nПеречислите полученные образования ");
        education = enter();
        show();
    }
}

class Main{
    public static void main(String argc[]){
        System.out.print("\nЗапускаем в полёт лошадь ");
        Pegas p = new Pegas();

        System.out.print("\n заводим домашнего кота\n");
        Cat c = new Cat();

        System.out.print("\nЗаводим домашнего пёсика\n");
        Dog d = new Dog();

        System.out.print("\nЗапускаем новый образец эволюционировть\n");
        Fish a = new Fish();

        System.out.print("\nЗапускаем новый образец эволюционировть\n");
        Human man = new Human();
    }
}