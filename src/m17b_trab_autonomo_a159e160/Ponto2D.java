package m17b_trab_autonomo_a159e160;

/**
 * Classe Ponto2D, para instanciar objectos-coordenadas X e Y
 * @version 2.0, 18.fev.2021
 * @author João Sintra
 */
public class Ponto2D {
    /** coordenada X */
    private int x;
    /** coordenada Y */
    private int y;
    //--------------------------------------------------------------------------
    /**
    * Construtor da classe parametrizado com todos os atributos.
    * @param x coordenada x
    * @param y coordenada y
    */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    //--------------------------------------------------------------------------
    /**
    * Construtor sem parâmetros, que inicializa os atributos
    * com valores predefinidos conhecidos.
    */
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    //--------------------------------------------------------------------------
    /**
    * @return valor da coordenada X
    */
    public int getX() {
        return x;
    }
    //--------------------------------------------------------------------------
    /**
    * @param x para definir a coordenada x
    */
    
    public void setX(int x) {
        this.x = x;
    }
    //--------------------------------------------------------------------------
    /**
    * @return valor da coordenada Y
    */
    public int getY() {
        return y;
    }
    //--------------------------------------------------------------------------
    /**
    * @param y para definir a coordenada y
    */
    public void setY(int y) {
        this.y = y;
    }
    //--------------------------------------------------------------------------
     /**
    * @return a distancia de um objeto da classe Ponto2D a outro objeto da classe Ponto2D.
    */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    //--------------------------------------------------------------------------
    /**
    * 
    * @return uma string composta pelos atributos da classe.
    */
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
