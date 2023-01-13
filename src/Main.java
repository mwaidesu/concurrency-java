public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
////                System.out.println("Hello from another threead");
//                for (int i = 0; i <5; i++){
//                    System.out.println("Printing " + i + " in a worker thread");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//
//        });
//
//        thread.start();
//
//        for (int i = 0; i <5; i++){
//            System.out.println("Printing " + i + " in main thread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        int a =2;
        int b = 0;

        String name = null;

        try {
//            System.out.println(a / b);
              name.equals("Bob");
        }catch(NullPointerException e){

            System.out.println("Name was null");
        }

    }
}