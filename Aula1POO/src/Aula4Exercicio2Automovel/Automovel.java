package Aula4Exercicio2Automovel;

class Automovel {
    private String marca;
    private String modelo;

    public Automovel() {
        // Construtor padrão
    }

    public Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String imprimir() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

