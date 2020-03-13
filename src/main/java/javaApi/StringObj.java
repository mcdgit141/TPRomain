package javaApi;

public class StringObj {
    public static void main(String[] args) {
        String coucou = "Bonjour je suis Nicolas";
//1
        System.out.println(coucou.toUpperCase());

        System.out.println(coucou);
        //2
        int count = 0;
        for (int i = 0; i < coucou.length(); i++) {
            if(coucou.charAt(i)== 'a'){
                count++;
            }
        }
        System.out.println("Combien de a ? : "  + count);

        //3
        System.out.println(coucou.replace("a","4"));

        //4
        String coucou2 = coucou.substring(0,4) + coucou.substring(9);
        System.out.println(coucou2);


        //5
        Integer cinq = 5;
        System.out.println(cinq);
        String cinq2 = String.valueOf(5);
        System.out.println(cinq2);

        //6
        int monInt = Integer.parseInt("876");
        int leInt = Integer.valueOf("987");

        Chat chat = new Chat();
        Chat chat2 = new Chat();

        System.out.println(chat.equals(chat2));
        System.out.println(chat.hashCode() == chat2.hashCode());


    }


}
