/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connections;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author rafae
 */

public class DriverConnections {

    /**
     * Método para manejar la conexión a la base de datos.
     */
    public static void manejarConexion() {
        Connection conexion = null;
        try {
            // Establecer la conexión
            conexion = JavaConnectionsSql.obtenerInstancia().establecerConexion();

            // Aquí puedes realizar operaciones con la conexión, como ejecutar consultas SQL, etc.

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Siempre es buena práctica cerrar la conexión al finalizar
            
            }
        }
    
}
