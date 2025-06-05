
package com.mycompany.fernandezq_parcial_1;

/**
 *
 * @author josep
 */
public class FernandezQ_parcial_1 {

    public String fernandez_nombre_string(String valor1)
    {
        return valor1;
    }
    public String fernandez_fecha_string(String valor1)
    {
        return valor1;
    }
    public String fernandez_grupo_string(String valor1)
    {
        return valor1;
    }
    public String fernandez_parcial_string(String valor1)
    {
        return valor1;
    }
    public float fernandez_velocidad_float(float distancia, float tiempo)
    {
        return (distancia/tiempo);
    }
    public String fernandez_frase_string(String valor1)
    {
        return valor1;
    }
    public static void main(String[] args) {
        FernandezQ_parcial_1 invocar_metodos=new FernandezQ_parcial_1();
        System.out.println("NOMBRE DEL ALUMNO: "+invocar_metodos.fernandez_nombre_string("JOSE FERNANDEZ QUINTANA"));
        System.out.println("FECHA DEL EXAMEN: "+invocar_metodos.fernandez_fecha_string("5 de Junio de 2025"));
        System.out.println("GRUPO DEL ALUMNO: "+invocar_metodos.fernandez_grupo_string("3.-B"));
        System.out.println("PARCIAL DEL EXAMEN: "+invocar_metodos.fernandez_parcial_string("Parcial 1"));
        System.out.println("VELOCIDAD A LA QUE VA EL VEHICULO: "+invocar_metodos.fernandez_velocidad_float(100,(float)3));
        System.out.println("FRASE MOTIVACIONAL: "+invocar_metodos.fernandez_frase_string("Para seguir adelante, siempre tendremos que superar nuestros límites mentales"));
    }
}
