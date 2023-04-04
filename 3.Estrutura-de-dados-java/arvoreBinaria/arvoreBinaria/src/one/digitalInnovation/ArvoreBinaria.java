package one.digitalInnovation;

public class ArvoreBinaria<T extends Comparable <T>> {

    private BinNo<T> raiz;
    public ArvoreBinaria(){
        this.raiz = null;
    }
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo())< 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoEsq(), novoNo));
        }
        return atual;
    }
    public void exibirEmOrdem(){
        System.out.println("\nexibindo em InOrdem");
        exibirEmOrdem(this.raiz);
    }
    private void exibirEmOrdem(BinNo<T> atual){
        if(atual != null){
            exibirEmOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ",");
            exibirEmOrdem(atual.getNoDir());
        }
    }
    public void exibirPosOrdem(){
        System.out.println("\nexibindo em PósOrdem");
        exibirPosOrdem(this.raiz);
    }
    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ",");
        }
    }

}
