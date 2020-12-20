import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Cat extends Animal {

    public Cat(String name){
        this.name = name;
        barrierRunDistance = 200;
        barrireJumpDistance = 2.0;
        System.out.println("Создан " + name);
    }

    public Cat(String name, int runDistance, double jumpDistance){
        this.name = name;
        barrierRunDistance = runDistance;
        barrireJumpDistance = jumpDistance;
        System.out.println("Создан " + name);
    }

    @Override
    void run(int distance) {
        if(distance <= barrierRunDistance)
            System.out.println(name + " пробежал " + distance + " метров.");
        else System.out.println(distance + " метров - слишком большая дистаниция для " + name);
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    @Override
    void jump(double height) {
        if(height <= barrireJumpDistance)
            System.out.println(name + " прыгнул на высоту " + height + " метров.");
        else System.out.println(height + " метров - слишком большая высота прыжка для " + name);
    }
}
