/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocadastroproduto;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author pc
 */
public class Produto {
 
        private String Produto;

    public static final String PROP_PRODUTO = "Produto";

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        String oldProduto = this.Produto;
        this.Produto = Produto;
        propertyChangeSupport.firePropertyChange(PROP_PRODUTO, oldProduto, Produto);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

        private int Quantidade;

    public static final String PROP_QUANTIDADE = "Quantidade";

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        int oldQuantidade = this.Quantidade;
        this.Quantidade = Quantidade;
        propertyChangeSupport.firePropertyChange(PROP_QUANTIDADE, oldQuantidade, Quantidade);
    }

    private String Data;

    public static final String PROP_DATA = "Data";

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        String oldData = this.Data;
        this.Data = Data;
        propertyChangeSupport.firePropertyChange(PROP_DATA, oldData, Data);
    }

}
