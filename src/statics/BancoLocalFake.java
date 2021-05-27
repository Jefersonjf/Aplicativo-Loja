package statics;

import java.util.ArrayList;
import java.util.List;
import models.ClienteModel;
import models.ProdutoModel;

public class BancoLocalFake {
    
    public static List<ProdutoModel> produtosCadastrados = new ArrayList<ProdutoModel>();
    
    public static List<ClienteModel> consultarclientes = new ArrayList<ClienteModel>();

    public static ProdutoModel produtosCadastrados(int numeroProdutoSelecionado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
