public class Doctor {
    // Atributos... esto siempre va, no es como en python
    // Son variables globales para los métodos
    int id;
    String name;
    String speciality;

    // Primer constructor
    Doctor() {
        System.out.println("Te saluda el primer constructor");
    }

    // Segundo constructor
    Doctor(String name) {
        System.out.println("Te saluda el segundo constructor. El nombre del Doctor asignado es: " + name);
    }

    // Comportamientos
    public void showName() {
        System.out.println(name);
    }

}
