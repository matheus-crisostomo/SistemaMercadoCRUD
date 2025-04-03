package Estoque;

public class Estoque {
    private String[] nome = new String[7];
    private int[] quantidade = new int[7];
    private float[] preco = new float[7];

    public Estoque() {
    }



    public void cadastrarItemEstoque(String nomeItem, int quantidade, float preco, int posicaoEstoque) {
        this.nome[posicaoEstoque] = nomeItem;
        this.quantidade[posicaoEstoque] = quantidade;
        this.preco[posicaoEstoque] = preco;
    }

    public void deleteItemEstoque(int posicaoEstoque) {
        nome[posicaoEstoque] = null;
        quantidade[posicaoEstoque] = 0;
        preco[posicaoEstoque] = 0;
    }

    public void getItemEstoque(int posicaoEstoque) {
        System.out.println(" ");
        System.out.println("ITEM " + (posicaoEstoque+1));
        System.out.println("Produto: " + nome[posicaoEstoque]);
        System.out.println("Quantidade: " + quantidade[posicaoEstoque]);
        System.out.println("Preço: R$" + preco[posicaoEstoque]);
    }

    //metodo para listar todos itens do estoque

    public void listarEstoque() {
        for (int i = 0; i < 7; i++) {
            if (nome[i] != null) {
                getItemEstoque(i);
            }
        }
    }

//    public String getNome(int posicao) {
//        if (nome[posicao] != null) {
//            return nome[posicao];
//        }
//        else{
//            return " ";
//        }
//    };

    public String getNomeEstoque(int posicao) {
        if (nome[posicao] != null) {
            return nome[posicao];
        }
        else{
            return " ";
        }
    }
}
