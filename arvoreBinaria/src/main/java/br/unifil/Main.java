package br.unifil;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        System.out.println("Pré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.remover(1);
        System.out.println("Pré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
    }
}