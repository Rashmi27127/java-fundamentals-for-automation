abstract class Car
{
public abstract void drive();

public void playmusic()
{
    System.out.println("playmusic");
}

public abstract void flying();
}

abstract class Bmw extends Car{
public void drive()
{
    System.out.println("used the drive feature");
}
}
class updateCar extends Bmw{
public void flying()
    {
        System.out.println("flying");
        }

}

public class Abstract{
    public static void main(String[] args) {

        Car obj= new updateCar();
        obj.playmusic();
        obj.drive();
        obj.flying();
        
    }
}

