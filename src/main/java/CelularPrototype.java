public abstract class CelularPrototype {

    protected String OS;
    protected float tamanhoTela;
    protected int tamanhoCamera;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public int getTamanhoCamera() {
        return tamanhoCamera;
    }

    public void setTamanhoCamera(int tamanhoCamera) {
        this.tamanhoCamera = tamanhoCamera;
    }

    public abstract String getInfoCelular();

    public abstract CelularPrototype clonar();

}
