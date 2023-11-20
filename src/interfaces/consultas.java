package interfaces;

import java.sql.Connection;

public interface consultas {
    
    public abstract Connection conectar();
    
    public abstract void desconectar();
}
