public class ConditionalStatement{
    public static void main(String[] args){

        int age = 20;
        boolean male;
        float height = 1.80f;
        if (age > 19){
            System.out.println("Вы старше 20 лет");
        }
        if (male = true){
            System.out.println("Вы мужского пола");
        }
        if (male = !true){
            System.out.println("Вы женского пола");
        }
        if (height < 1.80){
            System.out.println("Ваш рост ниже 1.80");
        }
        else{
            System.out.println("Неподходящие данные");
         }

        char yourNameBeginM;
        char yourNameBeginI;
        if (Character.isUpperCase('M')) {
            System.out.println("Maxim");
        }
        else if (Character.isUpperCase('I')) {
            System.out.println("Igor");
        }
        else{
        System.out.println("Ваше имя не совпадает");
        }
    }
}

