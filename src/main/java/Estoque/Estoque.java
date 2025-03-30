package Estoque;

public class Estoque {
    private String[] estoque = new String[7];
    private int[] quantidade = new int[7];
    private float[] preco = new float[7];

    public Estoque() {
    }

    public void cadastrarItemEstoque(String nomeItem, int quantidade, float preco, int posicaoEstoque) {
        this.estoque[posicaoEstoque] = nomeItem;
        this.quantidade[posicaoEstoque] = quantidade;
        this.preco[posicaoEstoque] = preco;
    }

    public void deleteItemEstoque(int posicaoEstoque) {
        estoque[posicaoEstoque] = null;
        quantidade[posicaoEstoque] = 0;
        preco[posicaoEstoque] = 0;
    }

    public void getItemEstoque(int posicaoEstoque) {
        System.out.println(" ");
        System.out.println("ITEM " + (posicaoEstoque++));
        System.out.println("Produto: " + estoque[posicaoEstoque]);
        System.out.println("Quantidade: " + quantidade[posicaoEstoque]);
        System.out.println("Preço: " + preco[posicaoEstoque]);
    }

    public void listarEstoque() {
        for (int i = 0; i < 7; i++) {
            if (estoque[i] != null) {
                getItemEstoque(i);
            }
        }
    }

    public String getNomeEstoque(int posicaoEstoque) {
        return estoque[posicaoEstoque];
    }
}
