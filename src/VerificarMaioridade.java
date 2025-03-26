public class VerificarMaioridade {

    private int idade;
    private String resultado;

    public VerificarMaioridade(int meta){
        this.idade = idade;
    }
    public String  verificarIdade(int idade){
        if (idade >=18){
            resultado = "Maior de idade";
        }else{
            resultado = "Menor de idade";
        }
        return resultado;
    }
}
