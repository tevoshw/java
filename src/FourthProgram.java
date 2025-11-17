public class FourthProgram {
    static void main(String[] args) {
        int age = 18;
        String name = "Josh";
        String result = String.format("Your name is %s and your age is %d", name, age);
        System.out.println(result);
        Boolean access = false;
        if (age < 18 || access == false){
            System.out.println("Menor de idade ou acesso negado");
        }else{
            System.out.println("Maior de idade e acesso ok");
        }
    }
}
