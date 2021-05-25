package statics;

import java.util.ArrayList;
import java.util.List;
import models.ClienteModel;
import models.ProdutoModel;

public class BancoLocalFake {
    
    public static List<ProdutoModel> produtosCadastrados = new ArrayList<ProdutoModel>();
    
    public static List<ClienteModel> consultarclientes = new ArrayList<ClienteModel>();
}
