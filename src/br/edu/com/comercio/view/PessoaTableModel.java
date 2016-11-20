package br.edu.com.comercio.view;

import br.com.comercio.modelo.Pessoa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class PessoaTableModel extends AbstractTableModel{

    private List<Pessoa> pessoas;
    
    public PessoaTableModel(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int getRowCount() {
        return pessoas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pessoa pessoa = pessoas.get(rowIndex);
        switch (columnIndex) {
            case 0: return pessoa.getId();
            case 1: return pessoa.getNome();
            case 2: return pessoa.getSaldo();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id";
            case 1: return "Nome";
            case 2: return "Saldo";
            default:
                throw new AssertionError();
        }
    }
    
    public void limpar() {
        pessoas.clear();
        fireTableDataChanged();
    }
}
