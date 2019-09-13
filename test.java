package com.example.demo.controller.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {


        //  String [] dna = {"CTGAGA", "CTATGC", "TATTGT", "AGAGGG", "CCCCTA", "TCACTG"};
          // String [] dna = {"CTGAGA", "CTATGC", "TATTGT", "AGAGGG", "CCCCTA", "TCACTG"}; //original
         //  String [] dna = {"CXGAGA", "CTXTGC", "TATXGT", "AGAGXG", "CCCCTX", "TCACTG"};
        //  String [] dna = {"123456", "123456", "123456", "123456", "123456", "123456"};
      //  String[] dna = {"ABCDE1", "FGHIJ2", "KLMNO3", "PKRST4","UVXYZ5","POPXD6"};


        String[] dna = {
        "KSDFPONRWEQ",
        "KKSFPONWEQS",
        "KSKSPONRQEM",
        "KSDKSONQWEM",
        "KSDFKSQRWEM",
        "KSDFPKSRWEM",
        "KSDFQOKSWEM",
        "0SDQPONKSEM",
        "K1QFPONKKSM",
        "KQ2FPONKWKS",
        "QSD3PONKWKK"};



        int tamanho = dna.length;
        int inicio = 0;
        int fim = dna.length * 2;

        char[][] matriz = new char[tamanho][tamanho];

        //preenche
        int contador = 0;
        for (String s : dna) {
            matriz[contador] = s.toCharArray();
            contador++;
        }

//        for (int i = 0; i < tamanho; i++) {
//            for (int ii = 0; ii < tamanho; ii++) {
//                System.out.print( matriz[i][ii]+ "     ");
//            }
//            System.out.println();
//        }

        //procura diagonal meio pra baixo OK (VERMELHO))
//        String result = "";
//        for(int linha = 0; tamanho-linha != 3; linha++){
//            for(int coluna=0; coluna < tamanho-linha; coluna ++){
//                if(coluna==0){
//                    result = result + matriz[linha][0];
//                }else{
//                    result = result + matriz[linha+coluna][coluna];
//                }
//            }
//            System.out.println(result);
//            result = "";
//        }
//
//
//        //procura diagonal meio pra cima OK (AMARELO)
//        result = "";
//        for(int coluna = 1; tamanho-coluna != 3; coluna++){
//            int oldCol = 0;
//            int oldRow = 0;
//            for(int linha=0; linha < tamanho-coluna; linha ++){
//                if(linha==0){
//                    result = result + matriz[0][coluna];
//                    oldCol = coluna;
//                    oldRow = 0;
//
//                }else{
//                    oldRow+=1;
//                    oldCol+=1;
//                    result = result + matriz[oldRow][oldCol];
//                }
//            }
//            System.out.println(result);
//            result = "";
//        }



//        //procura direita pra esquerda meio pra cima OK (VERDE)
//        String result = "";
//        for(int linha = 1; tamanho-linha != 3; linha++){
//            int oldCol = tamanho-linha;
//            int oldRow = 0;
//            for(int linhaaaaa=0; linhaaaaa < tamanho-(linha-1); linhaaaaa ++){
//                if(linhaaaaa==0){
//                    result = result + matriz[0][tamanho - linha];
//                    oldCol = tamanho - linha;
//                    oldRow = 0;
//                }else{
//                    oldCol = oldCol-1;
//                    oldRow += 1;
//                    result = result + matriz[oldRow][oldCol];
//                }
//            }
//            System.out.println(result);
//            result = "";
//        }


//        //procura direita pra esquerda meio pra baixo OK (azul)
        String result = "";
        for(int linha = 1; tamanho-linha != 3; linha++){
            int oldCol = 0;
            int oldRow = 0;
            for(int coluna=0; coluna  < tamanho-linha ; coluna ++){
                if(coluna==0){
                    result = result + matriz[linha][tamanho-1];
                    oldCol = tamanho - 1;
                    oldRow = linha;
                }else{
                    oldCol = oldCol-1;
                    oldRow += 1;
                    result = result + matriz[oldRow][oldCol];
                }
            }
            System.out.println(result);
            result = "";
        }










//
//        for(int linha = 0; tamanho-linha != 3; linha++){
//            for(int coluna=0; coluna < tamanho-linha; coluna ++){
//                if(coluna==0){
//                    result = result + matriz[linha][0];
//                }else{
//                    result = result + matriz[linha+coluna][coluna];
//                }
//            }
//            System.out.println(result);
//            result = "";
//        }


    }

        //preenche
//        int cont = 0;
//        for (String s : dna) {
//            for (int c = 0; c < dna.length; c++) {
//                teste[cont][c] = s.charAt(c);
//            }
//            cont += 1;
//        }



//        Map<Integer, Character> matriz = new HashMap<>();
//        //preenche
//        int cont = 1;
//        for (String s : dna) {
//            for (int c = 0; c < s.length(); c++) {
//                char c1 = s.charAt(c);
//                matriz.put(cont+c, c1);
//            }
//            cont += dna.length;
//        }






//        direcao1 = {
//                primeiro = "";
//                for(b=-1 a dna.length)
//                    if(dna.length - b != 3)
//                        for(x = -1 a 100){
//                            primeiro = primeiro +  char[x+1][y+1];
//                        }
//                    }else{
//                       return;
//                        }
//                }
//
//        }
//
//        direcao2 = {
//                primeiro = "";
//                for(b=0 a dna.length)
//                    if(dna.length - b != 3)
//                        for(x = -1 a 100){
//                            primeiro = primeiro +  char[b+1][y+1];
//                        }
//                    }else{
//                        return;
//                    }
//                }
//
//                }
//
//
//
//
//
//
//
//





















//                Map<Integer, Character> matriz = new HashMap<>();
//        //preenche
//     //   int cont = 1;
//        for (String s : dna) {
//            validateString(dna);
//
//            for (int c = 0; c < s.length(); c++) {
//                char c1 = s.charAt(c);
//                matriz.put(cont+c, c1);
//            }
//            cont += dna.length;
//        }
//
//        //validate()
//        for (OrientacaoEnum orientacao : OrientacaoEnum.values()) {
//            String sequenceDNA = orientacao.valuess.stream()
//                    .map(p -> matriz.get(p).toString())
//                    .reduce("", String::concat);
//
//            if(dnaSimion.stream().anyMatch(sequenceDNA::contains)){
//                System.out.println("true " + sequenceDNA);
//            }
//        }
//
//    }
//
//    private static boolean validateString(String[] dna) {
//        if(dna.length != 6 || Arrays.stream(dna).anyMatch(d-> d.length() != 6))
//            throw new IllegalArgumentException();
//
//        return true;
//    }
//
//    static List<String> dnaSimion = Arrays.asList("CCCC","TTTT","GGGG","AAAA");


}



//exibe
//        for (int i = 0; i < tamanho; i++) {
//            for (int ii = 0; ii < tamanho; ii++) {
//                System.out.print( matriz[i][ii]);
//            }
//            System.out.println();
//        }



//procura direita pra esquerda
//       String result = "";
//        for(int coluna = 1; tamanho-coluna != 3; coluna++){
//            int oldCol = 0;
//            int oldRow = 0;
//            for(int linha=0; linha < tamanho-coluna; linha ++){
//                if(linha==0){
//                    result = result + matriz[0][coluna];
//                    oldCol = coluna;
//                    oldRow = 0;
//
//                }else{
//                    oldRow+=1;
//                    oldCol+=1;
//                    result = result + matriz[oldRow][oldCol];
//                }
//            }
//            System.out.println(result);
//            result = "";
//        }
//
//
