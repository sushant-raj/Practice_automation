package Exception;

public class DemoException {

    void stuff() {
            doStuff();
            System.out.println(1);
        }
        void doStuff() {
            //doMoreStuff();
            try{
                doMoreStuff();
            }
            catch (Exception e) {
                System.out.println("Handled...");
            }

            System.out.println(2);
        }

        void doMoreStuff(){
            doMoreAndMoreStuff();
            System.out.println(3);
        }
        void doMoreAndMoreStuff(){
            System.out.println(10/0);
            System.out.println(4);
        }
        public static void main(String[] args)  {
            DemoException e = new DemoException();
            e.stuff();
        }
}


