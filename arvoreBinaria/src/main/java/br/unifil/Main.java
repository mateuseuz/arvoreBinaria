package br.unifil;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        System.out.println("\nPré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());

        arvoreBinaria.remover(9);

        arvoreBinaria.inserir(9);
        arvoreBinaria.inserir(6);
        arvoreBinaria.inserir(2);
        arvoreBinaria.inserir(19);
        arvoreBinaria.inserir(5);
        arvoreBinaria.inserir(24);
        arvoreBinaria.inserir(13);
        arvoreBinaria.inserir(4);
        arvoreBinaria.inserir(10);

        System.out.println("\nPré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());

        arvoreBinaria.remover(9);

        System.out.println("\nPré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());

        arvoreBinaria.remover(9);
        arvoreBinaria.remover(19);
        arvoreBinaria.remover(13);
        arvoreBinaria.remover(4);

        System.out.println("\nPré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());

        arvoreBinaria.remover(6);
        arvoreBinaria.remover(2);
        arvoreBinaria.remover(5);
        arvoreBinaria.remover(24);
        arvoreBinaria.remover(10);

        System.out.println("\nPré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());

        arvoreBinaria.remover(6);
        arvoreBinaria.remover(2);
        arvoreBinaria.remover(5);
        arvoreBinaria.remover(24);
        arvoreBinaria.remover(10);

    }
}