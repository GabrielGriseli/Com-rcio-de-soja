package br.com.comercio.modelo;


public class QuantidadeInvalidaException extends Exception {

    private static final long serialVersionUID = -7646936181105482626L;
    private String msg;
    
    QuantidadeInvalidaException(String msg) {
      super(msg);
      this.msg = msg;
    }
    
    public String getMessage(){
      return msg;
    }
}
