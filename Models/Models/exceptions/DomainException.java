package Models.exceptions;

public  class DomainException extends Exception{ //or extends RuntimeException
      private static final long serialVersionUID = 1L;

      public DomainException(String msg){
          super(msg);

      }
}
