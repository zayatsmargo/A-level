package com.company.zayats.hw12;

public class ExceptionInsideBlock {
    public static void main() throws Exception{
        try{
            throw new Exception("Method main() threw an exception");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Was here");
        }
    }
}

