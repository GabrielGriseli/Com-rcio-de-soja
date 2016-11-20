
package br.edu.com.comercio.view;

import br.com.comercio.modelo.Movimento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class MovimentoTableModel extends AbstractTableModel{

     private List<Movimento> movimentos;
    
    public MovimentoTableModel(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }

    public void setMovimentos(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }

    @Override
    public int getRowCount() {
        return movimentos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Movimento movimento = movimentos.get(rowIndex);
        switch (columnIndex) {
            case 0: return movimento.getId();
            case 1: return movimento.getData();
            case 2: return movimento.getOpe();
            case 3: return movimento.getQuant();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id";
            case 1: return "Data";
            case 2: return "Operação";
            case 3: return "Quantidade";
            default:
                throw new AssertionError();
        }
    }
    
}
