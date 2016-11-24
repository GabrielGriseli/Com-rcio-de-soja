package br.com.comercio.modelo;


public class QuantidadeInvalidaException extends Exception{
    String msg;
    
    QuantidadeInvalidaException(String msg){
      super(msg);
      this.msg = msg;
    }
    
    public String getMessage(){
      return msg;
    }
}
