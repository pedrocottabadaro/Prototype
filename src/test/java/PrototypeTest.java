public class PrototypeTest {

    public static void main(String[] args){
        CelularAndroid celularPrototype= new CelularAndroid();
        CelularPrototype novoCelular= celularPrototype.clonar();
        novoCelular.setOS("Android");
        novoCelular.setTamanhoCamera(15);
        novoCelular.setTamanhoTela(10);
        novoCelular.getInfoCelular();
    }
}
