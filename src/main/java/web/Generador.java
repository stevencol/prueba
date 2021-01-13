package web;


import web.Mail;


public class Generador {

    public static void generar() {
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean sad = true;
        String g, f, h;
        while (sad) {

            n1 = (int) (Math.random() * (43 - 1 + 1) + 1);
            n2 = (int) (Math.random() * (43 - 1 + 1) + 1);
            n3 = (int) (Math.random() * (43 - 1 + 1) + 1);
            n4 = (int) (Math.random() * (43 - 1 + 1) + 1);
            n5 = (int) (Math.random() * (43 - 1 + 1) + 1);
            n6 = (int) (Math.random() * (16 - 1 + 1) + 1);
            if (n1 == 6 && n2 == 29 && n3 == 37 && n4 == 39 && n5 == 43 && n6 == 13) {
                g = n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6;
                n1 = (int) (Math.random() * (43 - 1 + 1) + 1);
                n2 = (int) (Math.random() * (43 - 1 + 1) + 1);
                n3 = (int) (Math.random() * (43 - 1 + 1) + 1);
                n4 = (int) (Math.random() * (43 - 1 + 1) + 1);
                n5 = (int) (Math.random() * (43 - 1 + 1) + 1);
                n6 = (int) (Math.random() * (16 - 1 + 1) + 1);
                if (n1 == 8 && n2 == 28 && n3 == 33 && n4 == 41 && n5 == 43 && n6 == 4) {
                    f = n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6;
                    n1 = (int) (Math.random() * (43 - 1 + 1) + 1);
                    n2 = (int) (Math.random() * (43 - 1 + 1) + 1);
                    n3 = (int) (Math.random() * (43 - 1 + 1) + 1);
                    n4 = (int) (Math.random() * (43 - 1 + 1) + 1);
                    n5 = (int) (Math.random() * (43 - 1 + 1) + 1);
                    n6 = (int) (Math.random() * (16 - 1 + 1) + 1);
                    h = n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6;
                    Mail send = new Mail();
                    send.sendMail(g + "\n  " + f + "\n  " + h);
                    sad = false;

                }

            }

            System.out.println(n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6);
        }
    }

}
