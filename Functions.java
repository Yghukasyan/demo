class Functions {public static void main (String[]args)

{
   System.out.println("Hello");

int number = 15;

        if (number == 15) {

            System.out.println("number is 15");

       } else {

            System.out.println("number is not 15");
        }

int a = 17;
        // ||- kam
        if (a == 15 || a == 16 ) {

        System.out.println("a is 15 or 16");

    } else {

         System.out.println("a is not 15 or 16");
    }

int b = 20;
    // &&- ev
         if (b >= 18 && b <= 21 ) {

         System.out.println("b is 20 or 20");

    } else {

          System.out.println("b is not 20 or 20");
    }
int n = 15;
         if (n % 3 == 0){

             System.out.println("number is divided to 3");
         }

    switch (a) {
        case 8:
            System.out.println("number is 8");
            break;
        case 17:
            System.out.println("number is 17");
            break;
        default:
            break;
    }
         // cikler!!!
//    for (int i=0; i<=15; ++i) {
//        System.out.println(" i = " + i);
//    }
//    int v = 10;
//    while (v < 15) {
//        // code
//        ++v;
//    }

//    do {
//
//    } while ();

int c = 10;
         while (true) {
             ++c;
             if (c == 13) {
                 continue;
             }
             System.out.println(" c = " + c);
             if (c == 15) {
                 break;
             }
         }
         // bajanararneri qanak
int d = 18;
int count = 0;
   for (int i = 2; i < d; ++i) {
       if (d % i == 0) {
           ++count;
       }

       System.out.println(" count = " + count);
       if (count == 0) {
           System.out.println(" Yes ");
       } else {
           System.out.println(" no ");
       }
   }
}
}
