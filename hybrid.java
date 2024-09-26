interface PAPA {
    void display();
}
interface MAMA {
    void print();
}

class UNCLE implements PAPA {
    public void display() {
        System.out.println("This is the UNCLE class implementing the PAPA interface");
    }

    void greet() {
        System.out.println("hello from the UNCLE class");
    }
}

class SON implements PAPA, MAMA {
    public void display() {
        System.out.println("This is the SON class implementing the PAPA interface");
    }

    public void print() {
        System.out.println("This is the SON class implementing the MAMA interface");
    }

    void show() {
        System.out.println("This is the SON class");
    }
}

public class hybrid {
    public static void main(String[] args) {
        SON son = new SON();
        son.display();
        son.print();
        son.show();

        UNCLE obj = new UNCLE();
        obj.display();
        obj.greet();
    }
}
