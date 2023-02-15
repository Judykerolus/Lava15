package class25;

public class MovAbleTester {
    public static void main(String[] args) {
        MovAble[] move={new Car(), new Dog()};
        for(MovAble m:move){
            m.move();
        }
        OwnAble [] own={new Car(), new Dog()};
        for(OwnAble o:own){
            o.own();
        }
    }

    }

