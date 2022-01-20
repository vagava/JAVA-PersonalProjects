package com.vanessadev.encapsulation;

public class Book {
    // los atributos de una clase deben ser siempre privados
    private String title;
    private String author;
    private boolean available;

    // getter y setter: sirven para acceder a atributos provados desde otra clase
    /*
        - Debe ser publico para que sepueda acceder desde otras clases
        - debe tener un tipo de retorno del mismo tipo que el atributo que va a retornar
        - debe iniciar con la palabra "get"
     */

    public String getTitle() {
        return title;
    }
    /*
        - Debe ser publico para que sepueda acceder desde otras clases
        - No retorna nada, por esto estipo void.
        - debe recibir como paramametro una variable del mismo tipo que el atributo que se va a modificar
        - debe iniciar con la palabra "set"
     */

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
