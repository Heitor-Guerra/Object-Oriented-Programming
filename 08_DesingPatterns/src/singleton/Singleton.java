package singleon;

public enum Singleton {
  INSTANCIA;

  private int intVal;
  private String stringVal;

  public void init(int intVal, String stringVal) {
    this.intVal = intVal;
    this.stringVal = stringVal;
  }

  
}
