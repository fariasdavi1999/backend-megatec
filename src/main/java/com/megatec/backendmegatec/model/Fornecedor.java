package com.megatec.backendmegatec.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Fornecedor {

    // #region atributos

    @Id
    private String cnpj;

    private String nome_fornecedor;

    private String email_fornecedor;

    private String fone_fornecedor;
    // #endregion atributos

    // #region get and set
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    public String getFone_fornecedor() {
        return fone_fornecedor;
    }

    public void setFone_fornecedor(String fone_fornecedor) {
        this.fone_fornecedor = fone_fornecedor;
    }

    // #endregion get and set

}
