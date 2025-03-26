public class CategoriasDeProdutos {
    private int codigoProduto;

        public CategoriasDeProdutos(int codigoProduto){
            this.codigoProduto = codigoProduto;
        }
        public void escolheCategoria(int codigoProduto){
            String categoria;
            switch (codigoProduto){
                case 1:
                    categoria = " Eletrônicos";
                    break;
                case 2:
                    categoria = "Alimentos";
                    break;
                case 3:
                    categoria = "Vestuário";
                    break;
                case 4:
                    categoria = " Livros";
                default:
                    categoria = "Não encontrado";
            }
            System.out.println("Codigo do Produto " +codigoProduto);
        }
    }


