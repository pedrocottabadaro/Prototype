public class CelularAndroid extends CelularPrototype{

    protected CelularAndroid(CelularAndroid celular){
        this.OS = "Android 10";
        this.tamanhoTela = 15;
        this.tamanhoCamera = 8;
    }

    public CelularAndroid() {
        super();
    }

    @Override
    public String getInfoCelular() {
        System.out.println("Info do celular : \n");
        System.out.println("SO:" + this.OS+ "\n");
        System.out.println("Tamanho Tela:" + this.tamanhoTela+ "\n");
        System.out.println("Tamanho Camera:" + this.tamanhoCamera + "\n");

        return null;
    }

    @Override
    public CelularPrototype clonar() {
        return new CelularAndroid(this);
    }
}
