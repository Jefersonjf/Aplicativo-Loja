package statics;

import java.util.ArrayList;
import java.util.List;
import models.ClienteModel;
import models.ProdutoModel;
import models.UsuarioModel;

public class BancoLocalFake {
    
    public static List<ProdutoModel> produtosCadastrados = new ArrayList<ProdutoModel>();
    
    public static List<ClienteModel> consultarclientes = new ArrayList<ClienteModel>();
    
    public static List<UsuarioModel> usuarioCadastro = new ArrayList<UsuarioModel>();
    
    public static ProdutoModel produtosCadastrados(int numeroProdutoSelecionado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ClienteModel clientecadastrados(int numeroClienteSelecionado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static UsuarioModel usuarioCadastrado (int numeroUsuarioSelecionado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
