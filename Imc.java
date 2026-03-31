void main(){
    IO.println("=== Cálculo de IMC ===");
    String nome = IO.readln("Informe seu nome: ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefiro não informar)").charAt(0);
    double altura = Double.parseDouble(IO.readln("Informe sua altura (em metros): "));
    double peso = Double.parseDouble(IO.readln("Informe seu peso (em quilos): "));
    double imc = peso / (altura * altura);
    String classificacao = "";

    
}