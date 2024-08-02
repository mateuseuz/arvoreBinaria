package br.unifil;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public No getRaiz() {
        return this.raiz;
    }

    public void inserir(int conteudo) {
        No novoNo = new No(conteudo);
        if (this.raiz == null) {
            this.raiz = novoNo;
        } else {
            No atual = this.raiz;
            No pai = null;
            boolean esquerda = false;
            while (atual != null) {
                if (novoNo.getConteudo() < atual.getConteudo()) {
                    pai = atual;
                    atual = atual.getNoEsq();
                    esquerda = true;
                } else {
                    pai = atual;
                    atual = atual.getNoDir();
                    esquerda = false;
                }
            }

            if (esquerda) {
                pai.setNoEsq(novoNo);
            } else {
                pai.setNoDir(novoNo);
            }
        }
    }

    public void preOrdem(No no) {
        if (no == null) {
            return;
        }
        System.out.print(no.getConteudo() + " ");
        preOrdem(no.getNoEsq());
        preOrdem(no.getNoDir());
    }

    public void emOrdem(No no) {
        if (no == null) {
            return;
        }
        emOrdem(no.getNoEsq());
        System.out.print(no.getConteudo() + " ");
        emOrdem(no.getNoDir());
    }

    public void posOrdem(No no) {
        if (no == null) {
            return;
        }
        posOrdem(no.getNoEsq());
        posOrdem(no.getNoDir());
        System.out.print(no.getConteudo() + " ");
    }

    public void remover(int conteudo) {
        try {
            No atual = this.raiz;
            No pai = null;
            No filho = null;
            No temporario = null;

            while(atual != null && atual.getConteudo() != conteudo) {
                pai = atual;

                if(conteudo < atual.getConteudo()) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if(atual == null) {
                return;
            }

            if(pai == null) {
                if(atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if(atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    temporario = atual;
                    filho = atual.getNoDir();

                    while(filho.getNoEsq() != null) {
                        temporario = filho;
                        filho = filho.getNoEsq();
                    }

                    if(filho != atual.getNoDir()) {
                        temporario.setNoEsq(filho.getNoDir());
                        filho.setNoDir(atual.getNoDir());
                    }

                    filho.setNoEsq(atual.getNoEsq());
                    this.raiz = filho;
                }
            } else {
                // Nó com nenhum filho (nó folha)
                if (atual.getNoDir() == null && atual.getNoEsq() == null) {
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(null);
                    } else {
                        pai.setNoDir(null);
                    }
                }
                // Nó com um filho à esquerda
                else if (atual.getNoDir() == null) {
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(atual.getNoEsq());
                    } else {
                        pai.setNoDir(atual.getNoEsq());
                    }
                }
                // Nó com um filho à direita
                else if (atual.getNoEsq() == null) {
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(atual.getNoDir());
                    } else {
                        pai.setNoDir(atual.getNoDir());
                    }
                }
                // Nó com dois filhos
                else {
                    temporario = atual;
                    filho = atual.getNoEsq();

                    while (filho.getNoDir() != null) {
                        temporario = filho;
                        filho = filho.getNoDir();
                    }

                    if (filho != atual.getNoEsq()) {
                        temporario.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }

                    filho.setNoDir(atual.getNoDir());

                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("\nA árvore não possui o elemento inserido!");
        }
    }
}