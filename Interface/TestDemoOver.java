package Interface;

interface TestDemoOver {
    void meth();
}

class Test implements TestDemoOver{
    //@Override
    public void meth() {
        System.out.println("Hie Hello");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.meth();
    }
}

