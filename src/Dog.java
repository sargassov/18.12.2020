import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
        barrierRunDistance = 500;
        barrireJumpDistance = 0.5;
        barrierSwimDistance = 10;
        System.out.println("Создан " + name);
    }

    public Dog(String name, int runDistance, double jumpDistance, int swimDistance){
        this.name = name;
        barrierRunDistance = runDistance;
        barrireJumpDistance = jumpDistance;
        barrierSwimDistance = swimDistance;
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
        if(distance <= barrierSwimDistance)
            System.out.println(name + " проплыл " + distance + " метров.");
        else System.out.println(distance + " метров - слишком большая дистаниция для " + name);

    }

    @Override
    void jump(double height) {
        if(height <= barrireJumpDistance)
            System.out.println(name + " прыгнул на высоту " + height + " метров.");
        else System.out.println(height + " метров - слишком большая высота прыжка для " + name);
    }
}
