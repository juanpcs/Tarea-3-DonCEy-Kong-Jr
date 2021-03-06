package Modelo;

public abstract class  Objeto {
    protected java.lang.Integer num;
    protected java.lang.Integer posX;
    protected java.lang.Integer posY;
    protected java.lang.String tipo;
    protected java.lang.Integer atributoEsp;

    public Objeto(java.lang.Integer num, java.lang.Integer posX,java.lang.Integer posY,java.lang.String tipo,java.lang.Integer esp){
        this.num=num;
        this.posX = posX;
        this.posY = posY;
        this.tipo = tipo;
        this.atributoEsp = esp;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAtributoEsp() {
        return atributoEsp;
    }

    public void setAtributoEsp(Integer atributoEsp) {
        this.atributoEsp = atributoEsp;
    }
}
