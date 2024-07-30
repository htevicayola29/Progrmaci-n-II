public class Main_Cliente_1 {
    public static void main(String[] args) {
        Cliente_1 cliente1=new Cliente_1();
        cliente1.codigo=123;
        cliente1.nombre="Jaime";
        cliente1.telefono=12345678;
        System.out.println(cliente1.nombre);
        cliente1.imprimirDatos();
        System.out.println();


        Cliente_1 cliente2=new Cliente_1(123,"CARLOS");
        cliente2.imprimirDatos();
        System.out.println();


        Cliente_1 objeto=new Cliente_1(321,"JOSE MARIA",78685100);
        objeto.imprimirDatos();
    }
}
