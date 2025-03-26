public class VerificarAprovacao {

    private int nota;
    private String resultado;

    public VerificarAprovacao(int meta) {
        this.nota = nota;
    }

    public String verificarNota(int nota) {
        if(nota >= 6) {
            System.out.println("Aprovado");
        }else if (nota >=5){
            resultado = "Recuperação";
        }else{
            resultado = "Reprovado";
        }
        return resultado;
    }
}
