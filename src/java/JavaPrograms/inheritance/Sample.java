package JavaPrograms.inheritance;

 class Sample {

        int mark1=90;
        int mark2=85;
    }
    class Example extends Sample{
             int given1= 40;
             int given2=60;


        public static void main(String[]args) {
            Example ab = new Example();
            System.out.println("mark1 is:" + ab.mark1);
            System.out.println("mark2 is:" + ab.mark2);
            System.out.println("given1 is:"+ab.given1);
            System.out.println("given2 is:"+ab.given2);


        }


    }

