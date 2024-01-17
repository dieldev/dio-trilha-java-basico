package Model;

public class DadosConta {
    
    private int numero = 1021;
    private String agencia = "067-8";
    private String nomeCliente = "MARIO ANDRADE";
    private double saldo = 237.48;
    
    public DadosConta() {
    }

    public DadosConta(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
        long temp;
        temp = Double.doubleToLongBits(saldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DadosConta other = (DadosConta) obj;
        if (numero != other.numero)
            return false;
        if (agencia == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        if (nomeCliente == null) {
            if (other.nomeCliente != null)
                return false;
        } else if (!nomeCliente.equals(other.nomeCliente))
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + String.valueOf(agencia) + ", conta " + String.valueOf(numero) + " e seu saldo " + String.valueOf(saldo) + " já está disponível para saque.";
    }
}
